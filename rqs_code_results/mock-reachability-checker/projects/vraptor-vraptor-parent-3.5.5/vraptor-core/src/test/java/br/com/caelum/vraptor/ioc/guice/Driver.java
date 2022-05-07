package br.com.caelum.vraptor.ioc.guice;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.ioc.guice.GuiceProviderTest class1 = new br.com.caelum.vraptor.ioc.guice.GuiceProviderTest();
		try {
			class1.shouldBeAbleToOverrideVRaptorsDefaultImplementation();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldBeAbleToRegisterClasses();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldBeAbleToRegisterClassesWithDependencies();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldBeAbleToReceiveListsOfSerializationsAsDependency();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		br.com.caelum.vraptor.ioc.guice.SessionCustomScopeTest class2 = new br.com.caelum.vraptor.ioc.guice.SessionCustomScopeTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.shouldClearAllListenersFromSessionOnStart();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.shouldInvokeListenersOnStop();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.shouldRemoveListenersOnStop();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
	}
}