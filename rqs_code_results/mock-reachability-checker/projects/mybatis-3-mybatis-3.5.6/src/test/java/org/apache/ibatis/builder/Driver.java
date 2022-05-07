/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.builder;

public class Driver {
	public void runall() {
		org.apache.ibatis.builder.XmlConfigBuilderTest class1 = new org.apache.ibatis.builder.XmlConfigBuilderTest();
		try {
			class1.shouldSuccessfullyLoadMinimalXMLConfigFile();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.registerJavaTypeInitializingTypeHandler();
		try {
			class1.shouldSuccessfullyLoadXMLConfigFile();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldSuccessfullyLoadXMLConfigFileWithPropertiesUrl();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.parseIsTwice();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		class1.unknownSettings();
		class1.unknownJavaTypeOnTypeHandler();
		class1.propertiesSpecifyResourceAndUrlAtSameTime();
		org.apache.ibatis.builder.XmlMapperBuilderTest class2 = new org.apache.ibatis.builder.XmlMapperBuilderTest();
		try {
			class2.shouldSuccessfullyLoadXMLMapperFile();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.mappedStatementWithOptions();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.mappedStatementWithoutOptionsWhenSpecifyDefaultValue();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class2.parseExpression();
		class2.resolveJdbcTypeWithUndefinedValue();
		class2.resolveResultSetTypeWithUndefinedValue();
		class2.resolveParameterModeWithUndefinedValue();
		class2.createInstanceWithAbstractClass();
		class2.resolveClassWithNotFound();
		class2.resolveTypeHandlerTypeHandlerAliasIsNull();
		class2.resolveTypeHandlerNoAssignable();
		class2.setCurrentNamespaceValueIsNull();
		class2.useCacheRefNamespaceIsNull();
		class2.useCacheRefNamespaceIsUndefined();
		try {
			class2.shouldFailedLoadXMLMapperFile();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.erorrResultMapLocation();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		org.apache.ibatis.builder.SqlSourceBuilderTest class3 = new org.apache.ibatis.builder.SqlSourceBuilderTest();
		class3.setUp();
		class3.testShrinkWhitespacesInSqlIsFalse();
		class3.testShrinkWhitespacesInSqlIsTrue();
		org.apache.ibatis.builder.AnnotationMapperBuilderTest class4 = new org.apache.ibatis.builder.AnnotationMapperBuilderTest();
		class4.withOptions();
		class4.withOptionsAndWithoutOptionsAttributesWhenSpecifyDefaultValue();
		class4.withOptionsAndWithoutOptionsAttributesWhenNotSpecifyDefaultValue();
		class4.withoutOptionsWhenSpecifyDefaultValue();
		class4.withoutOptionsWhenNotSpecifyDefaultValue();
		org.apache.ibatis.builder.ParameterExpressionTest class5 = new org.apache.ibatis.builder.ParameterExpressionTest();
		class5.simpleProperty();
		class5.propertyWithSpacesInside();
		class5.simplePropertyWithOldStyleJdbcType();
		class5.oldStyleJdbcTypeWithExtraWhitespaces();
		class5.expressionWithOldStyleJdbcType();
		class5.simplePropertyWithOneAttribute();
		class5.expressionWithOneAttribute();
		class5.simplePropertyWithManyAttributes();
		class5.expressionWithManyAttributes();
		class5.simplePropertyWithOldStyleJdbcTypeAndAttributes();
		class5.simplePropertyWithSpaceAndManyAttributes();
		class5.shouldIgnoreLeadingAndTrailingSpaces();
		class5.invalidOldJdbcTypeFormat();
		class5.invalidJdbcTypeOptUsingExpression();
	}
}