package org.apache.commons.collections4.multiset;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.multiset.UnmodifiableMultiSetTest class1 = new org.apache.commons.collections4.multiset.UnmodifiableMultiSetTest(null);
		class1.testUnmodifiable();
		class1.testDecorateFactory();
		org.apache.commons.collections4.multiset.PredicatedMultiSetTest class2 = new org.apache.commons.collections4.multiset.PredicatedMultiSetTest(null);
		class2.testLegalAddRemove();
		class2.testIllegalAdd();
		class2.testIllegalDecorate();
	}
}