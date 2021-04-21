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
import soot.jimple.CastExpr;
import soot.jimple.InvokeExpr;
import soot.jimple.Stmt;
import soot.jimple.internal.JArrayRef;
import soot.options.*;
import soot.toolkits.graph.*;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.ForwardFlowAnalysis;
import soot.util.Chain;

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
    
    private static HashMap<Unit, HashMap<Local, MockStatus>> emptyMustMocks = new HashMap<Unit, HashMap<Local, MockStatus>>();
    
    //Contains all the invoked methods by the method under analysis
    private ArrayList<SootMethod> myInvokedMethods;
    
    // For each unit x local, will store a boolean for if it is a must mock,
    // if is a must mock within Collection, or if it is a must mock within Array.
    private HashMap<Unit, HashMap<Local, MockStatus>> mustMocks;
    
    @SuppressWarnings("unchecked")
    public MockAnalysis(DirectedGraph graph) {
        super(graph);
        
        myInvokedMethods = (ArrayList<SootMethod>) emptyInvokedMethods.clone();
        
        mustMocks = (HashMap<Unit, HashMap<Local, MockStatus>>) emptyMustMocks.clone();
        
        doAnalysis();
    }
    
    public void analyze(DirectedGraph graph, SootMethod aCurrentSootMethod) {
        this.graph = graph;
        
        myInvokedMethods = (ArrayList<SootMethod>) emptyInvokedMethods.clone();
        
        mustMocks = (HashMap<Unit, HashMap<Local, MockStatus>>) emptyMustMocks.clone();
        
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
        // Perform gens for casted expr
        genCastExprLocal(in, unit, out);
        // Find array container stores mustMock objects.
        propagateMocknessToContainingArray(in, unit, out);
        // Find collection container stores mustMock objects.
        propagateMocknessToContainingCollection(in, unit, out);
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
            mustMocks.put(unit, running_result);
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
                mustMocks.put(unit, running_result); 
            }
        }
    }
    
    /**
     * Add locals that are CastExpr of mustMock locals
     * to the out FlowSet
     */
    private void genCastExprLocal(FlowSet<Map<Local, MockStatus>> in, Unit unit, FlowSet<Map<Local, MockStatus>> out) {
        HashMap<Local, MockStatus> running_result;
        if (unit instanceof AssignStmt) {
            AssignStmt assign = (AssignStmt) unit;
            if (assign.getRightOp() instanceof CastExpr) {
                //System.out.println("Assignment: " + assign);
                CastExpr ce = (CastExpr) assign.getRightOp();
                if (ce.getOp() instanceof Local) {
                    Local right_op_local = (Local) ce.getOp();
                    for (Map<Local, MockStatus> element : in) {
                        if (element.containsKey(right_op_local) && element.get(right_op_local).getMustMock() 
                                && assign.getLeftOp() instanceof Local) {
                            running_result = new HashMap<Local, MockStatus>();
                            MockStatus status = new MockStatus(true);
                            Local left_op_local = (Local) assign.getLeftOp();
                            //System.out.println("Casted Local: " + left_op_local);
                            running_result.put(left_op_local, status);
                            out.add(running_result);
                            mustMocks.put(unit, running_result); 
                            System.out.println("MustMock Local: " + right_op_local);
                            System.out.println("MustMock Casted Local: " + left_op_local);
                        }
                    }
                }
            }
        }
    }
    
    /**
     * When unit writes to an Array, propagates mockness 
     * from the local being written to the array to the array itself.
     */
    private void propagateMocknessToContainingArray(FlowSet<Map<Local, MockStatus>> in, 
                                Unit unit, FlowSet<Map<Local, MockStatus>> out) {
        Stmt aStmt = (Stmt) unit;
        List<Local> locals = new ArrayList<Local>();
        if (aStmt.containsArrayRef() && aStmt instanceof AssignStmt) {
            //System.out.println("ArrayRef Statement: " + aStmt);
            ValueBox arrayRef = aStmt.getArrayRefBox();
            /*//ValueBox fieldRef = aStmt.getFieldRefBox();
            
            if (arrayRef.getValue() instanceof Local) {
                Local local = (Local) arrayRef.getValue();
                System.out.println("JArrayRef Array Ref value: " + arrayRef.getValue());
                locals.add(local);
            }*/
            AssignStmt assign = (AssignStmt) aStmt;
            if (assign.getRightOp() instanceof Local) {
                Local local = (Local) assign.getRightOp();
                //System.out.println("Assignment right op: " + local);
                locals.add(local);
            }
        }
        
        HashMap<Local, MockStatus> running_result;
        for (Local l: locals) {
            for (Map<Local, MockStatus> element : in) {
                if (element.containsKey(l) && element.get(l).getMustMock()) {
                    running_result = new HashMap<Local, MockStatus>();
                    List<ValueBox> db = aStmt.getDefBoxes();
                    for (ValueBox box : db) {
                        List<ValueBox> innerBoxes = box.getValue().getUseBoxes();
                        for (ValueBox innerBox : innerBoxes) {
                            if (innerBox.getValue() instanceof Local) {
                                Local arrayBaseLocal = (Local) innerBox.getValue();
                                //System.out.println("Def Inner Use Box value: " + innerBox.getValue());
                                MockStatus status = new MockStatus(false, true, false);
                                running_result.put(arrayBaseLocal, status);
                            }
                            out.add(running_result);
                            mustMocks.put(unit, running_result); 
                        }
                    }
                }
            }
        }
    }
    
    /**
     * When unit writes to a Collection, propagates mockness 
     * from the local being written to the Collection to the Collection itself.
     */
    private void propagateMocknessToContainingCollection(FlowSet<Map<Local, MockStatus>> in, 
                                Unit unit, FlowSet<Map<Local, MockStatus>> out) {
        Stmt aStmt = (Stmt) unit;
        List<Local> locals = new ArrayList<Local>();
        HashMap<Local, MockStatus> running_result;
        
        Hierarchy hierarchy = Scene.v().getActiveHierarchy();
        RefType target = RefType.v("java.util.Collection");
        boolean isCollection = false;
        if (aStmt.containsInvokeExpr()) {
            List<ValueBox> ub = aStmt.getUseBoxes();
            for (ValueBox box : ub) {
                List<ValueBox> innerBoxes = box.getValue().getUseBoxes();
                for (ValueBox innerBox : innerBoxes) {
                    // The useBox that is a container (to be refined)
                    if (innerBox.getValue().getType() instanceof RefType && innerBox.getValue() instanceof Local) {
                        RefType ref = (RefType) innerBox.getValue().getType();
                        SootClass sc = ref.getSootClass();
                        List<SootClass> classes;
                        // If sc is an interface, then we gather all the sub interfaces of "java.util.Co
                        if (sc.isInterface()) {
                            classes = hierarchy.getSuperinterfacesOf(sc);
                            for (SootClass curr_class : classes) {
                                if (curr_class.getType().equals(target)) {
                                  //System.out.println("CollectionMock: True " + "Local: " + (Local) innerBox.getValue());
                                    isCollection = true;
                                    locals.add((Local) innerBox.getValue());
                                    G.v().out.println("Statement: " + aStmt.toString());
                                    G.v().out.println("InnerBox value: " + (Local) innerBox.getValue());
                                    G.v().out.println("SootClass Type: " + sc.getType());
                                }
                            }
                        } else {
                            Chain<SootClass> interfaces = sc.getInterfaces();
                            for (SootClass curr_interface : interfaces) {
                                G.v().out.println("Current interface type: " + curr_interface);
                                if(curr_interface.getType().equals(target)) {
                                    isCollection = true;
                                    locals.add((Local) innerBox.getValue());
                                    G.v().out.println("Statement: " + aStmt.toString());
                                    G.v().out.println("InnerBox value: " + (Local) innerBox.getValue());
                                    G.v().out.println("SootClass Type: " + sc.getType());
                                }
                            }
                        }                        
                    }
                }
            }
            // The unit has a container useBox, now we check if the non-container useBox 
            // is a mustMock local
            List<ValueBox> invoke_ub = aStmt.getInvokeExpr().getUseBoxes();
            if (isCollection) {
                for (ValueBox box : invoke_ub) {
                    if (box.getValue() instanceof Local) {
                        Local col_local = (Local) box.getValue();
                        System.out.println("col_local: " + col_local);
                        for (Map<Local, MockStatus> element : in) {
                            if (element.containsKey(col_local) && element.get(col_local).getMustMock()) {
                                System.out.println("col_local found in hashmap: " + col_local);
                                running_result = new HashMap<Local, MockStatus>();
                                for (Local local: locals) {
                                    //System.out.println("Def Inner Use Box value: " + innerBox.getValue());
                                    MockStatus status = new MockStatus(false, false, true);
                                    running_result.put(local, status);
                                }
                                out.add(running_result);
                                mustMocks.put(unit, running_result);
                            }
                        }
                    }
                }
            }
            /*if (sm.getName().contains("add(")) {
                System.out.println("InvokeExpr:" + aStmt.getInvokeExpr());
                System.out.println("SootClass:" + aStmt.getInvokeExpr().getMethod().getDeclaringClass().getPackageName());
            }
            List<Value> vals =  aStmt.getInvokeExpr().getArgs();
            for (Value val: vals) {
                if (val instanceof Local) {
                    Local l = (Local) val;
                    for (Map<Local, MockStatus> element : in) {
                        if (element.containsKey(l) && element.get(l).getMustMock()) {
                            break;
                        }
                    }
                }
            }*/
            
        }
        
    }
    
    public ArrayList<SootMethod> getInvokedMethods() {
        return myInvokedMethods;
    }
    
    public HashMap<Unit, HashMap<Local, MockStatus>> getMustMocks() {
        return mustMocks;
    }
    
    @Override
    protected void merge(FlowSet<Map<Local, MockStatus>> in1, FlowSet<Map<Local, MockStatus>> in2, FlowSet<Map<Local, MockStatus>> out) {
        in1.intersection(in2, out);
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
