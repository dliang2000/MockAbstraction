package br.com.caelum.vraptor.http.ognl;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.http.ognl.EmptyElementsRemovalTest class1 = new br.com.caelum.vraptor.http.ognl.EmptyElementsRemovalTest();
		class1.setup();
		class1.shouldRemoveNullElementsOutOfAnArrayList();
		try {
			class1.shouldRemoveNullElementsOutOfAnArray();
		}
		catch (java.lang.SecurityException err1) {
			err1.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldIgnoreTheFirstArrayIfOverriden();
		}
		catch (java.lang.SecurityException err3) {
			err3.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err4) {
			err4.printStackTrace();
		}
		try {
			class1.shouldPruneTheFirstArrayIfTheSecondIsInADifferentInstance();
		}
		catch (java.lang.SecurityException err5) {
			err5.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err6) {
			err6.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.VRaptorConvertersAdapterTest class2 = new br.com.caelum.vraptor.http.ognl.VRaptorConvertersAdapterTest();
		class2.setup();
		try {
			class2.shouldInvokePrimitiveConverter();
		}
		catch (ognl.OgnlException err7) {
			err7.printStackTrace();
		}
		try {
			class2.shouldInvokeCustomTypeConverter();
		}
		catch (ognl.OgnlException err8) {
			err8.printStackTrace();
		}
		try {
			class2.shouldThrowExceptionIfNoConverterIsFound();
		}
		catch (java.lang.Throwable err9) {
			err9.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.ListNullHandlerTest class3 = new br.com.caelum.vraptor.http.ognl.ListNullHandlerTest();
		class3.setup();
		try {
			class3.shouldNotSupportNonGenericLists();
		}
		catch (java.lang.InstantiationException err10) {
			err10.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err11) {
			err11.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err12) {
			err12.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err13) {
			err13.printStackTrace();
		}
		try {
			class3.shouldInsertItemsUntilTheRequiredPosition();
		}
		catch (java.lang.InstantiationException err14) {
			err14.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err15) {
			err15.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err16) {
			err16.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err17) {
			err17.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.Mouse class4 = new br.com.caelum.vraptor.http.ognl.Mouse();
		br.com.caelum.vraptor.http.ognl.AbstractOgnlTestSupport class5 = new br.com.caelum.vraptor.http.ognl.AbstractOgnlTestSupport();
		br.com.caelum.vraptor.http.ognl.ListAccessorTest class6 = new br.com.caelum.vraptor.http.ognl.ListAccessorTest();
		class6.setup();
		try {
			class6.gettingShouldReturnNullIfIndexNotFound();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class6.gettingShouldReturnValueIfIndexFound();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class6.settingShouldNullifyUpToIndex();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.GenericNullHandlerTest class7 = new br.com.caelum.vraptor.http.ognl.GenericNullHandlerTest();
		class7.setup();
		try {
			class7.shouldDenyMostInterfaces();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class7.shouldDenyMostAbstractClasses();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class7.shouldCreateArrays();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class7.shouldInstantiateGregorianCalendarForAbstractCalendarType();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class7.shouldInstantiateArrayListForCollectionInterface();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class7.shouldInstantiateArrayListForListInterface();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class7.shouldInstantiateLinkedListForQueueInterface();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class7.shouldInstantiateHashSetListForSetInterface();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class7.shouldInstantiateTreeSetListForSortedSetInterface();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.ArrayAccessorTest class8 = new br.com.caelum.vraptor.http.ognl.ArrayAccessorTest();
		class8.setup();
		try {
			class8.gettingShouldReturnNullIfIndexNotFound();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class8.gettingShouldReturnValueIfIndexFound();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class8.settingShouldNullifyUpToIndexAndIgnoreRemoval();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.MiscOgnlSupportTest class9 = new br.com.caelum.vraptor.http.ognl.MiscOgnlSupportTest();
		try {
			class9.setup();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class9.isCapableOfDealingWithEmptyParameterForInternalWrapperValue();
		}
		catch (ognl.OgnlException err34) {
			err34.printStackTrace();
		}
		try {
			class9.isCapableOfDealingWithEmptyParameterForInternalValueWhichNeedsAConverter();
		}
		catch (ognl.OgnlException err35) {
			err35.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.OgnlParametersProviderTest class10 = new br.com.caelum.vraptor.http.ognl.OgnlParametersProviderTest();
		br.com.caelum.vraptor.http.ognl.OgnlGenericTypesSupportTest class11 = new br.com.caelum.vraptor.http.ognl.OgnlGenericTypesSupportTest();
		try {
			class11.setup();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class11.canInstantiatingStringsInAListSettingItsInternalValueWithoutInvokingConverters();
		}
		catch (ognl.OgnlException err37) {
			err37.printStackTrace();
		}
		try {
			class11.canInstantiateAndPopulateAnArrayOfWrappers();
		}
		catch (ognl.OgnlException err38) {
			err38.printStackTrace();
		}
		try {
			class11.canInstantiateAndPopulateAListOfWrappers();
		}
		catch (ognl.OgnlException err39) {
			err39.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.ReflectionBasedNullHandlerTest class12 = new br.com.caelum.vraptor.http.ognl.ReflectionBasedNullHandlerTest();
		try {
			class12.setup();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class12.shouldInstantiateAnObjectIfRequiredToSetAProperty();
		}
		catch (ognl.OgnlException err41) {
			err41.printStackTrace();
		}
		try {
			class12.shouldInstantiateAListOfStrings();
		}
		catch (ognl.OgnlException err42) {
			err42.printStackTrace();
		}
		try {
			class12.shouldNotInstantiateIfLastTerm();
		}
		catch (ognl.OgnlException err43) {
			err43.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err44) {
			err44.printStackTrace();
		}
		try {
			class12.shouldFoundASetter();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		try {
			class12.shouldFoundAGetter();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class12.shouldFoundASetterEvenWithAProxyObject();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class12.shouldFoundAGetterWithAProxyObject();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
	}
}