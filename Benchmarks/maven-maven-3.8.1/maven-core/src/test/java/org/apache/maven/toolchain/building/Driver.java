package org.apache.maven.toolchain.building;

public class Driver {
	public void runall() {
		org.apache.maven.toolchain.building.ToolchainsBuildingExceptionTest class1 = new org.apache.maven.toolchain.building.ToolchainsBuildingExceptionTest();
		class1.testNoProblems();
		class1.testOneProblem();
		class1.testUnknownPositionAndSource();
		class1.testUnknownPosition();
		org.apache.maven.toolchain.building.DefaultToolchainsBuilderTest class2 = new org.apache.maven.toolchain.building.DefaultToolchainsBuilderTest();
		class2.onSetup();
		try {
			class2.testBuildEmptyRequest();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.testBuildRequestWithUserToolchains();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testBuildRequestWithGlobalToolchains();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testBuildRequestWithBothToolchains();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.testStrictToolchainsParseException();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.testIOException();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.testEnvironmentVariablesAreInterpolated();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.testNonExistingEnvironmentVariablesAreNotInterpolated();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.testEnvironmentVariablesWithSpecialCharactersAreInterpolated();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
	}
}