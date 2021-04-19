package ca.uwaterloo.liang.collection;

import java.util.Collection;
import java.util.ArrayList;

import soot.SootMethod;

public class ArrayListModel<E> extends ArrayList<E> implements ListModel<E> {
    
    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public ArrayListModel() {
        this(10);
    }
    
    public ArrayListModel(Collection<? extends E> c) {
        super(c);
    }
    
    public ArrayListModel(int initialCapacity) {
        super(initialCapacity);
    }
    
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
