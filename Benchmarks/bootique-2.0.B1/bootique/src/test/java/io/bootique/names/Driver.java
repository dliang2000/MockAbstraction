package io.bootique.names;

public class Driver {
	public void runall() {
		io.bootique.names.C3CamelCase class1 = new io.bootique.names.C3CamelCase();
		io.bootique.names.C1 class2 = new io.bootique.names.C1();
		io.bootique.names.C2Suffix class3 = new io.bootique.names.C2Suffix();
		io.bootique.names.ABCCx class4 = new io.bootique.names.ABCCx();
		io.bootique.names.CxABC class5 = new io.bootique.names.CxABC();
		io.bootique.names.ClassToNameTest class6 = new io.bootique.names.ClassToNameTest();
		class6.testStripSuffux();
		class6.testLowerCase();
		class6.testPreserveCase();
		class6.testSeparator();
		class6.testSeparatorAbbrevs();
	}
}