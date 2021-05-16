package io.bootique.meta.application;

public class Driver {
	public void runall() {
		io.bootique.meta.application.CommandMetadataTest class1 = new io.bootique.meta.application.CommandMetadataTest();
		class1.testGetShortName();
		class1.testGetName();
		class1.testGetName_CamelCase();
		class1.testGetName_UpperCase();
		io.bootique.meta.application.ApplicationMetadataIT class2 = new io.bootique.meta.application.ApplicationMetadataIT();
		class2.testDefault();
		class2.testCustomDescription();
		io.bootique.meta.application.ApplicationIntrospectorTest class3 = new io.bootique.meta.application.ApplicationIntrospectorTest();
		class3.testMainClass();
		class3.testAppNameFromRuntime();
	}
}