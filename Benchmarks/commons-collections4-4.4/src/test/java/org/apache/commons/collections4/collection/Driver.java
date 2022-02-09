package org.apache.commons.collections4.collection;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest class1 = new org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest();
		class1.addPass();
		class1.addFail();
		class1.addAllPass();
		class1.createPredicatedCollectionWithNotNullPredicate();
		class1.createPredicatedCollectionWithPredicate();
		org.apache.commons.collections4.collection.CompositeCollectionTest class2 = new org.apache.commons.collections4.collection.CompositeCollectionTest(null);
		class2.testAddAllMutator();
		class2.testAddAllToCollection();
		class2.testAddMutator();
		class2.testClear();
		class2.testContainsAll();
		class2.testAddNullList();
		class2.testAddNullLists2Args();
		class2.testAddNullListsVarArgs();
		class2.testIsEmpty();
		class2.testIterator();
		class2.testMultipleCollectionsSize();
		class2.testRemove();
		class2.testRemoveAll();
		class2.testRemoveIf();
		class2.testRemoveComposited();
		class2.testRetainAll();
		class2.testSize();
		class2.testToCollection();
		class2.testUnsupportedRemove();
		org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest class3 = new org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest(null);
		class3.testUnmodifiable();
		class3.testDecorateFactory();
		org.apache.commons.collections4.collection.PredicatedCollectionTest class4 = new org.apache.commons.collections4.collection.PredicatedCollectionTest(null);
		class4.testIllegalAdd();
		class4.testIllegalAddAll();
		org.apache.commons.collections4.collection.TransformedCollectionTest class5 = new org.apache.commons.collections4.collection.TransformedCollectionTest(null);
		class5.testTransformedCollection();
		class5.testTransformedCollection_decorateTransform();
		org.apache.commons.collections4.collection.UnmodifiableCollectionTest class6 = new org.apache.commons.collections4.collection.UnmodifiableCollectionTest(null);
		class6.testUnmodifiable();
		class6.testDecorateFactory();
		org.apache.commons.collections4.collection.IndexedCollectionTest class7 = new org.apache.commons.collections4.collection.IndexedCollectionTest(null);
		try {
			class7.testAddedObjectsCanBeRetrievedByKey();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class7.testEnsureDuplicateObjectsCauseException();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class7.testDecoratedCollectionIsIndexedOnCreation();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class7.testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
	}
}