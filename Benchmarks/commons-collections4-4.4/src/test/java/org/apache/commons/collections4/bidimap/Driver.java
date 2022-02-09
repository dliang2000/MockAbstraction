package org.apache.commons.collections4.bidimap;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.bidimap.DualTreeBidiMap2Test class1 = new org.apache.commons.collections4.bidimap.DualTreeBidiMap2Test(null);
		class1.testComparator();
		class1.testComparator2();
		try {
			class1.testSerializeDeserializeCheckComparator();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testCollections364();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testSortOrder();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMapTest class2 = new org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMapTest(null);
		class2.testUnmodifiable();
		class2.testDecorateFactory();
		org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMapTest class3 = new org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMapTest(null);
		class3.testUnmodifiable();
		class3.testDecorateFactory();
		org.apache.commons.collections4.bidimap.UnmodifiableBidiMapTest class4 = new org.apache.commons.collections4.bidimap.UnmodifiableBidiMapTest(null);
		class4.testUnmodifiable();
		class4.testDecorateFactory();
	}
}