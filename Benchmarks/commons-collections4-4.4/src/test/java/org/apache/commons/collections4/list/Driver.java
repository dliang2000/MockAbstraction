package org.apache.commons.collections4.list;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.list.FixedSizeListTest class1 = new org.apache.commons.collections4.list.FixedSizeListTest();
		class1.testListAllowsMutationOfUnderlyingCollection();
		org.apache.commons.collections4.list.SetUniqueListTest class2 = new org.apache.commons.collections4.list.SetUniqueListTest();
		class2.testAdd();
		class2.testAddAll();
		class2.testCollectionAddAll();
		class2.testCollectionIteratorRemove();
		class2.testCollections304();
		class2.testCollections307();
		class2.testCollections701();
		class2.testFactory();
		class2.testIntCollectionAddAll();
		class2.testListIterator();
		class2.testListIteratorAdd();
		class2.testListIteratorSet();
		class2.testListSetByIndex();
		class2.testRetainAll();
		class2.testRetainAllWithInitialList();
		class2.testSet();
		class2.testSetCollections444();
		class2.testSetDownwardsInList();
		class2.testSetInBiggerList();
		class2.testSetUpwardsInList();
		class2.testSubListIsUnmodifiable();
		class2.testUniqueListDoubleInsert();
		class2.testUniqueListReInsert();
		org.apache.commons.collections4.list.CursorableLinkedListTest class3 = new org.apache.commons.collections4.list.CursorableLinkedListTest();
		class3.testAdd();
		class3.testClear();
		class3.testContains();
		class3.testContainsAll();
		class3.testCursorNavigation();
		class3.testCursorSet();
		class3.testCursorRemove();
		class3.testCursorAdd();
		class3.testCursorConcurrentModification();
		class3.testCursorNextIndexMid();
		class3.testCursorNextIndexFirst();
		class3.testCursorNextIndexAddBefore();
		class3.testCursorNextIndexAddNext();
		class3.testCursorNextIndexAddAfter();
		class3.testInternalState_CursorNextNextPreviousRemoveIndex1ByList();
		class3.testInternalState_CursorNextRemoveIndex1ByList();
		class3.testInternalState_CursorNextNextRemoveIndex1ByList();
		class3.testInternalState_CursorNextNextNextRemoveIndex1ByList();
		class3.testInternalState_CursorNextNextPreviousRemoveByIterator();
		class3.testInternalState_CursorNextNextRemoveByIterator();
		class3.testInternalState_CursorNextNextPreviousAddIndex1ByList();
		class3.testInternalState_CursorNextAddIndex1ByList();
		class3.testInternalState_CursorNextNextAddIndex1ByList();
		class3.testInternalState_CursorNextNextPreviousAddByIterator();
		class3.testInternalState_CursorNextNextAddByIterator();
		class3.testInternalState_CursorNextNextRemoveByListSetByIterator();
		class3.testInternalState_CursorNextNextPreviousSetByIterator();
		class3.testInternalState_CursorNextNextSetByIterator();
		class3.testEqualsAndHashCode();
		class3.testGet();
		class3.testIndexOf();
		class3.testIsEmpty();
		class3.testIterator();
		class3.testListIteratorNavigation();
		class3.testListIteratorSet();
		class3.testListIteratorRemove();
		class3.testListIteratorAdd();
		class3.testRemoveAll();
		class3.testRemoveByIndex();
		class3.testRemove();
		class3.testRetainAll();
		class3.testSet();
		class3.testSubList();
		class3.testSubListAddEnd();
		class3.testSubListAddBegin();
		class3.testSubListAddMiddle();
		class3.testSubListRemove();
		class3.testToArray();
		try {
			class3.testSerialization();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class3.testSerializationWithOpenCursor();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.testLongSerialization();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.list.PredicatedListTest class4 = new org.apache.commons.collections4.list.PredicatedListTest();
		class4.testIllegalAdd();
		class4.testIllegalAddAll();
		class4.testIllegalSet();
		class4.testLegalAddAll();
		org.apache.commons.collections4.list.UnmodifiableListTest class5 = new org.apache.commons.collections4.list.UnmodifiableListTest();
		class5.testUnmodifiable();
		class5.testDecorateFactory();
		class5.testUnmodifiableIterator();
		org.apache.commons.collections4.list.Collections701Test class6 = new org.apache.commons.collections4.list.Collections701Test();
		class6.testArrayList();
		class6.testHashSet();
		class6.testSetUniqueList();
		org.apache.commons.collections4.list.TreeListTest class7 = new org.apache.commons.collections4.list.TreeListTest();
		class7.testAddMultiple();
		class7.testRemove();
		class7.testInsertBefore();
		class7.testIndexOf();
		class7.testBug35258();
		class7.testBugCollections447();
		class7.testIterationOrder();
		class7.testIterationOrderAfterAddAll();
		org.apache.commons.collections4.list.TransformedListTest class8 = new org.apache.commons.collections4.list.TransformedListTest();
		class8.testTransformedList();
		class8.testTransformedList_decorateTransform();
		org.apache.commons.collections4.list.NodeCachingLinkedListTest class9 = new org.apache.commons.collections4.list.NodeCachingLinkedListTest();
		class9.testShrinkCache();
		org.apache.commons.collections4.list.GrowthListTest class10 = new org.apache.commons.collections4.list.GrowthListTest();
		class10.testGrowthAdd();
		class10.testGrowthAddAll();
		class10.testGrowthSet1();
		class10.testGrowthSet2();
		class10.testListAddByIndexBoundsChecking();
		class10.testListAddByIndexBoundsChecking2();
		class10.testListSetByIndexBoundsChecking();
		class10.testListSetByIndexBoundsChecking2();
		org.apache.commons.collections4.list.LazyListTest class11 = new org.apache.commons.collections4.list.LazyListTest();
		class11.testSimpleSerialization();
		class11.testSerializeDeserializeThenCompare();
		class11.testCanonicalEmptyCollectionExists();
		class11.testCanonicalFullCollectionExists();
		class11.testElementCreationWithFactory();
		class11.testElementCreationWithTransformer();
		class11.testCreateNullGapsWithFactory();
		class11.testCreateNullGapsWithTransformer();
	}
}