package br.com.caelum.vraptor.ioc;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.ioc.ComponentFactoryIntrospectorTest class1 = new br.com.caelum.vraptor.ioc.ComponentFactoryIntrospectorTest();
		class1.shouldExtractTargetTypeFromGenericDefinition();
		class1.shouldRequireGenericTypeInformationToBePresent();
		class1.shoudWorkWithSubclassesOfComponenetFactoryImplementations();
		class1.shoudWorkWithImplementationsOfComponenetFactorySubinterfacesImplementations();
		class1.shoudNotWorkWithClassesThatDoesNotImplementComponentFactory();
		br.com.caelum.vraptor.ioc.AbstractComponentRegistryTest class2 = new br.com.caelum.vraptor.ioc.AbstractComponentRegistryTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class2.shouldRegisterComponentAndImplementedInterfaces();
		class2.shouldRegisterComponentUsingAllPossibleSupertypes();
		br.com.caelum.vraptor.ioc.InterceptorStereotypeHandlerTest class3 = new br.com.caelum.vraptor.ioc.InterceptorStereotypeHandlerTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.shouldRegisterInterceptorsOnRegistry();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
	}
}