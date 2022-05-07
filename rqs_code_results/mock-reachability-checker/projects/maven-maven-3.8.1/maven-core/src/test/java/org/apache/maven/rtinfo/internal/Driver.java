package org.apache.maven.rtinfo.internal;

public class Driver {
	public void runall() {
		org.apache.maven.rtinfo.internal.DefaultRuntimeInformationTest class1 = new org.apache.maven.rtinfo.internal.DefaultRuntimeInformationTest();
		try {
			class1.testGetMavenVersion();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testIsMavenVersion();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
	}
}