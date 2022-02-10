package br.com.caelum.vraptor.deserialization;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.deserialization.DefaultDeserializersTest class1 = new br.com.caelum.vraptor.deserialization.DefaultDeserializersTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldThrowExceptionWhenThereIsNoDeserializerRegisteredForGivenContentType();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.allDeserializersMustBeAnnotatedWithDeserializes();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldNotCallDeserializerIfItDoesntAcceptGivenContentType();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.shouldUseTheDeserializerThatAcceptsTheGivenContentType();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.shouldUseTheDeserializerThatAcceptsTheGivenContentTypeIfVendorized();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.shouldUseTheDeserializerThatAcceptsTheGivenContentTypeIfAtomizedAlike();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		br.com.caelum.vraptor.deserialization.DeserializesHandlerTest class2 = new br.com.caelum.vraptor.deserialization.DeserializesHandlerTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.shouldAcceptDeserializesAnnotation();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class2.shouldThrowExceptionWhenTypeIsNotADeserializer();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class2.shouldRegisterTypesOnDeserializers();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		br.com.caelum.vraptor.deserialization.XStreamXmlDeserializerTest class3 = new br.com.caelum.vraptor.deserialization.XStreamXmlDeserializerTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class3.shouldNotAcceptMethodsWithoutArguments();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class3.shouldBeAbleToDeserializeAPersonWithDog();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class3.shouldBeAbleToDeserializeADog();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class3.shouldBeAbleToDeserializeADogWhenMethodHasMoreThanOneArgument();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class3.shouldBeAbleToDeserializeADogWhenMethodHasMoreThanOneArgumentAndTheXmlIsTheLastOne();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class3.shouldBeAbleToDeserializeADogNamedDifferently();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		class3.shouldBeAbleToDeserializeADogWhenAliasConfiguredByAnnotations();
		br.com.caelum.vraptor.deserialization.JsonDeserializerTest class4 = new br.com.caelum.vraptor.deserialization.JsonDeserializerTest();
		try {
			class4.setUp();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class4.shouldNotAcceptMethodsWithoutArguments();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class4.shouldBeAbleToDeserializeACat();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class4.shouldBeAbleToDeserializeACatWhenMethodHasMoreThanOneArgument();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class4.shouldBeAbleToDeserializeACatWhenMethodHasMoreThanOneArgumentAndTheXmlIsTheLastOne();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class4.shouldBeAbleToDeserializeACatNamedDifferently();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		class4.shouldBeAbleToDeserializeACatWhenAliasConfiguredByAnnotations();
	}
}