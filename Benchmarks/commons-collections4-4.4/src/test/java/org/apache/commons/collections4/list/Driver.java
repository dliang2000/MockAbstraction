package org.apache.commons.collections4.list;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.list.UnmodifiableListTest class1 = new org.apache.commons.collections4.list.UnmodifiableListTest(null);
		class1.testUnmodifiable();
		class1.testDecorateFactory();
		class1.testUnmodifiableIterator();
		org.apache.commons.collections4.list.LazyListTest class2 = new org.apache.commons.collections4.list.LazyListTest(null);
		class2.testSimpleSerialization();
		class2.testSerializeDeserializeThenCompare();
		class2.testCanonicalEmptyCollectionExists();
		class2.testCanonicalFullCollectionExists();
		class2.testElementCreationWithFactory();
		class2.testElementCreationWithTransformer();
		class2.testCreateNullGapsWithFactory();
		class2.testCreateNullGapsWithTransformer();
		org.apache.commons.collections4.list.SetUniqueListTest class3 = new org.apache.commons.collections4.list.SetUniqueListTest(null);
		class3.testAdd();
		class3.testAddAll();
		class3.testCollectionAddAll();
		class3.testCollectionIteratorRemove();
		class3.testCollections304();
		class3.testCollections307();
		class3.testCollections701();
		class3.testFactory();
		class3.testIntCollectionAddAll();
		class3.testListIterator();
		class3.testListIteratorAdd();
		class3.testListIteratorSet();
		class3.testListSetByIndex();
		class3.testRetainAll();
		class3.testRetainAllWithInitialList();
		class3.testSet();
		class3.testSetCollections444();
		class3.testSetDownwardsInList();
		class3.testSetInBiggerList();
		class3.testSetUpwardsInList();
		class3.testSubListIsUnmodifiable();
		class3.testUniqueListDoubleInsert();
		class3.testUniqueListReInsert();
		org.apache.commons.collections4.list.TransformedListTest class4 = new org.apache.commons.collections4.list.TransformedListTest(null);
		class4.testTransformedList();
		class4.testTransformedList_decorateTransform();
		org.apache.commons.collections4.list.PredicatedListTest class5 = new org.apache.commons.collections4.list.PredicatedListTest(null);
		class5.testIllegalAdd();
		class5.testIllegalAddAll();
		class5.testIllegalSet();
		class5.testLegalAddAll();
		org.apache.commons.collections4.list.TreeListTest class6 = new org.apache.commons.collections4.list.TreeListTest(null);
		class6.testAddMultiple();
		class6.testRemove();
		class6.testInsertBefore();
		class6.testIndexOf();
		class6.testBug35258();
		class6.testBugCollections447();
		class6.testIterationOrder();
		class6.testIterationOrderAfterAddAll();
		org.apache.commons.collections4.list.FixedSizeListTest class7 = new org.apache.commons.collections4.list.FixedSizeListTest(null);
		class7.testListAllowsMutationOfUnderlyingCollection();
		org.apache.commons.collections4.list.NodeCachingLinkedListTest class8 = new org.apache.commons.collections4.list.NodeCachingLinkedListTest(null);
		class8.testShrinkCache();
		org.apache.commons.collections4.list.CursorableLinkedListTest class9 = new org.apache.commons.collections4.list.CursorableLinkedListTest(null);
		class9.testAdd();
		class9.testClear();
		class9.testContains();
		class9.testContainsAll();
		class9.testCursorNavigation();
		class9.testCursorSet();
		class9.testCursorRemove();
		class9.testCursorAdd();
		class9.testCursorConcurrentModification();
		class9.testCursorNextIndexMid();
		class9.testCursorNextIndexFirst();
		class9.testCursorNextIndexAddBefore();
		class9.testCursorNextIndexAddNext();
		class9.testCursorNextIndexAddAfter();
		class9.testInternalState_CursorNextNextPreviousRemoveIndex1ByList();
		class9.testInternalState_CursorNextRemoveIndex1ByList();
		class9.testInternalState_CursorNextNextRemoveIndex1ByList();
		class9.testInternalState_CursorNextNextNextRemoveIndex1ByList();
		class9.testInternalState_CursorNextNextPreviousRemoveByIterator();
		class9.testInternalState_CursorNextNextRemoveByIterator();
		class9.testInternalState_CursorNextNextPreviousAddIndex1ByList();
		class9.testInternalState_CursorNextAddIndex1ByList();
		class9.testInternalState_CursorNextNextAddIndex1ByList();
		class9.testInternalState_CursorNextNextPreviousAddByIterator();
		class9.testInternalState_CursorNextNextAddByIterator();
		class9.testInternalState_CursorNextNextRemoveByListSetByIterator();
		class9.testInternalState_CursorNextNextPreviousSetByIterator();
		class9.testInternalState_CursorNextNextSetByIterator();
		class9.testEqualsAndHashCode();
		class9.testGet();
		class9.testIndexOf();
		class9.testIsEmpty();
		class9.testIterator();
		class9.testListIteratorNavigation();
		class9.testListIteratorSet();
		class9.testListIteratorRemove();
		class9.testListIteratorAdd();
		class9.testRemoveAll();
		class9.testRemoveByIndex();
		class9.testRemove();
		class9.testRetainAll();
		class9.testSet();
		class9.testSubList();
		class9.testSubListAddEnd();
		class9.testSubListAddBegin();
		class9.testSubListAddMiddle();
		class9.testSubListRemove();
		class9.testToArray();
		try {
			class9.testSerialization();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class9.testSerializationWithOpenCursor();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class9.testLongSerialization();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.list.Collections701Test class10 = new org.apache.commons.collections4.list.Collections701Test();
		class10.testArrayList();
		class10.testHashSet();
		class10.testSetUniqueList();
		org.apache.commons.collections4.list.GrowthListTest class11 = new org.apache.commons.collections4.list.GrowthListTest(null);
		class11.testGrowthAdd();
		class11.testGrowthAddAll();
		class11.testGrowthSet1();
		class11.testGrowthSet2();
		class11.testListAddByIndexBoundsChecking();
		class11.testListAddByIndexBoundsChecking2();
		class11.testListSetByIndexBoundsChecking();
		class11.testListSetByIndexBoundsChecking2();
	}
}