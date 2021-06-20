package ca.uwaterloo.liang.collection;

import java.util.Collection;
import java.util.ArrayList;

import soot.SootMethod;

public class ArrayListModel<E> extends ListModel<E> {
   
    public CollectionModelEffect getEffect(SootMethod m) {
        if (m.getName().startsWith("get(")) {
            return CollectionModelEffect.GET;
        }
        if (m.getName().startsWith("add(") || m.getName().startsWith("addAll(")) {
            return CollectionModelEffect.PUT;
        }
        return null;
    }
    
}
