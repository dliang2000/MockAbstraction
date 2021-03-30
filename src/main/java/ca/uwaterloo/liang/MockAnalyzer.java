package ca.uwaterloo.liang;

import java.io.*;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import soot.MethodOrMethodContext;
import soot.PackManager;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.Unit;
import soot.jimple.AssignStmt;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.Stmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.ReachableMethods;

public class MockAnalyzer {
    
    private static final Logger logger = LoggerFactory.getLogger(PackManager.class);
    
    public MockAnalyzer(MockG.Global g) {
    }
    
    public static MockAnalyzer v() {
       return MockG.v().instance_MockAnalyzer();
    }
    
    public boolean isMock(Scene scene, CallGraph cg, Unit u, MockLibrary mockLibrary) {        
        if (isWrapperMock(scene, cg, u, mockLibrary)) {
            return true;
        } else if (isImmediateMock(u)) {
            return true;
        }       
        return false;
    }
    
    
    public MockLibrary determineMockLibrary(Scene scene, List<MockLibrary> mockLibraries) {
        for (MockLibrary mock: mockLibraries) {
            if (scene.containsClass(mock.library())) {
                //logger.debug("The mocking library in the benchmark: " + mock);
                SootClass sc = scene.getSootClassUnsafe(mock.library());
                logger.debug(sc.getMethod(mock.subSignature()).getSignature());
                return mock;
            }
        }
        return null;
    }
    /**
     * 
     * @param cg
     * @param u
     * @return boolean
     * 
     * The function determines whether the unit is a mock object created via a wrapper.
     * 
     * Example: <T> T createMock(final Class<?> name) function defined 
     *          in org.apache.commons.collections4.MockTestCase 
     */
    public boolean isWrapperMock(Scene scene, CallGraph cg, Unit u, MockLibrary mockLibrary) {
        SootClass sc = scene.getSootClassUnsafe(mockLibrary.library());
        MethodOrMethodContext sm = sc.getMethod(mockLibrary.subSignature());
        Stmt s = (Stmt) u;
        if (isAssignStmtWithInvokeExpr(s)) {
            SootMethod sootMethod = s.getInvokeExpr().getMethod();
            List<MethodOrMethodContext> callbacks = new ArrayList<>();
            callbacks.add(sootMethod);
            ReachableMethods reachableMethods = new ReachableMethods(cg, callbacks.iterator());
            reachableMethods.update();
            // logger.debug(((SootMethod) method).getSignature());
            if (reachableMethods.contains(sm)) {
                logger.debug("The object is a mock created through a wrapper.");
                logger.debug("The mocking library: " + ((SootMethod) sm).getDeclaringClass().toString());
                return true;
            }
        }
        return false;
     }
    
    /**
     * 
     * @param u
     * @return
     * 
     * The function determines whether the unit is an immediate mock object. 
     */
    public boolean isImmediateMock(Unit u) {
        Stmt s = (Stmt) u;
            
        if (isAssignStmtWithInvokeExpr(s)) {
            logger.debug(s.getInvokeExpr().getMethod().getSignature());
            String declaringClassName = s.getInvokeExpr().getMethod().getDeclaringClass().toString();
            if (isMockLibrary(declaringClassName)) {
                logger.debug("The object is an immediate mock.");
                return true;
            }
        }
        return false;
    }
    
    private static boolean isAssignStmtWithInvokeExpr(Stmt s) {
        return (s instanceof AssignStmt && s.containsInvokeExpr() && s.getInvokeExpr() instanceof InstanceInvokeExpr);
    }
    
    private static boolean isMockLibrary(String declaringClassName) {
        return (declaringClassName.contains(MockLibrary.EASYMOCK.library()) || declaringClassName.contains(MockLibrary.MOCKITO.library())
                                || declaringClassName.contains(MockLibrary.POWERMOCK.library()));
    }
}
