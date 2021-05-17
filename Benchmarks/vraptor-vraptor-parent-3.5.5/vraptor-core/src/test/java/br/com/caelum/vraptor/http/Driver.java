package br.com.caelum.vraptor.http;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.http.DefaultParameterNameProviderTest class1 = new br.com.caelum.vraptor.http.DefaultParameterNameProviderTest();
		class1.setup();
		try {
			class1.shouldNameObjectTypeAsItsSimpleName();
		}
		catch (java.lang.SecurityException err1) {
			err1.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldNamePrimitiveTypeAsItsSimpleName();
		}
		catch (java.lang.SecurityException err3) {
			err3.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err4) {
			err4.printStackTrace();
		}
		try {
			class1.shouldNameArrayAsItsSimpleTypeName();
		}
		catch (java.lang.SecurityException err5) {
			err5.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err6) {
			err6.printStackTrace();
		}
		try {
			class1.shouldNameGenericCollectionUsingOf();
		}
		catch (java.lang.SecurityException err7) {
			err7.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err8) {
			err8.printStackTrace();
		}
		br.com.caelum.vraptor.http.DefaultFormatResolverTest class2 = new br.com.caelum.vraptor.http.DefaultFormatResolverTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class2.if_formatIsSpecifiedReturnIt();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class2.if_formatIsSpecifiedReturnItEvenIfAcceptsHtml();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		class2.if_formatNotSpecifiedShouldReturnRequestAcceptFormat();
		class2.if_formatNotSpecifiedAndNoAcceptsHaveFormat();
		class2.ifAcceptHeaderIsNullShouldReturnDefault();
		br.com.caelum.vraptor.http.DefaultResourceTranslatorTest class3 = new br.com.caelum.vraptor.http.DefaultResourceTranslatorTest();
		class3.setup();
		class3.handlesInclude();
		class3.canHandleTheCorrectMethod();
		class3.shouldAcceptCaseInsensitiveRequestMethods();
		class3.shouldAcceptCaseInsensitiveGetRequestUsingThe_methodParameter();
		class3.shouldThrowExceptionWhenRequestANotKnownMethod();
		class3.shouldOverrideTheHttpMethodByUsingThe_methodParameter();
		class3.canHandleUrlIfRootContext();
		class3.canHandleUrlIfNonRootContext();
		class3.canHandleUrlIfPlainRootContext();
		class3.canHandleComposedUrlIfPlainRootContext();
		class3.canHandleComposedUrlIfNonRootContext();
		class3.canHandleUrlWithAppendedJSessionID();
		class3.canHandleUrlIfNonRootContextButPlainRequest();
		br.com.caelum.vraptor.http.VRaptorRequestTest class4 = new br.com.caelum.vraptor.http.VRaptorRequestTest();
		class4.setup();
		class4.allowsParametersToBeOverriden();
		class4.searchesOnTheFallbackRequest();
		class4.searchesOnAddedParameters();
		class4.returnsNullIfNotFound();
		class4.supportsGreaterLengthArrays();
		class4.returnsAllNamesOnlyOnce();
		class4.returnsBothMapsWithFirstOverridingSecond();
		br.com.caelum.vraptor.http.EncodingHandlerFactoryTest class5 = new br.com.caelum.vraptor.http.EncodingHandlerFactoryTest();
		try {
			class5.setUp();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class5.shouldReturnANullHandlerWhenThereIsNoEncodingInitParameter();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class5.shouldReturnAWebXmlHandlerWhenThereIsAnEncodingInitParameter();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		br.com.caelum.vraptor.http.WebXmlEncodingHandlerTest class6 = new br.com.caelum.vraptor.http.WebXmlEncodingHandlerTest();
		try {
			class6.setUp();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class6.shouldSetEncodingToUTF8();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class6.shouldThrowExceptionWhenAnUnsupportedEncodingExceptionOccurs();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		br.com.caelum.vraptor.http.ParanamerNameProviderTest class7 = new br.com.caelum.vraptor.http.ParanamerNameProviderTest();
		class7.setup();
		try {
			class7.shouldNameObjectTypeAsItsSimpleName();
		}
		catch (java.lang.SecurityException err18) {
			err18.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err19) {
			err19.printStackTrace();
		}
		try {
			class7.shouldNamePrimitiveTypeAsItsSimpleName();
		}
		catch (java.lang.SecurityException err20) {
			err20.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err21) {
			err21.printStackTrace();
		}
		try {
			class7.shouldNameArrayAsItsSimpleTypeName();
		}
		catch (java.lang.SecurityException err22) {
			err22.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err23) {
			err23.printStackTrace();
		}
		try {
			class7.shouldNameGenericCollectionUsingOf();
		}
		catch (java.lang.SecurityException err24) {
			err24.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err25) {
			err25.printStackTrace();
		}
		try {
			class7.shouldIgnoreChangesToTheReturnedArrayInSubsequentCalls();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class7.shouldNameFieldsAnnotatedWithNamed();
		}
		catch (java.lang.SecurityException err27) {
			err27.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err28) {
			err28.printStackTrace();
		}
		try {
			class7.shouldNotNameFieldsByTheFieldNameWhenUsingAnnotation();
		}
		catch (java.lang.SecurityException err29) {
			err29.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err30) {
			err30.printStackTrace();
		}
		try {
			class7.shouldNameMethodsFieldsWhenAnnotatedOrNot();
		}
		catch (java.lang.SecurityException err31) {
			err31.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err32) {
			err32.printStackTrace();
		}
		try {
			class7.shouldNameMethodsFieldsWhenAnnotatedOrNot2();
		}
		catch (java.lang.SecurityException err33) {
			err33.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err34) {
			err34.printStackTrace();
		}
	}
}