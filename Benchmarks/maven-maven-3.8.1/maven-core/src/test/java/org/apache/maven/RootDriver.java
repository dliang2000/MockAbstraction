package org.apache.maven;

public class RootDriver {
	public static void main(String[] argv) {
		org.apache.maven.lifecycle.mapping.Driver class1 = new org.apache.maven.lifecycle.mapping.Driver();
		class1.runall();
		org.apache.maven.artifact.resolver.filter.Driver class2 = new org.apache.maven.artifact.resolver.filter.Driver();
		class2.runall();
		org.apache.maven.configuration.Driver class3 = new org.apache.maven.configuration.Driver();
		class3.runall();
		org.apache.maven.lifecycle.Driver class4 = new org.apache.maven.lifecycle.Driver();
		class4.runall();
		org.apache.maven.repository.Driver class5 = new org.apache.maven.repository.Driver();
		class5.runall();
		org.apache.maven.execution.scope.internal.Driver class6 = new org.apache.maven.execution.scope.internal.Driver();
		class6.runall();
		org.apache.maven.project.canonical.Driver class7 = new org.apache.maven.project.canonical.Driver();
		class7.runall();
		org.apache.maven.execution.Driver class8 = new org.apache.maven.execution.Driver();
		class8.runall();
		org.apache.maven.toolchain.merge.Driver class9 = new org.apache.maven.toolchain.merge.Driver();
		class9.runall();
		org.apache.maven.lifecycle.internal.Driver class10 = new org.apache.maven.lifecycle.internal.Driver();
		class10.runall();
		org.apache.maven.graph.Driver class11 = new org.apache.maven.graph.Driver();
		class11.runall();
		org.apache.maven.project.artifact.Driver class12 = new org.apache.maven.project.artifact.Driver();
		class12.runall();
		org.apache.maven.artifact.handler.Driver class13 = new org.apache.maven.artifact.handler.Driver();
		class13.runall();
		org.apache.maven.toolchain.Driver class14 = new org.apache.maven.toolchain.Driver();
		class14.runall();
		org.apache.maven.lifecycle.internal.builder.multithreaded.Driver class15 = new org.apache.maven.lifecycle.internal.builder.multithreaded.Driver();
		class15.runall();
		org.apache.maven.project.harness.Driver class16 = new org.apache.maven.project.harness.Driver();
		class16.runall();
		org.apache.maven.settings.Driver class17 = new org.apache.maven.settings.Driver();
		class17.runall();
		org.apache.maven.project.Driver class18 = new org.apache.maven.project.Driver();
		class18.runall();
		org.apache.maven.plugin.internal.Driver class19 = new org.apache.maven.plugin.internal.Driver();
		class19.runall();
		org.apache.maven.toolchain.building.Driver class20 = new org.apache.maven.toolchain.building.Driver();
		class20.runall();
		org.apache.maven.exception.Driver class21 = new org.apache.maven.exception.Driver();
		class21.runall();
		org.apache.maven.lifecycle.internal.stub.Driver class22 = new org.apache.maven.lifecycle.internal.stub.Driver();
		class22.runall();
		org.apache.maven.plugin.Driver class23 = new org.apache.maven.plugin.Driver();
		class23.runall();
		org.apache.maven.rtinfo.internal.Driver class24 = new org.apache.maven.rtinfo.internal.Driver();
		class24.runall();
		org.apache.maven.MavenTest class25 = new org.apache.maven.MavenTest();
		try {
			class25.testLifecycleExecutionUsingADefaultLifecyclePhase();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.maven.ProjectDependenciesResolverTest class26 = new org.apache.maven.ProjectDependenciesResolverTest();
		try {
			class26.testSystemScopeDependencies();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class26.testSystemScopeDependencyIsPresentInTheCompileClasspathElements();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.maven.MavenLifecycleParticipantTest class27 = new org.apache.maven.MavenLifecycleParticipantTest();
		try {
			class27.testDependencyInjection();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class27.testReactorDependencyInjection();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		org.apache.maven.DefaultMavenTest class28 = new org.apache.maven.DefaultMavenTest();
		try {
			class28.testThatErrorDuringProjectDependencyGraphCreationAreStored();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
	}
}