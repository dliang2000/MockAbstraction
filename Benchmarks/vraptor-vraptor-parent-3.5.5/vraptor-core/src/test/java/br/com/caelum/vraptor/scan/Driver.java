package br.com.caelum.vraptor.scan;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.scan.NullWebAppBootstrapTest class1 = new br.com.caelum.vraptor.scan.NullWebAppBootstrapTest();
		try {
			class1.setup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldNotDoAnything();
		br.com.caelum.vraptor.scan.WebBasedClasspathResolverTest class2 = new br.com.caelum.vraptor.scan.WebBasedClasspathResolverTest();
		class2.callerContextDifferentFromRequestedClassLoaderReturnsCurrentClassLoader();
		br.com.caelum.vraptor.scan.JavassistBootstrapGeneratorTest class3 = new br.com.caelum.vraptor.scan.JavassistBootstrapGeneratorTest();
		try {
			class3.setup();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.shouldRegisterClasses();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.shouldThrowScannerExceptionIfAnErrorOccurs();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		br.com.caelum.vraptor.scan.ScannotationComponentScannerTest class4 = new br.com.caelum.vraptor.scan.ScannotationComponentScannerTest();
		try {
			class4.setup();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		class4.shouldScanWEBINFClasses();
		class4.shouldScanBasePackages();
		try {
			class4.shouldReturnEmptyCollectionIfWebinfClassesNotFound();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class4.shouldThrowScannerExceptionIfHasExceptionWhenProcessWebinfClasses();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		br.com.caelum.vraptor.scan.DynamicWebAppBootstrapTest class5 = new br.com.caelum.vraptor.scan.DynamicWebAppBootstrapTest();
		try {
			class5.setup();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		class5.shouldConfigureAllClasses();
		class5.shouldNotDoAnythingIfHasNoClasses();
		class5.shouldThrowScannerExceptionIfClassNotExists();
	}
}