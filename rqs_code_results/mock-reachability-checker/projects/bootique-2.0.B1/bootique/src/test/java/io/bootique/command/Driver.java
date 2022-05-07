package io.bootique.command;

public class Driver {
	public void runall() {
		io.bootique.command.DefaultCommandManagerTest class1 = new io.bootique.command.DefaultCommandManagerTest();
		class1.testLookupByType();
		class1.testLookupByType_Missing();
		class1.testLookupByName();
		class1.testLookupByName_Missing();
		io.bootique.command.CommandManagerIT class2 = new io.bootique.command.CommandManagerIT();
		class2.testHelpAndModuleCommands();
		class2.testDefaultAndHelpAndModuleCommands();
		class2.testHiddenCommands();
		class2.testDefaultCommandWithMetadata();
		class2.testDefaultCommandViaProvidesMethod();
		io.bootique.command.CommandsIT class3 = new io.bootique.command.CommandsIT();
		class3.before();
		class3.testModuleCommands();
		class3.testNoModuleCommands();
		class3.testModule_ExtraCommandAsType();
		class3.testModule_ExtraCommandAsInstance();
		class3.testModule_ExtraCommandOverride();
		io.bootique.command.CommandDecorator_CommandsIT class4 = new io.bootique.command.CommandDecorator_CommandsIT();
		class4.testAlsoRun_DecorateWithPrivate();
		class4.testBeforeRun_DecorateWithPrivate();
		io.bootique.command.CommandDecoratorIT class5 = new io.bootique.command.CommandDecoratorIT();
		class5.before();
		class5.testAlsoRun_Instance();
		class5.testAlsoRun_NameRef();
		class5.testAlsoRun_NameRef_WithArgs();
		class5.testAlsoRun_TypeRef();
		class5.testAlsoRun_TypeRef_WithArgs();
		class5.testBeforeRun_Instance();
		class5.testBeforeRun_Failure_NameRef();
		class5.testBeforeRun_Failure_NameRef_WithArgs();
		class5.testBeforeRun_Failure_TypeRef();
		class5.testBeforeRun_Failure_TypeRef_WithArgs();
		class5.testBeforeAndAlsoRun();
		class5.testMultipleDecoratorsForTheSameCommand();
	}
}