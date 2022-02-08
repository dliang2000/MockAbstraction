package io.bootique.config.jackson;

public class Driver {
	public void runall() {
		io.bootique.config.jackson.JsonConfigurationFactoryTest class1 = new io.bootique.config.jackson.JsonConfigurationFactoryTest();
		class1.testConfig();
		class1.testConfig_Nested();
		class1.testConfig_Subconfig();
		class1.testConfig_Subconfig_MultiLevel();
		class1.testConfig_Subconfig_Missing();
		class1.testList_SingleLevel();
		class1.testList_MultiLevel();
		class1.testMap_SingleLevel();
		class1.testMap_MultiLevel();
		class1.testConfig_Polimorphic_Super();
		class1.testConfig_Polimorphic_Sub1();
		class1.testConfig_Polimorphic_Sub2();
		try {
			class1.testConfig_ResourceFactory();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		io.bootique.config.jackson.JsonConfigurationFactoryIT class2 = new io.bootique.config.jackson.JsonConfigurationFactoryIT();
		class2.startWebserver();
		class2.test_NoConfig();
		class2.test_Yaml();
		class2.test_Json();
		class2.test_JsonYaml();
		class2.test_YamlProps();
		class2.test_YamlNestedProps();
	}
}