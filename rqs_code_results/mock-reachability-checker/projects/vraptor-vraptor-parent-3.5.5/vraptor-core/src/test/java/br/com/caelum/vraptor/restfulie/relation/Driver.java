package br.com.caelum.vraptor.restfulie.relation;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.restfulie.relation.DefaultRelationBuilderTest class1 = new br.com.caelum.vraptor.restfulie.relation.DefaultRelationBuilderTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldAllowRelationCreationToSpecificURIs();
		try {
			class1.shouldBuildRelationsOfControllersUsingMethodNameByDefault();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldBuildRelationsOfControllersUsingGivenName();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
	}
}