package org.apache.commons.collections4.collection;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest class1 = new org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest();
		class1.addPass();
		class1.addFail();
		class1.addAllPass();
		class1.createPredicatedCollectionWithNotNullPredicate();
		class1.createPredicatedCollectionWithPredicate();
	}
}