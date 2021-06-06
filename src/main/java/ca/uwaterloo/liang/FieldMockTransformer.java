package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import soot.Body;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootField;
import soot.SootMethod;
import soot.Unit;
import soot.VoidType;
import soot.jimple.Stmt;
import soot.tagkit.AnnotationTag;
import soot.util.Chain;

public class FieldMockTransformer extends SceneTransformer {
    
    private static HashSet<SootField> annotatedMocks = new HashSet<>();
    
    private static HashSet<SootField> fieldMocks = new HashSet<>();
    
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        // TODO Auto-generated method stub
        
        Chain<SootClass> appClasses = Scene.v().getApplicationClasses();
        for (SootClass appClass : appClasses) {
            Chain<SootField> fields = appClass.getFields();
            
            for (SootField field : fields) {
                if (isAnnotatedMock(field)) {
                    System.out.println(field);
                    annotatedMocks.add(field);
                }
            }
            
            List<SootMethod> methods = appClass.getMethods();
            
            for (SootMethod m : methods) {
                if (isBeforeMethod(m) && m.hasActiveBody()) {
                    Body body = m.getActiveBody();
                    
                    Chain units = body.getUnits();
                    List<Unit> stmtList = new ArrayList<Unit>();
                    stmtList.addAll(units);
                    
                    for (Unit u: stmtList) {
                        Stmt aStmt = (Stmt) u;
                        
                        if (aStmt.containsFieldRef() && aStmt.containsInvokeExpr()) {
                            SootField field = aStmt.getFieldRef().getField();
                            
                            SootMethod invokeMethod = aStmt.getInvokeExpr().getMethod();
                            
                            if (isMockAPI(invokeMethod)) {
                                System.out.println("Field is mock in setup() or init(): " + field);
                                fieldMocks.add(field);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static HashSet<SootField> getFieldMocks() {
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
                if (annotation.getType().equals("Lorg/mockito/Mock;")) {
                    System.out.println("Annotated Mock found: " + field.getSubSignature());
                    return true;
                }
            }
        }
        return false;
    }
    
    private static List<String> MOCKITO_VERIFIES = Collections.unmodifiableList(
            Arrays.asList(new String[] {"java.lang.Object verify(java.lang.Object)", 
                                        "java.lang.Object verify(java.lang.Object,org.mockito.verification.VerificationMode)"}));
    
    private static boolean isMockAPI(SootMethod method) {
        return (method.getSubSignature().equals(MockLibrary.EASYMOCK.subSignature()) 
                                || method.getSubSignature().equals(MockLibrary.MOCKITO.subSignature())
                                || method.getSubSignature().equals(MockLibrary.POWERMOCK.subSignature())
                                ||  MOCKITO_VERIFIES.contains(method.getSubSignature()) );
    }
    
    private static boolean isBeforeMethod(SootMethod sm) {
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
}
