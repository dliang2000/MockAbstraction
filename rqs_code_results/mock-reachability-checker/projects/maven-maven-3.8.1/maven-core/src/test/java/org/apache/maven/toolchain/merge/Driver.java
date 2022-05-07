package org.apache.maven.toolchain.merge;

public class Driver {
	public void runall() {
		org.apache.maven.toolchain.merge.MavenToolchainMergerTest class1 = new org.apache.maven.toolchain.merge.MavenToolchainMergerTest();
		class1.testMergeNulls();
		try {
			class1.testMergeJdk();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testMergeJdkExtra();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testMergeJdkExtend();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
	}
}