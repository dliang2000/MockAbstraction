package io.bootique.run;

public class Driver {
	public void runall() {
		io.bootique.run.DefaultRunnerTest class1 = new io.bootique.run.DefaultRunnerTest();
		class1.before();
		class1.testRun();
		class1.testRun_ReverseOrder();
		class1.testRun_NoMatch();
		class1.testRun_NullName_Default();
		class1.testRun_NullName_Help();
		class1.testRun_NullName_NoFallback();
		class1.testRun_Failure();
		io.bootique.run.DefaultRunnerIT class2 = new io.bootique.run.DefaultRunnerIT();
		class2.before();
		class2.testRun_Explicit();
		class2.testRun_Implicit_Default();
		class2.testRun_Implicit_Help();
		class2.testRun_Implicit_NoModuleCommands_NoHelp();
		class2.testRun_Implicit_NoModuleCommands_HelpAllowed();
		class2.testRun_Implicit_HelpRedefined();
		class2.testRun_Implicit_Default_NoModuleCommands();
	}
}