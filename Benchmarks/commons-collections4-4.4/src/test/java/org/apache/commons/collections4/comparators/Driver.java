package org.apache.commons.collections4.comparators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.comparators.FixedOrderComparatorTest class1 = new org.apache.commons.collections4.comparators.FixedOrderComparatorTest(null);
		class1.testConstructorPlusAdd();
		class1.testArrayConstructor();
		class1.testListConstructor();
		class1.testAddAsEqual();
		class1.testLock();
		class1.testUnknownObjectBehavior();
		org.apache.commons.collections4.comparators.TransformingComparatorTest class2 = new org.apache.commons.collections4.comparators.TransformingComparatorTest(null);
		class2.testEquals();
		org.apache.commons.collections4.comparators.ComparatorChainTest class3 = new org.apache.commons.collections4.comparators.ComparatorChainTest(null);
		class3.testNoopComparatorChain();
		class3.testBadNoopComparatorChain();
		class3.testListComparatorChain();
		class3.testBadListComparatorChain();
		class3.testComparatorChainOnMinvaluedCompatator();
		org.apache.commons.collections4.comparators.ReverseComparatorTest class4 = new org.apache.commons.collections4.comparators.ReverseComparatorTest(null);
		try {
			class4.testSerializeDeserializeThenCompare();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.commons.collections4.comparators.BooleanComparatorTest class5 = new org.apache.commons.collections4.comparators.BooleanComparatorTest(null);
		class5.testConstructors();
		class5.testStaticFactoryMethods();
		class5.testEqualsCompatibleInstance();
	}
}