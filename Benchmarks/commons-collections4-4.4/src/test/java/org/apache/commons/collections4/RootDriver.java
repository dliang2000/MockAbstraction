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
		org.apache.commons.collections4.multiset.Driver class13 = new org.apache.commons.collections4.multiset.Driver();
		class13.runall();
		org.apache.commons.collections4.bag.Driver class14 = new org.apache.commons.collections4.bag.Driver();
		class14.runall();
		org.apache.commons.collections4.iterators.Driver class15 = new org.apache.commons.collections4.iterators.Driver();
		class15.runall();
		org.apache.commons.collections4.list.Driver class16 = new org.apache.commons.collections4.list.Driver();
		class16.runall();
		org.apache.commons.collections4.trie.Driver class17 = new org.apache.commons.collections4.trie.Driver();
		class17.runall();
		org.apache.commons.collections4.comparators.Driver class18 = new org.apache.commons.collections4.comparators.Driver();
		class18.runall();
		org.apache.commons.collections4.EnumerationUtilsTest class19 = new org.apache.commons.collections4.EnumerationUtilsTest();
		class19.testToListWithStringTokenizer();
		class19.testToListWithHashtable();
		try {
			class19.getFromEnumeration();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.commons.collections4.FluentIterableTest class20 = new org.apache.commons.collections4.FluentIterableTest();
		class20.setUp();
		class20.factoryMethodOf();
		class20.appendElements();
		class20.appendIterable();
		class20.collate();
		class20.collateWithComparator();
		class20.filter();
		class20.forEach();
		class20.limit();
		class20.reverse();
		class20.skip();
		class20.transform();
		class20.unique();
		class20.unmodifiable();
		class20.zip();
		class20.asEnumeration();
		class20.allMatch();
		class20.anyMatch();
		class20.isEmpty();
		class20.size();
		class20.eval();
		class20.contains();
		class20.copyInto();
		class20.iterator();
		class20.get();
		class20.toArray();
		class20.testToString();
		org.apache.commons.collections4.TrieUtilsTest class21 = new org.apache.commons.collections4.TrieUtilsTest();
		class21.testUnmodifiableTrie();
		org.apache.commons.collections4.CollectionUtilsTest class22 = new org.apache.commons.collections4.CollectionUtilsTest();
		class22.setUp();
		class22.getCardinalityMap();
		class22.cardinality();
		class22.cardinalityOfNull();
		class22.containsAll();
		class22.containsAnyInCollection();
		class22.containsAnyInArray();
		class22.union();
		class22.intersection();
		class22.disjunction();
		class22.testDisjunctionAsUnionMinusIntersection();
		class22.testDisjunctionAsSymmetricDifference();
		class22.testSubtract();
		class22.testSubtractWithPredicate();
		class22.testIsSubCollectionOfSelf();
		class22.testIsSubCollection();
		class22.testIsSubCollection2();
		class22.testIsEqualCollectionToSelf();
		class22.testIsEqualCollection();
		class22.testIsEqualCollectionReturnsFalse();
		class22.testIsEqualCollection2();
		class22.testIsEqualCollectionEquator();
		class22.testIsEqualCollectionNullEquator();
		class22.testIsProperSubCollection();
		class22.find();
		class22.forAllDoCollection();
		class22.forAllDoIterator();
		class22.forAllDoFailure();
		class22.forAllButLastDoCollection();
		class22.forAllButLastDoIterator();
		class22.getFromMap();
		try {
			class22.getFromList();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class22.getFromIterator();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class22.getFromEnumeration();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class22.getFromIterable();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class22.getFromObjectArray();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class22.getFromPrimitiveArray();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class22.getFromObject();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		class22.testSize_List();
		class22.testSize_Map();
		class22.testSize_Array();
		class22.testSize_PrimitiveArray();
		class22.testSize_Enumeration();
		class22.testSize_Iterator();
		class22.testSize_Other();
		class22.testSizeIsEmpty_Null();
		class22.testSizeIsEmpty_List();
		class22.testSizeIsEmpty_Map();
		class22.testSizeIsEmpty_Array();
		class22.testSizeIsEmpty_PrimitiveArray();
		class22.testSizeIsEmpty_Enumeration();
		class22.testSizeIsEmpty_Iterator();
		class22.testSizeIsEmpty_Other();
		class22.testIsEmptyWithEmptyCollection();
		class22.testIsEmptyWithNonEmptyCollection();
		class22.testIsEmptyWithNull();
		class22.testIsNotEmptyWithEmptyCollection();
		class22.testIsNotEmptyWithNonEmptyCollection();
		class22.testIsNotEmptyWithNull();
		class22.filter();
		try {
			class22.filterNullParameters();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		class22.filterInverse();
		try {
			class22.filterInverseNullParameters();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class22.countMatches();
		class22.exists();
		class22.select();
		class22.selectWithOutputCollections();
		class22.selectRejected();
		class22.collect();
		class22.transform1();
		class22.transform2();
		class22.addIgnoreNull();
		class22.predicatedCollection();
		class22.isFull();
		class22.isEmpty();
		class22.maxSize();
		class22.intersectionUsesMethodEquals();
		class22.testRetainAll();
		class22.testRemoveAll();
		class22.testTransformedCollection();
		class22.testTransformedCollection_2();
		class22.testSynchronizedCollection();
		class22.testUnmodifiableCollection();
		try {
			class22.emptyCollection();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		class22.emptyIfNull();
		class22.addAllForIterable();
		class22.addAllForEnumeration();
		class22.addAllForElements();
		class22.getNegative();
		class22.getPositiveOutOfBounds();
		class22.get1();
		class22.get();
		class22.getIterator();
		class22.getEnumeration();
		class22.reverse();
		class22.extractSingleton();
		class22.collateException1();
		class22.collateException2();
		class22.testCollate();
		class22.testCollateIgnoreDuplicates();
		class22.testPermutationsWithNullCollection();
		class22.testPermutations();
		class22.testMatchesAll();
		class22.testRemoveAllWithEquator();
		class22.testRetainAllWithEquator();
		org.apache.commons.collections4.ComparatorUtilsTest class23 = new org.apache.commons.collections4.ComparatorUtilsTest();
		class23.booleanComparator();
		class23.chainedComparator();
		class23.max();
		class23.min();
		class23.nullLowComparator();
		class23.nullHighComparator();
		org.apache.commons.collections4.QueueUtilsTest class24 = new org.apache.commons.collections4.QueueUtilsTest();
		class24.testSynchronizedQueue();
		class24.testUnmodifiableQueue();
		class24.testPredicatedQueue();
		class24.testTransformedQueue();
		class24.testEmptyQueue();
		org.apache.commons.collections4.SplitMapUtilsTest class25 = new org.apache.commons.collections4.SplitMapUtilsTest();
		try {
			class25.setUp();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		class25.testReadableMap();
		class25.testAlreadyReadableMap();
		class25.testWritableMap();
		class25.testAlreadyWritableMap();
		org.apache.commons.collections4.ClosureUtilsTest class26 = new org.apache.commons.collections4.ClosureUtilsTest();
		class26.testExceptionClosure();
		class26.testNopClosure();
		class26.testInvokeClosure();
		class26.testForClosure();
		class26.testWhileClosure();
		class26.testDoWhileClosure();
		class26.testChainedClosure();
		class26.testIfClosure();
		class26.testSwitchClosure();
		class26.testSwitchMapClosure();
		class26.testTransformerClosure();
		class26.testSingletonPatternInSerialization();
		org.apache.commons.collections4.IteratorUtilsTest class27 = new org.apache.commons.collections4.IteratorUtilsTest();
		class27.setUp();
		class27.testArrayIterator();
		class27.testArrayListIterator();
		class27.testAsIterable();
		class27.testAsIterableNull();
		class27.testAsMultipleIterable();
		class27.testAsMultipleIterableNull();
		class27.testCollatedIterator();
		class27.testEmptyIterator();
		class27.testEmptyListIterator();
		class27.testEmptyMapIterator();
		class27.testEmptyOrderedIterator();
		class27.testEmptyOrderedMapIterator();
		class27.testFind();
		try {
			class27.testFirstFromIterator();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class27.testForEach();
		class27.testForEachButLast();
		try {
			class27.testGetAtIndexFromIterator();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		class27.testGetIterator();
		class27.testIndexOf();
		class27.testNodeIterator();
		class27.testNodeListIterator();
		class27.testToArray();
		class27.testToArray2();
		class27.testToList();
		class27.testToListIterator();
		class27.testToListIteratorNull();
		class27.testUnmodifiableIteratorImmutability();
		class27.testUnmodifiableIteratorIteration();
		class27.testUnmodifiableListIteratorImmutability();
		class27.testUnmodifiableListIteratorIteration();
		org.apache.commons.collections4.MultiMapUtilsTest class28 = new org.apache.commons.collections4.MultiMapUtilsTest();
		class28.testEmptyUnmodifiableMultiValuedMap();
		class28.testTypeSafeEmptyMultiValuedMap();
		class28.testEmptyIfNull();
		class28.testIsEmptyWithEmptyMap();
		class28.testIsEmptyWithNonEmptyMap();
		class28.testIsEmptyWithNull();
		class28.testGetCollection();
		class28.testGetValuesAsList();
		class28.testGetValuesAsSet();
		class28.testGetValuesAsBag();
		org.apache.commons.collections4.PredicateUtilsTest class29 = new org.apache.commons.collections4.PredicateUtilsTest();
		class29.testExceptionPredicate();
		class29.testIsNotNullPredicate();
		class29.testIdentityPredicate();
		class29.testTruePredicate();
		class29.testFalsePredicate();
		class29.testNotPredicate();
		class29.testNotPredicateEx();
		class29.testAndPredicate();
		class29.testAndPredicateEx();
		class29.testAllPredicate();
		class29.testAllPredicateEx1();
		class29.testAllPredicateEx2();
		class29.testAllPredicateEx3();
		class29.testAllPredicateEx4();
		class29.testAllPredicateEx5();
		class29.testAllPredicateEx6();
		class29.testOrPredicate();
		class29.testOrPredicateEx();
		class29.testAnyPredicate();
		class29.testAnyPredicateEx1();
		class29.testAnyPredicateEx2();
		class29.testAnyPredicateEx3();
		class29.testAnyPredicateEx4();
		class29.testAnyPredicateEx5();
		class29.testAnyPredicateEx6();
		class29.testEitherPredicate();
		class29.testEitherPredicateEx();
		class29.testOnePredicate();
		class29.testOnePredicateEx1();
		class29.testOnePredicateEx2();
		class29.testOnePredicateEx3();
		class29.testOnePredicateEx4();
		class29.testOnePredicateEx5();
		class29.testOnePredicateEx6();
		class29.testNeitherPredicate();
		class29.testNeitherPredicateEx();
		class29.testNonePredicate();
		class29.testNonePredicateEx1();
		class29.testNonePredicateEx2();
		class29.testNonePredicateEx3();
		class29.testNonePredicateEx4();
		class29.testNonePredicateEx5();
		class29.testNonePredicateEx6();
		class29.testInstanceOfPredicate();
		class29.testUniquePredicate();
		class29.testAsPredicateTransformer();
		class29.testAsPredicateTransformerEx1();
		class29.testAsPredicateTransformerEx2();
		class29.testInvokerPredicate();
		class29.testInvokerPredicateEx1();
		class29.testInvokerPredicateEx2();
		class29.testInvokerPredicateEx3();
		class29.testInvokerPredicate2();
		class29.testInvokerPredicate2Ex1();
		class29.testInvokerPredicate2Ex2();
		class29.testInvokerPredicate2Ex3();
		class29.testNullIsExceptionPredicate();
		class29.testNullIsExceptionPredicateEx1();
		class29.testNullIsTruePredicate();
		class29.testNullIsTruePredicateEx1();
		class29.testNullIsFalsePredicate();
		class29.testNullIsFalsePredicateEx1();
		class29.testTransformedPredicate();
		class29.testSingletonPatternInSerialization();
		org.apache.commons.collections4.MultiSetUtilsTest class30 = new org.apache.commons.collections4.MultiSetUtilsTest();
		class30.setUp();
		class30.testEmptyMultiSet();
		class30.testUnmodifiableMultiSet();
		class30.testSynchronizedMultiSet();
		class30.testPredicatedMultiSet();
		org.apache.commons.collections4.MapUtilsTest class31 = new org.apache.commons.collections4.MapUtilsTest(null);
		class31.testPredicatedMap();
		class31.testLazyMapFactory();
		class31.testLazyMapTransformer();
		class31.testInvertMap();
		class31.testPutAll_Map_array();
		class31.testConvertResourceBundle();
		class31.testDebugAndVerbosePrintCasting();
		class31.testDebugAndVerbosePrintNullMap();
		class31.testVerbosePrintNullLabel();
		class31.testDebugPrintNullLabel();
		class31.testVerbosePrintNullLabelAndMap();
		class31.testDebugPrintNullLabelAndMap();
		class31.testVerbosePrintNullStream();
		class31.testDebugPrintNullStream();
		class31.testDebugPrintNullKey();
		class31.testVerbosePrintNullKey();
		class31.testDebugPrintNullKeyToMap1();
		class31.testVerbosePrintNullKeyToMap1();
		class31.testDebugPrintNullKeyToMap2();
		class31.testVerbosePrintNullKeyToMap2();
		class31.testVerbosePrint();
		class31.testDebugPrint();
		class31.testVerbosePrintSelfReference();
		class31.testDebugPrintSelfReference();
		class31.testEmptyIfNull();
		class31.testIsEmptyWithEmptyMap();
		class31.testIsEmptyWithNonEmptyMap();
		class31.testIsEmptyWithNull();
		class31.testIsNotEmptyWithEmptyMap();
		class31.testIsNotEmptyWithNonEmptyMap();
		class31.testIsNotEmptyWithNull();
		class31.testPopulateMap();
		class31.testPopulateMultiMap();
		class31.testIterableMap();
		class31.testIterableSortedMap();
		class31.testSize0();
		class31.testSizeNull();
		class31.testSize();
		class31.testToProperties();
		class31.testToPropertiesEmpty();
		class31.testgetDoubleValue();
		class31.testgetFloatValue();
		class31.testgetLongValue();
		class31.testgetIntValue();
		class31.testgetShortValue();
		class31.testgetByteValue();
		class31.testgetNumber();
		class31.testgetString();
		class31.testgetObject();
		class31.testgetBooleanValue();
		class31.testgetMap();
		class31.testSafeAddToMap();
		class31.testOrderedMap();
		org.apache.commons.collections4.FactoryUtilsTest class32 = new org.apache.commons.collections4.FactoryUtilsTest();
		class32.testExceptionFactory();
		class32.testNullFactory();
		class32.testConstantFactoryNull();
		class32.testConstantFactoryConstant();
		class32.testPrototypeFactoryNull();
		try {
			class32.testPrototypeFactoryPublicCloneMethod();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class32.testPrototypeFactoryPublicCopyConstructor();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class32.testPrototypeFactoryPublicSerialization();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		class32.testPrototypeFactoryPublicSerializationError();
		class32.testPrototypeFactoryPublicBad();
		class32.instantiateFactoryNull();
		class32.instantiateFactorySimple();
		class32.instantiateFactoryMismatch();
		class32.instantiateFactoryNoConstructor();
		class32.instantiateFactoryComplex();
		class32.testSingletonPatternInSerialization();
		org.apache.commons.collections4.ArrayStackTest class33 = new org.apache.commons.collections4.ArrayStackTest(null);
		class33.testNewStack();
		class33.testPushPeekPop();
		class33.testSearch();
		org.apache.commons.collections4.SetUtilsTest class34 = new org.apache.commons.collections4.SetUtilsTest();
		class34.difference();
		class34.disjunction();
		class34.intersection();
		class34.setUp();
		class34.testEmptyIfNull();
		class34.testEquals();
		class34.testHashCode();
		class34.testHashSet();
		class34.testNewIdentityHashSet();
		class34.testpredicatedSet();
		class34.testUnmodifiableSet();
		class34.testUnmodifiableSetWrap();
		class34.union();
		org.apache.commons.collections4.IterableUtilsTest class35 = new org.apache.commons.collections4.IterableUtilsTest();
		class35.setUp();
		class35.forEach();
		class35.forEachFailure();
		class35.forEachButLast();
		class35.containsWithEquator();
		class35.frequency();
		class35.frequencyOfNull();
		class35.find();
		class35.indexOf();
		class35.countMatches();
		class35.matchesAny();
		class35.matchesAll();
		try {
			class35.getFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class35.firstFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		class35.partition();
		class35.partitionMultiplePredicates();
		class35.testToString();
		class35.testToStringDelimiter();
		class35.testToStringWithNullArguments();
		org.apache.commons.collections4.ListUtilsTest class36 = new org.apache.commons.collections4.ListUtilsTest();
		class36.setUp();
		class36.testIntersectNonEmptyWithEmptyList();
		class36.testIntersectEmptyWithEmptyList();
		class36.testIntersectNonEmptySubset();
		class36.testIntersectListWithNoOverlapAndDifferentTypes();
		class36.testIntersectListWithSelf();
		class36.testIntersectionOrderInsensitivity();
		class36.testPredicatedList();
		class36.testLazyFactoryList();
		class36.testLazyTransformerList();
		class36.testEmptyIfNull();
		class36.testDefaultIfNull();
		class36.testEquals();
		class36.testHashCode();
		class36.testRetainAll();
		class36.testRemoveAll();
		class36.testSubtract();
		class36.testSubtractNullElement();
		class36.testIndexOf();
		class36.testLongestCommonSubsequence();
		class36.testLongestCommonSubsequenceWithString();
		class36.testPartition();
		class36.testSelect();
		class36.testSelectRejected();
		org.apache.commons.collections4.MapPerformance class37 = new org.apache.commons.collections4.MapPerformance();
		org.apache.commons.collections4.BagUtilsTest class38 = new org.apache.commons.collections4.BagUtilsTest();
		class38.testSynchronizedBag();
		class38.testUnmodifiableBag();
		class38.testPredicatedBag();
		class38.testTransformedBag();
		class38.testSynchronizedSortedBag();
		class38.testUnmodifiableSortedBag();
		class38.testPredicatedSortedBag();
		class38.testTransformedSortedBag();
		org.apache.commons.collections4.TransformerUtilsTest class39 = new org.apache.commons.collections4.TransformerUtilsTest();
		class39.testExceptionTransformer();
		class39.testNullTransformer();
		class39.testNopTransformer();
		class39.testConstantTransformer();
		class39.testCloneTransformer();
		class39.testMapTransformer();
		class39.testExecutorTransformer();
		class39.testPredicateTransformer();
		class39.testFactoryTransformer();
		class39.testChainedTransformer();
		class39.testIfTransformer();
		class39.testSwitchTransformer();
		class39.testSwitchMapTransformer();
		class39.testInvokerTransformer();
		class39.testInvokerTransformer2();
		class39.testStringValueTransformer();
		class39.testInstantiateTransformerNull();
		class39.testSingletonPatternInSerialization();
	}
}