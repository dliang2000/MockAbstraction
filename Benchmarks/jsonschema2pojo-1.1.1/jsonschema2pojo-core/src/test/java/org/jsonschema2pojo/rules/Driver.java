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
		org.jsonschema2pojo.rules.FormatRuleArraysTest class1 = new org.jsonschema2pojo.rules.FormatRuleArraysTest(null,null);
		class1.useArraysWithCustomTypeMapping();
		org.jsonschema2pojo.rules.ArrayRuleTest class2 = new org.jsonschema2pojo.rules.ArrayRuleTest();
		class2.arrayWithUniqueItemsProducesSet();
		class2.arrayWithNonUniqueItemsProducesList();
		class2.arrayOfPrimitivesProducesCollectionOfWrapperTypes();
		class2.arrayDefaultsToNonUnique();
		org.jsonschema2pojo.rules.PatternRuleTest class3 = new org.jsonschema2pojo.rules.PatternRuleTest(false,null);
		class3.setUp();
		class3.testRegex();
		class3.jsrDisable();
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
		org.jsonschema2pojo.rules.MinLengthMaxLengthRuleTest class5 = new org.jsonschema2pojo.rules.MinLengthMaxLengthRuleTest(false,null);
		class5.setUp();
		class5.testMinLength();
		class5.testMaxLength();
		class5.testMaxAndMinLength();
		class5.testMaxAndMinLengthGenericsOnType();
		class5.testNotUsed();
		class5.jsrDisable();
		org.jsonschema2pojo.rules.MinItemsMaxItemsRuleTest class6 = new org.jsonschema2pojo.rules.MinItemsMaxItemsRuleTest(false,null);
		class6.setUp();
		class6.testMinLength();
		class6.testMaxLength();
		class6.testMaxAndMinLength();
		class6.testMaxAndMinLengthGenericsOnType();
		class6.testNotUsed();
		class6.jsrDisable();
		org.jsonschema2pojo.rules.RequiredArrayRuleTest class7 = new org.jsonschema2pojo.rules.RequiredArrayRuleTest();
		try {
			class7.shouldUpdateJavaDoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err1) {
			err1.printStackTrace();
		}
		try {
			class7.shouldUpdateAnnotations();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err2) {
			err2.printStackTrace();
		}
		org.jsonschema2pojo.rules.RuleFactoryImplTest class8 = new org.jsonschema2pojo.rules.RuleFactoryImplTest();
		class8.factoryMethodsCreateRules();
		class8.generationConfigIsReturned();
		class8.generationRuleLoggerIsReturned();
		class8.schemaStoreIsReturned();
		org.jsonschema2pojo.rules.FormatRuleJodaTest class9 = new org.jsonschema2pojo.rules.FormatRuleJodaTest(null,null);
		class9.setupConfig();
		class9.applyGeneratesTypeFromFormatValue();
		org.jsonschema2pojo.rules.DigitsRuleTest class10 = new org.jsonschema2pojo.rules.DigitsRuleTest(false,null);
		class10.setUp();
		class10.testHasIntegerAndFractionalDigits();
		class10.testNotUsed();
		class10.jsrDisable();
		org.jsonschema2pojo.rules.PropertyRuleTest class11 = new org.jsonschema2pojo.rules.PropertyRuleTest();
		class11.setup();
		try {
			class11.applyRequiredByTopArray();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err3) {
			err3.printStackTrace();
		}
		try {
			class11.applyNotRequiredByTopArray();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err4) {
			err4.printStackTrace();
		}
		try {
			class11.applyRequiredByFlag();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err5) {
			err5.printStackTrace();
		}
		try {
			class11.applyNotRequiredByFlag();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err6) {
			err6.printStackTrace();
		}
		org.jsonschema2pojo.rules.DescriptionRuleTest class12 = new org.jsonschema2pojo.rules.DescriptionRuleTest();
		try {
			class12.applyAddsDescriptionToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err7) {
			err7.printStackTrace();
		}
		org.jsonschema2pojo.rules.EnumRuleTest class13 = new org.jsonschema2pojo.rules.EnumRuleTest();
		class13.wireUpConfig();
		class13.applyGeneratesUniqueEnumNamesForMultipleEnumNodesWithSameName();
		org.jsonschema2pojo.rules.SchemaRuleTest class14 = new org.jsonschema2pojo.rules.SchemaRuleTest();
		try {
			class14.refsToOtherSchemasAreLoaded();
		}
		catch (java.net.URISyntaxException err8) {
			err8.printStackTrace();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err9) {
			err9.printStackTrace();
		}
		try {
			class14.enumAsRootIsGeneratedCorrectly();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err10) {
			err10.printStackTrace();
		}
		try {
			class14.existingTypeIsUsedWhenTypeIsAlreadyGenerated();
		}
		catch (java.net.URISyntaxException err11) {
			err11.printStackTrace();
		}
		org.jsonschema2pojo.rules.MinimumMaximumRuleTest class15 = new org.jsonschema2pojo.rules.MinimumMaximumRuleTest(false,null);
		class15.setUp();
		class15.testMinimum();
		class15.testMaximum();
		class15.testMaximumAndMinimum();
		class15.testNotUsed();
		class15.jsrDisable();
		org.jsonschema2pojo.rules.TitleRuleTest class16 = new org.jsonschema2pojo.rules.TitleRuleTest();
		try {
			class16.applyAddsDescriptionToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err12) {
			err12.printStackTrace();
		}
		org.jsonschema2pojo.rules.DynamicPropertiesRuleTest class17 = new org.jsonschema2pojo.rules.DynamicPropertiesRuleTest();
		try {
			class17.setUp();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err13) {
			err13.printStackTrace();
		}
		class17.shouldAddNotFoundField();
		org.jsonschema2pojo.rules.CommentRuleTest class18 = new org.jsonschema2pojo.rules.CommentRuleTest();
		try {
			class18.applyAddsCommentToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err14) {
			err14.printStackTrace();
		}
		org.jsonschema2pojo.rules.RequiredRuleTest class19 = new org.jsonschema2pojo.rules.RequiredRuleTest();
		try {
			class19.applyAddsTextWhenRequired();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err15) {
			err15.printStackTrace();
		}
		try {
			class19.applySkipsTextWhenNotRequired();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err16) {
			err16.printStackTrace();
		}
		org.jsonschema2pojo.rules.FormatRuleTest class20 = new org.jsonschema2pojo.rules.FormatRuleTest(null,null);
		class20.applyGeneratesTypeFromFormatValue();
		class20.applyDefaultsToBaseType();
		org.jsonschema2pojo.rules.FormatRulePrimitivesTest class21 = new org.jsonschema2pojo.rules.FormatRulePrimitivesTest(null,null);
		class21.usePrimitivesWithCustomTypeMapping();
	}
}