package org.apache.commons.collections4.bag;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.bag.TransformedBagTest class1 = new org.apache.commons.collections4.bag.TransformedBagTest(null);
		class1.testTransformedBag();
		class1.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.CollectionSortedBagTest class2 = new org.apache.commons.collections4.bag.CollectionSortedBagTest(null);
		try {
			class2.testEmptyBagCompatibility();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err2) {
			err2.printStackTrace();
		}
		try {
			class2.testFullBagCompatibility();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err4) {
			err4.printStackTrace();
		}
		org.apache.commons.collections4.bag.TreeBagTest class3 = new org.apache.commons.collections4.bag.TreeBagTest(null);
		class3.testCollections265();
		class3.testCollections555();
		class3.testOrdering();
		org.apache.commons.collections4.bag.CollectionBagTest class4 = new org.apache.commons.collections4.bag.CollectionBagTest(null);
		try {
			class4.testEmptyBagCompatibility();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err6) {
			err6.printStackTrace();
		}
		try {
			class4.testFullBagCompatibility();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err8) {
			err8.printStackTrace();
		}
		org.apache.commons.collections4.bag.PredicatedSortedBagTest class5 = new org.apache.commons.collections4.bag.PredicatedSortedBagTest(null);
		class5.testDecorate();
		class5.testSortOrder();
		org.apache.commons.collections4.bag.PredicatedBagTest class6 = new org.apache.commons.collections4.bag.PredicatedBagTest(null);
		class6.testlegalAddRemove();
		class6.testIllegalAdd();
		class6.testIllegalDecorate();
		org.apache.commons.collections4.bag.TransformedSortedBagTest class7 = new org.apache.commons.collections4.bag.TransformedSortedBagTest(null);
		class7.testTransformedBag();
		class7.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.UnmodifiableSortedBagTest class8 = new org.apache.commons.collections4.bag.UnmodifiableSortedBagTest(null);
		class8.testUnmodifiable();
		class8.testDecorateFactory();
		org.apache.commons.collections4.bag.UnmodifiableBagTest class9 = new org.apache.commons.collections4.bag.UnmodifiableBagTest(null);
		class9.testUnmodifiable();
		class9.testDecorateFactory();
	}
}