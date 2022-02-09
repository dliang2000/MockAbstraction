package org.apache.maven.lifecycle.internal;

public class Driver {
	public void runall() {
		org.apache.maven.lifecycle.internal.ConcurrencyDependencyGraphTest class1 = new org.apache.maven.lifecycle.internal.ConcurrencyDependencyGraphTest();
		try {
			class1.testConcurrencyGraphPrimaryVersion();
		}
		catch (org.apache.maven.plugin.InvalidPluginDescriptorException err1) {
			err1.printStackTrace();
		}
		catch (org.apache.maven.plugin.version.PluginVersionResolutionException err2) {
			err2.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginDescriptorParsingException err3) {
			err3.printStackTrace();
		}
		catch (org.apache.maven.plugin.prefix.NoPluginFoundForPrefixException err4) {
			err4.printStackTrace();
		}
		catch (org.apache.maven.plugin.MojoNotFoundException err5) {
			err5.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginNotFoundException err6) {
			err6.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginResolutionException err7) {
			err7.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecyclePhaseNotFoundException err8) {
			err8.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecycleNotFoundException err9) {
			err9.printStackTrace();
		}
		try {
			class1.testConcurrencyGraphDifferentCompletionOrder();
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
		org.apache.maven.lifecycle.internal.BuildListCalculatorTest class2 = new org.apache.maven.lifecycle.internal.BuildListCalculatorTest();
		try {
			class2.testCalculateProjectBuilds();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.LifecycleExecutionPlanCalculatorTest class3 = new org.apache.maven.lifecycle.internal.LifecycleExecutionPlanCalculatorTest();
		try {
			class3.testCalculateExecutionPlanWithGoalTasks();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.ProjectBuildListTest class4 = new org.apache.maven.lifecycle.internal.ProjectBuildListTest();
		try {
			class4.testGetByTaskSegment();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.BuilderCommonTest class5 = new org.apache.maven.lifecycle.internal.BuilderCommonTest();
		try {
			class5.testResolveBuildPlan();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class5.testHandleBuildError();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class5.testAttachToThread();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class5.testGetKey();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.PhaseRecorderTest class6 = new org.apache.maven.lifecycle.internal.PhaseRecorderTest();
		try {
			class6.testObserveExecution();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.LifecycleDependencyResolverTest class7 = new org.apache.maven.lifecycle.internal.LifecycleDependencyResolverTest();
		try {
			class7.testCachedReactorProjectDependencies();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.LifecycleTaskSegmentCalculatorImplTest class8 = new org.apache.maven.lifecycle.internal.LifecycleTaskSegmentCalculatorImplTest();
		try {
			class8.testCalculateProjectBuilds();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
	}
}