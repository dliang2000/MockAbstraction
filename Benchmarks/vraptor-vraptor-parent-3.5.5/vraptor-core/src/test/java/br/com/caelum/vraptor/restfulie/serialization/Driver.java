package br.com.caelum.vraptor.restfulie.serialization;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.restfulie.serialization.RestfulSerializationTest class1 = new br.com.caelum.vraptor.restfulie.serialization.RestfulSerializationTest();
		class1.shouldReturnAnXStreamInstanceWithSupportToLinkConvertersBasedOnReflection();
		class1.shouldUseTheDefaultConverterForTypesThatAreNotHypermediaAware();
		class1.shouldAllowCustomXStreamRetrieval();
		br.com.caelum.vraptor.restfulie.serialization.MethodValueSupportConverterTest class2 = new br.com.caelum.vraptor.restfulie.serialization.MethodValueSupportConverterTest();
		class2.whenMethodIsAnnotatedAddsItsContent();
		class2.whenMethodReturnsAComplexTypeSerializesIt();
		br.com.caelum.vraptor.restfulie.serialization.RestfulSerializationJSONTest class3 = new br.com.caelum.vraptor.restfulie.serialization.RestfulSerializationJSONTest();
		class3.shouldReturnAnXStreamInstanceWithSupportToLinkConvertersBasedOnReflection();
		class3.shouldUseTheDefaultConverterForTypesThatAreNotHypermediaAware();
		class3.shouldAllowCustomXStreamRetrieval();
	}
}