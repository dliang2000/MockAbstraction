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
    
    
    VECTOR_READ (new ArrayList<String> (Arrays.asList("void setElementAt(java.lang.Object,int)",
                                                      "void insertElementAt(java.lang.Object,int)",
                                                      "void addElement(java.lang.Object)"))),
    
    VECTOR_WRITE (new ArrayList<String> (Arrays.asList("java.lang.Object elementAt(int)",
                                                       "java.lang.Object firstElement()",
                                                       "java.lang.Object lastElement()"))),
    
    QUEUE_READ (new ArrayList<String> (Arrays.asList("boolean offer(java.lang.Object)"))),
    
    QUEUE_WRITE (new ArrayList<String> (Arrays.asList("java.lang.Object element()",
                                                      "java.lang.Object remove()",
                                                      "java.lang.Object peek()",
                                                      "java.lang.Object poll()"))),
    
    DEQUE_READ (new ArrayList<String> (Arrays.asList("void addFirst(java.lang.Object)",
                                                     "void addLast(java.lang.Object)",
                                                     "boolean offerFirst(java.lang.Object)",
                                                     "boolean offerLast(java.lang.Object)",
                                                     "java.lang.Object getFirst()",
                                                     "java.lang.Object getLast()",
                                                     "java.lang.Object peekFirst()",
                                                     "java.lang.Object peekLast()",
                                                     "java.lang.Object pop()"))),
    
    DEQUE_WRITE (new ArrayList<String> (Arrays.asList("java.lang.Object removeFirst()",
                                                      "java.lang.Object removeLast()",
                                                      "java.lang.Object pollFirst()",
                                                      "java.lang.Object pollLast()",
                                                      "void push(java.lang.Object)"))),
    
    ITERATOR_READ (new ArrayList<String> (Arrays.asList("java.util.Iterator iterator()",
                                                        "java.util.ListIterator listIterator()",
                                                        "java.util.ListIterator listIterator(int)",
                                                        "java.util.List subList(int,int)",
                                                        "java.util.Iterator descendingIterator()"))),

    ITERATOR_WRITE (new ArrayList<String> (Arrays.asList("java.lang.Object next()",
                                                         "java.lang.Object previous()"))),
    
    ENUMERATION_READ (new ArrayList<String> (Arrays.asList("void setElementAt(java.lang.Object,int)",
                                                           "void insertElementAt(java.lang.Object,int)",
                                                           "void addElement(java.lang.Object)"))),

    ENUMERATION_WRITE (new ArrayList<String> (Arrays.asList("java.lang.Object nextElement()"))), 
    
    ADDALL (new ArrayList<String> (Arrays.asList("boolean addAll(java.util.Collection)",
                                                 "boolean addAll(int,java.util.Collection)")));
    

    private final List<String> methods;

    CollectionModelEffect(List<String> methods) {
        this.methods = methods;
    }

    public List<String> getMethods() {
        return methods;
    }
}