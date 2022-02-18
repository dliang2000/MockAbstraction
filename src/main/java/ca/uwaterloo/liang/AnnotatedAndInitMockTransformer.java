package ca.uwaterloo.liang;
/* MockAnalysis
 * Copyright (C) 2021 Qian Liang <q8liang@uwaterloo.ca>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ca.uwaterloo.liang.util.Util;
import soot.Body;
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
import soot.VoidType;
import soot.jimple.FieldRef;
import soot.jimple.Stmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.tagkit.AnnotationTag;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.Chain;

public class AnnotatedAndInitMockTransformer extends SceneTransformer {
    
    private static HashSet<SootField> annotatedMocks = new HashSet<>();    
    
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
    
    public Timer annotatedTimer = new soot.Timer();
    
    public AnnotatedAndInitMockTransformer() {
        super();
        
        procSummaries = new HashMap<SootMethod, ProcSummary>();
        
        fieldMocks = new HashMap<SootClass, HashMap<SootField, MockStatus>>();
    }
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        annotatedTimer.start();
        int totalNumberOfAnnotatedMocks = 0, totalNumberOfDefaultInitMocks = 0;
        
        Chain<SootClass> appClasses = Scene.v().getApplicationClasses();
        for (SootClass appClass : appClasses) {
            Chain<SootField> fields = appClass.getFields();
            
            for (SootField field : fields) {
                if (isAnnotatedMock(field)) {
                    totalNumberOfAnnotatedMocks++;
                    System.out.println(field);
                    annotatedMocks.add(field);
                }
            }
        }
        
        for (SootClass sc : Scene.v().getApplicationClasses()) {
            
            if (!Util.isTestClass(sc))
                continue;
            
            ProcSummary mockSummary = null;  
            
            ExceptionalUnitGraph aCfg = null;
            
            for (SootMethod method : sc.getMethods()) {
                if ( Util.isDefaultInitMethod(method) && method.hasActiveBody()) {
                    
                    //totalNumberofBeforeMethods++;
                    
                    mockSummary = new ProcSummary(method);
                    
                    aCfg = new ExceptionalUnitGraph(method.getActiveBody());
                    
                    mockAnalysis = new MockAnalysis(aCfg, method, true);
                    
                    // update fieldMocks from the output mayMocks analyzed from before method and init<> method
                    Map<Unit, Map<Value, MockStatus>> mayMocks = mockAnalysis.getMocks();
                    
                    HashMap<SootField, MockStatus> fieldMap = new HashMap<SootField, MockStatus>();
                    
                    for (Map.Entry<Unit, Map<Value, MockStatus>> entry : mayMocks.entrySet()) {
                        
                        //System.out.println("getMocks() returns non-empty.");
                        Map<Value, MockStatus> abstraction = entry.getValue();
                        
                        for (Map.Entry<Value, MockStatus> curr : abstraction.entrySet()) {
                            Value value = curr.getKey();
                            MockStatus ms = curr.getValue();
                           // System.out.println("In AnnotatedAndInitMockTransformer, Unit: " + entry.getKey());
                            //System.out.println("curr_value: " + value);
                            if (value instanceof FieldRef) {
                                totalNumberOfDefaultInitMocks++;
                                FieldRef ref = (FieldRef) value;
                                SootField sootField = ref.getField();
                                fieldMap.put(sootField, ms);
                                //System.out.println("FieldMocks updated for SootField: " + sootField);
                            }
                        }
                    }
                    
                    if (!fieldMap.isEmpty()) {
                        fieldMocks.put(sc, fieldMap);
                    }
                    
                    mockSummary.setMocks( mockAnalysis.getMocks() );
                    
                    mockSummary.setTotalInvokeExprs( mockAnalysis.getTotalInvokeExprs() );
                    
                    mockSummary.setInvokeExprsOnMocks( mockAnalysis.getInvokeExprsOnMocks() );
                    
                    procSummaries.put(method, mockSummary);
                }
            }
        }
        
        annotatedTimer.end();
        long runtime = annotatedTimer.getTime();
        
        System.out.println("" + "Soot has run AnnotatedAndInitMockTransformer for " + runtime + " ms.");
        
        System.out.println("Total Number of Annotated Mocks in the benchmark: " + totalNumberOfAnnotatedMocks);
        
        System.out.println("Total Number of Mocks defined in default init<> in the benchmark: " + totalNumberOfDefaultInitMocks);
    }
    
    public static HashMap<SootClass, HashMap<SootField, MockStatus>> getFieldMocks() {
        return fieldMocks;
    }
    
    public static HashSet<SootField> getAnnotatedMocks() {
        return annotatedMocks;
    }
    
    private static boolean isAnnotatedMock(SootField field) {
        List<soot.tagkit.Tag> fieldTags = field.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) field
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/mockito/Mock;") || annotation.getType().equals("Lorg/easymock/Mock;") ) {
                    System.out.println("Annotated Mock found: " + field.getSubSignature());
                    return true;
                }
            }
        }
        return false;
    }
}
