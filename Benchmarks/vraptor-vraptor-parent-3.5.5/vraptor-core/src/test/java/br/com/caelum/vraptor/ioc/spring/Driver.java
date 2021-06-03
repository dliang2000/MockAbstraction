package br.com.caelum.vraptor.ioc.spring;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.ioc.spring.VRaptorScopeResolverTest class1 = new br.com.caelum.vraptor.ioc.spring.VRaptorScopeResolverTest();
		class1.shouldResolveToRequestScopeByDefault();
		class1.shouldResolveRequestScopedAnnotationToRequestScope();
		class1.shouldResolveSessionScopedAnnotationToSessionScope();
		class1.shouldResolveApplicationScopedAnnotationToSingletonScope();
		br.com.caelum.vraptor.ioc.spring.SpringBasedContainerTest class2 = new br.com.caelum.vraptor.ioc.spring.SpringBasedContainerTest();
		class2.initContainer();
		class2.destroyContainer();
		try {
			class2.twoClassesWithSameNameButDifferentPackages();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class2.shouldScanAndRegisterAnnotatedBeans();
		class2.shouldRunPostConstructMethodOfApplicationScopedComponentsAtContainerStart();
		class2.shouldProvideOnlyIfBeanIsRegistered();
		class2.shouldNotProvidePrimitiveValues();
		class2.shouldSupportOtherStereotypeAnnotations();
		class2.shouldSupportConstructorInjection();
		class2.shouldProvideCurrentHttpRequest();
		class2.shouldProvideCurrentVRaptorRequest();
		class2.shouldProvideServletContext();
		class2.shouldProvideTheContainer();
		class2.shouldSupportManualRegistration();
		class2.shoudSupportCustomImplementationsForAlreadyRegisteredComponents();
		class2.shoudRegisterResourcesInRouter();
		class2.shoudRegisterConvertersInConverters();
		class2.shoudRegisterInterceptorsInInterceptorRegistry();
		br.com.caelum.vraptor.ioc.spring.SpringProviderTest class3 = new br.com.caelum.vraptor.ioc.spring.SpringProviderTest();
		class3.init();
		class3.destroy();
		try {
			class3.shouldIncludeTheApplicationContextOnTheRootApplicationContextParamIfNotSet();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.shouldNotIncludeTheApplicationContextOnTheRootApplicationContextParamIfAlreadySet();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class3.shouldLoadInitParameterForBasePackages();
	}
}