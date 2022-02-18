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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.uwaterloo.liang.util.Util;
import heros.IFDSTabulationProblem;
import heros.InterproceduralCFG;
import heros.solver.IFDSSolver;
import soot.G;
import soot.PackManager;
import soot.PointsToAnalysis;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.Timer;
import soot.Unit;
import soot.Value;
import soot.jimple.DefinitionStmt;
import soot.jimple.JimpleBody;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.jimple.toolkits.ide.JimpleIFDSSolver;
import soot.jimple.toolkits.ide.exampleproblems.IFDSReachingDefinitions;
import soot.jimple.toolkits.ide.icfg.JimpleBasedInterproceduralCFG;
import soot.options.Options;
import soot.toolkits.scalar.Pair;


public class MockAnalysisInterprocTransformer extends SceneTransformer {
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
        
    public MockAnalysisInterprocTransformer() {
        super();
        
        procSummaries = new HashMap<SootMethod, ProcSummary>();
            
        classMethods = new HashMap<String, ArrayList<SootMethod> >();
                
        appMethods = new ArrayList<SootMethod>();
    }
    
    private long startNano;
    
    public Timer interTimer = new soot.Timer();
    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        callGraph = Scene.v().getCallGraph();
        System.out.println("CallGraph size : " + callGraph.size());
        
        //Compute summaries of all methods present in the call graph
        
        for (SootClass sc : Scene.v().getApplicationClasses()) {
            if ( sc.getName().contains("RootDriver") ) {
                System.out.println("SootClass: " + sc);
                for (SootMethod method : sc.getMethods()) {
                    Iterator<Edge> edges = callGraph.edgesOutOf(method);
                    
                    while (edges.hasNext()) {
                        Edge e = edges.next();
                        
                        SootMethod targetMethod = e.getTgt().method();
                        System.out.println("Method in SootClass: " + method.getSignature());
                        System.out.println("Target Method: " + targetMethod.getSignature());
                    }
                }
            }
        }
            
            
        //Options.v().setPhaseOption("cg", "enabled:true");
        //Options.v().setPhaseOption("cg.spark", "enabled:true");
        //Options.v().setPhaseOption("cg.spark", "string-constants:true");
        //PackManager.v().getPack("cg").apply();
        /*for (SootClass sc : Scene.v().getApplicationClasses()) {
            for (SootMethod sm : sc.getMethods()) {
                if ( sm.getName().contains("testNoEmployeesIntra") ) {
                    JimpleBody body = (JimpleBody) sm.getActiveBody();
                    G.v().out.println(body);
                }
            }
        }*/
        
        InterproceduralCFG<Unit, SootMethod> icfg= new JimpleBasedInterproceduralCFG();
        
        IFDSTabulationProblem<Unit, Map<Value, MockStatus>, SootMethod, InterproceduralCFG<Unit, SootMethod>> problem = new IFDSProblem(icfg);

        IFDSSolver<Unit, Map<Value, MockStatus>, SootMethod, InterproceduralCFG<Unit, SootMethod>> 
            solver = new IFDSSolver<Unit, Map<Value, MockStatus>, SootMethod, 
                                    InterproceduralCFG<Unit, SootMethod>>(problem);  
        
        startNano = System.nanoTime();
        System.out.println("Starting solver");
        solver.solve();
        
        System.out.println("Solver done in " + (System.nanoTime() - startNano) / 10E9 + " seconds.");
        
        System.out.println("Main Method: " + Scene.v().getMainMethod().getSubSignature());
        
        for (Unit ret : Scene.v().getMainMethod().getActiveBody().getUnits()) {
            //System.out.println("Unit: " + ret.toString());
//            if (solver.ifdsResultsAt(ret).isEmpty()) {
//                System.out.println("solver has no results at Unit: " + ret.toString());
//            }
            for (Map<Value, MockStatus> map : solver.ifdsResultsAt(ret)) {
                for (Value val : map.keySet()) {
                    System.out.println("Value: " + val);
                    System.out.println("MockStatus: " + map.get(val).toString());
                }
            }
        }
    }

}
