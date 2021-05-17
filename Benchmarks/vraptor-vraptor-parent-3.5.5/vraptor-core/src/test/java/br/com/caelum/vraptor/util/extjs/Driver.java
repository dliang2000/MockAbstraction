package br.com.caelum.vraptor.util.extjs;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.util.extjs.Data class1 = new br.com.caelum.vraptor.util.extjs.Data();
		br.com.caelum.vraptor.util.extjs.DefaultExtJsonTest class2 = new br.com.caelum.vraptor.util.extjs.DefaultExtJsonTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.shouldSerializeWithData();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.shouldSerializeWithListsOfData();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.shouldExcludeFieldsOnData();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.shouldExcludeWithListsOfData();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
	}
}