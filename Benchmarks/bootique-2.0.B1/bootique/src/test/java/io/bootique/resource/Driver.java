package io.bootique.resource;

public class Driver {
	public void runall() {
		io.bootique.resource.FolderResourceFactoryTest class1 = new io.bootique.resource.FolderResourceFactoryTest();
		try {
			class1.testGetUrl_RootClasspathUrl_Slash();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		try {
			class1.testGetUrl_RootClasspathUrl_NoSlash();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		try {
			class1.testGetUrl_Subresource_RootClasspathUrl();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		try {
			class1.testGetUrl_Subresource_ClasspathUrl();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		try {
			class1.testGetUrl_Subresource_FileProtocolUrl();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		try {
			class1.testGetUrl_Exception_InvalidScheme();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class1.testGetUrl_Subresource_ReverseSlashes();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		io.bootique.resource.ResourceFactoryTest class2 = new io.bootique.resource.ResourceFactoryTest();
		try {
			class2.testGetCanonicalFile();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class2.testGetUrl_File();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		try {
			class2.testGetUrl_File_DotSlash();
		}
		catch (java.io.IOException err10) {
			err10.printStackTrace();
		}
		try {
			class2.testGetUrl_FileUrl();
		}
		catch (java.io.IOException err11) {
			err11.printStackTrace();
		}
		try {
			class2.testGetUrl_JarUrl();
		}
		catch (java.io.IOException err12) {
			err12.printStackTrace();
		}
		try {
			class2.testGetUrl_ClasspathUrl();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class2.testGetUrl_ClasspathUrlWithSlash();
		}
		catch (java.io.IOException err14) {
			err14.printStackTrace();
		}
		class2.testGetUrls_ClasspathUrl();
		class2.testGetUrls_File();
		io.bootique.resource.ResourceFactory_WebConfigSourceIT class3 = new io.bootique.resource.ResourceFactory_WebConfigSourceIT();
		try {
			class3.after();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class3.before();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class3.testReadConfig_HttpUrl();
		}
		catch (java.io.IOException err17) {
			err17.printStackTrace();
		}
	}
}