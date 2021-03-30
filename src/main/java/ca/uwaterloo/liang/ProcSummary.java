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
    
    private static FlowSet<Local> emptyFlowSet = new ArraySparseSet();
    
    private FlowSet<Local> myMocks;
    private ArrayList<SootMethod> myInvokedMethods;
    private HashMap<Unit, HashMap<Local, Boolean>> possiblyMocks;
    private HashMap<Unit, HashMap<Local, Boolean>> mayBeCollectionMocks;
    private HashMap<Unit, HashMap<Local, Boolean>> mayBeArrayMocks;
    private SootMethod mySootMethod;
    
    public ProcSummary(SootMethod aSootMethod) {
        mySootMethod = aSootMethod;
        myMocks = emptyFlowSet.clone();
    }
    
    public FlowSet<Local> getMocks() {
        return myMocks;
    }
    
    public void setMocks(FlowSet<Local> myMocks) {
        this.myMocks = myMocks;
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
    
    public HashMap<Unit, HashMap<Local, Boolean>> getPossiblyMocks() {
        return possiblyMocks;
    }

    public void setPossiblyMocks(HashMap<Unit, HashMap<Local, Boolean>> possiblyMocks) {
        this.possiblyMocks = possiblyMocks;
    }
    
    public HashMap<Unit, HashMap<Local, Boolean>> getMayBeCollectionMocks() {
        return mayBeCollectionMocks;
    }

    public void setMayBeCollectionMocks(HashMap<Unit, HashMap<Local, Boolean>> mayBeCollectionMocks) {
        this.mayBeCollectionMocks = mayBeCollectionMocks;
    }
        
    public HashMap<Unit, HashMap<Local, Boolean>> getMayBeArrayMock() {
        return mayBeArrayMocks;
    }

    public void setMayBeArrayMock(HashMap<Unit, HashMap<Local, Boolean>> mayBeArrayMocks) {
        this.mayBeArrayMocks = mayBeArrayMocks;
    }
    
}
