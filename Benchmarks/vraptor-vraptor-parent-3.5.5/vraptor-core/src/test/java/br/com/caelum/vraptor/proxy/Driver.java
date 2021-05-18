package br.com.caelum.vraptor.proxy;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.proxy.TheClassWithComplexConstructor class1 = new br.com.caelum.vraptor.proxy.TheClassWithComplexConstructor();
		br.com.caelum.vraptor.proxy.CglibProxifierTest class2 = new br.com.caelum.vraptor.proxy.CglibProxifierTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class2.shouldProxifyInterfaces();
		class2.shouldProxifyConcreteClassesWithDefaultConstructors();
		class2.shouldProxifyConcreteClassesWithComplexConstructorsAndPassNullForAllParameters();
		class2.shouldNeverCallSuperclassConstructors();
		try {
			class2.shouldNotProxifyJavaLangObjectMethods();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class2.testIfObjectIsProxy();
		class2.shouldThrowProxyInvocationExceptionIfAnErrorOccurs();
		try {
			class2.shouldNotProxifyBridges();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		br.com.caelum.vraptor.proxy.TheClass class3 = new br.com.caelum.vraptor.proxy.TheClass();
		br.com.caelum.vraptor.proxy.ReflectionInstanceCreatorTest class4 = new br.com.caelum.vraptor.proxy.ReflectionInstanceCreatorTest();
		try {
			class4.setUp();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		class4.shouldProxifyInterfaces();
		class4.shouldProxifyConcreteClassesWithDefaultConstructors();
		class4.shouldProxifyConcreteClassesWithComplexConstructorsAndPassNullForAllParameters();
		class4.shouldTryAllConstructorsInDeclarationOrder();
		try {
			class4.shouldNotProxifyJavaLangObjectMethods();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		br.com.caelum.vraptor.proxy.JavassistProxifierTest class5 = new br.com.caelum.vraptor.proxy.JavassistProxifierTest();
		try {
			class5.setUp();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		class5.shouldProxifyInterfaces();
		class5.shouldProxifyConcreteClassesWithDefaultConstructors();
		class5.shouldProxifyConcreteClassesWithComplexConstructorsAndPassNullForAllParameters();
		class5.shouldNeverCallSuperclassConstructors();
		try {
			class5.shouldNotProxifyJavaLangObjectMethods();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class5.testIfObjectIsProxy();
		class5.shouldThrowProxyInvocationExceptionIfAnErrorOccurs();
		try {
			class5.shouldNotProxifyBridges();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
	}
}