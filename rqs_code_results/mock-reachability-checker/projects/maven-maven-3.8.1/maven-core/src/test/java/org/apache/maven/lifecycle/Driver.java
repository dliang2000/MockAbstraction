package org.apache.maven.lifecycle;

public class Driver {
	public void runall() {
		org.apache.maven.lifecycle.DefaultLifecyclesTest class1 = new org.apache.maven.lifecycle.DefaultLifecyclesTest();
		try {
			class1.testLifecycle();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.maven.lifecycle.LifecycleExecutorSubModulesTest class2 = new org.apache.maven.lifecycle.LifecycleExecutorSubModulesTest();
		try {
			class2.testCreation();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.apache.maven.lifecycle.LifecycleExecutorTest class3 = new org.apache.maven.lifecycle.LifecycleExecutorTest();
		try {
			class3.testCalculationOfBuildPlanWithIndividualTaskWherePluginIsSpecifiedInThePom();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.testCalculationOfBuildPlanWithIndividualTaskOfTheCleanLifecycle();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class3.testCalculationOfBuildPlanWithIndividualTaskOfTheCleanCleanGoal();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class3.testCalculationOfBuildPlanTasksOfTheCleanLifecycleAndTheInstallLifecycle();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class3.testCalculationOfBuildPlanWithMultipleExecutionsOfModello();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class3.testLifecycleQueryingUsingADefaultLifecyclePhase();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.testLifecyclePluginsRetrievalForDefaultLifecycle();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class3.testPluginConfigurationCreation();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class3.testInvalidGoalName();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class3.testPluginPrefixRetrieval();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class3.testFindingPluginPrefixforCleanClean();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class3.testSetupMojoExecution();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class3.testExecutionListeners();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		org.apache.maven.lifecycle.MavenExecutionPlanTest class4 = new org.apache.maven.lifecycle.MavenExecutionPlanTest();
		try {
			class4.testFindLastInPhase();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class4.testThreadSafeMojos();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class4.testFindLastWhenFirst();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class4.testFindLastInPhaseMisc();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
	}
}