package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import soot.Local;
import soot.SootMethod;
import soot.Unit;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;

public class ProcSummary {
    
    private static HashMap<Unit, HashMap<Local, MockStatus>> emptyPossiblyMocks = new HashMap<Unit, HashMap<Local, MockStatus>>();
    
    private ArrayList<SootMethod> myInvokedMethods;
    private HashMap<Unit, HashMap<Local, MockStatus>> mustMocks;
    private SootMethod mySootMethod;
    
    public ProcSummary(SootMethod aSootMethod) {
        mySootMethod = aSootMethod;
        mustMocks = (HashMap<Unit, HashMap<Local, MockStatus>>) emptyPossiblyMocks.clone();
    }
    
    public SootMethod getSootMethod() {
        return mySootMethod;
    }
    
    public void setSootMethod(SootMethod mySootMethod) {
        this.mySootMethod = mySootMethod;
    }

    public ArrayList<SootMethod> getInvokedMethods() {
        return myInvokedMethods;
    }

    public void setInvokedMethods(ArrayList<SootMethod> myInvokedMethods) {
        this.myInvokedMethods = myInvokedMethods;
    }
    
    public HashMap<Unit, HashMap<Local, MockStatus>> getMustMocks() {
        return mustMocks;
    }

    public void setMustMocks(HashMap<Unit, HashMap<Local, MockStatus>> mustMocks) {
        this.mustMocks = mustMocks;
    }
    
}
