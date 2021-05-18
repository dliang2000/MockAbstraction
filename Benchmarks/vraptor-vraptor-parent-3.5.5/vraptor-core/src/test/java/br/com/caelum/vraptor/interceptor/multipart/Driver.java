package br.com.caelum.vraptor.interceptor.multipart;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.interceptor.multipart.DefaultUploadedFileTest class1 = new br.com.caelum.vraptor.interceptor.multipart.DefaultUploadedFileTest();
		try {
			class1.usingUnixLikeSeparators();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.usingWindowsLikeSeparators();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class1.usingOnlyFilename();
		br.com.caelum.vraptor.interceptor.multipart.NullMultipartInterceptorTest class2 = new br.com.caelum.vraptor.interceptor.multipart.NullMultipartInterceptorTest();
		class2.shouldNeverAccept();
		class2.shouldThrowUnsuportedOperationExceptionWhenInvoked();
		br.com.caelum.vraptor.interceptor.multipart.MockFilesCommonsFileUpload class3 = new br.com.caelum.vraptor.interceptor.multipart.MockFilesCommonsFileUpload();
		br.com.caelum.vraptor.interceptor.multipart.CommonsUploadMultipartInterceptorTest class4 = new br.com.caelum.vraptor.interceptor.multipart.CommonsUploadMultipartInterceptorTest();
		class4.setup();
		class4.shouldNotAcceptFormURLEncoded();
		class4.shouldAcceptMultipart();
		try {
			class4.withFieldsOnly();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class4.withFieldsOnlyWithInvalidCharset();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class4.withFilesAndFields();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class4.emptyFiles();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class4.throwsInvalidParameterExceptionIfIOExceptionOccurs();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class4.fieldsWithSameName();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class4.multipleUpload();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class4.doNothingWhenFileUploadExceptionOccurs();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class4.shouldValidateWhenSizeLimitExceededExceptionOccurs();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class4.shouldCreateDirInsideAppIfTempDirAreNotAvailable();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class4.checkIfFileHasBeenUploaded();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class4.handleValidatorMessageWhenFileUploadExceptionOccurs();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.multipart.MockFileItem class5 = new br.com.caelum.vraptor.interceptor.multipart.MockFileItem();
	}
}