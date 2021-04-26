package org.apache.commons.collections4;

public class RootDriver {
	public static void main(String[] argv) {
		org.apache.commons.collections4.set.Driver class1 = new org.apache.commons.collections4.set.Driver();
		class1.runall();
		org.apache.commons.collections4.map.Driver class2 = new org.apache.commons.collections4.map.Driver();
		class2.runall();
		org.apache.commons.collections4.sequence.Driver class3 = new org.apache.commons.collections4.sequence.Driver();
		class3.runall();
		org.apache.commons.collections4.splitmap.Driver class4 = new org.apache.commons.collections4.splitmap.Driver();
		class4.runall();
		org.apache.commons.collections4.keyvalue.Driver class5 = new org.apache.commons.collections4.keyvalue.Driver();
		class5.runall();
		org.apache.commons.collections4.functors.Driver class6 = new org.apache.commons.collections4.functors.Driver();
		class6.runall();
		org.apache.commons.collections4.collection.Driver class7 = new org.apache.commons.collections4.collection.Driver();
		class7.runall();
		org.apache.commons.collections4.queue.Driver class8 = new org.apache.commons.collections4.queue.Driver();
		class8.runall();
		org.apache.commons.collections4.multimap.Driver class9 = new org.apache.commons.collections4.multimap.Driver();
		class9.runall();
		org.apache.commons.collections4.properties.Driver class10 = new org.apache.commons.collections4.properties.Driver();
		class10.runall();
		org.apache.commons.collections4.bidimap.Driver class11 = new org.apache.commons.collections4.bidimap.Driver();
		class11.runall();
		org.apache.commons.collections4.junit.Driver class12 = new org.apache.commons.collections4.junit.Driver();
		class12.runall();
		org.apache.commons.collections4.bag.Driver class13 = new org.apache.commons.collections4.bag.Driver();
		class13.runall();
		org.apache.commons.collections4.multiset.Driver class14 = new org.apache.commons.collections4.multiset.Driver();
		class14.runall();
		org.apache.commons.collections4.comparators.Driver class15 = new org.apache.commons.collections4.comparators.Driver();
		class15.runall();
		org.apache.commons.collections4.iterators.Driver class16 = new org.apache.commons.collections4.iterators.Driver();
		class16.runall();
		org.apache.commons.collections4.trie.Driver class17 = new org.apache.commons.collections4.trie.Driver();
		class17.runall();
		org.apache.commons.collections4.list.Driver class18 = new org.apache.commons.collections4.list.Driver();
		class18.runall();
		org.apache.commons.collections4.ClosureUtilsTest class19 = new org.apache.commons.collections4.ClosureUtilsTest();
		class19.testExceptionClosure();
		class19.testNopClosure();
		class19.testInvokeClosure();
		class19.testForClosure();
		class19.testWhileClosure();
		class19.testDoWhileClosure();
		class19.testChainedClosure();
		class19.testIfClosure();
		class19.testSwitchClosure();
		class19.testSwitchMapClosure();
		class19.testTransformerClosure();
		class19.testSingletonPatternInSerialization();
		org.apache.commons.collections4.CollectionUtilsTest class20 = new org.apache.commons.collections4.CollectionUtilsTest();
		class20.setUp();
		class20.getCardinalityMap();
		class20.cardinality();
		class20.cardinalityOfNull();
		class20.containsAll();
		class20.containsAnyInCollection();
		class20.containsAnyInArray();
		class20.union();
		class20.intersection();
		class20.disjunction();
		class20.testDisjunctionAsUnionMinusIntersection();
		class20.testDisjunctionAsSymmetricDifference();
		class20.testSubtract();
		class20.testSubtractWithPredicate();
		class20.testIsSubCollectionOfSelf();
		class20.testIsSubCollection();
		class20.testIsSubCollection2();
		class20.testIsEqualCollectionToSelf();
		class20.testIsEqualCollection();
		class20.testIsEqualCollectionReturnsFalse();
		class20.testIsEqualCollection2();
		class20.testIsEqualCollectionEquator();
		class20.testIsEqualCollectionNullEquator();
		class20.testIsProperSubCollection();
		class20.find();
		class20.forAllDoCollection();
		class20.forAllDoIterator();
		class20.forAllDoFailure();
		class20.forAllButLastDoCollection();
		class20.forAllButLastDoIterator();
		class20.getFromMap();
		try {
			class20.getFromList();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class20.getFromIterator();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class20.getFromEnumeration();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class20.getFromIterable();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class20.getFromObjectArray();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class20.getFromPrimitiveArray();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class20.getFromObject();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class20.testSize_List();
		class20.testSize_Map();
		class20.testSize_Array();
		class20.testSize_PrimitiveArray();
		class20.testSize_Enumeration();
		class20.testSize_Iterator();
		class20.testSize_Other();
		class20.testSizeIsEmpty_Null();
		class20.testSizeIsEmpty_List();
		class20.testSizeIsEmpty_Map();
		class20.testSizeIsEmpty_Array();
		class20.testSizeIsEmpty_PrimitiveArray();
		class20.testSizeIsEmpty_Enumeration();
		class20.testSizeIsEmpty_Iterator();
		class20.testSizeIsEmpty_Other();
		class20.testIsEmptyWithEmptyCollection();
		class20.testIsEmptyWithNonEmptyCollection();
		class20.testIsEmptyWithNull();
		class20.testIsNotEmptyWithEmptyCollection();
		class20.testIsNotEmptyWithNonEmptyCollection();
		class20.testIsNotEmptyWithNull();
		class20.filter();
		try {
			class20.filterNullParameters();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		class20.filterInverse();
		try {
			class20.filterInverseNullParameters();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		class20.countMatches();
		class20.exists();
		class20.select();
		class20.selectWithOutputCollections();
		class20.selectRejected();
		class20.collect();
		class20.transform1();
		class20.transform2();
		class20.addIgnoreNull();
		class20.predicatedCollection();
		class20.isFull();
		class20.isEmpty();
		class20.maxSize();
		class20.intersectionUsesMethodEquals();
		class20.testRetainAll();
		class20.testRemoveAll();
		class20.testTransformedCollection();
		class20.testTransformedCollection_2();
		class20.testSynchronizedCollection();
		class20.testUnmodifiableCollection();
		try {
			class20.emptyCollection();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class20.emptyIfNull();
		class20.addAllForIterable();
		class20.addAllForEnumeration();
		class20.addAllForElements();
		class20.getNegative();
		class20.getPositiveOutOfBounds();
		class20.get1();
		class20.get();
		class20.getIterator();
		class20.getEnumeration();
		class20.reverse();
		class20.extractSingleton();
		class20.collateException1();
		class20.collateException2();
		class20.testCollate();
		class20.testCollateIgnoreDuplicates();
		class20.testPermutationsWithNullCollection();
		class20.testPermutations();
		class20.testMatchesAll();
		class20.testRemoveAllWithEquator();
		class20.testRetainAllWithEquator();
		org.apache.commons.collections4.FactoryUtilsTest class21 = new org.apache.commons.collections4.FactoryUtilsTest();
		class21.testExceptionFactory();
		class21.testNullFactory();
		class21.testConstantFactoryNull();
		class21.testConstantFactoryConstant();
		class21.testPrototypeFactoryNull();
		try {
			class21.testPrototypeFactoryPublicCloneMethod();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class21.testPrototypeFactoryPublicCopyConstructor();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class21.testPrototypeFactoryPublicSerialization();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class21.testPrototypeFactoryPublicSerializationError();
		class21.testPrototypeFactoryPublicBad();
		class21.instantiateFactoryNull();
		class21.instantiateFactorySimple();
		class21.instantiateFactoryMismatch();
		class21.instantiateFactoryNoConstructor();
		class21.instantiateFactoryComplex();
		class21.testSingletonPatternInSerialization();
		org.apache.commons.collections4.EnumerationUtilsTest class22 = new org.apache.commons.collections4.EnumerationUtilsTest();
		class22.testToListWithStringTokenizer();
		class22.testToListWithHashtable();
		try {
			class22.getFromEnumeration();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.commons.collections4.ListUtilsTest class23 = new org.apache.commons.collections4.ListUtilsTest();
		class23.setUp();
		class23.testIntersectNonEmptyWithEmptyList();
		class23.testIntersectEmptyWithEmptyList();
		class23.testIntersectNonEmptySubset();
		class23.testIntersectListWithNoOverlapAndDifferentTypes();
		class23.testIntersectListWithSelf();
		class23.testIntersectionOrderInsensitivity();
		class23.testPredicatedList();
		class23.testLazyList();
		class23.testEmptyIfNull();
		class23.testDefaultIfNull();
		class23.testEquals();
		class23.testHashCode();
		class23.testRetainAll();
		class23.testRemoveAll();
		class23.testSubtract();
		class23.testSubtractNullElement();
		class23.testIndexOf();
		class23.testLongestCommonSubsequence();
		class23.testLongestCommonSubsequenceWithString();
		class23.testPartition();
		class23.testSelect();
		class23.testSelectRejected();
		org.apache.commons.collections4.PredicateUtilsTest class24 = new org.apache.commons.collections4.PredicateUtilsTest();
		class24.testExceptionPredicate();
		class24.testIsNotNullPredicate();
		class24.testIdentityPredicate();
		class24.testTruePredicate();
		class24.testFalsePredicate();
		class24.testNotPredicate();
		class24.testNotPredicateEx();
		class24.testAndPredicate();
		class24.testAndPredicateEx();
		class24.testAllPredicate();
		class24.testAllPredicateEx1();
		class24.testAllPredicateEx2();
		class24.testAllPredicateEx3();
		class24.testAllPredicateEx4();
		class24.testAllPredicateEx5();
		class24.testAllPredicateEx6();
		class24.testOrPredicate();
		class24.testOrPredicateEx();
		class24.testAnyPredicate();
		class24.testAnyPredicateEx1();
		class24.testAnyPredicateEx2();
		class24.testAnyPredicateEx3();
		class24.testAnyPredicateEx4();
		class24.testAnyPredicateEx5();
		class24.testAnyPredicateEx6();
		class24.testEitherPredicate();
		class24.testEitherPredicateEx();
		class24.testOnePredicate();
		class24.testOnePredicateEx1();
		class24.testOnePredicateEx2();
		class24.testOnePredicateEx3();
		class24.testOnePredicateEx4();
		class24.testOnePredicateEx5();
		class24.testOnePredicateEx6();
		class24.testNeitherPredicate();
		class24.testNeitherPredicateEx();
		class24.testNonePredicate();
		class24.testNonePredicateEx1();
		class24.testNonePredicateEx2();
		class24.testNonePredicateEx3();
		class24.testNonePredicateEx4();
		class24.testNonePredicateEx5();
		class24.testNonePredicateEx6();
		class24.testInstanceOfPredicate();
		class24.testUniquePredicate();
		class24.testAsPredicateTransformer();
		class24.testAsPredicateTransformerEx1();
		class24.testAsPredicateTransformerEx2();
		class24.testInvokerPredicate();
		class24.testInvokerPredicateEx1();
		class24.testInvokerPredicateEx2();
		class24.testInvokerPredicateEx3();
		class24.testInvokerPredicate2();
		class24.testInvokerPredicate2Ex1();
		class24.testInvokerPredicate2Ex2();
		class24.testInvokerPredicate2Ex3();
		class24.testNullIsExceptionPredicate();
		class24.testNullIsExceptionPredicateEx1();
		class24.testNullIsTruePredicate();
		class24.testNullIsTruePredicateEx1();
		class24.testNullIsFalsePredicate();
		class24.testNullIsFalsePredicateEx1();
		class24.testTransformedPredicate();
		class24.testSingletonPatternInSerialization();
		org.apache.commons.collections4.IterableUtilsTest class25 = new org.apache.commons.collections4.IterableUtilsTest();
		class25.setUp();
		class25.forEach();
		class25.forEachFailure();
		class25.forEachButLast();
		class25.containsWithEquator();
		class25.frequency();
		class25.frequencyOfNull();
		class25.find();
		class25.indexOf();
		class25.countMatches();
		class25.matchesAny();
		class25.matchesAll();
		try {
			class25.getFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class25.firstFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		class25.partition();
		class25.partitionMultiplePredicates();
		class25.testToString();
		class25.testToStringDelimiter();
		class25.testToStringWithNullArguments();
		org.apache.commons.collections4.MultiSetUtilsTest class26 = new org.apache.commons.collections4.MultiSetUtilsTest();
		class26.setUp();
		class26.testEmptyMultiSet();
		class26.testUnmodifiableMultiSet();
		class26.testSynchronizedMultiSet();
		class26.testPredicatedMultiSet();
		org.apache.commons.collections4.SetUtilsTest class27 = new org.apache.commons.collections4.SetUtilsTest();
		class27.difference();
		class27.disjunction();
		class27.intersection();
		class27.setUp();
		class27.testEmptyIfNull();
		class27.testEquals();
		class27.testHashCode();
		class27.testHashSet();
		class27.testNewIdentityHashSet();
		class27.testpredicatedSet();
		class27.testUnmodifiableSet();
		class27.testUnmodifiableSetWrap();
		class27.union();
		org.apache.commons.collections4.MapPerformance class28 = new org.apache.commons.collections4.MapPerformance();
		org.apache.commons.collections4.FluentIterableTest class29 = new org.apache.commons.collections4.FluentIterableTest();
		class29.setUp();
		class29.factoryMethodOf();
		class29.appendElements();
		class29.appendIterable();
		class29.collate();
		class29.collateWithComparator();
		class29.filter();
		class29.forEach();
		class29.limit();
		class29.reverse();
		class29.skip();
		class29.transform();
		class29.unique();
		class29.unmodifiable();
		class29.zip();
		class29.asEnumeration();
		class29.allMatch();
		class29.anyMatch();
		class29.isEmpty();
		class29.size();
		class29.eval();
		class29.contains();
		class29.copyInto();
		class29.iterator();
		class29.get();
		class29.toArray();
		class29.testToString();
		org.apache.commons.collections4.SplitMapUtilsTest class30 = new org.apache.commons.collections4.SplitMapUtilsTest();
		try {
			class30.setUp();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		class30.testReadableMap();
		class30.testAlreadyReadableMap();
		class30.testWritableMap();
		class30.testAlreadyWritableMap();
		org.apache.commons.collections4.MultiMapUtilsTest class31 = new org.apache.commons.collections4.MultiMapUtilsTest();
		class31.testEmptyUnmodifiableMultiValuedMap();
		class31.testTypeSafeEmptyMultiValuedMap();
		class31.testEmptyIfNull();
		class31.testIsEmptyWithEmptyMap();
		class31.testIsEmptyWithNonEmptyMap();
		class31.testIsEmptyWithNull();
		class31.testGetCollection();
		class31.testGetValuesAsList();
		class31.testGetValuesAsSet();
		class31.testGetValuesAsBag();
		org.apache.commons.collections4.QueueUtilsTest class32 = new org.apache.commons.collections4.QueueUtilsTest();
		class32.testSynchronizedQueue();
		class32.testUnmodifiableQueue();
		class32.testPredicatedQueue();
		class32.testTransformedQueue();
		class32.testEmptyQueue();
		org.apache.commons.collections4.ComparatorUtilsTest class33 = new org.apache.commons.collections4.ComparatorUtilsTest();
		class33.booleanComparator();
		class33.chainedComparator();
		class33.max();
		class33.min();
		class33.nullLowComparator();
		class33.nullHighComparator();
		org.apache.commons.collections4.TransformerUtilsTest class34 = new org.apache.commons.collections4.TransformerUtilsTest();
		class34.testExceptionTransformer();
		class34.testNullTransformer();
		class34.testNopTransformer();
		class34.testConstantTransformer();
		class34.testCloneTransformer();
		class34.testMapTransformer();
		class34.testExecutorTransformer();
		class34.testPredicateTransformer();
		class34.testFactoryTransformer();
		class34.testChainedTransformer();
		class34.testIfTransformer();
		class34.testSwitchTransformer();
		class34.testSwitchMapTransformer();
		class34.testInvokerTransformer();
		class34.testInvokerTransformer2();
		class34.testStringValueTransformer();
		class34.testInstantiateTransformerNull();
		class34.testSingletonPatternInSerialization();
		org.apache.commons.collections4.BagUtilsTest class35 = new org.apache.commons.collections4.BagUtilsTest();
		class35.testSynchronizedBag();
		class35.testUnmodifiableBag();
		class35.testPredicatedBag();
		class35.testTransformedBag();
		class35.testSynchronizedSortedBag();
		class35.testUnmodifiableSortedBag();
		class35.testPredicatedSortedBag();
		class35.testTransformedSortedBag();
		org.apache.commons.collections4.IteratorUtilsTest class36 = new org.apache.commons.collections4.IteratorUtilsTest();
		class36.setUp();
		class36.testArrayIterator();
		class36.testArrayListIterator();
		class36.testAsIterable();
		class36.testAsIterableNull();
		class36.testAsMultipleIterable();
		class36.testAsMultipleIterableNull();
		class36.testCollatedIterator();
		class36.testEmptyIterator();
		class36.testEmptyListIterator();
		class36.testEmptyMapIterator();
		class36.testEmptyOrderedIterator();
		class36.testEmptyOrderedMapIterator();
		class36.testFind();
		try {
			class36.testFirstFromIterator();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		class36.testForEach();
		class36.testForEachButLast();
		try {
			class36.testGetAtIndexFromIterator();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		class36.testGetIterator();
		class36.testIndexOf();
		class36.testNodeIterator();
		class36.testNodeListIterator();
		class36.testToArray();
		class36.testToArray2();
		class36.testToList();
		class36.testToListIterator();
		class36.testToListIteratorNull();
		class36.testUnmodifiableIteratorImmutability();
		class36.testUnmodifiableIteratorIteration();
		class36.testUnmodifiableListIteratorImmutability();
		class36.testUnmodifiableListIteratorIteration();
		org.apache.commons.collections4.TrieUtilsTest class37 = new org.apache.commons.collections4.TrieUtilsTest();
		class37.testUnmodifiableTrie();
	}
}