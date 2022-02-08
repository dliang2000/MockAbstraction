package io.bootique.help.config;

public class Driver {
	public void runall() {
		io.bootique.help.config.ConfigSectionGeneratorFoldingTest class1 = new io.bootique.help.config.ConfigSectionGeneratorFoldingTest();
		class1.testVisitObjectConfig();
		io.bootique.help.config.ConfigSectionGeneratorTest class2 = new io.bootique.help.config.ConfigSectionGeneratorTest();
		class2.testVisitObjectConfig();
		class2.testVisitListOfValues();
		class2.testVisitListOfObjects();
		try {
			class2.testVisitMapOfValues();
		}
		catch (java.lang.NoSuchFieldException err1) {
			err1.printStackTrace();
		}
		class2.testVisitObjectWithMapOfObjects();
		class2.testVisitMapOfMapsOfObjects();
		class2.testVisitMapOfListsOfObjects();
		class2.testVisitObjectConfig_Inheritance();
		try {
			class2.testVisitMapConfig_ValueInheritance();
		}
		catch (java.lang.NoSuchFieldException err2) {
			err2.printStackTrace();
		}
		try {
			class2.testVisitMapConfig_ValueInheritance_AbstractProps();
		}
		catch (java.lang.NoSuchFieldException err3) {
			err3.printStackTrace();
		}
		try {
			class2.testTypeLabel();
		}
		catch (java.lang.NoSuchFieldException err4) {
			err4.printStackTrace();
		}
		io.bootique.help.config.DefaultConfigHelpGeneratorTest class3 = new io.bootique.help.config.DefaultConfigHelpGeneratorTest();
		class3.testGenerate_Empty();
		class3.testGenerate_Name();
		class3.testGenerate_Name_MultiModule();
		class3.testGenerate_Name_MultiModule_Sorting();
		class3.testGenerate_Name_Description();
		class3.testGenerate_Configs();
	}
}