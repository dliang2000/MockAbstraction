package org.apache.commons.collections4.comparators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.comparators.ComparatorChainTest class1 = new org.apache.commons.collections4.comparators.ComparatorChainTest();
		class1.testNoopComparatorChain();
		class1.testBadNoopComparatorChain();
		class1.testListComparatorChain();
		class1.testBadListComparatorChain();
		class1.testComparatorChainOnMinvaluedCompatator();
		org.apache.commons.collections4.comparators.ComparableComparatorTest class2 = new org.apache.commons.collections4.comparators.ComparableComparatorTest();
		org.apache.commons.collections4.comparators.TransformingComparatorTest class3 = new org.apache.commons.collections4.comparators.TransformingComparatorTest();
		class3.testEquals();
		org.apache.commons.collections4.comparators.ReverseComparatorTest class4 = new org.apache.commons.collections4.comparators.ReverseComparatorTest();
		try {
			class4.testSerializeDeserializeThenCompare();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.commons.collections4.comparators.FixedOrderComparatorTest class5 = new org.apache.commons.collections4.comparators.FixedOrderComparatorTest();
		class5.testConstructorPlusAdd();
		class5.testArrayConstructor();
		class5.testListConstructor();
		class5.testAddAsEqual();
		class5.testLock();
		class5.testUnknownObjectBehavior();
		org.apache.commons.collections4.comparators.BooleanComparatorTest class6 = new org.apache.commons.collections4.comparators.BooleanComparatorTest();
		class6.testConstructors();
		class6.testStaticFactoryMethods();
		class6.testEqualsCompatibleInstance();
	}
}