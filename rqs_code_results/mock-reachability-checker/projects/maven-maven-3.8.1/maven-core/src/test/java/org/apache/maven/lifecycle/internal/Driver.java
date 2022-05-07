package org.apache.maven.lifecycle.internal;

public class Driver {
	public void runall() {
		org.apache.maven.lifecycle.internal.ProjectBuildListTest class1 = new org.apache.maven.lifecycle.internal.ProjectBuildListTest();
		try {
			class1.testGetByTaskSegment();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.PhaseRecorderTest class2 = new org.apache.maven.lifecycle.internal.PhaseRecorderTest();
		try {
			class2.testObserveExecution();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.BuildListCalculatorTest class3 = new org.apache.maven.lifecycle.internal.BuildListCalculatorTest();
		try {
			class3.testCalculateProjectBuilds();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.BuilderCommonTest class4 = new org.apache.maven.lifecycle.internal.BuilderCommonTest();
		try {
			class4.testResolveBuildPlan();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class4.testHandleBuildError();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class4.testAttachToThread();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class4.testGetKey();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.ConcurrencyDependencyGraphTest class5 = new org.apache.maven.lifecycle.internal.ConcurrencyDependencyGraphTest();
		try {
			class5.testConcurrencyGraphPrimaryVersion();
		}
		catch (org.apache.maven.plugin.InvalidPluginDescriptorException err8) {
			err8.printStackTrace();
		}
		catch (org.apache.maven.plugin.version.PluginVersionResolutionException err9) {
			err9.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginDescriptorParsingException err10) {
			err10.printStackTrace();
		}
		catch (org.apache.maven.plugin.prefix.NoPluginFoundForPrefixException err11) {
			err11.printStackTrace();
		}
		catch (org.apache.maven.plugin.MojoNotFoundException err12) {
			err12.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginNotFoundException err13) {
			err13.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginResolutionException err14) {
			err14.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecyclePhaseNotFoundException err15) {
			err15.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecycleNotFoundException err16) {
			err16.printStackTrace();
		}
		try {
			class5.testConcurrencyGraphDifferentCompletionOrder();
		}
		catch (org.apache.maven.plugin.InvalidPluginDescriptorException err17) {
			err17.printStackTrace();
		}
		catch (org.apache.maven.plugin.version.PluginVersionResolutionException err18) {
			err18.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginDescriptorParsingException err19) {
			err19.printStackTrace();
		}
		catch (org.apache.maven.plugin.prefix.NoPluginFoundForPrefixException err20) {
			err20.printStackTrace();
		}
		catch (org.apache.maven.plugin.MojoNotFoundException err21) {
			err21.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginNotFoundException err22) {
			err22.printStackTrace();
		}
		catch (org.apache.maven.plugin.PluginResolutionException err23) {
			err23.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecyclePhaseNotFoundException err24) {
			err24.printStackTrace();
		}
		catch (org.apache.maven.lifecycle.LifecycleNotFoundException err25) {
			err25.printStackTrace();
		}
		org.apache.maven.lifecycle.internal.LifecycleExecutionPlanCalculatorTest class6 = new org.apache.maven.lifecycle.internal.LifecycleExecutionPlanCalculatorTest();
		try {
			class6.testCalculateExecutionPlanWithGoalTasks();
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