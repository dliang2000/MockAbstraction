package ca.uwaterloo.liang;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import soot.Body;
import soot.Hierarchy;
import soot.MethodOrMethodContext;
import soot.PackManager;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.Transform;
import soot.Unit;
import soot.jimple.Stmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.CallGraphBuilder;
import soot.options.Options;
import soot.tagkit.AnnotationTag;
import soot.toolkits.graph.CompleteUnitGraph;
import soot.util.Chain;

public class MockRunner {
    private static String benchmark;
    private static String output_path;
    
    private static final Logger logger = LoggerFactory.getLogger(PackManager.class);
    
    public static void main(String[] args) throws IOException {
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTransform", MockTransformer.v()) {
        });
        Options.v().set_prepend_classpath(true);
        Options.v().set_verbose(true);
        Options.v().set_whole_program(true);
        Options.v().set_output_format(1); // Output format in .jimple file
        Options.v().set_allow_phantom_refs(true);
        List<String> pd = new ArrayList<>();
        pd.add("-main-class");
        pd.add(args[0]);
        pd.add("-process-dir");
        pd.add(args[1]);
        pd.add("-process-dir");
        pd.add(args[2]);
        Options.v().set_soot_classpath(args[3]);
        MockRunner.benchmark = args[4];
        MockRunner.output_path = args[5];
        logger.debug("args[0]: " + args[0]);
        logger.debug("args[1]: " + args[1]);
        logger.debug("args[2]: " + args[2]);
        logger.debug("args[3]: " + args[3]);
        logger.debug("args[4]: " + args[4]);
        logger.debug("args[5]: " + args[5]);
        soot.Main.main(pd.toArray(new String[0]));
    }
    
    static class MockTransformer extends SceneTransformer {
        private final static MockTransformer instance = new MockTransformer();
        private MockTransformer() {
        }
        public static MockTransformer v() { 
            return instance; 
        }
        
        @Override
        protected void internalTransform(String phaseName, Map options) {            
            List<MockLibrary> mockLibraries = new ArrayList<MockLibrary>();
            mockLibraries.add(MockLibrary.EASYMOCK);
            mockLibraries.add(MockLibrary.MOCKITO);
            mockLibraries.add(MockLibrary.POWERMOCK);
            
            MockLibrary mockLibrary = MockAnalyzer.v().determineMockLibrary(Scene.v(), mockLibraries);
            
            List<String> MockLinesToAdd = new ArrayList<>();
            MockLinesToAdd.add(String.join("\t", "Test Class", "Test Method"));
            
            if (mockLibrary != null) {
                
                int count_totalTestCases = 0;
                int count_testCaseWithMock = 0;
                int count_testCaseWithImmediateMock = 0;
                int count_testCaseWithWrapperMock = 0;
                
                List<SootMethod> testCaseListWithMock = new ArrayList<SootMethod>();
                
                CallGraph cg;
                if (Scene.v().hasCallGraph()) {
                    cg = Scene.v().getCallGraph();
                } else {
                    new CallGraphBuilder().build();
                    cg = Scene.v().getCallGraph();
                    Scene.v().releaseCallGraph();
                }
            
                Iterator<SootClass> classIt = Scene.v().getApplicationClasses().iterator();
            
                StringBuilder sb = new StringBuilder();
                while (classIt.hasNext()) {
                    SootClass testClass = (SootClass) classIt.next();
                
                    // skip classes that are final or not concrete, and classes that are not public
                    if (!testClass.isConcrete() || !testClass.isPublic() || testClass.getName().contains("$"))
                        continue;
                
                    // skip the test classes with a constructor
                    if (containsConstructor(testClass, sb)) 
                        continue;
                
                    Iterator<SootMethod> mIt = testClass.getMethods().iterator();
                    while (mIt.hasNext()) {
                        SootMethod sm = (SootMethod) mIt.next();
                        
                        if (isTestCase(sm) && sm.isPublic() && sm.hasActiveBody()) {
                            count_totalTestCases += 1;
                            //logger.debug("Source Method: " + srcMethod);
                            Body body = sm.getActiveBody();
                            
                            Chain units = body.getUnits();
                            List<Unit> stmtList = new ArrayList<Unit>();
                            stmtList.addAll(units);
                            
                            for (Unit u: stmtList) {
                                Stmt s = (Stmt) u;
                                if (MockAnalyzer.v().isMock(Scene.v(), cg, u, mockLibrary)) {
                                    count_testCaseWithMock += 1;
                                    testCaseListWithMock.add(sm);
                                    
                                    MockLinesToAdd.add(String.join("\t", testClass.getName(), sm.getSubSignature()));
                                    if (MockAnalyzer.v().isImmediateMock(u)) {
                                        count_testCaseWithImmediateMock += 1;
                                    }
                                    
                                    if (MockAnalyzer.v().isWrapperMock(Scene.v(), cg, u, mockLibrary)) {
                                        count_testCaseWithWrapperMock += 1;
                                    }
                                    break;
                                }
                            }
                            
                        }
                    }
                }
                System.out.println("Total Number of public, non-constructor test cases in the benchmark: " + count_totalTestCases);
                System.out.println("Number of Test cases with Mock object created: " + count_testCaseWithMock);
                System.out.println("Number of Test cases with Immediate Mock object: " + count_testCaseWithImmediateMock);
                System.out.println("Number of Test cases with Wrapper Mock object: " + count_testCaseWithWrapperMock);
            }
            File csvMockOutputFile = new File(output_path + "/CSV_Files/" + benchmark + "_test_case_with_mock_object.csv");
            try (FileWriter fw = new FileWriter(csvMockOutputFile)) {
                for (String s: MockLinesToAdd) {
                    String[] split = s.split("\t");
                    fw.write(Arrays.asList(split).stream().collect(Collectors.joining("\t")));
                    fw.write("\n");
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    private static boolean containsConstructor(SootClass sc, StringBuilder sb) {
        boolean containsConstructor = false;
        for (SootMethod sm : sc.getMethods()) {
            // exclude test classes with multi-arg constructor or private no-arg constructor
            if (sm.isConstructor() && (sm.getParameterCount() > 0 || sm.isPrivate())) {
                //logger.debug("Concrete SootClass " + sc.getName()
                //        + " has a multi-arg or private no-arg constructor.");
                sb.append(sc.getName() + "\n");
                containsConstructor = true;
            }
            // exclude test classes with constructor that throws exception
            if (sm.isConstructor() && !sm.getExceptions().isEmpty()) {
                //logger.debug("Concrete SootClass " + sc.getName()
                //+ " has a constructor throwing exception.");
                containsConstructor = true;
            }
        }
        return containsConstructor;
        
    }
    
    private static boolean isTestCase(SootMethod sm) {
        // JUnit 3
        if (sm.getName().toLowerCase().startsWith("test") && sm.getParameterCount() == 0 && sm.getReturnType().toString() == "void") {
            //logger.debug("Test case found: " + sm.getSubSignature());
            return true;
        }

        // JUnit 4+

        List<soot.tagkit.Tag> smTags = sm.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) sm
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/junit/Test;")) {
                    //logger.debug("Test case found: " + sm.getSignature());
                    return true;
                }
            }
        }
        return false;
    }
}
