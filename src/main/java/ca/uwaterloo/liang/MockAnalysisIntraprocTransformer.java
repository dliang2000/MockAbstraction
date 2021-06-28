package ca.uwaterloo.liang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import ca.uwaterloo.liang.util.Util;
import soot.G;
import soot.PackManager;
import soot.PointsToAnalysis;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.Timer;
import soot.Timers;
import soot.Transform;
import soot.Transformer;
import soot.Unit;
import soot.Value;
import soot.VoidType;
import soot.jimple.InvokeExpr;
import soot.jimple.JimpleBody;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.options.Options;
import soot.tagkit.AnnotationTag;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.Chain;

public class MockAnalysisIntraprocTransformer extends SceneTransformer {
    
    private static final Logger logger = LoggerFactory.getLogger(PackManager.class);
        
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
        
    private MockAnalysis mockAnalysis;
        
    public MockAnalysisIntraprocTransformer() {
        super();
        
        procSummaries = new HashMap<SootMethod, ProcSummary>();
            
        classMethods = new HashMap<String, ArrayList<SootMethod> >();
                
        appMethods = new ArrayList<SootMethod>();
    }
    
    private long startNano;
    
    private long finishNano;
    
    public Timer mainTimer = new soot.Timer();
    
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        mainTimer.start();
        
        int totalNumberOfTestRelatedMethods = 0, totalNumberOfHelperMethods = 0;
    
        callGraph = Scene.v().getCallGraph();
     
        // get points to analysis object
        pointsToAnalysis = Scene.v().getPointsToAnalysis();
        
        //Compute summaries of all methods present in the call graph
        
        for (SootClass sc : Scene.v().getApplicationClasses()) {
            if (!Util.isTestClass(sc))
                continue;
            
            ProcSummary mockSummary = null;  
            
            ExceptionalUnitGraph aCfg = null;
            
            for (SootMethod method : sc.getMethods()) {   
                if (method.hasActiveBody()) {
                    
                    /*JimpleBody body = (JimpleBody) method.getActiveBody();
                    if ( method.getName().contains("canCreateCompositeAnnotator") ) {
                        G.v().out.println(body);
                    }*/
                    // For testing
                    /*JimpleBody body = (JimpleBody) method.getActiveBody();
                    
                    if ( method.getDeclaringClass().getName().contains("ParametersProviderTest") ) {
                        G.v().out.println(body);
                    }*/


                    /*Iterator<Edge> edges = callGraph.edgesOutOf(method);
                    
                    while (edges.hasNext()) {
                        Edge e = edges.next();
                        
                        SootMethod targetMethod = e.getTgt().method();
                        
                        // Skip Java Library methods
                        if (targetMethod.isJavaLibraryMethod())
                            continue;
                        
                        if (!procSummaries.containsKey(targetMethod) && targetMethod.hasActiveBody()) {
                            ProcSummary targetSummary = new ProcSummary(targetMethod);
                            
                            ExceptionalUnitGraph targetCfg = new ExceptionalUnitGraph(targetMethod.getActiveBody());
                            
                            MockAnalysis targetMAnalysis = new MockAnalysis(targetCfg, targetMethod);
                            targetMAnalysis.updateInvocations(targetCfg);
                            
                            targetSummary.setMocks( targetMAnalysis.getMocks() );           
                            
                            targetSummary.setTotalInvokeExprs( targetMAnalysis.getTotalInvokeExprs() );
                            
                            targetSummary.setInvokeExprsOnMocks( targetMAnalysis.getInvokeExprsOnMocks() );
                            
                            procSummaries.put(targetMethod, targetSummary);
                            
                            
                        }
                    }*/
                    
                    mockSummary = new ProcSummary(method);
                    
                    aCfg = new ExceptionalUnitGraph(method.getActiveBody());
                    
                    mockAnalysis = new MockAnalysis(aCfg, method, false);
                    
                    mockSummary.setMocks( mockAnalysis.getMocks() );
                    
                    mockSummary.setTotalInvokeExprs( mockAnalysis.getTotalInvokeExprs() );
                    
                    mockSummary.setInvokeExprsOnMocks( mockAnalysis.getInvokeExprsOnMocks() );
                    
                    procSummaries.put(method, mockSummary);
                    
                    if ( Util.isBeforeMethod(method) || Util.isTestMethod(method) || Util.isAfterMethod(method) ) {
                        totalNumberOfTestRelatedMethods++;
                    } else {
                        totalNumberOfHelperMethods++;
                    }
                }
            }
            
            // appMethods.addAll(sc.getMethods());           
            //classMethods.put(sc.getName(), new ArrayList<SootMethod>(sc.getMethods()) );
        } 
        
       
            
        // printOutput();
        
        int[] benchmark_mock_stats = calculateMockStats();
        StringBuffer msg = new StringBuffer();
        msg.append(" ====================================== \n")
        .append("Benchmark ").append(Runner.benchmark).append(" Mock Stats")
        .append("\n");
        msg.append("Total Number of Test/Before/After Methods: ").append(totalNumberOfTestRelatedMethods)
        .append("\n");
        msg.append("Total Number of Test/Before/After Methods with May Mock: ").append(benchmark_mock_stats[0])
        .append("\n");
        msg.append("Total Number of Test/Before/After Methods with ArrayMock: ").append(benchmark_mock_stats[1])
        .append("\n");
        msg.append("Total Number of Test/Before/After Methods with Collection: ").append(benchmark_mock_stats[2])
        .append("\n");
        msg.append("Total Number of Helper Methods: ").append(totalNumberOfHelperMethods)
        .append("\n");
        msg.append("Total Number of Helper Methods with MayMock: ").append(benchmark_mock_stats[3])
        .append("\n");
        msg.append("Total Number of Helper Methods with ArrayMock: ").append(benchmark_mock_stats[4])
        .append("\n");
        msg.append("Total Number of Helper Methods with CollectionMock: ").append(benchmark_mock_stats[5])
        .append("\n");
        G.v().out.println(msg);
        
        printMockInvocationStats();
        
        printMockInvocationToFile();
        
        mainTimer.end();
        long runtime = mainTimer.getTime();
        System.out.println("" + "Soot has run MockAnalysisMainTransformer for " + runtime + " ms.");
    }
    
    private void printMockInvocationToFile() {
        List<String[]> linesToAdd = new ArrayList<>();
        
        for(SootClass nc : Scene.v().getApplicationClasses()) {
            if (!Util.isTestClass(nc))
                continue;
            
            List<SootMethod> ncM = nc.getMethods();
            
            ProcSummary pSmy = null;
            
            for(SootMethod m : ncM) {
                pSmy = procSummaries.get(m);
                if (pSmy == null) 
                    continue;
                // ArrayList<InvokeExpr> totalInvokes = pSmy.getTotalInvokeExprs();
                
                ArrayList<InvokeExpr> invokeOnMocks = pSmy.getInvokeExprsOnMocks();
                
                if (!invokeOnMocks.isEmpty()) {
                    linesToAdd.add(new String[] {nc.getName()+":", m.getSubSignature(), String.valueOf(invokeOnMocks.size())});
                }
            }
        }
        
        Collections.sort(linesToAdd, new SortStringArrayList());
        
        File outputFile = new File(Runner.output_path + "/" + Runner.benchmark + "-mock-intraprocedural-counts-soot");
        try (PrintWriter pw = new PrintWriter(outputFile)) {
            linesToAdd.stream().map(this::convertToCSV).forEach(pw::println);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    // Because the subsignature of methods could contain comma, we use tab as
    // delimiter for csv
    private String convertToCSV(String[] data) {
        return Stream.of(data).collect(Collectors.joining(" "));
    }
    
    private void printMockInvocationStats() {
        StringBuffer msg = new StringBuffer();
        msg.append(" ====================================== \n")
        .append(" INVOCATION STATISTICS \n\n");
        
        int total_count = 0, mocks_count = 0;
        for(SootClass nc : Scene.v().getApplicationClasses()) {
            if (!Util.isTestClass(nc))
                continue;
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
    
    public static HashMap<SootMethod, ProcSummary> getProcSummaries() {
        return procSummaries;
    }
    
    private int[] calculateMockStats() {
        int[] class_mocks = new int[3];
        int[] benchmark_mock_stats = new int[6];
                    
        for(SootClass nc : Scene.v().getApplicationClasses()) {
            if (!Util.isTestClass(nc))
                continue;
            List<int[]> testMockStats = Util.gatherTestMethodMocksStats(nc, procSummaries);
            
            List<int[]> helperMockStats = Util.gatherHelperMethodMocksStats(nc, procSummaries);
            
            StringBuffer msg = new StringBuffer(); 
            class_mocks = new int[3];
            if (!testMockStats.isEmpty()) {
                for (int[] testMock : testMockStats) {
                    // # of methods in the class with MustMock
                    class_mocks[0] += testMock[0];
                    // # of methods in the class with ArrayMock
                    class_mocks[1] += testMock[1];
                    // # of methods in the class with CollectionMock
                    class_mocks[2] += testMock[2];
                    
                    // Update test/before/after method stats for benchmark
                    benchmark_mock_stats[0] += testMock[0];

                    benchmark_mock_stats[1] += testMock[1];
                    
                    benchmark_mock_stats[2] += testMock[2];
                }
            }
            
            if (!helperMockStats.isEmpty()) {
                for (int[] helperMock : helperMockStats) {
                    // # of methods in the class with MustMock
                    class_mocks[0] += helperMock[0];
                    // # of methods in the class with ArrayMock
                    class_mocks[1] += helperMock[1];
                    // # of methods in the class with CollectionMock
                    class_mocks[2] += helperMock[2];
                    
                    // Update helper method stats for benchmark
                    benchmark_mock_stats[3] += helperMock[0];

                    benchmark_mock_stats[4] += helperMock[1];
                    
                    benchmark_mock_stats[5] += helperMock[2];
                }
            }
            
            if (class_mocks[0] > 0 || class_mocks[1] > 0 || class_mocks[2] > 0) {
                msg.append(" ====================================== \n")
                .append("** CLASS ").append(nc.toString())
                .append("\n"); 
                
                msg.append("Number of Methods with MayMock in class: ").append(class_mocks[0])
                .append("\n");
                msg.append("Number of Methods with ArrayMock in class: ").append(class_mocks[1])
                .append("\n");
                msg.append("Number of Methods with CollectionMock in class: ").append(class_mocks[2])
                .append("\n");
            }
            G.v().out.println(msg);
        }
        
        return benchmark_mock_stats;
    }
    
    private void printOutput() {
        StringBuffer msg = new StringBuffer();
                    
        for(SootClass nc : Scene.v().getApplicationClasses()) {     
            msg.append( Util.printMayMocks(nc, procSummaries) );
        }   
            
        G.v().out.println(msg);
    }
    
    
    class SortStringArrayList implements Comparator<String[]> {
        @Override
        public int compare(String[] a, String[] b) {
            if (a[0].equals(b[0]))
                return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        }
    }

}
