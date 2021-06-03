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
		org.apache.commons.collections4.MapUtilsTest class20 = new org.apache.commons.collections4.MapUtilsTest(null);
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
		org.apache.commons.collections4.ListUtilsTest class24 = new org.apache.commons.collections4.ListUtilsTest();
		class24.setUp();
		class24.testIntersectNonEmptyWithEmptyList();
		class24.testIntersectEmptyWithEmptyList();
		class24.testIntersectNonEmptySubset();
		class24.testIntersectListWithNoOverlapAndDifferentTypes();
		class24.testIntersectListWithSelf();
		class24.testIntersectionOrderInsensitivity();
		class24.testPredicatedList();
		class24.testLazyFactoryList();
		class24.testLazyTransformerList();
		class24.testEmptyIfNull();
		class24.testDefaultIfNull();
		class24.testEquals();
		class24.testHashCode();
		class24.testRetainAll();
		class24.testRemoveAll();
		class24.testSubtract();
		class24.testSubtractNullElement();
		class24.testIndexOf();
		class24.testLongestCommonSubsequence();
		class24.testLongestCommonSubsequenceWithString();
		class24.testPartition();
		class24.testSelect();
		class24.testSelectRejected();
		org.apache.commons.collections4.PredicateUtilsTest class25 = new org.apache.commons.collections4.PredicateUtilsTest();
		class25.testExceptionPredicate();
		class25.testIsNotNullPredicate();
		class25.testIdentityPredicate();
		class25.testTruePredicate();
		class25.testFalsePredicate();
		class25.testNotPredicate();
		class25.testNotPredicateEx();
		class25.testAndPredicate();
		class25.testAndPredicateEx();
		class25.testAllPredicate();
		class25.testAllPredicateEx1();
		class25.testAllPredicateEx2();
		class25.testAllPredicateEx3();
		class25.testAllPredicateEx4();
		class25.testAllPredicateEx5();
		class25.testAllPredicateEx6();
		class25.testOrPredicate();
		class25.testOrPredicateEx();
		class25.testAnyPredicate();
		class25.testAnyPredicateEx1();
		class25.testAnyPredicateEx2();
		class25.testAnyPredicateEx3();
		class25.testAnyPredicateEx4();
		class25.testAnyPredicateEx5();
		class25.testAnyPredicateEx6();
		class25.testEitherPredicate();
		class25.testEitherPredicateEx();
		class25.testOnePredicate();
		class25.testOnePredicateEx1();
		class25.testOnePredicateEx2();
		class25.testOnePredicateEx3();
		class25.testOnePredicateEx4();
		class25.testOnePredicateEx5();
		class25.testOnePredicateEx6();
		class25.testNeitherPredicate();
		class25.testNeitherPredicateEx();
		class25.testNonePredicate();
		class25.testNonePredicateEx1();
		class25.testNonePredicateEx2();
		class25.testNonePredicateEx3();
		class25.testNonePredicateEx4();
		class25.testNonePredicateEx5();
		class25.testNonePredicateEx6();
		class25.testInstanceOfPredicate();
		class25.testUniquePredicate();
		class25.testAsPredicateTransformer();
		class25.testAsPredicateTransformerEx1();
		class25.testAsPredicateTransformerEx2();
		class25.testInvokerPredicate();
		class25.testInvokerPredicateEx1();
		class25.testInvokerPredicateEx2();
		class25.testInvokerPredicateEx3();
		class25.testInvokerPredicate2();
		class25.testInvokerPredicate2Ex1();
		class25.testInvokerPredicate2Ex2();
		class25.testInvokerPredicate2Ex3();
		class25.testNullIsExceptionPredicate();
		class25.testNullIsExceptionPredicateEx1();
		class25.testNullIsTruePredicate();
		class25.testNullIsTruePredicateEx1();
		class25.testNullIsFalsePredicate();
		class25.testNullIsFalsePredicateEx1();
		class25.testTransformedPredicate();
		class25.testSingletonPatternInSerialization();
		org.apache.commons.collections4.IterableUtilsTest class26 = new org.apache.commons.collections4.IterableUtilsTest();
		class26.setUp();
		class26.forEach();
		class26.forEachFailure();
		class26.forEachButLast();
		class26.containsWithEquator();
		class26.frequency();
		class26.frequencyOfNull();
		class26.find();
		class26.indexOf();
		class26.countMatches();
		class26.matchesAny();
		class26.matchesAll();
		try {
			class26.getFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class26.firstFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		class26.partition();
		class26.partitionMultiplePredicates();
		class26.testToString();
		class26.testToStringDelimiter();
		class26.testToStringWithNullArguments();
		org.apache.commons.collections4.ArrayStackTest class27 = new org.apache.commons.collections4.ArrayStackTest(null);
		class27.testNewStack();
		class27.testPushPeekPop();
		class27.testSearch();
		org.apache.commons.collections4.MultiSetUtilsTest class28 = new org.apache.commons.collections4.MultiSetUtilsTest();
		class28.setUp();
		class28.testEmptyMultiSet();
		class28.testUnmodifiableMultiSet();
		class28.testSynchronizedMultiSet();
		class28.testPredicatedMultiSet();
		org.apache.commons.collections4.SetUtilsTest class29 = new org.apache.commons.collections4.SetUtilsTest();
		class29.difference();
		class29.disjunction();
		class29.intersection();
		class29.setUp();
		class29.testEmptyIfNull();
		class29.testEquals();
		class29.testHashCode();
		class29.testHashSet();
		class29.testNewIdentityHashSet();
		class29.testpredicatedSet();
		class29.testUnmodifiableSet();
		class29.testUnmodifiableSetWrap();
		class29.union();
		org.apache.commons.collections4.MapPerformance class30 = new org.apache.commons.collections4.MapPerformance();
		org.apache.commons.collections4.FluentIterableTest class31 = new org.apache.commons.collections4.FluentIterableTest();
		class31.setUp();
		class31.factoryMethodOf();
		class31.appendElements();
		class31.appendIterable();
		class31.collate();
		class31.collateWithComparator();
		class31.filter();
		class31.forEach();
		class31.limit();
		class31.reverse();
		class31.skip();
		class31.transform();
		class31.unique();
		class31.unmodifiable();
		class31.zip();
		class31.asEnumeration();
		class31.allMatch();
		class31.anyMatch();
		class31.isEmpty();
		class31.size();
		class31.eval();
		class31.contains();
		class31.copyInto();
		class31.iterator();
		class31.get();
		class31.toArray();
		class31.testToString();
		org.apache.commons.collections4.SplitMapUtilsTest class32 = new org.apache.commons.collections4.SplitMapUtilsTest();
		try {
			class32.setUp();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		class32.testReadableMap();
		class32.testAlreadyReadableMap();
		class32.testWritableMap();
		class32.testAlreadyWritableMap();
		org.apache.commons.collections4.MultiMapUtilsTest class33 = new org.apache.commons.collections4.MultiMapUtilsTest();
		class33.testEmptyUnmodifiableMultiValuedMap();
		class33.testTypeSafeEmptyMultiValuedMap();
		class33.testEmptyIfNull();
		class33.testIsEmptyWithEmptyMap();
		class33.testIsEmptyWithNonEmptyMap();
		class33.testIsEmptyWithNull();
		class33.testGetCollection();
		class33.testGetValuesAsList();
		class33.testGetValuesAsSet();
		class33.testGetValuesAsBag();
		org.apache.commons.collections4.QueueUtilsTest class34 = new org.apache.commons.collections4.QueueUtilsTest();
		class34.testSynchronizedQueue();
		class34.testUnmodifiableQueue();
		class34.testPredicatedQueue();
		class34.testTransformedQueue();
		class34.testEmptyQueue();
		org.apache.commons.collections4.ComparatorUtilsTest class35 = new org.apache.commons.collections4.ComparatorUtilsTest();
		class35.booleanComparator();
		class35.chainedComparator();
		class35.max();
		class35.min();
		class35.nullLowComparator();
		class35.nullHighComparator();
		org.apache.commons.collections4.TransformerUtilsTest class36 = new org.apache.commons.collections4.TransformerUtilsTest();
		class36.testExceptionTransformer();
		class36.testNullTransformer();
		class36.testNopTransformer();
		class36.testConstantTransformer();
		class36.testCloneTransformer();
		class36.testMapTransformer();
		class36.testExecutorTransformer();
		class36.testPredicateTransformer();
		class36.testFactoryTransformer();
		class36.testChainedTransformer();
		class36.testIfTransformer();
		class36.testSwitchTransformer();
		class36.testSwitchMapTransformer();
		class36.testInvokerTransformer();
		class36.testInvokerTransformer2();
		class36.testStringValueTransformer();
		class36.testInstantiateTransformerNull();
		class36.testSingletonPatternInSerialization();
		org.apache.commons.collections4.BagUtilsTest class37 = new org.apache.commons.collections4.BagUtilsTest();
		class37.testSynchronizedBag();
		class37.testUnmodifiableBag();
		class37.testPredicatedBag();
		class37.testTransformedBag();
		class37.testSynchronizedSortedBag();
		class37.testUnmodifiableSortedBag();
		class37.testPredicatedSortedBag();
		class37.testTransformedSortedBag();
		org.apache.commons.collections4.IteratorUtilsTest class38 = new org.apache.commons.collections4.IteratorUtilsTest();
		class38.setUp();
		class38.testArrayIterator();
		class38.testArrayListIterator();
		class38.testAsIterable();
		class38.testAsIterableNull();
		class38.testAsMultipleIterable();
		class38.testAsMultipleIterableNull();
		class38.testCollatedIterator();
		class38.testEmptyIterator();
		class38.testEmptyListIterator();
		class38.testEmptyMapIterator();
		class38.testEmptyOrderedIterator();
		class38.testEmptyOrderedMapIterator();
		class38.testFind();
		try {
			class38.testFirstFromIterator();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		class38.testForEach();
		class38.testForEachButLast();
		try {
			class38.testGetAtIndexFromIterator();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		class38.testGetIterator();
		class38.testIndexOf();
		class38.testNodeIterator();
		class38.testNodeListIterator();
		class38.testToArray();
		class38.testToArray2();
		class38.testToList();
		class38.testToListIterator();
		class38.testToListIteratorNull();
		class38.testUnmodifiableIteratorImmutability();
		class38.testUnmodifiableIteratorIteration();
		class38.testUnmodifiableListIteratorImmutability();
		class38.testUnmodifiableListIteratorIteration();
		org.apache.commons.collections4.TrieUtilsTest class39 = new org.apache.commons.collections4.TrieUtilsTest();
		class39.testUnmodifiableTrie();
	}
}