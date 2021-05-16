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
		org.jsonschema2pojo.rules.RequiredArrayRuleTest class3 = new org.jsonschema2pojo.rules.RequiredArrayRuleTest();
		try {
			class3.shouldUpdateJavaDoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err4) {
			err4.printStackTrace();
		}
		try {
			class3.shouldUpdateAnnotations();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err5) {
			err5.printStackTrace();
		}
		org.jsonschema2pojo.rules.EnumRuleTest class4 = new org.jsonschema2pojo.rules.EnumRuleTest();
		class4.wireUpConfig();
		class4.applyGeneratesUniqueEnumNamesForMultipleEnumNodesWithSameName();
		org.jsonschema2pojo.rules.TitleRuleTest class5 = new org.jsonschema2pojo.rules.TitleRuleTest();
		try {
			class5.applyAddsDescriptionToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err6) {
			err6.printStackTrace();
		}
		org.jsonschema2pojo.rules.SchemaRuleTest class6 = new org.jsonschema2pojo.rules.SchemaRuleTest();
		try {
			class6.refsToOtherSchemasAreLoaded();
		}
		catch (java.net.URISyntaxException err7) {
			err7.printStackTrace();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err8) {
			err8.printStackTrace();
		}
		try {
			class6.enumAsRootIsGeneratedCorrectly();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err9) {
			err9.printStackTrace();
		}
		try {
			class6.existingTypeIsUsedWhenTypeIsAlreadyGenerated();
		}
		catch (java.net.URISyntaxException err10) {
			err10.printStackTrace();
		}
		org.jsonschema2pojo.rules.PropertyRuleTest class7 = new org.jsonschema2pojo.rules.PropertyRuleTest();
		class7.setup();
		try {
			class7.applyRequiredByTopArray();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err11) {
			err11.printStackTrace();
		}
		try {
			class7.applyNotRequiredByTopArray();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err12) {
			err12.printStackTrace();
		}
		try {
			class7.applyRequiredByFlag();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err13) {
			err13.printStackTrace();
		}
		try {
			class7.applyNotRequiredByFlag();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err14) {
			err14.printStackTrace();
		}
		org.jsonschema2pojo.rules.TypeRuleTest class8 = new org.jsonschema2pojo.rules.TypeRuleTest();
		class8.wireUpConfig();
		class8.applyGeneratesString();
		class8.applyGeneratesDate();
		class8.applyGeneratesInteger();
		class8.applyGeneratesIntegerPrimitive();
		class8.applyGeneratesIntegerUsingJavaTypeIntegerPrimitive();
		class8.applyGeneratesBigInteger();
		class8.applyGeneratesBigIntegerOverridingLong();
		class8.applyGeneratesBigDecimal();
		class8.applyGeneratesBigDecimalOverridingDouble();
		class8.applyGeneratesIntegerUsingJavaTypeInteger();
		class8.applyGeneratesIntegerUsingJavaTypeLongPrimitive();
		class8.applyGeneratesIntegerUsingJavaTypeLong();
		class8.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMaximumGreaterThanIntegerMax();
		class8.applyGeneratesIntegerUsingJavaTypeLongWhenMaximumGreaterThanIntegerMax();
		class8.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMaximumLessThanIntegerMin();
		class8.applyGeneratesIntegerUsingJavaTypeLongWhenMaximumLessThanIntegerMin();
		class8.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMinimumLessThanIntegerMin();
		class8.applyGeneratesIntegerUsingJavaTypeLongWhenMinimumLessThanIntegerMin();
		class8.applyGeneratesIntegerUsingJavaTypeLongPrimitiveWhenMinimumGreaterThanIntegerMax();
		class8.applyGeneratesIntegerUsingJavaTypeLongWhenMinimumGreaterThanIntegerMax();
		class8.applyGeneratesIntegerUsingJavaTypeBigInteger();
		class8.applyGeneratesNumber();
		class8.applyGeneratesNumberPrimitive();
		class8.applyGeneratesNumberUsingJavaTypeFloatPrimitive();
		class8.applyGeneratesNumberUsingJavaTypeFloat();
		class8.applyGeneratesNumberUsingJavaTypeDoublePrimitive();
		class8.applyGeneratesNumberUsingJavaTypeDouble();
		class8.applyGeneratesNumberUsingJavaTypeBigDecimal();
		class8.applyGeneratesBoolean();
		class8.applyGeneratesBooleanPrimitive();
		class8.applyGeneratesAnyAsObject();
		class8.applyGeneratesNullAsObject();
		class8.applyGeneratesArray();
		class8.applyGeneratesCustomObject();
		class8.applyChoosesObjectOnUnrecognizedType();
		class8.applyDefaultsToTypeAnyObject();
		org.jsonschema2pojo.rules.DescriptionRuleTest class9 = new org.jsonschema2pojo.rules.DescriptionRuleTest();
		try {
			class9.applyAddsDescriptionToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err15) {
			err15.printStackTrace();
		}
		org.jsonschema2pojo.rules.ArrayRuleTest class10 = new org.jsonschema2pojo.rules.ArrayRuleTest();
		class10.arrayWithUniqueItemsProducesSet();
		class10.arrayWithNonUniqueItemsProducesList();
		class10.arrayOfPrimitivesProducesCollectionOfWrapperTypes();
		class10.arrayDefaultsToNonUnique();
		org.jsonschema2pojo.rules.CommentRuleTest class11 = new org.jsonschema2pojo.rules.CommentRuleTest();
		try {
			class11.applyAddsCommentToJavadoc();
		}
		catch (com.sun.codemodel.JClassAlreadyExistsException err16) {
			err16.printStackTrace();
		}
		org.jsonschema2pojo.rules.RuleFactoryImplTest class12 = new org.jsonschema2pojo.rules.RuleFactoryImplTest();
		class12.factoryMethodsCreateRules();
		class12.generationConfigIsReturned();
		class12.generationRuleLoggerIsReturned();
		class12.schemaStoreIsReturned();
	}
}