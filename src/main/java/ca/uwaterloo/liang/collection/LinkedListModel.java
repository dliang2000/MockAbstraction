package ca.uwaterloo.liang.collection;

import java.util.Collection;
import java.util.LinkedList;

import soot.SootMethod;

public class LinkedListModel<E> extends LinkedList<E> implements ListModel<E>{  
    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public LinkedListModel() {
        super();
    }
    
    public LinkedListModel(Collection<? extends E> c) {
        super(c);
    }
    
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
