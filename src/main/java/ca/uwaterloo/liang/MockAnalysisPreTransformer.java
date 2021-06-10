package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import ca.uwaterloo.liang.util.Utility;
import soot.PointsToAnalysis;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootField;
import soot.SootMethod;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.Chain;

public class MockAnalysisPreTransformer extends SceneTransformer {
    
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
    
    /**
     * Each test class mapped to the list of fields that are defined mock in before method
     */
    private static HashMap<SootClass, HashMap<SootField, MockStatus>> fieldMocks;
        
    private MockAnalysis myMAnalysis;
    
    private static int totalNumberofBeforeMethods = 0;
    
    public MockAnalysisPreTransformer() {
        super();
        
        procSummaries = new HashMap<SootMethod, ProcSummary>();
            
        classMethods = new HashMap<String, ArrayList<SootMethod> >();
                
        appMethods = new ArrayList<SootMethod>();
        
        fieldMocks = new HashMap<SootClass, HashMap<SootField, MockStatus>>();
    }
    
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        // TODO Auto-generated method stub
        for (SootClass sc : Scene.v().getApplicationClasses()) {
            
            if (!Utility.isTestClass(sc))
                continue;
            
            ProcSummary mockSummary = null;  
            
            ExceptionalUnitGraph aCfg = null;
            
            for (SootMethod method : sc.getMethods()) {
                if (Utility.isBeforeMethod(method) && method.hasActiveBody()) {
                    
                    totalNumberofBeforeMethods++;
                    
                    mockSummary = new ProcSummary(method);
                    
                    aCfg = new ExceptionalUnitGraph(method.getActiveBody());
                    
                    myMAnalysis = new MockAnalysis(aCfg, sc, method);
                    myMAnalysis.updateInvocations(aCfg);
                    
                    mockSummary.setMocks( myMAnalysis.getMocks() );           
                    
                    mockSummary.setTotalInvokeExprs( myMAnalysis.getTotalInvokeExprs() );
                    
                    mockSummary.setInvokeExprsOnMocks( myMAnalysis.getInvokeExprsOnMocks() );
                    
                    procSummaries.put(method, mockSummary);
                    
                    HashMap<SootField, MockStatus> currFieldMocks = myMAnalysis.getFieldMocks();
                    
                    if (!currFieldMocks.isEmpty()) {
                        fieldMocks.put(sc, currFieldMocks);
                    }
                }
            }
        }
    }
    
    public static HashMap<SootClass, HashMap<SootField, MockStatus>> getFieldMocks() {
        return fieldMocks;
    }
    
    public static int getNumberOfBeforeMethods() {
        return totalNumberofBeforeMethods;
    }

}
