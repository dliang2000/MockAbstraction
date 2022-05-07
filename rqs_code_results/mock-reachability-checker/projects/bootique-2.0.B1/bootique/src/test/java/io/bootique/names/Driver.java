package io.bootique.names;

public class Driver {
	public void runall() {
		io.bootique.names.ClassToNameTest class1 = new io.bootique.names.ClassToNameTest();
		class1.testStripSuffux();
		class1.testLowerCase();
		class1.testPreserveCase();
		class1.testSeparator();
		class1.testSeparatorAbbrevs();
	}
}