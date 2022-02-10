package br.com.caelum.vraptor.resource;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.resource.ResourceNotFoundHandlerTest class1 = new br.com.caelum.vraptor.resource.ResourceNotFoundHandlerTest();
		class1.setUp();
		try {
			class1.couldntFindDefersRequestToContainer();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldThrowInterceptionExceptionIfIOExceptionOccurs();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldThrowInterceptionExceptionIfServletExceptionOccurs();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		br.com.caelum.vraptor.resource.HttpMethodTest class2 = new br.com.caelum.vraptor.resource.HttpMethodTest();
		class2.setup();
		try {
			class2.shouldConvertGETStringToGetMethodForRequestParameter();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.shouldThrowExceptionForNotKnowHttpMethodsForRequestParameter();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.shouldThrowIllegalArgumentExceptionIf_methodIsUsedInGETRequests();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.shouldConvertGETStringToGetMethod();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.shouldThrowExceptionForNotKnowHttpMethods();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.shouldUseParameterNameBeforeTryingHttpRealMethod();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		br.com.caelum.vraptor.resource.DefaultMethodNotAllowedHandlerTest class3 = new br.com.caelum.vraptor.resource.DefaultMethodNotAllowedHandlerTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class3.shouldAddAllowHeader();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class3.shouldSendErrorMethodNotAllowed();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class3.shouldNotSendMethodNotAllowedIfTheRequestMethodIsOptions();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class3.shouldThrowInterceptionExceptionIfAnIOExceptionOccurs();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
	}
}