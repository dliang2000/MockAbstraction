package org.apache.commons.collections4.splitmap;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.splitmap.TransformedSplitMapTest class1 = new org.apache.commons.collections4.splitmap.TransformedSplitMapTest();
		class1.testTransformedMap();
		class1.testMapIterator();
		try {
			class1.testEmptyMap();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err2) {
			err2.printStackTrace();
		}
		try {
			class1.testFullMap();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err4) {
			err4.printStackTrace();
		}
	}
}