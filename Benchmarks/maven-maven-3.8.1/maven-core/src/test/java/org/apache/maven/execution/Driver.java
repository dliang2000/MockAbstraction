package org.apache.maven.execution;

public class Driver {
	public void runall() {
		org.apache.maven.execution.DefaultMavenExecutionTest class1 = new org.apache.maven.execution.DefaultMavenExecutionTest();
		class1.testCopyDefault();
		class1.testResultWithNullTopologicallySortedProjectsIsEmptyList();
		org.apache.maven.execution.DefaultMavenExecutionRequestPopulatorTest class2 = new org.apache.maven.execution.DefaultMavenExecutionRequestPopulatorTest();
		try {
			class2.testPluginRepositoryInjection();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
	}
}