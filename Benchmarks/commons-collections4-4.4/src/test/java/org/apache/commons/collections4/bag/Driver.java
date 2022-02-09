package org.apache.commons.collections4.bag;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.bag.PredicatedBagTest class1 = new org.apache.commons.collections4.bag.PredicatedBagTest(null);
		class1.testlegalAddRemove();
		class1.testIllegalAdd();
		class1.testIllegalDecorate();
		org.apache.commons.collections4.bag.PredicatedSortedBagTest class2 = new org.apache.commons.collections4.bag.PredicatedSortedBagTest(null);
		class2.testDecorate();
		class2.testSortOrder();
		org.apache.commons.collections4.bag.UnmodifiableBagTest class3 = new org.apache.commons.collections4.bag.UnmodifiableBagTest(null);
		class3.testUnmodifiable();
		class3.testDecorateFactory();
		org.apache.commons.collections4.bag.TreeBagTest class4 = new org.apache.commons.collections4.bag.TreeBagTest(null);
		class4.testCollections265();
		class4.testCollections555();
		class4.testOrdering();
		org.apache.commons.collections4.bag.TransformedBagTest class5 = new org.apache.commons.collections4.bag.TransformedBagTest(null);
		class5.testTransformedBag();
		class5.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.TransformedSortedBagTest class6 = new org.apache.commons.collections4.bag.TransformedSortedBagTest(null);
		class6.testTransformedBag();
		class6.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.CollectionSortedBagTest class7 = new org.apache.commons.collections4.bag.CollectionSortedBagTest(null);
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
		org.apache.commons.collections4.bag.UnmodifiableSortedBagTest class8 = new org.apache.commons.collections4.bag.UnmodifiableSortedBagTest(null);
		class8.testUnmodifiable();
		class8.testDecorateFactory();
		org.apache.commons.collections4.bag.CollectionBagTest class9 = new org.apache.commons.collections4.bag.CollectionBagTest(null);
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
	}
}