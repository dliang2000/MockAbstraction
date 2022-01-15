package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import heros.IFDSTabulationProblem;
import heros.InterproceduralCFG;
import heros.solver.IFDSSolver;
import soot.PackManager;
import soot.PointsToAnalysis;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.Timer;
import soot.Unit;
import soot.Value;
import soot.jimple.DefinitionStmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.ide.JimpleIFDSSolver;
import soot.jimple.toolkits.ide.exampleproblems.IFDSReachingDefinitions;
import soot.jimple.toolkits.ide.icfg.JimpleBasedInterproceduralCFG;
import soot.options.Options;
import soot.toolkits.scalar.Pair;


public class MockAnalysisInterprocTransformer extends SceneTransformer {
    private static final Logger logger = LoggerFactory.getLogger(PackManager.class);
    
    private CallGraph callGraph;
    
    private PointsToAnalysis pointsToAnalysis;
    
    /**
     * All the methods of the applications classes to analyze
     */
    private ArrayList<SootMethod> appMethods;
    
    /**
     * Each class mapped to its corresponding methods
     */
    private HashMap<String, ArrayList<SootMethod>> classMethods;
    
    
    /**
     * Each method mapped to its summary
     */
    private static HashMap<SootMethod, ProcSummary> procSummaries;
        
    private MockAnalysis mockAnalysis;
        
    public MockAnalysisInterprocTransformer() {
        super();
        
        procSummaries = new HashMap<SootMethod, ProcSummary>();
            
        classMethods = new HashMap<String, ArrayList<SootMethod> >();
                
        appMethods = new ArrayList<SootMethod>();
    }
    
    private long startNano;
    
    public Timer interTimer = new soot.Timer();
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        Options.v().setPhaseOption("cg", "enabled:true");
        Options.v().setPhaseOption("cg.spark", "enabled:true");
        Options.v().setPhaseOption("cg.spark", "string-constants:true");
        PackManager.v().getPack("cg").apply();
//        for (SootClass sc : Scene.v().getApplicationClasses())
//            for (SootMethod sm : sc.getMethods())
//                sm.retrieveActiveBody();
        
        InterproceduralCFG<Unit, SootMethod> icfg= new JimpleBasedInterproceduralCFG();
        
        IFDSTabulationProblem<Unit, Map<Value, MockStatus>, SootMethod, InterproceduralCFG<Unit, SootMethod>> problem = new IFDSProblem(icfg);

        IFDSSolver<Unit, Map<Value, MockStatus>, SootMethod, InterproceduralCFG<Unit, SootMethod>> 
            solver = new IFDSSolver<Unit, Map<Value, MockStatus>, SootMethod, 
                                    InterproceduralCFG<Unit, SootMethod>>(problem);  
        
        startNano = System.nanoTime();
        System.out.println("Starting solver");
        solver.solve();
        
        System.out.println("Solver done in " + (System.nanoTime() - startNano) / 10E9 + " seconds.");
        
        System.out.println("Main Method: " + Scene.v().getMainMethod().getSubSignature());
        
        for (Unit ret : Scene.v().getMainMethod().getActiveBody().getUnits()) {
            //System.out.println("Unit: " + ret.toString());
//            if (solver.ifdsResultsAt(ret).isEmpty()) {
//                System.out.println("solver has no results at Unit: " + ret.toString());
//            }
            for (Map<Value, MockStatus> map : solver.ifdsResultsAt(ret)) {
                for (Value val : map.keySet()) {
                    System.out.println("Value: " + val);
                    System.out.println("MockStatus: " + map.get(val).toString());
                }
            }
        }
    }

}
