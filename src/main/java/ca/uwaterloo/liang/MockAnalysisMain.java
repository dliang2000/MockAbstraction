package ca.uwaterloo.liang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import ca.uwaterloo.liang.util.Utility;
import soot.G;
import soot.PackManager;
import soot.PointsToAnalysis;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.Transform;
import soot.Transformer;
import soot.Unit;
import soot.VoidType;
import soot.jimple.InvokeExpr;
import soot.jimple.JimpleBody;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.options.Options;
import soot.tagkit.AnnotationTag;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.Chain;

public class MockAnalysisMain extends SceneTransformer {
    
    @Parameter(names={"--benchmark", "-b"}, required = true, description="Benchmark") 
    static String benchmark;
    
    @Parameter(names={"--output", "-o"}, required = true, description="output path") 
    static String output_path;
    
    @Parameter(names={"--driver", "-d"}, required = true, description="driver class path for the test suite") 
    static String driver;
    
    @Parameter(names={"--target", "-t"}, required = true, description="target path") 
    static String target;
    
    @Parameter(names={"--target-tests", "-tt"}, required = true, description="target tests path") 
    static String target_tests;
    
    @Parameter(names={"--mvn-dependencies", "-m"}, required = true, description="maven dependencies") 
    static String mvn_dependencies;
    
    @Parameter(names={"--verbose", "-v"}, description="verbose mode") 
    boolean verbose = true;
    
    private static final Logger logger = LoggerFactory.getLogger(PackManager.class);
    public static void main(String[] args) throws IOException {
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.initialTransform", new MockAnnotationTransformer()) {
        });
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTransform", new MockAnalysisMain()) {
        });
        Options.v().set_prepend_classpath(true);
        Options.v().set_verbose(true);
        Options.v().set_whole_program(true); // enable Spark whole-program analysis
        Options.v().set_output_format(1); // Output format in .jimple file
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_xml_attributes(true);
        
        MockAnalysisMain main = new MockAnalysisMain();
        JCommander.newBuilder()
            .addObject(main)
            .build()
            .parse(args);
        
        List<String> pd = new ArrayList<>();
        pd.add("-main-class");
        pd.add(driver);
        pd.add("-process-dir");
        pd.add(target);
        pd.add("-process-dir");
        pd.add(target_tests);
        // enable Spark whole-program analysis
        pd.add("-p");
        pd.add("cg.spark");
        pd.add("enabled:true");
        pd.add("-p");
        pd.add("jb");
        pd.add("use-original-names:true");
        Options.v().set_soot_classpath(mvn_dependencies);
        //MockAnalysisMain.benchmark = args[4];
        //MockAnalysisMain.output_path = args[5];
        System.out.println("args[0]: " + driver);
        System.out.println("args[1]: " + target);
        System.out.println("args[2]: " + target_tests);
        System.out.println("args[3]: " + mvn_dependencies);
        System.out.println("args[4]: " + benchmark);
        System.out.println("args[5]: " + output_path);
        soot.Main.main(pd.toArray(new String[0]));
    }
        
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
    private HashMap<SootMethod, ProcSummary> procSummaries;
        
    /**
     * Each method mapped to its callees
     */
    private HashMap<String, ArrayList<SootMethod> > callees;
        
    private MockAnalysis myMAnalysis;
        
    public MockAnalysisMain() {
        super();
        
        procSummaries = new HashMap<SootMethod, ProcSummary>();
            
        classMethods = new HashMap<String, ArrayList<SootMethod> >();
            
        callees = new HashMap<String, ArrayList<SootMethod> >();
                
        appMethods = new ArrayList<SootMethod>();
    }


    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        int totalNumberOfTestRelatedMethods = 0;
    
        callGraph = Scene.v().getCallGraph();
     
        // get points to analysis object
        pointsToAnalysis = Scene.v().getPointsToAnalysis();
        
        //Compute summaries of all methods present in the call graph
        
        for (SootClass sc : Scene.v().getApplicationClasses()) {
            appMethods.addAll(sc.getMethods());           
            classMethods.put(sc.getName(), new ArrayList<SootMethod>(sc.getMethods()) );
        } 
        
        ProcSummary mockSummary = null;  
           
        ExceptionalUnitGraph aCfg = null;
            
        G.v().out.println("Number of methods to be analyzed: " + appMethods.size() );
        
        for (SootMethod method : appMethods) {   
            if (method.hasActiveBody() && 
                    (isBeforeMethod(method) || isTestCase(method) || isAfterMethod(method)) ) {
                totalNumberOfTestRelatedMethods++;
                JimpleBody body = (JimpleBody) method.getActiveBody();
                
                /*if (method.getDeclaringClass().getName().contains("PayRollAnnotationMockTest")) {
                    G.v().out.println(body);
                }*/
                mockSummary = new ProcSummary(method);
                
                aCfg = new ExceptionalUnitGraph(method.getActiveBody());
                
                myMAnalysis = new MockAnalysis(aCfg, method);
                myMAnalysis.updateInvocations(aCfg);
                
                mockSummary.setMustMocks( myMAnalysis.getMustMocks() );           
                
                mockSummary.setTotalInvokeExprs( myMAnalysis.getTotalInvokeExprs() );
                
                mockSummary.setInvokeExprsOnMocks( myMAnalysis.getInvokeExprsOnMocks() );
                    
                callees.put(method.getSignature(), myMAnalysis.getInvokedMethods());
                
                procSummaries.put(method, mockSummary);
            }
        }
            
        printOutput();
        
        int[] benchmark_mock_stats = calculateMockStats();
        StringBuffer msg = new StringBuffer();
        msg.append(" ====================================== \n")
        .append("Benchmark ").append(MockAnalysisMain.benchmark).append(" Mock Stats")
        .append("\n");
        msg.append("Total Number of Test/Before/After Methods: ").append(totalNumberOfTestRelatedMethods)
        .append("\n");
        msg.append("Total Number of Test/Before/After Methods with MustMock: ").append(benchmark_mock_stats[0])
        .append("\n");
        msg.append("Total Number of Test/Before/After Methods with ArrayMock in class: ").append(benchmark_mock_stats[1])
        .append("\n");
        msg.append("Total Number of Test/Before/After Methods with Collection in class: ").append(benchmark_mock_stats[2])
        .append("\n");
        G.v().out.println(msg);
        
        printMockInvocationStats();
    }
    
    private void printMockInvocationStats() {
        StringBuffer msg = new StringBuffer();
        msg.append(" ====================================== \n")
        .append(" INVOCATION STATISTICS \n\n");
        
        int total_count = 0, mocks_count = 0;
        for(SootClass nc : Scene.v().getApplicationClasses()) {
            msg.append("\n** CLASS ").append(nc.toString())
            .append("\n\n");
            
            List<SootMethod> ncM = nc.getMethods();
            
            ProcSummary pSmy = null;
            
            for(SootMethod m : ncM) {
                pSmy = procSummaries.get(m);
                if (pSmy == null) 
                    continue;
                ArrayList<InvokeExpr> totalInvokes = pSmy.getTotalInvokeExprs();
                if (!totalInvokes.isEmpty())
                    total_count += totalInvokes.size();
                
                ArrayList<InvokeExpr> invokeOnMocks = pSmy.getInvokeExprsOnMocks();
                
                if (!invokeOnMocks.isEmpty()) {
                    mocks_count += invokeOnMocks.size();
                    msg.append("\n\n========== method  ").append(m.getName()).append(" ========: \n\n");
                    msg.append("\tTotal invocations on Mocks ").append(invokeOnMocks.size()).append(" : \n\n");
                    for (InvokeExpr invkExpr : invokeOnMocks)
                       msg.append("\tInvokeExpr: ").append(invkExpr).append("\n\n");
                }
            }
        }
        //msg.append(" ====================================== \n");
        msg.append("Benchmark Overall Stats \n");
        msg.append("Total Invocations: ").append(total_count).append("\n");
        msg.append("Invocations On Mocks: ").append(mocks_count).append("\n");
        
        G.v().out.println(msg);
    }
    
    private int[] calculateMockStats() {
        int[] class_mocks = new int[3];
        int[] benchmark_mock_stats = new int[3];
                    
        for(SootClass nc : Scene.v().getApplicationClasses()) {     
            List<int[]> mockStats = Utility.gatherMocksStats(nc, procSummaries);
            StringBuffer msg = new StringBuffer();
            msg.append(" ====================================== \n")
            .append("** CLASS ").append(nc.toString())
            .append("\n");  
            class_mocks = new int[3];
            if (mockStats.isEmpty() || mockStats.size() == 0)
                continue;
            for (int[] mock : mockStats) {
                // # of methods in the class with MustMock
                class_mocks[0] += mock[0];
                // # of methods in the class with ArrayMock
                class_mocks[1] += mock[1];
                // # of methods in the class with CollectionMock
                class_mocks[2] += mock[2];
            }
            msg.append("Number of Methods with MustMock in class: ").append(class_mocks[0])
            .append("\n");
            msg.append("Number of Methods with ArrayMock in class: ").append(class_mocks[1])
            .append("\n");
            msg.append("Number of Methods with Collection in class: ").append(class_mocks[2])
            .append("\n");
            G.v().out.println(msg);
            benchmark_mock_stats[0] += class_mocks[0];
            benchmark_mock_stats[1] += class_mocks[1];
            benchmark_mock_stats[2] += class_mocks[2];
        }
        
        return benchmark_mock_stats;
    }
    
    private void printOutput() {
        StringBuffer msg = new StringBuffer();
                    
        for(SootClass nc : Scene.v().getApplicationClasses()) {     
            msg.append( Utility.printMustMocks(nc, procSummaries) );
        }   
            
        G.v().out.println(msg);
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
    
    private static boolean isAfterMethod(SootMethod sm) {
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
    
    private static boolean isTestCase(SootMethod sm) {
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
}
