package org.apache.maven.lifecycle.internal.builder.multithreaded;

public class Driver {
	public void runall() {
		org.apache.maven.lifecycle.internal.builder.multithreaded.ThreadOutputMuxerTest class1 = new org.apache.maven.lifecycle.internal.builder.multithreaded.ThreadOutputMuxerTest();
		try {
			class1.testSingleThreaded();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testMultiThreaded();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.builder.multithreaded.ConcurrencyDependencyGraphTest class2 = new org.apache.maven.lifecycle.internal.builder.multithreaded.ConcurrencyDependencyGraphTest();
		try {
			class2.testGraph();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
	}
}