package org.apache.commons.collections4.collection;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.collection.TransformedCollectionTest class1 = new org.apache.commons.collections4.collection.TransformedCollectionTest(null);
		class1.testTransformedCollection();
		class1.testTransformedCollection_decorateTransform();
		org.apache.commons.collections4.collection.PredicatedCollectionTest class2 = new org.apache.commons.collections4.collection.PredicatedCollectionTest(null);
		class2.testIllegalAdd();
		class2.testIllegalAddAll();
		org.apache.commons.collections4.collection.IndexedCollectionTest class3 = new org.apache.commons.collections4.collection.IndexedCollectionTest(null);
		try {
			class3.testAddedObjectsCanBeRetrievedByKey();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class3.testEnsureDuplicateObjectsCauseException();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.testDecoratedCollectionIsIndexedOnCreation();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.testReindexUpdatesIndexWhenDecoratedCollectionIsModifiedSeparately();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.apache.commons.collections4.collection.UnmodifiableCollectionTest class4 = new org.apache.commons.collections4.collection.UnmodifiableCollectionTest(null);
		class4.testUnmodifiable();
		class4.testDecorateFactory();
		org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest class5 = new org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest();
		class5.addPass();
		class5.addFail();
		class5.addAllPass();
		class5.createPredicatedCollectionWithNotNullPredicate();
		class5.createPredicatedCollectionWithPredicate();
		org.apache.commons.collections4.collection.CompositeCollectionTest class6 = new org.apache.commons.collections4.collection.CompositeCollectionTest(null);
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
		org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest class7 = new org.apache.commons.collections4.collection.UnmodifiableBoundedCollectionTest(null);
		class7.testUnmodifiable();
		class7.testDecorateFactory();
	}
}