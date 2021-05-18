package org.apache.maven.execution;

public class Driver {
	public void runall() {
		org.apache.maven.execution.DefaultMavenExecutionRequestPopulatorTest class1 = new org.apache.maven.execution.DefaultMavenExecutionRequestPopulatorTest();
		try {
			class1.testPluginRepositoryInjection();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.maven.execution.DefaultMavenExecutionTest class2 = new org.apache.maven.execution.DefaultMavenExecutionTest();
		class2.testCopyDefault();
		class2.testResultWithNullTopologicallySortedProjectsIsEmptyList();
	}
}