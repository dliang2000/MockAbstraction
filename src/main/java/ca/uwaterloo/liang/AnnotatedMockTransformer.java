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

public class AnnotatedMockTransformer extends SceneTransformer {
    
    private static HashSet<SootField> annotatedMocks = new HashSet<>();
    
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
        }
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
}
