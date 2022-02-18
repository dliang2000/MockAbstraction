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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import soot.PackManager;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
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
    
    @Parameter(names={"--interproc", "-i"}, description="interproc mode")
    static boolean interproc;
    
    public static void main(String[] args) throws IOException {
        Runner main = new Runner();
        JCommander.newBuilder()
            .addObject(main)
            .build()
            .parse(args);
        
        // Perform Analysis on field mocks defined through annotation and in <init> method
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.initialTransform", new AnnotatedAndInitMockTransformer()) {
        });
        // Perform Analysis on field mocks defined in @Before methods (init() or setup())
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.preTransform", new MockAnalysisPreTransformer()) {
        });
        
        List<String> pd = new ArrayList<>();
        
        Options.v().set_prepend_classpath(true);
        Options.v().set_verbose(true);
        Options.v().set_whole_program(true); // enable Spark whole-program analysis
        Options.v().set_app(true);
       
        Options.v().set_output_format(1); // Output format in .jimple file
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_xml_attributes(true);
        
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
        
        System.out.println("args[0]: " + driver);
        System.out.println("args[1]: " + target);
        System.out.println("args[2]: " + target_tests);
        System.out.println("args[3]: " + mvn_dependencies);
        System.out.println("args[4]: " + benchmark);
        System.out.println("args[5]: " + output_path);
        
        if (interproc) {
            //PackManager.v().getPack("wjtp").add(new Transform("wjtp.ifdsTransform", new MockAnalysisInterprocTransformer()));
            
            System.out.println("In interproc mode.");
            // Call-graph options
            Options.v().setPhaseOption("cg", "safe-newinstance:true");
            Options.v().setPhaseOption("cg.cha","enabled:false");
            
            // Set the main class of the application to be analysed
            //Options.v().set_main_class(driver);

            // Load the main class
            SootClass c = Scene.v().loadClass(driver, SootClass.BODIES);
            c.setApplicationClass();
            
            //for (SootMethod sc : c.getMethods()) {
            //    System.out.println(sc.getName());
            //}

            // Load the "main" method of the main class and set it as a Soot entry point
            SootMethod entryPoint = c.getMethodByName("main");
            System.out.println("Entry point: " + entryPoint.getSubSignature());
            List<SootMethod> entryPoints = new ArrayList<SootMethod>();
            entryPoints.add(entryPoint);
            Scene.v().setEntryPoints(entryPoints);
            
            PackManager.v().getPack("wjtp").add(new Transform("wjtp.ifdsTransform", new MockAnalysisInterprocTransformer()) {
            });
            
            Options.v().set_whole_program(true);

         // Enable SPARK call-graph construction
            Options.v().setPhaseOption("cg.spark", "enabled:true");
            Scene.v().loadNecessaryClasses();
            //soot.Main.v().autoSetOptions();
            Options.v().set_main_class(driver);
            PackManager.v().runPacks();
            System.out.println("CallGraph size: "  + Scene.v().getCallGraph().size());
            PackManager.v().writeOutput();
        } else {
            PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTransform", new MockAnalysisIntraprocTransformer()) {
            });
            soot.Main.main(pd.toArray(new String[0]));
        }
    }
}
