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
		org.apache.commons.collections4.junit.Driver class11 = new org.apache.commons.collections4.junit.Driver();
		class11.runall();
		org.apache.commons.collections4.bidimap.Driver class12 = new org.apache.commons.collections4.bidimap.Driver();
		class12.runall();
		org.apache.commons.collections4.bag.Driver class13 = new org.apache.commons.collections4.bag.Driver();
		class13.runall();
		org.apache.commons.collections4.multiset.Driver class14 = new org.apache.commons.collections4.multiset.Driver();
		class14.runall();
		org.apache.commons.collections4.list.Driver class15 = new org.apache.commons.collections4.list.Driver();
		class15.runall();
		org.apache.commons.collections4.comparators.Driver class16 = new org.apache.commons.collections4.comparators.Driver();
		class16.runall();
		org.apache.commons.collections4.trie.Driver class17 = new org.apache.commons.collections4.trie.Driver();
		class17.runall();
		org.apache.commons.collections4.iterators.Driver class18 = new org.apache.commons.collections4.iterators.Driver();
		class18.runall();
		org.apache.commons.collections4.TransformerUtilsTest class19 = new org.apache.commons.collections4.TransformerUtilsTest();
		class19.testExceptionTransformer();
		class19.testNullTransformer();
		class19.testNopTransformer();
		class19.testConstantTransformer();
		class19.testCloneTransformer();
		class19.testMapTransformer();
		class19.testExecutorTransformer();
		class19.testPredicateTransformer();
		class19.testFactoryTransformer();
		class19.testChainedTransformer();
		class19.testIfTransformer();
		class19.testSwitchTransformer();
		class19.testSwitchMapTransformer();
		class19.testInvokerTransformer();
		class19.testInvokerTransformer2();
		class19.testStringValueTransformer();
		class19.testInstantiateTransformerNull();
		class19.testSingletonPatternInSerialization();
		org.apache.commons.collections4.BagUtilsTest class20 = new org.apache.commons.collections4.BagUtilsTest();
		class20.testSynchronizedBag();
		class20.testUnmodifiableBag();
		class20.testPredicatedBag();
		class20.testTransformedBag();
		class20.testSynchronizedSortedBag();
		class20.testUnmodifiableSortedBag();
		class20.testPredicatedSortedBag();
		class20.testTransformedSortedBag();
		org.apache.commons.collections4.MultiSetUtilsTest class21 = new org.apache.commons.collections4.MultiSetUtilsTest();
		class21.setUp();
		class21.testEmptyMultiSet();
		class21.testUnmodifiableMultiSet();
		class21.testSynchronizedMultiSet();
		class21.testPredicatedMultiSet();
		org.apache.commons.collections4.QueueUtilsTest class22 = new org.apache.commons.collections4.QueueUtilsTest();
		class22.testSynchronizedQueue();
		class22.testUnmodifiableQueue();
		class22.testPredicatedQueue();
		class22.testTransformedQueue();
		class22.testEmptyQueue();
		org.apache.commons.collections4.MapPerformance class23 = new org.apache.commons.collections4.MapPerformance();
		org.apache.commons.collections4.CollectionUtilsTest class24 = new org.apache.commons.collections4.CollectionUtilsTest();
		class24.setUp();
		class24.getCardinalityMap();
		class24.cardinality();
		class24.cardinalityOfNull();
		class24.containsAll();
		class24.containsAnyInCollection();
		class24.containsAnyInArray();
		class24.union();
		class24.intersection();
		class24.disjunction();
		class24.testDisjunctionAsUnionMinusIntersection();
		class24.testDisjunctionAsSymmetricDifference();
		class24.testSubtract();
		class24.testSubtractWithPredicate();
		class24.testIsSubCollectionOfSelf();
		class24.testIsSubCollection();
		class24.testIsSubCollection2();
		class24.testIsEqualCollectionToSelf();
		class24.testIsEqualCollection();
		class24.testIsEqualCollectionReturnsFalse();
		class24.testIsEqualCollection2();
		class24.testIsEqualCollectionEquator();
		class24.testIsEqualCollectionNullEquator();
		class24.testIsProperSubCollection();
		class24.find();
		class24.forAllDoCollection();
		class24.forAllDoIterator();
		class24.forAllDoFailure();
		class24.forAllButLastDoCollection();
		class24.forAllButLastDoIterator();
		class24.getFromMap();
		try {
			class24.getFromList();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class24.getFromIterator();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class24.getFromEnumeration();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class24.getFromIterable();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class24.getFromObjectArray();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class24.getFromPrimitiveArray();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class24.getFromObject();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class24.testSize_List();
		class24.testSize_Map();
		class24.testSize_Array();
		class24.testSize_PrimitiveArray();
		class24.testSize_Enumeration();
		class24.testSize_Iterator();
		class24.testSize_Other();
		class24.testSizeIsEmpty_Null();
		class24.testSizeIsEmpty_List();
		class24.testSizeIsEmpty_Map();
		class24.testSizeIsEmpty_Array();
		class24.testSizeIsEmpty_PrimitiveArray();
		class24.testSizeIsEmpty_Enumeration();
		class24.testSizeIsEmpty_Iterator();
		class24.testSizeIsEmpty_Other();
		class24.testIsEmptyWithEmptyCollection();
		class24.testIsEmptyWithNonEmptyCollection();
		class24.testIsEmptyWithNull();
		class24.testIsNotEmptyWithEmptyCollection();
		class24.testIsNotEmptyWithNonEmptyCollection();
		class24.testIsNotEmptyWithNull();
		class24.filter();
		try {
			class24.filterNullParameters();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		class24.filterInverse();
		try {
			class24.filterInverseNullParameters();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		class24.countMatches();
		class24.exists();
		class24.select();
		class24.selectWithOutputCollections();
		class24.selectRejected();
		class24.collect();
		class24.transform1();
		class24.transform2();
		class24.addIgnoreNull();
		class24.predicatedCollection();
		class24.isFull();
		class24.isEmpty();
		class24.maxSize();
		class24.intersectionUsesMethodEquals();
		class24.testRetainAll();
		class24.testRemoveAll();
		class24.testTransformedCollection();
		class24.testTransformedCollection_2();
		class24.testSynchronizedCollection();
		class24.testUnmodifiableCollection();
		try {
			class24.emptyCollection();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class24.emptyIfNull();
		class24.addAllForIterable();
		class24.addAllForEnumeration();
		class24.addAllForElements();
		class24.getNegative();
		class24.getPositiveOutOfBounds();
		class24.get1();
		class24.get();
		class24.getIterator();
		class24.getEnumeration();
		class24.reverse();
		class24.extractSingleton();
		class24.collateException1();
		class24.collateException2();
		class24.testCollate();
		class24.testCollateIgnoreDuplicates();
		class24.testPermutationsWithNullCollection();
		class24.testPermutations();
		class24.testMatchesAll();
		class24.testRemoveAllWithEquator();
		class24.testRetainAllWithEquator();
		org.apache.commons.collections4.FluentIterableTest class25 = new org.apache.commons.collections4.FluentIterableTest();
		class25.setUp();
		class25.factoryMethodOf();
		class25.appendElements();
		class25.appendIterable();
		class25.collate();
		class25.collateWithComparator();
		class25.filter();
		class25.forEach();
		class25.limit();
		class25.reverse();
		class25.skip();
		class25.transform();
		class25.unique();
		class25.unmodifiable();
		class25.zip();
		class25.asEnumeration();
		class25.allMatch();
		class25.anyMatch();
		class25.isEmpty();
		class25.size();
		class25.eval();
		class25.contains();
		class25.copyInto();
		class25.iterator();
		class25.get();
		class25.toArray();
		class25.testToString();
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
		org.apache.commons.collections4.ComparatorUtilsTest class27 = new org.apache.commons.collections4.ComparatorUtilsTest();
		class27.booleanComparator();
		class27.chainedComparator();
		class27.max();
		class27.min();
		class27.nullLowComparator();
		class27.nullHighComparator();
		org.apache.commons.collections4.ArrayStackTest class28 = new org.apache.commons.collections4.ArrayStackTest(null);
		class28.testNewStack();
		class28.testPushPeekPop();
		class28.testSearch();
		org.apache.commons.collections4.MapUtilsTest class29 = new org.apache.commons.collections4.MapUtilsTest(null);
		class29.testPredicatedMap();
		class29.testLazyMapFactory();
		class29.testLazyMapTransformer();
		class29.testInvertMap();
		class29.testPutAll_Map_array();
		class29.testConvertResourceBundle();
		class29.testDebugAndVerbosePrintCasting();
		class29.testDebugAndVerbosePrintNullMap();
		class29.testVerbosePrintNullLabel();
		class29.testDebugPrintNullLabel();
		class29.testVerbosePrintNullLabelAndMap();
		class29.testDebugPrintNullLabelAndMap();
		class29.testVerbosePrintNullStream();
		class29.testDebugPrintNullStream();
		class29.testDebugPrintNullKey();
		class29.testVerbosePrintNullKey();
		class29.testDebugPrintNullKeyToMap1();
		class29.testVerbosePrintNullKeyToMap1();
		class29.testDebugPrintNullKeyToMap2();
		class29.testVerbosePrintNullKeyToMap2();
		class29.testVerbosePrint();
		class29.testDebugPrint();
		class29.testVerbosePrintSelfReference();
		class29.testDebugPrintSelfReference();
		class29.testEmptyIfNull();
		class29.testIsEmptyWithEmptyMap();
		class29.testIsEmptyWithNonEmptyMap();
		class29.testIsEmptyWithNull();
		class29.testIsNotEmptyWithEmptyMap();
		class29.testIsNotEmptyWithNonEmptyMap();
		class29.testIsNotEmptyWithNull();
		class29.testPopulateMap();
		class29.testPopulateMultiMap();
		class29.testIterableMap();
		class29.testIterableSortedMap();
		class29.testSize0();
		class29.testSizeNull();
		class29.testSize();
		class29.testToProperties();
		class29.testToPropertiesEmpty();
		class29.testgetDoubleValue();
		class29.testgetFloatValue();
		class29.testgetLongValue();
		class29.testgetIntValue();
		class29.testgetShortValue();
		class29.testgetByteValue();
		class29.testgetNumber();
		class29.testgetString();
		class29.testgetObject();
		class29.testgetBooleanValue();
		class29.testgetMap();
		class29.testSafeAddToMap();
		class29.testOrderedMap();
		org.apache.commons.collections4.FactoryUtilsTest class30 = new org.apache.commons.collections4.FactoryUtilsTest();
		class30.testExceptionFactory();
		class30.testNullFactory();
		class30.testConstantFactoryNull();
		class30.testConstantFactoryConstant();
		class30.testPrototypeFactoryNull();
		try {
			class30.testPrototypeFactoryPublicCloneMethod();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class30.testPrototypeFactoryPublicCopyConstructor();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class30.testPrototypeFactoryPublicSerialization();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class30.testPrototypeFactoryPublicSerializationError();
		class30.testPrototypeFactoryPublicBad();
		class30.instantiateFactoryNull();
		class30.instantiateFactorySimple();
		class30.instantiateFactoryMismatch();
		class30.instantiateFactoryNoConstructor();
		class30.instantiateFactoryComplex();
		class30.testSingletonPatternInSerialization();
		org.apache.commons.collections4.TrieUtilsTest class31 = new org.apache.commons.collections4.TrieUtilsTest();
		class31.testUnmodifiableTrie();
		org.apache.commons.collections4.IterableUtilsTest class32 = new org.apache.commons.collections4.IterableUtilsTest();
		class32.setUp();
		class32.forEach();
		class32.forEachFailure();
		class32.forEachButLast();
		class32.containsWithEquator();
		class32.frequency();
		class32.frequencyOfNull();
		class32.find();
		class32.indexOf();
		class32.countMatches();
		class32.matchesAny();
		class32.matchesAll();
		try {
			class32.getFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class32.firstFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		class32.partition();
		class32.partitionMultiplePredicates();
		class32.testToString();
		class32.testToStringDelimiter();
		class32.testToStringWithNullArguments();
		org.apache.commons.collections4.SetUtilsTest class33 = new org.apache.commons.collections4.SetUtilsTest();
		class33.difference();
		class33.disjunction();
		class33.intersection();
		class33.setUp();
		class33.testEmptyIfNull();
		class33.testEquals();
		class33.testHashCode();
		class33.testHashSet();
		class33.testNewIdentityHashSet();
		class33.testpredicatedSet();
		class33.testUnmodifiableSet();
		class33.testUnmodifiableSetWrap();
		class33.union();
		org.apache.commons.collections4.SplitMapUtilsTest class34 = new org.apache.commons.collections4.SplitMapUtilsTest();
		try {
			class34.setUp();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		class34.testReadableMap();
		class34.testAlreadyReadableMap();
		class34.testWritableMap();
		class34.testAlreadyWritableMap();
		org.apache.commons.collections4.EnumerationUtilsTest class35 = new org.apache.commons.collections4.EnumerationUtilsTest();
		class35.testToListWithStringTokenizer();
		class35.testToListWithHashtable();
		try {
			class35.getFromEnumeration();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		org.apache.commons.collections4.MultiMapUtilsTest class36 = new org.apache.commons.collections4.MultiMapUtilsTest();
		class36.testEmptyUnmodifiableMultiValuedMap();
		class36.testTypeSafeEmptyMultiValuedMap();
		class36.testEmptyIfNull();
		class36.testIsEmptyWithEmptyMap();
		class36.testIsEmptyWithNonEmptyMap();
		class36.testIsEmptyWithNull();
		class36.testGetCollection();
		class36.testGetValuesAsList();
		class36.testGetValuesAsSet();
		class36.testGetValuesAsBag();
		org.apache.commons.collections4.IteratorUtilsTest class37 = new org.apache.commons.collections4.IteratorUtilsTest();
		class37.setUp();
		class37.testArrayIterator();
		class37.testArrayListIterator();
		class37.testAsIterable();
		class37.testAsIterableNull();
		class37.testAsMultipleIterable();
		class37.testAsMultipleIterableNull();
		class37.testCollatedIterator();
		class37.testEmptyIterator();
		class37.testEmptyListIterator();
		class37.testEmptyMapIterator();
		class37.testEmptyOrderedIterator();
		class37.testEmptyOrderedMapIterator();
		class37.testFind();
		try {
			class37.testFirstFromIterator();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		class37.testForEach();
		class37.testForEachButLast();
		try {
			class37.testGetAtIndexFromIterator();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		class37.testGetIterator();
		class37.testIndexOf();
		class37.testNodeIterator();
		class37.testNodeListIterator();
		class37.testToArray();
		class37.testToArray2();
		class37.testToList();
		class37.testToListIterator();
		class37.testToListIteratorNull();
		class37.testUnmodifiableIteratorImmutability();
		class37.testUnmodifiableIteratorIteration();
		class37.testUnmodifiableListIteratorImmutability();
		class37.testUnmodifiableListIteratorIteration();
		org.apache.commons.collections4.ListUtilsTest class38 = new org.apache.commons.collections4.ListUtilsTest();
		class38.setUp();
		class38.testIntersectNonEmptyWithEmptyList();
		class38.testIntersectEmptyWithEmptyList();
		class38.testIntersectNonEmptySubset();
		class38.testIntersectListWithNoOverlapAndDifferentTypes();
		class38.testIntersectListWithSelf();
		class38.testIntersectionOrderInsensitivity();
		class38.testPredicatedList();
		class38.testLazyFactoryList();
		class38.testLazyTransformerList();
		class38.testEmptyIfNull();
		class38.testDefaultIfNull();
		class38.testEquals();
		class38.testHashCode();
		class38.testRetainAll();
		class38.testRemoveAll();
		class38.testSubtract();
		class38.testSubtractNullElement();
		class38.testIndexOf();
		class38.testLongestCommonSubsequence();
		class38.testLongestCommonSubsequenceWithString();
		class38.testPartition();
		class38.testSelect();
		class38.testSelectRejected();
		org.apache.commons.collections4.ClosureUtilsTest class39 = new org.apache.commons.collections4.ClosureUtilsTest();
		class39.testExceptionClosure();
		class39.testNopClosure();
		class39.testInvokeClosure();
		class39.testForClosure();
		class39.testWhileClosure();
		class39.testDoWhileClosure();
		class39.testChainedClosure();
		class39.testIfClosure();
		class39.testSwitchClosure();
		class39.testSwitchMapClosure();
		class39.testTransformerClosure();
		class39.testSingletonPatternInSerialization();
	}
}