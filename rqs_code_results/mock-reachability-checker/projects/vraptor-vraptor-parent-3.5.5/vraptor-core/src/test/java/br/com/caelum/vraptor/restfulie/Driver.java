package br.com.caelum.vraptor.restfulie;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.restfulie.LinkConverterTest class1 = new br.com.caelum.vraptor.restfulie.LinkConverterTest();
		class1.setup();
		class1.shouldSetupRelations();
		class1.shouldSerializeNoLinksIfThereIsNoTransition();
		class1.shouldSerializeOneLinkIfThereIsATransition();
		class1.shouldSerializeAllLinksIfThereAreTransitions();
		br.com.caelum.vraptor.restfulie.LinkConverterJSONTest class2 = new br.com.caelum.vraptor.restfulie.LinkConverterJSONTest();
		class2.setup();
		class2.shouldSerializeNoLinksIfThereIsNoTransition();
		class2.shouldSerializeOneLinkIfThereIsATransition();
		class2.shouldSerializeAllLinksIfThereAreTransitions();
	}
}