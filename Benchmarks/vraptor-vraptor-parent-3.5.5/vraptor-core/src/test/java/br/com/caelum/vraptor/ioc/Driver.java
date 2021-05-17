package br.com.caelum.vraptor.ioc;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.ioc.InterceptorStereotypeHandlerTest class1 = new br.com.caelum.vraptor.ioc.InterceptorStereotypeHandlerTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldRegisterInterceptorsOnRegistry();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		br.com.caelum.vraptor.ioc.ComponentFactoryIntrospectorTest class2 = new br.com.caelum.vraptor.ioc.ComponentFactoryIntrospectorTest();
		class2.shouldExtractTargetTypeFromGenericDefinition();
		class2.shouldRequireGenericTypeInformationToBePresent();
		class2.shoudWorkWithSubclassesOfComponenetFactoryImplementations();
		class2.shoudWorkWithImplementationsOfComponenetFactorySubinterfacesImplementations();
		class2.shoudNotWorkWithClassesThatDoesNotImplementComponentFactory();
		br.com.caelum.vraptor.ioc.AbstractComponentRegistryTest class3 = new br.com.caelum.vraptor.ioc.AbstractComponentRegistryTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class3.shouldRegisterComponentAndImplementedInterfaces();
		class3.shouldRegisterComponentUsingAllPossibleSupertypes();
		br.com.caelum.vraptor.ioc.NeedsCustomInstantiation class4 = new br.com.caelum.vraptor.ioc.NeedsCustomInstantiation();
		br.com.caelum.vraptor.ioc.MySessionComponent class5 = new br.com.caelum.vraptor.ioc.MySessionComponent();
		br.com.caelum.vraptor.ioc.TheComponentFactory class6 = new br.com.caelum.vraptor.ioc.TheComponentFactory();
	}
}