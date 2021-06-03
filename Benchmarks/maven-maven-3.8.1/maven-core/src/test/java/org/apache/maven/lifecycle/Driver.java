package org.apache.maven.lifecycle;

public class Driver {
	public void runall() {
		org.apache.maven.lifecycle.LifecycleExecutorTest class1 = new org.apache.maven.lifecycle.LifecycleExecutorTest();
		try {
			class1.testCalculationOfBuildPlanWithIndividualTaskWherePluginIsSpecifiedInThePom();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testCalculationOfBuildPlanWithIndividualTaskOfTheCleanLifecycle();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testCalculationOfBuildPlanWithIndividualTaskOfTheCleanCleanGoal();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testCalculationOfBuildPlanTasksOfTheCleanLifecycleAndTheInstallLifecycle();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testCalculationOfBuildPlanWithMultipleExecutionsOfModello();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testLifecycleQueryingUsingADefaultLifecyclePhase();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testLifecyclePluginsRetrievalForDefaultLifecycle();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testPluginConfigurationCreation();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.testInvalidGoalName();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.testPluginPrefixRetrieval();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.testFindingPluginPrefixforCleanClean();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class1.testSetupMojoExecution();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class1.testExecutionListeners();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		org.apache.maven.lifecycle.DefaultLifecyclesTest class2 = new org.apache.maven.lifecycle.DefaultLifecyclesTest();
		try {
			class2.testLifecycle();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.maven.lifecycle.MavenExecutionPlanTest class3 = new org.apache.maven.lifecycle.MavenExecutionPlanTest();
		try {
			class3.testFindLastInPhase();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class3.testThreadSafeMojos();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class3.testFindLastWhenFirst();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class3.testFindLastInPhaseMisc();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		org.apache.maven.lifecycle.LifecycleExecutorSubModulesTest class4 = new org.apache.maven.lifecycle.LifecycleExecutorSubModulesTest();
		try {
			class4.testCreation();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
	}
}