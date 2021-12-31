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
import soot.SceneTransformer;
import soot.SootMethod;
import soot.Timer;
import soot.Unit;
import soot.Value;
import soot.jimple.DefinitionStmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.ide.JimpleIFDSSolver;
import soot.jimple.toolkits.ide.exampleproblems.IFDSReachingDefinitions;
import soot.jimple.toolkits.ide.icfg.JimpleBasedInterproceduralCFG;
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
    
    private long finishNano;
    
    public Timer interTimer = new soot.Timer();
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        JimpleBasedInterproceduralCFG icfg= new JimpleBasedInterproceduralCFG();
        
        IFDSTabulationProblem<Unit, Map<Value, MockStatus>, SootMethod, 
                InterproceduralCFG<Unit, SootMethod>> problem = new IFDSProblem(icfg);

        JimpleIFDSSolver<Map<Value, MockStatus>, 
                InterproceduralCFG<Unit, SootMethod>> solver = new JimpleIFDSSolver<>(problem);

        System.out.println("Starting solver");
        solver.solve();
        solver.dumpResults();
        System.out.println("Done");
    }

}
