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
public class MockAnalysis extends ForwardFlowAnalysis<Unit, FlowSet<Map<Local, TripleBoolean>>> {

    private static ArrayList<SootMethod> emptyInvokedMethods = new ArrayList<SootMethod>();
    
    private static FlowSet<Map<Local, TripleBoolean>> emptyFlowSet = new ArraySparseSet() ;
    
    private static HashMap<Unit, HashMap<Local, TripleBoolean>> emptyPossiblyMocks = new HashMap<Unit, HashMap<Local, TripleBoolean>>();
    
    //Contains all the affects information of the analyzed method
    private FlowSet<Map<Local, TripleBoolean>> myMocksInfo;
    
    //Contains all the invoked methods by the method under analysis
    private ArrayList<SootMethod> myInvokedMethods;
    
    // For each unit x local, will store a boolean for if it is a possible mock,
    // if is a possible mock within Collection, or if it is a possible mock within Array.
    private HashMap<Unit, HashMap<Local, TripleBoolean>> possiblyMocks;
    
    @SuppressWarnings("unchecked")
    public MockAnalysis(UnitGraph graph) {
        super(graph);
        
        myInvokedMethods = (ArrayList<SootMethod>) emptyInvokedMethods.clone();
        
        possiblyMocks = (HashMap<Unit, HashMap<Local, TripleBoolean>>) emptyPossiblyMocks.clone();
        
        myMocksInfo = emptyFlowSet.clone();
        
        doAnalysis();
    }
    
    @Override
    protected FlowSet<Map<Local, TripleBoolean>> newInitialFlow() { 
        return emptyFlowSet.clone();
    }
    
    @Override
    protected FlowSet<Map<Local, TripleBoolean>> entryInitialFlow() { 
        return emptyFlowSet.clone();
    }
    
    @Override
    protected void flowThrough(FlowSet<Map<Local, TripleBoolean>> in, Unit unit, FlowSet<Map<Local, TripleBoolean>> out) {
        Stmt aStmt = (Stmt) unit;
        HashMap<Local, TripleBoolean> running_result;
        
        //TODO: check that no library classes methods are put in the
        //invoked methods list
        if (notMock(aStmt)) {
            // This part tries to consider for the following two scenarios:
            // X x = mock(...);
            // Scenario 1: x = y; || Scenario 2: x = new Object();
            // In both scenarios, the local defbox x was a mock object in line 1, but no longer
            // a mock object after line 2 (Missing: Still need to check for the useBox y)
            running_result = new HashMap<Local, TripleBoolean>();
            List<ValueBox> defBoxes = unit.getDefBoxes();
            List<ValueBox> useBoxes = unit.getUseBoxes();
            for (ValueBox vb: defBoxes) {
                Local l = (Local) vb.getValue();
                TripleBoolean trip = new TripleBoolean(false);
                running_result.put(l, trip);
            }
            possiblyMocks.put(unit, running_result);
            return;
        }
        if (aStmt.containsInvokeExpr()) {
            InvokeExpr invkExpr = aStmt.getInvokeExpr();
            SootMethod sootMethod = invkExpr.getMethod();
            myInvokedMethods.add(sootMethod);
            
            if (isMockAPI(sootMethod)) {
                running_result = new HashMap<Local, TripleBoolean>();
                List<ValueBox> defBoxes = unit.getDefBoxes();
                for (ValueBox vb: defBoxes) {
                    Local l = (Local) vb.getValue();
                    TripleBoolean trip = new TripleBoolean(true);
                    running_result.put(l, trip);
                }
                out.add(running_result);
                possiblyMocks.put(unit, running_result); 
            }
        }
        
        List<Local> locals = findAllLocalsInArray(aStmt);
        // Remove the local from out FlowSet with the following 
        myMocksInfo.union(out);
    }
    
    public ArrayList<SootMethod> getInvokedMethods() {
        return myInvokedMethods;
    }
    
    private List<Local> findAllLocalsInArray(Stmt stmt) {
        List<Local> locals = new ArrayList<Local>();
        if (stmt.containsArrayRef() && stmt instanceof AssignStmt) {
            System.out.println(stmt);
            ArrayRef arrayRef = stmt.getArrayRef();
            
            Local local = (Local) ((AssignStmt) stmt).getRightOp();
            locals.add(local);
        }
        return locals;
    }
    
    @Override
    protected void merge(FlowSet<Map<Local, TripleBoolean>> in1, FlowSet<Map<Local, TripleBoolean>> in2, FlowSet<Map<Local, TripleBoolean>> out) {
        in1.union(in2, out);
    }
    
    @Override
    protected void copy(FlowSet<Map<Local, TripleBoolean>> srcSet, FlowSet<Map<Local, TripleBoolean>> destSet) {
        srcSet.copy(destSet);
    }
    
    private static boolean notMock(Stmt stmt) {
        return (!stmt.containsInvokeExpr() || !isMockAPI(stmt.getInvokeExpr().getMethod()));
    }
    
    private static boolean isMockAPI(SootMethod method) {
        return (method.getSubSignature().equals(MockLibrary.EASYMOCK.subSignature()) 
                                || method.getSubSignature().equals(MockLibrary.MOCKITO.subSignature())
                                || method.getSubSignature().equals(MockLibrary.POWERMOCK.subSignature()));
    }
}
