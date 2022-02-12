package org.apache.commons.collections4.iterators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.iterators.IteratorIterableTest class1 = new org.apache.commons.collections4.iterators.IteratorIterableTest(null);
		class1.testIterator();
		class1.testMultipleUserIterator();
		org.apache.commons.collections4.iterators.ArrayListIteratorTest class2 = new org.apache.commons.collections4.iterators.ArrayListIteratorTest(null);
		class2.testListIterator();
		class2.testListIteratorSet();
		org.apache.commons.collections4.iterators.ArrayIterator2Test class3 = new org.apache.commons.collections4.iterators.ArrayIterator2Test(null);
		class3.testIterator();
		class3.testIndexedArray();
		org.apache.commons.collections4.iterators.ListIteratorWrapper2Test class4 = new org.apache.commons.collections4.iterators.ListIteratorWrapper2Test(null);
		class4.testIterator();
		class4.testRemove();
		class4.testReset();
		org.apache.commons.collections4.iterators.ZippingIteratorTest class5 = new org.apache.commons.collections4.iterators.ZippingIteratorTest(null);
		class5.testIterateEven();
		class5.testIterateEvenOdd();
		class5.testIterateOddEven();
		class5.testIterateEvenEven();
		class5.testIterateFibEvenOdd();
		class5.testRemoveFromSingle();
		class5.testRemoveFromDouble();
		org.apache.commons.collections4.iterators.IteratorEnumerationTest class6 = new org.apache.commons.collections4.iterators.IteratorEnumerationTest();
		class6.testEnumeration();
		org.apache.commons.collections4.iterators.LoopingListIteratorTest class7 = new org.apache.commons.collections4.iterators.LoopingListIteratorTest();
		try {
			class7.testConstructorEx();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class7.testLooping0();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class7.testLooping1();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class7.testLooping2();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		class7.testJoggingNotOverBoundary();
		class7.testJoggingOverBoundary();
		class7.testRemovingElementsAndIteratingForward();
		class7.testRemovingElementsAndIteratingBackwards();
		class7.testReset();
		class7.testAdd();
		class7.testNextAndPreviousIndex();
		class7.testSet();
		org.apache.commons.collections4.iterators.LoopingIteratorTest class8 = new org.apache.commons.collections4.iterators.LoopingIteratorTest();
		try {
			class8.testConstructorEx();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class8.testLooping0();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class8.testLooping1();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class8.testLooping2();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class8.testLooping3();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class8.testRemoving1();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class8.testReset();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class8.testSize();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		org.apache.commons.collections4.iterators.ListIteratorWrapperTest class9 = new org.apache.commons.collections4.iterators.ListIteratorWrapperTest(null);
		class9.testIterator();
		class9.testRemove();
		class9.testReset();
		org.apache.commons.collections4.iterators.NodeListIteratorTest class10 = new org.apache.commons.collections4.iterators.NodeListIteratorTest(null);
		class10.testNullConstructor();
		class10.testEmptyIteratorWithNodeConstructor();
		class10.testFullIteratorWithNodeConstructor();
		org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest class11 = new org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest(null);
		class11.testMapIterator();
		class11.testDecorateFactory();
		org.apache.commons.collections4.iterators.SingletonIteratorTest class12 = new org.apache.commons.collections4.iterators.SingletonIteratorTest(null);
		class12.testIterator();
		class12.testSingletonIteratorRemove();
		class12.testReset();
		org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest class13 = new org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest(null);
		class13.testListIterator();
		class13.testListIteratorSet();
		org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest class14 = new org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest(null);
		class14.testOrderedMapIterator();
		class14.testDecorateFactory();
		org.apache.commons.collections4.iterators.LazyIteratorChainTest class15 = new org.apache.commons.collections4.iterators.LazyIteratorChainTest(null);
		class15.testIterator();
		class15.testRemoveFromFilteredIterator();
		class15.testRemove();
		class15.testFirstIteratorIsEmptyBug();
		class15.testEmptyChain();
		org.apache.commons.collections4.iterators.PeekingIteratorTest class16 = new org.apache.commons.collections4.iterators.PeekingIteratorTest(null);
		class16.testEmpty();
		class16.testSinglePeek();
		class16.testMultiplePeek();
		class16.testIteratorExhausted();
		class16.testIllegalRemove();
		org.apache.commons.collections4.iterators.FilterListIteratorTest class17 = new org.apache.commons.collections4.iterators.FilterListIteratorTest();
		class17.setUp();
		try {
			class17.tearDown();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class17.testWalkLists();
		class17.testManual();
		class17.testTruePredicate();
		class17.testFalsePredicate();
		class17.testEvens();
		class17.testOdds();
		class17.testThrees();
		class17.testFours();
		class17.testNestedSixes();
		class17.testNestedSixes2();
		class17.testNestedSixes3();
		class17.testNextChangesPrevious();
		class17.testPreviousChangesNext();
		class17.testFailingHasNextBug();
		try {
			class17.testCollections360();
		}
		catch (java.lang.Throwable err14) {
			err14.printStackTrace();
		}
		org.apache.commons.collections4.iterators.FilterIteratorTest class18 = new org.apache.commons.collections4.iterators.FilterIteratorTest(null);
		class18.testRepeatedHasNext();
		class18.testRepeatedNext();
		class18.testReturnValues();
		class18.testSetIterator();
		class18.testSetPredicate();
		org.apache.commons.collections4.iterators.PushbackIteratorTest class19 = new org.apache.commons.collections4.iterators.PushbackIteratorTest(null);
		class19.testNormalIteration();
		class19.testImmediatePushback();
		class19.testDelayedPushback();
		class19.testMultiplePushback();
		org.apache.commons.collections4.iterators.ObjectArrayIteratorTest class20 = new org.apache.commons.collections4.iterators.ObjectArrayIteratorTest(null);
		class20.testIterator();
		class20.testNullArray();
		class20.testReset();
		org.apache.commons.collections4.iterators.ReverseListIteratorTest class21 = new org.apache.commons.collections4.iterators.ReverseListIteratorTest(null);
		class21.testEmptyListIteratorIsIndeedEmpty();
		class21.testWalkForwardAndBack();
		class21.testReverse();
		class21.testReset();
		org.apache.commons.collections4.iterators.IteratorChainTest class22 = new org.apache.commons.collections4.iterators.IteratorChainTest(null);
		class22.testIterator();
		class22.testRemoveFromFilteredIterator();
		class22.testRemove();
		class22.testFirstIteratorIsEmptyBug();
		class22.testEmptyChain();
		org.apache.commons.collections4.iterators.SingletonIterator2Test class23 = new org.apache.commons.collections4.iterators.SingletonIterator2Test(null);
		class23.testIterator();
		class23.testReset();
		org.apache.commons.collections4.iterators.UniqueFilterIteratorTest class24 = new org.apache.commons.collections4.iterators.UniqueFilterIteratorTest(null);
		class24.testIterator();
		org.apache.commons.collections4.iterators.BoundedIteratorTest class25 = new org.apache.commons.collections4.iterators.BoundedIteratorTest(null);
		class25.testBounded();
		class25.testSameAsDecorated();
		class25.testEmptyBounded();
		class25.testNegativeOffset();
		class25.testNegativeMax();
		class25.testOffsetGreaterThanSize();
		class25.testMaxGreaterThanSize();
		class25.testRemoveWithoutCallingNext();
		class25.testRemoveCalledTwice();
		class25.testRemoveFirst();
		class25.testRemoveMiddle();
		class25.testRemoveLast();
		class25.testRemoveUnsupported();
		org.apache.commons.collections4.iterators.SkippingIteratorTest class26 = new org.apache.commons.collections4.iterators.SkippingIteratorTest(null);
		class26.testSkipping();
		class26.testSameAsDecorated();
		class26.testOffsetGreaterThanSize();
		class26.testNegativeOffset();
		class26.testRemoveWithoutCallingNext();
		class26.testRemoveCalledTwice();
		class26.testRemoveFirst();
		class26.testRemoveMiddle();
		class26.testRemoveLast();
		class26.testRemoveUnsupported();
		org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest class27 = new org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest(null);
		class27.testListIterator();
		class27.testDecorateFactory();
		org.apache.commons.collections4.iterators.ArrayIteratorTest class28 = new org.apache.commons.collections4.iterators.ArrayIteratorTest(null);
		class28.testIterator();
		class28.testNullArray();
		class28.testReset();
		org.apache.commons.collections4.iterators.UnmodifiableIteratorTest class29 = new org.apache.commons.collections4.iterators.UnmodifiableIteratorTest(null);
		class29.testIterator();
		class29.testDecorateFactory();
		org.apache.commons.collections4.iterators.CollatingIteratorTest class30 = new org.apache.commons.collections4.iterators.CollatingIteratorTest(null);
		class30.testGetSetComparator();
		class30.testIterateEven();
		class30.testIterateEvenOdd();
		class30.testIterateOddEven();
		class30.testIterateEvenEven();
		class30.testIterateFibEvenOdd();
		class30.testRemoveFromSingle();
		class30.testRemoveFromDouble();
		class30.testNullComparator();
		org.apache.commons.collections4.iterators.PermutationIteratorTest class31 = new org.apache.commons.collections4.iterators.PermutationIteratorTest(null);
		class31.testPermutationResultSize();
		class31.testPermutationExhaustivity();
		class31.testPermutationUnicity();
		class31.testPermutationException();
		class31.testPermutatorHasMore();
		class31.testEmptyCollection();
		org.apache.commons.collections4.iterators.SingletonListIteratorTest class32 = new org.apache.commons.collections4.iterators.SingletonListIteratorTest(null);
		class32.testIterator();
		class32.testReset();
		org.apache.commons.collections4.iterators.ObjectGraphIteratorTest class33 = new org.apache.commons.collections4.iterators.ObjectGraphIteratorTest(null);
		class33.testIteratorConstructor_null1();
		class33.testIteratorConstructor_null_next();
		class33.testIteratorConstructor_null_remove();
		class33.testIteratorConstructorIteration_Empty();
		class33.testIteratorConstructorIteration_Simple();
		class33.testIteratorConstructorIteration_SimpleNoHasNext();
		class33.testIteratorConstructorIteration_WithEmptyIterators();
		class33.testIteratorConstructorRemove();
		class33.testIteration_IteratorOfIterators();
		class33.testIteration_IteratorOfIteratorsWithEmptyIterators();
		class33.testIteration_RootNull();
		class33.testIteration_RootNoTransformer();
		class33.testIteration_Transformed1();
		class33.testIteration_Transformed2();
		class33.testIteration_Transformed3();
	}
}