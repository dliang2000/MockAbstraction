package org.apache.commons.collections4;

public class Driver {
	public static void main(String[] argv) {
		org.apache.commons.collections4.ClosureUtilsTest class1 = new org.apache.commons.collections4.ClosureUtilsTest();
		class1.testExceptionClosure();
		class1.testNopClosure();
		class1.testInvokeClosure();
		class1.testForClosure();
		class1.testWhileClosure();
		class1.testDoWhileClosure();
		class1.testChainedClosure();
		class1.testIfClosure();
		class1.testSwitchClosure();
		class1.testSwitchMapClosure();
		class1.testTransformerClosure();
		class1.testSingletonPatternInSerialization();
		org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest class2 = new org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest();
		class2.addPass();
		class2.addFail();
		class2.addAllPass();
		class2.createPredicatedCollectionWithNotNullPredicate();
		class2.createPredicatedCollectionWithPredicate();
		org.apache.commons.collections4.CollectionUtilsTest class3 = new org.apache.commons.collections4.CollectionUtilsTest();
		class3.getCardinalityMap();
		class3.cardinality();
		class3.cardinalityOfNull();
		class3.containsAll();
		class3.containsAnyInCollection();
		class3.containsAnyInArray();
		class3.union();
		class3.intersection();
		class3.disjunction();
		class3.testDisjunctionAsUnionMinusIntersection();
		class3.testDisjunctionAsSymmetricDifference();
		class3.testSubtract();
		class3.testSubtractWithPredicate();
		class3.testIsSubCollectionOfSelf();
		class3.testIsSubCollection();
		class3.testIsSubCollection2();
		class3.testIsEqualCollectionToSelf();
		class3.testIsEqualCollection();
		class3.testIsEqualCollectionReturnsFalse();
		class3.testIsEqualCollection2();
		class3.testIsEqualCollectionEquator();
		class3.testIsEqualCollectionNullEquator();
		class3.testIsProperSubCollection();
		class3.find();
		class3.forAllDoCollection();
		class3.forAllDoIterator();
		class3.forAllDoFailure();
		class3.forAllButLastDoCollection();
		class3.forAllButLastDoIterator();
		class3.getFromMap();
		try {
			class3.getFromList();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class3.getFromIterator();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.getFromEnumeration();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.getFromIterable();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class3.getFromObjectArray();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class3.getFromPrimitiveArray();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class3.getFromObject();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class3.testSize_List();
		class3.testSize_Map();
		class3.testSize_Array();
		class3.testSize_PrimitiveArray();
		class3.testSize_Enumeration();
		class3.testSize_Iterator();
		class3.testSize_Other();
		class3.testSizeIsEmpty_Null();
		class3.testSizeIsEmpty_List();
		class3.testSizeIsEmpty_Map();
		class3.testSizeIsEmpty_Array();
		class3.testSizeIsEmpty_PrimitiveArray();
		class3.testSizeIsEmpty_Enumeration();
		class3.testSizeIsEmpty_Iterator();
		class3.testSizeIsEmpty_Other();
		class3.testIsEmptyWithEmptyCollection();
		class3.testIsEmptyWithNonEmptyCollection();
		class3.testIsEmptyWithNull();
		class3.testIsNotEmptyWithEmptyCollection();
		class3.testIsNotEmptyWithNonEmptyCollection();
		class3.testIsNotEmptyWithNull();
		class3.filter();
		try {
			class3.filterNullParameters();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		class3.filterInverse();
		try {
			class3.filterInverseNullParameters();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		class3.countMatches();
		class3.exists();
		class3.select();
		class3.selectWithOutputCollections();
		class3.selectRejected();
		class3.collect();
		class3.transform1();
		class3.transform2();
		class3.addIgnoreNull();
		class3.predicatedCollection();
		class3.isFull();
		class3.isEmpty();
		class3.maxSize();
		class3.intersectionUsesMethodEquals();
		class3.testRetainAll();
		class3.testRemoveAll();
		class3.testTransformedCollection();
		class3.testTransformedCollection_2();
		class3.testSynchronizedCollection();
		class3.testUnmodifiableCollection();
		try {
			class3.emptyCollection();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class3.emptyIfNull();
		class3.addAllForIterable();
		class3.addAllForEnumeration();
		class3.addAllForElements();
		class3.getNegative();
		class3.getPositiveOutOfBounds();
		class3.get1();
		class3.get();
		class3.getIterator();
		class3.getEnumeration();
		class3.reverse();
		class3.extractSingleton();
		class3.collateException1();
		class3.collateException2();
		class3.testCollate();
		class3.testCollateIgnoreDuplicates();
		class3.testPermutationsWithNullCollection();
		class3.testPermutations();
		class3.testMatchesAll();
		class3.testRemoveAllWithEquator();
		class3.testRetainAllWithEquator();
		org.apache.commons.collections4.FactoryUtilsTest class4 = new org.apache.commons.collections4.FactoryUtilsTest();
		class4.testExceptionFactory();
		class4.testNullFactory();
		class4.testConstantFactoryNull();
		class4.testConstantFactoryConstant();
		class4.testPrototypeFactoryNull();
		try {
			class4.testPrototypeFactoryPublicCloneMethod();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class4.testPrototypeFactoryPublicCopyConstructor();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class4.testPrototypeFactoryPublicSerialization();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class4.testPrototypeFactoryPublicSerializationError();
		class4.testPrototypeFactoryPublicBad();
		class4.instantiateFactoryNull();
		class4.instantiateFactorySimple();
		class4.instantiateFactoryMismatch();
		class4.instantiateFactoryNoConstructor();
		class4.instantiateFactoryComplex();
		class4.testSingletonPatternInSerialization();
		org.apache.commons.collections4.EnumerationUtilsTest class5 = new org.apache.commons.collections4.EnumerationUtilsTest();
		class5.testToListWithStringTokenizer();
		class5.testToListWithHashtable();
		try {
			class5.getFromEnumeration();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.commons.collections4.ListUtilsTest class6 = new org.apache.commons.collections4.ListUtilsTest();
		class6.testIntersectNonEmptyWithEmptyList();
		class6.testIntersectEmptyWithEmptyList();
		class6.testIntersectNonEmptySubset();
		class6.testIntersectListWithNoOverlapAndDifferentTypes();
		class6.testIntersectListWithSelf();
		class6.testIntersectionOrderInsensitivity();
		class6.testPredicatedList();
		class6.testLazyList();
		class6.testEmptyIfNull();
		class6.testDefaultIfNull();
		class6.testEquals();
		class6.testHashCode();
		class6.testRetainAll();
		class6.testRemoveAll();
		class6.testSubtract();
		class6.testSubtractNullElement();
		class6.testIndexOf();
		class6.testLongestCommonSubsequence();
		class6.testLongestCommonSubsequenceWithString();
		class6.testPartition();
		class6.testSelect();
		class6.testSelectRejected();
		org.apache.commons.collections4.PredicateUtilsTest class7 = new org.apache.commons.collections4.PredicateUtilsTest();
		class7.testExceptionPredicate();
		class7.testIsNotNullPredicate();
		class7.testIdentityPredicate();
		class7.testTruePredicate();
		class7.testFalsePredicate();
		class7.testNotPredicate();
		class7.testNotPredicateEx();
		class7.testAndPredicate();
		class7.testAndPredicateEx();
		class7.testAllPredicate();
		class7.testAllPredicateEx1();
		class7.testAllPredicateEx2();
		class7.testAllPredicateEx3();
		class7.testAllPredicateEx4();
		class7.testAllPredicateEx5();
		class7.testAllPredicateEx6();
		class7.testOrPredicate();
		class7.testOrPredicateEx();
		class7.testAnyPredicate();
		class7.testAnyPredicateEx1();
		class7.testAnyPredicateEx2();
		class7.testAnyPredicateEx3();
		class7.testAnyPredicateEx4();
		class7.testAnyPredicateEx5();
		class7.testAnyPredicateEx6();
		class7.testEitherPredicate();
		class7.testEitherPredicateEx();
		class7.testOnePredicate();
		class7.testOnePredicateEx1();
		class7.testOnePredicateEx2();
		class7.testOnePredicateEx3();
		class7.testOnePredicateEx4();
		class7.testOnePredicateEx5();
		class7.testOnePredicateEx6();
		class7.testNeitherPredicate();
		class7.testNeitherPredicateEx();
		class7.testNonePredicate();
		class7.testNonePredicateEx1();
		class7.testNonePredicateEx2();
		class7.testNonePredicateEx3();
		class7.testNonePredicateEx4();
		class7.testNonePredicateEx5();
		class7.testNonePredicateEx6();
		class7.testInstanceOfPredicate();
		class7.testUniquePredicate();
		class7.testAsPredicateTransformer();
		class7.testAsPredicateTransformerEx1();
		class7.testAsPredicateTransformerEx2();
		class7.testInvokerPredicate();
		class7.testInvokerPredicateEx1();
		class7.testInvokerPredicateEx2();
		class7.testInvokerPredicateEx3();
		class7.testInvokerPredicate2();
		class7.testInvokerPredicate2Ex1();
		class7.testInvokerPredicate2Ex2();
		class7.testInvokerPredicate2Ex3();
		class7.testNullIsExceptionPredicate();
		class7.testNullIsExceptionPredicateEx1();
		class7.testNullIsTruePredicate();
		class7.testNullIsTruePredicateEx1();
		class7.testNullIsFalsePredicate();
		class7.testNullIsFalsePredicateEx1();
		class7.testTransformedPredicate();
		class7.testSingletonPatternInSerialization();
		org.apache.commons.collections4.IterableUtilsTest class8 = new org.apache.commons.collections4.IterableUtilsTest();
		class8.forEach();
		class8.forEachFailure();
		class8.forEachButLast();
		class8.containsWithEquator();
		class8.frequency();
		class8.frequencyOfNull();
		class8.find();
		class8.indexOf();
		class8.countMatches();
		class8.matchesAny();
		class8.matchesAll();
		try {
			class8.getFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class8.firstFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		class8.partition();
		class8.partitionMultiplePredicates();
		class8.testToString();
		class8.testToStringDelimiter();
		class8.testToStringWithNullArguments();
		org.apache.commons.collections4.MultiSetUtilsTest class9 = new org.apache.commons.collections4.MultiSetUtilsTest();
		class9.testEmptyMultiSet();
		class9.testUnmodifiableMultiSet();
		class9.testSynchronizedMultiSet();
		class9.testPredicatedMultiSet();
		org.apache.commons.collections4.SetUtilsTest class10 = new org.apache.commons.collections4.SetUtilsTest();
		class10.difference();
		class10.disjunction();
		class10.intersection();
		class10.testEmptyIfNull();
		class10.testEquals();
		class10.testHashCode();
		class10.testHashSet();
		class10.testNewIdentityHashSet();
		class10.testpredicatedSet();
		class10.testUnmodifiableSet();
		class10.testUnmodifiableSetWrap();
		class10.union();
		org.apache.commons.collections4.MapPerformance class11 = new org.apache.commons.collections4.MapPerformance();
		org.apache.commons.collections4.sequence.SequencesComparatorTest class12 = new org.apache.commons.collections4.sequence.SequencesComparatorTest();
		class12.testLength();
		class12.testExecution();
		class12.testMinimal();
		class12.testShadok();
		org.apache.commons.collections4.FluentIterableTest class13 = new org.apache.commons.collections4.FluentIterableTest();
		class13.factoryMethodOf();
		class13.appendElements();
		class13.appendIterable();
		class13.collate();
		class13.collateWithComparator();
		class13.filter();
		class13.forEach();
		class13.limit();
		class13.reverse();
		class13.skip();
		class13.transform();
		class13.unique();
		class13.unmodifiable();
		class13.zip();
		class13.asEnumeration();
		class13.allMatch();
		class13.anyMatch();
		class13.isEmpty();
		class13.size();
		class13.eval();
		class13.contains();
		class13.copyInto();
		class13.iterator();
		class13.get();
		class13.toArray();
		class13.testToString();
		org.apache.commons.collections4.keyvalue.DefaultKeyValueTest class14 = new org.apache.commons.collections4.keyvalue.DefaultKeyValueTest();
		class14.testAccessorsAndMutators();
		class14.testSelfReferenceHandling();
		class14.testConstructors();
		class14.testEqualsAndHashCode();
		class14.testToString();
		class14.testToMapEntry();
		org.apache.commons.collections4.keyvalue.DefaultMapEntryTest class15 = new org.apache.commons.collections4.keyvalue.DefaultMapEntryTest();
		class15.testConstructors();
		class15.testSelfReferenceHandling();
		org.apache.commons.collections4.keyvalue.MultiKeyTest class16 = new org.apache.commons.collections4.keyvalue.MultiKeyTest();
		try {
			class16.testConstructors();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class16.testConstructorsByArray();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class16.testConstructorsByArrayNull();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		class16.testSize();
		class16.testGetIndexed();
		class16.testGetKeysSimpleConstructor();
		class16.testGetKeysArrayConstructorCloned();
		class16.testGetKeysArrayConstructorNonCloned();
		class16.testHashCode();
		class16.testEquals();
		try {
			class16.testEqualsAfterSerialization();
		}
		catch (java.io.IOException err20) {
			err20.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err21) {
			err21.printStackTrace();
		}
		try {
			class16.testEqualsAfterSerializationOfDerivedClass();
		}
		catch (java.io.IOException err22) {
			err22.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err23) {
			err23.printStackTrace();
		}
		org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest class17 = new org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest();
		class17.testConstructors();
		class17.testAccessorsAndMutators();
		class17.testSelfReferenceHandling();
		class17.testUnmodifiable();
		org.apache.commons.collections4.keyvalue.TiedMapEntryTest class18 = new org.apache.commons.collections4.keyvalue.TiedMapEntryTest();
		class18.testConstructors();
		class18.testSetValue();
		org.apache.commons.collections4.SplitMapUtilsTest class19 = new org.apache.commons.collections4.SplitMapUtilsTest();
		class19.testReadableMap();
		class19.testAlreadyReadableMap();
		class19.testWritableMap();
		class19.testAlreadyWritableMap();
		org.apache.commons.collections4.properties.SortedPropertiesTest class20 = new org.apache.commons.collections4.properties.SortedPropertiesTest();
		class20.testKeys();
		org.apache.commons.collections4.MultiMapUtilsTest class21 = new org.apache.commons.collections4.MultiMapUtilsTest();
		class21.testEmptyUnmodifiableMultiValuedMap();
		class21.testTypeSafeEmptyMultiValuedMap();
		class21.testEmptyIfNull();
		class21.testIsEmptyWithEmptyMap();
		class21.testIsEmptyWithNonEmptyMap();
		class21.testIsEmptyWithNull();
		class21.testGetCollection();
		class21.testGetValuesAsList();
		class21.testGetValuesAsSet();
		class21.testGetValuesAsBag();
		org.apache.commons.collections4.functors.EqualPredicateTest class22 = new org.apache.commons.collections4.functors.EqualPredicateTest();
		try {
			class22.testNullArgumentEqualsNullPredicate();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class22.objectFactoryUsesEqualsForTest();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class22.testPredicateTypeCanBeSuperClassOfObject();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		org.apache.commons.collections4.functors.ComparatorPredicateTest class23 = new org.apache.commons.collections4.functors.ComparatorPredicateTest();
		class23.compareEquals();
		class23.compareGreater();
		class23.compareLess();
		class23.compareGreaterOrEqual();
		class23.compareLessOrEqual();
		org.apache.commons.collections4.functors.CatchAndRethrowClosureTest class24 = new org.apache.commons.collections4.functors.CatchAndRethrowClosureTest();
		class24.testThrowingClosure();
		org.apache.commons.collections4.functors.AllPredicateTest class25 = new org.apache.commons.collections4.functors.AllPredicateTest();
		class25.emptyArrayToGetInstance();
		class25.emptyCollectionToGetInstance();
		class25.oneTruePredicate();
		class25.oneFalsePredicate();
		class25.allTrue();
		class25.trueAndFalseCombined();
		org.apache.commons.collections4.functors.NullPredicateTest class26 = new org.apache.commons.collections4.functors.NullPredicateTest();
		class26.testNullPredicate();
		try {
			class26.ensurePredicateCanBeTypedWithoutWarning();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		org.apache.commons.collections4.QueueUtilsTest class27 = new org.apache.commons.collections4.QueueUtilsTest();
		class27.testSynchronizedQueue();
		class27.testUnmodifiableQueue();
		class27.testPredicatedQueue();
		class27.testTransformedQueue();
		class27.testEmptyQueue();
		org.apache.commons.collections4.iterators.LoopingIteratorTest class28 = new org.apache.commons.collections4.iterators.LoopingIteratorTest();
		try {
			class28.testConstructorEx();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class28.testLooping0();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class28.testLooping1();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class28.testLooping2();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class28.testLooping3();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class28.testRemoving1();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class28.testReset();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class28.testSize();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		org.apache.commons.collections4.iterators.IteratorEnumerationTest class29 = new org.apache.commons.collections4.iterators.IteratorEnumerationTest();
		class29.testEnumeration();
		org.apache.commons.collections4.iterators.FilterListIteratorTest class30 = new org.apache.commons.collections4.iterators.FilterListIteratorTest();
		class30.testWalkLists();
		class30.testManual();
		class30.testTruePredicate();
		class30.testFalsePredicate();
		class30.testEvens();
		class30.testOdds();
		class30.testThrees();
		class30.testFours();
		class30.testNestedSixes();
		class30.testNestedSixes2();
		class30.testNestedSixes3();
		class30.testNextChangesPrevious();
		class30.testPreviousChangesNext();
		class30.testFailingHasNextBug();
		try {
			class30.testCollections360();
		}
		catch (java.lang.Throwable err36) {
			err36.printStackTrace();
		}
		org.apache.commons.collections4.iterators.LoopingListIteratorTest class31 = new org.apache.commons.collections4.iterators.LoopingListIteratorTest();
		try {
			class31.testConstructorEx();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class31.testLooping0();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class31.testLooping1();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class31.testLooping2();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		class31.testJoggingNotOverBoundary();
		class31.testJoggingOverBoundary();
		class31.testRemovingElementsAndIteratingForward();
		class31.testRemovingElementsAndIteratingBackwards();
		class31.testReset();
		class31.testAdd();
		class31.testNextAndPreviousIndex();
		class31.testSet();
		org.apache.commons.collections4.list.Collections701Test class32 = new org.apache.commons.collections4.list.Collections701Test();
		class32.testArrayList();
		class32.testHashSet();
		class32.testSetUniqueList();
		org.apache.commons.collections4.junit.ObjectToStringComparator class33 = new org.apache.commons.collections4.junit.ObjectToStringComparator();
		org.apache.commons.collections4.Driver class34 = new org.apache.commons.collections4.Driver();
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
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		class38.testForEach();
		class38.testForEachButLast();
		try {
			class38.testGetAtIndexFromIterator();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
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