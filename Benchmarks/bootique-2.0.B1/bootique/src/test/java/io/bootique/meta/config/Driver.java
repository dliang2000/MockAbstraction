package io.bootique.meta.config;

public class Driver {
	public void runall() {
		io.bootique.meta.config.ConfigObjectMetadataTest class1 = new io.bootique.meta.config.ConfigObjectMetadataTest();
		class1.testGetAllSubconfigs();
		io.bootique.meta.config.ConfigMetadataIT class2 = new io.bootique.meta.config.ConfigMetadataIT();
		class2.testSingleConfig();
		class2.testRecursiveConfig();
		class2.testValueObjectConfig();
		class2.testSampleValue();
		try {
			class2.testGetValueLabel();
		}
		catch (java.lang.NoSuchFieldException err1) {
			err1.printStackTrace();
		}
		class2.testNoTypeValueLabel();
		try {
			class2.testTypeValueLabel();
		}
		catch (java.lang.NoSuchFieldException err2) {
			err2.printStackTrace();
		}
		io.bootique.meta.config.ConfigMetadataCompilerTest class3 = new io.bootique.meta.config.ConfigMetadataCompilerTest();
		class3.testCompile();
		class3.testCompile_Cycle();
		class3.testCompile_Inheritance();
		class3.testCompile_Map();
		class3.testCompile_Map_Inheritance();
		class3.testCompile_InheritanceFromInterface();
		io.bootique.meta.config.ConfigHierarchyResolverTest class4 = new io.bootique.meta.config.ConfigHierarchyResolverTest();
		class4.testCreate_Classes();
		class4.testCreate_BaseInterface();
	}
}