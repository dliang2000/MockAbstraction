package ca.uwaterloo.liang;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import heros.DefaultSeeds;
import heros.FlowFunction;
import heros.FlowFunctions;
import heros.InterproceduralCFG;
import soot.NullType;
import soot.Scene;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.DefinitionStmt;
import soot.jimple.internal.JimpleLocal;
import soot.jimple.toolkits.ide.DefaultJimpleIFDSTabulationProblem;
import soot.toolkits.scalar.Pair;

public class IFDSProblem extends DefaultJimpleIFDSTabulationProblem<Map<Value, MockStatus>, InterproceduralCFG<Unit,SootMethod>> {
    
    public IFDSProblem(InterproceduralCFG<Unit, SootMethod> icfg) {
        super(icfg);
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
        return null;
    }

    protected FlowFunction<Map<Value, MockStatus>> getReturnFlow(Unit callSite, SootMethod calleeMethod, Unit exitStmt,
            Unit returnSite) {
        return null;
    }

    protected FlowFunction<Map<Value, MockStatus>> getNormalFlow(Unit curr, Unit succ) {
        
        return null;
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
