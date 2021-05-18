package org.apache.commons.collections4.collection;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest class1 = new org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest();
		class1.addPass();
		class1.addFail();
		class1.addAllPass();
		class1.createPredicatedCollectionWithNotNullPredicate();
		class1.createPredicatedCollectionWithPredicate();
		org.apache.commons.collections4.collection.IndexedCollectionTest class2 = new org.apache.commons.collections4.collection.IndexedCollectionTest();
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
		org.apache.commons.collections4.collection.TransformedCollectionTest class3 = new org.apache.commons.collections4.collection.TransformedCollectionTest();
		class3.testTransformedCollection();
		class3.testTransformedCollection_decorateTransform();
		org.apache.commons.collections4.collection.PredicatedCollectionTest class4 = new org.apache.commons.collections4.collection.PredicatedCollectionTest();
		class4.testIllegalAdd();
		class4.testIllegalAddAll();
		org.apache.commons.collections4.collection.SynchronizedCollectionTest class5 = new org.apache.commons.collections4.collection.SynchronizedCollectionTest();
		org.apache.commons.collections4.collection.CompositeCollectionTest class6 = new org.apache.commons.collections4.collection.CompositeCollectionTest();
		class6.testAddAllMutator();
		class6.testAddAllToCollection();
		class6.testAddMutator();
		class6.testClear();
		class6.testContainsAll();
		class6.testAddNullList();
		class6.testAddNullLists2Args();
		class6.testAddNullListsVarArgs();
		class6.testIsEmpty();
		class6.testIterator();
		class6.testMultipleCollectionsSize();
		class6.testRemove();
		class6.testRemoveAll();
		class6.testRemoveIf();
		class6.testRemoveComposited();
		class6.testRetainAll();
		class6.testSize();
		class6.testToCollection();
		class6.testUnsupportedRemove();
		org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest class7 = new org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest();
		class7.testUnmodifiable();
		class7.testDecorateFactory();
		org.apache.commons.collections4.collection.UnmodifiableCollectionTest class8 = new org.apache.commons.collections4.collection.UnmodifiableCollectionTest();
		class8.testUnmodifiable();
		class8.testDecorateFactory();
	}
}