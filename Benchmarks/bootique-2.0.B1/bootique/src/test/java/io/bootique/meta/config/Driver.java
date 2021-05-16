package io.bootique.meta.config;

public class Driver {
	public void runall() {
		io.bootique.meta.config.ConfigHierarchyResolverTest class1 = new io.bootique.meta.config.ConfigHierarchyResolverTest();
		class1.testCreate_Classes();
		class1.testCreate_BaseInterface();
		io.bootique.meta.config.ConfigObjectMetadataTest class2 = new io.bootique.meta.config.ConfigObjectMetadataTest();
		class2.testGetAllSubconfigs();
		io.bootique.meta.config.ConfigMetadataIT class3 = new io.bootique.meta.config.ConfigMetadataIT();
		class3.testSingleConfig();
		class3.testRecursiveConfig();
		class3.testValueObjectConfig();
		class3.testSampleValue();
		try {
			class3.testGetValueLabel();
		}
		catch (java.lang.NoSuchFieldException err1) {
			err1.printStackTrace();
		}
		class3.testNoTypeValueLabel();
		try {
			class3.testTypeValueLabel();
		}
		catch (java.lang.NoSuchFieldException err2) {
			err2.printStackTrace();
		}
		io.bootique.meta.config.ConfigMetadataCompilerTest class4 = new io.bootique.meta.config.ConfigMetadataCompilerTest();
		class4.testCompile();
		class4.testCompile_Cycle();
		class4.testCompile_Inheritance();
		class4.testCompile_Map();
		class4.testCompile_Map_Inheritance();
		class4.testCompile_InheritanceFromInterface();
	}
}