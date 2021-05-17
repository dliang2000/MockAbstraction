package br.com.caelum.vraptor.ioc.pico;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.ioc.pico.CustomPicoProviderTest class1 = new br.com.caelum.vraptor.ioc.pico.CustomPicoProviderTest();
		try {
			class1.callsPredestroyExactlyOneTimeForAppScopedComponents();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.callsPredestroyExactlyOneTimeForAppScopedComponentFactories();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class1.canProvideCustomApplicationScopedComponents();
		class1.canProvideCustomRequestScopedComponents();
		br.com.caelum.vraptor.ioc.pico.PicoBasedContainerTest class2 = new br.com.caelum.vraptor.ioc.pico.PicoBasedContainerTest();
		class2.setup();
		class2.shouldBeAbleToInstantiateABean();
		class2.shouldBeAbleToProvideAFruitButNotAJuice();
		class2.shouldBeAbleToInstantiateADependentBean();
		br.com.caelum.vraptor.ioc.pico.PicoProviderTest class3 = new br.com.caelum.vraptor.ioc.pico.PicoProviderTest();
		class3.canProvidePicoSpecificApplicationScopedComponents();
		br.com.caelum.vraptor.ioc.pico.PicoComponentRegistryTest class4 = new br.com.caelum.vraptor.ioc.pico.PicoComponentRegistryTest();
		class4.setup();
		class4.shouldRemovePreviouslyRegisteredComponentIfRegisteringAgain();
		class4.shouldRemovePreviouslyRegisteredComponentIfRegisteringAgainInAnotherScope();
	}
}