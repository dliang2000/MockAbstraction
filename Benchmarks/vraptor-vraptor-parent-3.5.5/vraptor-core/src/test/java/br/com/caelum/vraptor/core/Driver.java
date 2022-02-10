package br.com.caelum.vraptor.core;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.core.DefaultResultTest class1 = new br.com.caelum.vraptor.core.DefaultResultTest();
		class1.setup();
		class1.shouldUseContainerForNewView();
		class1.shouldSetRequestAttribute();
		try {
			class1.shouldDelegateToPageResultOnForwardToURI();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldDelegateToPageResultOnRedirectToURI();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldDelegateToPageResultOnPageOf();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldDelegateToLogicResultOnForwardToLogic();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.shouldDelegateToLogicResultOnRedirectToLogic();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.shouldDelegateToLogicResultOnRedirectToLogicWithInstance();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.shouldDelegateToLogicResultOnForwardToLogicWithInstance();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.shouldDelegateToPageResultOnPageOfWithInstance();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.shouldDelegateToStatusOnNotFound();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.shouldDelegateToStatusOnPermanentlyRedirectToUri();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.shouldDelegateToStatusOnPermanentlyRedirectToControllerClass();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class1.shouldDelegateToStatusOnPermanentlyRedirectToControllerInstance();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class1.shouldIncludeExtractedNameWhenSimplyIncluding();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class1.shouldNotIncludeTheAttributeWhenTheValueIsNull();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		br.com.caelum.vraptor.core.DefaultInterceptorStackTest class2 = new br.com.caelum.vraptor.core.DefaultInterceptorStackTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class2.testInvokesAllInterceptorsInItsCorrectOrder();
		}
		catch (java.io.IOException err16) {
			err16.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err17) {
			err17.printStackTrace();
		}
		try {
			class2.shouldAddNextInterceptorAsNext();
		}
		catch (br.com.caelum.vraptor.InterceptionException err18) {
			err18.printStackTrace();
		}
		catch (java.io.IOException err19) {
			err19.printStackTrace();
		}
		br.com.caelum.vraptor.core.ToInstantiateInterceptorHandlerTest class3 = new br.com.caelum.vraptor.core.ToInstantiateInterceptorHandlerTest();
		class3.setup();
		try {
			class3.shouldComplainWhenUnableToInstantiateAnInterceptor();
		}
		catch (br.com.caelum.vraptor.InterceptionException err20) {
			err20.printStackTrace();
		}
		catch (java.io.IOException err21) {
			err21.printStackTrace();
		}
		try {
			class3.shouldInvokeInterceptorsMethodIfAbleToInstantiateIt();
		}
		catch (br.com.caelum.vraptor.InterceptionException err22) {
			err22.printStackTrace();
		}
		catch (java.io.IOException err23) {
			err23.printStackTrace();
		}
		try {
			class3.shouldNotInvokeInterceptorsMethodIfInterceptorDoesntAcceptsResource();
		}
		catch (br.com.caelum.vraptor.InterceptionException err24) {
			err24.printStackTrace();
		}
		catch (java.io.IOException err25) {
			err25.printStackTrace();
		}
		br.com.caelum.vraptor.core.DefaultInterceptorHandlerFactoryTest class4 = new br.com.caelum.vraptor.core.DefaultInterceptorHandlerFactoryTest();
		try {
			class4.setUp();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class4.handlerForRegularInterceptorsShouldBeDynamic();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class4.handlerForStaticInterceptorsShouldBeStatic();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class4.staticHandlersShouldBeCached();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		br.com.caelum.vraptor.core.DefaultConvertersTest class5 = new br.com.caelum.vraptor.core.DefaultConvertersTest();
		class5.setup();
		class5.shouldRegisterConvertersForAllDefaultTypes();
		class5.complainsIfNoConverterFound();
		class5.convertingANonAnnotatedConverterEndsUpComplaining();
		class5.registersAndUsesTheConverterInstaceForTheSpecifiedType();
		class5.usesTheLastConverterInstanceRegisteredForTheSpecifiedType();
		try {
			class5.existsForWillReturnTrueForRegisteredConverters();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		br.com.caelum.vraptor.core.LazyInterceptorHandlerTest class6 = new br.com.caelum.vraptor.core.LazyInterceptorHandlerTest();
		try {
			class6.setUp();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class6.shouldUseContainerIfInterceptorAccepts();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class6.shouldNotUseContainerIfInterceptorDoesntAccept();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class6.shouldFailIfUsingConstructorParametersOnConstructor();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class6.shouldFailIfUsingConstructorParametersOnAcceptsMethod();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		br.com.caelum.vraptor.core.DefaultStaticContentHandlerTest class7 = new br.com.caelum.vraptor.core.DefaultStaticContentHandlerTest();
		class7.setup();
		try {
			class7.returnsTrueForRealStaticResources();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class7.returnsTrueForRealStaticResourcesWithQueryString();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class7.returnsTrueForRealStaticResourcesWithJSessionId();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class7.returnsFalseForNonStaticResources();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		br.com.caelum.vraptor.core.JstlLocalizationTest class8 = new br.com.caelum.vraptor.core.JstlLocalizationTest();
		class8.setUp();
		class8.keyNotFound();
		class8.keyFound();
		class8.findLocaleFromRequest();
		class8.findLocaleFromSession();
		class8.findLocaleFromServletContext();
		class8.findLocaleFromRequestLocale();
		class8.testLocaleWithSessionNotRequest();
		class8.testFallbackLocale();
		br.com.caelum.vraptor.core.DefaultMethodInfoTest class9 = new br.com.caelum.vraptor.core.DefaultMethodInfoTest();
		try {
			class9.unsetParameters();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class9.setParameters();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		br.com.caelum.vraptor.core.SafeResourceBundleTest class10 = new br.com.caelum.vraptor.core.SafeResourceBundleTest();
		try {
			class10.setUp();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class10.shouldReturnDelegateValueWhenKeyExists();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class10.shouldReturnKeyBetweenQuestionMarksWhenKeyDoesntExist();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		br.com.caelum.vraptor.core.ExceptionRecorderTest class11 = new br.com.caelum.vraptor.core.ExceptionRecorderTest();
		class11.setUp();
		class11.withRootException();
		class11.withNestedException();
		class11.whenNotFoundException();
	}
}