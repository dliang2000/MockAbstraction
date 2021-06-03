package org.apache.commons.collections4.comparators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.comparators.ComparatorChainTest class1 = new org.apache.commons.collections4.comparators.ComparatorChainTest(null);
		class1.testNoopComparatorChain();
		class1.testBadNoopComparatorChain();
		class1.testListComparatorChain();
		class1.testBadListComparatorChain();
		class1.testComparatorChainOnMinvaluedCompatator();
		org.apache.commons.collections4.comparators.TransformingComparatorTest class2 = new org.apache.commons.collections4.comparators.TransformingComparatorTest(null);
		class2.testEquals();
		org.apache.commons.collections4.comparators.ReverseComparatorTest class3 = new org.apache.commons.collections4.comparators.ReverseComparatorTest(null);
		try {
			class3.testSerializeDeserializeThenCompare();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.commons.collections4.comparators.FixedOrderComparatorTest class4 = new org.apache.commons.collections4.comparators.FixedOrderComparatorTest(null);
		class4.testConstructorPlusAdd();
		class4.testArrayConstructor();
		class4.testListConstructor();
		class4.testAddAsEqual();
		class4.testLock();
		class4.testUnknownObjectBehavior();
		org.apache.commons.collections4.comparators.BooleanComparatorTest class5 = new org.apache.commons.collections4.comparators.BooleanComparatorTest(null);
		class5.testConstructors();
		class5.testStaticFactoryMethods();
		class5.testEqualsCompatibleInstance();
	}
}