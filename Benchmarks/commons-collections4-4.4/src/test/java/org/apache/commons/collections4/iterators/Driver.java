package org.apache.commons.collections4.iterators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.iterators.SkippingIteratorTest class1 = new org.apache.commons.collections4.iterators.SkippingIteratorTest(null);
		class1.testSkipping();
		class1.testSameAsDecorated();
		class1.testOffsetGreaterThanSize();
		class1.testNegativeOffset();
		class1.testRemoveWithoutCallingNext();
		class1.testRemoveCalledTwice();
		class1.testRemoveFirst();
		class1.testRemoveMiddle();
		class1.testRemoveLast();
		class1.testRemoveUnsupported();
		org.apache.commons.collections4.iterators.ArrayIteratorTest class2 = new org.apache.commons.collections4.iterators.ArrayIteratorTest(null);
		class2.testIterator();
		class2.testNullArray();
		class2.testReset();
		org.apache.commons.collections4.iterators.PermutationIteratorTest class3 = new org.apache.commons.collections4.iterators.PermutationIteratorTest(null);
		class3.testPermutationResultSize();
		class3.testPermutationExhaustivity();
		class3.testPermutationUnicity();
		class3.testPermutationException();
		class3.testPermutatorHasMore();
		class3.testEmptyCollection();
		org.apache.commons.collections4.iterators.FilterIteratorTest class4 = new org.apache.commons.collections4.iterators.FilterIteratorTest(null);
		class4.testRepeatedHasNext();
		class4.testRepeatedNext();
		class4.testReturnValues();
		class4.testSetIterator();
		class4.testSetPredicate();
		org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest class5 = new org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest(null);
		class5.testListIterator();
		class5.testListIteratorSet();
		org.apache.commons.collections4.iterators.LazyIteratorChainTest class6 = new org.apache.commons.collections4.iterators.LazyIteratorChainTest(null);
		class6.testIterator();
		class6.testRemoveFromFilteredIterator();
		class6.testRemove();
		class6.testFirstIteratorIsEmptyBug();
		class6.testEmptyChain();
		org.apache.commons.collections4.iterators.ListIteratorWrapperTest class7 = new org.apache.commons.collections4.iterators.ListIteratorWrapperTest(null);
		class7.testIterator();
		class7.testRemove();
		class7.testReset();
		org.apache.commons.collections4.iterators.ListIteratorWrapper2Test class8 = new org.apache.commons.collections4.iterators.ListIteratorWrapper2Test(null);
		class8.testIterator();
		class8.testRemove();
		class8.testReset();
		org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest class9 = new org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest(null);
		class9.testOrderedMapIterator();
		class9.testDecorateFactory();
		org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest class10 = new org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest(null);
		class10.testMapIterator();
		class10.testDecorateFactory();
		org.apache.commons.collections4.iterators.IteratorChainTest class11 = new org.apache.commons.collections4.iterators.IteratorChainTest(null);
		class11.testIterator();
		class11.testRemoveFromFilteredIterator();
		class11.testRemove();
		class11.testFirstIteratorIsEmptyBug();
		class11.testEmptyChain();
		org.apache.commons.collections4.iterators.UniqueFilterIteratorTest class12 = new org.apache.commons.collections4.iterators.UniqueFilterIteratorTest(null);
		class12.testIterator();
		org.apache.commons.collections4.iterators.CollatingIteratorTest class13 = new org.apache.commons.collections4.iterators.CollatingIteratorTest(null);
		class13.testGetSetComparator();
		class13.testIterateEven();
		class13.testIterateEvenOdd();
		class13.testIterateOddEven();
		class13.testIterateEvenEven();
		class13.testIterateFibEvenOdd();
		class13.testRemoveFromSingle();
		class13.testRemoveFromDouble();
		class13.testNullComparator();
		org.apache.commons.collections4.iterators.SingletonIterator2Test class14 = new org.apache.commons.collections4.iterators.SingletonIterator2Test(null);
		class14.testIterator();
		class14.testReset();
		org.apache.commons.collections4.iterators.BoundedIteratorTest class15 = new org.apache.commons.collections4.iterators.BoundedIteratorTest(null);
		class15.testBounded();
		class15.testSameAsDecorated();
		class15.testEmptyBounded();
		class15.testNegativeOffset();
		class15.testNegativeMax();
		class15.testOffsetGreaterThanSize();
		class15.testMaxGreaterThanSize();
		class15.testRemoveWithoutCallingNext();
		class15.testRemoveCalledTwice();
		class15.testRemoveFirst();
		class15.testRemoveMiddle();
		class15.testRemoveLast();
		class15.testRemoveUnsupported();
		org.apache.commons.collections4.iterators.ReverseListIteratorTest class16 = new org.apache.commons.collections4.iterators.ReverseListIteratorTest(null);
		class16.testEmptyListIteratorIsIndeedEmpty();
		class16.testWalkForwardAndBack();
		class16.testReverse();
		class16.testReset();
		org.apache.commons.collections4.iterators.NodeListIteratorTest class17 = new org.apache.commons.collections4.iterators.NodeListIteratorTest(null);
		class17.testNullConstructor();
		class17.testEmptyIteratorWithNodeConstructor();
		class17.testFullIteratorWithNodeConstructor();
		org.apache.commons.collections4.iterators.ZippingIteratorTest class18 = new org.apache.commons.collections4.iterators.ZippingIteratorTest(null);
		class18.testIterateEven();
		class18.testIterateEvenOdd();
		class18.testIterateOddEven();
		class18.testIterateEvenEven();
		class18.testIterateFibEvenOdd();
		class18.testRemoveFromSingle();
		class18.testRemoveFromDouble();
		org.apache.commons.collections4.iterators.ObjectGraphIteratorTest class19 = new org.apache.commons.collections4.iterators.ObjectGraphIteratorTest(null);
		class19.testIteratorConstructor_null1();
		class19.testIteratorConstructor_null_next();
		class19.testIteratorConstructor_null_remove();
		class19.testIteratorConstructorIteration_Empty();
		class19.testIteratorConstructorIteration_Simple();
		class19.testIteratorConstructorIteration_SimpleNoHasNext();
		class19.testIteratorConstructorIteration_WithEmptyIterators();
		class19.testIteratorConstructorRemove();
		class19.testIteration_IteratorOfIterators();
		class19.testIteration_IteratorOfIteratorsWithEmptyIterators();
		class19.testIteration_RootNull();
		class19.testIteration_RootNoTransformer();
		class19.testIteration_Transformed1();
		class19.testIteration_Transformed2();
		class19.testIteration_Transformed3();
		org.apache.commons.collections4.iterators.PushbackIteratorTest class20 = new org.apache.commons.collections4.iterators.PushbackIteratorTest(null);
		class20.testNormalIteration();
		class20.testImmediatePushback();
		class20.testDelayedPushback();
		class20.testMultiplePushback();
		org.apache.commons.collections4.iterators.SingletonIteratorTest class21 = new org.apache.commons.collections4.iterators.SingletonIteratorTest(null);
		class21.testIterator();
		class21.testSingletonIteratorRemove();
		class21.testReset();
		org.apache.commons.collections4.iterators.LoopingIteratorTest class22 = new org.apache.commons.collections4.iterators.LoopingIteratorTest();
		try {
			class22.testConstructorEx();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class22.testLooping0();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class22.testLooping1();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class22.testLooping2();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class22.testLooping3();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class22.testRemoving1();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class22.testReset();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class22.testSize();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.apache.commons.collections4.iterators.IteratorEnumerationTest class23 = new org.apache.commons.collections4.iterators.IteratorEnumerationTest();
		class23.testEnumeration();
		org.apache.commons.collections4.iterators.SingletonListIteratorTest class24 = new org.apache.commons.collections4.iterators.SingletonListIteratorTest(null);
		class24.testIterator();
		class24.testReset();
		org.apache.commons.collections4.iterators.PeekingIteratorTest class25 = new org.apache.commons.collections4.iterators.PeekingIteratorTest(null);
		class25.testEmpty();
		class25.testSinglePeek();
		class25.testMultiplePeek();
		class25.testIteratorExhausted();
		class25.testIllegalRemove();
		org.apache.commons.collections4.iterators.FilterListIteratorTest class26 = new org.apache.commons.collections4.iterators.FilterListIteratorTest();
		class26.setUp();
		try {
			class26.tearDown();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		class26.testWalkLists();
		class26.testManual();
		class26.testTruePredicate();
		class26.testFalsePredicate();
		class26.testEvens();
		class26.testOdds();
		class26.testThrees();
		class26.testFours();
		class26.testNestedSixes();
		class26.testNestedSixes2();
		class26.testNestedSixes3();
		class26.testNextChangesPrevious();
		class26.testPreviousChangesNext();
		class26.testFailingHasNextBug();
		try {
			class26.testCollections360();
		}
		catch (java.lang.Throwable err10) {
			err10.printStackTrace();
		}
		org.apache.commons.collections4.iterators.LoopingListIteratorTest class27 = new org.apache.commons.collections4.iterators.LoopingListIteratorTest();
		try {
			class27.testConstructorEx();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class27.testLooping0();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class27.testLooping1();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class27.testLooping2();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		class27.testJoggingNotOverBoundary();
		class27.testJoggingOverBoundary();
		class27.testRemovingElementsAndIteratingForward();
		class27.testRemovingElementsAndIteratingBackwards();
		class27.testReset();
		class27.testAdd();
		class27.testNextAndPreviousIndex();
		class27.testSet();
		org.apache.commons.collections4.iterators.ArrayListIteratorTest class28 = new org.apache.commons.collections4.iterators.ArrayListIteratorTest(null);
		class28.testListIterator();
		class28.testListIteratorSet();
		org.apache.commons.collections4.iterators.ArrayIterator2Test class29 = new org.apache.commons.collections4.iterators.ArrayIterator2Test(null);
		class29.testIterator();
		class29.testIndexedArray();
		org.apache.commons.collections4.iterators.ObjectArrayIteratorTest class30 = new org.apache.commons.collections4.iterators.ObjectArrayIteratorTest(null);
		class30.testIterator();
		class30.testNullArray();
		class30.testReset();
		org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest class31 = new org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest(null);
		class31.testListIterator();
		class31.testDecorateFactory();
		org.apache.commons.collections4.iterators.IteratorIterableTest class32 = new org.apache.commons.collections4.iterators.IteratorIterableTest(null);
		class32.testIterator();
		class32.testMultipleUserIterator();
		org.apache.commons.collections4.iterators.UnmodifiableIteratorTest class33 = new org.apache.commons.collections4.iterators.UnmodifiableIteratorTest(null);
		class33.testIterator();
		class33.testDecorateFactory();
	}
}