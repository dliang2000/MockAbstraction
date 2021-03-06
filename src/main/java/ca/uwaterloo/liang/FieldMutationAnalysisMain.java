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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import ca.uwaterloo.liang.util.Util;
import soot.Body;
import soot.G;
import soot.PackManager;
import soot.PointsToAnalysis;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootField;
import soot.SootMethod;
import soot.Transform;
import soot.Transformer;
import soot.Unit;
import soot.jimple.AssignStmt;
import soot.jimple.InstanceFieldRef;
import soot.jimple.InvokeExpr;
import soot.jimple.JimpleBody;
import soot.jimple.Stmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.options.Options;
import soot.tagkit.AnnotationTag;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.Chain;

public class FieldMutationAnalysisMain extends SceneTransformer {
    
    //private static String benchmark;
    //private static String output_path;
    
    @Parameter(names={"--benchmark", "-b"}, required = true, description="Benchmark") 
    static String benchmark;
    
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
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.initialTransform", new FieldMutationAnalysisMain()) {
        });
        Options.v().set_prepend_classpath(true);
        Options.v().set_verbose(true);
        Options.v().set_whole_program(true);
        Options.v().set_output_format(1); // Output format in .jimple file
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_xml_attributes(true);
        
        FieldMutationAnalysisMain main = new FieldMutationAnalysisMain();
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
        //pd.add("-p");
        //pd.add("jj.tr");
        //pd.add("enabled:true");
        Options.v().set_soot_classpath(mvn_dependencies);
        //FieldMutationAnalysisMain.benchmark = args[4];
        //FieldMutationAnalysisMain.output_path = args[5];
        System.out.println("args[0]: " + driver);
        System.out.println("args[1]: " + target);
        System.out.println("args[2]: " + target_tests);
        System.out.println("args[3]: " + mvn_dependencies);
        //System.out.println("args[4]: " + args[4]);
        //System.out.println("args[5]: " + args[5]);
        soot.Main.main(pd.toArray(new String[0]));
    }
    
    private HashMap<SootField, HashSet<SootMethod> > myFieldMap;
    
    public FieldMutationAnalysisMain() { 
        super();
        
        myFieldMap = new HashMap<SootField, HashSet<SootMethod> >();
    }
    
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        // TODO Auto-generated method stub
     // Fill the map with {Package : List<SootClass>} entries:
        Chain<SootClass> appClasses = Scene.v().getApplicationClasses();
        
        int totalFieldsInTests = 0, totalFieldsMutatedInTests = 0;
        
        for (SootClass appClass : appClasses) {
            
            // skip classes that are final or not concrete, and classes that are not public
            if (!appClass.isConcrete() || !appClass.isPublic() || appClass.getName().contains("$"))
                continue;
            
            totalFieldsInTests += appClass.getFields().size();
            List<SootMethod> myAppMethods = appClass.getMethods();
            
            for (SootMethod method : myAppMethods) {
              //logger.debug("Source Method: " + srcMethod);
                
                if (method.hasActiveBody() && Util.isTestMethod(method) ) {
                    Body body = method.getActiveBody();
                    
                    Chain units = body.getUnits();
                    List<Unit> stmtList = new ArrayList<Unit>();
                    stmtList.addAll(units);
                    
                    for (Unit u: stmtList) {
                        Stmt aStmt = (Stmt) u;
                        
                        if (aStmt instanceof AssignStmt) {
                            AssignStmt assign = (AssignStmt) aStmt;
                            if (assign.getLeftOp() instanceof InstanceFieldRef) {
                                InstanceFieldRef irf = (InstanceFieldRef) assign.getLeftOp();
                                SootField sf = irf.getField();
                                if (!myFieldMap.containsKey(sf)) { // the SootField is accessed and updated the first time;
                                    HashSet<SootMethod> sootMethodSet = new HashSet<>();
                                    sootMethodSet.add(method);
                                    myFieldMap.put(sf, sootMethodSet);
                                } else {
                                    HashSet<SootMethod> updatedSootMethodSet = myFieldMap.get(sf);
                                    updatedSootMethodSet.add(method);
                                    myFieldMap.put(sf, updatedSootMethodSet);
                                }
                            }
                        }
                    }
                }
            }
        }
        
        totalFieldsMutatedInTests += myFieldMap.entrySet().size();
        
        StringBuffer msg = new StringBuffer();
        
        msg.append(" ====================================== \n")
        .append("Benchmark ").append("\t Total # of Fields Mutated in Test Cases / Total # of Fields")
        .append("\n");
        
        msg.append(benchmark).append("\t " + totalFieldsMutatedInTests + " / " + totalFieldsInTests);
        
        G.v().out.println(msg);
        
        if (verbose) {
            printMutatedFieldDetailedInformation();
        }
    }
    
    
    private void printMutatedFieldDetailedInformation() {
        StringBuffer msg = new StringBuffer();
        
        msg.append(" \n Detailed Information: \n");
        
        for(Map.Entry<SootField, HashSet<SootMethod> > entry : myFieldMap.entrySet() ) {     
            HashSet<SootMethod> methods = entry.getValue();
            
            if (methods.size() >= 1) { // SootField is updated more than once
                SootField sf = entry.getKey();
                
                msg.append(" ====================================== \n")
                .append("** CLASS ").append(sf.getDeclaringClass().toString())
                .append("\n");  
                
                msg.append("SootField: ").append(sf.getSubSignature())
                .append("\n");
                
                for (SootMethod method : methods) {
                    msg.append("Mutated in SootMethod: ").append(method.getSubSignature())
                    .append("\n");
                }
            }
        }   
            
        G.v().out.println(msg);
    }    
}
