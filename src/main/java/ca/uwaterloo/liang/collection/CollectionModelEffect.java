package ca.uwaterloo.liang.collection;

import java.util.*;
public enum CollectionModelEffect {
    PUT (new ArrayList<String> (Arrays.asList("boolean add(java.lang.Object)",
                                               "void add(int,java.lang.Object)",
                                               "java.lang.Object set(int,java.lang.Object)",
                                               "void addFirst(java.lang.Object)",
                                               "void addLast(java.lang.Object)"))),
    
    
    GET (new ArrayList<String> (Arrays.asList("java.lang.Object get(int)",
                                                "java.lang.Object getFirst()",
                                                "java.lang.Object getLast()"))),
    
    
    VECTOR_PUT (new ArrayList<String> (Arrays.asList("void setElementAt(java.lang.Object,int)",
                                                      "void insertElementAt(java.lang.Object,int)",
                                                      "void addElement(java.lang.Object)",
                                                      "void <init>(java.util.Collection)"))),
    
    VECTOR_GET (new ArrayList<String> (Arrays.asList("java.lang.Object elementAt(int)",
                                                       "java.lang.Object firstElement()",
                                                       "java.lang.Object lastElement()"))),
    
    QUEUE_PUT (new ArrayList<String> (Arrays.asList("boolean offer(java.lang.Object)"))),
    
    QUEUE_GET (new ArrayList<String> (Arrays.asList("java.lang.Object element()",
                                                      "java.lang.Object remove()",
                                                      "java.lang.Object peek()",
                                                      "java.lang.Object poll()"))),
    
    DEQUE_PUT (new ArrayList<String> (Arrays.asList("void addFirst(java.lang.Object)",
                                                     "void addLast(java.lang.Object)",
                                                     "boolean offerFirst(java.lang.Object)",
                                                     "boolean offerLast(java.lang.Object)",
                                                     "void push(java.lang.Object)"))),
    
    DEQUE_GET (new ArrayList<String> (Arrays.asList("java.lang.Object removeFirst()",
                                                      "java.lang.Object removeLast()",
                                                      "java.lang.Object pollFirst()",
                                                      "java.lang.Object pollLast()",
                                                      "java.lang.Object getFirst()",
                                                      "java.lang.Object getLast()",
                                                      "java.lang.Object peekFirst()",
                                                      "java.lang.Object peekLast()",
                                                      "java.lang.Object pop()"))),
    
    ITERATOR (new ArrayList<String> (Arrays.asList("java.util.Iterator iterator()",
                                                        "java.util.ListIterator listIterator()",
                                                        "java.util.ListIterator listIterator(int)",
                                                        "java.util.List subList(int,int)",
                                                        "java.util.Iterator descendingIterator()"))),

    ITERATOR_GET (new ArrayList<String> (Arrays.asList("java.lang.Object next()",
                                                         "java.lang.Object previous()"))),
    
    ENUMERATION (new ArrayList<String> (Arrays.asList("void setElementAt(java.lang.Object,int)",
                                                           "void insertElementAt(java.lang.Object,int)",
                                                           "void addElement(java.lang.Object)",
                                                           "java.util.Enumeration elements()"))),

    ENUMERATION_GET (new ArrayList<String> (Arrays.asList("java.lang.Object nextElement()"))),
    
    SET_ITERATOR (new ArrayList<String> (Arrays.asList("java.util.SortedSet headSet(java.lang.Object)",
                                                       "java.util.NavigableSet headSet(java.lang.Object,boolean)",
                                                       "java.util.SortedSet tailSet(java.lang.Object)",
                                                       "java.util.NavigableSet tailSet(java.lang.Object,boolean)",
                                                       "java.util.NavigableSet subSet(java.lang.Object,boolean,java.lang.Object,boolean)",
                                                       "java.util.SortedSet subSet(java.lang.Object,java.lang.Object)"))),
    
    SET_GET (new ArrayList<String> (Arrays.asList("java.lang.Object first()",
                                                       "java.lang.Object last()",
                                                       "java.lang.Object ceiling(java.lang.Object)",
                                                       "java.lang.Object floor(java.lang.Object)",
                                                       "java.lang.Object higher(java.lang.Object)",
                                                       "java.lang.Object lower(java.lang.Object)"))),
    
    ADDALL (new ArrayList<String> (Arrays.asList("boolean addAll(java.util.Collection)",
                                                           "boolean addAll(int,java.util.Collection)"))), 
    
    QUEUE_SET_ADDALL (new ArrayList<String> (Arrays.asList("void <init>(java.util.PriorityQueue)",
                                                           "void <init>(java.util.SortedSet)"))),
    
    TOARRAY (new ArrayList<String> (Arrays.asList("java.lang.Object[] toArray()",
                                                  "java.lang.Object[] toArray(java.lang.Object[])")));
    
    
    

    private final List<String> methods;

    CollectionModelEffect(List<String> methods) {
        this.methods = methods;
    }

    public List<String> getMethods() {
        return methods;
    }
}