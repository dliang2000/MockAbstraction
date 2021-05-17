package br.com.caelum.vraptor.interceptor.download;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.interceptor.download.FileDownloadTest class1 = new br.com.caelum.vraptor.interceptor.download.FileDownloadTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldFlushWholeFileToHttpResponse();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldUseHeadersToHttpResponse();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldThrowIllegalArgumentExceptionIfFileDoesntExists();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.download.InputStreamDownloadTest class2 = new br.com.caelum.vraptor.interceptor.download.InputStreamDownloadTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.shouldFlushWholeStreamToHttpResponse();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class2.shouldUseHeadersToHttpResponse();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.download.ByteArrayDownloadTest class3 = new br.com.caelum.vraptor.interceptor.download.ByteArrayDownloadTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.shouldFlushWholeStreamToHttpResponse();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		try {
			class3.shouldUseHeadersToHttpResponse();
		}
		catch (java.io.IOException err10) {
			err10.printStackTrace();
		}
	}
}