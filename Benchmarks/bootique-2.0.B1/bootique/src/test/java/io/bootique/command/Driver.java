package io.bootique.command;

public class Driver {
	public void runall() {
		io.bootique.command.CommandsIT class1 = new io.bootique.command.CommandsIT();
		class1.before();
		class1.testModuleCommands();
		class1.testNoModuleCommands();
		class1.testModule_ExtraCommandAsType();
		class1.testModule_ExtraCommandAsInstance();
		class1.testModule_ExtraCommandOverride();
		io.bootique.command.CommandDecorator_CommandsIT class2 = new io.bootique.command.CommandDecorator_CommandsIT();
		class2.testAlsoRun_DecorateWithPrivate();
		class2.testBeforeRun_DecorateWithPrivate();
		io.bootique.command.CommandManagerIT class3 = new io.bootique.command.CommandManagerIT();
		class3.testHelpAndModuleCommands();
		class3.testDefaultAndHelpAndModuleCommands();
		class3.testHiddenCommands();
		class3.testDefaultCommandWithMetadata();
		class3.testDefaultCommandViaProvidesMethod();
		io.bootique.command.CommandDecoratorIT class4 = new io.bootique.command.CommandDecoratorIT();
		class4.before();
		class4.testAlsoRun_Instance();
		class4.testAlsoRun_NameRef();
		class4.testAlsoRun_NameRef_WithArgs();
		class4.testAlsoRun_TypeRef();
		class4.testAlsoRun_TypeRef_WithArgs();
		class4.testBeforeRun_Instance();
		class4.testBeforeRun_Failure_NameRef();
		class4.testBeforeRun_Failure_NameRef_WithArgs();
		class4.testBeforeRun_Failure_TypeRef();
		class4.testBeforeRun_Failure_TypeRef_WithArgs();
		class4.testBeforeAndAlsoRun();
		class4.testMultipleDecoratorsForTheSameCommand();
		io.bootique.command.DefaultCommandManagerTest class5 = new io.bootique.command.DefaultCommandManagerTest();
		class5.testLookupByType();
		class5.testLookupByType_Missing();
		class5.testLookupByName();
		class5.testLookupByName_Missing();
	}
}