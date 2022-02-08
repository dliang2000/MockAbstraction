package io.bootique.meta.config;

public class Driver {
	public void runall() {
		io.bootique.meta.config.ConfigMetadataCompilerTest class1 = new io.bootique.meta.config.ConfigMetadataCompilerTest();
		class1.testCompile();
		class1.testCompile_Cycle();
		class1.testCompile_Inheritance();
		class1.testCompile_Map();
		class1.testCompile_Map_Inheritance();
		class1.testCompile_InheritanceFromInterface();
		io.bootique.meta.config.ConfigObjectMetadataTest class2 = new io.bootique.meta.config.ConfigObjectMetadataTest();
		class2.testGetAllSubconfigs();
		io.bootique.meta.config.ConfigHierarchyResolverTest class3 = new io.bootique.meta.config.ConfigHierarchyResolverTest();
		class3.testCreate_Classes();
		class3.testCreate_BaseInterface();
		io.bootique.meta.config.ConfigMetadataIT class4 = new io.bootique.meta.config.ConfigMetadataIT();
		class4.testSingleConfig();
		class4.testRecursiveConfig();
		class4.testValueObjectConfig();
		class4.testSampleValue();
		try {
			class4.testGetValueLabel();
		}
		catch (java.lang.NoSuchFieldException err1) {
			err1.printStackTrace();
		}
		class4.testNoTypeValueLabel();
		try {
			class4.testTypeValueLabel();
		}
		catch (java.lang.NoSuchFieldException err2) {
			err2.printStackTrace();
		}
	}
}