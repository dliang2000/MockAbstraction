package org.apache.maven.lifecycle.internal.builder.multithreaded;

public class Driver {
	public void runall() {
		org.apache.maven.lifecycle.internal.builder.multithreaded.ConcurrencyDependencyGraphTest class1 = new org.apache.maven.lifecycle.internal.builder.multithreaded.ConcurrencyDependencyGraphTest();
		try {
			class1.testGraph();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.builder.multithreaded.ThreadOutputMuxerTest class2 = new org.apache.maven.lifecycle.internal.builder.multithreaded.ThreadOutputMuxerTest();
		try {
			class2.testSingleThreaded();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testMultiThreaded();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
	}
}