package br.com.caelum.vraptor.restfulie.serialization;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.restfulie.serialization.MethodValueSupportConverterTest class1 = new br.com.caelum.vraptor.restfulie.serialization.MethodValueSupportConverterTest();
		class1.whenMethodIsAnnotatedAddsItsContent();
		class1.whenMethodReturnsAComplexTypeSerializesIt();
		br.com.caelum.vraptor.restfulie.serialization.RestfulSerializationJSONTest class2 = new br.com.caelum.vraptor.restfulie.serialization.RestfulSerializationJSONTest();
		class2.shouldReturnAnXStreamInstanceWithSupportToLinkConvertersBasedOnReflection();
		class2.shouldUseTheDefaultConverterForTypesThatAreNotHypermediaAware();
		class2.shouldAllowCustomXStreamRetrieval();
		br.com.caelum.vraptor.restfulie.serialization.RestfulSerializationTest class3 = new br.com.caelum.vraptor.restfulie.serialization.RestfulSerializationTest();
		class3.shouldReturnAnXStreamInstanceWithSupportToLinkConvertersBasedOnReflection();
		class3.shouldUseTheDefaultConverterForTypesThatAreNotHypermediaAware();
		class3.shouldAllowCustomXStreamRetrieval();
	}
}