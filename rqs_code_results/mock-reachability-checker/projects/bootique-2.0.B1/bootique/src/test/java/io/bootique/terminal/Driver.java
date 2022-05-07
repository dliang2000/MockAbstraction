package io.bootique.terminal;

public class Driver {
	public void runall() {
		io.bootique.terminal.SttyTerminalTest class1 = new io.bootique.terminal.SttyTerminalTest();
		class1.before();
		class1.testParseLine_OSX();
		class1.testParseColumns_OSX();
		class1.testParseLine_Linux();
		class1.testParseLine_Docker_Ubuntu();
		class1.testParseLine_Invalid();
	}
}