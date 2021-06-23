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
import ca.uwaterloo.liang.util.Util;
import soot.*;
import soot.jimple.ArrayRef;
import soot.jimple.AssignStmt;
import soot.jimple.CastExpr;
import soot.jimple.FieldRef;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.InvokeExpr;
import soot.jimple.ReturnStmt;
import soot.jimple.Stmt;
import soot.jimple.toolkits.annotation.parity.ParityAnalysis.Parity;
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
public class MockAnalysis extends ForwardFlowAnalysis<Unit, Map<Value, MockStatus>> {
    
    private static Map<Value, MockStatus> emptyFlowMap = new HashMap<Value, MockStatus>();
    
    private static ArrayList<InvokeExpr> emptyInvokeExprs = new ArrayList<InvokeExpr>();
    
    private static ArrayList<InvokeExpr> emptyInvokeExprsOnMocks = new ArrayList<InvokeExpr>();
    
    private static HashMap<Value, Value> emptyLocalFieldRefMap = new HashMap<Value, Value>();
    
    // Contains all method invocations
    private ArrayList<InvokeExpr> totalInvokeExprs;
    
    // Contains all method invocations on mocks
    private ArrayList<InvokeExpr> invokeExprsOnMocks;
    
    // Contains all soot field that are mocks or mock-containing defined in before method
    // private HashMap<SootField, MockStatus> fieldMocks;
    
    // Contains all soot field that are mocks or mock-containing defined in before method
    private HashMap<Value, Value> localFieldRefMap;
    
    // The current SootClass
    private SootClass clazz;
    
    // The current analyzed method
    private SootMethod method;
    
    // Flag to determine if the analysis is from MockAnalysisPreTransformer
    private boolean isInPreAnalysis;
    
    @SuppressWarnings("unchecked")
    public MockAnalysis(ExceptionalUnitGraph graph, SootMethod aCurrentSootMethod, boolean isPre) {
        super(graph);
        
        clazz = aCurrentSootMethod.getDeclaringClass();
        
        method = aCurrentSootMethod;
        
        isInPreAnalysis = isPre;
        
        totalInvokeExprs = (ArrayList<InvokeExpr>) emptyInvokeExprs.clone();
        
        invokeExprsOnMocks = (ArrayList<InvokeExpr>) emptyInvokeExprsOnMocks.clone();
        
        localFieldRefMap = (HashMap<Value, Value>) emptyLocalFieldRefMap.clone();

        unitToAfterFlow = new HashMap<Unit, Map<Value, MockStatus>>();
             
        doAnalysis();
    }
    
    @Override
    protected Map<Value, MockStatus> newInitialFlow() { 
        Map<Value, MockStatus> initMap = new HashMap<Value, MockStatus>();
        return initMap;
    }
    
    @Override
    protected Map<Value, MockStatus> entryInitialFlow() { 
        return newInitialFlow();
    }
    
    @Override
    protected void flowThrough(Map<Value, MockStatus> in, Unit unit, Map<Value, MockStatus> out) { 
        System.out.println("In flowThrough, method: " + method.getSignature());
        System.out.println("In flowThrough, Unit: " + unit);
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
    }

    /**
     * Kill the locals that are no longer mock objects because they are redefined.
     * It is done by performing<br/>
     * out <- in - killSet<br/>
     */
    private void kill(Map<Value, MockStatus> in, Unit unit, Map<Value, MockStatus> out) {
        Stmt aStmt = (Stmt) unit;
        if (doesNotCreateMock(aStmt)) {
            List<ValueBox> defBoxes = unit.getDefBoxes();
            for (ValueBox vb: defBoxes) {
                if (vb.getValue() instanceof Local || vb.getValue() instanceof FieldRef) {
                    Value v = vb.getValue();
                    if (in.containsKey(v)) {
                        MockStatus status = new MockStatus(false);
                        out.put(v, status);
                    }
                }
            }
        }
    }

    /**
     * Add locals which are assigned to the return value 
     * from mock creation API to out FlowSet
     */
    private void gen(Map<Value, MockStatus> in, Unit unit, Map<Value, MockStatus> out) {
        Stmt aStmt = (Stmt) unit;
        
        if (aStmt.containsFieldRef()) {
            SootField sf = aStmt.getFieldRef().getField();
            // First way to create mock: Mock Annotation
            if (AnnotatedAndInitMockTransformer.getAnnotatedMocks().contains(sf)) {
                //System.out.println("myAnnotatedMocks contain the mock wanted");
                List<ValueBox> defBoxes = unit.getDefBoxes();
                for (ValueBox vb: defBoxes) {
                    Value v = vb.getValue();
                    MockStatus status = new MockStatus(true);
                    out.put(v, status);
                }
            }
            
            // Second way to create mock: Fields that are already defined as mocks in before and <init> method
            if (MockAnalysisPreTransformer.getFieldMocks().containsKey(clazz) && !isInPreAnalysis) {
                
                HashMap<SootField, MockStatus> fieldMocksInClass = MockAnalysisPreTransformer.getFieldMocks().get(clazz); 
                // System.out.println("SootMethod visited: " + myContextMethod);
                // System.out.println("SootField is in the method, before the If Statement: " + sf);
                
                for (SootField sootField : fieldMocksInClass.keySet()) {
                    System.out.println("SootField found in fieldMocksInClass: " + sootField);
                }
                
                if (fieldMocksInClass.containsKey(sf)) {
                    // System.out.println("SootField find in the map from MockAnalysisPreTransformer: " + sf);
                    List<ValueBox> defBoxes = unit.getDefBoxes();
                    for (ValueBox vb: defBoxes) {
                        Value v = vb.getValue();
                        out.put(v, fieldMocksInClass.get(sf));
                    }
                }
            }
        }
        
        if (aStmt.containsInvokeExpr()) {
            InvokeExpr invkExpr = aStmt.getInvokeExpr();
            SootMethod sootMethod = invkExpr.getMethod();
            
            // Third way to create mock: Mock libraries' API. Example: mock(A.class)
            if (Util.isMockAPI(sootMethod)) {
                List<ValueBox> defBoxes = unit.getDefBoxes();
                for (ValueBox vb: defBoxes) {
                    Value v =  vb.getValue();
                    MockStatus status = new MockStatus(true);
                    out.put(v, status);
                }
            }
            
            // Fourth Way: Collection/Vector Mock write method returns a mock.
            
            if ( (isGetEffect(sootMethod) || isVectorGetEffect(sootMethod) || 
                    isQueueGetEffect(sootMethod) || isDequeGetEffect(sootMethod) ||
                    isIteratorGetEffect(sootMethod) || isEnumerationGetEffect(sootMethod) || isSetGetEffect(sootMethod) ) 
                    && aStmt instanceof AssignStmt) {
                AssignStmt assign = (AssignStmt) aStmt;
                List<ValueBox> useBoxes = unit.getUseBoxes();
                
                if (assign.getLeftOp() instanceof Local || assign.getLeftOp() instanceof FieldRef) {
                    Value left_op = assign.getLeftOp();
                    
                    for (ValueBox ub : useBoxes) {
                        Value useVal = ub.getValue();
                        
                        if (in.containsKey(useVal) && in.get(useVal).getCollectionMock()) {                                
                            MockStatus status = new MockStatus(true);
                            out.put(left_op, status);
                            
                            if ( (Util.isBeforeMethod(method) || Util.isDefaultInitMethod(method)) &&
                                    localFieldRefMap.containsKey(left_op)) {
                                out.put(localFieldRefMap.get(left_op), status);
                            }
                        }
                    }
                }
            }
        }
        
        // Fifth way: Right op of an AssignStmt is a Mock, ArrayMock, or CollectionMock
        if (aStmt instanceof AssignStmt) {
            AssignStmt assign = (AssignStmt) aStmt;
            
            // Preliminary : Perform this FieldRef check in Before methods
            if ( (assign.getLeftOp() instanceof Local && assign.getRightOp() instanceof FieldRef) &&
                   (Util.isBeforeMethod(method) || Util.isDefaultInitMethod(method)) ) {
                Value localVal = assign.getLeftOp();
                Value fieldRef = assign.getRightOp();
                
                localFieldRefMap.put(localVal, fieldRef);
            }
            
            // Looking for: x.f = local (where the left_op is a fieldRef and right side is 
            if ( (assign.getLeftOp() instanceof FieldRef && assign.getRightOp() instanceof Local) &&
                    (Util.isBeforeMethod(method) || Util.isDefaultInitMethod(method)) ) {
                 Value localVal = assign.getRightOp();
                 Value fieldRef = assign.getLeftOp();
                 
                 localFieldRefMap.put(localVal, fieldRef);
            }
            
            if (assign.getRightOp() instanceof Local || assign.getRightOp() instanceof FieldRef) {
                Value right_op = assign.getRightOp();
                if (in.containsKey(right_op)) {                                            
                    Value left_op = assign.getLeftOp();
                    
                    MockStatus status = in.get(right_op);
                    out.put(left_op, status);
                    
                    if ( (Util.isBeforeMethod(method) || Util.isDefaultInitMethod(method)) &&
                            localFieldRefMap.containsKey(right_op)) {
                        out.put(localFieldRefMap.get(right_op), in.get(right_op));
                    }
                    if ( (Util.isBeforeMethod(method) || Util.isDefaultInitMethod(method)) &&
                            localFieldRefMap.containsKey(left_op)) {
                        out.put(localFieldRefMap.get(left_op), in.get(right_op));
                    }
                }
            }
            
            if (assign.getRightOp() instanceof ArrayRef) {
                ArrayRef ar = (ArrayRef) assign.getRightOp();
                Value right_op_base = ar.getBase();
                if (in.containsKey(right_op_base) && in.get(right_op_base).getArrayMock()) {
                    Value left_op = assign.getLeftOp();
                    MockStatus status = new MockStatus(true);
                    out.put(left_op, status);
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
    private void genCastExprLocal(Map<Value, MockStatus> in, Unit unit, Map<Value, MockStatus> out) {
        if (unit instanceof AssignStmt) {
            AssignStmt assign = (AssignStmt) unit;
            if (assign.getRightOp() instanceof CastExpr) {
                //System.out.println("Assignment: " + assign);
                CastExpr ce = (CastExpr) assign.getRightOp();
                if (ce.getOp() instanceof Local || ce.getOp() instanceof FieldRef) {
                    Value right_op_val = ce.getOp();
                    if (ce.getOp() instanceof FieldRef) {
                        /*FieldRef irf = (FieldRef) ce.getOp();
                        right_op_val = irf.getBase();*/
                        // System.out.println("IntanceFieldRef Base Value: " + right_op_val);
                    }
                    if (in.containsKey(right_op_val) && in.get(right_op_val).getMock() 
                            && (assign.getLeftOp() instanceof Local || assign.getLeftOp() instanceof FieldRef) ) {
                        MockStatus status = new MockStatus(true);
                        Value left_op_val = assign.getLeftOp();
                        out.put(left_op_val, status);

                        //System.out.println("Mock Local: " + right_op_local);
                        //System.out.println("Mock Casted Local: " + left_op_local);
                    }
                }
            }
        }
    }
    
    /**
     * When unit writes to an Array, propagates mockness 
     * from the local being written to the array to the array itself.
     */
    private void propagateMocknessToContainingArray(Map<Value, MockStatus> in, 
                                Unit unit, Map<Value, MockStatus> out) {
        Stmt aStmt = (Stmt) unit;
        List<Value> vals = new ArrayList<Value>();
        if (aStmt.containsArrayRef() && aStmt instanceof AssignStmt) {
            // System.out.println("ArrayRef Statement: " + aStmt);
            ValueBox arrayRef = aStmt.getArrayRefBox();
            
            AssignStmt assign = (AssignStmt) aStmt;
            if (assign.getRightOp() instanceof Local || assign.getRightOp() instanceof FieldRef) {
                Value val = assign.getRightOp();
                if (assign.getRightOp() instanceof FieldRef) {
/*                    FieldRef irf = (FieldRef) assign.getRightOp();
                    val = irf.getBase();*/
                    // System.out.println("IntanceFieldRef Base Value: " + val);
                }
                //System.out.println("Assignment right op: " + local);
                vals.add(val);
            }
            
            if (assign.getLeftOp() instanceof Local || assign.getLeftOp() instanceof FieldRef) {
                Value val = assign.getLeftOp();
                
                if (assign.getLeftOp() instanceof FieldRef) {
                    /*FieldRef irf = (FieldRef) assign.getLeftOp();
                    val = irf.getBase();*/
                    // System.out.println("IntanceFieldRef Base Value: " + val);
                }
                vals.add(val);
            }
        }
        
        for (Value v : vals) {
            if (in.containsKey(v) && in.get(v).getMock()) {
                List<ValueBox> db = aStmt.getDefBoxes();
                for (ValueBox box : db) {
                    List<ValueBox> innerBoxes = box.getValue().getUseBoxes();
                    for (ValueBox innerBox : innerBoxes) {
                        if (innerBox.getValue() instanceof Local || innerBox.getValue() instanceof FieldRef) {
                            Value arrayBaseVal = innerBox.getValue();
                            
                            //System.out.println("Def Inner Use Box value: " + innerBox.getValue());
                            MockStatus status = new MockStatus(false, true, false);
                            out.put(arrayBaseVal, status);
                            
                            if ( (Util.isBeforeMethod(method) || Util.isDefaultInitMethod(method)) &&
                                    localFieldRefMap.containsKey(arrayBaseVal)) {
                                out.put(localFieldRefMap.get(arrayBaseVal), status);
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
    private void propagateMocknessToContainingCollection(Map<Value, MockStatus> in, 
                                Unit unit, Map<Value, MockStatus> out) {
        Stmt aStmt = (Stmt) unit;
        
        List<Value> candidates = new ArrayList<Value>();
        List<Value> vals = new ArrayList<Value>();
        List<Value> iter_vals = new ArrayList<Value>();
        
        Hierarchy hierarchy = Scene.v().getActiveHierarchy();
        // RefType target = RefType.v("java.util.AbstractCollection");
        boolean isCollection = false, isIterator = false;
        if (aStmt.containsInvokeExpr()) {
            List<ValueBox> ub = aStmt.getUseBoxes();
            SootMethod sm = aStmt.getInvokeExpr().getMethod();
            
            //
            /*for (ValueBox box : ub) {
                if ( (box.getValue() instanceof Local || box.getValue() instanceof FieldRef)
                     && isQueueSetAddAllEffect(sm) ) { 
                    candidates.add(box.getValue());
                }
            }*/
            // For Collection, Vector
            for (ValueBox box : ub) {
                List<ValueBox> innerBoxes = box.getValue().getUseBoxes();
                for (ValueBox innerBox : innerBoxes) {
                    // The useBox that is a container (to be refined)
                    if ( innerBox.getValue() instanceof Local || innerBox.getValue() instanceof FieldRef )  {
                        if ( isPutEffect(sm) || isAddAllEffect(sm) || isVectorPutEffect(sm) 
                                        || isQueuePutEffect(sm) || isDequePutEffect(sm) || isQueueSetAddAllEffect(sm) ) {
                            isCollection = true;
                            //G.v().out.println("InnerBox value: " + (Local) innerBox.getValue());
                            vals.add(innerBox.getValue());
                        }
                        
                        
                        
                        /*RefType ref = (RefType) innerBox.getValue().getType();
                        SootClass sc = ref.getSootClass();
                        List<SootClass> classes;
                        
                        if (sc.isInterface()) {
                            if ( ( isCollectionASuperInterface(hierarchy, sc) || ref.equals(RefType.v("java.util.PriorityQueue")) )
                                    && ( isPutEffect(sm) || isAddAllEffect(sm) || isVectorPutEffect(sm) 
                                            || isQueuePutEffect(sm) || isDequePutEffect(sm) )) {
                                isCollection = true;
                                vals.add(innerBox.getValue());
                                //G.v().out.println("Statement: " + aStmt.toString());
                                //G.v().out.println("InnerBox value: " + (Local) innerBox.getValue());
                                //G.v().out.println("SootClass Type: " + sc.getType());
                            }
                        } else {
                            Chain<SootClass> interfaces = sc.getInterfaces();
                            for (SootClass curr_interface : interfaces) {
                                if( ( isCollectionASuperInterface(hierarchy, curr_interface) || ref.equals(RefType.v("java.util.PriorityQueue")) )
                                        && ( isPutEffect(sm) || isAddAllEffect(sm) || isVectorPutEffect(sm) 
                                                || isQueuePutEffect(sm) || isDequePutEffect(sm) )) {
                                    // System.out.println("Interface: " + curr_interface);
                                    // System.out.println("SootMethod: " + sm.getSignature());
                                    isCollection = true;
                                    vals.add(innerBox.getValue());
                                   // G.v().out.println("Statement: " + aStmt.toString());
                                   // G.v().out.println("InnerBox value: " + (Local) innerBox.getValue());
                                   // G.v().out.println("SootClass Type: " + sc.getType());
                                }
                            }
                        }*/  
                    }
                }
            }
            
            // For Iterator, Enumeration
            List<ValueBox> db = aStmt.getDefBoxes();
            HashSet<Value> seen = new HashSet<Value>();
            
            if ( isIteratorEffect(sm) || isEnumerationEffect(sm) || isSetIteratorEffect(sm) ) {
                for (ValueBox box : db) {
                    Value box_val = box.getValue();
                    if (seen.contains(box_val))
                        continue;
                    
                    seen.add(box_val);
                    isIterator = true;
                    iter_vals.add(box_val);
                }
            }
            
            // The unit has a container useBox, now we check if the non-container useBox 
            // is a mayMock local
            List<ValueBox> invoke_ub = aStmt.getInvokeExpr().getUseBoxes();
            if (isCollection) {
                for (ValueBox box : invoke_ub) {
                    if (box.getValue() instanceof Local || box.getValue() instanceof FieldRef) {
                        Value col_val = box.getValue();
                        //System.out.println("col_local: " + col_local);
                        if (in.containsKey(col_val) && (in.get(col_val).getMock() || in.get(col_val).getCollectionMock()) ) {
                            //System.out.println("col_local found in hashmap: " + col_local);
                            if (!vals.isEmpty()) {
                                for (Value v: vals) {
                                    if (!v.equals(col_val)) {
                                        MockStatus status = new MockStatus(false, false, true);
                                        out.put(v, status);
                                        
                                        if ( (Util.isBeforeMethod(method) || Util.isDefaultInitMethod(method)) 
                                                && localFieldRefMap.containsKey(v)) {
                                            out.put(localFieldRefMap.get(v), status);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (isIterator) {
                for (ValueBox box : invoke_ub) {
                    if (box.getValue() instanceof Local || box.getValue() instanceof FieldRef) {
                        Value col_val = box.getValue();
                        // System.out.println("col_val: " + col_val);
                        if (in.containsKey(col_val) && (in.get(col_val).getMock() || in.get(col_val).getCollectionMock()) ) {
                            HashMap<Value, MockStatus> running_result = new HashMap<Value, MockStatus>();
                            for (Value v: iter_vals) {
                                System.out.println("col_val found in hashmap: " + col_val);
                                if (!v.equals(col_val)) {
                                    
                                    System.out.println("value in iter_val: " + v);
                                    MockStatus status = new MockStatus(false, false, true);
                                    out.put(v, status);
                                    
                                    if ( (Util.isBeforeMethod(method) || Util.isDefaultInitMethod(method))
                                            && localFieldRefMap.containsKey(v)) {
                                        out.put(localFieldRefMap.get(v), status);
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
                    System.out.println("InvokeExpr: " + invkExpr);
                    // Add InvokeExpr to myTotalInvokeExprs
                    totalInvokeExprs.add(invkExpr);
                    
                    InstanceInvokeExpr iie = (InstanceInvokeExpr) invkExpr;
                    Value val = iie.getBase();
                    
                    Map<Value, MockStatus> currMap = getFlowAfter(unit);
                    
                    if (currMap.containsKey(val)) {
                        System.out.println("val: " + val);
                    }
                    
                    if (currMap.containsKey(val) && currMap.get(val).getMock() && !invokeExprsOnMocks.contains(invkExpr)) {
                        invokeExprsOnMocks.add(invkExpr);
                    }
                }
            }
        }
        
    }
    
    public ArrayList<InvokeExpr> getTotalInvokeExprs() {
        return totalInvokeExprs;
    }
    
    public ArrayList<InvokeExpr> getInvokeExprsOnMocks() {
        return invokeExprsOnMocks;
    }
    
    public Map<Unit, Map<Value, MockStatus>> getMocks() {
        System.out.println("In getMocks(), method: " + method.getSignature());
        return unitToAfterFlow;
    }
    
    /*public HashMap<SootField, MockStatus> getFieldMocks() {
        return fieldMocks;
    }*/
    
    @Override
    protected void merge(Map<Value, MockStatus> in1, Map<Value, MockStatus> in2, Map<Value, MockStatus> out) {
        out.putAll(in1);
        
        for (Map.Entry<Value, MockStatus> entry : in2.entrySet()) {
            out.put(entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    protected void copy(Map<Value, MockStatus> srcIn, Map<Value, MockStatus> destOut) {
        destOut.clear();
        destOut.putAll(srcIn);
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
        
        MockAnalysis targetMAnalysis = new MockAnalysis(targetCfg, targetMethod, false);
        targetMAnalysis.updateInvocations(targetCfg);
        
        targetSummary.setMocks( targetMAnalysis.getMocks() );           
        
        targetSummary.setTotalInvokeExprs( targetMAnalysis.getTotalInvokeExprs() );
        
        targetSummary.setInvokeExprsOnMocks( targetMAnalysis.getInvokeExprsOnMocks() );
        
        procSummaries.put(targetMethod, targetSummary);
    }
    
    private static MockStatus getMockStatusFromTargetMethod(ProcSummary procSummary, SootMethod targetMethod) {
        Map<Unit, Map<Value, MockStatus>> summaryMocks = procSummary.getMocks();
        if (targetMethod.hasActiveBody()) {
            for (Unit u: targetMethod.getActiveBody().getUnits()) {
                Stmt s = (Stmt) u;
                if (s instanceof ReturnStmt) {
                    if (summaryMocks.containsKey(u)) {
                        Map<Value, MockStatus> mocks = summaryMocks.get(u);
                        
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
    
    private static boolean isPutEffect(SootMethod sm) {
        List<String> puts = CollectionModelEffect.PUT.getMethods();
        
        for (String put : puts) {
            if (sm.getSubSignature().contains(put))
                return true;
        }
        return false;
    }
    
    private static boolean isGetEffect(SootMethod sm) {
        List<String> gets = CollectionModelEffect.GET.getMethods();
        
        for (String get : gets) {
            if (sm.getSubSignature().contains(get))
                return true;
        }
        return false;
    }
    
    private static boolean isVectorPutEffect(SootMethod sm) {
        List<String> vector_puts = CollectionModelEffect.VECTOR_PUT.getMethods();
        
        for (String put : vector_puts) {
            if (sm.getSubSignature().contains(put))
                return true;
        }
        return false;
    }
    
    private static boolean isVectorGetEffect(SootMethod sm) {
        List<String> vector_gets = CollectionModelEffect.VECTOR_GET.getMethods();
        
        for (String get : vector_gets) {
            if (sm.getSubSignature().contains(get))
                return true;
        }
        return false;
    }
    
    private static boolean isQueuePutEffect(SootMethod sm) {
        List<String> queue_puts = CollectionModelEffect.QUEUE_PUT.getMethods();
        
        for (String put : queue_puts) {
            if (sm.getSubSignature().contains(put))
                return true;
        }
        return false;
    }
    
    private static boolean isQueueGetEffect(SootMethod sm) {
        List<String> queue_gets = CollectionModelEffect.QUEUE_GET.getMethods();
        
        for (String get : queue_gets) {
            if (sm.getSubSignature().contains(get))
                return true;
        }
        return false;
    }
    
    private static boolean isDequePutEffect(SootMethod sm) {
        List<String> deque_puts = CollectionModelEffect.DEQUE_PUT.getMethods();
        
        for (String put : deque_puts) {
            if (sm.getSubSignature().contains(put))
                return true;
        }
        return false;
    }
    
    private static boolean isDequeGetEffect(SootMethod sm) {
        List<String> deque_gets = CollectionModelEffect.DEQUE_GET.getMethods();
        
        for (String get : deque_gets) {
            if (sm.getSubSignature().contains(get))
                return true;
        }
        return false;
    }
    
    private static boolean isIteratorEffect(SootMethod sm) {
        List<String> iterators = CollectionModelEffect.ITERATOR.getMethods();
        
        for (String iter : iterators) {
            if (sm.getSubSignature().contains(iter))
                return true;
        }
        return false;
    }
    
    private static boolean isIteratorGetEffect(SootMethod sm) {
        List<String> iterator_gets = CollectionModelEffect.ITERATOR_GET.getMethods();
        
        for (String get : iterator_gets) {
            if (sm.getSubSignature().contains(get))
                return true;
        }
        return false;
    }
    
    private static boolean isEnumerationEffect(SootMethod sm) {
        List<String> enumerations = CollectionModelEffect.ENUMERATION.getMethods();
        
        for (String enumeration : enumerations) {
            if (sm.getSubSignature().contains(enumeration))
                return true;
        }
        return false;
    }
    
    private static boolean isEnumerationGetEffect(SootMethod sm) {
        List<String> enumeration_gets = CollectionModelEffect.ENUMERATION_GET.getMethods();
        
        for (String get : enumeration_gets) {
            if (sm.getSubSignature().contains(get))
                return true;
        }
        return false;
    }
    
    private static boolean isSetIteratorEffect(SootMethod sm) {
        List<String> set_iterators = CollectionModelEffect.SET_ITERATOR.getMethods();
        
        for (String iter : set_iterators) {
            if (sm.getSubSignature().contains(iter))
                return true;
        }
        return false;
    }
    
    private static boolean isSetGetEffect(SootMethod sm) {
        List<String> set_gets = CollectionModelEffect.SET_GET.getMethods();
        
        for (String get : set_gets) {
            if (sm.getSubSignature().contains(get))
                return true;
        }
        return false;
    }
    
    private static boolean isAddAllEffect(SootMethod sm) {
        List<String> addAlls = CollectionModelEffect.ADDALL.getMethods();
        
        for (String addAll : addAlls) {
            if (sm.getSubSignature().contains(addAll))
                return true;
        }
        return false;
    }
    
    private static boolean isQueueSetAddAllEffect(SootMethod sm) {
        List<String> addAlls = CollectionModelEffect.QUEUE_SET_ADDALL.getMethods();
        
        for (String addAll : addAlls) {
            if (sm.getSubSignature().contains(addAll))
                return true;
        }
        return false;
    }
    
    private static boolean isCollectionASuperInterface(Hierarchy hierarchy, SootClass sc) {
        RefType collection = RefType.v("java.util.Collection");
        
        List<SootClass> classes = hierarchy.getSuperinterfacesOfIncluding(sc);
        for (SootClass curr_class : classes) {
            if (curr_class.getType().equals(collection)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean doesNotCreateMock(Stmt stmt) {
        return (!stmt.containsInvokeExpr() || !Util.isMockAPI(stmt.getInvokeExpr().getMethod()));
    }
}
