package org.apache.commons.collections4.list;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.list.TransformedListTest class1 = new org.apache.commons.collections4.list.TransformedListTest(null);
		class1.testTransformedList();
		class1.testTransformedList_decorateTransform();
		org.apache.commons.collections4.list.PredicatedListTest class2 = new org.apache.commons.collections4.list.PredicatedListTest(null);
		class2.testIllegalAdd();
		class2.testIllegalAddAll();
		class2.testIllegalSet();
		class2.testLegalAddAll();
		org.apache.commons.collections4.list.UnmodifiableListTest class3 = new org.apache.commons.collections4.list.UnmodifiableListTest(null);
		class3.testUnmodifiable();
		class3.testDecorateFactory();
		class3.testUnmodifiableIterator();
		org.apache.commons.collections4.list.LazyListTest class4 = new org.apache.commons.collections4.list.LazyListTest(null);
		class4.testSimpleSerialization();
		class4.testSerializeDeserializeThenCompare();
		class4.testCanonicalEmptyCollectionExists();
		class4.testCanonicalFullCollectionExists();
		class4.testElementCreationWithFactory();
		class4.testElementCreationWithTransformer();
		class4.testCreateNullGapsWithFactory();
		class4.testCreateNullGapsWithTransformer();
		org.apache.commons.collections4.list.GrowthListTest class5 = new org.apache.commons.collections4.list.GrowthListTest(null);
		class5.testGrowthAdd();
		class5.testGrowthAddAll();
		class5.testGrowthSet1();
		class5.testGrowthSet2();
		class5.testListAddByIndexBoundsChecking();
		class5.testListAddByIndexBoundsChecking2();
		class5.testListSetByIndexBoundsChecking();
		class5.testListSetByIndexBoundsChecking2();
		org.apache.commons.collections4.list.CursorableLinkedListTest class6 = new org.apache.commons.collections4.list.CursorableLinkedListTest(null);
		class6.testAdd();
		class6.testClear();
		class6.testContains();
		class6.testContainsAll();
		class6.testCursorNavigation();
		class6.testCursorSet();
		class6.testCursorRemove();
		class6.testCursorAdd();
		class6.testCursorConcurrentModification();
		class6.testCursorNextIndexMid();
		class6.testCursorNextIndexFirst();
		class6.testCursorNextIndexAddBefore();
		class6.testCursorNextIndexAddNext();
		class6.testCursorNextIndexAddAfter();
		class6.testInternalState_CursorNextNextPreviousRemoveIndex1ByList();
		class6.testInternalState_CursorNextRemoveIndex1ByList();
		class6.testInternalState_CursorNextNextRemoveIndex1ByList();
		class6.testInternalState_CursorNextNextNextRemoveIndex1ByList();
		class6.testInternalState_CursorNextNextPreviousRemoveByIterator();
		class6.testInternalState_CursorNextNextRemoveByIterator();
		class6.testInternalState_CursorNextNextPreviousAddIndex1ByList();
		class6.testInternalState_CursorNextAddIndex1ByList();
		class6.testInternalState_CursorNextNextAddIndex1ByList();
		class6.testInternalState_CursorNextNextPreviousAddByIterator();
		class6.testInternalState_CursorNextNextAddByIterator();
		class6.testInternalState_CursorNextNextRemoveByListSetByIterator();
		class6.testInternalState_CursorNextNextPreviousSetByIterator();
		class6.testInternalState_CursorNextNextSetByIterator();
		class6.testEqualsAndHashCode();
		class6.testGet();
		class6.testIndexOf();
		class6.testIsEmpty();
		class6.testIterator();
		class6.testListIteratorNavigation();
		class6.testListIteratorSet();
		class6.testListIteratorRemove();
		class6.testListIteratorAdd();
		class6.testRemoveAll();
		class6.testRemoveByIndex();
		class6.testRemove();
		class6.testRetainAll();
		class6.testSet();
		class6.testSubList();
		class6.testSubListAddEnd();
		class6.testSubListAddBegin();
		class6.testSubListAddMiddle();
		class6.testSubListRemove();
		class6.testToArray();
		try {
			class6.testSerialization();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class6.testSerializationWithOpenCursor();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class6.testLongSerialization();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.list.TreeListTest class7 = new org.apache.commons.collections4.list.TreeListTest(null);
		class7.testAddMultiple();
		class7.testRemove();
		class7.testInsertBefore();
		class7.testIndexOf();
		class7.testBug35258();
		class7.testBugCollections447();
		class7.testIterationOrder();
		class7.testIterationOrderAfterAddAll();
		org.apache.commons.collections4.list.NodeCachingLinkedListTest class8 = new org.apache.commons.collections4.list.NodeCachingLinkedListTest(null);
		class8.testShrinkCache();
		org.apache.commons.collections4.list.SetUniqueListTest class9 = new org.apache.commons.collections4.list.SetUniqueListTest(null);
		class9.testAdd();
		class9.testAddAll();
		class9.testCollectionAddAll();
		class9.testCollectionIteratorRemove();
		class9.testCollections304();
		class9.testCollections307();
		class9.testCollections701();
		class9.testFactory();
		class9.testIntCollectionAddAll();
		class9.testListIterator();
		class9.testListIteratorAdd();
		class9.testListIteratorSet();
		class9.testListSetByIndex();
		class9.testRetainAll();
		class9.testRetainAllWithInitialList();
		class9.testSet();
		class9.testSetCollections444();
		class9.testSetDownwardsInList();
		class9.testSetInBiggerList();
		class9.testSetUpwardsInList();
		class9.testSubListIsUnmodifiable();
		class9.testUniqueListDoubleInsert();
		class9.testUniqueListReInsert();
		org.apache.commons.collections4.list.Collections701Test class10 = new org.apache.commons.collections4.list.Collections701Test();
		class10.testArrayList();
		class10.testHashSet();
		class10.testSetUniqueList();
		org.apache.commons.collections4.list.FixedSizeListTest class11 = new org.apache.commons.collections4.list.FixedSizeListTest(null);
		class11.testListAllowsMutationOfUnderlyingCollection();
	}
}