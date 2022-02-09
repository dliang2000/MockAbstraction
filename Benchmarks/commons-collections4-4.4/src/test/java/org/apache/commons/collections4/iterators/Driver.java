package org.apache.commons.collections4.iterators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest class1 = new org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest(null);
		class1.testMapIterator();
		class1.testDecorateFactory();
		org.apache.commons.collections4.iterators.UniqueFilterIteratorTest class2 = new org.apache.commons.collections4.iterators.UniqueFilterIteratorTest(null);
		class2.testIterator();
		org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest class3 = new org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest(null);
		class3.testOrderedMapIterator();
		class3.testDecorateFactory();
		org.apache.commons.collections4.iterators.SingletonListIteratorTest class4 = new org.apache.commons.collections4.iterators.SingletonListIteratorTest(null);
		class4.testIterator();
		class4.testReset();
		org.apache.commons.collections4.iterators.IteratorEnumerationTest class5 = new org.apache.commons.collections4.iterators.IteratorEnumerationTest();
		class5.testEnumeration();
		org.apache.commons.collections4.iterators.PermutationIteratorTest class6 = new org.apache.commons.collections4.iterators.PermutationIteratorTest(null);
		class6.testPermutationResultSize();
		class6.testPermutationExhaustivity();
		class6.testPermutationUnicity();
		class6.testPermutationException();
		class6.testPermutatorHasMore();
		class6.testEmptyCollection();
		org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest class7 = new org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest(null);
		class7.testListIterator();
		class7.testDecorateFactory();
		org.apache.commons.collections4.iterators.BoundedIteratorTest class8 = new org.apache.commons.collections4.iterators.BoundedIteratorTest(null);
		class8.testBounded();
		class8.testSameAsDecorated();
		class8.testEmptyBounded();
		class8.testNegativeOffset();
		class8.testNegativeMax();
		class8.testOffsetGreaterThanSize();
		class8.testMaxGreaterThanSize();
		class8.testRemoveWithoutCallingNext();
		class8.testRemoveCalledTwice();
		class8.testRemoveFirst();
		class8.testRemoveMiddle();
		class8.testRemoveLast();
		class8.testRemoveUnsupported();
		org.apache.commons.collections4.iterators.ReverseListIteratorTest class9 = new org.apache.commons.collections4.iterators.ReverseListIteratorTest(null);
		class9.testEmptyListIteratorIsIndeedEmpty();
		class9.testWalkForwardAndBack();
		class9.testReverse();
		class9.testReset();
		org.apache.commons.collections4.iterators.ListIteratorWrapperTest class10 = new org.apache.commons.collections4.iterators.ListIteratorWrapperTest(null);
		class10.testIterator();
		class10.testRemove();
		class10.testReset();
		org.apache.commons.collections4.iterators.SkippingIteratorTest class11 = new org.apache.commons.collections4.iterators.SkippingIteratorTest(null);
		class11.testSkipping();
		class11.testSameAsDecorated();
		class11.testOffsetGreaterThanSize();
		class11.testNegativeOffset();
		class11.testRemoveWithoutCallingNext();
		class11.testRemoveCalledTwice();
		class11.testRemoveFirst();
		class11.testRemoveMiddle();
		class11.testRemoveLast();
		class11.testRemoveUnsupported();
		org.apache.commons.collections4.iterators.PeekingIteratorTest class12 = new org.apache.commons.collections4.iterators.PeekingIteratorTest(null);
		class12.testEmpty();
		class12.testSinglePeek();
		class12.testMultiplePeek();
		class12.testIteratorExhausted();
		class12.testIllegalRemove();
		org.apache.commons.collections4.iterators.PushbackIteratorTest class13 = new org.apache.commons.collections4.iterators.PushbackIteratorTest(null);
		class13.testNormalIteration();
		class13.testImmediatePushback();
		class13.testDelayedPushback();
		class13.testMultiplePushback();
		org.apache.commons.collections4.iterators.FilterIteratorTest class14 = new org.apache.commons.collections4.iterators.FilterIteratorTest(null);
		class14.testRepeatedHasNext();
		class14.testRepeatedNext();
		class14.testReturnValues();
		class14.testSetIterator();
		class14.testSetPredicate();
		org.apache.commons.collections4.iterators.NodeListIteratorTest class15 = new org.apache.commons.collections4.iterators.NodeListIteratorTest(null);
		class15.testNullConstructor();
		class15.testEmptyIteratorWithNodeConstructor();
		class15.testFullIteratorWithNodeConstructor();
		org.apache.commons.collections4.iterators.LazyIteratorChainTest class16 = new org.apache.commons.collections4.iterators.LazyIteratorChainTest(null);
		class16.testIterator();
		class16.testRemoveFromFilteredIterator();
		class16.testRemove();
		class16.testFirstIteratorIsEmptyBug();
		class16.testEmptyChain();
		org.apache.commons.collections4.iterators.UnmodifiableIteratorTest class17 = new org.apache.commons.collections4.iterators.UnmodifiableIteratorTest(null);
		class17.testIterator();
		class17.testDecorateFactory();
		org.apache.commons.collections4.iterators.ArrayListIteratorTest class18 = new org.apache.commons.collections4.iterators.ArrayListIteratorTest(null);
		class18.testListIterator();
		class18.testListIteratorSet();
		org.apache.commons.collections4.iterators.ObjectArrayIteratorTest class19 = new org.apache.commons.collections4.iterators.ObjectArrayIteratorTest(null);
		class19.testIterator();
		class19.testNullArray();
		class19.testReset();
		org.apache.commons.collections4.iterators.SingletonIterator2Test class20 = new org.apache.commons.collections4.iterators.SingletonIterator2Test(null);
		class20.testIterator();
		class20.testReset();
		org.apache.commons.collections4.iterators.ListIteratorWrapper2Test class21 = new org.apache.commons.collections4.iterators.ListIteratorWrapper2Test(null);
		class21.testIterator();
		class21.testRemove();
		class21.testReset();
		org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest class22 = new org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest(null);
		class22.testListIterator();
		class22.testListIteratorSet();
		org.apache.commons.collections4.iterators.LoopingListIteratorTest class23 = new org.apache.commons.collections4.iterators.LoopingListIteratorTest();
		try {
			class23.testConstructorEx();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class23.testLooping0();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class23.testLooping1();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class23.testLooping2();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		class23.testJoggingNotOverBoundary();
		class23.testJoggingOverBoundary();
		class23.testRemovingElementsAndIteratingForward();
		class23.testRemovingElementsAndIteratingBackwards();
		class23.testReset();
		class23.testAdd();
		class23.testNextAndPreviousIndex();
		class23.testSet();
		org.apache.commons.collections4.iterators.IteratorIterableTest class24 = new org.apache.commons.collections4.iterators.IteratorIterableTest(null);
		class24.testIterator();
		class24.testMultipleUserIterator();
		org.apache.commons.collections4.iterators.ArrayIterator2Test class25 = new org.apache.commons.collections4.iterators.ArrayIterator2Test(null);
		class25.testIterator();
		class25.testIndexedArray();
		org.apache.commons.collections4.iterators.ZippingIteratorTest class26 = new org.apache.commons.collections4.iterators.ZippingIteratorTest(null);
		class26.testIterateEven();
		class26.testIterateEvenOdd();
		class26.testIterateOddEven();
		class26.testIterateEvenEven();
		class26.testIterateFibEvenOdd();
		class26.testRemoveFromSingle();
		class26.testRemoveFromDouble();
		org.apache.commons.collections4.iterators.SingletonIteratorTest class27 = new org.apache.commons.collections4.iterators.SingletonIteratorTest(null);
		class27.testIterator();
		class27.testSingletonIteratorRemove();
		class27.testReset();
		org.apache.commons.collections4.iterators.CollatingIteratorTest class28 = new org.apache.commons.collections4.iterators.CollatingIteratorTest(null);
		class28.testGetSetComparator();
		class28.testIterateEven();
		class28.testIterateEvenOdd();
		class28.testIterateOddEven();
		class28.testIterateEvenEven();
		class28.testIterateFibEvenOdd();
		class28.testRemoveFromSingle();
		class28.testRemoveFromDouble();
		class28.testNullComparator();
		org.apache.commons.collections4.iterators.FilterListIteratorTest class29 = new org.apache.commons.collections4.iterators.FilterListIteratorTest();
		class29.setUp();
		try {
			class29.tearDown();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		class29.testWalkLists();
		class29.testManual();
		class29.testTruePredicate();
		class29.testFalsePredicate();
		class29.testEvens();
		class29.testOdds();
		class29.testThrees();
		class29.testFours();
		class29.testNestedSixes();
		class29.testNestedSixes2();
		class29.testNestedSixes3();
		class29.testNextChangesPrevious();
		class29.testPreviousChangesNext();
		class29.testFailingHasNextBug();
		try {
			class29.testCollections360();
		}
		catch (java.lang.Throwable err6) {
			err6.printStackTrace();
		}
		org.apache.commons.collections4.iterators.ArrayIteratorTest class30 = new org.apache.commons.collections4.iterators.ArrayIteratorTest(null);
		class30.testIterator();
		class30.testNullArray();
		class30.testReset();
		org.apache.commons.collections4.iterators.ObjectGraphIteratorTest class31 = new org.apache.commons.collections4.iterators.ObjectGraphIteratorTest(null);
		class31.testIteratorConstructor_null1();
		class31.testIteratorConstructor_null_next();
		class31.testIteratorConstructor_null_remove();
		class31.testIteratorConstructorIteration_Empty();
		class31.testIteratorConstructorIteration_Simple();
		class31.testIteratorConstructorIteration_SimpleNoHasNext();
		class31.testIteratorConstructorIteration_WithEmptyIterators();
		class31.testIteratorConstructorRemove();
		class31.testIteration_IteratorOfIterators();
		class31.testIteration_IteratorOfIteratorsWithEmptyIterators();
		class31.testIteration_RootNull();
		class31.testIteration_RootNoTransformer();
		class31.testIteration_Transformed1();
		class31.testIteration_Transformed2();
		class31.testIteration_Transformed3();
		org.apache.commons.collections4.iterators.LoopingIteratorTest class32 = new org.apache.commons.collections4.iterators.LoopingIteratorTest();
		try {
			class32.testConstructorEx();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class32.testLooping0();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class32.testLooping1();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class32.testLooping2();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class32.testLooping3();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class32.testRemoving1();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class32.testReset();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class32.testSize();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.commons.collections4.iterators.IteratorChainTest class33 = new org.apache.commons.collections4.iterators.IteratorChainTest(null);
		class33.testIterator();
		class33.testRemoveFromFilteredIterator();
		class33.testRemove();
		class33.testFirstIteratorIsEmptyBug();
		class33.testEmptyChain();
	}
}