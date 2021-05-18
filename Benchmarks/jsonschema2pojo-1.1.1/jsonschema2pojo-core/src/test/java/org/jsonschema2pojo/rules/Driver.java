package org.jsonschema2pojo.rules;

public class Driver {
	public void runall() {
		org.jsonschema2pojo.rules.RequiredRuleTest class1 = new org.jsonschema2pojo.rules.RequiredRuleTest();
		try {
			class1.applyAddsTextWhenRequired();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err1) {
			err1.printStackTrace();
		}
		try {
			class1.applySkipsTextWhenNotRequired();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err2) {
			err2.printStackTrace();
		}
		org.jsonschema2pojo.rules.DynamicPropertiesRuleTest class2 = new org.jsonschema2pojo.rules.DynamicPropertiesRuleTest();
		try {
			class2.setUp();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err3) {
			err3.printStackTrace();
		}
		class2.shouldAddNotFoundField();
		org.jsonschema2pojo.rules.MinLengthMaxLengthRuleTest class3 = new org.jsonschema2pojo.rules.MinLengthMaxLengthRuleTest();
		class3.setUp();
		class3.testMinLength();
		class3.testMaxLength();
		class3.testMaxAndMinLength();
		class3.testMaxAndMinLengthGenericsOnType();
		class3.testNotUsed();
		class3.jsrDisable();
		org.jsonschema2pojo.rules.FormatRuleJodaTest class4 = new org.jsonschema2pojo.rules.FormatRuleJodaTest();
		class4.setupConfig();
		class4.applyGeneratesTypeFromFormatValue();
		org.jsonschema2pojo.rules.RequiredArrayRuleTest class5 = new org.jsonschema2pojo.rules.RequiredArrayRuleTest();
		try {
			class5.shouldUpdateJavaDoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err4) {
			err4.printStackTrace();
		}
		try {
			class5.shouldUpdateAnnotations();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err5) {
			err5.printStackTrace();
		}
		org.jsonschema2pojo.rules.EnumRuleTest class6 = new org.jsonschema2pojo.rules.EnumRuleTest();
		class6.wireUpConfig();
		class6.applyGeneratesUniqueEnumNamesForMultipleEnumNodesWithSameName();
		org.jsonschema2pojo.rules.TitleRuleTest class7 = new org.jsonschema2pojo.rules.TitleRuleTest();
		try {
			class7.applyAddsDescriptionToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err6) {
			err6.printStackTrace();
		}
		org.jsonschema2pojo.rules.SchemaRuleTest class8 = new org.jsonschema2pojo.rules.SchemaRuleTest();
		try {
			class8.refsToOtherSchemasAreLoaded();
		}
		catch (java.net.URISyntaxException err7) {
			err7.printStackTrace();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err8) {
			err8.printStackTrace();
		}
		try {
			class8.enumAsRootIsGeneratedCorrectly();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err9) {
			err9.printStackTrace();
		}
		try {
			class8.existingTypeIsUsedWhenTypeIsAlreadyGenerated();
		}
		catch (java.net.URISyntaxException err10) {
			err10.printStackTrace();
		}
		org.jsonschema2pojo.rules.PropertyRuleTest class9 = new org.jsonschema2pojo.rules.PropertyRuleTest();
		class9.setup();
		try {
			class9.applyRequiredByTopArray();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err11) {
			err11.printStackTrace();
		}
		try {
			class9.applyNotRequiredByTopArray();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err12) {
			err12.printStackTrace();
		}
		try {
			class9.applyRequiredByFlag();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err13) {
			err13.printStackTrace();
		}
		try {
			class9.applyNotRequiredByFlag();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err14) {
			err14.printStackTrace();
		}
		org.jsonschema2pojo.rules.PatternRuleTest class10 = new org.jsonschema2pojo.rules.PatternRuleTest();
		class10.setUp();
		class10.testRegex();
		class10.jsrDisable();
		org.jsonschema2pojo.rules.DigitsRuleTest class11 = new org.jsonschema2pojo.rules.DigitsRuleTest();
		class11.setUp();
		class11.testHasIntegerAndFractionalDigits();
		class11.testNotUsed();
		class11.jsrDisable();
		org.jsonschema2pojo.rules.FormatRuleTest class12 = new org.jsonschema2pojo.rules.FormatRuleTest();
		class12.applyGeneratesTypeFromFormatValue();
		class12.applyDefaultsToBaseType();
		org.jsonschema2pojo.rules.TypeRuleTest class13 = new org.jsonschema2pojo.rules.TypeRuleTest();
		class13.wireUpConfig();
		class13.applyGeneratesString();
		class13.applyGeneratesDate();
		class13.applyGeneratesInteger();
		class13.applyGeneratesIntegerPrimitive();
		class13.applyGeneratesIntegerUsingJavaTypeIntegerPrimitive();
		class13.applyGeneratesBigInteger();
		class13.applyGeneratesBigIntegerOverridingLong();
		class13.applyGeneratesBigDecimal();
		class13.applyGeneratesBigDecimalOverridingDouble();
		class13.applyGeneratesIntegerUsingJavaTypeInteger();
		class13.applyGeneratesIntegerUsingJavaTypeLongPrimitive();
		class13.applyGeneratesIntegerUsingJavaTypeLong();
		class13.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMaximumGreaterThanIntegerMax();
		class13.applyGeneratesIntegerUsingJavaTypeLongWhenMaximumGreaterThanIntegerMax();
		class13.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMaximumLessThanIntegerMin();
		class13.applyGeneratesIntegerUsingJavaTypeLongWhenMaximumLessThanIntegerMin();
		class13.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMinimumLessThanIntegerMin();
		class13.applyGeneratesIntegerUsingJavaTypeLongWhenMinimumLessThanIntegerMin();
		class13.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMinimumGreaterThanIntegerMax();
		class13.applyGeneratesIntegerUsingJavaTypeLongWhenMinimumGreaterThanIntegerMax();
		class13.applyGeneratesIntegerUsingJavaTypeBigInteger();
		class13.applyGeneratesNumber();
		class13.applyGeneratesNumberPrimitive();
		class13.applyGeneratesNumberUsingJavaTypeFloatPrimitive();
		class13.applyGeneratesNumberUsingJavaTypeFloat();
		class13.applyGeneratesNumberUsingJavaTypeDoublePrimitive();
		class13.applyGeneratesNumberUsingJavaTypeDouble();
		class13.applyGeneratesNumberUsingJavaTypeBigDecimal();
		class13.applyGeneratesBoolean();
		class13.applyGeneratesBooleanPrimitive();
		class13.applyGeneratesAnyAsObject();
		class13.applyGeneratesNullAsObject();
		class13.applyGeneratesArray();
		class13.applyGeneratesCustomObject();
		class13.applyChoosesObjectOnUnrecognizedType();
		class13.applyDefaultsToTypeAnyObject();
		org.jsonschema2pojo.rules.FormatRuleArraysTest class14 = new org.jsonschema2pojo.rules.FormatRuleArraysTest();
		class14.useArraysWithCustomTypeMapping();
		org.jsonschema2pojo.rules.FormatRulePrimitivesTest class15 = new org.jsonschema2pojo.rules.FormatRulePrimitivesTest();
		class15.usePrimitivesWithCustomTypeMapping();
		org.jsonschema2pojo.rules.DescriptionRuleTest class16 = new org.jsonschema2pojo.rules.DescriptionRuleTest();
		try {
			class16.applyAddsDescriptionToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err15) {
			err15.printStackTrace();
		}
		org.jsonschema2pojo.rules.ArrayRuleTest class17 = new org.jsonschema2pojo.rules.ArrayRuleTest();
		class17.arrayWithUniqueItemsProducesSet();
		class17.arrayWithNonUniqueItemsProducesList();
		class17.arrayOfPrimitivesProducesCollectionOfWrapperTypes();
		class17.arrayDefaultsToNonUnique();
		org.jsonschema2pojo.rules.MinItemsMaxItemsRuleTest class18 = new org.jsonschema2pojo.rules.MinItemsMaxItemsRuleTest();
		class18.setUp();
		class18.testMinLength();
		class18.testMaxLength();
		class18.testMaxAndMinLength();
		class18.testMaxAndMinLengthGenericsOnType();
		class18.testNotUsed();
		class18.jsrDisable();
		org.jsonschema2pojo.rules.CommentRuleTest class19 = new org.jsonschema2pojo.rules.CommentRuleTest();
		try {
			class19.applyAddsCommentToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err16) {
			err16.printStackTrace();
		}
		org.jsonschema2pojo.rules.RuleFactoryImplTest class20 = new org.jsonschema2pojo.rules.RuleFactoryImplTest();
		class20.factoryMethodsCreateRules();
		class20.generationConfigIsReturned();
		class20.generationRuleLoggerIsReturned();
		class20.schemaStoreIsReturned();
		org.jsonschema2pojo.rules.MinimumMaximumRuleTest class21 = new org.jsonschema2pojo.rules.MinimumMaximumRuleTest();
		class21.setUp();
		class21.testMinimum();
		class21.testMaximum();
		class21.testMaximumAndMinimum();
		class21.testNotUsed();
		class21.jsrDisable();
	}
}