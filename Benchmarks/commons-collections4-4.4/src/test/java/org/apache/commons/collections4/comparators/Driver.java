package org.apache.commons.collections4.comparators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.comparators.TransformingComparatorTest class1 = new org.apache.commons.collections4.comparators.TransformingComparatorTest(null);
		class1.testEquals();
		org.apache.commons.collections4.comparators.ReverseComparatorTest class2 = new org.apache.commons.collections4.comparators.ReverseComparatorTest(null);
		try {
			class2.testSerializeDeserializeThenCompare();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.commons.collections4.comparators.ComparatorChainTest class3 = new org.apache.commons.collections4.comparators.ComparatorChainTest(null);
		class3.testNoopComparatorChain();
		class3.testBadNoopComparatorChain();
		class3.testListComparatorChain();
		class3.testBadListComparatorChain();
		class3.testComparatorChainOnMinvaluedCompatator();
		org.apache.commons.collections4.comparators.BooleanComparatorTest class4 = new org.apache.commons.collections4.comparators.BooleanComparatorTest(null);
		class4.testConstructors();
		class4.testStaticFactoryMethods();
		class4.testEqualsCompatibleInstance();
		org.apache.commons.collections4.comparators.FixedOrderComparatorTest class5 = new org.apache.commons.collections4.comparators.FixedOrderComparatorTest(null);
		class5.testConstructorPlusAdd();
		class5.testArrayConstructor();
		class5.testListConstructor();
		class5.testAddAsEqual();
		class5.testLock();
		class5.testUnknownObjectBehavior();
	}
}