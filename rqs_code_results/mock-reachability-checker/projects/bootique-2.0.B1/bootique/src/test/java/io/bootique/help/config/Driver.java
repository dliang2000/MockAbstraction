package io.bootique.help.config;

public class Driver {
	public void runall() {
		io.bootique.help.config.ConfigSectionGeneratorTest class1 = new io.bootique.help.config.ConfigSectionGeneratorTest();
		class1.testVisitObjectConfig();
		class1.testVisitListOfValues();
		class1.testVisitListOfObjects();
		try {
			class1.testVisitMapOfValues();
		}
		catch (java.lang.NoSuchFieldException err1) {
			err1.printStackTrace();
		}
		class1.testVisitObjectWithMapOfObjects();
		class1.testVisitMapOfMapsOfObjects();
		class1.testVisitMapOfListsOfObjects();
		class1.testVisitObjectConfig_Inheritance();
		try {
			class1.testVisitMapConfig_ValueInheritance();
		}
		catch (java.lang.NoSuchFieldException err2) {
			err2.printStackTrace();
		}
		try {
			class1.testVisitMapConfig_ValueInheritance_AbstractProps();
		}
		catch (java.lang.NoSuchFieldException err3) {
			err3.printStackTrace();
		}
		try {
			class1.testTypeLabel();
		}
		catch (java.lang.NoSuchFieldException err4) {
			err4.printStackTrace();
		}
		io.bootique.help.config.ConfigSectionGeneratorFoldingTest class2 = new io.bootique.help.config.ConfigSectionGeneratorFoldingTest();
		class2.testVisitObjectConfig();
		io.bootique.help.config.DefaultConfigHelpGeneratorTest class3 = new io.bootique.help.config.DefaultConfigHelpGeneratorTest();
		class3.testGenerate_Empty();
		class3.testGenerate_Name();
		class3.testGenerate_Name_MultiModule();
		class3.testGenerate_Name_MultiModule_Sorting();
		class3.testGenerate_Name_Description();
		class3.testGenerate_Configs();
	}
}