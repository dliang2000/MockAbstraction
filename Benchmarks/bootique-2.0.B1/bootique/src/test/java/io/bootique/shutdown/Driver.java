package io.bootique.shutdown;

public class Driver {
	public void runall() {
		io.bootique.shutdown.DefaultShutdownManagerTest class1 = new io.bootique.shutdown.DefaultShutdownManagerTest();
		class1.before();
		try {
			class1.testShutdownAll_Empty();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testShutdownOne();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testShutdownAll();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		io.bootique.shutdown.DefaultShutdownManagerIT class2 = new io.bootique.shutdown.DefaultShutdownManagerIT();
		class2.before();
		try {
			class2.testShutdown();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.testShutdown_Unresponsive_Timeout();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
	}
}