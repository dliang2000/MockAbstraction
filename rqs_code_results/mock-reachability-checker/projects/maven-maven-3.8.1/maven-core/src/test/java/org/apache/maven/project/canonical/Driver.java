package org.apache.maven.project.canonical;

public class Driver {
	public void runall() {
		org.apache.maven.project.canonical.CanonicalProjectBuilderTest class1 = new org.apache.maven.project.canonical.CanonicalProjectBuilderTest();
		try {
			class1.testProjectBuilder();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
	}
}