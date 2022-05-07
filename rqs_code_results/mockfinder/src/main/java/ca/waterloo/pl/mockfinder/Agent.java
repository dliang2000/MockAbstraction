package ca.waterloo.pl.mockfinder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.instrument.Instrumentation;
/**
 * Java Agent To Track Calls Across Libraries
 * @author sruthi
 *
 */
public class Agent {
    public static void premain(String agentArgs, Instrumentation inst) {
        /* track calls across libraries 
    	MockFinder transformer = new MockFinder();
        inst.addTransformer(transformer);
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            public void run()
            {
            	try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("/calls-across-libs/libs-info-project-runner/api-surface-data/op.txt", true));
					writer.write("\nNoOfMockCalls : "+MockFinder.count);
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.gc();
            }
        }); */
    }
}
