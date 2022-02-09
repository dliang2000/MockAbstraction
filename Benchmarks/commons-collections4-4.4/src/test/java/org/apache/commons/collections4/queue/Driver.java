package org.apache.commons.collections4.queue;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.queue.TransformedQueueTest class1 = new org.apache.commons.collections4.queue.TransformedQueueTest(null);
		class1.testTransformedQueue();
		class1.testTransformedQueue_decorateTransform();
		org.apache.commons.collections4.queue.SynchronizedQueueTest class2 = new org.apache.commons.collections4.queue.SynchronizedQueueTest(null);
		try {
			class2.testCreate();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.commons.collections4.queue.CircularFifoQueueTest class3 = new org.apache.commons.collections4.queue.CircularFifoQueueTest(null);
		class3.testCircularFifoQueueCircular();
		class3.testCircularFifoQueueRemove();
		class3.testConstructorException1();
		class3.testConstructorException2();
		class3.testConstructorException3();
		try {
			class3.testRemoveError1();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.testRemoveError2();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.testRemoveError3();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class3.testRemoveError4();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class3.testRemoveError5();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class3.testRemoveError6();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class3.testRemoveError7();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.testRemoveError8();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class3.testRemoveError9();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class3.testRepeatedSerialization();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		class3.testGetIndex();
		org.apache.commons.collections4.queue.PredicatedQueueTest class4 = new org.apache.commons.collections4.queue.PredicatedQueueTest(null);
		class4.testGet();
		class4.testRemove();
		org.apache.commons.collections4.queue.UnmodifiableQueueTest class5 = new org.apache.commons.collections4.queue.UnmodifiableQueueTest(null);
		class5.testQueueRemove();
		class5.testUnmodifiable();
		class5.testDecorateFactory();
	}
}