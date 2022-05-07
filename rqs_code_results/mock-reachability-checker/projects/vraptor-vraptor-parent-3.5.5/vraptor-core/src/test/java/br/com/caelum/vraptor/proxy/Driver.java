package br.com.caelum.vraptor.proxy;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.proxy.ReflectionInstanceCreatorTest class1 = new br.com.caelum.vraptor.proxy.ReflectionInstanceCreatorTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldProxifyInterfaces();
		class1.shouldProxifyConcreteClassesWithDefaultConstructors();
		class1.shouldProxifyConcreteClassesWithComplexConstructorsAndPassNullForAllParameters();
		class1.shouldTryAllConstructorsInDeclarationOrder();
		try {
			class1.shouldNotProxifyJavaLangObjectMethods();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		br.com.caelum.vraptor.proxy.JavassistProxifierTest class2 = new br.com.caelum.vraptor.proxy.JavassistProxifierTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class2.shouldProxifyInterfaces();
		class2.shouldProxifyConcreteClassesWithDefaultConstructors();
		class2.shouldProxifyConcreteClassesWithComplexConstructorsAndPassNullForAllParameters();
		class2.shouldNeverCallSuperclassConstructors();
		try {
			class2.shouldNotProxifyJavaLangObjectMethods();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		class2.testIfObjectIsProxy();
		class2.shouldThrowProxyInvocationExceptionIfAnErrorOccurs();
		try {
			class2.shouldNotProxifyBridges();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		br.com.caelum.vraptor.proxy.CglibProxifierTest class3 = new br.com.caelum.vraptor.proxy.CglibProxifierTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		class3.shouldProxifyInterfaces();
		class3.shouldProxifyConcreteClassesWithDefaultConstructors();
		class3.shouldProxifyConcreteClassesWithComplexConstructorsAndPassNullForAllParameters();
		class3.shouldNeverCallSuperclassConstructors();
		try {
			class3.shouldNotProxifyJavaLangObjectMethods();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class3.testIfObjectIsProxy();
		class3.shouldThrowProxyInvocationExceptionIfAnErrorOccurs();
		try {
			class3.shouldNotProxifyBridges();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
	}
}