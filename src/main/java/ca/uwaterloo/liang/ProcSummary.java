package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import soot.Local;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.InvokeExpr;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;

public class ProcSummary {
    
    private static Map<Unit, Map<Value, MockStatus>> emptyPossiblyMocks = new HashMap<Unit, Map<Value, MockStatus>>();
    
    private static ArrayList<InvokeExpr> emptyInvokeExprs = new ArrayList<InvokeExpr>();
    
    private static ArrayList<InvokeExpr> emptyInvokeExprsOnMocks = new ArrayList<InvokeExpr>();
    
    private Map<Unit, Map<Value, MockStatus>> mocks;
    //Contains all method invocations
    private ArrayList<InvokeExpr> myTotalInvokeExprs;
    //Contains all method invocations on mocks
    private ArrayList<InvokeExpr> myInvokeExprsOnMocks;
    
    private SootMethod mySootMethod;
    
    public ProcSummary(SootMethod aSootMethod) {
        mySootMethod = aSootMethod;
        
        mocks = emptyPossiblyMocks;
        
        myTotalInvokeExprs = emptyInvokeExprs;
        
        myInvokeExprsOnMocks = emptyInvokeExprsOnMocks;
    }
    
    public SootMethod getSootMethod() {
        return mySootMethod;
    }
    
    public void setSootMethod(SootMethod mySootMethod) {
        this.mySootMethod = mySootMethod;
    }

    public Map<Unit, Map<Value, MockStatus>> getMocks() {
        return mocks;
    }

    public void setMocks(Map<Unit, Map<Value, MockStatus>> mocks) {
        this.mocks = mocks;
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
