/**
 * Copyright © 2010-2020 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jsonschema2pojo.rules;

public class Driver {
	public void runall() {
		org.jsonschema2pojo.rules.PatternRuleTest class1 = new org.jsonschema2pojo.rules.PatternRuleTest(false,null);
		class1.setUp();
		class1.testRegex();
		class1.jsrDisable();
		org.jsonschema2pojo.rules.MinimumMaximumRuleTest class2 = new org.jsonschema2pojo.rules.MinimumMaximumRuleTest(false,null);
		class2.setUp();
		class2.testMinimum();
		class2.testMaximum();
		class2.testMaximumAndMinimum();
		class2.testNotUsed();
		class2.jsrDisable();
		org.jsonschema2pojo.rules.FormatRuleArraysTest class3 = new org.jsonschema2pojo.rules.FormatRuleArraysTest(null,null);
		class3.useArraysWithCustomTypeMapping();
		org.jsonschema2pojo.rules.TypeRuleTest class4 = new org.jsonschema2pojo.rules.TypeRuleTest();
		class4.wireUpConfig();
		class4.applyGeneratesString();
		class4.applyGeneratesDate();
		class4.applyGeneratesInteger();
		class4.applyGeneratesIntegerPrimitive();
		class4.applyGeneratesIntegerUsingJavaTypeIntegerPrimitive();
		class4.applyGeneratesBigInteger();
		class4.applyGeneratesBigIntegerOverridingLong();
		class4.applyGeneratesBigDecimal();
		class4.applyGeneratesBigDecimalOverridingDouble();
		class4.applyGeneratesIntegerUsingJavaTypeInteger();
		class4.applyGeneratesIntegerUsingJavaTypeLongPrimitive();
		class4.applyGeneratesIntegerUsingJavaTypeLong();
		class4.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMaximumGreaterThanIntegerMax();
		class4.applyGeneratesIntegerUsingJavaTypeLongWhenMaximumGreaterThanIntegerMax();
		class4.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMaximumLessThanIntegerMin();
		class4.applyGeneratesIntegerUsingJavaTypeLongWhenMaximumLessThanIntegerMin();
		class4.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMinimumLessThanIntegerMin();
		class4.applyGeneratesIntegerUsingJavaTypeLongWhenMinimumLessThanIntegerMin();
		class4.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMinimumGreaterThanIntegerMax();
		class4.applyGeneratesIntegerUsingJavaTypeLongWhenMinimumGreaterThanIntegerMax();
		class4.applyGeneratesIntegerUsingJavaTypeBigInteger();
		class4.applyGeneratesNumber();
		class4.applyGeneratesNumberPrimitive();
		class4.applyGeneratesNumberUsingJavaTypeFloatPrimitive();
		class4.applyGeneratesNumberUsingJavaTypeFloat();
		class4.applyGeneratesNumberUsingJavaTypeDoublePrimitive();
		class4.applyGeneratesNumberUsingJavaTypeDouble();
		class4.applyGeneratesNumberUsingJavaTypeBigDecimal();
		class4.applyGeneratesBoolean();
		class4.applyGeneratesBooleanPrimitive();
		class4.applyGeneratesAnyAsObject();
		class4.applyGeneratesNullAsObject();
		class4.applyGeneratesArray();
		class4.applyGeneratesCustomObject();
		class4.applyChoosesObjectOnUnrecognizedType();
		class4.applyDefaultsToTypeAnyObject();
		org.jsonschema2pojo.rules.DynamicPropertiesRuleTest class5 = new org.jsonschema2pojo.rules.DynamicPropertiesRuleTest();
		try {
			class5.setUp();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err1) {
			err1.printStackTrace();
		}
		class5.shouldAddNotFoundField();
		org.jsonschema2pojo.rules.TitleRuleTest class6 = new org.jsonschema2pojo.rules.TitleRuleTest();
		try {
			class6.applyAddsDescriptionToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err2) {
			err2.printStackTrace();
		}
		org.jsonschema2pojo.rules.FormatRuleJodaTest class7 = new org.jsonschema2pojo.rules.FormatRuleJodaTest(null,null);
		class7.setupConfig();
		class7.applyGeneratesTypeFromFormatValue();
		org.jsonschema2pojo.rules.RequiredArrayRuleTest class8 = new org.jsonschema2pojo.rules.RequiredArrayRuleTest();
		try {
			class8.shouldUpdateJavaDoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err3) {
			err3.printStackTrace();
		}
		try {
			class8.shouldUpdateAnnotations();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err4) {
			err4.printStackTrace();
		}
		org.jsonschema2pojo.rules.DescriptionRuleTest class9 = new org.jsonschema2pojo.rules.DescriptionRuleTest();
		try {
			class9.applyAddsDescriptionToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err5) {
			err5.printStackTrace();
		}
		org.jsonschema2pojo.rules.ArrayRuleTest class10 = new org.jsonschema2pojo.rules.ArrayRuleTest();
		class10.arrayWithUniqueItemsProducesSet();
		class10.arrayWithNonUniqueItemsProducesList();
		class10.arrayOfPrimitivesProducesCollectionOfWrapperTypes();
		class10.arrayDefaultsToNonUnique();
		org.jsonschema2pojo.rules.MinItemsMaxItemsRuleTest class11 = new org.jsonschema2pojo.rules.MinItemsMaxItemsRuleTest(false,null);
		class11.setUp();
		class11.testMinLength();
		class11.testMaxLength();
		class11.testMaxAndMinLength();
		class11.testMaxAndMinLengthGenericsOnType();
		class11.testNotUsed();
		class11.jsrDisable();
		org.jsonschema2pojo.rules.FormatRulePrimitivesTest class12 = new org.jsonschema2pojo.rules.FormatRulePrimitivesTest(null,null);
		class12.usePrimitivesWithCustomTypeMapping();
		org.jsonschema2pojo.rules.PropertyRuleTest class13 = new org.jsonschema2pojo.rules.PropertyRuleTest();
		class13.setup();
		try {
			class13.applyRequiredByTopArray();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err6) {
			err6.printStackTrace();
		}
		try {
			class13.applyNotRequiredByTopArray();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err7) {
			err7.printStackTrace();
		}
		try {
			class13.applyRequiredByFlag();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err8) {
			err8.printStackTrace();
		}
		try {
			class13.applyNotRequiredByFlag();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err9) {
			err9.printStackTrace();
		}
		org.jsonschema2pojo.rules.RequiredRuleTest class14 = new org.jsonschema2pojo.rules.RequiredRuleTest();
		try {
			class14.applyAddsTextWhenRequired();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err10) {
			err10.printStackTrace();
		}
		try {
			class14.applySkipsTextWhenNotRequired();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err11) {
			err11.printStackTrace();
		}
		org.jsonschema2pojo.rules.CommentRuleTest class15 = new org.jsonschema2pojo.rules.CommentRuleTest();
		try {
			class15.applyAddsCommentToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err12) {
			err12.printStackTrace();
		}
		org.jsonschema2pojo.rules.DigitsRuleTest class16 = new org.jsonschema2pojo.rules.DigitsRuleTest(false,null);
		class16.setUp();
		class16.testHasIntegerAndFractionalDigits();
		class16.testNotUsed();
		class16.jsrDisable();
		org.jsonschema2pojo.rules.RuleFactoryImplTest class17 = new org.jsonschema2pojo.rules.RuleFactoryImplTest();
		class17.factoryMethodsCreateRules();
		class17.generationConfigIsReturned();
		class17.generationRuleLoggerIsReturned();
		class17.schemaStoreIsReturned();
		org.jsonschema2pojo.rules.SchemaRuleTest class18 = new org.jsonschema2pojo.rules.SchemaRuleTest();
		try {
			class18.refsToOtherSchemasAreLoaded();
		}
		catch (java.net.URISyntaxException err13) {
			err13.printStackTrace();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err14) {
			err14.printStackTrace();
		}
		try {
			class18.enumAsRootIsGeneratedCorrectly();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err15) {
			err15.printStackTrace();
		}
		try {
			class18.existingTypeIsUsedWhenTypeIsAlreadyGenerated();
		}
		catch (java.net.URISyntaxException err16) {
			err16.printStackTrace();
		}
		org.jsonschema2pojo.rules.EnumRuleTest class19 = new org.jsonschema2pojo.rules.EnumRuleTest();
		class19.wireUpConfig();
		class19.applyGeneratesUniqueEnumNamesForMultipleEnumNodesWithSameName();
		org.jsonschema2pojo.rules.MinLengthMaxLengthRuleTest class20 = new org.jsonschema2pojo.rules.MinLengthMaxLengthRuleTest(false,null);
		class20.setUp();
		class20.testMinLength();
		class20.testMaxLength();
		class20.testMaxAndMinLength();
		class20.testMaxAndMinLengthGenericsOnType();
		class20.testNotUsed();
		class20.jsrDisable();
		org.jsonschema2pojo.rules.FormatRuleTest class21 = new org.jsonschema2pojo.rules.FormatRuleTest(null,null);
		class21.applyGeneratesTypeFromFormatValue();
		class21.applyDefaultsToBaseType();
	}
}