package io.bootique.run;

public class Driver {
	public void runall() {
		io.bootique.run.DefaultRunnerIT class1 = new io.bootique.run.DefaultRunnerIT();
		class1.before();
		class1.testRun_Explicit();
		class1.testRun_Implicit_Default();
		class1.testRun_Implicit_Help();
		class1.testRun_Implicit_NoModuleCommands_NoHelp();
		class1.testRun_Implicit_NoModuleCommands_HelpAllowed();
		class1.testRun_Implicit_HelpRedefined();
		class1.testRun_Implicit_Default_NoModuleCommands();
		io.bootique.run.DefaultRunnerTest class2 = new io.bootique.run.DefaultRunnerTest();
		class2.before();
		class2.testRun();
		class2.testRun_ReverseOrder();
		class2.testRun_NoMatch();
		class2.testRun_NullName_Default();
		class2.testRun_NullName_Help();
		class2.testRun_NullName_NoFallback();
		class2.testRun_Failure();
	}
}