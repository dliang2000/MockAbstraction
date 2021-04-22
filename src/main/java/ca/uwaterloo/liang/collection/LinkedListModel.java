package ca.uwaterloo.liang.collection;

import java.util.Collection;
import java.util.LinkedList;

import soot.SootMethod;

public class LinkedListModel<E> extends ListModel<E>{  
    
    public CollectionModelEffect getEffect(SootMethod m) {
        if (m.getName().startsWith("getFirst(") || m.getName().startsWith("getLast(") 
                || m.getName().startsWith("get(")) {
            return CollectionModelEffect.READ;
        }
        if (m.getName().startsWith("add(") || m.getName().startsWith("addAll(")
                || m.getName().startsWith("addFirst(") || m.getName().startsWith("addLast(")) {
            return CollectionModelEffect.WRITE;
        }
        return null;
    }

}
