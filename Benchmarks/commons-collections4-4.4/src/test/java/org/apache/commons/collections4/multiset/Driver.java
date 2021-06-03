package org.apache.commons.collections4.multiset;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.multiset.PredicatedMultiSetTest class1 = new org.apache.commons.collections4.multiset.PredicatedMultiSetTest(null);
		class1.testLegalAddRemove();
		class1.testIllegalAdd();
		class1.testIllegalDecorate();
		org.apache.commons.collections4.multiset.UnmodifiableMultiSetTest class2 = new org.apache.commons.collections4.multiset.UnmodifiableMultiSetTest(null);
		class2.testUnmodifiable();
		class2.testDecorateFactory();
	}
}