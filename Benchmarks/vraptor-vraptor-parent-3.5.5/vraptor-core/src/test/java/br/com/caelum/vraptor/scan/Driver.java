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
		br.com.caelum.vraptor.scan.ResourceA class2 = new br.com.caelum.vraptor.scan.ResourceA();
		br.com.caelum.vraptor.scan.WebBasedClasspathResolverTest class3 = new br.com.caelum.vraptor.scan.WebBasedClasspathResolverTest();
		class3.callerContextDifferentFromRequestedClassLoaderReturnsCurrentClassLoader();
		br.com.caelum.vraptor.scan.JavassistBootstrapGeneratorTest class4 = new br.com.caelum.vraptor.scan.JavassistBootstrapGeneratorTest();
		try {
			class4.setup();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class4.shouldRegisterClasses();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class4.shouldThrowScannerExceptionIfAnErrorOccurs();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		br.com.caelum.vraptor.scan.ScannotationComponentScannerTest class5 = new br.com.caelum.vraptor.scan.ScannotationComponentScannerTest();
		try {
			class5.setup();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		class5.shouldScanWEBINFClasses();
		class5.shouldScanBasePackages();
		try {
			class5.shouldReturnEmptyCollectionIfWebinfClassesNotFound();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class5.shouldThrowScannerExceptionIfHasExceptionWhenProcessWebinfClasses();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		br.com.caelum.vraptor.scan.DynamicWebAppBootstrapTest class6 = new br.com.caelum.vraptor.scan.DynamicWebAppBootstrapTest();
		try {
			class6.setup();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		class6.shouldConfigureAllClasses();
		class6.shouldNotDoAnythingIfHasNoClasses();
		class6.shouldThrowScannerExceptionIfClassNotExists();
		br.com.caelum.vraptor.scan.ResourceB class7 = new br.com.caelum.vraptor.scan.ResourceB();
	}
}