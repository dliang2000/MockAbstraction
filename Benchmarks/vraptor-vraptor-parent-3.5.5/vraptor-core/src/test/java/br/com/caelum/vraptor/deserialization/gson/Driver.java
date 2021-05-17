package br.com.caelum.vraptor.deserialization.gson;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.deserialization.gson.GsonDeserializerTest class1 = new br.com.caelum.vraptor.deserialization.gson.GsonDeserializerTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldNotAcceptMethodsWithoutArguments();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldBeAbleToDeserializeADog();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldBeAbleToDeserializeAListOfDogs();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.shouldBeAbleToDeserializeAListOfDogsWithNoRoot();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.shouldBeAbleToDeserializeAListOfDogsWhenMethodHasMoreThenOneParameter();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		class1.shouldBeAbleToDeserializeADogWithoutRoot();
		try {
			class1.shouldBeAbleToDeserializeADogWithDeserializerAdapter();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.shouldBeAbleToDeserializeADogWhenMethodHasMoreThanOneArgument();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.shouldBeAbleToDeserializeADogWhenMethodHasMoreThanOneArgumentAndHasNotRoot();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.shouldBeAbleToDeserializeADogWhenMethodHasMoreThanOneArgumentAndTheXmlIsTheLastOne();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.shouldBeAbleToDeserializeADogNamedDifferently();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		class1.shouldDeserializeADogWithCalendarAttribute();
		class1.shouldDeserializeADogWithCalendarAsISO8601Attribute();
		class1.shouldDeserializeADogWithCalendarAsObjectAttribute();
		try {
			class1.shouldHonorRequestHeaderAcceptCharset();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class1.whenNoCharsetHeaderIsFoundThanAssumeItIsUTF8();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class1.shouldByPassDeserializationWhenHasNoContent();
		class1.shouldDeserializeFromGenericTypeOneParam();
		class1.shouldDeserializeFromGenericTypeTwoParams();
		class1.shouldDeserializeWithoutGenericType();
	}
}