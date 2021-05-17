package br.com.caelum.vraptor.restfulie.headers;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.restfulie.headers.DefaultRestHeadersHandlerTest class1 = new br.com.caelum.vraptor.restfulie.headers.DefaultRestHeadersHandlerTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.whenResourceIsSimpleDoNothing();
		class1.whenResourceIsCacheableAddMaxAge();
		class1.whenResourceHasLinksAddThemToTheHeader();
		class1.whenNotExplicitlyRestfulEntityUseDefaultEtagAndLastModified();
		class1.whenRestfulEntityIsHandledShouldUseItsValues();
	}
}