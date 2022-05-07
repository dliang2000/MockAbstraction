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
		org.apache.commons.collections4.functors.Driver class5 = new org.apache.commons.collections4.functors.Driver();
		class5.runall();
		org.apache.commons.collections4.keyvalue.Driver class6 = new org.apache.commons.collections4.keyvalue.Driver();
		class6.runall();
		org.apache.commons.collections4.collection.Driver class7 = new org.apache.commons.collections4.collection.Driver();
		class7.runall();
		org.apache.commons.collections4.queue.Driver class8 = new org.apache.commons.collections4.queue.Driver();
		class8.runall();
		org.apache.commons.collections4.properties.Driver class9 = new org.apache.commons.collections4.properties.Driver();
		class9.runall();
		org.apache.commons.collections4.multimap.Driver class10 = new org.apache.commons.collections4.multimap.Driver();
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
		org.apache.commons.collections4.trie.Driver class16 = new org.apache.commons.collections4.trie.Driver();
		class16.runall();
		org.apache.commons.collections4.list.Driver class17 = new org.apache.commons.collections4.list.Driver();
		class17.runall();
		org.apache.commons.collections4.iterators.Driver class18 = new org.apache.commons.collections4.iterators.Driver();
		class18.runall();
		org.apache.commons.collections4.SetUtilsTest class19 = new org.apache.commons.collections4.SetUtilsTest();
		class19.difference();
		class19.disjunction();
		class19.intersection();
		class19.setUp();
		class19.testEmptyIfNull();
		class19.testEquals();
		class19.testHashCode();
		class19.testHashSet();
		class19.testNewIdentityHashSet();
		class19.testpredicatedSet();
		class19.testUnmodifiableSet();
		class19.testUnmodifiableSetWrap();
		class19.union();
		org.apache.commons.collections4.BagUtilsTest class20 = new org.apache.commons.collections4.BagUtilsTest();
		class20.testSynchronizedBag();
		class20.testUnmodifiableBag();
		class20.testPredicatedBag();
		class20.testTransformedBag();
		class20.testSynchronizedSortedBag();
		class20.testUnmodifiableSortedBag();
		class20.testPredicatedSortedBag();
		class20.testTransformedSortedBag();
		org.apache.commons.collections4.ComparatorUtilsTest class21 = new org.apache.commons.collections4.ComparatorUtilsTest();
		class21.booleanComparator();
		class21.chainedComparator();
		class21.max();
		class21.min();
		class21.nullLowComparator();
		class21.nullHighComparator();
		org.apache.commons.collections4.SplitMapUtilsTest class22 = new org.apache.commons.collections4.SplitMapUtilsTest();
		try {
			class22.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class22.testReadableMap();
		class22.testAlreadyReadableMap();
		class22.testWritableMap();
		class22.testAlreadyWritableMap();
		org.apache.commons.collections4.MultiMapUtilsTest class23 = new org.apache.commons.collections4.MultiMapUtilsTest();
		class23.testEmptyUnmodifiableMultiValuedMap();
		class23.testTypeSafeEmptyMultiValuedMap();
		class23.testEmptyIfNull();
		class23.testIsEmptyWithEmptyMap();
		class23.testIsEmptyWithNonEmptyMap();
		class23.testIsEmptyWithNull();
		class23.testGetCollection();
		class23.testGetValuesAsList();
		class23.testGetValuesAsSet();
		class23.testGetValuesAsBag();
		org.apache.commons.collections4.TrieUtilsTest class24 = new org.apache.commons.collections4.TrieUtilsTest();
		class24.testUnmodifiableTrie();
		org.apache.commons.collections4.IteratorUtilsTest class25 = new org.apache.commons.collections4.IteratorUtilsTest();
		class25.setUp();
		class25.testArrayIterator();
		class25.testArrayListIterator();
		class25.testAsIterable();
		class25.testAsIterableNull();
		class25.testAsMultipleIterable();
		class25.testAsMultipleIterableNull();
		class25.testCollatedIterator();
		class25.testEmptyIterator();
		class25.testEmptyListIterator();
		class25.testEmptyMapIterator();
		class25.testEmptyOrderedIterator();
		class25.testEmptyOrderedMapIterator();
		class25.testFind();
		try {
			class25.testFirstFromIterator();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class25.testForEach();
		class25.testForEachButLast();
		try {
			class25.testGetAtIndexFromIterator();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class25.testGetIterator();
		class25.testIndexOf();
		class25.testNodeIterator();
		class25.testNodeListIterator();
		class25.testToArray();
		class25.testToArray2();
		class25.testToList();
		class25.testToListIterator();
		class25.testToListIteratorNull();
		class25.testUnmodifiableIteratorImmutability();
		class25.testUnmodifiableIteratorIteration();
		class25.testUnmodifiableListIteratorImmutability();
		class25.testUnmodifiableListIteratorIteration();
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
		org.apache.commons.collections4.QueueUtilsTest class27 = new org.apache.commons.collections4.QueueUtilsTest();
		class27.testSynchronizedQueue();
		class27.testUnmodifiableQueue();
		class27.testPredicatedQueue();
		class27.testTransformedQueue();
		class27.testEmptyQueue();
		org.apache.commons.collections4.MapUtilsTest class28 = new org.apache.commons.collections4.MapUtilsTest(null);
		class28.testPredicatedMap();
		class28.testLazyMapFactory();
		class28.testLazyMapTransformer();
		class28.testInvertMap();
		class28.testPutAll_Map_array();
		class28.testConvertResourceBundle();
		class28.testDebugAndVerbosePrintCasting();
		class28.testDebugAndVerbosePrintNullMap();
		class28.testVerbosePrintNullLabel();
		class28.testDebugPrintNullLabel();
		class28.testVerbosePrintNullLabelAndMap();
		class28.testDebugPrintNullLabelAndMap();
		class28.testVerbosePrintNullStream();
		class28.testDebugPrintNullStream();
		class28.testDebugPrintNullKey();
		class28.testVerbosePrintNullKey();
		class28.testDebugPrintNullKeyToMap1();
		class28.testVerbosePrintNullKeyToMap1();
		class28.testDebugPrintNullKeyToMap2();
		class28.testVerbosePrintNullKeyToMap2();
		class28.testVerbosePrint();
		class28.testDebugPrint();
		class28.testVerbosePrintSelfReference();
		class28.testDebugPrintSelfReference();
		class28.testEmptyIfNull();
		class28.testIsEmptyWithEmptyMap();
		class28.testIsEmptyWithNonEmptyMap();
		class28.testIsEmptyWithNull();
		class28.testIsNotEmptyWithEmptyMap();
		class28.testIsNotEmptyWithNonEmptyMap();
		class28.testIsNotEmptyWithNull();
		class28.testPopulateMap();
		class28.testPopulateMultiMap();
		class28.testIterableMap();
		class28.testIterableSortedMap();
		class28.testSize0();
		class28.testSizeNull();
		class28.testSize();
		class28.testToProperties();
		class28.testToPropertiesEmpty();
		class28.testgetDoubleValue();
		class28.testgetFloatValue();
		class28.testgetLongValue();
		class28.testgetIntValue();
		class28.testgetShortValue();
		class28.testgetByteValue();
		class28.testgetNumber();
		class28.testgetString();
		class28.testgetObject();
		class28.testgetBooleanValue();
		class28.testgetMap();
		class28.testSafeAddToMap();
		class28.testOrderedMap();
		org.apache.commons.collections4.CollectionUtilsTest class29 = new org.apache.commons.collections4.CollectionUtilsTest();
		class29.setUp();
		class29.getCardinalityMap();
		class29.cardinality();
		class29.cardinalityOfNull();
		class29.containsAll();
		class29.containsAnyInCollection();
		class29.containsAnyInArray();
		class29.union();
		class29.intersection();
		class29.disjunction();
		class29.testDisjunctionAsUnionMinusIntersection();
		class29.testDisjunctionAsSymmetricDifference();
		class29.testSubtract();
		class29.testSubtractWithPredicate();
		class29.testIsSubCollectionOfSelf();
		class29.testIsSubCollection();
		class29.testIsSubCollection2();
		class29.testIsEqualCollectionToSelf();
		class29.testIsEqualCollection();
		class29.testIsEqualCollectionReturnsFalse();
		class29.testIsEqualCollection2();
		class29.testIsEqualCollectionEquator();
		class29.testIsEqualCollectionNullEquator();
		class29.testIsProperSubCollection();
		class29.find();
		class29.forAllDoCollection();
		class29.forAllDoIterator();
		class29.forAllDoFailure();
		class29.forAllButLastDoCollection();
		class29.forAllButLastDoIterator();
		class29.getFromMap();
		try {
			class29.getFromList();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class29.getFromIterator();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class29.getFromEnumeration();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class29.getFromIterable();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class29.getFromObjectArray();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class29.getFromPrimitiveArray();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class29.getFromObject();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class29.testSize_List();
		class29.testSize_Map();
		class29.testSize_Array();
		class29.testSize_PrimitiveArray();
		class29.testSize_Enumeration();
		class29.testSize_Iterator();
		class29.testSize_Other();
		class29.testSizeIsEmpty_Null();
		class29.testSizeIsEmpty_List();
		class29.testSizeIsEmpty_Map();
		class29.testSizeIsEmpty_Array();
		class29.testSizeIsEmpty_PrimitiveArray();
		class29.testSizeIsEmpty_Enumeration();
		class29.testSizeIsEmpty_Iterator();
		class29.testSizeIsEmpty_Other();
		class29.testIsEmptyWithEmptyCollection();
		class29.testIsEmptyWithNonEmptyCollection();
		class29.testIsEmptyWithNull();
		class29.testIsNotEmptyWithEmptyCollection();
		class29.testIsNotEmptyWithNonEmptyCollection();
		class29.testIsNotEmptyWithNull();
		class29.filter();
		try {
			class29.filterNullParameters();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		class29.filterInverse();
		try {
			class29.filterInverseNullParameters();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		class29.countMatches();
		class29.exists();
		class29.select();
		class29.selectWithOutputCollections();
		class29.selectRejected();
		class29.collect();
		class29.transform1();
		class29.transform2();
		class29.addIgnoreNull();
		class29.predicatedCollection();
		class29.isFull();
		class29.isEmpty();
		class29.maxSize();
		class29.intersectionUsesMethodEquals();
		class29.testRetainAll();
		class29.testRemoveAll();
		class29.testTransformedCollection();
		class29.testTransformedCollection_2();
		class29.testSynchronizedCollection();
		class29.testUnmodifiableCollection();
		try {
			class29.emptyCollection();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class29.emptyIfNull();
		class29.addAllForIterable();
		class29.addAllForEnumeration();
		class29.addAllForElements();
		class29.getNegative();
		class29.getPositiveOutOfBounds();
		class29.get1();
		class29.get();
		class29.getIterator();
		class29.getEnumeration();
		class29.reverse();
		class29.extractSingleton();
		class29.collateException1();
		class29.collateException2();
		class29.testCollate();
		class29.testCollateIgnoreDuplicates();
		class29.testPermutationsWithNullCollection();
		class29.testPermutations();
		class29.testMatchesAll();
		class29.testRemoveAllWithEquator();
		class29.testRetainAllWithEquator();
		org.apache.commons.collections4.MultiSetUtilsTest class30 = new org.apache.commons.collections4.MultiSetUtilsTest();
		class30.setUp();
		class30.testEmptyMultiSet();
		class30.testUnmodifiableMultiSet();
		class30.testSynchronizedMultiSet();
		class30.testPredicatedMultiSet();
		org.apache.commons.collections4.TransformerUtilsTest class31 = new org.apache.commons.collections4.TransformerUtilsTest();
		class31.testExceptionTransformer();
		class31.testNullTransformer();
		class31.testNopTransformer();
		class31.testConstantTransformer();
		class31.testCloneTransformer();
		class31.testMapTransformer();
		class31.testExecutorTransformer();
		class31.testPredicateTransformer();
		class31.testFactoryTransformer();
		class31.testChainedTransformer();
		class31.testIfTransformer();
		class31.testSwitchTransformer();
		class31.testSwitchMapTransformer();
		class31.testInvokerTransformer();
		class31.testInvokerTransformer2();
		class31.testStringValueTransformer();
		class31.testInstantiateTransformerNull();
		class31.testSingletonPatternInSerialization();
		org.apache.commons.collections4.ClosureUtilsTest class32 = new org.apache.commons.collections4.ClosureUtilsTest();
		class32.testExceptionClosure();
		class32.testNopClosure();
		class32.testInvokeClosure();
		class32.testForClosure();
		class32.testWhileClosure();
		class32.testDoWhileClosure();
		class32.testChainedClosure();
		class32.testIfClosure();
		class32.testSwitchClosure();
		class32.testSwitchMapClosure();
		class32.testTransformerClosure();
		class32.testSingletonPatternInSerialization();
		org.apache.commons.collections4.ArrayStackTest class33 = new org.apache.commons.collections4.ArrayStackTest(null);
		class33.testNewStack();
		class33.testPushPeekPop();
		class33.testSearch();
		org.apache.commons.collections4.IterableUtilsTest class34 = new org.apache.commons.collections4.IterableUtilsTest();
		class34.setUp();
		class34.forEach();
		class34.forEachFailure();
		class34.forEachButLast();
		class34.containsWithEquator();
		class34.frequency();
		class34.frequencyOfNull();
		class34.find();
		class34.indexOf();
		class34.countMatches();
		class34.matchesAny();
		class34.matchesAll();
		try {
			class34.getFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class34.firstFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		class34.partition();
		class34.partitionMultiplePredicates();
		class34.testToString();
		class34.testToStringDelimiter();
		class34.testToStringWithNullArguments();
		org.apache.commons.collections4.EnumerationUtilsTest class35 = new org.apache.commons.collections4.EnumerationUtilsTest();
		class35.testToListWithStringTokenizer();
		class35.testToListWithHashtable();
		try {
			class35.getFromEnumeration();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		org.apache.commons.collections4.FactoryUtilsTest class36 = new org.apache.commons.collections4.FactoryUtilsTest();
		class36.testExceptionFactory();
		class36.testNullFactory();
		class36.testConstantFactoryNull();
		class36.testConstantFactoryConstant();
		class36.testPrototypeFactoryNull();
		try {
			class36.testPrototypeFactoryPublicCloneMethod();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class36.testPrototypeFactoryPublicCopyConstructor();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class36.testPrototypeFactoryPublicSerialization();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		class36.testPrototypeFactoryPublicSerializationError();
		class36.testPrototypeFactoryPublicBad();
		class36.instantiateFactoryNull();
		class36.instantiateFactorySimple();
		class36.instantiateFactoryMismatch();
		class36.instantiateFactoryNoConstructor();
		class36.instantiateFactoryComplex();
		class36.testSingletonPatternInSerialization();
		org.apache.commons.collections4.MapPerformance class37 = new org.apache.commons.collections4.MapPerformance();
		org.apache.commons.collections4.FluentIterableTest class38 = new org.apache.commons.collections4.FluentIterableTest();
		class38.setUp();
		class38.factoryMethodOf();
		class38.appendElements();
		class38.appendIterable();
		class38.collate();
		class38.collateWithComparator();
		class38.filter();
		class38.forEach();
		class38.limit();
		class38.reverse();
		class38.skip();
		class38.transform();
		class38.unique();
		class38.unmodifiable();
		class38.zip();
		class38.asEnumeration();
		class38.allMatch();
		class38.anyMatch();
		class38.isEmpty();
		class38.size();
		class38.eval();
		class38.contains();
		class38.copyInto();
		class38.iterator();
		class38.get();
		class38.toArray();
		class38.testToString();
		org.apache.commons.collections4.ListUtilsTest class39 = new org.apache.commons.collections4.ListUtilsTest();
		class39.setUp();
		class39.testIntersectNonEmptyWithEmptyList();
		class39.testIntersectEmptyWithEmptyList();
		class39.testIntersectNonEmptySubset();
		class39.testIntersectListWithNoOverlapAndDifferentTypes();
		class39.testIntersectListWithSelf();
		class39.testIntersectionOrderInsensitivity();
		class39.testPredicatedList();
		class39.testLazyFactoryList();
		class39.testLazyTransformerList();
		class39.testEmptyIfNull();
		class39.testDefaultIfNull();
		class39.testEquals();
		class39.testHashCode();
		class39.testRetainAll();
		class39.testRemoveAll();
		class39.testSubtract();
		class39.testSubtractNullElement();
		class39.testIndexOf();
		class39.testLongestCommonSubsequence();
		class39.testLongestCommonSubsequenceWithString();
		class39.testPartition();
		class39.testSelect();
		class39.testSelectRejected();
	}
}