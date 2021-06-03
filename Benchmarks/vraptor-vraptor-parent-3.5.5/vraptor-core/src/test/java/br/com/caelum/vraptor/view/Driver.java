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
		br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest class4 = new br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest();
		class4.setup();
		class4.shouldComplainIfThereIsNothingRegistered();
		class4.shouldReturnHtmlWhenRequestingAnyContentType();
		class4.shouldReturnHtmlWhenAcceptsIsBlankContentType();
		class4.shouldReturnHtmlWhenRequestingUnknownAsFirstAndAnyContentType();
		class4.testHtml();
		class4.testJson();
		class4.testJsonWithQualifier();
		class4.testNull();
		class4.testJsonInAComplexAcceptHeader();
		class4.testPrecendenceInAComplexAcceptHeaderHtmlShouldPrevailWhenTied();
		class4.testPrecendenceInABizzarreMSIE8AcceptHeader();
		class4.testPrecendenceInABizzarreMSIE8AcceptHeaderWithHtml();
		class4.testPrecendenceInAComplexAcceptHeaderHtmlShouldPrevailWhenTied2();
		class4.testJsonInAComplexAcceptHeaderWithParameters();
		class4.testXMLInAComplexAcceptHeaderWithParametersNotOrdered();
		br.com.caelum.vraptor.view.DefaultPageResultTest class5 = new br.com.caelum.vraptor.view.DefaultPageResultTest();
		class5.setup();
		try {
			class5.shouldRedirectIncludingContext();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class5.shouldNotIncludeContextPathIfURIIsAbsolute();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class5.shouldThrowResultExceptionIfIOExceptionOccursWhileRedirect();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class5.shouldForwardToGivenURI();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class5.shouldThrowResultExceptionIfServletExceptionOccursWhileForwarding();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class5.shouldThrowResultExceptionIfIOExceptionOccursWhileForwarding();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class5.shouldAllowCustomPathResolverWhileForwardingView();
		}
		catch (javax.servlet.ServletException err29) {
			err29.printStackTrace();
		}
		catch (java.io.IOException err30) {
			err30.printStackTrace();
		}
		try {
			class5.shouldThrowResultExceptionIfServletExceptionOccursWhileForwardingView();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class5.shouldThrowResultExceptionIfIOExceptionOccursWhileForwardingView();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class5.shouldAllowCustomPathResolverWhileIncluding();
		}
		catch (javax.servlet.ServletException err33) {
			err33.printStackTrace();
		}
		catch (java.io.IOException err34) {
			err34.printStackTrace();
		}
		try {
			class5.shouldThrowResultExceptionIfServletExceptionOccursWhileIncluding();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class5.shouldThrowResultExceptionIfIOExceptionOccursWhileIncluding();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		class5.shoudNotExecuteLogicWhenUsingResultOf();
		class5.shoudThrowProxyInvocationExceptionIfAndExceptionOccursWhenUsingResultOf();
		br.com.caelum.vraptor.view.DefaultLogicResultTest class6 = new br.com.caelum.vraptor.view.DefaultLogicResultTest();
		class6.setup();
		try {
			class6.shouldIncludeReturnValueOnForward();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class6.shouldExecuteTheLogicAndRedirectToItsViewOnForward();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class6.shouldForwardToMethodsDefaultViewWhenResponseIsNotCommited();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class6.shouldNotForwardToMethodsDefaultViewWhenResponseIsCommited();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class6.shouldPutParametersOnFlashScopeOnRedirect();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class6.shouldNotPutParametersOnFlashScopeOnRedirectIfThereAreNoParameters();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class6.clientRedirectingWillRedirectToTranslatedUrl();
		}
		catch (java.lang.NoSuchMethodException err43) {
			err43.printStackTrace();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		try {
			class6.canRedirectWhenLogicMethodIsNotAnnotatedWithHttpMethods();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		try {
			class6.canRedirectWhenLogicMethodIsAnnotatedWithHttpGetMethod();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class6.cannotRedirectWhenLogicMethodIsAnnotatedWithAnyHttpMethodButGet();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class6.shouldNotWrapValidationExceptionWhenForwarding();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
		try {
			class6.shouldForwardToTheRightDefaultValue();
		}
		catch (java.lang.Exception err49) {
			err49.printStackTrace();
		}
		br.com.caelum.vraptor.view.DefaultStatusTest class7 = new br.com.caelum.vraptor.view.DefaultStatusTest();
		try {
			class7.setUp();
		}
		catch (java.lang.Exception err50) {
			err50.printStackTrace();
		}
		try {
			class7.shouldSetNotFoundStatus();
		}
		catch (java.lang.Exception err51) {
			err51.printStackTrace();
		}
		try {
			class7.shouldSetHeader();
		}
		catch (java.lang.Exception err52) {
			err52.printStackTrace();
		}
		try {
			class7.shouldSetCreatedStatus();
		}
		catch (java.lang.Exception err53) {
			err53.printStackTrace();
		}
		try {
			class7.shouldSetCreatedStatusAndLocationWithAppPath();
		}
		catch (java.lang.Exception err54) {
			err54.printStackTrace();
		}
		try {
			class7.shouldSetOkStatus();
		}
		catch (java.lang.Exception err55) {
			err55.printStackTrace();
		}
		try {
			class7.shouldSetConflictStatus();
		}
		catch (java.lang.Exception err56) {
			err56.printStackTrace();
		}
		try {
			class7.shouldSetAcceptedStatus();
		}
		catch (java.lang.Exception err57) {
			err57.printStackTrace();
		}
		try {
			class7.shouldSetMethodNotAllowedStatus();
		}
		catch (java.lang.Exception err58) {
			err58.printStackTrace();
		}
		try {
			class7.shouldSetMovedPermanentlyStatus();
		}
		catch (java.lang.Exception err59) {
			err59.printStackTrace();
		}
		try {
			class7.shouldMoveToExactlyURIWhenItIsNotAbsolute();
		}
		catch (java.lang.Exception err60) {
			err60.printStackTrace();
		}
		try {
			class7.shouldSetMovedPermanentlyStatusOfLogic();
		}
		catch (java.lang.Exception err61) {
			err61.printStackTrace();
		}
		try {
			class7.shouldSerializeErrorMessages();
		}
		catch (java.lang.Exception err62) {
			err62.printStackTrace();
		}
		try {
			class7.shouldSerializeErrorMessagesInJSON();
		}
		catch (java.lang.Exception err63) {
			err63.printStackTrace();
		}
		br.com.caelum.vraptor.view.LinkToHandlerTest class8 = new br.com.caelum.vraptor.view.LinkToHandlerTest();
		try {
			class8.setUp();
		}
		catch (java.lang.Exception err64) {
			err64.printStackTrace();
		}
		class8.shouldThrowExceptionWhenInvocationIsIncomplete();
		class8.shouldThrowExceptionWhenInvokingInexistantMethod();
		class8.shouldThrowExceptionWhenMethodIsAmbiguous();
		class8.shouldThrowExceptionWhenUsingParametersOfWrongTypes();
		class8.shouldReturnWantedUrlWithoutArgs();
		class8.shouldReturnWantedUrlWithParamArgs();
		class8.shouldReturnWantedUrlWithPartialParamArgs();
		try {
			class8.shouldReturnWantedUrlForOverrideMethodWithParamArgs();
		}
		catch (java.lang.NoSuchMethodException err65) {
			err65.printStackTrace();
		}
		catch (java.lang.SecurityException err66) {
			err66.printStackTrace();
		}
		try {
			class8.shouldReturnWantedUrlForOverrideMethodWithParialParamArgs();
		}
		catch (java.lang.SecurityException err67) {
			err67.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err68) {
			err68.printStackTrace();
		}
		class8.shouldUseExactlyMatchedMethodIfTheMethodIsOverloaded();
		class8.shouldThrowExceptionWhenPassingMoreArgsThanMethodSupports();
		br.com.caelum.vraptor.view.DefaultValidationViewsFactoryTest class9 = new br.com.caelum.vraptor.view.DefaultValidationViewsFactoryTest();
		try {
			class9.setUp();
		}
		catch (java.lang.Exception err69) {
			err69.printStackTrace();
		}
		try {
			class9.shouldUseValidationVersionOfLogicResult();
		}
		catch (java.lang.Exception err70) {
			err70.printStackTrace();
		}
		try {
			class9.shouldThrowExceptionOnlyAtTheEndOfValidationCall();
		}
		catch (java.lang.Exception err71) {
			err71.printStackTrace();
		}
		try {
			class9.shouldUseValidationVersionOfPageResult();
		}
		catch (java.lang.Exception err72) {
			err72.printStackTrace();
		}
		try {
			class9.shouldUseValidationVersionOfEmptyResult();
		}
		catch (java.lang.Exception err73) {
			err73.printStackTrace();
		}
		try {
			class9.onHttpResultShouldNotThrowExceptionsOnHeaders();
		}
		catch (java.lang.Exception err74) {
			err74.printStackTrace();
		}
		try {
			class9.onHttpResultShouldThrowExceptionsOnSendError();
		}
		catch (java.lang.Exception err75) {
			err75.printStackTrace();
		}
		try {
			class9.onHttpResultShouldThrowExceptionsOnSendErrorWithMessage();
		}
		catch (java.lang.Exception err76) {
			err76.printStackTrace();
		}
		try {
			class9.onHttpResultShouldThrowExceptionsOnSetStatus();
		}
		catch (java.lang.Exception err77) {
			err77.printStackTrace();
		}
		try {
			class9.shouldBeAbleToChainMethodsOnHttpResult();
		}
		catch (java.lang.Exception err78) {
			err78.printStackTrace();
		}
		try {
			class9.onHttpResultShouldThrowExceptionsOnMoved();
		}
		catch (java.lang.Exception err79) {
			err79.printStackTrace();
		}
		try {
			class9.onHttpResultShouldThrowExceptionsOnMovedToLogic();
		}
		catch (java.lang.Exception err80) {
			err80.printStackTrace();
		}
		try {
			class9.onRefererResultShouldThrowExceptionsOnForward();
		}
		catch (java.lang.Exception err81) {
			err81.printStackTrace();
		}
		try {
			class9.onRefererResultShouldThrowExceptionsOnRedirect();
		}
		catch (java.lang.Exception err82) {
			err82.printStackTrace();
		}
		try {
			class9.onStatusResultShouldThrowExceptionsOnNotFound();
		}
		catch (java.lang.Exception err83) {
			err83.printStackTrace();
		}
		try {
			class9.onStatusResultShouldThrowExceptionsOnHeader();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		try {
			class9.onStatusResultShouldThrowExceptionsOnCreated();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class9.onStatusResultShouldThrowExceptionsOnCreatedWithLocation();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		try {
			class9.onStatusResultShouldThrowExceptionsOnOk();
		}
		catch (java.lang.Exception err87) {
			err87.printStackTrace();
		}
		try {
			class9.onStatusResultShouldThrowExceptionsOnConflict();
		}
		catch (java.lang.Exception err88) {
			err88.printStackTrace();
		}
		try {
			class9.onStatusResultShouldThrowExceptionsOnMethodNotAllowed();
		}
		catch (java.lang.Exception err89) {
			err89.printStackTrace();
		}
		try {
			class9.onStatusResultShouldThrowExceptionsOnMovedPermanentlyTo();
		}
		catch (java.lang.Exception err90) {
			err90.printStackTrace();
		}
		try {
			class9.onStatusResultShouldThrowExceptionsOnMovedPermanentlyToLogic();
		}
		catch (java.lang.Exception err91) {
			err91.printStackTrace();
		}
		try {
			class9.onXMLSerializationResultShouldThrowExceptionOnlyOnSerializeMethod();
		}
		catch (java.lang.Exception err92) {
			err92.printStackTrace();
		}
		try {
			class9.onSerializerResultsShouldBeAbleToCreateValidationInstancesEvenIfChildClassesUsesCovariantType();
		}
		catch (java.lang.Exception err93) {
			err93.printStackTrace();
		}
	}
}