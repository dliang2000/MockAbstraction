package ca.uwaterloo.liang.util;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ca.uwaterloo.liang.MockStatus;
import ca.uwaterloo.liang.ProcSummary;

import soot.Local;
import soot.RefType;
import soot.SootClass;
import soot.SootMethod;
import soot.Type;
import soot.Unit;
import soot.Value;
import soot.toolkits.scalar.FlowSet;

public class Utility {

    public static SootClass getSootClassFromRefType(Type aRefType) 
    {
        if ( !(aRefType instanceof RefType) ) {
            return null;
        }       
        return ((RefType)aRefType).getSootClass();
    }
    
    public static boolean isJimpleDefinedVar(Value var)
    {           
        boolean yes = false;
        
        if (var instanceof Local) {
            String varName = ((Local)var).getName();
            yes = yes || varName.startsWith("$");
            yes = yes || varName.startsWith("@parameter");
            yes = yes || varName.startsWith("@this");
        }                       
        
        return yes;
    }
    
    public static List<int[]> gatherMocksStats(SootClass aClass, HashMap<SootMethod, ProcSummary> procSummaries) {
           
        List<SootMethod> ncM = aClass.getMethods();
        List<int[]> mocksStats = new ArrayList<>();
        
        ProcSummary pSmy = null;
        
        for(SootMethod m : ncM) {
            pSmy = procSummaries.get(m);
            
            if (pSmy == null) 
                continue;
            
            HashMap<Unit, HashMap<Local, MockStatus>> mocks = pSmy.getMustMocks();
            
            int[] curr_method_mock_info = new int[3];
            
            for (Map.Entry<Unit, HashMap<Local, MockStatus>> entry : mocks.entrySet()) {
                
                HashMap<Local, MockStatus> val = entry.getValue();
                                
                for (Map.Entry<Local, MockStatus> curr : val.entrySet()) {
                    Local l = curr.getKey();
                    MockStatus ms = curr.getValue();
                    if (ms.getMustMock()) {
                        curr_method_mock_info[0] = 1;
                    }
                    if (ms.getArrayMock()) {
                        curr_method_mock_info[1] = 1;
                    }
                    if (ms.getCollectionMock()) {
                        curr_method_mock_info[2] = 1;
                    }
                }
            }
            
            if (curr_method_mock_info[0] == 1 || curr_method_mock_info[1] == 1 || curr_method_mock_info[2] == 1) {
                mocksStats.add(curr_method_mock_info);
            }
        }
        
        return mocksStats;
    }
    
    public static StringBuffer printPossiblyMocks
                        (SootClass aClass, HashMap<SootMethod, ProcSummary> procSummaries) {
        StringBuffer msg = new StringBuffer();
        
        msg.append(" ====================================== \n")
           .append("** CLASS ").append(aClass.toString())
           .append("\n");       
        
        List<SootMethod> ncM = aClass.getMethods();
        
        ProcSummary pSmy = null;
        
        for(SootMethod m : ncM) {
            
            msg.append("\tmethod ").append(m.getName()).append(" : \n");
            
            pSmy = procSummaries.get(m);
            
            if (pSmy == null) 
                continue;
            
            HashMap<Unit, HashMap<Local, MockStatus>> mocks = pSmy.getMustMocks();
            
            for (Map.Entry<Unit, HashMap<Local, MockStatus>> entry : mocks.entrySet()) {
                // How to print output?
                Unit u = entry.getKey();
                msg.append("Unit: ").append(u).append("\n"); 
                
                HashMap<Local, MockStatus> val = entry.getValue();
                
                
                for (Map.Entry<Local, MockStatus> curr : val.entrySet()) {
                    Local l = curr.getKey();
                    MockStatus ms = curr.getValue();
                    
                    msg.append("Local: ").append(l).append("\n");
                    
                    if (ms.getMustMock()) {
                        msg.append("Possibly Mock: true").append("\n\n");
                    }
                    if (ms.getArrayMock()) {
                        msg.append("Array Mock: true").append("\n\n");
                    }
                    if (ms.getCollectionMock()) {
                        msg.append("Collection Mock: true").append("\n\n");
                    }
                }
            }   
            
        }

        return msg;
        
    }
    
    public static boolean isApplicationClass(SootClass aClass, Collection<SootClass> appClasses) {
        for (SootClass nClass : appClasses) {
            if (nClass.equals(aClass))
                return true;
        }
        
        return false;
    }

}