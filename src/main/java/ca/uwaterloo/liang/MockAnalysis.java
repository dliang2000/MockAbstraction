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

import ca.uwaterloo.liang.collection.CollectionModelEffect;
import ca.uwaterloo.liang.util.Utility;
import soot.*;
import soot.jimple.ArrayRef;
import soot.jimple.AssignStmt;
import soot.jimple.CastExpr;
import soot.jimple.Expr;
import soot.jimple.FieldRef;
import soot.jimple.InstanceFieldRef;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.InvokeExpr;
import soot.jimple.ReturnStmt;
import soot.jimple.Stmt;
import soot.jimple.internal.JArrayRef;
import soot.jimple.toolkits.callgraph.Edge;
import soot.options.*;
import soot.tagkit.AnnotationTag;
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
public class MockAnalysis extends ForwardFlowAnalysis<Unit, FlowSet<Map<Value, MockStatus>>> {
    
    private static FlowSet<Map<Value, MockStatus>> emptyFlowSet = new ArraySparseSet() ;
    
    private static ArrayList<InvokeExpr> emptyInvokeExprs = new ArrayList<InvokeExpr>();
    
    private static ArrayList<InvokeExpr> emptyInvokeExprsOnMocks = new ArrayList<InvokeExpr>();
    
    private static HashMap<Unit, HashMap<Value, MockStatus>> emptyMocks = new HashMap<Unit, HashMap<Value, MockStatus>>();
    
    private static HashMap<SootField, MockStatus> emptyFieldMocks = new HashMap<SootField, MockStatus>();
    
    // Contains all method invocations
    private ArrayList<InvokeExpr> myTotalInvokeExprs;
    
    // Contains all method invocations on mocks
    private ArrayList<InvokeExpr> myInvokeExprsOnMocks;
    
    // For each unit x local, will store a boolean for if it is a may mock,
    // if is a may mock within Collection, or if it is a may mock within Array.
    private HashMap<Unit, HashMap<Value, MockStatus>> mayMocks;
    
    // Contains all soot field that are mocks or mock-containing defined in before method
    private HashMap<SootField, MockStatus> fieldMocks;
    
    // The current SootClass
    private SootClass myContextClass;
    
    // The current analyzed method
    private SootMethod myContextMethod;
    
    @SuppressWarnings("unchecked")
    public MockAnalysis(ExceptionalUnitGraph graph, SootClass aCurrentSootClass, SootMethod aCurrentSootMethod) {
        super(graph);
        
        myContextClass = aCurrentSootClass;
        
        myContextMethod = aCurrentSootMethod;
        
        mayMocks = (HashMap<Unit, HashMap<Value, MockStatus>>) emptyMocks.clone();
        
        myTotalInvokeExprs = (ArrayList<InvokeExpr>) emptyInvokeExprs.clone();
        
        myInvokeExprsOnMocks = (ArrayList<InvokeExpr>) emptyInvokeExprsOnMocks.clone();
        
        fieldMocks = (HashMap<SootField, MockStatus>) emptyFieldMocks.clone();
                
        doAnalysis();
    }
    
    @Override
    protected FlowSet<Map<Value, MockStatus>> newInitialFlow() { 
        return emptyFlowSet.clone();
    }
    
    @Override
    protected FlowSet<Map<Value, MockStatus>> entryInitialFlow() { 
        return emptyFlowSet.clone();
    }
    
    @Override
    protected void flowThrough(FlowSet<Map<Value, MockStatus>> in, Unit unit, FlowSet<Map<Value, MockStatus>> out) { 
        
        // Performs kills
        kill(in, unit, out);
        // Performs gens
        gen(in, unit, out);
        // Perform gens for casted expr
        genCastExprLocal(in, unit, out);
        // Find array container stores mayMock objects.
        propagateMocknessToContainingArray(in, unit, out);
        // Find collection container stores mayMock objects.
        propagateMocknessToContainingCollection(in, unit, out);
        
        // We collect all the SootField that are defined to be mayMock, arrayMock, or collectionMock
        // in Before Method
        if (Utility.isBeforeMethod(myContextMethod)) {
            for (Map<Value, MockStatus> element : out) {
                for (Value v : element.keySet()) {
                    if (v instanceof FieldRef) {
                        FieldRef fieldRef = (FieldRef) v;
                        SootField mockField = fieldRef.getField();                        
                        fieldMocks.put(mockField, element.get(v));
                    }
                }
            }
        }
    }

    /**
     * Kill the locals that are no longer mock objects because they are redefined.
     * It is done by performing<br/>
     * out <- in - killSet<br/>
     */
    private void kill(FlowSet<Map<Value, MockStatus>> in, Unit unit, FlowSet<Map<Value, MockStatus>> out) {
        FlowSet<Map<Value, MockStatus>> killSet = emptyFlowSet.clone();
        Stmt aStmt = (Stmt) unit;
        if (doesNotCreateMock(aStmt)) {
            HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
            List<ValueBox> defBoxes = unit.getDefBoxes();
            for (ValueBox vb: defBoxes) {
                if (vb.getValue() instanceof Local || vb.getValue() instanceof InstanceFieldRef) {
                    Value v = vb.getValue();
                    for (Map<Value, MockStatus> element : in) {
                        if (element.containsKey(v)) {
                            killSet.add(element);
                            MockStatus status = new MockStatus(false);
                            running_result.put(v, status);
                        }
                    }
                }
            }
            mayMocks.put(unit, running_result);
        }
        in.difference(killSet, out);
    }

    /**
     * Add locals which are assigned to the return value 
     * from mock creation API to out FlowSet
     */
    private void gen(FlowSet<Map<Value, MockStatus>> in, Unit unit, FlowSet<Map<Value, MockStatus>> out) {
        Stmt aStmt = (Stmt) unit;
        
        if (aStmt.containsFieldRef()) {
            SootField sf = aStmt.getFieldRef().getField();
            // First way to create mock: Mock Annotation
            if (AnnotatedMockTransformer.getAnnotatedMocks().contains(sf)) {
                //System.out.println("myAnnotatedMocks contain the mock wanted");
                HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                List<ValueBox> defBoxes = unit.getDefBoxes();
                for (ValueBox vb: defBoxes) {
                    Value v = vb.getValue();
                    MockStatus status = new MockStatus(true);
                    running_result.put(v, status);
                }
                out.add(running_result);
                mayMocks.put(unit, running_result); 
            }
            
            // Second way to create mock: Fields that are defined as mocks in before method
            if (MockAnalysisPreTransformer.getFieldMocks().containsKey(myContextClass)) {
                
                HashMap<SootField, MockStatus> fieldMocksInClass = MockAnalysisPreTransformer.getFieldMocks().get(myContextClass); 
                
                if (fieldMocksInClass.containsKey(sf)) {
                    HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                    List<ValueBox> defBoxes = unit.getDefBoxes();
                    for (ValueBox vb: defBoxes) {
                        Value v = vb.getValue();
                        running_result.put(v, fieldMocksInClass.get(sf));
                    }
                    out.add(running_result);
                    mayMocks.put(unit, running_result); 
                }
            }
        }
        
        // Third way to create mock: Mock libraries' API. Example: mock(A.class)
        if (aStmt.containsInvokeExpr()) {
            InvokeExpr invkExpr = aStmt.getInvokeExpr();
            SootMethod sootMethod = invkExpr.getMethod();
                
            if (Utility.isMockAPI(sootMethod)) {
                HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                List<ValueBox> defBoxes = unit.getDefBoxes();
                for (ValueBox vb: defBoxes) {
                    Value v =  vb.getValue();
                    MockStatus status = new MockStatus(true);
                    running_result.put(v, status);
                }
                out.add(running_result);
                mayMocks.put(unit, running_result); 
            }
        }
        
        // Fourth way: Right op of an AssignStmt is a Mock, ArrayMock, or CollectionMock
        if (aStmt instanceof AssignStmt) {
            AssignStmt assign = (AssignStmt) aStmt;
            if (assign.getRightOp() instanceof Local || assign.getRightOp() instanceof InstanceFieldRef) {
                Value right_op = assign.getRightOp();
                if (assign.getRightOp() instanceof InstanceFieldRef) {
                    /*InstanceFieldRef irf = (InstanceFieldRef) assign.getRightOp();
                    right_op = irf.getBase();*/
                    // System.out.println("IntanceFieldRef Base Value: " + right_op);
                }
                
                for (Map<Value, MockStatus> element : in) {
                    if (element.containsKey(right_op)) {
                        HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                        Value left_op = assign.getLeftOp();
                        if (element.get(right_op).getMock()) {
                            MockStatus status = new MockStatus(true);
                            running_result.put(left_op, status);
                        }
                        if (element.get(right_op).getArrayMock()) {
                            MockStatus status = new MockStatus(false, true, false);
                            running_result.put(left_op, status);
                        }
                        if (element.get(right_op).getCollectionMock()) {
                            MockStatus status = new MockStatus(false, false, true);
                            running_result.put(left_op, status);
                        }
                        out.add(running_result);
                        mayMocks.put(unit, running_result); 
                    }
                }
            }
            
            if (assign.getRightOp() instanceof ArrayRef) {
                ArrayRef ar = (ArrayRef) assign.getRightOp();
                Value right_op_base = ar.getBase();
                for (Map<Value, MockStatus> element : in) {
                    if (element.containsKey(right_op_base) && element.get(right_op_base).getArrayMock()) {
                        HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                        Value left_op = assign.getLeftOp();
                        MockStatus status = new MockStatus(true);
                        running_result.put(left_op, status);
                        out.add(running_result);
                        mayMocks.put(unit, running_result); 
                    }
                }
            }
        }
        
        /*HashMap<SootMethod, ProcSummary> procSummaries = MockAnalysisMain.getProcSummaries();
        
        // Inter-procedural mock
        if (aStmt.containsInvokeExpr() && aStmt instanceof AssignStmt) {
            AssignStmt assign = (AssignStmt) aStmt;
            
            InvokeExpr invkExpr = aStmt.getInvokeExpr();
            SootMethod targetMethod = invkExpr.getMethod();
            
            // System.out.println("target method signature: " + targetMethod.getSignature());
            
            Iterator<Edge> edges = Scene.v().getCallGraph().edgesOutOf(unit);
            
            while (edges.hasNext()) {
                Edge e = edges.next();
                
                SootMethod targetMethodFromCallGraph = e.getTgt().method();
                
                // Skip Java Library methods
                if (targetMethodFromCallGraph.isJavaLibraryMethod())
                    continue;
                
                if (targetMethodFromCallGraph.getSignature().equals(targetMethod.getSignature())) {
                    System.out.println("target method signature from Call Graph: " + targetMethodFromCallGraph.getSignature());
                    
                    if (!procSummaries.containsKey(targetMethodFromCallGraph) && targetMethodFromCallGraph.hasActiveBody()) {
                        System.out.println("Creating ProcSummary for: " + targetMethodFromCallGraph.getSignature());
                        runMockAnalysisForTarget(procSummaries, targetMethodFromCallGraph);
                    }
                    
                    if (procSummaries.containsKey(targetMethodFromCallGraph)) {
                        System.out.println(targetMethodFromCallGraph.getSignature() + " is in ProcSummaries.");
                    }
                    
                    if (getMockStatusFromTargetMethod(procSummaries.get(targetMethodFromCallGraph), targetMethodFromCallGraph) != null) {
                        System.out.println(targetMethodFromCallGraph.getSignature() + " return is a mock.");
                    }
                            
                    if (procSummaries.containsKey(targetMethodFromCallGraph) && 
                            getMockStatusFromTargetMethod(procSummaries.get(targetMethodFromCallGraph), targetMethodFromCallGraph) != null) {
                        
                        System.out.println("target Method in proc Summaries.");
                        
                        HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                        Value left_op = assign.getLeftOp();
                        MockStatus status = getMockStatusFromTargetMethod(procSummaries.get(targetMethodFromCallGraph), targetMethodFromCallGraph);;
                        running_result.put(left_op, status);
                        out.add(running_result);
                        mayMocks.put(unit, running_result); 
                    }
                }
            }
            
            if (procSummaries.containsKey(targetMethod) && 
                    getMockStatusFromTargetMethod(procSummaries.get(targetMethod), targetMethod) != null) {
                HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                Value left_op = assign.getLeftOp();
                MockStatus status = getMockStatusFromTargetMethod(procSummaries.get(targetMethod), targetMethod);;
                running_result.put(left_op, status);
                out.add(running_result);
                mayMocks.put(unit, running_result); 
            }
        }*/
    }
    
    /**
     * Add locals that are CastExpr of mayMock locals
     * to the out FlowSet
     */
    private void genCastExprLocal(FlowSet<Map<Value, MockStatus>> in, Unit unit, FlowSet<Map<Value, MockStatus>> out) {
        if (unit instanceof AssignStmt) {
            AssignStmt assign = (AssignStmt) unit;
            if (assign.getRightOp() instanceof CastExpr) {
                //System.out.println("Assignment: " + assign);
                CastExpr ce = (CastExpr) assign.getRightOp();
                if (ce.getOp() instanceof Local || ce.getOp() instanceof InstanceFieldRef) {
                    Value right_op_val = ce.getOp();
                    if (ce.getOp() instanceof InstanceFieldRef) {
                        /*InstanceFieldRef irf = (InstanceFieldRef) ce.getOp();
                        right_op_val = irf.getBase();*/
                        // System.out.println("IntanceFieldRef Base Value: " + right_op_val);
                    }
                    
                    for (Map<Value, MockStatus> element : in) {
                        if (element.containsKey(right_op_val) && element.get(right_op_val).getMock() 
                                && assign.getLeftOp() instanceof Local) {
                            HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                            MockStatus status = new MockStatus(true);
                            Value left_op_val = assign.getLeftOp();
                            running_result.put(left_op_val, status);
                            out.add(running_result);
                            mayMocks.put(unit, running_result); 
                            //System.out.println("Mock Local: " + right_op_local);
                            //System.out.println("Mock Casted Local: " + left_op_local);
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
    private void propagateMocknessToContainingArray(FlowSet<Map<Value, MockStatus>> in, 
                                Unit unit, FlowSet<Map<Value, MockStatus>> out) {
        Stmt aStmt = (Stmt) unit;
        List<Value> vals = new ArrayList<Value>();
        if (aStmt.containsArrayRef() && aStmt instanceof AssignStmt) {
            // System.out.println("ArrayRef Statement: " + aStmt);
            ValueBox arrayRef = aStmt.getArrayRefBox();
            
            AssignStmt assign = (AssignStmt) aStmt;
            if (assign.getRightOp() instanceof Local || assign.getRightOp() instanceof InstanceFieldRef) {
                Value val = assign.getRightOp();
                if (assign.getRightOp() instanceof InstanceFieldRef) {
/*                    InstanceFieldRef irf = (InstanceFieldRef) assign.getRightOp();
                    val = irf.getBase();*/
                    // System.out.println("IntanceFieldRef Base Value: " + val);
                }
                //System.out.println("Assignment right op: " + local);
                vals.add(val);
            }
            
            if (assign.getLeftOp() instanceof Local || assign.getLeftOp() instanceof InstanceFieldRef) {
                Value val = assign.getLeftOp();
                //System.out.println("Assignment right op: " + local);
                if (assign.getLeftOp() instanceof InstanceFieldRef) {
                    /*InstanceFieldRef irf = (InstanceFieldRef) assign.getLeftOp();
                    val = irf.getBase();*/
                    // System.out.println("IntanceFieldRef Base Value: " + val);
                }
                vals.add(val);
            }
        }
        
        for (Value v : vals) {
            for (Map<Value, MockStatus> element : in) {
                if (element.containsKey(v) && element.get(v).getMock()) {
                    List<ValueBox> db = aStmt.getDefBoxes();
                    for (ValueBox box : db) {
                        List<ValueBox> innerBoxes = box.getValue().getUseBoxes();
                        for (ValueBox innerBox : innerBoxes) {
                            HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                            if (innerBox.getValue() instanceof Local || innerBox.getValue() instanceof InstanceFieldRef) {
                                Value arrayBaseVal = innerBox.getValue();
                                //System.out.println("Def Inner Use Box value: " + innerBox.getValue());
                                MockStatus status = new MockStatus(false, true, false);
                                running_result.put(arrayBaseVal, status);
                                out.add(running_result);
                                mayMocks.put(unit, running_result); 
                            }
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
    private void propagateMocknessToContainingCollection(FlowSet<Map<Value, MockStatus>> in, 
                                Unit unit, FlowSet<Map<Value, MockStatus>> out) {
        Stmt aStmt = (Stmt) unit;
        List<Value> vals = new ArrayList<Value>();
        
        Hierarchy hierarchy = Scene.v().getActiveHierarchy();
        RefType target = RefType.v("java.util.Collection");
        boolean isCollection = false;
        if (aStmt.containsInvokeExpr()) {
            List<ValueBox> ub = aStmt.getUseBoxes();
            SootMethod sm = aStmt.getInvokeExpr().getMethod();
            
            for (ValueBox box : ub) {
                List<ValueBox> innerBoxes = box.getValue().getUseBoxes();
                for (ValueBox innerBox : innerBoxes) {
                    // The useBox that is a container (to be refined)
                    if (innerBox.getValue().getType() instanceof RefType && 
                            (innerBox.getValue() instanceof Local || innerBox.getValue() instanceof InstanceFieldRef) ) {
                        RefType ref = (RefType) innerBox.getValue().getType();
                        SootClass sc = ref.getSootClass();
                        List<SootClass> classes;
                        
                        if (sc.isInterface()) {
                            if (isCollectionASuperInterface(hierarchy, sc) && isReadEffect(sm)) {
                                isCollection = true;
                                vals.add(innerBox.getValue());
                                //G.v().out.println("Statement: " + aStmt.toString());
                                //G.v().out.println("InnerBox value: " + (Local) innerBox.getValue());
                                //G.v().out.println("SootClass Type: " + sc.getType());
                            }
                        } else {
                            Chain<SootClass> interfaces = sc.getInterfaces();
                            for (SootClass curr_interface : interfaces) {
                                if(isCollectionASuperInterface(hierarchy, curr_interface) && isReadEffect(sm)) {
                                    isCollection = true;
                                    vals.add(innerBox.getValue());
                                   // G.v().out.println("Statement: " + aStmt.toString());
                                   // G.v().out.println("InnerBox value: " + (Local) innerBox.getValue());
                                   // G.v().out.println("SootClass Type: " + sc.getType());
                                }
                            }
                        }                        
                    }
                }
            }
            
            // The unit has a container useBox, now we check if the non-container useBox 
            // is a mayMock local
            List<ValueBox> invoke_ub = aStmt.getInvokeExpr().getUseBoxes();
            if (isCollection) {
                for (ValueBox box : invoke_ub) {
                    if (box.getValue() instanceof Local || box.getValue() instanceof InstanceFieldRef) {
                        Value col_val = box.getValue();
                        //System.out.println("col_local: " + col_local);
                        for (Map<Value, MockStatus> element : in) {
                            if (element.containsKey(col_val) && element.get(col_val).getMock()) {
                                //System.out.println("col_local found in hashmap: " + col_local);
                                HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                                for (Value v: vals) {
                                    if (!v.equals(col_val)) {
                                        MockStatus status = new MockStatus(false, false, true);
                                        running_result.put(v, status);
                                        out.add(running_result);
                                        mayMocks.put(unit, running_result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }   
    }
    
    public void updateInvocations(ExceptionalUnitGraph graph) {
        UnitPatchingChain units = graph.getBody().getUnits();
        
        for (Unit unit : units) {
            Stmt aStmt = (Stmt) unit;
            if (aStmt.containsInvokeExpr()) {
                InvokeExpr invkExpr = aStmt.getInvokeExpr();
                if (invkExpr instanceof InstanceInvokeExpr) {
                    // System.out.println("InvokeExpr: " + invkExpr);
                    // Add InvokeExpr to myTotalInvokeExprs
                    myTotalInvokeExprs.add(invkExpr);
                    
                    InstanceInvokeExpr iie = (InstanceInvokeExpr) invkExpr;
                    Value val = iie.getBase();
                    
                    // If the base of the invokeExpr is an instanceof Local, 
                    // and can be found in the in FlowSet, then InvokeExpr is 
                    // on a mock
                    for (Map<Value, MockStatus> element : getFlowAfter(unit)) {
                        if (element.containsKey(val) && element.get(val).getMock() && !myInvokeExprsOnMocks.contains(invkExpr)) { //may be an invocation on Mock
                            myInvokeExprsOnMocks.add(invkExpr);
                        }
                    }
                }
            }
        }
        
    }
    
    public ArrayList<InvokeExpr> getTotalInvokeExprs() {
        return myTotalInvokeExprs;
    }
    
    public ArrayList<InvokeExpr> getInvokeExprsOnMocks() {
        return myInvokeExprsOnMocks;
    }
    
    public HashMap<Unit, HashMap<Value, MockStatus>> getMocks() {
        return mayMocks;
    }
    
    public HashMap<SootField, MockStatus> getFieldMocks() {
        return fieldMocks;
    }
    
    @Override
    protected void merge(FlowSet<Map<Value, MockStatus>> in1, FlowSet<Map<Value, MockStatus>> in2, FlowSet<Map<Value, MockStatus>> out) {
        in1.union(in2, out);
    }
    
    @Override
    protected void copy(FlowSet<Map<Value, MockStatus>> srcSet, FlowSet<Map<Value, MockStatus>> destSet) {
        srcSet.copy(destSet);
    }
    
//    @Override
//    public FlowSet<Map<Local, MockStatus>> getFlowAfter(Unit u) {
//        
//        return null;
//        
//    }
    
    private static void runMockAnalysisForTarget(HashMap<SootMethod, ProcSummary> procSummaries, 
                                                                    SootClass targetClass, SootMethod targetMethod) {
        ProcSummary targetSummary = new ProcSummary(targetMethod);
        
        ExceptionalUnitGraph targetCfg = new ExceptionalUnitGraph(targetMethod.getActiveBody());
        
        MockAnalysis targetMAnalysis = new MockAnalysis(targetCfg, targetClass, targetMethod);
        targetMAnalysis.updateInvocations(targetCfg);
        
        targetSummary.setMocks( targetMAnalysis.getMocks() );           
        
        targetSummary.setTotalInvokeExprs( targetMAnalysis.getTotalInvokeExprs() );
        
        targetSummary.setInvokeExprsOnMocks( targetMAnalysis.getInvokeExprsOnMocks() );
        
        procSummaries.put(targetMethod, targetSummary);
    }
    
    private static MockStatus getMockStatusFromTargetMethod(ProcSummary procSummary, SootMethod targetMethod) {
        HashMap<Unit, HashMap<Value, MockStatus>> summaryMocks = procSummary.getMocks();
        if (targetMethod.hasActiveBody()) {
            for (Unit u: targetMethod.getActiveBody().getUnits()) {
                Stmt s = (Stmt) u;
                if (s instanceof ReturnStmt) {
                    if (summaryMocks.containsKey(u)) {
                        HashMap<Value, MockStatus> mocks = summaryMocks.get(u);
                        
                        Value returnVal = ((ReturnStmt) s).getOp();
                        if (mocks.containsKey(returnVal)) {
                            return mocks.get(returnVal);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    private static boolean isReadEffect(SootMethod sm) {
        List<String> reads = CollectionModelEffect.READ.getMethods();
        
        for (String read : reads) {
            if (sm.getSubSignature().contains(read))
                return true;
        }
        return false;
    }
    
    private static boolean isCollectionASuperInterface(Hierarchy hierarchy, SootClass sc) {
        RefType collection = RefType.v("java.util.Collection");
        
        List<SootClass> classes = hierarchy.getSuperinterfacesOf(sc);
        for (SootClass curr_class : classes) {
            if (curr_class.getType().equals(collection)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean doesNotCreateMock(Stmt stmt) {
        return (!stmt.containsInvokeExpr() || !Utility.isMockAPI(stmt.getInvokeExpr().getMethod()));
    }
}
