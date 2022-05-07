package br.com.caelum.vraptor.interceptor.download;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.interceptor.download.InputStreamDownloadTest class1 = new br.com.caelum.vraptor.interceptor.download.InputStreamDownloadTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldFlushWholeStreamToHttpResponse();
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
		br.com.caelum.vraptor.interceptor.download.ByteArrayDownloadTest class2 = new br.com.caelum.vraptor.interceptor.download.ByteArrayDownloadTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.shouldFlushWholeStreamToHttpResponse();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		try {
			class2.shouldUseHeadersToHttpResponse();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.download.FileDownloadTest class3 = new br.com.caelum.vraptor.interceptor.download.FileDownloadTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class3.shouldFlushWholeFileToHttpResponse();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class3.shouldUseHeadersToHttpResponse();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		try {
			class3.shouldThrowIllegalArgumentExceptionIfFileDoesntExists();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
	}
}