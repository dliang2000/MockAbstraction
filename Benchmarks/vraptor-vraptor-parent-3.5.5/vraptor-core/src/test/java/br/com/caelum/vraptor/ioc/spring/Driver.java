package br.com.caelum.vraptor.ioc.spring;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.ioc.spring.SpringBasedContainerTest class1 = new br.com.caelum.vraptor.ioc.spring.SpringBasedContainerTest();
		class1.initContainer();
		class1.destroyContainer();
		try {
			class1.twoClassesWithSameNameButDifferentPackages();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldScanAndRegisterAnnotatedBeans();
		class1.shouldRunPostConstructMethodOfApplicationScopedComponentsAtContainerStart();
		class1.shouldProvideOnlyIfBeanIsRegistered();
		class1.shouldNotProvidePrimitiveValues();
		class1.shouldSupportOtherStereotypeAnnotations();
		class1.shouldSupportConstructorInjection();
		class1.shouldProvideCurrentHttpRequest();
		class1.shouldProvideCurrentVRaptorRequest();
		class1.shouldProvideServletContext();
		class1.shouldProvideTheContainer();
		class1.shouldSupportManualRegistration();
		class1.shoudSupportCustomImplementationsForAlreadyRegisteredComponents();
		class1.shoudRegisterResourcesInRouter();
		class1.shoudRegisterConvertersInConverters();
		class1.shoudRegisterInterceptorsInInterceptorRegistry();
		br.com.caelum.vraptor.ioc.spring.SpringProviderTest class2 = new br.com.caelum.vraptor.ioc.spring.SpringProviderTest();
		class2.init();
		class2.destroy();
		try {
			class2.shouldIncludeTheApplicationContextOnTheRootApplicationContextParamIfNotSet();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.shouldNotIncludeTheApplicationContextOnTheRootApplicationContextParamIfAlreadySet();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class2.shouldLoadInitParameterForBasePackages();
		br.com.caelum.vraptor.ioc.spring.VRaptorScopeResolverTest class3 = new br.com.caelum.vraptor.ioc.spring.VRaptorScopeResolverTest();
		class3.shouldResolveToRequestScopeByDefault();
		class3.shouldResolveRequestScopedAnnotationToRequestScope();
		class3.shouldResolveSessionScopedAnnotationToSessionScope();
		class3.shouldResolveApplicationScopedAnnotationToSingletonScope();
	}
}