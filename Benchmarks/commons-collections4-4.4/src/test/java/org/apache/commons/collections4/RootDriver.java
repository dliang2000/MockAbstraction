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
		org.apache.commons.collections4.MapUtilsTest class20 = new org.apache.commons.collections4.MapUtilsTest();
		class20.testPredicatedMap();
		class20.testLazyMapFactory();
		class20.testLazyMapTransformer();
		class20.testInvertMap();
		class20.testPutAll_Map_array();
		class20.testConvertResourceBundle();
		class20.testDebugAndVerbosePrintCasting();
		class20.testDebugAndVerbosePrintNullMap();
		class20.testVerbosePrintNullLabel();
		class20.testDebugPrintNullLabel();
		class20.testVerbosePrintNullLabelAndMap();
		class20.testDebugPrintNullLabelAndMap();
		class20.testVerbosePrintNullStream();
		class20.testDebugPrintNullStream();
		class20.testDebugPrintNullKey();
		class20.testVerbosePrintNullKey();
		class20.testDebugPrintNullKeyToMap1();
		class20.testVerbosePrintNullKeyToMap1();
		class20.testDebugPrintNullKeyToMap2();
		class20.testVerbosePrintNullKeyToMap2();
		class20.testVerbosePrint();
		class20.testDebugPrint();
		class20.testVerbosePrintSelfReference();
		class20.testDebugPrintSelfReference();
		class20.testEmptyIfNull();
		class20.testIsEmptyWithEmptyMap();
		class20.testIsEmptyWithNonEmptyMap();
		class20.testIsEmptyWithNull();
		class20.testIsNotEmptyWithEmptyMap();
		class20.testIsNotEmptyWithNonEmptyMap();
		class20.testIsNotEmptyWithNull();
		class20.testPopulateMap();
		class20.testPopulateMultiMap();
		class20.testIterableMap();
		class20.testIterableSortedMap();
		class20.testSize0();
		class20.testSizeNull();
		class20.testSize();
		class20.testToProperties();
		class20.testToPropertiesEmpty();
		class20.testgetDoubleValue();
		class20.testgetFloatValue();
		class20.testgetLongValue();
		class20.testgetIntValue();
		class20.testgetShortValue();
		class20.testgetByteValue();
		class20.testgetNumber();
		class20.testgetString();
		class20.testgetObject();
		class20.testgetBooleanValue();
		class20.testgetMap();
		class20.testSafeAddToMap();
		class20.testOrderedMap();
		org.apache.commons.collections4.CollectionUtilsTest class21 = new org.apache.commons.collections4.CollectionUtilsTest();
		class21.setUp();
		class21.getCardinalityMap();
		class21.cardinality();
		class21.cardinalityOfNull();
		class21.containsAll();
		class21.containsAnyInCollection();
		class21.containsAnyInArray();
		class21.union();
		class21.intersection();
		class21.disjunction();
		class21.testDisjunctionAsUnionMinusIntersection();
		class21.testDisjunctionAsSymmetricDifference();
		class21.testSubtract();
		class21.testSubtractWithPredicate();
		class21.testIsSubCollectionOfSelf();
		class21.testIsSubCollection();
		class21.testIsSubCollection2();
		class21.testIsEqualCollectionToSelf();
		class21.testIsEqualCollection();
		class21.testIsEqualCollectionReturnsFalse();
		class21.testIsEqualCollection2();
		class21.testIsEqualCollectionEquator();
		class21.testIsEqualCollectionNullEquator();
		class21.testIsProperSubCollection();
		class21.find();
		class21.forAllDoCollection();
		class21.forAllDoIterator();
		class21.forAllDoFailure();
		class21.forAllButLastDoCollection();
		class21.forAllButLastDoIterator();
		class21.getFromMap();
		try {
			class21.getFromList();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class21.getFromIterator();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class21.getFromEnumeration();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class21.getFromIterable();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class21.getFromObjectArray();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class21.getFromPrimitiveArray();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class21.getFromObject();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class21.testSize_List();
		class21.testSize_Map();
		class21.testSize_Array();
		class21.testSize_PrimitiveArray();
		class21.testSize_Enumeration();
		class21.testSize_Iterator();
		class21.testSize_Other();
		class21.testSizeIsEmpty_Null();
		class21.testSizeIsEmpty_List();
		class21.testSizeIsEmpty_Map();
		class21.testSizeIsEmpty_Array();
		class21.testSizeIsEmpty_PrimitiveArray();
		class21.testSizeIsEmpty_Enumeration();
		class21.testSizeIsEmpty_Iterator();
		class21.testSizeIsEmpty_Other();
		class21.testIsEmptyWithEmptyCollection();
		class21.testIsEmptyWithNonEmptyCollection();
		class21.testIsEmptyWithNull();
		class21.testIsNotEmptyWithEmptyCollection();
		class21.testIsNotEmptyWithNonEmptyCollection();
		class21.testIsNotEmptyWithNull();
		class21.filter();
		try {
			class21.filterNullParameters();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		class21.filterInverse();
		try {
			class21.filterInverseNullParameters();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		class21.countMatches();
		class21.exists();
		class21.select();
		class21.selectWithOutputCollections();
		class21.selectRejected();
		class21.collect();
		class21.transform1();
		class21.transform2();
		class21.addIgnoreNull();
		class21.predicatedCollection();
		class21.isFull();
		class21.isEmpty();
		class21.maxSize();
		class21.intersectionUsesMethodEquals();
		class21.testRetainAll();
		class21.testRemoveAll();
		class21.testTransformedCollection();
		class21.testTransformedCollection_2();
		class21.testSynchronizedCollection();
		class21.testUnmodifiableCollection();
		try {
			class21.emptyCollection();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class21.emptyIfNull();
		class21.addAllForIterable();
		class21.addAllForEnumeration();
		class21.addAllForElements();
		class21.getNegative();
		class21.getPositiveOutOfBounds();
		class21.get1();
		class21.get();
		class21.getIterator();
		class21.getEnumeration();
		class21.reverse();
		class21.extractSingleton();
		class21.collateException1();
		class21.collateException2();
		class21.testCollate();
		class21.testCollateIgnoreDuplicates();
		class21.testPermutationsWithNullCollection();
		class21.testPermutations();
		class21.testMatchesAll();
		class21.testRemoveAllWithEquator();
		class21.testRetainAllWithEquator();
		org.apache.commons.collections4.FactoryUtilsTest class22 = new org.apache.commons.collections4.FactoryUtilsTest();
		class22.testExceptionFactory();
		class22.testNullFactory();
		class22.testConstantFactoryNull();
		class22.testConstantFactoryConstant();
		class22.testPrototypeFactoryNull();
		try {
			class22.testPrototypeFactoryPublicCloneMethod();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class22.testPrototypeFactoryPublicCopyConstructor();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class22.testPrototypeFactoryPublicSerialization();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class22.testPrototypeFactoryPublicSerializationError();
		class22.testPrototypeFactoryPublicBad();
		class22.instantiateFactoryNull();
		class22.instantiateFactorySimple();
		class22.instantiateFactoryMismatch();
		class22.instantiateFactoryNoConstructor();
		class22.instantiateFactoryComplex();
		class22.testSingletonPatternInSerialization();
		org.apache.commons.collections4.EnumerationUtilsTest class23 = new org.apache.commons.collections4.EnumerationUtilsTest();
		class23.testToListWithStringTokenizer();
		class23.testToListWithHashtable();
		try {
			class23.getFromEnumeration();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.commons.collections4.BulkTest class24 = new org.apache.commons.collections4.BulkTest();
		org.apache.commons.collections4.ListUtilsTest class25 = new org.apache.commons.collections4.ListUtilsTest();
		class25.setUp();
		class25.testIntersectNonEmptyWithEmptyList();
		class25.testIntersectEmptyWithEmptyList();
		class25.testIntersectNonEmptySubset();
		class25.testIntersectListWithNoOverlapAndDifferentTypes();
		class25.testIntersectListWithSelf();
		class25.testIntersectionOrderInsensitivity();
		class25.testPredicatedList();
		class25.testLazyFactoryList();
		class25.testLazyTransformerList();
		class25.testEmptyIfNull();
		class25.testDefaultIfNull();
		class25.testEquals();
		class25.testHashCode();
		class25.testRetainAll();
		class25.testRemoveAll();
		class25.testSubtract();
		class25.testSubtractNullElement();
		class25.testIndexOf();
		class25.testLongestCommonSubsequence();
		class25.testLongestCommonSubsequenceWithString();
		class25.testPartition();
		class25.testSelect();
		class25.testSelectRejected();
		org.apache.commons.collections4.PredicateUtilsTest class26 = new org.apache.commons.collections4.PredicateUtilsTest();
		class26.testExceptionPredicate();
		class26.testIsNotNullPredicate();
		class26.testIdentityPredicate();
		class26.testTruePredicate();
		class26.testFalsePredicate();
		class26.testNotPredicate();
		class26.testNotPredicateEx();
		class26.testAndPredicate();
		class26.testAndPredicateEx();
		class26.testAllPredicate();
		class26.testAllPredicateEx1();
		class26.testAllPredicateEx2();
		class26.testAllPredicateEx3();
		class26.testAllPredicateEx4();
		class26.testAllPredicateEx5();
		class26.testAllPredicateEx6();
		class26.testOrPredicate();
		class26.testOrPredicateEx();
		class26.testAnyPredicate();
		class26.testAnyPredicateEx1();
		class26.testAnyPredicateEx2();
		class26.testAnyPredicateEx3();
		class26.testAnyPredicateEx4();
		class26.testAnyPredicateEx5();
		class26.testAnyPredicateEx6();
		class26.testEitherPredicate();
		class26.testEitherPredicateEx();
		class26.testOnePredicate();
		class26.testOnePredicateEx1();
		class26.testOnePredicateEx2();
		class26.testOnePredicateEx3();
		class26.testOnePredicateEx4();
		class26.testOnePredicateEx5();
		class26.testOnePredicateEx6();
		class26.testNeitherPredicate();
		class26.testNeitherPredicateEx();
		class26.testNonePredicate();
		class26.testNonePredicateEx1();
		class26.testNonePredicateEx2();
		class26.testNonePredicateEx3();
		class26.testNonePredicateEx4();
		class26.testNonePredicateEx5();
		class26.testNonePredicateEx6();
		class26.testInstanceOfPredicate();
		class26.testUniquePredicate();
		class26.testAsPredicateTransformer();
		class26.testAsPredicateTransformerEx1();
		class26.testAsPredicateTransformerEx2();
		class26.testInvokerPredicate();
		class26.testInvokerPredicateEx1();
		class26.testInvokerPredicateEx2();
		class26.testInvokerPredicateEx3();
		class26.testInvokerPredicate2();
		class26.testInvokerPredicate2Ex1();
		class26.testInvokerPredicate2Ex2();
		class26.testInvokerPredicate2Ex3();
		class26.testNullIsExceptionPredicate();
		class26.testNullIsExceptionPredicateEx1();
		class26.testNullIsTruePredicate();
		class26.testNullIsTruePredicateEx1();
		class26.testNullIsFalsePredicate();
		class26.testNullIsFalsePredicateEx1();
		class26.testTransformedPredicate();
		class26.testSingletonPatternInSerialization();
		org.apache.commons.collections4.IterableUtilsTest class27 = new org.apache.commons.collections4.IterableUtilsTest();
		class27.setUp();
		class27.forEach();
		class27.forEachFailure();
		class27.forEachButLast();
		class27.containsWithEquator();
		class27.frequency();
		class27.frequencyOfNull();
		class27.find();
		class27.indexOf();
		class27.countMatches();
		class27.matchesAny();
		class27.matchesAll();
		try {
			class27.getFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class27.firstFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		class27.partition();
		class27.partitionMultiplePredicates();
		class27.testToString();
		class27.testToStringDelimiter();
		class27.testToStringWithNullArguments();
		org.apache.commons.collections4.ArrayStackTest class28 = new org.apache.commons.collections4.ArrayStackTest();
		class28.testNewStack();
		class28.testPushPeekPop();
		class28.testSearch();
		org.apache.commons.collections4.MultiSetUtilsTest class29 = new org.apache.commons.collections4.MultiSetUtilsTest();
		class29.setUp();
		class29.testEmptyMultiSet();
		class29.testUnmodifiableMultiSet();
		class29.testSynchronizedMultiSet();
		class29.testPredicatedMultiSet();
		org.apache.commons.collections4.SetUtilsTest class30 = new org.apache.commons.collections4.SetUtilsTest();
		class30.difference();
		class30.disjunction();
		class30.intersection();
		class30.setUp();
		class30.testEmptyIfNull();
		class30.testEquals();
		class30.testHashCode();
		class30.testHashSet();
		class30.testNewIdentityHashSet();
		class30.testpredicatedSet();
		class30.testUnmodifiableSet();
		class30.testUnmodifiableSetWrap();
		class30.union();
		org.apache.commons.collections4.MapPerformance class31 = new org.apache.commons.collections4.MapPerformance();
		org.apache.commons.collections4.FluentIterableTest class32 = new org.apache.commons.collections4.FluentIterableTest();
		class32.setUp();
		class32.factoryMethodOf();
		class32.appendElements();
		class32.appendIterable();
		class32.collate();
		class32.collateWithComparator();
		class32.filter();
		class32.forEach();
		class32.limit();
		class32.reverse();
		class32.skip();
		class32.transform();
		class32.unique();
		class32.unmodifiable();
		class32.zip();
		class32.asEnumeration();
		class32.allMatch();
		class32.anyMatch();
		class32.isEmpty();
		class32.size();
		class32.eval();
		class32.contains();
		class32.copyInto();
		class32.iterator();
		class32.get();
		class32.toArray();
		class32.testToString();
		org.apache.commons.collections4.BulkTestSuiteMaker class33 = new org.apache.commons.collections4.BulkTestSuiteMaker();
		org.apache.commons.collections4.SplitMapUtilsTest class34 = new org.apache.commons.collections4.SplitMapUtilsTest();
		try {
			class34.setUp();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		class34.testReadableMap();
		class34.testAlreadyReadableMap();
		class34.testWritableMap();
		class34.testAlreadyWritableMap();
		org.apache.commons.collections4.MultiMapUtilsTest class35 = new org.apache.commons.collections4.MultiMapUtilsTest();
		class35.testEmptyUnmodifiableMultiValuedMap();
		class35.testTypeSafeEmptyMultiValuedMap();
		class35.testEmptyIfNull();
		class35.testIsEmptyWithEmptyMap();
		class35.testIsEmptyWithNonEmptyMap();
		class35.testIsEmptyWithNull();
		class35.testGetCollection();
		class35.testGetValuesAsList();
		class35.testGetValuesAsSet();
		class35.testGetValuesAsBag();
		org.apache.commons.collections4.QueueUtilsTest class36 = new org.apache.commons.collections4.QueueUtilsTest();
		class36.testSynchronizedQueue();
		class36.testUnmodifiableQueue();
		class36.testPredicatedQueue();
		class36.testTransformedQueue();
		class36.testEmptyQueue();
		org.apache.commons.collections4.ComparatorUtilsTest class37 = new org.apache.commons.collections4.ComparatorUtilsTest();
		class37.booleanComparator();
		class37.chainedComparator();
		class37.max();
		class37.min();
		class37.nullLowComparator();
		class37.nullHighComparator();
		org.apache.commons.collections4.TransformerUtilsTest class38 = new org.apache.commons.collections4.TransformerUtilsTest();
		class38.testExceptionTransformer();
		class38.testNullTransformer();
		class38.testNopTransformer();
		class38.testConstantTransformer();
		class38.testCloneTransformer();
		class38.testMapTransformer();
		class38.testExecutorTransformer();
		class38.testPredicateTransformer();
		class38.testFactoryTransformer();
		class38.testChainedTransformer();
		class38.testIfTransformer();
		class38.testSwitchTransformer();
		class38.testSwitchMapTransformer();
		class38.testInvokerTransformer();
		class38.testInvokerTransformer2();
		class38.testStringValueTransformer();
		class38.testInstantiateTransformerNull();
		class38.testSingletonPatternInSerialization();
		org.apache.commons.collections4.BagUtilsTest class39 = new org.apache.commons.collections4.BagUtilsTest();
		class39.testSynchronizedBag();
		class39.testUnmodifiableBag();
		class39.testPredicatedBag();
		class39.testTransformedBag();
		class39.testSynchronizedSortedBag();
		class39.testUnmodifiableSortedBag();
		class39.testPredicatedSortedBag();
		class39.testTransformedSortedBag();
		org.apache.commons.collections4.IteratorUtilsTest class40 = new org.apache.commons.collections4.IteratorUtilsTest();
		class40.setUp();
		class40.testArrayIterator();
		class40.testArrayListIterator();
		class40.testAsIterable();
		class40.testAsIterableNull();
		class40.testAsMultipleIterable();
		class40.testAsMultipleIterableNull();
		class40.testCollatedIterator();
		class40.testEmptyIterator();
		class40.testEmptyListIterator();
		class40.testEmptyMapIterator();
		class40.testEmptyOrderedIterator();
		class40.testEmptyOrderedMapIterator();
		class40.testFind();
		try {
			class40.testFirstFromIterator();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		class40.testForEach();
		class40.testForEachButLast();
		try {
			class40.testGetAtIndexFromIterator();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		class40.testGetIterator();
		class40.testIndexOf();
		class40.testNodeIterator();
		class40.testNodeListIterator();
		class40.testToArray();
		class40.testToArray2();
		class40.testToList();
		class40.testToListIterator();
		class40.testToListIteratorNull();
		class40.testUnmodifiableIteratorImmutability();
		class40.testUnmodifiableIteratorIteration();
		class40.testUnmodifiableListIteratorImmutability();
		class40.testUnmodifiableListIteratorIteration();
		org.apache.commons.collections4.TrieUtilsTest class41 = new org.apache.commons.collections4.TrieUtilsTest();
		class41.testUnmodifiableTrie();
	}
}