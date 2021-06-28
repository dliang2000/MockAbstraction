package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import ca.uwaterloo.liang.util.Util;
import soot.PointsToAnalysis;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootField;
import soot.SootMethod;
import soot.Timer;
import soot.Timers;
import soot.Unit;
import soot.Value;
import soot.jimple.FieldRef;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.Chain;

public class MockAnalysisPreTransformer extends SceneTransformer {
    
    /**
     * Each method mapped to its summary
     */
    private static HashMap<SootMethod, ProcSummary> procSummaries;
    /**
     * Each test class mapped to the list of fields that are defined mock in before method
     */
    private static HashMap<SootClass, HashMap<SootField, MockStatus>> fieldMocks;
        
    private MockAnalysis mockAnalysis;
    
    private long startNano;
    
    private long finishNano;
    
    public Timer preTimer = new soot.Timer();
    
    public MockAnalysisPreTransformer() {
        super();
        
        procSummaries = new HashMap<SootMethod, ProcSummary>();
        
        fieldMocks = new HashMap<SootClass, HashMap<SootField, MockStatus>>();
    }
    
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        preTimer.start();
        
        for (SootClass sc : Scene.v().getApplicationClasses()) {
            
            if (!Util.isTestClass(sc))
                continue;
            
            ProcSummary mockSummary = null;  
            
            ExceptionalUnitGraph aCfg = null;
            
            // If the SootClass has field defined as mock in <init>, retrieve that fieldMap from previous transformer.
            HashMap<SootField, MockStatus> fieldMap = new HashMap<SootField, MockStatus>();
            if (AnnotatedAndInitMockTransformer.getFieldMocks().containsKey(sc)) {
                fieldMap = AnnotatedAndInitMockTransformer.getFieldMocks().get(sc);
            }
            
            //|| Util.isDefaultInitMethod(method) )
            for (SootMethod method : sc.getMethods()) {
                if ( Util.isBeforeMethod(method)  && method.hasActiveBody()) {
                     
                    //totalNumberofBeforeMethods++;
                    
                    mockSummary = new ProcSummary(method);
                    
                    aCfg = new ExceptionalUnitGraph(method.getActiveBody());
                    
                    mockAnalysis = new MockAnalysis(aCfg, method, true);
                    
                    // update fieldMocks from the output mayMocks analyzed from before method and init<> method
                    Map<Unit, Map<Value, MockStatus>> mayMocks = mockAnalysis.getMocks();
                    
                    for (Map.Entry<Unit, Map<Value, MockStatus>> entry : mayMocks.entrySet()) {
                        
                        Map<Value, MockStatus> abstraction = entry.getValue();
                        
                        for (Map.Entry<Value, MockStatus> curr : abstraction.entrySet()) {
                            Value value = curr.getKey();
                            MockStatus ms = curr.getValue();
                            //System.out.println("In MOckAnalysisPreTransformer, Unit: " + entry.getKey());
                            //System.out.println("curr_value: " + value);
                            if (value instanceof FieldRef) {
                                FieldRef ref = (FieldRef) value;
                                SootField sootField = ref.getField();
                                fieldMap.put(sootField, ms);
                                //System.out.println("FieldMocks updated for SootField in MockAnalysisPre: " + sootField);
                            }
                        }
                    }
                    
                    mockSummary.setMocks( mockAnalysis.getMocks() );
                    
                    mockSummary.setTotalInvokeExprs( mockAnalysis.getTotalInvokeExprs() );
                    
                    mockSummary.setInvokeExprsOnMocks( mockAnalysis.getInvokeExprsOnMocks() );
                    
                    procSummaries.put(method, mockSummary);
                }
                
                if (!fieldMap.isEmpty()) {
                    fieldMocks.put(sc, fieldMap);
                }
            }
        }
        
        preTimer.end();
        long runtime = preTimer.getTime();
        System.out.println("" + "Soot has run MockAnalysisPreTransformer for " + runtime + " ms.");
    }
    
    public static HashMap<SootClass, HashMap<SootField, MockStatus>> getFieldMocks() {
        return fieldMocks;
    }
    
    public static HashMap<SootMethod, ProcSummary> getProcSummaries() {
        return procSummaries;
    }

}
