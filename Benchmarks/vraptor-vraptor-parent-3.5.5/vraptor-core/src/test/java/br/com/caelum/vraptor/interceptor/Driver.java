package br.com.caelum.vraptor.interceptor;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.interceptor.ExceptionHandlerInterceptorTest class1 = new br.com.caelum.vraptor.interceptor.ExceptionHandlerInterceptorTest();
		try {
			class1.setup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldAlwaysAccept();
		class1.withRootException();
		class1.whenNotFoundException();
		br.com.caelum.vraptor.interceptor.DefaultTypeNameExtractorTest class2 = new br.com.caelum.vraptor.interceptor.DefaultTypeNameExtractorTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.shouldDecapitalizeSomeCharsUntilItFindsOneUppercased();
		}
		catch (java.lang.NoSuchMethodException err3) {
			err3.printStackTrace();
		}
		try {
			class2.shouldDecapitalizeSomeCharsUntilItFindsOneUppercasedForListsAndArrays();
		}
		catch (java.lang.NoSuchMethodException err4) {
			err4.printStackTrace();
		}
		catch (java.lang.SecurityException err5) {
			err5.printStackTrace();
		}
		catch (java.lang.NoSuchFieldException err6) {
			err6.printStackTrace();
		}
		try {
			class2.shouldDecapitalizeSomeCharsUntilItFindsOneUppercasedForListsAndArraysForBoundedGenericElements();
		}
		catch (java.lang.NoSuchMethodException err7) {
			err7.printStackTrace();
		}
		catch (java.lang.SecurityException err8) {
			err8.printStackTrace();
		}
		catch (java.lang.NoSuchFieldException err9) {
			err9.printStackTrace();
		}
		try {
			class2.shouldDiscoverGenericTypeParametersWhenThereIsInheritance();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.DeserializingInterceptorTest class3 = new br.com.caelum.vraptor.interceptor.DeserializingInterceptorTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class3.shouldOnlyAcceptMethodsWithConsumesAnnotation();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class3.willSetHttpStatusCode415IfTheResourceMethodDoesNotSupportTheGivenMediaTypes();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class3.willSetHttpStatusCode415IfThereIsNoDeserializerButIsAccepted();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		class3.willSetMethodParametersWithDeserializationAndContinueStackAfterDeserialization();
		class3.willSetMethodParametersWithDeserializationEvenIfTheContentTypeHasCharsetDeclaration();
		try {
			class3.willDeserializeForAnyContentTypeIfPossible();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class3.shouldNotDeserializeIfHasNoContentType();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class3.willSetOnlyNonNullParameters();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class3.shouldThrowInterceptionExceptionIfAnIOExceptionOccurs();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.TopologicalSortedInterceptorRegistryTest class4 = new br.com.caelum.vraptor.interceptor.TopologicalSortedInterceptorRegistryTest();
		try {
			class4.returnsRegisteredClasses();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class4.respectsAfterAttribute();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class4.respectsBeforeAndAfterAttribute();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class4.failsOnCycles();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class4.respectsInsertionOrderIfNoRelationIsSet();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class4.usesDefaultInterceptorsIfNoRelationIsSet();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class4.respectsBeforeAttribute();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.DownloadInterceptorTest class5 = new br.com.caelum.vraptor.interceptor.DownloadInterceptorTest();
		try {
			class5.setup();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class5.whenResultIsADownloadShouldUseIt();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class5.whenResultIsAnInputStreamShouldCreateAInputStreamDownload();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class5.whenResultIsAnInputStreamShouldCreateAByteArrayDownload();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class5.whenResultIsAFileShouldCreateAFileDownload();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class5.whenResultIsNullAndResultWasUsedShouldDoNothing();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class5.whenResultIsNullAndResultWasNotUsedShouldThrowNPE();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class5.shouldThrowInterceptionExceptionIfIOExceptionOccurs();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class5.shouldNotAcceptStringReturn();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class5.shouldAcceptFile();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class5.shouldAcceptInput();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class5.shouldAcceptDownload();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class5.shouldAcceptByte();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.FlashInterceptorTest class6 = new br.com.caelum.vraptor.interceptor.FlashInterceptorTest();
		try {
			class6.setUp();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		class6.shouldAcceptAlways();
		try {
			class6.shouldDoNothingWhenThereIsNoFlashParameters();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class6.shouldAddAllFlashParametersToResult();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class6.shouldRemoveFlashIncludedParameters();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class6.shouldIncludeFlashParametersWhenARedirectHappens();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class6.shouldNotIncludeFlashParametersWhenThereIsNoIncludedParameter();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class6.shouldNotCrashWhenSessionIsInvalid();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.ParametersInstantiatorInterceptorTest class7 = new br.com.caelum.vraptor.interceptor.ParametersInstantiatorInterceptorTest();
		try {
			class7.setup();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		class7.shouldAcceptIfMethodHasParameters();
		class7.shouldNotAcceptIfMethodHasNoParameters();
		try {
			class7.shouldUseTheProvidedParameters();
		}
		catch (br.com.caelum.vraptor.InterceptionException err47) {
			err47.printStackTrace();
		}
		catch (java.io.IOException err48) {
			err48.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err49) {
			err49.printStackTrace();
		}
		try {
			class7.shouldConvertArrayParametersToIndexParameters();
		}
		catch (java.lang.Exception err50) {
			err50.printStackTrace();
		}
		try {
			class7.shouldThrowExceptionWhenThereIsAParameterContainingDotClass();
		}
		catch (java.lang.Exception err51) {
			err51.printStackTrace();
		}
		try {
			class7.shouldUseAndDiscardFlashParameters();
		}
		catch (br.com.caelum.vraptor.InterceptionException err52) {
			err52.printStackTrace();
		}
		catch (java.io.IOException err53) {
			err53.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err54) {
			err54.printStackTrace();
		}
		try {
			class7.shouldValidateParameters();
		}
		catch (java.lang.Exception err55) {
			err55.printStackTrace();
		}
		try {
			class7.shouldThrowException();
		}
		catch (java.lang.Exception err56) {
			err56.printStackTrace();
		}
		try {
			class7.shouldAddHeaderInformationToRequestWhenHeaderParamAnnotationIsPresent();
		}
		catch (java.lang.Exception err57) {
			err57.printStackTrace();
		}
		try {
			class7.shouldAddHeaderInformationToRequestWhenHeaderParamAnnotationIsNotPresent();
		}
		catch (java.lang.Exception err58) {
			err58.printStackTrace();
		}
		try {
			class7.shouldAddVariousHeaderInformationsToRequestWhenHeaderParamAnnotationIsPresent();
		}
		catch (java.lang.Exception err59) {
			err59.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.InstantiateInterceptorTest class8 = new br.com.caelum.vraptor.interceptor.InstantiateInterceptorTest();
		class8.setup();
		class8.shouldAcceptAlways();
		try {
			class8.shouldUseContainerForNewComponent();
		}
		catch (br.com.caelum.vraptor.InterceptionException err60) {
			err60.printStackTrace();
		}
		catch (java.io.IOException err61) {
			err61.printStackTrace();
		}
		try {
			class8.shouldNotInstantiateIfThereIsAlreadyAResource();
		}
		catch (br.com.caelum.vraptor.InterceptionException err62) {
			err62.printStackTrace();
		}
		catch (java.io.IOException err63) {
			err63.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.OutjectResultTest class9 = new br.com.caelum.vraptor.interceptor.OutjectResultTest();
		class9.setup();
		try {
			class9.shouldOutjectWithASimpleTypeName();
		}
		catch (java.lang.NoSuchMethodException err64) {
			err64.printStackTrace();
		}
		try {
			class9.shouldOutjectACollectionAsAList();
		}
		catch (java.lang.NoSuchMethodException err65) {
			err65.printStackTrace();
		}
		try {
			class9.shouldNotOutjectIfThereIsNoReturnType();
		}
		catch (java.lang.NoSuchMethodException err66) {
			err66.printStackTrace();
		}
		try {
			class9.shouldNotOutjectIfReturnIsVoid();
		}
		catch (java.lang.NoSuchMethodException err67) {
			err67.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.VRaptorMatchers class10 = new br.com.caelum.vraptor.interceptor.VRaptorMatchers();
		br.com.caelum.vraptor.interceptor.DefaultInterceptorRegistryTest class11 = new br.com.caelum.vraptor.interceptor.DefaultInterceptorRegistryTest();
		class11.shouldRegisterAllComponents();
		br.com.caelum.vraptor.interceptor.InstanceContainer class12 = new br.com.caelum.vraptor.interceptor.InstanceContainer();
		br.com.caelum.vraptor.interceptor.ResourceLookupInterceptorTest class13 = new br.com.caelum.vraptor.interceptor.ResourceLookupInterceptorTest();
		class13.config();
		class13.shouldAcceptAlways();
		try {
			class13.shouldHandle404();
		}
		catch (java.io.IOException err68) {
			err68.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err69) {
			err69.printStackTrace();
		}
		try {
			class13.shouldHandle405();
		}
		catch (java.io.IOException err70) {
			err70.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err71) {
			err71.printStackTrace();
		}
		try {
			class13.shouldUseResourceMethodFoundWithNextInterceptor();
		}
		catch (java.io.IOException err72) {
			err72.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err73) {
			err73.printStackTrace();
		}
		br.com.caelum.vraptor.interceptor.ExecuteMethodInterceptorTest class14 = new br.com.caelum.vraptor.interceptor.ExecuteMethodInterceptorTest();
		try {
			class14.setup();
		}
		catch (java.lang.NoSuchMethodException err74) {
			err74.printStackTrace();
		}
		class14.shouldAcceptAlways();
		try {
			class14.shouldInvokeTheMethodAndNotProceedWithInterceptorStack();
		}
		catch (java.lang.SecurityException err75) {
			err75.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err76) {
			err76.printStackTrace();
		}
		catch (java.io.IOException err77) {
			err77.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err78) {
			err78.printStackTrace();
		}
		try {
			class14.shouldThrowMethodExceptionIfThereIsAnInvocationException();
		}
		catch (java.io.IOException err79) {
			err79.printStackTrace();
		}
		catch (java.lang.SecurityException err80) {
			err80.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err81) {
			err81.printStackTrace();
		}
		try {
			class14.shouldUseTheProvidedArguments();
		}
		catch (java.lang.SecurityException err82) {
			err82.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err83) {
			err83.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err84) {
			err84.printStackTrace();
		}
		catch (java.io.IOException err85) {
			err85.printStackTrace();
		}
		try {
			class14.shouldSetResultReturnedValueFromInvokedMethod();
		}
		catch (java.lang.SecurityException err86) {
			err86.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err87) {
			err87.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err88) {
			err88.printStackTrace();
		}
		catch (java.io.IOException err89) {
			err89.printStackTrace();
		}
		try {
			class14.shouldSetNullWhenNullReturnedFromInvokedMethod();
		}
		catch (java.lang.SecurityException err90) {
			err90.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err91) {
			err91.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err92) {
			err92.printStackTrace();
		}
		catch (java.io.IOException err93) {
			err93.printStackTrace();
		}
		try {
			class14.shouldSetOkWhenVoidReturnedFromInvokedMethod();
		}
		catch (java.lang.SecurityException err94) {
			err94.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err95) {
			err95.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err96) {
			err96.printStackTrace();
		}
		catch (java.io.IOException err97) {
			err97.printStackTrace();
		}
		try {
			class14.shouldBeOkIfThereIsValidationErrorsAndYouSpecifiedWhereToGo();
		}
		catch (java.lang.SecurityException err98) {
			err98.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err99) {
			err99.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err100) {
			err100.printStackTrace();
		}
		catch (java.io.IOException err101) {
			err101.printStackTrace();
		}
		try {
			class14.shouldThrowExceptionIfYouHaventSpecifiedWhereToGoOnValidationError();
		}
		catch (java.lang.SecurityException err102) {
			err102.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err103) {
			err103.printStackTrace();
		}
		catch (br.com.caelum.vraptor.InterceptionException err104) {
			err104.printStackTrace();
		}
		catch (java.io.IOException err105) {
			err105.printStackTrace();
		}
	}
}