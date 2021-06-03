package io.bootique.config.jackson;

public class Driver {
	public void runall() {
		io.bootique.config.jackson.JsonConfigurationFactoryIT class1 = new io.bootique.config.jackson.JsonConfigurationFactoryIT();
		class1.startWebserver();
		class1.test_NoConfig();
		class1.test_Yaml();
		class1.test_Json();
		class1.test_JsonYaml();
		class1.test_YamlProps();
		class1.test_YamlNestedProps();
		io.bootique.config.jackson.JsonConfigurationFactoryTest class2 = new io.bootique.config.jackson.JsonConfigurationFactoryTest();
		class2.testConfig();
		class2.testConfig_Nested();
		class2.testConfig_Subconfig();
		class2.testConfig_Subconfig_MultiLevel();
		class2.testConfig_Subconfig_Missing();
		class2.testList_SingleLevel();
		class2.testList_MultiLevel();
		class2.testMap_SingleLevel();
		class2.testMap_MultiLevel();
		class2.testConfig_Polimorphic_Super();
		class2.testConfig_Polimorphic_Sub1();
		class2.testConfig_Polimorphic_Sub2();
		try {
			class2.testConfig_ResourceFactory();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
	}
}