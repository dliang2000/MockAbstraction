package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ca.uwaterloo.liang.util.Util;
import heros.DefaultSeeds;
import heros.FlowFunction;
import heros.FlowFunctions;
import heros.InterproceduralCFG;
import heros.flowfunc.Gen;
import heros.flowfunc.Identity;
import heros.flowfunc.KillAll;
import soot.Local;
import soot.NullType;
import soot.Scene;
import soot.SootClass;
import soot.SootField;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.ValueBox;
import soot.jimple.ArrayRef;
import soot.jimple.AssignStmt;
import soot.jimple.CastExpr;
import soot.jimple.DefinitionStmt;
import soot.jimple.FieldRef;
import soot.jimple.InstanceFieldRef;
import soot.jimple.InterfaceInvokeExpr;
import soot.jimple.InvokeExpr;
import soot.jimple.InvokeStmt;
import soot.jimple.ReturnStmt;
import soot.jimple.ReturnVoidStmt;
import soot.jimple.SpecialInvokeExpr;
import soot.jimple.StaticFieldRef;
import soot.jimple.Stmt;
import soot.jimple.VirtualInvokeExpr;
import soot.jimple.internal.JimpleLocal;
import soot.jimple.toolkits.ide.DefaultJimpleIFDSTabulationProblem;
import soot.toolkits.scalar.Pair;

public class IFDSProblem extends DefaultJimpleIFDSTabulationProblem<Map<Value, MockStatus>, InterproceduralCFG<Unit,SootMethod>> {
    InterproceduralCFG<Unit,SootMethod> icfg;
    HashSet<SootField> annotatedMocks;
    HashMap<SootClass, HashMap<SootField, MockStatus>> fieldMocks;
    
    public IFDSProblem(InterproceduralCFG<Unit, SootMethod> icfg) {
        super(icfg);
        this.icfg = icfg;
        this.annotatedMocks = AnnotatedAndInitMockTransformer.getAnnotatedMocks();
        this.fieldMocks = MockAnalysisPreTransformer.getFieldMocks();
    }

    @Override
    protected FlowFunctions<Unit, Map<Value, MockStatus>, SootMethod> createFlowFunctionsFactory() {
        return new FlowFunctions<Unit, Map<Value, MockStatus>, SootMethod>(){

            @Override
            public FlowFunction<Map<Value, MockStatus>> getNormalFlowFunction(Unit curr, Unit succ){
                System.out.println("In getNormalFlowFunction; ");
                return getNormalFlow(curr, succ);
            }

            @Override
            public FlowFunction<Map<Value, MockStatus>> getCallFlowFunction(Unit callStmt, SootMethod destinationMethod) {
                System.out.println("In getCallFlowFunction; ");
                return getCallFlow(callStmt, destinationMethod);
            }

            @Override
            public FlowFunction<Map<Value, MockStatus>> getReturnFlowFunction(Unit callSite, SootMethod calleeMethod, Unit exitStmt, Unit returnSite){
                System.out.println("In getReturnFlowFunction; ");
                return getReturnFlow(callSite, calleeMethod, exitStmt, returnSite);
            }

            @Override
            public FlowFunction<Map<Value, MockStatus>> getCallToReturnFlowFunction(Unit callSite, Unit returnSite) {
                System.out.println("In getCallToReturnFlowFunction; ");
                return getCallToReturnFlow(callSite, returnSite);
            }

        };
    }

    protected FlowFunction<Map<Value, MockStatus>> getCallToReturnFlow(Unit callSite, Unit returnSite) {
        System.out.println("In getCallToReturnFlow; ");
        System.out.println("Unit callSite: " + callSite);
        System.out.println("Unit returnSite: " + returnSite);
        
        Stmt stmt = (Stmt) callSite;
        InvokeExpr ie = stmt.getInvokeExpr();
        final List<Value> callArgs = ie.getArgs();
        final SootMethod method = ie.getMethod();
        
        System.out.println("SootMethod Invoked: " + method.getSignature());
        
        Value base = null;
        Value leftOp = null;

        if (ie instanceof VirtualInvokeExpr) {
            VirtualInvokeExpr vie = (VirtualInvokeExpr) ie;
            base = vie.getBase();
        }
        else if (ie instanceof InterfaceInvokeExpr) {
            InterfaceInvokeExpr iie = (InterfaceInvokeExpr) ie;
            base = iie.getBase();
        }
        else if (ie instanceof SpecialInvokeExpr) {
            SpecialInvokeExpr iie = (SpecialInvokeExpr) ie;
            base = iie.getBase();
        }
        
        if (callSite instanceof DefinitionStmt) {
            DefinitionStmt defnStmt = (DefinitionStmt) callSite;
            leftOp = defnStmt.getLeftOp();
        }

        final Value baseF = base;
        final Value leftOpF = leftOp;
        
        System.out.println("baseF: " + baseF);
        System.out.println("leftOp: " + leftOpF);
        // use assumption if no callees to analyze
        if (icfg.getCalleesOfCallAt(callSite).isEmpty() ) {
            System.out.println("No callees to analyze");
            System.out.println();
            return new FlowFunction<Map<Value, MockStatus>>() {
                @Override
                public Set<Map<Value, MockStatus>> computeTargets(Map<Value, MockStatus> source) {
                    Set<Map<Value, MockStatus>> ret = new HashSet<Map<Value, MockStatus>>();
                    ret.add(source);
                    if (baseF != null && leftOpF != null && source.containsKey(baseF)) {
                        Map<Value, MockStatus> hm_ret = new HashMap<Value, MockStatus>();
                        hm_ret.put(leftOpF, source.get(baseF));
                        ret.add(hm_ret);
                    }
                    if (leftOpF != null && source.containsKey(leftOpF) ) {
                        //&& callArgs.contains(leftOpF)
                        Map<Value, MockStatus> hm_ret = new HashMap<Value, MockStatus>();
                        hm_ret.put(leftOpF, source.get(leftOpF));
                        ret.add(hm_ret);
                    }
                    if (baseF != null && source.containsKey(baseF) ) {
                        //&& callArgs.contains(baseF)
                        Map<Value, MockStatus> hm_ret = new HashMap<Value, MockStatus>();
                        hm_ret.put(baseF, source.get(baseF));
                        ret.add(hm_ret);
                    }
                    return ret;
                }
            };
        }
        System.out.println();
        return Identity.v();
    }

    protected FlowFunction<Map<Value, MockStatus>> getReturnFlow(Unit callSite, SootMethod calleeMethod, Unit exitStmt,
            Unit returnSite) {
        Stmt stmt = (Stmt) callSite;
        InvokeExpr ie = stmt.getInvokeExpr();
        
//        if (IFDSDummyMainCreator.iccMethods.contains(calleeMethod)) {
//            return KillAll.v();
//        }
        
        System.out.println("In getReturnFlow; ");
        System.out.println("Unit callSite: " + callSite);
        System.out.println("SootMethod calleeMethod: " + calleeMethod);
        System.out.println("Unit exitStmt: " + exitStmt);
        System.out.println("Unit returnSite: " + returnSite);
        System.out.println();
        Value base = null;
        if (ie instanceof VirtualInvokeExpr) {
            VirtualInvokeExpr vie = (VirtualInvokeExpr) ie;
            base = vie.getBase();
        }
        else if (ie instanceof InterfaceInvokeExpr) {
            InterfaceInvokeExpr iie = (InterfaceInvokeExpr) ie;
            base = iie.getBase();
        }
        else if (ie instanceof SpecialInvokeExpr) {
            SpecialInvokeExpr iie = (SpecialInvokeExpr) ie;
            base = iie.getBase();
        }
        final Value baseF = base;

        if (exitStmt instanceof ReturnStmt) {                               
            ReturnStmt returnStmt = (ReturnStmt) exitStmt;
            final Value retOp = returnStmt.getOp();
            return new FlowFunction<Map<Value, MockStatus>>() {
                @Override
                public Set<Map<Value, MockStatus>> computeTargets(Map<Value, MockStatus> source) {
                    Set<Map<Value, MockStatus>> ret = new HashSet<Map<Value, MockStatus>>();
//                    if (source instanceof StaticFieldRef) {
//                        ret.add(source);
//                    }
                    ret.add(source);
                    if (callSite instanceof DefinitionStmt && source.containsKey(retOp)) {
                        DefinitionStmt defnStmt = (DefinitionStmt) callSite;
                        Map<Value, MockStatus> hm_def = new HashMap<Value, MockStatus>();
                        System.out.println("Definition Statement Op: " + defnStmt.getLeftOp());
                        System.out.println("MockStatus: " + source.get(retOp));
                        hm_def.put(defnStmt.getLeftOp(), source.get(retOp));
                        ret.add(hm_def);
                    }
                    if (baseF != null && source.containsKey(calleeMethod.retrieveActiveBody().getThisLocal())) {
                        Map<Value, MockStatus> hm_ret = new HashMap<Value, MockStatus>();
                        System.out.println("Base final value: " + baseF);
                        System.out.println("MockStatus: " + source.get(calleeMethod.retrieveActiveBody().getThisLocal()));
                        hm_ret.put(baseF, source.get(calleeMethod.retrieveActiveBody().getThisLocal()));
                        ret.add(hm_ret);
                    }
                    return ret;
                }
            };
        }
        if (exitStmt instanceof ReturnVoidStmt) {
            return new FlowFunction<Map<Value, MockStatus>>() {
                @Override
                public Set<Map<Value, MockStatus>> computeTargets(Map<Value, MockStatus> source) {
                    Set<Map<Value, MockStatus>> ret = new HashSet<Map<Value, MockStatus>>();
//                    if (source instanceof StaticFieldRef) {
//                        ret.add(source);
//                    }
                    if (baseF != null && source.containsKey(calleeMethod.retrieveActiveBody().getThisLocal())) {
                        Map<Value, MockStatus> hm_ret = new HashMap<Value, MockStatus>();
                        hm_ret.put(baseF, source.get(calleeMethod.retrieveActiveBody().getThisLocal()));
                        ret.add(hm_ret);
                    }
                    return ret;
                }
            };
        } 
        return KillAll.v();
    }

    protected FlowFunction<Map<Value, MockStatus>> getNormalFlow(Unit curr, Unit succ) {
        System.out.println("In getNormalFlow; ");
        System.out.println("Unit curr: " + curr);
        System.out.println("Unit succ: " + succ);
        System.out.println();
        if (curr instanceof AssignStmt) {
            final AssignStmt assign = (AssignStmt) curr;
            final Value leftOp = assign.getLeftOp();
            final Value rightOp = assign.getRightOp();
            
            return new FlowFunction<Map<Value, MockStatus>>(){
                @Override
                public Set<Map<Value, MockStatus>> computeTargets(Map<Value, MockStatus> source){
//                    if (source.containsKey(leftOp)) {
//                        return Collections.emptySet();
//                    }
                    
                    
                    Set<Map<Value, MockStatus>> res = new HashSet<>();
                    res.add(source);
                    
                    if (source.containsKey(rightOp)) {
                        Map<Value, MockStatus> hm = new HashMap<>();
                        hm.put(leftOp, source.get(rightOp));
                        //System.out.println("Left_val: " + leftOp);
                        //System.out.println("MockStatus: " + source.get(rightOp));
                        res.add(hm);
                    }
                    if (rightOp instanceof ArrayRef) {
                        Value base = ((ArrayRef)rightOp).getBase();
                        if (source.containsKey(base)) {
                            Map<Value, MockStatus> hm_arr = new HashMap<>();
                            //System.out.println("Left_val: " + leftOp);
                            //System.out.println("MockStatus: " + source.get(base));
                            hm_arr.put(leftOp, source.get(base));
                            res.add(hm_arr);
                        }
                    }
                    if (rightOp instanceof CastExpr) {
                        Value right_val = ((CastExpr) rightOp).getOp();
                        if (source.containsKey(right_val)) {
                            Map<Value, MockStatus> hm_cast = new HashMap<>();
                            //System.out.println("Left_val: " + leftOp);
                            //System.out.println("MockStatus: " + source.get(right_val));
                            hm_cast.put(leftOp, source.get(right_val));
                            res.add(hm_cast);
                        }
                    }
                    return res;
                }
            };
        }
        /*Stmt aStmt = (Stmt) curr;
        if (aStmt.containsFieldRef()) {
            Map<Value, MockStatus> fieldMockMap = new HashMap<>();
            SootField sf = aStmt.getFieldRef().getField();
            // First way to create mock: Mock Annotation
            if (AnnotatedAndInitMockTransformer.getAnnotatedMocks().contains(sf)) {
                //System.out.println("myAnnotatedMocks contain the mock wanted");
                List<ValueBox> defBoxes = curr.getDefBoxes();
                for (ValueBox vb: defBoxes) {
                    Value v = vb.getValue();
                    MockStatus status = new MockStatus(true);
                    fieldMockMap.put(v, status);
                }
            }
            return new Gen<Map<Value, MockStatus>>(fieldMockMap);
        }*/
          
        if (curr instanceof InvokeStmt) {
            final InvokeStmt invoke = (InvokeStmt) curr;
            final InvokeExpr invkExpr = invoke.getInvokeExpr();
            final SootMethod sootMethod = invkExpr.getMethod();
            
            System.out.println("Invoke Statement: " + invoke);
            return new FlowFunction<Map<Value, MockStatus>>(){
                @Override
                public Set<Map<Value, MockStatus>> computeTargets(Map<Value, MockStatus> source){
                // Third way to create mock: Mock libraries' API. Example: mock(A.class)
                // x = mock(X);
                    Set<Map<Value, MockStatus>> res = new HashSet<>();
                    res.add(source);
                    
                    Map<Value, MockStatus> hm_mockSource = new HashMap<>();
                    if (Util.isMockAPI(sootMethod)) {
                        List<ValueBox> defBoxes = curr.getDefBoxes();
                        for (ValueBox vb: defBoxes) {
                            System.out.println("Unit: " + curr);
                            Value v =  vb.getValue();
                            MockStatus status = new MockStatus(true);
                            hm_mockSource.put(v, status);
                        }
                    }
                    res.add(hm_mockSource);
                    return res;
                }
           };
        }
        return Identity.v();
    }

    protected FlowFunction<Map<Value, MockStatus>> getCallFlow(Unit callStmt, SootMethod destinationMethod) {
        System.out.println("In getCallFlow; ");
        if ("<clinit>".equals(destinationMethod.getName())) {
            return KillAll.v();
        }
        System.out.println("Unit callStmt: " + callStmt);
        System.out.println("SootMethod destinationMethod: " + destinationMethod);
        System.out.println();
        Stmt stmt = (Stmt) callStmt;
        InvokeExpr ie = stmt.getInvokeExpr();
        
        final List<Value> callArgs = ie.getArgs();
        final List<Value> paramLocals = new ArrayList<Value>();
        for (int i=0;i<destinationMethod.getParameterCount();i++) {
            paramLocals.add(destinationMethod.getActiveBody().getParameterLocal(i));
        }
        
        Value base = null;
        if (ie instanceof VirtualInvokeExpr) {
            VirtualInvokeExpr vie = (VirtualInvokeExpr) ie;
            base = vie.getBase();
        }
        else if (ie instanceof InterfaceInvokeExpr) {
            InterfaceInvokeExpr iie = (InterfaceInvokeExpr) ie;
            base = iie.getBase();
        }
        else if (ie instanceof SpecialInvokeExpr) {
            SpecialInvokeExpr iie = (SpecialInvokeExpr) ie;
            base = iie.getBase();
        }
        final Value baseF = base;

        return new FlowFunction<Map<Value, MockStatus>>() {
            @Override
            public Set<Map<Value, MockStatus>> computeTargets(Map<Value, MockStatus> source) {
                Set<Map<Value, MockStatus>> ret = new HashSet<>();
//                if (source instanceof StaticFieldRef) {
//                    ret.add(source);
//                }
                ret.add(source);
                for (int i=0; i<callArgs.size(); i++) {
                    Set<Value> keys = source.keySet();
                    for (Value key : keys) {
                        if (callArgs.get(i).equivTo(key) && i < paramLocals.size()) {
                            Map<Value, MockStatus> hm_local = new HashMap<Value, MockStatus>();
                            hm_local.put(paramLocals.get(i), source.get(key));
                            ret.add(hm_local);
                        }
                    }
                }
                if (source.containsKey(zeroValue())) {
                    Map<Value, MockStatus> hm_zeroVal = new HashMap<Value, MockStatus>();
                    for (int i=0; i<callArgs.size(); i++) {
                        hm_zeroVal.put(paramLocals.get(i), source.get(zeroValue()));
                    }
                    ret.add(hm_zeroVal);
                }
                if (baseF != null && source.containsKey(baseF)) {
                    Map<Value, MockStatus> hm_base = new HashMap<Value, MockStatus>();
                    hm_base.put(destinationMethod.retrieveActiveBody().getThisLocal(), source.get(baseF));
                    ret.add(hm_base);
                }
                return ret;
            }
        };
    }
    
    @Override
    public Map<Unit, Set<Map<Value, MockStatus>>> initialSeeds() {
          return DefaultSeeds.make(Collections.singleton(Scene.v().getMainMethod().getActiveBody().getUnits().getFirst()),
                zeroValue());
    }

    @Override
    protected Map<Value, MockStatus> createZeroValue() {
        Map<Value, MockStatus> initMap = new HashMap<Value, MockStatus>() {{
        }};
        initMap.put(new JimpleLocal("<<zero>>", NullType.v()), new MockStatus(false, false, false));
        return initMap;
    }

}
