package org.apache.commons.collections4.iterators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.iterators.ObjectArrayIteratorTest class1 = new org.apache.commons.collections4.iterators.ObjectArrayIteratorTest(null);
		class1.testIterator();
		class1.testNullArray();
		class1.testReset();
		org.apache.commons.collections4.iterators.FilterListIteratorTest class2 = new org.apache.commons.collections4.iterators.FilterListIteratorTest();
		class2.setUp();
		try {
			class2.tearDown();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class2.testWalkLists();
		class2.testManual();
		class2.testTruePredicate();
		class2.testFalsePredicate();
		class2.testEvens();
		class2.testOdds();
		class2.testThrees();
		class2.testFours();
		class2.testNestedSixes();
		class2.testNestedSixes2();
		class2.testNestedSixes3();
		class2.testNextChangesPrevious();
		class2.testPreviousChangesNext();
		class2.testFailingHasNextBug();
		try {
			class2.testCollections360();
		}
		catch (java.lang.Throwable err2) {
			err2.printStackTrace();
		}
		org.apache.commons.collections4.iterators.LoopingIteratorTest class3 = new org.apache.commons.collections4.iterators.LoopingIteratorTest();
		try {
			class3.testConstructorEx();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.testLooping0();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class3.testLooping1();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class3.testLooping2();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class3.testLooping3();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class3.testRemoving1();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.testReset();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class3.testSize();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest class4 = new org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest(null);
		class4.testListIterator();
		class4.testDecorateFactory();
		org.apache.commons.collections4.iterators.ArrayListIteratorTest class5 = new org.apache.commons.collections4.iterators.ArrayListIteratorTest(null);
		class5.testListIterator();
		class5.testListIteratorSet();
		org.apache.commons.collections4.iterators.PermutationIteratorTest class6 = new org.apache.commons.collections4.iterators.PermutationIteratorTest(null);
		class6.testPermutationResultSize();
		class6.testPermutationExhaustivity();
		class6.testPermutationUnicity();
		class6.testPermutationException();
		class6.testPermutatorHasMore();
		class6.testEmptyCollection();
		org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest class7 = new org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest(null);
		class7.testListIterator();
		class7.testListIteratorSet();
		org.apache.commons.collections4.iterators.LoopingListIteratorTest class8 = new org.apache.commons.collections4.iterators.LoopingListIteratorTest();
		try {
			class8.testConstructorEx();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class8.testLooping0();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class8.testLooping1();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class8.testLooping2();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		class8.testJoggingNotOverBoundary();
		class8.testJoggingOverBoundary();
		class8.testRemovingElementsAndIteratingForward();
		class8.testRemovingElementsAndIteratingBackwards();
		class8.testReset();
		class8.testAdd();
		class8.testNextAndPreviousIndex();
		class8.testSet();
		org.apache.commons.collections4.iterators.CollatingIteratorTest class9 = new org.apache.commons.collections4.iterators.CollatingIteratorTest(null);
		class9.testGetSetComparator();
		class9.testIterateEven();
		class9.testIterateEvenOdd();
		class9.testIterateOddEven();
		class9.testIterateEvenEven();
		class9.testIterateFibEvenOdd();
		class9.testRemoveFromSingle();
		class9.testRemoveFromDouble();
		class9.testNullComparator();
		org.apache.commons.collections4.iterators.UniqueFilterIteratorTest class10 = new org.apache.commons.collections4.iterators.UniqueFilterIteratorTest(null);
		class10.testIterator();
		org.apache.commons.collections4.iterators.UnmodifiableIteratorTest class11 = new org.apache.commons.collections4.iterators.UnmodifiableIteratorTest(null);
		class11.testIterator();
		class11.testDecorateFactory();
		org.apache.commons.collections4.iterators.SkippingIteratorTest class12 = new org.apache.commons.collections4.iterators.SkippingIteratorTest(null);
		class12.testSkipping();
		class12.testSameAsDecorated();
		class12.testOffsetGreaterThanSize();
		class12.testNegativeOffset();
		class12.testRemoveWithoutCallingNext();
		class12.testRemoveCalledTwice();
		class12.testRemoveFirst();
		class12.testRemoveMiddle();
		class12.testRemoveLast();
		class12.testRemoveUnsupported();
		org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest class13 = new org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest(null);
		class13.testMapIterator();
		class13.testDecorateFactory();
		org.apache.commons.collections4.iterators.ArrayIteratorTest class14 = new org.apache.commons.collections4.iterators.ArrayIteratorTest(null);
		class14.testIterator();
		class14.testNullArray();
		class14.testReset();
		org.apache.commons.collections4.iterators.ArrayIterator2Test class15 = new org.apache.commons.collections4.iterators.ArrayIterator2Test(null);
		class15.testIterator();
		class15.testIndexedArray();
		org.apache.commons.collections4.iterators.SingletonIterator2Test class16 = new org.apache.commons.collections4.iterators.SingletonIterator2Test(null);
		class16.testIterator();
		class16.testReset();
		org.apache.commons.collections4.iterators.IteratorIterableTest class17 = new org.apache.commons.collections4.iterators.IteratorIterableTest(null);
		class17.testIterator();
		class17.testMultipleUserIterator();
		org.apache.commons.collections4.iterators.BoundedIteratorTest class18 = new org.apache.commons.collections4.iterators.BoundedIteratorTest(null);
		class18.testBounded();
		class18.testSameAsDecorated();
		class18.testEmptyBounded();
		class18.testNegativeOffset();
		class18.testNegativeMax();
		class18.testOffsetGreaterThanSize();
		class18.testMaxGreaterThanSize();
		class18.testRemoveWithoutCallingNext();
		class18.testRemoveCalledTwice();
		class18.testRemoveFirst();
		class18.testRemoveMiddle();
		class18.testRemoveLast();
		class18.testRemoveUnsupported();
		org.apache.commons.collections4.iterators.ZippingIteratorTest class19 = new org.apache.commons.collections4.iterators.ZippingIteratorTest(null);
		class19.testIterateEven();
		class19.testIterateEvenOdd();
		class19.testIterateOddEven();
		class19.testIterateEvenEven();
		class19.testIterateFibEvenOdd();
		class19.testRemoveFromSingle();
		class19.testRemoveFromDouble();
		org.apache.commons.collections4.iterators.IteratorEnumerationTest class20 = new org.apache.commons.collections4.iterators.IteratorEnumerationTest();
		class20.testEnumeration();
		org.apache.commons.collections4.iterators.ListIteratorWrapper2Test class21 = new org.apache.commons.collections4.iterators.ListIteratorWrapper2Test(null);
		class21.testIterator();
		class21.testRemove();
		class21.testReset();
		org.apache.commons.collections4.iterators.SingletonListIteratorTest class22 = new org.apache.commons.collections4.iterators.SingletonListIteratorTest(null);
		class22.testIterator();
		class22.testReset();
		org.apache.commons.collections4.iterators.SingletonIteratorTest class23 = new org.apache.commons.collections4.iterators.SingletonIteratorTest(null);
		class23.testIterator();
		class23.testSingletonIteratorRemove();
		class23.testReset();
		org.apache.commons.collections4.iterators.ReverseListIteratorTest class24 = new org.apache.commons.collections4.iterators.ReverseListIteratorTest(null);
		class24.testEmptyListIteratorIsIndeedEmpty();
		class24.testWalkForwardAndBack();
		class24.testReverse();
		class24.testReset();
		org.apache.commons.collections4.iterators.ObjectGraphIteratorTest class25 = new org.apache.commons.collections4.iterators.ObjectGraphIteratorTest(null);
		class25.testIteratorConstructor_null1();
		class25.testIteratorConstructor_null_next();
		class25.testIteratorConstructor_null_remove();
		class25.testIteratorConstructorIteration_Empty();
		class25.testIteratorConstructorIteration_Simple();
		class25.testIteratorConstructorIteration_SimpleNoHasNext();
		class25.testIteratorConstructorIteration_WithEmptyIterators();
		class25.testIteratorConstructorRemove();
		class25.testIteration_IteratorOfIterators();
		class25.testIteration_IteratorOfIteratorsWithEmptyIterators();
		class25.testIteration_RootNull();
		class25.testIteration_RootNoTransformer();
		class25.testIteration_Transformed1();
		class25.testIteration_Transformed2();
		class25.testIteration_Transformed3();
		org.apache.commons.collections4.iterators.ListIteratorWrapperTest class26 = new org.apache.commons.collections4.iterators.ListIteratorWrapperTest(null);
		class26.testIterator();
		class26.testRemove();
		class26.testReset();
		org.apache.commons.collections4.iterators.NodeListIteratorTest class27 = new org.apache.commons.collections4.iterators.NodeListIteratorTest(null);
		class27.testNullConstructor();
		class27.testEmptyIteratorWithNodeConstructor();
		class27.testFullIteratorWithNodeConstructor();
		org.apache.commons.collections4.iterators.FilterIteratorTest class28 = new org.apache.commons.collections4.iterators.FilterIteratorTest(null);
		class28.testRepeatedHasNext();
		class28.testRepeatedNext();
		class28.testReturnValues();
		class28.testSetIterator();
		class28.testSetPredicate();
		org.apache.commons.collections4.iterators.LazyIteratorChainTest class29 = new org.apache.commons.collections4.iterators.LazyIteratorChainTest(null);
		class29.testIterator();
		class29.testRemoveFromFilteredIterator();
		class29.testRemove();
		class29.testFirstIteratorIsEmptyBug();
		class29.testEmptyChain();
		org.apache.commons.collections4.iterators.IteratorChainTest class30 = new org.apache.commons.collections4.iterators.IteratorChainTest(null);
		class30.testIterator();
		class30.testRemoveFromFilteredIterator();
		class30.testRemove();
		class30.testFirstIteratorIsEmptyBug();
		class30.testEmptyChain();
		org.apache.commons.collections4.iterators.PeekingIteratorTest class31 = new org.apache.commons.collections4.iterators.PeekingIteratorTest(null);
		class31.testEmpty();
		class31.testSinglePeek();
		class31.testMultiplePeek();
		class31.testIteratorExhausted();
		class31.testIllegalRemove();
		org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest class32 = new org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest(null);
		class32.testOrderedMapIterator();
		class32.testDecorateFactory();
		org.apache.commons.collections4.iterators.PushbackIteratorTest class33 = new org.apache.commons.collections4.iterators.PushbackIteratorTest(null);
		class33.testNormalIteration();
		class33.testImmediatePushback();
		class33.testDelayedPushback();
		class33.testMultiplePushback();
	}
}