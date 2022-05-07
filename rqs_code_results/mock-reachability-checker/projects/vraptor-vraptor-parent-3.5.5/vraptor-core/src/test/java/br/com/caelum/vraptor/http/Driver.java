package br.com.caelum.vraptor.http;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.http.DefaultFormatResolverTest class1 = new br.com.caelum.vraptor.http.DefaultFormatResolverTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.if_formatIsSpecifiedReturnIt();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.if_formatIsSpecifiedReturnItEvenIfAcceptsHtml();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class1.if_formatNotSpecifiedShouldReturnRequestAcceptFormat();
		class1.if_formatNotSpecifiedAndNoAcceptsHaveFormat();
		class1.ifAcceptHeaderIsNullShouldReturnDefault();
		br.com.caelum.vraptor.http.WebXmlEncodingHandlerTest class2 = new br.com.caelum.vraptor.http.WebXmlEncodingHandlerTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.shouldSetEncodingToUTF8();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.shouldThrowExceptionWhenAnUnsupportedEncodingExceptionOccurs();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		br.com.caelum.vraptor.http.EncodingHandlerFactoryTest class3 = new br.com.caelum.vraptor.http.EncodingHandlerFactoryTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class3.shouldReturnANullHandlerWhenThereIsNoEncodingInitParameter();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.shouldReturnAWebXmlHandlerWhenThereIsAnEncodingInitParameter();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		br.com.caelum.vraptor.http.ParanamerNameProviderTest class4 = new br.com.caelum.vraptor.http.ParanamerNameProviderTest();
		class4.setup();
		try {
			class4.shouldNameObjectTypeAsItsSimpleName();
		}
		catch (java.lang.SecurityException err10) {
			err10.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err11) {
			err11.printStackTrace();
		}
		try {
			class4.shouldNamePrimitiveTypeAsItsSimpleName();
		}
		catch (java.lang.SecurityException err12) {
			err12.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err13) {
			err13.printStackTrace();
		}
		try {
			class4.shouldNameArrayAsItsSimpleTypeName();
		}
		catch (java.lang.SecurityException err14) {
			err14.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err15) {
			err15.printStackTrace();
		}
		try {
			class4.shouldNameGenericCollectionUsingOf();
		}
		catch (java.lang.SecurityException err16) {
			err16.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err17) {
			err17.printStackTrace();
		}
		try {
			class4.shouldIgnoreChangesToTheReturnedArrayInSubsequentCalls();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class4.shouldNameFieldsAnnotatedWithNamed();
		}
		catch (java.lang.SecurityException err19) {
			err19.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err20) {
			err20.printStackTrace();
		}
		try {
			class4.shouldNotNameFieldsByTheFieldNameWhenUsingAnnotation();
		}
		catch (java.lang.SecurityException err21) {
			err21.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err22) {
			err22.printStackTrace();
		}
		try {
			class4.shouldNameMethodsFieldsWhenAnnotatedOrNot();
		}
		catch (java.lang.SecurityException err23) {
			err23.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err24) {
			err24.printStackTrace();
		}
		try {
			class4.shouldNameMethodsFieldsWhenAnnotatedOrNot2();
		}
		catch (java.lang.SecurityException err25) {
			err25.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err26) {
			err26.printStackTrace();
		}
		br.com.caelum.vraptor.http.DefaultParameterNameProviderTest class5 = new br.com.caelum.vraptor.http.DefaultParameterNameProviderTest();
		class5.setup();
		try {
			class5.shouldNameObjectTypeAsItsSimpleName();
		}
		catch (java.lang.SecurityException err27) {
			err27.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err28) {
			err28.printStackTrace();
		}
		try {
			class5.shouldNamePrimitiveTypeAsItsSimpleName();
		}
		catch (java.lang.SecurityException err29) {
			err29.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err30) {
			err30.printStackTrace();
		}
		try {
			class5.shouldNameArrayAsItsSimpleTypeName();
		}
		catch (java.lang.SecurityException err31) {
			err31.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err32) {
			err32.printStackTrace();
		}
		try {
			class5.shouldNameGenericCollectionUsingOf();
		}
		catch (java.lang.SecurityException err33) {
			err33.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err34) {
			err34.printStackTrace();
		}
		br.com.caelum.vraptor.http.VRaptorRequestTest class6 = new br.com.caelum.vraptor.http.VRaptorRequestTest();
		class6.setup();
		class6.allowsParametersToBeOverriden();
		class6.searchesOnTheFallbackRequest();
		class6.searchesOnAddedParameters();
		class6.returnsNullIfNotFound();
		class6.supportsGreaterLengthArrays();
		class6.returnsAllNamesOnlyOnce();
		class6.returnsBothMapsWithFirstOverridingSecond();
		br.com.caelum.vraptor.http.DefaultResourceTranslatorTest class7 = new br.com.caelum.vraptor.http.DefaultResourceTranslatorTest();
		class7.setup();
		class7.handlesInclude();
		class7.canHandleTheCorrectMethod();
		class7.shouldAcceptCaseInsensitiveRequestMethods();
		class7.shouldAcceptCaseInsensitiveGetRequestUsingThe_methodParameter();
		class7.shouldThrowExceptionWhenRequestANotKnownMethod();
		class7.shouldOverrideTheHttpMethodByUsingThe_methodParameter();
		class7.canHandleUrlIfRootContext();
		class7.canHandleUrlIfNonRootContext();
		class7.canHandleUrlIfPlainRootContext();
		class7.canHandleComposedUrlIfPlainRootContext();
		class7.canHandleComposedUrlIfNonRootContext();
		class7.canHandleUrlWithAppendedJSessionID();
		class7.canHandleUrlIfNonRootContextButPlainRequest();
	}
}