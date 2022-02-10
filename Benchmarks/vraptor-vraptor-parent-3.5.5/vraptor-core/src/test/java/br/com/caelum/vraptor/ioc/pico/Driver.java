package br.com.caelum.vraptor.ioc.pico;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.ioc.pico.PicoBasedContainerTest class1 = new br.com.caelum.vraptor.ioc.pico.PicoBasedContainerTest();
		class1.setup();
		class1.shouldBeAbleToInstantiateABean();
		class1.shouldBeAbleToProvideAFruitButNotAJuice();
		class1.shouldBeAbleToInstantiateADependentBean();
		br.com.caelum.vraptor.ioc.pico.PicoProviderTest class2 = new br.com.caelum.vraptor.ioc.pico.PicoProviderTest();
		class2.canProvidePicoSpecificApplicationScopedComponents();
		br.com.caelum.vraptor.ioc.pico.PicoComponentRegistryTest class3 = new br.com.caelum.vraptor.ioc.pico.PicoComponentRegistryTest();
		class3.setup();
		class3.shouldRemovePreviouslyRegisteredComponentIfRegisteringAgain();
		class3.shouldRemovePreviouslyRegisteredComponentIfRegisteringAgainInAnotherScope();
		br.com.caelum.vraptor.ioc.pico.CustomPicoProviderTest class4 = new br.com.caelum.vraptor.ioc.pico.CustomPicoProviderTest();
		try {
			class4.callsPredestroyExactlyOneTimeForAppScopedComponents();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class4.callsPredestroyExactlyOneTimeForAppScopedComponentFactories();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class4.canProvideCustomApplicationScopedComponents();
		class4.canProvideCustomRequestScopedComponents();
	}
}