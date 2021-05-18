package org.apache.maven.lifecycle;

public class Driver {
	public void runall() {
		org.apache.maven.lifecycle.DelegatingMojoExecutionListener class1 = new org.apache.maven.lifecycle.DelegatingMojoExecutionListener();
		org.apache.maven.lifecycle.LifecycleExecutorTest class2 = new org.apache.maven.lifecycle.LifecycleExecutorTest();
		try {
			class2.testCalculationOfBuildPlanWithIndividualTaskWherePluginIsSpecifiedInThePom();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.testCalculationOfBuildPlanWithIndividualTaskOfTheCleanLifecycle();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testCalculationOfBuildPlanWithIndividualTaskOfTheCleanCleanGoal();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testCalculationOfBuildPlanTasksOfTheCleanLifecycleAndTheInstallLifecycle();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.testCalculationOfBuildPlanWithMultipleExecutionsOfModello();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.testLifecycleQueryingUsingADefaultLifecyclePhase();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.testLifecyclePluginsRetrievalForDefaultLifecycle();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.testPluginConfigurationCreation();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.testInvalidGoalName();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class2.testPluginPrefixRetrieval();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class2.testFindingPluginPrefixforCleanClean();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class2.testSetupMojoExecution();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class2.testExecutionListeners();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		org.apache.maven.lifecycle.EmptyLifecyclePluginAnalyzer class3 = new org.apache.maven.lifecycle.EmptyLifecyclePluginAnalyzer();
		org.apache.maven.lifecycle.DefaultLifecyclesTest class4 = new org.apache.maven.lifecycle.DefaultLifecyclesTest();
		try {
			class4.testLifecycle();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.maven.lifecycle.DelegatingProjectExecutionListener class5 = new org.apache.maven.lifecycle.DelegatingProjectExecutionListener();
		org.apache.maven.lifecycle.MavenExecutionPlanTest class6 = new org.apache.maven.lifecycle.MavenExecutionPlanTest();
		try {
			class6.testFindLastInPhase();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class6.testThreadSafeMojos();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class6.testFindLastWhenFirst();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class6.testFindLastInPhaseMisc();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		org.apache.maven.lifecycle.LifecycleExecutorSubModulesTest class7 = new org.apache.maven.lifecycle.LifecycleExecutorSubModulesTest();
		try {
			class7.testCreation();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
	}
}