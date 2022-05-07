package br.com.caelum.vraptor.interceptor;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.interceptor.TopologicalSortedInterceptorRegistryTest class1 = new br.com.caelum.vraptor.interceptor.TopologicalSortedInterceptorRegistryTest();
		try {
			class1.returnsRegisteredClasses();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.respectsAfterAttribute();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.respectsBeforeAndAfterAttribute();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.failsOnCycles();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.respectsInsertionOrderIfNoRelationIsSet();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.usesDefaultInterceptorsIfNoRelationIsSet();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.respectsBeforeAttribute();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.OutjectResultTest class2 = new br.com.caelum.vraptor.interceptor.OutjectResultTest();
		class2.setup();
		try {
			class2.shouldOutjectWithASimpleTypeName();
		}
		catch (java.lang.NoSuchMethodException err8) {
			err8.printStackTrace();
		}
		try {
			class2.shouldOutjectACollectionAsAList();
		}
		catch (java.lang.NoSuchMethodException err9) {
			err9.printStackTrace();
		}
		try {
			class2.shouldNotOutjectIfThereIsNoReturnType();
		}
		catch (java.lang.NoSuchMethodException err10) {
			err10.printStackTrace();
		}
		try {
			class2.shouldNotOutjectIfReturnIsVoid();
		}
		catch (java.lang.NoSuchMethodException err11) {
			err11.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.DefaultInterceptorRegistryTest class3 = new br.com.caelum.vraptor.interceptor.DefaultInterceptorRegistryTest();
		class3.shouldRegisterAllComponents();
		br.com.caelum.vraptor.interceptor.InstantiateInterceptorTest class4 = new br.com.caelum.vraptor.interceptor.InstantiateInterceptorTest();
		class4.setup();
		class4.shouldAcceptAlways();
		try {
			class4.shouldUseContainerForNewComponent();
		}
		catch (br.com.caelum.vraptor.InterceptionException err12) {
			err12.printStackTrace();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class4.shouldNotInstantiateIfThereIsAlreadyAResource();
		}
		catch (br.com.caelum.vraptor.InterceptionException err14) {
			err14.printStackTrace();
		}
		catch (java.io.IOException err15) {
			err15.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.FlashInterceptorTest class5 = new br.com.caelum.vraptor.interceptor.FlashInterceptorTest();
		try {
			class5.setUp();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		class5.shouldAcceptAlways();
		try {
			class5.shouldDoNothingWhenThereIsNoFlashParameters();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class5.shouldAddAllFlashParametersToResult();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class5.shouldRemoveFlashIncludedParameters();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class5.shouldIncludeFlashParametersWhenARedirectHappens();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class5.shouldNotIncludeFlashParametersWhenThereIsNoIncludedParameter();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class5.shouldNotCrashWhenSessionIsInvalid();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.ExceptionHandlerInterceptorTest class6 = new br.com.caelum.vraptor.interceptor.ExceptionHandlerInterceptorTest();
		try {
			class6.setup();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		class6.shouldAlwaysAccept();
		class6.withRootException();
		class6.whenNotFoundException();
		br.com.caelum.vraptor.interceptor.ParametersInstantiatorInterceptorTest class7 = new br.com.caelum.vraptor.interceptor.ParametersInstantiatorInterceptorTest();
		try {
			class7.setup();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		class7.shouldAcceptIfMethodHasParameters();
		class7.shouldNotAcceptIfMethodHasNoParameters();
		try {
			class7.shouldUseTheProvidedParameters();
		}
		catch (br.com.caelum.vraptor.InterceptionException err25) {
			err25.printStackTrace();
		}
		catch (java.io.IOException err26) {
			err26.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err27) {
			err27.printStackTrace();
		}
		try {
			class7.shouldConvertArrayParametersToIndexParameters();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class7.shouldThrowExceptionWhenThereIsAParameterContainingDotClass();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class7.shouldUseAndDiscardFlashParameters();
		}
		catch (br.com.caelum.vraptor.InterceptionException err30) {
			err30.printStackTrace();
		}
		catch (java.io.IOException err31) {
			err31.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err32) {
			err32.printStackTrace();
		}
		try {
			class7.shouldValidateParameters();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class7.shouldThrowException();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class7.shouldAddHeaderInformationToRequestWhenHeaderParamAnnotationIsPresent();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class7.shouldAddHeaderInformationToRequestWhenHeaderParamAnnotationIsNotPresent();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class7.shouldAddVariousHeaderInformationsToRequestWhenHeaderParamAnnotationIsPresent();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.ExecuteMethodInterceptorTest class8 = new br.com.caelum.vraptor.interceptor.ExecuteMethodInterceptorTest();
		try {
			class8.setup();
		}
		catch (java.lang.NoSuchMethodException err38) {
			err38.printStackTrace();
		}
		class8.shouldAcceptAlways();
		try {
			class8.shouldInvokeTheMethodAndNotProceedWithInterceptorStack();
		}
		catch (java.lang.SecurityException err39) {
			err39.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err40) {
			err40.printStackTrace();
		}
		catch (java.io.IOException err41) {
			err41.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err42) {
			err42.printStackTrace();
		}
		try {
			class8.shouldThrowMethodExceptionIfThereIsAnInvocationException();
		}
		catch (java.io.IOException err43) {
			err43.printStackTrace();
		}
		catch (java.lang.SecurityException err44) {
			err44.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err45) {
			err45.printStackTrace();
		}
		try {
			class8.shouldUseTheProvidedArguments();
		}
		catch (java.lang.SecurityException err46) {
			err46.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err47) {
			err47.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err48) {
			err48.printStackTrace();
		}
		catch (java.io.IOException err49) {
			err49.printStackTrace();
		}
		try {
			class8.shouldSetResultReturnedValueFromInvokedMethod();
		}
		catch (java.lang.SecurityException err50) {
			err50.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err51) {
			err51.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err52) {
			err52.printStackTrace();
		}
		catch (java.io.IOException err53) {
			err53.printStackTrace();
		}
		try {
			class8.shouldSetNullWhenNullReturnedFromInvokedMethod();
		}
		catch (java.lang.SecurityException err54) {
			err54.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err55) {
			err55.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err56) {
			err56.printStackTrace();
		}
		catch (java.io.IOException err57) {
			err57.printStackTrace();
		}
		try {
			class8.shouldSetOkWhenVoidReturnedFromInvokedMethod();
		}
		catch (java.lang.SecurityException err58) {
			err58.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err59) {
			err59.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err60) {
			err60.printStackTrace();
		}
		catch (java.io.IOException err61) {
			err61.printStackTrace();
		}
		try {
			class8.shouldBeOkIfThereIsValidationErrorsAndYouSpecifiedWhereToGo();
		}
		catch (java.lang.SecurityException err62) {
			err62.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err63) {
			err63.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err64) {
			err64.printStackTrace();
		}
		catch (java.io.IOException err65) {
			err65.printStackTrace();
		}
		try {
			class8.shouldThrowExceptionIfYouHaventSpecifiedWhereToGoOnValidationError();
		}
		catch (java.lang.SecurityException err66) {
			err66.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err67) {
			err67.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err68) {
			err68.printStackTrace();
		}
		catch (java.io.IOException err69) {
			err69.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.ResourceLookupInterceptorTest class9 = new br.com.caelum.vraptor.interceptor.ResourceLookupInterceptorTest();
		class9.config();
		class9.shouldAcceptAlways();
		try {
			class9.shouldHandle404();
		}
		catch (java.io.IOException err70) {
			err70.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err71) {
			err71.printStackTrace();
		}
		try {
			class9.shouldHandle405();
		}
		catch (java.io.IOException err72) {
			err72.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err73) {
			err73.printStackTrace();
		}
		try {
			class9.shouldUseResourceMethodFoundWithNextInterceptor();
		}
		catch (java.io.IOException err74) {
			err74.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err75) {
			err75.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.DefaultTypeNameExtractorTest class10 = new br.com.caelum.vraptor.interceptor.DefaultTypeNameExtractorTest();
		try {
			class10.setUp();
		}
		catch (java.lang.Exception err76) {
			err76.printStackTrace();
		}
		try {
			class10.shouldDecapitalizeSomeCharsUntilItFindsOneUppercased();
		}
		catch (java.lang.NoSuchMethodException err77) {
			err77.printStackTrace();
		}
		try {
			class10.shouldDecapitalizeSomeCharsUntilItFindsOneUppercasedForListsAndArrays();
		}
		catch (java.lang.NoSuchMethodException err78) {
			err78.printStackTrace();
		}
		catch (java.lang.SecurityException err79) {
			err79.printStackTrace();
		}
		catch (java.lang.NoSuchFieldException err80) {
			err80.printStackTrace();
		}
		try {
			class10.shouldDecapitalizeSomeCharsUntilItFindsOneUppercasedForListsAndArraysForBoundedGenericElements();
		}
		catch (java.lang.NoSuchMethodException err81) {
			err81.printStackTrace();
		}
		catch (java.lang.SecurityException err82) {
			err82.printStackTrace();
		}
		catch (java.lang.NoSuchFieldException err83) {
			err83.printStackTrace();
		}
		try {
			class10.shouldDiscoverGenericTypeParametersWhenThereIsInheritance();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.DeserializingInterceptorTest class11 = new br.com.caelum.vraptor.interceptor.DeserializingInterceptorTest();
		try {
			class11.setUp();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class11.shouldOnlyAcceptMethodsWithConsumesAnnotation();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		try {
			class11.willSetHttpStatusCode415IfTheResourceMethodDoesNotSupportTheGivenMediaTypes();
		}
		catch (java.lang.Exception err87) {
			err87.printStackTrace();
		}
		try {
			class11.willSetHttpStatusCode415IfThereIsNoDeserializerButIsAccepted();
		}
		catch (java.lang.Exception err88) {
			err88.printStackTrace();
		}
		class11.willSetMethodParametersWithDeserializationAndContinueStackAfterDeserialization();
		class11.willSetMethodParametersWithDeserializationEvenIfTheContentTypeHasCharsetDeclaration();
		try {
			class11.willDeserializeForAnyContentTypeIfPossible();
		}
		catch (java.lang.Exception err89) {
			err89.printStackTrace();
		}
		try {
			class11.shouldNotDeserializeIfHasNoContentType();
		}
		catch (java.lang.Exception err90) {
			err90.printStackTrace();
		}
		try {
			class11.willSetOnlyNonNullParameters();
		}
		catch (java.lang.Exception err91) {
			err91.printStackTrace();
		}
		try {
			class11.shouldThrowInterceptionExceptionIfAnIOExceptionOccurs();
		}
		catch (java.lang.Exception err92) {
			err92.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.DownloadInterceptorTest class12 = new br.com.caelum.vraptor.interceptor.DownloadInterceptorTest();
		try {
			class12.setup();
		}
		catch (java.lang.Exception err93) {
			err93.printStackTrace();
		}
		try {
			class12.whenResultIsADownloadShouldUseIt();
		}
		catch (java.lang.Exception err94) {
			err94.printStackTrace();
		}
		try {
			class12.whenResultIsAnInputStreamShouldCreateAInputStreamDownload();
		}
		catch (java.lang.Exception err95) {
			err95.printStackTrace();
		}
		try {
			class12.whenResultIsAnInputStreamShouldCreateAByteArrayDownload();
		}
		catch (java.lang.Exception err96) {
			err96.printStackTrace();
		}
		try {
			class12.whenResultIsAFileShouldCreateAFileDownload();
		}
		catch (java.lang.Exception err97) {
			err97.printStackTrace();
		}
		try {
			class12.whenResultIsNullAndResultWasUsedShouldDoNothing();
		}
		catch (java.lang.Exception err98) {
			err98.printStackTrace();
		}
		try {
			class12.whenResultIsNullAndResultWasNotUsedShouldThrowNPE();
		}
		catch (java.lang.Exception err99) {
			err99.printStackTrace();
		}
		try {
			class12.shouldThrowInterceptionExceptionIfIOExceptionOccurs();
		}
		catch (java.lang.Exception err100) {
			err100.printStackTrace();
		}
		try {
			class12.shouldNotAcceptStringReturn();
		}
		catch (java.lang.Exception err101) {
			err101.printStackTrace();
		}
		try {
			class12.shouldAcceptFile();
		}
		catch (java.lang.Exception err102) {
			err102.printStackTrace();
		}
		try {
			class12.shouldAcceptInput();
		}
		catch (java.lang.Exception err103) {
			err103.printStackTrace();
		}
		try {
			class12.shouldAcceptDownload();
		}
		catch (java.lang.Exception err104) {
			err104.printStackTrace();
		}
		try {
			class12.shouldAcceptByte();
		}
		catch (java.lang.Exception err105) {
			err105.printStackTrace();
		}
	}
}