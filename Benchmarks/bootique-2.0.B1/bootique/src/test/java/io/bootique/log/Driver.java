package io.bootique.log;

public class Driver {
	public void runall() {
		io.bootique.log.DefaultBootLoggerTest class1 = new io.bootique.log.DefaultBootLoggerTest();
		class1.before();
		class1.testStdout();
		class1.testStderr();
		class1.testTrace();
		class1.testNoTrace();
	}
}