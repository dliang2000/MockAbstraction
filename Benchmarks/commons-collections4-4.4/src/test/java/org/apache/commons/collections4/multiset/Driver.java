package org.apache.commons.collections4.multiset;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.multiset.PredicatedMultiSetTest class1 = new org.apache.commons.collections4.multiset.PredicatedMultiSetTest();
		class1.testLegalAddRemove();
		class1.testIllegalAdd();
		class1.testIllegalDecorate();
		org.apache.commons.collections4.multiset.SynchronizedMultiSetTest class2 = new org.apache.commons.collections4.multiset.SynchronizedMultiSetTest();
		org.apache.commons.collections4.multiset.HashMultiSetTest class3 = new org.apache.commons.collections4.multiset.HashMultiSetTest();
		org.apache.commons.collections4.multiset.UnmodifiableMultiSetTest class4 = new org.apache.commons.collections4.multiset.UnmodifiableMultiSetTest();
		class4.testUnmodifiable();
		class4.testDecorateFactory();
	}
}