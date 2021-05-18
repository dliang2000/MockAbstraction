package org.apache.commons.collections4.queue;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.queue.CircularFifoQueueTest class1 = new org.apache.commons.collections4.queue.CircularFifoQueueTest();
		class1.testCircularFifoQueueCircular();
		class1.testCircularFifoQueueRemove();
		class1.testConstructorException1();
		class1.testConstructorException2();
		class1.testConstructorException3();
		try {
			class1.testRemoveError1();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testRemoveError2();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testRemoveError3();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testRemoveError4();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testRemoveError5();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testRemoveError6();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testRemoveError7();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testRemoveError8();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.testRemoveError9();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.testRepeatedSerialization();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class1.testGetIndex();
		org.apache.commons.collections4.queue.TransformedQueueTest class2 = new org.apache.commons.collections4.queue.TransformedQueueTest();
		class2.testTransformedQueue();
		class2.testTransformedQueue_decorateTransform();
		org.apache.commons.collections4.queue.PredicatedQueueTest class3 = new org.apache.commons.collections4.queue.PredicatedQueueTest();
		class3.testGet();
		class3.testRemove();
		org.apache.commons.collections4.queue.UnmodifiableQueueTest class4 = new org.apache.commons.collections4.queue.UnmodifiableQueueTest();
		class4.testQueueRemove();
		class4.testUnmodifiable();
		class4.testDecorateFactory();
		org.apache.commons.collections4.queue.SynchronizedQueueTest class5 = new org.apache.commons.collections4.queue.SynchronizedQueueTest();
		try {
			class5.testCreate();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
	}
}