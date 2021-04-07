package ca.uwaterloo.liang;
/* Soot - a J*va Optimization Framework
 * Copyright (C) 2003 Navindra Umanee <navindra@cs.mcgill.ca>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

import java.util.*;

import soot.*;
import soot.jimple.ArrayRef;
import soot.jimple.AssignStmt;
import soot.jimple.InvokeExpr;
import soot.jimple.Stmt;
import soot.options.*;
import soot.toolkits.graph.*;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.ForwardFlowAnalysis;

/**
 * Find all locals that are mocks
 * 
 *
 * @author David Liang
 **/

/**
 * Flow analysis to determine all locals guaranteed to be defined at a
 * given program point.
 **/
public class MockAnalysis extends ForwardFlowAnalysis<Unit, FlowSet<Map<Local, MockStatus>>> {

    private static ArrayList<SootMethod> emptyInvokedMethods = new ArrayList<SootMethod>();
    
    private static FlowSet<Map<Local, MockStatus>> emptyFlowSet = new ArraySparseSet() ;
    
    private static HashMap<Unit, HashMap<Local, MockStatus>> emptyPossiblyMocks = new HashMap<Unit, HashMap<Local, MockStatus>>();
    
    //Contains all the invoked methods by the method under analysis
    private ArrayList<SootMethod> myInvokedMethods;
    
    // For each unit x local, will store a boolean for if it is a possible mock,
    // if is a possible mock within Collection, or if it is a possible mock within Array.
    private HashMap<Unit, HashMap<Local, MockStatus>> possiblyMocks;
    
    @SuppressWarnings("unchecked")
    public MockAnalysis(DirectedGraph graph) {
        super(graph);
        
        myInvokedMethods = (ArrayList<SootMethod>) emptyInvokedMethods.clone();
        
        possiblyMocks = (HashMap<Unit, HashMap<Local, MockStatus>>) emptyPossiblyMocks.clone();
        
        doAnalysis();
    }
    
    public void analyze(DirectedGraph graph, SootMethod aCurrentSootMethod) {
        this.graph = graph;
        
        myInvokedMethods = (ArrayList<SootMethod>) emptyInvokedMethods.clone();
        
        possiblyMocks = (HashMap<Unit, HashMap<Local, MockStatus>>) emptyPossiblyMocks.clone();
        
        doAnalysis();
    
    }
    
    @Override
    protected FlowSet<Map<Local, MockStatus>> newInitialFlow() { 
        return emptyFlowSet.clone();
    }
    
    @Override
    protected FlowSet<Map<Local, MockStatus>> entryInitialFlow() { 
        return emptyFlowSet.clone();
    }
    
    @Override
    protected void flowThrough(FlowSet<Map<Local, MockStatus>> in, Unit unit, FlowSet<Map<Local, MockStatus>> out) {        
        // Performs kills
        kill(in, unit, out);
        // Performs gens
        gen(unit, out);
        // Find array container stores possiblyMock objects.
        propagateMocknessToContainingArray(in, unit, out);
    }

    /**
     * Kill the locals that are no longer mock objects because they are redefined.
     * It is done by performing<br/>
     * out <- in - killSet<br/>
     */
    private void kill(FlowSet<Map<Local, MockStatus>> in, Unit unit, FlowSet<Map<Local, MockStatus>> out) {
        FlowSet<Map<Local, MockStatus>> killSet = emptyFlowSet.clone();
        HashMap<Local, MockStatus> running_result;
        Stmt aStmt = (Stmt) unit;
        if (doesNotCreateMock(aStmt)) {
            running_result = new HashMap<Local, MockStatus>();
            List<ValueBox> defBoxes = unit.getDefBoxes();
            for (ValueBox vb: defBoxes) {
                if (vb.getValue() instanceof Local) {
                    Local l = (Local) vb.getValue();
                    for (Map<Local, MockStatus> element : in) {
                        if (element.containsKey(l)) {
                            killSet.add(element);
                            MockStatus status = new MockStatus(false);
                            running_result.put(l, status);
                        }
                    }
                }
            }
            possiblyMocks.put(unit, running_result);
        }
        in.difference(killSet, out);
    }

    /**
     * Add locals which are assigned to the return value 
     * from mock creation API to out FlowSet
     */
    private void gen(Unit unit, FlowSet<Map<Local, MockStatus>> out) {
        HashMap<Local, MockStatus> running_result;
        Stmt aStmt = (Stmt) unit;
        if (aStmt.containsInvokeExpr()) {
            InvokeExpr invkExpr = aStmt.getInvokeExpr();
            SootMethod sootMethod = invkExpr.getMethod();
            myInvokedMethods.add(sootMethod);
            
            if (isMockAPI(sootMethod)) {
                running_result = new HashMap<Local, MockStatus>();
                List<ValueBox> defBoxes = unit.getDefBoxes();
                for (ValueBox vb: defBoxes) {
                    Local l = (Local) vb.getValue();
                    MockStatus status = new MockStatus(true);
                    running_result.put(l, status);
                }
                out.add(running_result);
                possiblyMocks.put(unit, running_result); 
            }
        }
    }
    
    /**
     * When unit writes to an Array, propagates mockness 
     * from the local being written to the array to the array itself.
     */
    private void propagateMocknessToContainingArray(FlowSet<Map<Local, MockStatus>> in, Unit unit, FlowSet<Map<Local, MockStatus>> out) {
        Stmt aStmt = (Stmt) unit;
        List<Local> locals = new ArrayList<Local>();
        if (aStmt.containsArrayRef() && aStmt instanceof AssignStmt) {
            System.out.println(aStmt);
            ArrayRef arrayRef = aStmt.getArrayRef();
            
            Local local = (Local) ((AssignStmt) aStmt).getRightOp();
            locals.add(local);
        }
        
        HashMap<Local, MockStatus> running_result;
        for (Local l: locals) {
            for (Map<Local, MockStatus> element : in) {
                if (element.containsKey(l) && element.get(l).getPossibleMock()) {
                    running_result = new HashMap<Local, MockStatus>();
                    Value val = aStmt.getArrayRef().getBase();
                    if (val instanceof Local) {
                        Local arrayBaseLocal = (Local) val;
                        MockStatus status = new MockStatus(false, true, false);
                        running_result.put(arrayBaseLocal, status);
                    }
                    out.add(running_result);
                    possiblyMocks.put(unit, running_result); 
                }
            }
        }
    }
    
    public ArrayList<SootMethod> getInvokedMethods() {
        return myInvokedMethods;
    }
    
    public HashMap<Unit, HashMap<Local, MockStatus>> getPossiblyMocks() {
        return possiblyMocks;
    }
    
    @Override
    protected void merge(FlowSet<Map<Local, MockStatus>> in1, FlowSet<Map<Local, MockStatus>> in2, FlowSet<Map<Local, MockStatus>> out) {
        in1.union(in2, out);
    }
    
    @Override
    protected void copy(FlowSet<Map<Local, MockStatus>> srcSet, FlowSet<Map<Local, MockStatus>> destSet) {
        srcSet.copy(destSet);
    }
    
    private static boolean doesNotCreateMock(Stmt stmt) {
        return (!stmt.containsInvokeExpr() || !isMockAPI(stmt.getInvokeExpr().getMethod()));
    }
    
    private static boolean isMockAPI(SootMethod method) {
        return (method.getSubSignature().equals(MockLibrary.EASYMOCK.subSignature()) 
                                || method.getSubSignature().equals(MockLibrary.MOCKITO.subSignature())
                                || method.getSubSignature().equals(MockLibrary.POWERMOCK.subSignature()));
    }
}
