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
    
    private static HashMap<Unit, HashMap<Value, MockStatus>> emptyPossiblyMocks = new HashMap<Unit, HashMap<Value, MockStatus>>();
    
    private static ArrayList<InvokeExpr> emptyInvokeExprs = new ArrayList<InvokeExpr>();
    
    private static ArrayList<InvokeExpr> emptyInvokeExprsOnMocks = new ArrayList<InvokeExpr>();
    
    private HashMap<Unit, HashMap<Value, MockStatus>> mayMocks;
    //Contains all method invocations
    private ArrayList<InvokeExpr> myTotalInvokeExprs;
    //Contains all method invocations on mocks
    private ArrayList<InvokeExpr> myInvokeExprsOnMocks;
    
    private SootMethod mySootMethod;
    
    public ProcSummary(SootMethod aSootMethod) {
        mySootMethod = aSootMethod;
        
        mayMocks = (HashMap<Unit, HashMap<Value, MockStatus>>) emptyPossiblyMocks.clone();
        
        myTotalInvokeExprs = (ArrayList<InvokeExpr>) emptyInvokeExprs.clone();
        
        myInvokeExprsOnMocks = (ArrayList<InvokeExpr>) emptyInvokeExprsOnMocks.clone();
    }
    
    public SootMethod getSootMethod() {
        return mySootMethod;
    }
    
    public void setSootMethod(SootMethod mySootMethod) {
        this.mySootMethod = mySootMethod;
    }

    public HashMap<Unit, HashMap<Value, MockStatus>> getMayMocks() {
        return mayMocks;
    }

    public void setMayMocks(HashMap<Unit, HashMap<Value, MockStatus>> mayMocks) {
        this.mayMocks = mayMocks;
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
