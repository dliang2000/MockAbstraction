package io.bootique.jopt;

public class Driver {
	public void runall() {
		io.bootique.jopt.JoptCliFactoryTest class1 = new io.bootique.jopt.JoptCliFactoryTest();
		class1.before();
		class1.testGet_HasOption();
		class1.testOptionStrings_Short();
		class1.testOptionStrings_Long_Equals();
		class1.testOptionStrings_Long_Space();
		class1.testOptionStrings_Single_Mixed();
		class1.testOptionStrings_Multiple_Mixed();
		class1.testStandaloneArguments_Mix();
		class1.testStandaloneArguments_DashDash();
		io.bootique.jopt.JoptCliFactoryCommandNameTest class2 = new io.bootique.jopt.JoptCliFactoryCommandNameTest();
		class2.before();
		class2.testCommandName_NoMatch();
		class2.testCommandName_Match();
		class2.testCommandName_MultipleMatches();
		io.bootique.jopt.JoptCliTest class3 = new io.bootique.jopt.JoptCliTest();
		class3.before();
		class3.testStringsFor_Missing();
		class3.testCommandName();
	}
}