package ca.uwaterloo.liang.collection;

import java.util.*;
public enum CollectionModelEffect {
    READ (new ArrayList<String> (Arrays.asList("add(", "addFirst(", "addLast(", "addAll("))), 
    WRITE (new ArrayList<String> (Arrays.asList("getFirst(", "getLast(", "get(")));

    private final List<String> methods;
    
    CollectionModelEffect(List<String> methods) {
        this.methods = methods;
    }
    
    public List<String> getMethods() {
        return methods;
    }
}
