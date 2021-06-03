package org.apache.commons.collections4.collection;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest class1 = new org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest();
		class1.addPass();
		class1.addFail();
		class1.addAllPass();
		class1.createPredicatedCollectionWithNotNullPredicate();
		class1.createPredicatedCollectionWithPredicate();
		org.apache.commons.collections4.collection.IndexedCollectionTest class2 = new org.apache.commons.collections4.collection.IndexedCollectionTest(null);
		try {
			class2.testAddedObjectsCanBeRetrievedByKey();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.testEnsureDuplicateObjectsCauseException();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testDecoratedCollectionIsIndexedOnCreation();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.apache.commons.collections4.collection.TransformedCollectionTest class3 = new org.apache.commons.collections4.collection.TransformedCollectionTest(null);
		class3.testTransformedCollection();
		class3.testTransformedCollection_decorateTransform();
		org.apache.commons.collections4.collection.PredicatedCollectionTest class4 = new org.apache.commons.collections4.collection.PredicatedCollectionTest(null);
		class4.testIllegalAdd();
		class4.testIllegalAddAll();
		org.apache.commons.collections4.collection.CompositeCollectionTest class5 = new org.apache.commons.collections4.collection.CompositeCollectionTest(null);
		class5.testAddAllMutator();
		class5.testAddAllToCollection();
		class5.testAddMutator();
		class5.testClear();
		class5.testContainsAll();
		class5.testAddNullList();
		class5.testAddNullLists2Args();
		class5.testAddNullListsVarArgs();
		class5.testIsEmpty();
		class5.testIterator();
		class5.testMultipleCollectionsSize();
		class5.testRemove();
		class5.testRemoveAll();
		class5.testRemoveIf();
		class5.testRemoveComposited();
		class5.testRetainAll();
		class5.testSize();
		class5.testToCollection();
		class5.testUnsupportedRemove();
		org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest class6 = new org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest(null);
		class6.testUnmodifiable();
		class6.testDecorateFactory();
		org.apache.commons.collections4.collection.UnmodifiableCollectionTest class7 = new org.apache.commons.collections4.collection.UnmodifiableCollectionTest(null);
		class7.testUnmodifiable();
		class7.testDecorateFactory();
	}
}