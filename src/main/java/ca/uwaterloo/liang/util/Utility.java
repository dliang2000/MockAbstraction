package ca.uwaterloo.liang.util;

import java.io.FileWriter;
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
            
            if (null == pSmy) 
                continue;
            
            HashMap<Unit, HashMap<Local, MockStatus>> mocks = pSmy.getPossiblyMocks();
            
            for (Map.Entry<Unit, HashMap<Local, MockStatus>> entry : mocks.entrySet()) {
                // How to print output?
                Unit u = entry.getKey();
                HashMap<Local, MockStatus> val = entry.getValue();
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