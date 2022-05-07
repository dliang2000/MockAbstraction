package org.apache.commons.collections4.bidimap;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMapTest class1 = new org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMapTest(null);
		class1.testUnmodifiable();
		class1.testDecorateFactory();
		org.apache.commons.collections4.bidimap.DualTreeBidiMap2Test class2 = new org.apache.commons.collections4.bidimap.DualTreeBidiMap2Test(null);
		class2.testComparator();
		class2.testComparator2();
		try {
			class2.testSerializeDeserializeCheckComparator();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.testCollections364();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testSortOrder();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.bidimap.UnmodifiableBidiMapTest class3 = new org.apache.commons.collections4.bidimap.UnmodifiableBidiMapTest(null);
		class3.testUnmodifiable();
		class3.testDecorateFactory();
		org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMapTest class4 = new org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMapTest(null);
		class4.testUnmodifiable();
		class4.testDecorateFactory();
	}
}