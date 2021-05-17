package br.com.caelum.vraptor.http.iogi;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.http.iogi.IogiParametersProviderTest class1 = new br.com.caelum.vraptor.http.iogi.IogiParametersProviderTest();
		try {
			class1.returnsNullWhenInstantiatingAStringForWhichThereAreNoParameters();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.canInjectADependencyProvidedByVraptor();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.willCreateAnIogiParameterForEachRequestParameterValue();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.willCreateATargerForEachFormalParameterDeclaredByTheMethod();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.willAddValidationMessagesForConversionErrors();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.inCaseOfConversionErrorsOnlyNullifyTheProblematicParameter();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.isCapableOfDealingWithSets();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.isCapableOfDealingWithSetsOfObjects();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.shouldInjectOnlyAttributesWithSameType();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		br.com.caelum.vraptor.http.iogi.IogiGenericTypesSupportTest class2 = new br.com.caelum.vraptor.http.iogi.IogiGenericTypesSupportTest();
		class2.setup();
		try {
			class2.canInstantiatingStringsInAListSettingItsInternalValueWithoutInvokingConverters1();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class2.canInstantiatingStringsInAListSettingItsInternalValueWithoutInvokingConverters2();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		class2.canInstantiateAndPopulateAnArrayOfWrappers1();
		class2.canInstantiateAndPopulateAnArrayOfWrappers2();
		try {
			class2.canInstantiateAndPopulateAListOfWrappers1();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		class2.canInstantiateAndPopulateAListOfWrappers();
		br.com.caelum.vraptor.http.iogi.MiscIogiSupportTest class3 = new br.com.caelum.vraptor.http.iogi.MiscIogiSupportTest();
		class3.setup();
		class3.isCapableOfDealingWithEmptyParameterForInternalWrapperValue();
		try {
			class3.isCapableOfDealingWithEmptyParameterForInternalValueWhichNeedsAConverter();
		}
		catch (ognl.OgnlException err13) {
			err13.printStackTrace();
		}
	}
}