package org.apache.commons.collections4.queue;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.queue.UnmodifiableQueueTest class1 = new org.apache.commons.collections4.queue.UnmodifiableQueueTest(null);
		class1.testQueueRemove();
		class1.testUnmodifiable();
		class1.testDecorateFactory();
		org.apache.commons.collections4.queue.CircularFifoQueueTest class2 = new org.apache.commons.collections4.queue.CircularFifoQueueTest(null);
		class2.testCircularFifoQueueCircular();
		class2.testCircularFifoQueueRemove();
		class2.testConstructorException1();
		class2.testConstructorException2();
		class2.testConstructorException3();
		try {
			class2.testRemoveError1();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.testRemoveError2();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testRemoveError3();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testRemoveError4();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.testRemoveError5();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.testRemoveError6();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.testRemoveError7();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.testRemoveError8();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.testRemoveError9();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class2.testRepeatedSerialization();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class2.testGetIndex();
		org.apache.commons.collections4.queue.PredicatedQueueTest class3 = new org.apache.commons.collections4.queue.PredicatedQueueTest(null);
		class3.testGet();
		class3.testRemove();
		org.apache.commons.collections4.queue.TransformedQueueTest class4 = new org.apache.commons.collections4.queue.TransformedQueueTest(null);
		class4.testTransformedQueue();
		class4.testTransformedQueue_decorateTransform();
		org.apache.commons.collections4.queue.SynchronizedQueueTest class5 = new org.apache.commons.collections4.queue.SynchronizedQueueTest(null);
		try {
			class5.testCreate();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
	}
}