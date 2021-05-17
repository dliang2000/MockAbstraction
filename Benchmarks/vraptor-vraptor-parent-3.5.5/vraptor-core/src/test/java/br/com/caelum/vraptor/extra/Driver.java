package br.com.caelum.vraptor.extra;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.extra.ForwardToDefaultViewInterceptorTest class1 = new br.com.caelum.vraptor.extra.ForwardToDefaultViewInterceptorTest();
		class1.setup();
		class1.shouldAcceptAlways();
		class1.doesNothingIfResultWasAlreadyUsed();
		class1.shouldForwardToViewWhenResultWasNotUsed();
	}
}