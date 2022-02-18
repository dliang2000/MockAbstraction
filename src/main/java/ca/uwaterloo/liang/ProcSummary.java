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
    
    // Imprecision Counters
    private int myMockCounter;
    
    private int myArrayMockCounter;
    
    private int myCollectionMockCounter;
    
    public ProcSummary(SootMethod aSootMethod) {
        mySootMethod = aSootMethod;
        
        mocks = emptyPossiblyMocks;
        
        myTotalInvokeExprs = emptyInvokeExprs;
        
        myInvokeExprsOnMocks = emptyInvokeExprsOnMocks;
        
        myMockCounter = 0;
        
        myArrayMockCounter = 0;
        
        myCollectionMockCounter = 0;
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
    
    public int getMockCounter() {
        return myMockCounter;
    }
    
    public void setMockCounter(int myMockCounter) {
        this.myMockCounter = myMockCounter;
    }
    
    public int getArrayMockCounter() {
        return myArrayMockCounter;
    }
    
    public void setArrayMockCounter(int myArrayMockCounter) {
        this.myArrayMockCounter = myArrayMockCounter;
    }
    
    public int getCollectionMockCounter() {
        return myCollectionMockCounter;
    }
    
    public void setCollectionMockCounter(int myCollectionMockCounter) {
        this.myCollectionMockCounter = myCollectionMockCounter;
    }
}
