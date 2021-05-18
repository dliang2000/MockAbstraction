package org.apache.maven.toolchain;

public class Driver {
	public void runall() {
		org.apache.maven.toolchain.DefaultToolchainManagerTest class1 = new org.apache.maven.toolchain.DefaultToolchainManagerTest();
		try {
			class1.onSetup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.testNoModels();
		class1.testModelNoFactory();
		class1.testModelAndFactory();
		class1.testModelsAndFactory();
		try {
			class1.testRequirements();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.apache.maven.toolchain.RequirementMatcherFactoryTest class2 = new org.apache.maven.toolchain.RequirementMatcherFactoryTest();
		class2.testCreateExactMatcher();
		class2.testCreateVersionMatcher();
		org.apache.maven.toolchain.DefaultToolchainTest class3 = new org.apache.maven.toolchain.DefaultToolchainTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class3.testGetModel();
		class3.testGetType();
		class3.testGetLogger();
		class3.testMissingRequirementProperty();
		class3.testNonMatchingRequirementProperty();
		try {
			class3.testEquals();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.apache.maven.toolchain.DefaultToolchainManagerPrivateTest class4 = new org.apache.maven.toolchain.DefaultToolchainManagerPrivateTest();
		class4.setUp();
		try {
			class4.testToolchainsForAvailableType();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class4.testToolchainsForUnknownType();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class4.testToolchainsForConfiguredType();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class4.testMisconfiguredToolchain();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
	}
}