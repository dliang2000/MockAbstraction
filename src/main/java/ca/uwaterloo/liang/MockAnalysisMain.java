package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import soot.PointsToAnalysis;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.toolkits.graph.ExceptionalUnitGraph;

public class MockAnalysisMain extends SceneTransformer {
        
    private CallGraph myCallGraph;
    
    private PointsToAnalysis myPointsToAnalysis;
    
    /**
     * All the classes of the application to analyze
     */ 
    private HashMap<String, SootClass> myAppClasses;
    private Collection<SootClass> colAppClasses;
    
    /**
     * All the methods of the applications classes to analyze
     */
    private ArrayList<SootMethod> myAppMethods;
    

    /**
     * Each class mapped to its corresponding methods
     */
    private HashMap<String, ArrayList<SootMethod> > myClassMethods;
    
    
    /**
     * Each method mapped to its summary
     */
    private HashMap<SootMethod, ProcSummary> myProcSummaries;
    
    private MockAnalysis myMAnalysis;
    
    
    public MockAnalysisMain() {
        super();
        
        myProcSummaries = new HashMap<SootMethod, ProcSummary>();
            
        myClassMethods = new HashMap<String, ArrayList<SootMethod> >();
                
        myAppMethods = new ArrayList<SootMethod>();
        
        myAppClasses = new HashMap<String, SootClass>();
    }
    
        
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        // TODO Auto-generated method stub
        Iterator<SootClass> itAppClasses = Scene.v().getApplicationClasses().iterator();
        while(itAppClasses.hasNext()) {
            SootClass nextClass = itAppClasses.next();
            myAppClasses.put(nextClass.getName(), nextClass);
        }
        colAppClasses = myAppClasses.values();
        
        myCallGraph = Scene.v().getCallGraph();
        
        // get points to analysis object
        myPointsToAnalysis = Scene.v().getPointsToAnalysis();
        
        //Compute summaries of all methods present in the call graph
        
        for (SootClass sc : colAppClasses) {
            myAppMethods.addAll(sc.getMethods());           
            myClassMethods.put(sc.getName(), new ArrayList<SootMethod>(sc.getMethods()) );
        } 
                        
        ProcSummary mockSummary = null;  
        
        ExceptionalUnitGraph aCfg = null;
        
        for (SootMethod method : myAppMethods) {   
            if (method.hasActiveBody()) {
                mockSummary = new ProcSummary(method);
            }
        }
    }
    
}
