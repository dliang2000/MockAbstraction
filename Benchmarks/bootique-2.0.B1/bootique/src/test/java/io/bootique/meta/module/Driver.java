package io.bootique.meta.module;

public class Driver {
	public void runall() {
		io.bootique.meta.module.ModuleMetadataTest class1 = new io.bootique.meta.module.ModuleMetadataTest();
		class1.testFindConfig_NotFound();
		class1.testFindConfig();
		class1.testFindConfig_Inheritance();
		io.bootique.meta.module.ModuleMetadataIT class2 = new io.bootique.meta.module.ModuleMetadataIT();
		class2.testDefault();
		class2.testCustomModule();
		class2.testCustomNamedModule();
		class2.testProvider();
	}
}