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

    public MockAnalysisPreTransformer() {
        super();
        
        procSummaries = new HashMap<SootMethod, ProcSummary>();
        
        fieldMocks = new HashMap<SootClass, HashMap<SootField, MockStatus>>();
    }
    
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        
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
                    mockAnalysis.updateInvocations(aCfg);
                    
                    // update fieldMocks from the output mayMocks analyzed from before method and init<> method
                    HashMap<Unit, HashMap<Value, MockStatus>> mayMocks = mockAnalysis.getMocks();
                    
                    for (Map.Entry<Unit, HashMap<Value, MockStatus>> entry : mayMocks.entrySet()) {
                        
                        HashMap<Value, MockStatus> abstraction = entry.getValue();
                        
                        for (Map.Entry<Value, MockStatus> curr : abstraction.entrySet()) {
                            Value value = curr.getKey();
                            MockStatus ms = curr.getValue();
                            
                            if (value instanceof FieldRef) {
                                FieldRef ref = (FieldRef) value;
                                SootField sootField = ref.getField();
                                fieldMap.put(sootField, ms);
                                System.out.println("FieldMocks updated for SootField in MockAnalysisPre: " + sootField);
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
    }
    
    public static HashMap<SootClass, HashMap<SootField, MockStatus>> getFieldMocks() {
        return fieldMocks;
    }
    
    public static HashMap<SootMethod, ProcSummary> getProcSummaries() {
        return procSummaries;
    }

}
