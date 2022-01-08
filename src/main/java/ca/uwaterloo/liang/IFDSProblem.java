package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import heros.DefaultSeeds;
import heros.FlowFunction;
import heros.FlowFunctions;
import heros.InterproceduralCFG;
import heros.flowfunc.Identity;
import heros.flowfunc.KillAll;
import soot.NullType;
import soot.Scene;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.ArrayRef;
import soot.jimple.AssignStmt;
import soot.jimple.CastExpr;
import soot.jimple.DefinitionStmt;
import soot.jimple.FieldRef;
import soot.jimple.InstanceFieldRef;
import soot.jimple.InterfaceInvokeExpr;
import soot.jimple.InvokeExpr;
import soot.jimple.SpecialInvokeExpr;
import soot.jimple.StaticFieldRef;
import soot.jimple.Stmt;
import soot.jimple.VirtualInvokeExpr;
import soot.jimple.internal.JimpleLocal;
import soot.jimple.toolkits.ide.DefaultJimpleIFDSTabulationProblem;
import soot.toolkits.scalar.Pair;

public class IFDSProblem extends DefaultJimpleIFDSTabulationProblem<Map<Value, MockStatus>, InterproceduralCFG<Unit,SootMethod>> {
    InterproceduralCFG<Unit,SootMethod> icfg;
    public IFDSProblem(InterproceduralCFG<Unit, SootMethod> icfg) {
        super(icfg);
        this.icfg = icfg;
    }

    @Override
    protected FlowFunctions<Unit, Map<Value, MockStatus>, SootMethod> createFlowFunctionsFactory() {
        return new FlowFunctions<Unit, Map<Value, MockStatus>, SootMethod>(){

            @Override
            public FlowFunction<Map<Value, MockStatus>> getNormalFlowFunction(Unit curr, Unit succ){
                return getNormalFlow(curr, succ);
            }

            @Override
            public FlowFunction<Map<Value, MockStatus>> getCallFlowFunction(Unit callStmt, SootMethod destinationMethod) {
                return getCallFlow(callStmt, destinationMethod);
            }

            @Override
            public FlowFunction<Map<Value, MockStatus>> getReturnFlowFunction(Unit callSite, SootMethod calleeMethod, Unit exitStmt, Unit returnSite){
                return getReturnFlow(callSite, calleeMethod, exitStmt, returnSite);
            }

            @Override
            public FlowFunction<Map<Value, MockStatus>> getCallToReturnFlowFunction(Unit callSite, Unit returnSite) {
                return getCallToReturnFlow(callSite, returnSite);
            }

        };
    }

    protected FlowFunction<Map<Value, MockStatus>> getCallToReturnFlow(Unit callSite, Unit returnSite) {
        return Identity.v();
    }

    protected FlowFunction<Map<Value, MockStatus>> getReturnFlow(Unit callSite, SootMethod calleeMethod, Unit exitStmt,
            Unit returnSite) {
        return KillAll.v();
    }

    protected FlowFunction<Map<Value, MockStatus>> getNormalFlow(Unit curr, Unit succ) {
        if (curr instanceof AssignStmt) {
            final AssignStmt assign = (AssignStmt) curr;
            final Value leftOp = assign.getLeftOp();
            final Value rightOp = assign.getRightOp();
            
            return new FlowFunction<Map<Value, MockStatus>>(){
                @Override
                public Set<Map<Value, MockStatus>> computeTargets(Map<Value, MockStatus> source){
                    if (source.containsKey(leftOp)) {
                        return Collections.emptySet();
                    }
                    
                    Set<Map<Value, MockStatus>> res = new HashSet<>();
                    res.add(source);
                    
                    if (source.containsKey(rightOp)) {
                        Map<Value, MockStatus> hm = new HashMap<>();
                        hm.put(leftOp, source.get(rightOp));
                        res.add(hm);
                    }
                    // FieldRef to be worked out
//                    if (rightOp instanceof FieldRef) {
//                        Value base = ((InstanceFieldRef)rightOp).getBase();
//                        if (source.containsKey(base)) res.add(leftOp);
//                    }
                    if (rightOp instanceof ArrayRef) {
                        Value base = ((ArrayRef)rightOp).getBase();
                        if (source.containsKey(base)) {
                            Map<Value, MockStatus> hm_arr = new HashMap<>();
                            hm_arr.put(leftOp, source.get(rightOp));
                            res.add(hm_arr);
                        }
                    }
                    if (rightOp instanceof CastExpr) {
                        Value right_val = ((CastExpr) rightOp).getOp();
                        if (source.containsKey(right_val)) {
                            Map<Value, MockStatus> hm_cast = new HashMap<>();
                            hm_cast.put(leftOp, source.get(right_val));
                            res.add(hm_cast);
                        }
                    }
                    return res;
                }
            };
            
        }
        return Identity.v();
    }

    protected FlowFunction<Map<Value, MockStatus>> getCallFlow(Unit callStmt, SootMethod destinationMethod) {
        if ("<clinit>".equals(destinationMethod.getName())) {
            return KillAll.v();
        }

        Stmt stmt = (Stmt) callStmt;
        InvokeExpr ie = stmt.getInvokeExpr();
        
        final List<Value> callArgs = ie.getArgs();
        final List<Value> paramLocals = new ArrayList<Value>();
        for (int i=0;i<destinationMethod.getParameterCount();i++) {
            paramLocals.add(destinationMethod.getActiveBody().getParameterLocal(i));
        }
        
        final boolean isIccMethod = IFDSDummyMainCreator.iccMethods.contains(destinationMethod);
        
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
                if (source.containsKey(zeroValue()) && isIccMethod) {
                    Map<Value, MockStatus> hm_zeroVal = new HashMap<Value, MockStatus>();
                    for (int i=0; i<callArgs.size(); i++) {
                        hm_zeroVal.put(paramLocals.get(i), source.get(zeroValue()));
                    }
                    ret.add(hm_zeroVal);
                }
                if (baseF != null && source.containsKey(baseF) && !isIccMethod) {
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
