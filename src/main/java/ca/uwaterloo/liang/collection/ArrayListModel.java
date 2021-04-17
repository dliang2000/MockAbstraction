package ca.uwaterloo.liang.collection;

import java.util.Collection;
import java.util.ArrayList;

import soot.SootMethod;

public class ArrayListModel<E> extends ListModel {
    
    /**
     * Constructs a list containing the elements of the specified collection,
     * in the order they are returned by the collection's iterator.
     * The {@code ArrayListModel} instance has an initial capacity of
     * 110% the size of the specified collection.
     *
     * @param c the collection whose elements are to be placed into this list.
     * @throws NullPointerException if the specified collection is
     *     {@code null}
     */
    public ArrayListModel(Collection<? extends E> c) {
        super(c);
    }
    
    public Effect getEffect(SootMethod m) {
        if (m.getName().startsWith("get(")) {
            return Effect.READ;
        }
        if (m.getName().startsWith("add(")) {
            return Effect.WRITE;
        }
        return null;
    }
    
}
