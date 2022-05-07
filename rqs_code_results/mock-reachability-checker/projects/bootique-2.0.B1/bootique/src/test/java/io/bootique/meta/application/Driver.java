package io.bootique.meta.application;

public class Driver {
	public void runall() {
		io.bootique.meta.application.ApplicationMetadataIT class1 = new io.bootique.meta.application.ApplicationMetadataIT();
		class1.testDefault();
		class1.testCustomDescription();
		io.bootique.meta.application.CommandMetadataTest class2 = new io.bootique.meta.application.CommandMetadataTest();
		class2.testGetShortName();
		class2.testGetName();
		class2.testGetName_CamelCase();
		class2.testGetName_UpperCase();
		io.bootique.meta.application.ApplicationIntrospectorTest class3 = new io.bootique.meta.application.ApplicationIntrospectorTest();
		class3.testMainClass();
		class3.testAppNameFromRuntime();
	}
}