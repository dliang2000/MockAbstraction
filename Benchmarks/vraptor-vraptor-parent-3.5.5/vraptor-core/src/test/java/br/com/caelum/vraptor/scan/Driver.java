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
		br.com.caelum.vraptor.scan.DynamicWebAppBootstrapTest class2 = new br.com.caelum.vraptor.scan.DynamicWebAppBootstrapTest();
		try {
			class2.setup();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class2.shouldConfigureAllClasses();
		class2.shouldNotDoAnythingIfHasNoClasses();
		class2.shouldThrowScannerExceptionIfClassNotExists();
		br.com.caelum.vraptor.scan.ScannotationComponentScannerTest class3 = new br.com.caelum.vraptor.scan.ScannotationComponentScannerTest();
		try {
			class3.setup();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class3.shouldScanWEBINFClasses();
		class3.shouldScanBasePackages();
		try {
			class3.shouldReturnEmptyCollectionIfWebinfClassesNotFound();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class3.shouldThrowScannerExceptionIfHasExceptionWhenProcessWebinfClasses();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		br.com.caelum.vraptor.scan.JavassistBootstrapGeneratorTest class4 = new br.com.caelum.vraptor.scan.JavassistBootstrapGeneratorTest();
		try {
			class4.setup();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class4.shouldRegisterClasses();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class4.shouldThrowScannerExceptionIfAnErrorOccurs();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		br.com.caelum.vraptor.scan.WebBasedClasspathResolverTest class5 = new br.com.caelum.vraptor.scan.WebBasedClasspathResolverTest();
		class5.callerContextDifferentFromRequestedClassLoaderReturnsCurrentClassLoader();
	}
}