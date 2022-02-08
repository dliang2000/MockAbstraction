package io.bootique.jopt;

public class Driver {
	public void runall() {
		io.bootique.jopt.JoptCliTest class1 = new io.bootique.jopt.JoptCliTest();
		class1.before();
		class1.testStringsFor_Missing();
		class1.testCommandName();
		io.bootique.jopt.JoptCliFactoryCommandNameTest class2 = new io.bootique.jopt.JoptCliFactoryCommandNameTest();
		class2.before();
		class2.testCommandName_NoMatch();
		class2.testCommandName_Match();
		class2.testCommandName_MultipleMatches();
		io.bootique.jopt.JoptCliFactoryTest class3 = new io.bootique.jopt.JoptCliFactoryTest();
		class3.before();
		class3.testGet_HasOption();
		class3.testOptionStrings_Short();
		class3.testOptionStrings_Long_Equals();
		class3.testOptionStrings_Long_Space();
		class3.testOptionStrings_Single_Mixed();
		class3.testOptionStrings_Multiple_Mixed();
		class3.testStandaloneArguments_Mix();
		class3.testStandaloneArguments_DashDash();
	}
}