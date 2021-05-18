package org.apache.commons.collections4.bag;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.bag.PredicatedSortedBagTest class1 = new org.apache.commons.collections4.bag.PredicatedSortedBagTest();
		class1.testDecorate();
		class1.testSortOrder();
		org.apache.commons.collections4.bag.TransformedSortedBagTest class2 = new org.apache.commons.collections4.bag.TransformedSortedBagTest();
		class2.testTransformedBag();
		class2.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.SynchronizedBagTest class3 = new org.apache.commons.collections4.bag.SynchronizedBagTest();
		org.apache.commons.collections4.bag.UnmodifiableBagTest class4 = new org.apache.commons.collections4.bag.UnmodifiableBagTest();
		class4.testUnmodifiable();
		class4.testDecorateFactory();
		org.apache.commons.collections4.bag.UnmodifiableSortedBagTest class5 = new org.apache.commons.collections4.bag.UnmodifiableSortedBagTest();
		class5.testUnmodifiable();
		class5.testDecorateFactory();
		org.apache.commons.collections4.bag.TransformedBagTest class6 = new org.apache.commons.collections4.bag.TransformedBagTest();
		class6.testTransformedBag();
		class6.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.CollectionSortedBagTest class7 = new org.apache.commons.collections4.bag.CollectionSortedBagTest();
		try {
			class7.testEmptyBagCompatibility();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err2) {
			err2.printStackTrace();
		}
		try {
			class7.testFullBagCompatibility();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err4) {
			err4.printStackTrace();
		}
		org.apache.commons.collections4.bag.PredicatedBagTest class8 = new org.apache.commons.collections4.bag.PredicatedBagTest();
		class8.testlegalAddRemove();
		class8.testIllegalAdd();
		class8.testIllegalDecorate();
		org.apache.commons.collections4.bag.CollectionBagTest class9 = new org.apache.commons.collections4.bag.CollectionBagTest();
		try {
			class9.testEmptyBagCompatibility();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err6) {
			err6.printStackTrace();
		}
		try {
			class9.testFullBagCompatibility();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err8) {
			err8.printStackTrace();
		}
		org.apache.commons.collections4.bag.TreeBagTest class10 = new org.apache.commons.collections4.bag.TreeBagTest();
		class10.testCollections265();
		class10.testCollections555();
		class10.testOrdering();
		org.apache.commons.collections4.bag.HashBagTest class11 = new org.apache.commons.collections4.bag.HashBagTest();
	}
}