package ca.uwaterloo.liang.collection;

import java.util.Collection;
import java.util.ArrayList;

import soot.SootMethod;

public class ArrayListModel<E> extends ListModel<E> {
   
    public Effect getEffect(SootMethod m) {
        if (m.getName().startsWith("get(")) {
            return Effect.READ;
        }
        if (m.getName().startsWith("add(") || m.getName().startsWith("addAll(")) {
            return Effect.WRITE;
        }
        return null;
    }
    
}
