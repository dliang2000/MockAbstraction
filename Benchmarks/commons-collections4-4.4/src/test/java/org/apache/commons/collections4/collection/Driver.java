package org.apache.commons.collections4.collection;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.collection.TransformedCollectionTest class1 = new org.apache.commons.collections4.collection.TransformedCollectionTest(null);
		class1.testTransformedCollection();
		class1.testTransformedCollection_decorateTransform();
		org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest class2 = new org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest();
		class2.addPass();
		class2.addFail();
		class2.addAllPass();
		class2.createPredicatedCollectionWithNotNullPredicate();
		class2.createPredicatedCollectionWithPredicate();
		org.apache.commons.collections4.collection.CompositeCollectionTest class3 = new org.apache.commons.collections4.collection.CompositeCollectionTest(null);
		class3.testAddAllMutator();
		class3.testAddAllToCollection();
		class3.testAddMutator();
		class3.testClear();
		class3.testContainsAll();
		class3.testAddNullList();
		class3.testAddNullLists2Args();
		class3.testAddNullListsVarArgs();
		class3.testIsEmpty();
		class3.testIterator();
		class3.testMultipleCollectionsSize();
		class3.testRemove();
		class3.testRemoveAll();
		class3.testRemoveIf();
		class3.testRemoveComposited();
		class3.testRetainAll();
		class3.testSize();
		class3.testToCollection();
		class3.testUnsupportedRemove();
		org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest class4 = new org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest(null);
		class4.testUnmodifiable();
		class4.testDecorateFactory();
		org.apache.commons.collections4.collection.UnmodifiableCollectionTest class5 = new org.apache.commons.collections4.collection.UnmodifiableCollectionTest(null);
		class5.testUnmodifiable();
		class5.testDecorateFactory();
		org.apache.commons.collections4.collection.IndexedCollectionTest class6 = new org.apache.commons.collections4.collection.IndexedCollectionTest(null);
		try {
			class6.testAddedObjectsCanBeRetrievedByKey();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class6.testEnsureDuplicateObjectsCauseException();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class6.testDecoratedCollectionIsIndexedOnCreation();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class6.testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.apache.commons.collections4.collection.PredicatedCollectionTest class7 = new org.apache.commons.collections4.collection.PredicatedCollectionTest(null);
		class7.testIllegalAdd();
		class7.testIllegalAddAll();
	}
}