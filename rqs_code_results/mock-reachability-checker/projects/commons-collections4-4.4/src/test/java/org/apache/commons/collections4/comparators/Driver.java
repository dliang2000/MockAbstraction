package org.apache.commons.collections4.comparators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.comparators.ReverseComparatorTest class1 = new org.apache.commons.collections4.comparators.ReverseComparatorTest(null);
		try {
			class1.testSerializeDeserializeThenCompare();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.commons.collections4.comparators.TransformingComparatorTest class2 = new org.apache.commons.collections4.comparators.TransformingComparatorTest(null);
		class2.testEquals();
		org.apache.commons.collections4.comparators.FixedOrderComparatorTest class3 = new org.apache.commons.collections4.comparators.FixedOrderComparatorTest(null);
		class3.testConstructorPlusAdd();
		class3.testArrayConstructor();
		class3.testListConstructor();
		class3.testAddAsEqual();
		class3.testLock();
		class3.testUnknownObjectBehavior();
		org.apache.commons.collections4.comparators.ComparatorChainTest class4 = new org.apache.commons.collections4.comparators.ComparatorChainTest(null);
		class4.testNoopComparatorChain();
		class4.testBadNoopComparatorChain();
		class4.testListComparatorChain();
		class4.testBadListComparatorChain();
		class4.testComparatorChainOnMinvaluedCompatator();
		org.apache.commons.collections4.comparators.BooleanComparatorTest class5 = new org.apache.commons.collections4.comparators.BooleanComparatorTest(null);
		class5.testConstructors();
		class5.testStaticFactoryMethods();
		class5.testEqualsCompatibleInstance();
	}
}