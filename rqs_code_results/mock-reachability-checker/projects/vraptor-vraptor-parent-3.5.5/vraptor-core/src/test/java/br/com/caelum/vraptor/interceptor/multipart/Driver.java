package br.com.caelum.vraptor.interceptor.multipart;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.interceptor.multipart.NullMultipartInterceptorTest class1 = new br.com.caelum.vraptor.interceptor.multipart.NullMultipartInterceptorTest();
		class1.shouldNeverAccept();
		class1.shouldThrowUnsuportedOperationExceptionWhenInvoked();
		br.com.caelum.vraptor.interceptor.multipart.DefaultUploadedFileTest class2 = new br.com.caelum.vraptor.interceptor.multipart.DefaultUploadedFileTest();
		try {
			class2.usingUnixLikeSeparators();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.usingWindowsLikeSeparators();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class2.usingOnlyFilename();
		br.com.caelum.vraptor.interceptor.multipart.CommonsUploadMultipartInterceptorTest class3 = new br.com.caelum.vraptor.interceptor.multipart.CommonsUploadMultipartInterceptorTest();
		class3.setup();
		class3.shouldNotAcceptFormURLEncoded();
		class3.shouldAcceptMultipart();
		try {
			class3.withFieldsOnly();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.withFieldsOnlyWithInvalidCharset();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class3.withFilesAndFields();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class3.emptyFiles();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class3.throwsInvalidParameterExceptionIfIOExceptionOccurs();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class3.fieldsWithSameName();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.multipleUpload();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class3.doNothingWhenFileUploadExceptionOccurs();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class3.shouldValidateWhenSizeLimitExceededExceptionOccurs();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class3.shouldCreateDirInsideAppIfTempDirAreNotAvailable();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class3.checkIfFileHasBeenUploaded();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class3.handleValidatorMessageWhenFileUploadExceptionOccurs();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
	}
}