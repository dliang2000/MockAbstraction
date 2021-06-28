package ca.uwaterloo.liang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import soot.PackManager;
import soot.SceneTransformer;
import soot.Transform;
import soot.options.Options;

public class Runner {
    
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
    
    public static void main(String[] args) throws IOException {
        // Perform Analysis on field mocks defined through annotation and in <init> method
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.initialTransform", new AnnotatedAndInitMockTransformer()) {
        });
        // Perform Analysis on field mocks defined in @Before methods (init() or setup())
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.preTransform", new MockAnalysisPreTransformer()) {
        });

        PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTransform", new MockAnalysisIntraprocTransformer()) {
        });

        Options.v().set_prepend_classpath(true);
        Options.v().set_verbose(true);
        Options.v().set_whole_program(true); // enable Spark whole-program analysis
        Options.v().set_output_format(1); // Output format in .jimple file
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_xml_attributes(true);
        
        Runner main = new Runner();
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
        // pd.add("-p");
        // pd.add("cg.spark");
        // pd.add("enabled:true");
        // pd.add("-p");
        // pd.add("jb");
        // pd.add("use-original-names:true");
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
}
