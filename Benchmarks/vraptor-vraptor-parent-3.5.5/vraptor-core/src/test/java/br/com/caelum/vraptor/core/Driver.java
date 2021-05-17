package br.com.caelum.vraptor.core;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.core.DefaultStaticContentHandlerTest class1 = new br.com.caelum.vraptor.core.DefaultStaticContentHandlerTest();
		class1.setup();
		try {
			class1.returnsTrueForRealStaticResources();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.returnsTrueForRealStaticResourcesWithQueryString();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.returnsTrueForRealStaticResourcesWithJSessionId();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.returnsFalseForNonStaticResources();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		br.com.caelum.vraptor.core.SafeResourceBundleTest class2 = new br.com.caelum.vraptor.core.SafeResourceBundleTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.shouldReturnDelegateValueWhenKeyExists();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.shouldReturnKeyBetweenQuestionMarksWhenKeyDoesntExist();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		br.com.caelum.vraptor.core.ExceptionRecorderTest class3 = new br.com.caelum.vraptor.core.ExceptionRecorderTest();
		class3.setUp();
		class3.withRootException();
		class3.withNestedException();
		class3.whenNotFoundException();
		br.com.caelum.vraptor.core.LazyInterceptorHandlerTest class4 = new br.com.caelum.vraptor.core.LazyInterceptorHandlerTest();
		try {
			class4.setUp();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class4.shouldUseContainerIfInterceptorAccepts();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class4.shouldNotUseContainerIfInterceptorDoesntAccept();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class4.shouldFailIfUsingConstructorParametersOnConstructor();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class4.shouldFailIfUsingConstructorParametersOnAcceptsMethod();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		br.com.caelum.vraptor.core.JstlLocalizationTest class5 = new br.com.caelum.vraptor.core.JstlLocalizationTest();
		class5.setUp();
		class5.keyNotFound();
		class5.keyFound();
		class5.findLocaleFromRequest();
		class5.findLocaleFromSession();
		class5.findLocaleFromServletContext();
		class5.findLocaleFromRequestLocale();
		class5.testLocaleWithSessionNotRequest();
		class5.testFallbackLocale();
		br.com.caelum.vraptor.core.DefaultConvertersTest class6 = new br.com.caelum.vraptor.core.DefaultConvertersTest();
		class6.setup();
		class6.shouldRegisterConvertersForAllDefaultTypes();
		class6.complainsIfNoConverterFound();
		class6.convertingANonAnnotatedConverterEndsUpComplaining();
		class6.registersAndUsesTheConverterInstaceForTheSpecifiedType();
		class6.usesTheLastConverterInstanceRegisteredForTheSpecifiedType();
		try {
			class6.existsForWillReturnTrueForRegisteredConverters();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		br.com.caelum.vraptor.core.DefaultInterceptorStackTest class7 = new br.com.caelum.vraptor.core.DefaultInterceptorStackTest();
		try {
			class7.setUp();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class7.testInvokesAllInterceptorsInItsCorrectOrder();
		}
		catch (java.io.IOException err15) {
			err15.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err16) {
			err16.printStackTrace();
		}
		try {
			class7.shouldAddNextInterceptorAsNext();
		}
		catch (br.com.caelum.vraptor.InterceptionException err17) {
			err17.printStackTrace();
		}
		catch (java.io.IOException err18) {
			err18.printStackTrace();
		}
		br.com.caelum.vraptor.core.DefaultInterceptorHandlerFactoryTest class8 = new br.com.caelum.vraptor.core.DefaultInterceptorHandlerFactoryTest();
		try {
			class8.setUp();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class8.handlerForRegularInterceptorsShouldBeDynamic();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class8.handlerForStaticInterceptorsShouldBeStatic();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class8.staticHandlersShouldBeCached();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		br.com.caelum.vraptor.core.DefaultResultTest class9 = new br.com.caelum.vraptor.core.DefaultResultTest();
		class9.setup();
		class9.shouldUseContainerForNewView();
		class9.shouldSetRequestAttribute();
		try {
			class9.shouldDelegateToPageResultOnForwardToURI();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class9.shouldDelegateToPageResultOnRedirectToURI();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class9.shouldDelegateToPageResultOnPageOf();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class9.shouldDelegateToLogicResultOnForwardToLogic();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class9.shouldDelegateToLogicResultOnRedirectToLogic();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class9.shouldDelegateToLogicResultOnRedirectToLogicWithInstance();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class9.shouldDelegateToLogicResultOnForwardToLogicWithInstance();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class9.shouldDelegateToPageResultOnPageOfWithInstance();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class9.shouldDelegateToStatusOnNotFound();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class9.shouldDelegateToStatusOnPermanentlyRedirectToUri();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class9.shouldDelegateToStatusOnPermanentlyRedirectToControllerClass();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class9.shouldDelegateToStatusOnPermanentlyRedirectToControllerInstance();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class9.shouldIncludeExtractedNameWhenSimplyIncluding();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class9.shouldNotIncludeTheAttributeWhenTheValueIsNull();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		br.com.caelum.vraptor.core.DefaultMethodInfoTest class10 = new br.com.caelum.vraptor.core.DefaultMethodInfoTest();
		try {
			class10.unsetParameters();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class10.setParameters();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		br.com.caelum.vraptor.core.ToInstantiateInterceptorHandlerTest class11 = new br.com.caelum.vraptor.core.ToInstantiateInterceptorHandlerTest();
		class11.setup();
		try {
			class11.shouldComplainWhenUnableToInstantiateAnInterceptor();
		}
		catch (br.com.caelum.vraptor.InterceptionException err39) {
			err39.printStackTrace();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		try {
			class11.shouldInvokeInterceptorsMethodIfAbleToInstantiateIt();
		}
		catch (br.com.caelum.vraptor.InterceptionException err41) {
			err41.printStackTrace();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		try {
			class11.shouldNotInvokeInterceptorsMethodIfInterceptorDoesntAcceptsResource();
		}
		catch (br.com.caelum.vraptor.InterceptionException err43) {
			err43.printStackTrace();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
	}
}