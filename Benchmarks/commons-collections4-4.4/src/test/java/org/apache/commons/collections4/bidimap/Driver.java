package org.apache.commons.collections4.bidimap;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.bidimap.DualHashBidiMapTest class1 = new org.apache.commons.collections4.bidimap.DualHashBidiMapTest();
		org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMapTest class2 = new org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMapTest();
		class2.testUnmodifiable();
		class2.testDecorateFactory();
		org.apache.commons.collections4.bidimap.TreeBidiMapTest class3 = new org.apache.commons.collections4.bidimap.TreeBidiMapTest();
		org.apache.commons.collections4.bidimap.DualTreeBidiMap2Test class4 = new org.apache.commons.collections4.bidimap.DualTreeBidiMap2Test();
		class4.testComparator();
		class4.testComparator2();
		try {
			class4.testSerializeDeserializeCheckComparator();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class4.testCollections364();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class4.testSortOrder();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.bidimap.DualLinkedHashBidiMapTest class5 = new org.apache.commons.collections4.bidimap.DualLinkedHashBidiMapTest();
		org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMapTest class6 = new org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMapTest();
		class6.testUnmodifiable();
		class6.testDecorateFactory();
		org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecoratorTest class7 = new org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecoratorTest();
		org.apache.commons.collections4.bidimap.UnmodifiableBidiMapTest class8 = new org.apache.commons.collections4.bidimap.UnmodifiableBidiMapTest();
		class8.testUnmodifiable();
		class8.testDecorateFactory();
		org.apache.commons.collections4.bidimap.DualTreeBidiMapTest class9 = new org.apache.commons.collections4.bidimap.DualTreeBidiMapTest();
	}
}