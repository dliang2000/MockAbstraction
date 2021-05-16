package io.bootique.help.config;

public class Driver {
	public void runall() {
		io.bootique.help.config.ConfigSectionGeneratorFoldingTest class1 = new io.bootique.help.config.ConfigSectionGeneratorFoldingTest();
		class1.testVisitObjectConfig();
		io.bootique.help.config.DefaultConfigHelpGeneratorTest class2 = new io.bootique.help.config.DefaultConfigHelpGeneratorTest();
		class2.testGenerate_Empty();
		class2.testGenerate_Name();
		class2.testGenerate_Name_MultiModule();
		class2.testGenerate_Name_MultiModule_Sorting();
		class2.testGenerate_Name_Description();
		class2.testGenerate_Configs();
		io.bootique.help.config.ConfigSectionGeneratorTest class3 = new io.bootique.help.config.ConfigSectionGeneratorTest();
		class3.testVisitObjectConfig();
		class3.testVisitListOfValues();
		class3.testVisitListOfObjects();
		try {
			class3.testVisitMapOfValues();
		}
		catch (java.lang.NoSuchFieldException err1) {
			err1.printStackTrace();
		}
		class3.testVisitObjectWithMapOfObjects();
		class3.testVisitMapOfMapsOfObjects();
		class3.testVisitMapOfListsOfObjects();
		class3.testVisitObjectConfig_Inheritance();
		try {
			class3.testVisitMapConfig_ValueInheritance();
		}
		catch (java.lang.NoSuchFieldException err2) {
			err2.printStackTrace();
		}
		try {
			class3.testVisitMapConfig_ValueInheritance_AbstractProps();
		}
		catch (java.lang.NoSuchFieldException err3) {
			err3.printStackTrace();
		}
		try {
			class3.testTypeLabel();
		}
		catch (java.lang.NoSuchFieldException err4) {
			err4.printStackTrace();
		}
	}
}