package org.apache.maven.plugin.internal;

public class Driver {
	public void runall() {
		org.apache.maven.plugin.internal.DefaultLegacySupportTest class1 = new org.apache.maven.plugin.internal.DefaultLegacySupportTest();
		try {
			class1.testSetSession();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
	}
}