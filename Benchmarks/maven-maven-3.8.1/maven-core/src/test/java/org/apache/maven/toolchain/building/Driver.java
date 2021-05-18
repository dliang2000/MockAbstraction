package org.apache.maven.toolchain.building;

public class Driver {
	public void runall() {
		org.apache.maven.toolchain.building.DefaultToolchainsBuilderTest class1 = new org.apache.maven.toolchain.building.DefaultToolchainsBuilderTest();
		class1.onSetup();
		try {
			class1.testBuildEmptyRequest();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testBuildRequestWithUserToolchains();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testBuildRequestWithGlobalToolchains();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testBuildRequestWithBothToolchains();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testStrictToolchainsParseException();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testIOException();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testEnvironmentVariablesAreInterpolated();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testNonExistingEnvironmentVariablesAreNotInterpolated();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.testEnvironmentVariablesWithSpecialCharactersAreInterpolated();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		org.apache.maven.toolchain.building.ToolchainsBuildingExceptionTest class2 = new org.apache.maven.toolchain.building.ToolchainsBuildingExceptionTest();
		class2.testNoProblems();
		class2.testOneProblem();
		class2.testUnknownPositionAndSource();
		class2.testUnknownPosition();
	}
}