package org.apache.maven.execution.scope.internal;

public class Driver {
	public void runall() {
		org.apache.maven.execution.scope.internal.MojoExecutionScopeTest class1 = new org.apache.maven.execution.scope.internal.MojoExecutionScopeTest();
		try {
			class1.testNestedEnter();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testMultiKeyInstance();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
	}
}