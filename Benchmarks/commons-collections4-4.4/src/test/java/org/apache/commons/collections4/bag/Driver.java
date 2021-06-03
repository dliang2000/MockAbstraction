package org.apache.commons.collections4.bag;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.bag.PredicatedSortedBagTest class1 = new org.apache.commons.collections4.bag.PredicatedSortedBagTest(null);
		class1.testDecorate();
		class1.testSortOrder();
		org.apache.commons.collections4.bag.TransformedSortedBagTest class2 = new org.apache.commons.collections4.bag.TransformedSortedBagTest(null);
		class2.testTransformedBag();
		class2.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.UnmodifiableBagTest class3 = new org.apache.commons.collections4.bag.UnmodifiableBagTest(null);
		class3.testUnmodifiable();
		class3.testDecorateFactory();
		org.apache.commons.collections4.bag.UnmodifiableSortedBagTest class4 = new org.apache.commons.collections4.bag.UnmodifiableSortedBagTest(null);
		class4.testUnmodifiable();
		class4.testDecorateFactory();
		org.apache.commons.collections4.bag.TransformedBagTest class5 = new org.apache.commons.collections4.bag.TransformedBagTest(null);
		class5.testTransformedBag();
		class5.testTransformedBag_decorateTransform();
		org.apache.commons.collections4.bag.CollectionSortedBagTest class6 = new org.apache.commons.collections4.bag.CollectionSortedBagTest(null);
		try {
			class6.testEmptyBagCompatibility();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err2) {
			err2.printStackTrace();
		}
		try {
			class6.testFullBagCompatibility();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err4) {
			err4.printStackTrace();
		}
		org.apache.commons.collections4.bag.PredicatedBagTest class7 = new org.apache.commons.collections4.bag.PredicatedBagTest(null);
		class7.testlegalAddRemove();
		class7.testIllegalAdd();
		class7.testIllegalDecorate();
		org.apache.commons.collections4.bag.CollectionBagTest class8 = new org.apache.commons.collections4.bag.CollectionBagTest(null);
		try {
			class8.testEmptyBagCompatibility();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err6) {
			err6.printStackTrace();
		}
		try {
			class8.testFullBagCompatibility();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err8) {
			err8.printStackTrace();
		}
		org.apache.commons.collections4.bag.TreeBagTest class9 = new org.apache.commons.collections4.bag.TreeBagTest(null);
		class9.testCollections265();
		class9.testCollections555();
		class9.testOrdering();
	}
}