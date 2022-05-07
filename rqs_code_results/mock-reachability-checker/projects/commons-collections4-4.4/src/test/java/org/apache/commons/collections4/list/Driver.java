package org.apache.commons.collections4.list;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.list.FixedSizeListTest class1 = new org.apache.commons.collections4.list.FixedSizeListTest(null);
		class1.testListAllowsMutationOfUnderlyingCollection();
		org.apache.commons.collections4.list.NodeCachingLinkedListTest class2 = new org.apache.commons.collections4.list.NodeCachingLinkedListTest(null);
		class2.testShrinkCache();
		org.apache.commons.collections4.list.Collections701Test class3 = new org.apache.commons.collections4.list.Collections701Test();
		class3.testArrayList();
		class3.testHashSet();
		class3.testSetUniqueList();
		org.apache.commons.collections4.list.TreeListTest class4 = new org.apache.commons.collections4.list.TreeListTest(null);
		class4.testAddMultiple();
		class4.testRemove();
		class4.testInsertBefore();
		class4.testIndexOf();
		class4.testBug35258();
		class4.testBugCollections447();
		class4.testIterationOrder();
		class4.testIterationOrderAfterAddAll();
		org.apache.commons.collections4.list.TransformedListTest class5 = new org.apache.commons.collections4.list.TransformedListTest(null);
		class5.testTransformedList();
		class5.testTransformedList_decorateTransform();
		org.apache.commons.collections4.list.GrowthListTest class6 = new org.apache.commons.collections4.list.GrowthListTest(null);
		class6.testGrowthAdd();
		class6.testGrowthAddAll();
		class6.testGrowthSet1();
		class6.testGrowthSet2();
		class6.testListAddByIndexBoundsChecking();
		class6.testListAddByIndexBoundsChecking2();
		class6.testListSetByIndexBoundsChecking();
		class6.testListSetByIndexBoundsChecking2();
		org.apache.commons.collections4.list.PredicatedListTest class7 = new org.apache.commons.collections4.list.PredicatedListTest(null);
		class7.testIllegalAdd();
		class7.testIllegalAddAll();
		class7.testIllegalSet();
		class7.testLegalAddAll();
		org.apache.commons.collections4.list.UnmodifiableListTest class8 = new org.apache.commons.collections4.list.UnmodifiableListTest(null);
		class8.testUnmodifiable();
		class8.testDecorateFactory();
		class8.testUnmodifiableIterator();
		org.apache.commons.collections4.list.LazyListTest class9 = new org.apache.commons.collections4.list.LazyListTest(null);
		class9.testSimpleSerialization();
		class9.testSerializeDeserializeThenCompare();
		class9.testCanonicalEmptyCollectionExists();
		class9.testCanonicalFullCollectionExists();
		class9.testElementCreationWithFactory();
		class9.testElementCreationWithTransformer();
		class9.testCreateNullGapsWithFactory();
		class9.testCreateNullGapsWithTransformer();
		org.apache.commons.collections4.list.SetUniqueListTest class10 = new org.apache.commons.collections4.list.SetUniqueListTest(null);
		class10.testAdd();
		class10.testAddAll();
		class10.testCollectionAddAll();
		class10.testCollectionIteratorRemove();
		class10.testCollections304();
		class10.testCollections307();
		class10.testCollections701();
		class10.testFactory();
		class10.testIntCollectionAddAll();
		class10.testListIterator();
		class10.testListIteratorAdd();
		class10.testListIteratorSet();
		class10.testListSetByIndex();
		class10.testRetainAll();
		class10.testRetainAllWithInitialList();
		class10.testSet();
		class10.testSetCollections444();
		class10.testSetDownwardsInList();
		class10.testSetInBiggerList();
		class10.testSetUpwardsInList();
		class10.testSubListIsUnmodifiable();
		class10.testUniqueListDoubleInsert();
		class10.testUniqueListReInsert();
		org.apache.commons.collections4.list.CursorableLinkedListTest class11 = new org.apache.commons.collections4.list.CursorableLinkedListTest(null);
		class11.testAdd();
		class11.testClear();
		class11.testContains();
		class11.testContainsAll();
		class11.testCursorNavigation();
		class11.testCursorSet();
		class11.testCursorRemove();
		class11.testCursorAdd();
		class11.testCursorConcurrentModification();
		class11.testCursorNextIndexMid();
		class11.testCursorNextIndexFirst();
		class11.testCursorNextIndexAddBefore();
		class11.testCursorNextIndexAddNext();
		class11.testCursorNextIndexAddAfter();
		class11.testInternalState_CursorNextNextPreviousRemoveIndex1ByList();
		class11.testInternalState_CursorNextRemoveIndex1ByList();
		class11.testInternalState_CursorNextNextRemoveIndex1ByList();
		class11.testInternalState_CursorNextNextNextRemoveIndex1ByList();
		class11.testInternalState_CursorNextNextPreviousRemoveByIterator();
		class11.testInternalState_CursorNextNextRemoveByIterator();
		class11.testInternalState_CursorNextNextPreviousAddIndex1ByList();
		class11.testInternalState_CursorNextAddIndex1ByList();
		class11.testInternalState_CursorNextNextAddIndex1ByList();
		class11.testInternalState_CursorNextNextPreviousAddByIterator();
		class11.testInternalState_CursorNextNextAddByIterator();
		class11.testInternalState_CursorNextNextRemoveByListSetByIterator();
		class11.testInternalState_CursorNextNextPreviousSetByIterator();
		class11.testInternalState_CursorNextNextSetByIterator();
		class11.testEqualsAndHashCode();
		class11.testGet();
		class11.testIndexOf();
		class11.testIsEmpty();
		class11.testIterator();
		class11.testListIteratorNavigation();
		class11.testListIteratorSet();
		class11.testListIteratorRemove();
		class11.testListIteratorAdd();
		class11.testRemoveAll();
		class11.testRemoveByIndex();
		class11.testRemove();
		class11.testRetainAll();
		class11.testSet();
		class11.testSubList();
		class11.testSubListAddEnd();
		class11.testSubListAddBegin();
		class11.testSubListAddMiddle();
		class11.testSubListRemove();
		class11.testToArray();
		try {
			class11.testSerialization();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class11.testSerializationWithOpenCursor();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class11.testLongSerialization();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
	}
}