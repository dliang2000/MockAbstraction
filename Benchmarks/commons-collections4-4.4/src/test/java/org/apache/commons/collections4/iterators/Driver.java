package org.apache.commons.collections4.iterators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.iterators.SkippingIteratorTest class1 = new org.apache.commons.collections4.iterators.SkippingIteratorTest();
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
		org.apache.commons.collections4.iterators.ArrayIteratorTest class2 = new org.apache.commons.collections4.iterators.ArrayIteratorTest();
		class2.testIterator();
		class2.testNullArray();
		class2.testReset();
		org.apache.commons.collections4.iterators.PermutationIteratorTest class3 = new org.apache.commons.collections4.iterators.PermutationIteratorTest();
		class3.testPermutationResultSize();
		class3.testPermutationExhaustivity();
		class3.testPermutationUnicity();
		class3.testPermutationException();
		class3.testPermutatorHasMore();
		class3.testEmptyCollection();
		org.apache.commons.collections4.iterators.FilterIteratorTest class4 = new org.apache.commons.collections4.iterators.FilterIteratorTest();
		class4.testRepeatedHasNext();
		class4.testRepeatedNext();
		class4.testReturnValues();
		class4.testSetIterator();
		class4.testSetPredicate();
		org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest class5 = new org.apache.commons.collections4.iterators.ObjectArrayListIteratorTest();
		class5.testListIterator();
		class5.testListIteratorSet();
		org.apache.commons.collections4.iterators.LazyIteratorChainTest class6 = new org.apache.commons.collections4.iterators.LazyIteratorChainTest();
		class6.testIterator();
		class6.testRemoveFromFilteredIterator();
		class6.testRemove();
		class6.testFirstIteratorIsEmptyBug();
		class6.testEmptyChain();
		org.apache.commons.collections4.iterators.ListIteratorWrapperTest class7 = new org.apache.commons.collections4.iterators.ListIteratorWrapperTest();
		class7.testIterator();
		class7.testRemove();
		class7.testReset();
		org.apache.commons.collections4.iterators.ListIteratorWrapper2Test class8 = new org.apache.commons.collections4.iterators.ListIteratorWrapper2Test();
		class8.testIterator();
		class8.testRemove();
		class8.testReset();
		org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest class9 = new org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorTest();
		class9.testOrderedMapIterator();
		class9.testDecorateFactory();
		org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest class10 = new org.apache.commons.collections4.iterators.UnmodifiableMapIteratorTest();
		class10.testMapIterator();
		class10.testDecorateFactory();
		org.apache.commons.collections4.iterators.IteratorChainTest class11 = new org.apache.commons.collections4.iterators.IteratorChainTest();
		class11.testIterator();
		class11.testRemoveFromFilteredIterator();
		class11.testRemove();
		class11.testFirstIteratorIsEmptyBug();
		class11.testEmptyChain();
		org.apache.commons.collections4.iterators.UniqueFilterIteratorTest class12 = new org.apache.commons.collections4.iterators.UniqueFilterIteratorTest();
		class12.testIterator();
		org.apache.commons.collections4.iterators.CollatingIteratorTest class13 = new org.apache.commons.collections4.iterators.CollatingIteratorTest();
		class13.testGetSetComparator();
		class13.testIterateEven();
		class13.testIterateEvenOdd();
		class13.testIterateOddEven();
		class13.testIterateEvenEven();
		class13.testIterateFibEvenOdd();
		class13.testRemoveFromSingle();
		class13.testRemoveFromDouble();
		class13.testNullComparator();
		org.apache.commons.collections4.iterators.SingletonIterator2Test class14 = new org.apache.commons.collections4.iterators.SingletonIterator2Test();
		class14.testIterator();
		class14.testReset();
		org.apache.commons.collections4.iterators.BoundedIteratorTest class15 = new org.apache.commons.collections4.iterators.BoundedIteratorTest();
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
		org.apache.commons.collections4.iterators.ArrayListIterator2Test class16 = new org.apache.commons.collections4.iterators.ArrayListIterator2Test();
		org.apache.commons.collections4.iterators.ReverseListIteratorTest class17 = new org.apache.commons.collections4.iterators.ReverseListIteratorTest();
		class17.testEmptyListIteratorIsIndeedEmpty();
		class17.testWalkForwardAndBack();
		class17.testReverse();
		class17.testReset();
		org.apache.commons.collections4.iterators.NodeListIteratorTest class18 = new org.apache.commons.collections4.iterators.NodeListIteratorTest();
		class18.testNullConstructor();
		class18.testEmptyIteratorWithNodeConstructor();
		class18.testFullIteratorWithNodeConstructor();
		org.apache.commons.collections4.iterators.ZippingIteratorTest class19 = new org.apache.commons.collections4.iterators.ZippingIteratorTest();
		class19.testIterateEven();
		class19.testIterateEvenOdd();
		class19.testIterateOddEven();
		class19.testIterateEvenEven();
		class19.testIterateFibEvenOdd();
		class19.testRemoveFromSingle();
		class19.testRemoveFromDouble();
		org.apache.commons.collections4.iterators.ObjectGraphIteratorTest class20 = new org.apache.commons.collections4.iterators.ObjectGraphIteratorTest();
		class20.testIteratorConstructor_null1();
		class20.testIteratorConstructor_null_next();
		class20.testIteratorConstructor_null_remove();
		class20.testIteratorConstructorIteration_Empty();
		class20.testIteratorConstructorIteration_Simple();
		class20.testIteratorConstructorIteration_SimpleNoHasNext();
		class20.testIteratorConstructorIteration_WithEmptyIterators();
		class20.testIteratorConstructorRemove();
		class20.testIteration_IteratorOfIterators();
		class20.testIteration_IteratorOfIteratorsWithEmptyIterators();
		class20.testIteration_RootNull();
		class20.testIteration_RootNoTransformer();
		class20.testIteration_Transformed1();
		class20.testIteration_Transformed2();
		class20.testIteration_Transformed3();
		org.apache.commons.collections4.iterators.PushbackIteratorTest class21 = new org.apache.commons.collections4.iterators.PushbackIteratorTest();
		class21.testNormalIteration();
		class21.testImmediatePushback();
		class21.testDelayedPushback();
		class21.testMultiplePushback();
		org.apache.commons.collections4.iterators.SingletonIteratorTest class22 = new org.apache.commons.collections4.iterators.SingletonIteratorTest();
		class22.testIterator();
		class22.testSingletonIteratorRemove();
		class22.testReset();
		org.apache.commons.collections4.iterators.LoopingIteratorTest class23 = new org.apache.commons.collections4.iterators.LoopingIteratorTest();
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
		try {
			class23.testLooping3();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class23.testRemoving1();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class23.testReset();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class23.testSize();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.apache.commons.collections4.iterators.IteratorEnumerationTest class24 = new org.apache.commons.collections4.iterators.IteratorEnumerationTest();
		class24.testEnumeration();
		org.apache.commons.collections4.iterators.SingletonListIteratorTest class25 = new org.apache.commons.collections4.iterators.SingletonListIteratorTest();
		class25.testIterator();
		class25.testReset();
		org.apache.commons.collections4.iterators.PeekingIteratorTest class26 = new org.apache.commons.collections4.iterators.PeekingIteratorTest();
		class26.testEmpty();
		class26.testSinglePeek();
		class26.testMultiplePeek();
		class26.testIteratorExhausted();
		class26.testIllegalRemove();
		org.apache.commons.collections4.iterators.FilterListIteratorTest class27 = new org.apache.commons.collections4.iterators.FilterListIteratorTest();
		class27.setUp();
		try {
			class27.tearDown();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		class27.testWalkLists();
		class27.testManual();
		class27.testTruePredicate();
		class27.testFalsePredicate();
		class27.testEvens();
		class27.testOdds();
		class27.testThrees();
		class27.testFours();
		class27.testNestedSixes();
		class27.testNestedSixes2();
		class27.testNestedSixes3();
		class27.testNextChangesPrevious();
		class27.testPreviousChangesNext();
		class27.testFailingHasNextBug();
		try {
			class27.testCollections360();
		}
		catch (java.lang.Throwable err10) {
			err10.printStackTrace();
		}
		org.apache.commons.collections4.iterators.LoopingListIteratorTest class28 = new org.apache.commons.collections4.iterators.LoopingListIteratorTest();
		try {
			class28.testConstructorEx();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class28.testLooping0();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class28.testLooping1();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class28.testLooping2();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		class28.testJoggingNotOverBoundary();
		class28.testJoggingOverBoundary();
		class28.testRemovingElementsAndIteratingForward();
		class28.testRemovingElementsAndIteratingBackwards();
		class28.testReset();
		class28.testAdd();
		class28.testNextAndPreviousIndex();
		class28.testSet();
		org.apache.commons.collections4.iterators.ArrayListIteratorTest class29 = new org.apache.commons.collections4.iterators.ArrayListIteratorTest();
		class29.testListIterator();
		class29.testListIteratorSet();
		org.apache.commons.collections4.iterators.ArrayIterator2Test class30 = new org.apache.commons.collections4.iterators.ArrayIterator2Test();
		class30.testIterator();
		class30.testIndexedArray();
		org.apache.commons.collections4.iterators.ObjectArrayListIterator2Test class31 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator2Test();
		org.apache.commons.collections4.iterators.ObjectArrayIteratorTest class32 = new org.apache.commons.collections4.iterators.ObjectArrayIteratorTest();
		class32.testIterator();
		class32.testNullArray();
		class32.testReset();
		org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest class33 = new org.apache.commons.collections4.iterators.UnmodifiableListIteratorTest();
		class33.testListIterator();
		class33.testDecorateFactory();
		org.apache.commons.collections4.iterators.IteratorIterableTest class34 = new org.apache.commons.collections4.iterators.IteratorIterableTest();
		class34.testIterator();
		class34.testMultipleUserIterator();
		org.apache.commons.collections4.iterators.UnmodifiableIteratorTest class35 = new org.apache.commons.collections4.iterators.UnmodifiableIteratorTest();
		class35.testIterator();
		class35.testDecorateFactory();
	}
}