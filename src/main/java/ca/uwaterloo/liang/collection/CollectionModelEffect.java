package ca.uwaterloo.liang.collection;

import java.util.*;
public enum CollectionModelEffect {
    READ (new ArrayList<String> (Arrays.asList("boolean add(java.lang.Object)",
                                               "void add(int,java.lang.Object)",
                                               "java.lang.Object set(int,java.lang.Object)",
                                               "void addFirst(java.lang.Object)",
                                               "void addLast(java.lang.Object)"))),
    
    WRITE (new ArrayList<String> (Arrays.asList("java.lang.Object get(int)",
                                                "java.lang.Object getFirst()",
                                                "java.lang.Object getLast()"))),
                                                
    ADDALL (new ArrayList<String> (Arrays.asList("boolean addAll(java.util.Collection)",
                                                 "boolean addAll(int,java.util.Collection)"))),
    
    ITERATOR_READ (new ArrayList<String> (Arrays.asList("java.util.Iterator iterator()",
                                                        "java.util.ListIterator listIterator()",
                                                        "java.util.ListIterator listIterator(int)"))),
    
    ITERATOR_WRITE (new ArrayList<String> (Arrays.asList("java.lang.Object next()",
                                                        "java.lang.Object previous()"))),
    
    VECTOR_READ (new ArrayList<String> (Arrays.asList("void setElementAt(java.lang.Object,int)",
                                                      "void insertElementAt(java.lang.Object,int)",
                                                      "void addElement(java.lang.Object)"))),
    
    VECTOR_WRITE (new ArrayList<String> (Arrays.asList("java.lang.Object elementAt(int)",
                                                       "java.lang.Object firstElement()",
                                                       "java.lang.Object lastElement()"))),
    
    ENUMERATION_READ (new ArrayList<String> (Arrays.asList("void setElementAt(java.lang.Object,int)",
                                                           "void insertElementAt(java.lang.Object,int)",
                                                           "void addElement(java.lang.Object)"))),

    ENUMERATION_WRITE (new ArrayList<String> (Arrays.asList("java.lang.Object elementAt(int)",
                                                       "java.lang.Object firstElement()",
                                                       "java.lang.Object lastElement()")));
    

    private final List<String> methods;

    CollectionModelEffect(List<String> methods) {
        this.methods = methods;
    }

    public List<String> getMethods() {
        return methods;
    }
}