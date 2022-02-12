package io.bootique.command;

public class Driver {
	public void runall() {
		io.bootique.command.DefaultCommandManagerTest class1 = new io.bootique.command.DefaultCommandManagerTest();
		class1.testLookupByType();
		class1.testLookupByType_Missing();
		class1.testLookupByName();
		class1.testLookupByName_Missing();
		io.bootique.command.CommandDecorator_CommandsIT class2 = new io.bootique.command.CommandDecorator_CommandsIT();
		class2.testAlsoRun_DecorateWithPrivate();
		class2.testBeforeRun_DecorateWithPrivate();
		io.bootique.command.CommandDecoratorIT class3 = new io.bootique.command.CommandDecoratorIT();
		class3.before();
		class3.testAlsoRun_Instance();
		class3.testAlsoRun_NameRef();
		class3.testAlsoRun_NameRef_WithArgs();
		class3.testAlsoRun_TypeRef();
		class3.testAlsoRun_TypeRef_WithArgs();
		class3.testBeforeRun_Instance();
		class3.testBeforeRun_Failure_NameRef();
		class3.testBeforeRun_Failure_NameRef_WithArgs();
		class3.testBeforeRun_Failure_TypeRef();
		class3.testBeforeRun_Failure_TypeRef_WithArgs();
		class3.testBeforeAndAlsoRun();
		class3.testMultipleDecoratorsForTheSameCommand();
		io.bootique.command.CommandManagerIT class4 = new io.bootique.command.CommandManagerIT();
		class4.testHelpAndModuleCommands();
		class4.testDefaultAndHelpAndModuleCommands();
		class4.testHiddenCommands();
		class4.testDefaultCommandWithMetadata();
		class4.testDefaultCommandViaProvidesMethod();
		io.bootique.command.CommandsIT class5 = new io.bootique.command.CommandsIT();
		class5.before();
		class5.testModuleCommands();
		class5.testNoModuleCommands();
		class5.testModule_ExtraCommandAsType();
		class5.testModule_ExtraCommandAsInstance();
		class5.testModule_ExtraCommandOverride();
	}
}