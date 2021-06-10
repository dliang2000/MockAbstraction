package ca.uwaterloo.liang.util;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ca.uwaterloo.liang.MockLibrary;
import ca.uwaterloo.liang.MockStatus;
import ca.uwaterloo.liang.ProcSummary;

import soot.Local;
import soot.RefType;
import soot.SootClass;
import soot.SootMethod;
import soot.Type;
import soot.Unit;
import soot.Value;
import soot.VoidType;
import soot.tagkit.AnnotationTag;
import soot.toolkits.scalar.FlowSet;

public class Util {

    public static SootClass getSootClassFromRefType(Type aRefType) 
    {
        if ( !(aRefType instanceof RefType) ) {
            return null;
        }       
        return ((RefType)aRefType).getSootClass();
    }
    
    public static boolean isJimpleDefinedVar(Value var)
    {           
        boolean yes = false;
        
        if (var instanceof Local) {
            String varName = ((Local)var).getName();
            yes = yes || varName.startsWith("$");
            yes = yes || varName.startsWith("@parameter");
            yes = yes || varName.startsWith("@this");
        }                       
        
        return yes;
    }
    
    public static List<int[]> gatherTestMethodMocksStats(SootClass aClass, HashMap<SootMethod, ProcSummary> procSummaries) {
           
        List<SootMethod> ncM = aClass.getMethods();
        List<int[]> mocksStats = new ArrayList<>();
        
        ProcSummary pSmy = null;
        
        for(SootMethod m : ncM) {
            if ( isBeforeMethod(m) || isTestMethod(m) || isAfterMethod(m) ) {
                pSmy = procSummaries.get(m);
            
                if (pSmy == null) 
                    continue;
                
                HashMap<Unit, HashMap<Value, MockStatus>> mocks = pSmy.getMocks();
                
                int[] curr_method_mock_info = new int[3];
                
                for (Map.Entry<Unit, HashMap<Value, MockStatus>> entry : mocks.entrySet()) {
                    
                    HashMap<Value, MockStatus> val = entry.getValue();
                                    
                    for (Map.Entry<Value, MockStatus> curr : val.entrySet()) {
                        Value v = curr.getKey();
                        MockStatus ms = curr.getValue();
                        if (ms.getMock()) {
                            curr_method_mock_info[0] = 1;
                        }
                        if (ms.getArrayMock()) {
                            curr_method_mock_info[1] = 1;
                        }
                        if (ms.getCollectionMock()) {
                            curr_method_mock_info[2] = 1;
                        }
                    }
                }
                
                if (curr_method_mock_info[0] == 1 || curr_method_mock_info[1] == 1 || curr_method_mock_info[2] == 1) {
                    mocksStats.add(curr_method_mock_info);
                }
            }
        }
        return mocksStats;
    }
    
    public static List<int[]> gatherHelperMethodMocksStats(SootClass aClass, HashMap<SootMethod, ProcSummary> procSummaries) {
        
        List<SootMethod> ncM = aClass.getMethods();
        List<int[]> mocksStats = new ArrayList<>();
        
        ProcSummary pSmy = null;
        
        for(SootMethod m : ncM) {
            if (isBeforeMethod(m) || isTestMethod(m) || isAfterMethod(m) ) 
                continue;
            
            pSmy = procSummaries.get(m);
            
            if (pSmy == null) 
                continue;
            
            HashMap<Unit, HashMap<Value, MockStatus>> mocks = pSmy.getMocks();
            
            int[] curr_method_mock_info = new int[3];
            
            for (Map.Entry<Unit, HashMap<Value, MockStatus>> entry : mocks.entrySet()) {
                
                HashMap<Value, MockStatus> val = entry.getValue();
                                
                for (Map.Entry<Value, MockStatus> curr : val.entrySet()) {
                    Value v = curr.getKey();
                    MockStatus ms = curr.getValue();
                    if (ms.getMock()) {
                        curr_method_mock_info[0] = 1;
                    }
                    if (ms.getArrayMock()) {
                        curr_method_mock_info[1] = 1;
                    }
                    if (ms.getCollectionMock()) {
                        curr_method_mock_info[2] = 1;
                    }
                }
            }
            
            if (curr_method_mock_info[0] == 1 || curr_method_mock_info[1] == 1 || curr_method_mock_info[2] == 1) {
                mocksStats.add(curr_method_mock_info);
            }
        }
        
        return mocksStats;
    }
    
    public static StringBuffer printMayMocks
                        (SootClass aClass, HashMap<SootMethod, ProcSummary> procSummaries) {
        StringBuffer msg = new StringBuffer();
        
        msg.append(" ====================================== \n")
           .append("** CLASS ").append(aClass.toString())
           .append("\n\n");       
        
        List<SootMethod> ncM = aClass.getMethods();
        
        ProcSummary pSmy = null;
        
        for(SootMethod m : ncM) {
            
            msg.append("\tmethod ").append(m.getName()).append(" : \n");
            
            pSmy = procSummaries.get(m);
            
            if (pSmy == null) 
                continue;
            
            HashMap<Unit, HashMap<Value, MockStatus>> mocks = pSmy.getMocks();
            
            for (Map.Entry<Unit, HashMap<Value, MockStatus>> entry : mocks.entrySet()) {
                // How to print output?
                Unit u = entry.getKey();
                msg.append("Unit: ").append(u).append("\n"); 
                
                HashMap<Value, MockStatus> abstraction = entry.getValue();
                
                
                for (Map.Entry<Value, MockStatus> curr : abstraction.entrySet()) {
                    Value value = curr.getKey();
                    MockStatus ms = curr.getValue();
                    
                    msg.append("Value: ").append(value).append("\n");
                    
                    if (ms.getMock()) {
                        msg.append("May Mock: true").append("\n\n");
                    }
                    if (ms.getArrayMock()) {
                        msg.append("Array Mock: true").append("\n\n");
                    }
                    if (ms.getCollectionMock()) {
                        msg.append("Collection Mock: true").append("\n\n");
                    }
                }
            }   
            
        }

        return msg;
        
    }
    
    public static boolean isApplicationClass(SootClass aClass, Collection<SootClass> appClasses) {
        for (SootClass nClass : appClasses) {
            if (nClass.equals(aClass))
                return true;
        }
        
        return false;
    }
    
    public static boolean isBeforeMethod(SootMethod sm) {
        // JUnit 3
        if ((sm.getName().equals("init()") ||  sm.getName().equals("setUp()")) 
                && sm.getParameterCount() == 0 && sm.getReturnType() instanceof VoidType) {
            //System.out.println("Test case found: " + sm.getSubSignature());
            return true;
        }

        // JUnit 4+
        List<soot.tagkit.Tag> smTags = sm.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) sm
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/junit/Before;") || annotation.getType().equals("Lorg/junit/BeforeClass;")
                        || annotation.getType().equals("Lorg/junit/jupiter/api/BeforeEach;") 
                        || annotation.getType().equals("Lorg/junit/jupiter/api/BeforeAll;")) {
                    //System.out.println("Test case found: " + sm.getSignature());
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isAfterMethod(SootMethod sm) {
        // JUnit 3
        if (sm.getName().equals("tearDown()") 
                && sm.getParameterCount() == 0 && sm.getReturnType() instanceof VoidType) {
            //System.out.println("Test case found: " + sm.getSubSignature());
            return true;
        }

        // JUnit 4+
        List<soot.tagkit.Tag> smTags = sm.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) sm
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/junit/After;") || annotation.getType().equals("Lorg/junit/AfterClass;")
                        || annotation.getType().equals("Lorg/junit/jupiter/api/AfterEach;") 
                        || annotation.getType().equals("Lorg/junit/jupiter/api/AfterAll;")) {
                    //System.out.println("Test case found: " + sm.getSignature());
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isTestMethod(SootMethod sm) {
        // JUnit 3
        if (sm.getName().toLowerCase().startsWith("test") && sm.getParameterCount() == 0 
                && sm.getReturnType() instanceof VoidType) {
            //System.out.println("Test case found: " + sm.getSubSignature());
            return true;
        }

        // JUnit 4+

        List<soot.tagkit.Tag> smTags = sm.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) sm
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/junit/Test;") 
                        || annotation.getType().equals("Lorg/junit/jupiter/api/Test;")) {
                    //System.out.println("Test case found: " + sm.getSignature());
                    return true;
                }
            }
        }
        return false;
    }
    
    // Determine if the SootClass is a test class. This version only checks if there
    // are any test cases inside the class itself. Future version will take care off
    // test cases in any of its superclasses invoked.
    public static boolean isTestClass(SootClass sc) {
        for (SootMethod sm : sc.getMethods()) {
            // exclude test classes with private no-arg constructor
            if ( isTestMethod(sm) ) {
                return true;
            }
        }
        return false;
    }
    
    private static List<String> MOCKITO_VERIFIES = Collections.unmodifiableList(
            Arrays.asList(new String[] {"java.lang.Object verify(java.lang.Object)", 
                                        "java.lang.Object verify(java.lang.Object,org.mockito.verification.VerificationMode)"}));
    
    public static boolean isMockAPI(SootMethod method) {
        return (method.getSubSignature().equals(MockLibrary.EASYMOCK.subSignature()) 
                                || method.getSubSignature().equals(MockLibrary.MOCKITO.subSignature())
                                || method.getSubSignature().equals(MockLibrary.POWERMOCK.subSignature())
                                ||  MOCKITO_VERIFIES.contains(method.getSubSignature()) );
    }

}