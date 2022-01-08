package ca.uwaterloo.liang;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
        
        return null;
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
