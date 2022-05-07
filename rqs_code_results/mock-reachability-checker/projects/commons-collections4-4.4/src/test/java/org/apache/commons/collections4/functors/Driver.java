package org.apache.commons.collections4.functors;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.functors.NullPredicateTest class1 = new org.apache.commons.collections4.functors.NullPredicateTest();
		class1.testNullPredicate();
		try {
			class1.ensurePredicateCanBeTypedWithoutWarning();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.commons.collections4.functors.AllPredicateTest class2 = new org.apache.commons.collections4.functors.AllPredicateTest();
		class2.emptyArrayToGetInstance();
		class2.emptyCollectionToGetInstance();
		class2.oneTruePredicate();
		class2.oneFalsePredicate();
		class2.allTrue();
		class2.trueAndFalseCombined();
		org.apache.commons.collections4.functors.ComparatorPredicateTest class3 = new org.apache.commons.collections4.functors.ComparatorPredicateTest();
		class3.compareEquals();
		class3.compareGreater();
		class3.compareLess();
		class3.compareGreaterOrEqual();
		class3.compareLessOrEqual();
		org.apache.commons.collections4.functors.CatchAndRethrowClosureTest class4 = new org.apache.commons.collections4.functors.CatchAndRethrowClosureTest();
		class4.testThrowingClosure();
		org.apache.commons.collections4.functors.EqualPredicateTest class5 = new org.apache.commons.collections4.functors.EqualPredicateTest();
		try {
			class5.testNullArgumentEqualsNullPredicate();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class5.objectFactoryUsesEqualsForTest();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class5.testPredicateTypeCanBeSuperClassOfObject();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
	}
}