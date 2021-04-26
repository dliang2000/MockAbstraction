package org.apache.commons.collections4.iterators;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.iterators.LoopingIteratorTest class1 = new org.apache.commons.collections4.iterators.LoopingIteratorTest();
		try {
			class1.testConstructorEx();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testLooping0();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testLooping1();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testLooping2();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testLooping3();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testRemoving1();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testReset();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testSize();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.apache.commons.collections4.iterators.IteratorEnumerationTest class2 = new org.apache.commons.collections4.iterators.IteratorEnumerationTest();
		class2.testEnumeration();
		org.apache.commons.collections4.iterators.FilterListIteratorTest class3 = new org.apache.commons.collections4.iterators.FilterListIteratorTest();
		class3.setUp();
		try {
			class3.tearDown();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		class3.testWalkLists();
		class3.testManual();
		class3.testTruePredicate();
		class3.testFalsePredicate();
		class3.testEvens();
		class3.testOdds();
		class3.testThrees();
		class3.testFours();
		class3.testNestedSixes();
		class3.testNestedSixes2();
		class3.testNestedSixes3();
		class3.testNextChangesPrevious();
		class3.testPreviousChangesNext();
		class3.testFailingHasNextBug();
		try {
			class3.testCollections360();
		}
		catch (java.lang.Throwable err10) {
			err10.printStackTrace();
		}
		org.apache.commons.collections4.iterators.LoopingListIteratorTest class4 = new org.apache.commons.collections4.iterators.LoopingListIteratorTest();
		try {
			class4.testConstructorEx();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class4.testLooping0();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class4.testLooping1();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class4.testLooping2();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		class4.testJoggingNotOverBoundary();
		class4.testJoggingOverBoundary();
		class4.testRemovingElementsAndIteratingForward();
		class4.testRemovingElementsAndIteratingBackwards();
		class4.testReset();
		class4.testAdd();
		class4.testNextAndPreviousIndex();
		class4.testSet();
	}
}