package io.bootique.jopt;

public class Driver {
	public void runall() {
		io.bootique.jopt.JoptCliTest class1 = new io.bootique.jopt.JoptCliTest();
		class1.before();
		class1.testStringsFor_Missing();
		class1.testCommandName();
		io.bootique.jopt.JoptCliFactoryTest class2 = new io.bootique.jopt.JoptCliFactoryTest();
		class2.before();
		class2.testGet_HasOption();
		class2.testOptionStrings_Short();
		class2.testOptionStrings_Long_Equals();
		class2.testOptionStrings_Long_Space();
		class2.testOptionStrings_Single_Mixed();
		class2.testOptionStrings_Multiple_Mixed();
		class2.testStandaloneArguments_Mix();
		class2.testStandaloneArguments_DashDash();
		io.bootique.jopt.JoptCliFactoryCommandNameTest class3 = new io.bootique.jopt.JoptCliFactoryCommandNameTest();
		class3.before();
		class3.testCommandName_NoMatch();
		class3.testCommandName_Match();
		class3.testCommandName_MultipleMatches();
	}
}