package ca.uwaterloo.liang.collection;

import java.util.Collection;
import java.util.LinkedList;

import soot.SootMethod;

public class LinkedListModel<E> extends ListModel<E>{  
    
    public Effect getEffect(SootMethod m) {
        if (m.getName().startsWith("getFirst(") || m.getName().startsWith("getLast(") 
                || m.getName().startsWith("get(")) {
            return Effect.READ;
        }
        if (m.getName().startsWith("add(") || m.getName().startsWith("addAll(")
                || m.getName().startsWith("addFirst(") || m.getName().startsWith("addLast(")) {
            return Effect.WRITE;
        }
        return null;
    }

}
