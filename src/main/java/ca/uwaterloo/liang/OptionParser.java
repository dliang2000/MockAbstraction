package ca.uwaterloo.liang;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class OptionParser {
    
    @Parameter(names={"--driver", "-d"}, required = true, description="driver class path for the test suite") 
    String driver;
    
    @Parameter(names={"--target", "-t"}, required = true, description="target path") 
    String target;
    
    @Parameter(names={"--target-tests", "-tt"}, required = true, description="target tests path") 
    String target_tests;
    
    @Parameter(names={"--mvn-dependencies", "-m"}, required = true, description="maven dependencies") 
    String mvn_dependencies;
    
    @Parameter(names={"--verbose", "-v"}, description="verbose mode") 
    boolean verbose = false;
    
    public static void main(String[] argv) throws Exception {    
        OptionParser main = new OptionParser();
        JCommander.newBuilder()
            .addObject(main)
            .build()
            .parse(argv);
        main.run();
    }

    public void run() {
        System.out.println("driver: " + driver);
        System.out.println("target path: " + target);
        System.out.println("target-tests path: " + target_tests);
        System.out.println("mvn-dependencies: " + mvn_dependencies);
        if (verbose) {
            System.out.println("verbose mode : " + verbose);
        }
    }
}
