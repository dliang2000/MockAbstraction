package ca.uwaterloo.liang;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import heros.FlowFunction;
import heros.FlowFunctions;
import heros.InterproceduralCFG;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.toolkits.ide.DefaultJimpleIFDSTabulationProblem;

public class IFDSProblem extends DefaultJimpleIFDSTabulationProblem<Map<Value, MockStatus>, InterproceduralCFG<Unit,SootMethod>> {
    
    InterproceduralCFG<Unit,SootMethod> icfg;
    
    public IFDSProblem(InterproceduralCFG<Unit, SootMethod> icfg) {
        super(icfg);
        this.icfg = icfg;
    }

    @Override
    public Map<Unit, Set<Map<Value, MockStatus>>> initialSeeds() {
        // TODO Auto-generated method stub
        return null;
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
    protected Map<Value, MockStatus> createZeroValue() {
        Map<Value, MockStatus> initMap = new HashMap<Value, MockStatus>();
        return initMap;
    }

}
