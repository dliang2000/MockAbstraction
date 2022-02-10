package br.com.caelum.vraptor.http.ognl;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.http.ognl.ReflectionBasedNullHandlerTest class1 = new br.com.caelum.vraptor.http.ognl.ReflectionBasedNullHandlerTest();
		try {
			class1.setup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldInstantiateAnObjectIfRequiredToSetAProperty();
		}
		catch (ognl.OgnlException err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldInstantiateAListOfStrings();
		}
		catch (ognl.OgnlException err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldNotInstantiateIfLastTerm();
		}
		catch (ognl.OgnlException err4) {
			err4.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err5) {
			err5.printStackTrace();
		}
		try {
			class1.shouldFoundASetter();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.shouldFoundAGetter();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.shouldFoundASetterEvenWithAProxyObject();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.shouldFoundAGetterWithAProxyObject();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.OgnlGenericTypesSupportTest class2 = new br.com.caelum.vraptor.http.ognl.OgnlGenericTypesSupportTest();
		try {
			class2.setup();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class2.canInstantiatingStringsInAListSettingItsInternalValueWithoutInvokingConverters();
		}
		catch (ognl.OgnlException err11) {
			err11.printStackTrace();
		}
		try {
			class2.canInstantiateAndPopulateAnArrayOfWrappers();
		}
		catch (ognl.OgnlException err12) {
			err12.printStackTrace();
		}
		try {
			class2.canInstantiateAndPopulateAListOfWrappers();
		}
		catch (ognl.OgnlException err13) {
			err13.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.EmptyElementsRemovalTest class3 = new br.com.caelum.vraptor.http.ognl.EmptyElementsRemovalTest();
		class3.setup();
		class3.shouldRemoveNullElementsOutOfAnArrayList();
		try {
			class3.shouldRemoveNullElementsOutOfAnArray();
		}
		catch (java.lang.SecurityException err14) {
			err14.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err15) {
			err15.printStackTrace();
		}
		try {
			class3.shouldIgnoreTheFirstArrayIfOverriden();
		}
		catch (java.lang.SecurityException err16) {
			err16.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err17) {
			err17.printStackTrace();
		}
		try {
			class3.shouldPruneTheFirstArrayIfTheSecondIsInADifferentInstance();
		}
		catch (java.lang.SecurityException err18) {
			err18.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err19) {
			err19.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.MiscOgnlSupportTest class4 = new br.com.caelum.vraptor.http.ognl.MiscOgnlSupportTest();
		try {
			class4.setup();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class4.isCapableOfDealingWithEmptyParameterForInternalWrapperValue();
		}
		catch (ognl.OgnlException err21) {
			err21.printStackTrace();
		}
		try {
			class4.isCapableOfDealingWithEmptyParameterForInternalValueWhichNeedsAConverter();
		}
		catch (ognl.OgnlException err22) {
			err22.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.VRaptorConvertersAdapterTest class5 = new br.com.caelum.vraptor.http.ognl.VRaptorConvertersAdapterTest();
		class5.setup();
		try {
			class5.shouldInvokePrimitiveConverter();
		}
		catch (ognl.OgnlException err23) {
			err23.printStackTrace();
		}
		try {
			class5.shouldInvokeCustomTypeConverter();
		}
		catch (ognl.OgnlException err24) {
			err24.printStackTrace();
		}
		try {
			class5.shouldThrowExceptionIfNoConverterIsFound();
		}
		catch (java.lang.Throwable err25) {
			err25.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.GenericNullHandlerTest class6 = new br.com.caelum.vraptor.http.ognl.GenericNullHandlerTest();
		class6.setup();
		try {
			class6.shouldDenyMostInterfaces();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class6.shouldDenyMostAbstractClasses();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class6.shouldCreateArrays();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class6.shouldInstantiateGregorianCalendarForAbstractCalendarType();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class6.shouldInstantiateArrayListForCollectionInterface();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class6.shouldInstantiateArrayListForListInterface();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class6.shouldInstantiateLinkedListForQueueInterface();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class6.shouldInstantiateHashSetListForSetInterface();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class6.shouldInstantiateTreeSetListForSortedSetInterface();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.ListNullHandlerTest class7 = new br.com.caelum.vraptor.http.ognl.ListNullHandlerTest();
		class7.setup();
		try {
			class7.shouldNotSupportNonGenericLists();
		}
		catch (java.lang.InstantiationException err35) {
			err35.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err36) {
			err36.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err37) {
			err37.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err38) {
			err38.printStackTrace();
		}
		try {
			class7.shouldInsertItemsUntilTheRequiredPosition();
		}
		catch (java.lang.InstantiationException err39) {
			err39.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err40) {
			err40.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err41) {
			err41.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err42) {
			err42.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.ListAccessorTest class8 = new br.com.caelum.vraptor.http.ognl.ListAccessorTest();
		class8.setup();
		try {
			class8.gettingShouldReturnNullIfIndexNotFound();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class8.gettingShouldReturnValueIfIndexFound();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class8.settingShouldNullifyUpToIndex();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		br.com.caelum.vraptor.http.ognl.ArrayAccessorTest class9 = new br.com.caelum.vraptor.http.ognl.ArrayAccessorTest();
		class9.setup();
		try {
			class9.gettingShouldReturnNullIfIndexNotFound();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class9.gettingShouldReturnValueIfIndexFound();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class9.settingShouldNullifyUpToIndexAndIgnoreRemoval();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
	}
}