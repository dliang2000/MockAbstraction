# Handling of Collections

Both of our analysis variants reason about Java Collections by
ascribing manually-derived semantics to Collections calls, following
the treatment outlined in SOAP paper [Chu and Lam]. Consistent with
the rest of our analysis, we collect may-information about the
mockness of objects contained in collections: our analysis could
report that a collection may contain a mock, but it will never be sure
that an object obtained from a collection is definitely a mock.

## java.util.Collection

In Java, java.util.Collection is described as "the root interface in the collection hierarchy".
This interface has accessor and mutator methods.

Mutator, handled:
* add(Object), addAll(Collection)

Accessor, handled:
* iterator(), toArray(), toArray(Object[])

Mutator, no effects on abstraction
* clear(), remove(Object), removeAll(Collection), removeIf(Predicate), retainAll(Collection)

Accessor, no need to handle
* contains(Object), containsAll(Collection), equals(Object), hashCode(), isEmpty(), size()

Accessors, not handled:
* parallelStream(), spliterator(), stream(), forEach(Consumer)

The documentation also mentions two expected constructors, one of
which is a copy-another-collection constructor.  We handle that
constructor.

Most collections implement specific subinterfaces rather than Collection,
but bags or multisets implement Collection directly. Here is the list of 
implementing classes, excluding java.util.concurrent implementations (test
cases shouldn't be concurrent).

* AbstractCollection, AbstractList, AbstractQueue,
  AbstractSequentialList, AbstractSet, ArrayDeque, ArrayList, EnumSet,
  HashSet, LinkedHashSet, LinkedList, PriorityQueue, Stack, TreeSet,
  Vector

Concurrent & others excluded.

* ArrayBlockingQueue, AttributeList, BeanContextServicesSupport,
  BeanContextSupport, ConcurrentHashMap.KeySetView,
  ConcurrentLinkedDeque, ConcurrentLinkedQueue, ConcurrentSkipListSet,
  CopyOnWriteArrayList, CopyOnWriteArraySet, DelayQueue,
  JobStateReasons, LinkedBlockingDeque, LinkedBlockingQueue,
  LinkedTransferQueue, PriorityBlockingQueue, RoleList,
  RoleUnresolvedList, SynchronousQueue

## AbstractCollection

Contains only methods in Collection, plus constructors.

## AbstractList

Accessor, handled:
* get(int), listIterator(), listIterator(int)

Mutator, handled:
* set(int, Object), add(Object), add(int,Object), addAll(int,Collection)

Accessor, handled:
* subList(int, int)

Accessor, no need to handle:
* indexOf(Object), lastIndexOf(Object), removeRange(int,int)

Mutator, no need to handle:
* remove(int)

## AbstractQueue

Accessor, handled:
* element()

Mutator, handled:
* set(int, Object), add(Object), add(int,Object), addAll(Collection)

Mutator, no need to handle:
* remove()

## AbstractSequentialList

For our purposes, identical to AbstractList.

## AbstractSet

Accessor, no need to handle:
* equals(Object), hashCode()

Mutator, no need to handle:
* removeAll(Collection)

## ArrayDeque

Mutator, handled
* addFirst(Object), addLast(Object), offerFirst(Object), offerLast(Object), offer(Object)
* removeFirst(), removeLast(), pollFirst(), pollLast(), poll()
* add(Object)
* push(Object), pop()

Mutator, no need to handle:
* removeFirstOccurrence(Object), removeLastOccurence(Object), remove(), remove(Object)

Accessor, handled:
* toArray(), toArray(T[])
* iterator()
* getFirst(), getLast(), peekFirst(), peekLast(), element(), peek()
* descendingIterator()
* clone() <- Deque.clone() specifies clone() specifically for some reason

Accessor, no need to handle: 
* size(), isEmpty(), contains(Object), clear()

Accessor, not handled:
* spliterator()

## ArrayList

No need to handle:
* ensureCapacity(int)
* replaceAll(UnaryOperator)
* sort(Comparator)
* trimToSize()

## EnumSet

Is this ever used in tests? Probably not.

## HashSet
## LinkedHashSet
## LinkedList

No methods not handled above.

## PriorityQueue

Mutator, need to handle:
* PriorityQueue(PriorityQueue), PriorityQueue(SortedSet)

No methods not handled above.

## Stack

Accessor, no need to handle:
* empty(), search(Object)

No other methods not handled above.

## TreeSet

Mutator:
* TreeSet(SortedSet)

## java.util.NavigableSet
Accessor:
* ceiling(Object), floor(Object), higher(Object), lower(Object)
* descendingSet(), 
* headSet(Object), headSet(Object, boolean)
* tailSet(Object), tailSet(Object,boolean)
* subSet(Object,boolean,Object,boolean)
* subSet(Object,Object)

## java.util.SortedSet
Accessor, need to handle:
* first(), last()

## Vector

This is not a complete list; we have some methods from above.

Mutator
* addElement(Object)
* insertElementAt(Object,int)
* setElementAt(Object,int)

Accessor
* elementAt(int), elements(), firstElement(), lastElement()

Mutator, no need to handle
* removeAllElements(), removeElement(Object), removeElementAt(int), removeIf(Predicate), removeRange(int,int), replaceAll(UnaryOperator), retainAll(Collection), setSize(), sort(Comparator), trimToSize()

Accessor, no need to handle (partial)
* indexOf(Object,int), lastIndexOf(*), size()

# java.util.Queue

Mutator:
* offer(Object)

Accessor:
* remove()
* poll()

# java.util.Set

Same methods as java.util.Collection (with more constraints on behaviours).