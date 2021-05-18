package org.apache.maven.lifecycle.internal;

public class Driver {
	public void runall() {
		org.apache.maven.lifecycle.internal.LifecycleTaskSegmentCalculatorImplTest class1 = new org.apache.maven.lifecycle.internal.LifecycleTaskSegmentCalculatorImplTest();
		try {
			class1.testCalculateProjectBuilds();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.BuilderCommonTest class2 = new org.apache.maven.lifecycle.internal.BuilderCommonTest();
		try {
			class2.testResolveBuildPlan();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testHandleBuildError();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testAttachToThread();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.testGetKey();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.LifecycleDependencyResolverTest class3 = new org.apache.maven.lifecycle.internal.LifecycleDependencyResolverTest();
		try {
			class3.testCachedReactorProjectDependencies();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.ProjectBuildListTest class4 = new org.apache.maven.lifecycle.internal.ProjectBuildListTest();
		try {
			class4.testGetByTaskSegment();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.BuildListCalculatorTest class5 = new org.apache.maven.lifecycle.internal.BuildListCalculatorTest();
		try {
			class5.testCalculateProjectBuilds();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.LifecycleExecutionPlanCalculatorTest class6 = new org.apache.maven.lifecycle.internal.LifecycleExecutionPlanCalculatorTest();
		try {
			class6.testCalculateExecutionPlanWithGoalTasks();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.ConcurrencyDependencyGraphTest class7 = new org.apache.maven.lifecycle.internal.ConcurrencyDependencyGraphTest();
		try {
			class7.testConcurrencyGraphPrimaryVersion();
		}
		catch (org.apache.maven.plugin.InvalidPluginDescriptorException err10) {
			err10.printStackTrace();
		}
		catch (org.apache.maven.plugin.version.PluginVersionResolutionException err11) {
			err11.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginDescriptorParsingException err12) {
			err12.printStackTrace();
		}
		catch (org.apache.maven.plugin.prefix.NoPluginFoundForPrefixException err13) {
			err13.printStackTrace();
		}
		catch (org.apache.maven.plugin.MojoNotFoundException err14) {
			err14.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginNotFoundException err15) {
			err15.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginResolutionException err16) {
			err16.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecyclePhaseNotFoundException err17) {
			err17.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecycleNotFoundException err18) {
			err18.printStackTrace();
		}
		try {
			class7.testConcurrencyGraphDifferentCompletionOrder();
		}
		catch (org.apache.maven.plugin.InvalidPluginDescriptorException err19) {
			err19.printStackTrace();
		}
		catch (org.apache.maven.plugin.version.PluginVersionResolutionException err20) {
			err20.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginDescriptorParsingException err21) {
			err21.printStackTrace();
		}
		catch (org.apache.maven.plugin.prefix.NoPluginFoundForPrefixException err22) {
			err22.printStackTrace();
		}
		catch (org.apache.maven.plugin.MojoNotFoundException err23) {
			err23.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginNotFoundException err24) {
			err24.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginResolutionException err25) {
			err25.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecyclePhaseNotFoundException err26) {
			err26.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecycleNotFoundException err27) {
			err27.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.PhaseRecorderTest class8 = new org.apache.maven.lifecycle.internal.PhaseRecorderTest();
		try {
			class8.testObserveExecution();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
	}
}