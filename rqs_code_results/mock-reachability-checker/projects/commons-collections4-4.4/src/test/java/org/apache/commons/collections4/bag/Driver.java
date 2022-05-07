package org.apache.commons.collections4.bag;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.bag.UnmodifiableBagTest class1 = new org.apache.commons.collections4.bag.UnmodifiableBagTest(null);
		class1.testUnmodifiable();
		class1.testDecorateFactory();
		org.apache.commons.collections4.bag.TransformedSortedBagTest class2 = new org.apache.commons.collections4.bag.TransformedSortedBagTest(null);
		class2.testTransformedBag();
		class2.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.CollectionBagTest class3 = new org.apache.commons.collections4.bag.CollectionBagTest(null);
		try {
			class3.testEmptyBagCompatibility();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err2) {
			err2.printStackTrace();
		}
		try {
			class3.testFullBagCompatibility();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err4) {
			err4.printStackTrace();
		}
		org.apache.commons.collections4.bag.PredicatedSortedBagTest class4 = new org.apache.commons.collections4.bag.PredicatedSortedBagTest(null);
		class4.testDecorate();
		class4.testSortOrder();
		org.apache.commons.collections4.bag.UnmodifiableSortedBagTest class5 = new org.apache.commons.collections4.bag.UnmodifiableSortedBagTest(null);
		class5.testUnmodifiable();
		class5.testDecorateFactory();
		org.apache.commons.collections4.bag.TreeBagTest class6 = new org.apache.commons.collections4.bag.TreeBagTest(null);
		class6.testCollections265();
		class6.testCollections555();
		class6.testOrdering();
		org.apache.commons.collections4.bag.CollectionSortedBagTest class7 = new org.apache.commons.collections4.bag.CollectionSortedBagTest(null);
		try {
			class7.testEmptyBagCompatibility();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err6) {
			err6.printStackTrace();
		}
		try {
			class7.testFullBagCompatibility();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err8) {
			err8.printStackTrace();
		}
		org.apache.commons.collections4.bag.TransformedBagTest class8 = new org.apache.commons.collections4.bag.TransformedBagTest(null);
		class8.testTransformedBag();
		class8.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.PredicatedBagTest class9 = new org.apache.commons.collections4.bag.PredicatedBagTest(null);
		class9.testlegalAddRemove();
		class9.testIllegalAdd();
		class9.testIllegalDecorate();
	}
}