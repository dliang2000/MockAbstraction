package io.bootique.meta.module;

public class Driver {
	public void runall() {
		io.bootique.meta.module.ModuleMetadataIT class1 = new io.bootique.meta.module.ModuleMetadataIT();
		class1.testDefault();
		class1.testCustomModule();
		class1.testCustomNamedModule();
		class1.testProvider();
		io.bootique.meta.module.ModuleMetadataTest class2 = new io.bootique.meta.module.ModuleMetadataTest();
		class2.testFindConfig_NotFound();
		class2.testFindConfig();
		class2.testFindConfig_Inheritance();
	}
}