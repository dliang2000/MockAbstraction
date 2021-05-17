package br.com.caelum.vraptor.view;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.view.DefaultRefererResultTest class1 = new br.com.caelum.vraptor.view.DefaultRefererResultTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.whenThereIsNoRefererShouldThrowExceptionOnForward();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.whenThereIsNoRefererShouldThrowExceptionOnRedirect();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.whenRefererDontMatchAControllerShouldForwardToPage();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.whenRefererDontMatchAControllerShouldRedirectToPage();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.whenRefererMatchesAControllerShouldRedirectToIt();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.whenRefererMatchesAControllerShouldForwardToIt();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		br.com.caelum.vraptor.view.DefaultHttpResultTest class2 = new br.com.caelum.vraptor.view.DefaultHttpResultTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.shouldDelegateToStatus();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class2.shouldDelegateToStatusWhenMovingToLogic();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class2.shouldHeadersProperly();
		try {
			class2.shouldSendError();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class2.shouldThrowsResultExceptionIfAnIOExceptionWhenSendError();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class2.shouldSendErrorWithMessage();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class2.shouldThrowResultExceptionIfAnIOExceptionWhenSendErrorWithMessage();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class2.shouldSetStatusCode();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class2.shouldWriteStringBody();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class2.shouldThrowResultExceptionIfAnIOExceptionWhenWriteStringBody();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class2.shouldThrowResultExceptionIfAnIOExceptionWhenWriteInputStreamBody();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class2.shouldThrowResultExceptionIfAnIOExceptionWhenWriteReaderBody();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		br.com.caelum.vraptor.view.DefaultPathResolverTest class3 = new br.com.caelum.vraptor.view.DefaultPathResolverTest();
		try {
			class3.config();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		class3.shouldUseResourceTypeAndMethodNameToResolveJsp();
		try {
			class3.shouldUseTheFormatIfSupplied();
		}
		catch (java.lang.NoSuchMethodException err21) {
			err21.printStackTrace();
		}
		try {
			class3.shouldIgnoreHtmlFormat();
		}
		catch (java.lang.NoSuchMethodException err22) {
			err22.printStackTrace();
		}
		br.com.caelum.vraptor.view.GenericController class4 = new br.com.caelum.vraptor.view.GenericController();
		br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest class5 = new br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest();
		class5.setup();
		class5.shouldComplainIfThereIsNothingRegistered();
		class5.shouldReturnHtmlWhenRequestingAnyContentType();
		class5.shouldReturnHtmlWhenAcceptsIsBlankContentType();
		class5.shouldReturnHtmlWhenRequestingUnknownAsFirstAndAnyContentType();
		class5.testHtml();
		class5.testJson();
		class5.testJsonWithQualifier();
		class5.testNull();
		class5.testJsonInAComplexAcceptHeader();
		class5.testPrecendenceInAComplexAcceptHeaderHtmlShouldPrevailWhenTied();
		class5.testPrecendenceInABizzarreMSIE8AcceptHeader();
		class5.testPrecendenceInABizzarreMSIE8AcceptHeaderWithHtml();
		class5.testPrecendenceInAComplexAcceptHeaderHtmlShouldPrevailWhenTied2();
		class5.testJsonInAComplexAcceptHeaderWithParameters();
		class5.testXMLInAComplexAcceptHeaderWithParametersNotOrdered();
		br.com.caelum.vraptor.view.DefaultPageResultTest class6 = new br.com.caelum.vraptor.view.DefaultPageResultTest();
		class6.setup();
		try {
			class6.shouldRedirectIncludingContext();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class6.shouldNotIncludeContextPathIfURIIsAbsolute();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class6.shouldThrowResultExceptionIfIOExceptionOccursWhileRedirect();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class6.shouldForwardToGivenURI();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class6.shouldThrowResultExceptionIfServletExceptionOccursWhileForwarding();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class6.shouldThrowResultExceptionIfIOExceptionOccursWhileForwarding();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class6.shouldAllowCustomPathResolverWhileForwardingView();
		}
		catch (javax.servlet.ServletException err29) {
			err29.printStackTrace();
		}
		catch (java.io.IOException err30) {
			err30.printStackTrace();
		}
		try {
			class6.shouldThrowResultExceptionIfServletExceptionOccursWhileForwardingView();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class6.shouldThrowResultExceptionIfIOExceptionOccursWhileForwardingView();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class6.shouldAllowCustomPathResolverWhileIncluding();
		}
		catch (javax.servlet.ServletException err33) {
			err33.printStackTrace();
		}
		catch (java.io.IOException err34) {
			err34.printStackTrace();
		}
		try {
			class6.shouldThrowResultExceptionIfServletExceptionOccursWhileIncluding();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class6.shouldThrowResultExceptionIfIOExceptionOccursWhileIncluding();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		class6.shoudNotExecuteLogicWhenUsingResultOf();
		class6.shoudThrowProxyInvocationExceptionIfAndExceptionOccursWhenUsingResultOf();
		br.com.caelum.vraptor.view.MockedPage class7 = new br.com.caelum.vraptor.view.MockedPage();
		br.com.caelum.vraptor.view.SubGenericController class8 = new br.com.caelum.vraptor.view.SubGenericController();
		br.com.caelum.vraptor.view.DogController class9 = new br.com.caelum.vraptor.view.DogController();
		br.com.caelum.vraptor.view.DefaultLogicResultTest class10 = new br.com.caelum.vraptor.view.DefaultLogicResultTest();
		class10.setup();
		try {
			class10.shouldIncludeReturnValueOnForward();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class10.shouldExecuteTheLogicAndRedirectToItsViewOnForward();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class10.shouldForwardToMethodsDefaultViewWhenResponseIsNotCommited();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class10.shouldNotForwardToMethodsDefaultViewWhenResponseIsCommited();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class10.shouldPutParametersOnFlashScopeOnRedirect();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class10.shouldNotPutParametersOnFlashScopeOnRedirectIfThereAreNoParameters();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class10.clientRedirectingWillRedirectToTranslatedUrl();
		}
		catch (java.lang.NoSuchMethodException err43) {
			err43.printStackTrace();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		try {
			class10.canRedirectWhenLogicMethodIsNotAnnotatedWithHttpMethods();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		try {
			class10.canRedirectWhenLogicMethodIsAnnotatedWithHttpGetMethod();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class10.cannotRedirectWhenLogicMethodIsAnnotatedWithAnyHttpMethodButGet();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class10.shouldNotWrapValidationExceptionWhenForwarding();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
		try {
			class10.shouldForwardToTheRightDefaultValue();
		}
		catch (java.lang.Exception err49) {
			err49.printStackTrace();
		}
		br.com.caelum.vraptor.view.DefaultStatusTest class11 = new br.com.caelum.vraptor.view.DefaultStatusTest();
		try {
			class11.setUp();
		}
		catch (java.lang.Exception err50) {
			err50.printStackTrace();
		}
		try {
			class11.shouldSetNotFoundStatus();
		}
		catch (java.lang.Exception err51) {
			err51.printStackTrace();
		}
		try {
			class11.shouldSetHeader();
		}
		catch (java.lang.Exception err52) {
			err52.printStackTrace();
		}
		try {
			class11.shouldSetCreatedStatus();
		}
		catch (java.lang.Exception err53) {
			err53.printStackTrace();
		}
		try {
			class11.shouldSetCreatedStatusAndLocationWithAppPath();
		}
		catch (java.lang.Exception err54) {
			err54.printStackTrace();
		}
		try {
			class11.shouldSetOkStatus();
		}
		catch (java.lang.Exception err55) {
			err55.printStackTrace();
		}
		try {
			class11.shouldSetConflictStatus();
		}
		catch (java.lang.Exception err56) {
			err56.printStackTrace();
		}
		try {
			class11.shouldSetAcceptedStatus();
		}
		catch (java.lang.Exception err57) {
			err57.printStackTrace();
		}
		try {
			class11.shouldSetMethodNotAllowedStatus();
		}
		catch (java.lang.Exception err58) {
			err58.printStackTrace();
		}
		try {
			class11.shouldSetMovedPermanentlyStatus();
		}
		catch (java.lang.Exception err59) {
			err59.printStackTrace();
		}
		try {
			class11.shouldMoveToExactlyURIWhenItIsNotAbsolute();
		}
		catch (java.lang.Exception err60) {
			err60.printStackTrace();
		}
		try {
			class11.shouldSetMovedPermanentlyStatusOfLogic();
		}
		catch (java.lang.Exception err61) {
			err61.printStackTrace();
		}
		try {
			class11.shouldSerializeErrorMessages();
		}
		catch (java.lang.Exception err62) {
			err62.printStackTrace();
		}
		try {
			class11.shouldSerializeErrorMessagesInJSON();
		}
		catch (java.lang.Exception err63) {
			err63.printStackTrace();
		}
		br.com.caelum.vraptor.view.LinkToHandlerTest class12 = new br.com.caelum.vraptor.view.LinkToHandlerTest();
		try {
			class12.setUp();
		}
		catch (java.lang.Exception err64) {
			err64.printStackTrace();
		}
		class12.shouldThrowExceptionWhenInvocationIsIncomplete();
		class12.shouldThrowExceptionWhenInvokingInexistantMethod();
		class12.shouldThrowExceptionWhenMethodIsAmbiguous();
		class12.shouldThrowExceptionWhenUsingParametersOfWrongTypes();
		class12.shouldReturnWantedUrlWithoutArgs();
		class12.shouldReturnWantedUrlWithParamArgs();
		class12.shouldReturnWantedUrlWithPartialParamArgs();
		try {
			class12.shouldReturnWantedUrlForOverrideMethodWithParamArgs();
		}
		catch (java.lang.NoSuchMethodException err65) {
			err65.printStackTrace();
		}
		catch (java.lang.SecurityException err66) {
			err66.printStackTrace();
		}
		try {
			class12.shouldReturnWantedUrlForOverrideMethodWithParialParamArgs();
		}
		catch (java.lang.SecurityException err67) {
			err67.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err68) {
			err68.printStackTrace();
		}
		class12.shouldUseExactlyMatchedMethodIfTheMethodIsOverloaded();
		class12.shouldThrowExceptionWhenPassingMoreArgsThanMethodSupports();
		br.com.caelum.vraptor.view.DefaultValidationViewsFactoryTest class13 = new br.com.caelum.vraptor.view.DefaultValidationViewsFactoryTest();
		try {
			class13.setUp();
		}
		catch (java.lang.Exception err69) {
			err69.printStackTrace();
		}
		try {
			class13.shouldUseValidationVersionOfLogicResult();
		}
		catch (java.lang.Exception err70) {
			err70.printStackTrace();
		}
		try {
			class13.shouldThrowExceptionOnlyAtTheEndOfValidationCall();
		}
		catch (java.lang.Exception err71) {
			err71.printStackTrace();
		}
		try {
			class13.shouldUseValidationVersionOfPageResult();
		}
		catch (java.lang.Exception err72) {
			err72.printStackTrace();
		}
		try {
			class13.shouldUseValidationVersionOfEmptyResult();
		}
		catch (java.lang.Exception err73) {
			err73.printStackTrace();
		}
		try {
			class13.onHttpResultShouldNotThrowExceptionsOnHeaders();
		}
		catch (java.lang.Exception err74) {
			err74.printStackTrace();
		}
		try {
			class13.onHttpResultShouldThrowExceptionsOnSendError();
		}
		catch (java.lang.Exception err75) {
			err75.printStackTrace();
		}
		try {
			class13.onHttpResultShouldThrowExceptionsOnSendErrorWithMessage();
		}
		catch (java.lang.Exception err76) {
			err76.printStackTrace();
		}
		try {
			class13.onHttpResultShouldThrowExceptionsOnSetStatus();
		}
		catch (java.lang.Exception err77) {
			err77.printStackTrace();
		}
		try {
			class13.shouldBeAbleToChainMethodsOnHttpResult();
		}
		catch (java.lang.Exception err78) {
			err78.printStackTrace();
		}
		try {
			class13.onHttpResultShouldThrowExceptionsOnMoved();
		}
		catch (java.lang.Exception err79) {
			err79.printStackTrace();
		}
		try {
			class13.onHttpResultShouldThrowExceptionsOnMovedToLogic();
		}
		catch (java.lang.Exception err80) {
			err80.printStackTrace();
		}
		try {
			class13.onRefererResultShouldThrowExceptionsOnForward();
		}
		catch (java.lang.Exception err81) {
			err81.printStackTrace();
		}
		try {
			class13.onRefererResultShouldThrowExceptionsOnRedirect();
		}
		catch (java.lang.Exception err82) {
			err82.printStackTrace();
		}
		try {
			class13.onStatusResultShouldThrowExceptionsOnNotFound();
		}
		catch (java.lang.Exception err83) {
			err83.printStackTrace();
		}
		try {
			class13.onStatusResultShouldThrowExceptionsOnHeader();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		try {
			class13.onStatusResultShouldThrowExceptionsOnCreated();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class13.onStatusResultShouldThrowExceptionsOnCreatedWithLocation();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		try {
			class13.onStatusResultShouldThrowExceptionsOnOk();
		}
		catch (java.lang.Exception err87) {
			err87.printStackTrace();
		}
		try {
			class13.onStatusResultShouldThrowExceptionsOnConflict();
		}
		catch (java.lang.Exception err88) {
			err88.printStackTrace();
		}
		try {
			class13.onStatusResultShouldThrowExceptionsOnMethodNotAllowed();
		}
		catch (java.lang.Exception err89) {
			err89.printStackTrace();
		}
		try {
			class13.onStatusResultShouldThrowExceptionsOnMovedPermanentlyTo();
		}
		catch (java.lang.Exception err90) {
			err90.printStackTrace();
		}
		try {
			class13.onStatusResultShouldThrowExceptionsOnMovedPermanentlyToLogic();
		}
		catch (java.lang.Exception err91) {
			err91.printStackTrace();
		}
		try {
			class13.onXMLSerializationResultShouldThrowExceptionOnlyOnSerializeMethod();
		}
		catch (java.lang.Exception err92) {
			err92.printStackTrace();
		}
		try {
			class13.onSerializerResultsShouldBeAbleToCreateValidationInstancesEvenIfChildClassesUsesCovariantType();
		}
		catch (java.lang.Exception err93) {
			err93.printStackTrace();
		}
	}
}