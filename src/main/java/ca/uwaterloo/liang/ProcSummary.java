package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import soot.Local;
import soot.SootMethod;
import soot.Unit;
import soot.jimple.InvokeExpr;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;

public class ProcSummary {
    
    private static HashMap<Unit, HashMap<Local, MockStatus>> emptyPossiblyMocks = new HashMap<Unit, HashMap<Local, MockStatus>>();
    
    private static ArrayList<InvokeExpr> emptyInvokeExprs = new ArrayList<InvokeExpr>();
    
    private static ArrayList<InvokeExpr> emptyInvokeExprsOnMocks = new ArrayList<InvokeExpr>();
    
    private HashMap<Unit, HashMap<Local, MockStatus>> mustMocks;
    //Contains all method invocations
    private ArrayList<InvokeExpr> myTotalInvokeExprs;
    //Contains all method invocations on mocks
    private ArrayList<InvokeExpr> myInvokeExprsOnMocks;
    
    private SootMethod mySootMethod;
    
    public ProcSummary(SootMethod aSootMethod) {
        mySootMethod = aSootMethod;
        
        mustMocks = (HashMap<Unit, HashMap<Local, MockStatus>>) emptyPossiblyMocks.clone();
        
        myTotalInvokeExprs = (ArrayList<InvokeExpr>) emptyInvokeExprs.clone();
        
        myInvokeExprsOnMocks = (ArrayList<InvokeExpr>) emptyInvokeExprsOnMocks.clone();
    }
    
    public SootMethod getSootMethod() {
        return mySootMethod;
    }
    
    public void setSootMethod(SootMethod mySootMethod) {
        this.mySootMethod = mySootMethod;
    }

/*    public ArrayList<SootMethod> getInvokedMethods() {
        return myInvokedMethods;
    }

    public void setInvokedMethods(ArrayList<SootMethod> myInvokedMethods) {
        this.myInvokedMethods = myInvokedMethods;
    }*/
    
    public HashMap<Unit, HashMap<Local, MockStatus>> getMustMocks() {
        return mustMocks;
    }

    public void setMustMocks(HashMap<Unit, HashMap<Local, MockStatus>> mustMocks) {
        this.mustMocks = mustMocks;
    }
    
    public ArrayList<InvokeExpr> getTotalInvokeExprs() {
        return myTotalInvokeExprs;
    }

    public void setTotalInvokeExprs(ArrayList<InvokeExpr> myTotalInvokeExprs) {
        this.myTotalInvokeExprs = myTotalInvokeExprs;
    }
    
    public ArrayList<InvokeExpr> getInvokeExprsOnMocks() {
        return myInvokeExprsOnMocks;
    }

    public void setInvokeExprsOnMocks(ArrayList<InvokeExpr> myInvokeExprsOnMocks) {
        this.myInvokeExprsOnMocks = myInvokeExprsOnMocks;
    }
}
