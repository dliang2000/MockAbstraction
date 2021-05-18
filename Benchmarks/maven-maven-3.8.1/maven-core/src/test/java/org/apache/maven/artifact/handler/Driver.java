package org.apache.maven.artifact.handler;

public class Driver {
	public void runall() {
		org.apache.maven.artifact.handler.ArtifactHandlerTest class1 = new org.apache.maven.artifact.handler.ArtifactHandlerTest();
		try {
			class1.testAptConsistency();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
	}
}