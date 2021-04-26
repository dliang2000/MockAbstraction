package org.apache.commons.collections4.functors;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.functors.EqualPredicateTest class1 = new org.apache.commons.collections4.functors.EqualPredicateTest();
		try {
			class1.testNullArgumentEqualsNullPredicate();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.objectFactoryUsesEqualsForTest();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testPredicateTypeCanBeSuperClassOfObject();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.functors.ComparatorPredicateTest class2 = new org.apache.commons.collections4.functors.ComparatorPredicateTest();
		class2.compareEquals();
		class2.compareGreater();
		class2.compareLess();
		class2.compareGreaterOrEqual();
		class2.compareLessOrEqual();
		org.apache.commons.collections4.functors.CatchAndRethrowClosureTest class3 = new org.apache.commons.collections4.functors.CatchAndRethrowClosureTest();
		class3.testThrowingClosure();
		org.apache.commons.collections4.functors.AllPredicateTest class4 = new org.apache.commons.collections4.functors.AllPredicateTest();
		class4.emptyArrayToGetInstance();
		class4.emptyCollectionToGetInstance();
		class4.oneTruePredicate();
		class4.oneFalsePredicate();
		class4.allTrue();
		class4.trueAndFalseCombined();
		org.apache.commons.collections4.functors.NullPredicateTest class5 = new org.apache.commons.collections4.functors.NullPredicateTest();
		class5.testNullPredicate();
		try {
			class5.ensurePredicateCanBeTypedWithoutWarning();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
	}
}