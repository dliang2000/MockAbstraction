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
package org.apache.ibatis.submitted.sqlprovider;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.sqlprovider.ProviderMethodResolutionTest class1 = new org.apache.ibatis.submitted.sqlprovider.ProviderMethodResolutionTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldResolveWhenDefaultResolverMatchedMethodIsOne();
		class1.shouldErrorWhenDefaultResolverMethodNameMatchedMethodIsNone();
		class1.shouldErrorWhenDefaultResolverReturnTypeMatchedMethodIsNone();
		class1.shouldErrorWhenDefaultResolverMatchedMethodIsMultiple();
		class1.shouldResolveReservedMethod();
		class1.shouldUseSpecifiedMethodOnSqlProviderAnnotation();
		class1.shouldResolveMethodUsingCustomResolver();
		class1.shouldResolveReservedNameMethodWhenCustomResolverReturnNull();
		class1.shouldErrorWhenCannotDetectsReservedNameMethod();
		org.apache.ibatis.submitted.sqlprovider.SqlProviderTest class2 = new org.apache.ibatis.submitted.sqlprovider.SqlProviderTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class2.shouldGetTwoUsers();
		class2.shouldGetOneUser();
		class2.shouldGetAllUsers();
		class2.shouldGetUsersByCriteria();
		class2.shouldGetUsersByCriteriaMap();
		class2.shouldGetUsersByCriteriaMapWithParam();
		class2.shouldGetUsersByName();
		class2.shouldGetUsersByNameUsingMap();
		class2.shouldGetUsersByNameWithParamNameAndOrderBy();
		class2.shouldGetUsersByNameWithParamNameUsingMap();
		class2.shouldGetUsersByNameWithParamName();
		try {
			class2.methodNotFound();
		}
		catch (java.lang.NoSuchMethodException err3) {
			err3.printStackTrace();
		}
		try {
			class2.methodOverload();
		}
		catch (java.lang.NoSuchMethodException err4) {
			err4.printStackTrace();
		}
		try {
			class2.notSqlProvider();
		}
		catch (java.lang.NoSuchMethodException err5) {
			err5.printStackTrace();
		}
		try {
			class2.omitType();
		}
		catch (java.lang.NoSuchMethodException err6) {
			err6.printStackTrace();
		}
		try {
			class2.differentTypeAndValue();
		}
		catch (java.lang.NoSuchMethodException err7) {
			err7.printStackTrace();
		}
		try {
			class2.multipleProviderContext();
		}
		catch (java.lang.NoSuchMethodException err8) {
			err8.printStackTrace();
		}
		try {
			class2.notSupportParameterObjectOnMultipleArguments();
		}
		catch (java.lang.NoSuchMethodException err9) {
			err9.printStackTrace();
		}
		try {
			class2.notSupportParameterObjectOnNamedArgument();
		}
		catch (java.lang.NoSuchMethodException err10) {
			err10.printStackTrace();
		}
		try {
			class2.invokeError();
		}
		catch (java.lang.NoSuchMethodException err11) {
			err11.printStackTrace();
		}
		try {
			class2.invokeNestedError();
		}
		catch (java.lang.NoSuchMethodException err12) {
			err12.printStackTrace();
		}
		try {
			class2.invalidArgumentsCombination();
		}
		catch (java.lang.NoSuchMethodException err13) {
			err13.printStackTrace();
		}
		class2.shouldInsertUser();
		class2.shouldUpdateUser();
		class2.shouldDeleteUser();
		class2.mapperProviderContextOnly();
		class2.mapperOneParamAndProviderContext();
		class2.mapperMultipleParamAndProviderContextWithAtParam();
		class2.mapperMultipleParamAndProviderContext();
		class2.staticMethodNoArgument();
		class2.staticMethodOneArgument();
		class2.staticMethodOnePrimitiveByteArgument();
		class2.staticMethodOnePrimitiveShortArgument();
		class2.staticMethodOnePrimitiveIntArgument();
		class2.staticMethodOnePrimitiveLongArgument();
		class2.staticMethodOnePrimitiveFloatArgument();
		class2.staticMethodOnePrimitiveDoubleArgument();
		class2.staticMethodOnePrimitiveBooleanArgument();
		class2.staticMethodOnePrimitiveCharArgument();
		class2.boxing();
		class2.unboxing();
		class2.staticMethodMultipleArgument();
		class2.staticMethodOnlyProviderContext();
		class2.staticMethodOneArgumentAndProviderContext();
		class2.mapAndProviderContext();
		class2.multipleMap();
		class2.providerContextAndMap();
		try {
			class2.keepBackwardCompatibilityOnDeprecatedConstructorWithAnnotation();
		}
		catch (java.lang.NoSuchMethodException err14) {
			err14.printStackTrace();
		}
		try {
			class2.omitTypeWhenSpecifyDefaultType();
		}
		catch (java.lang.NoSuchMethodException err15) {
			err15.printStackTrace();
		}
		class2.shouldInsertUserSelective();
		class2.shouldUpdateUserSelective();
		class2.mapperGetByEntity();
		class2.shouldPassedDatabaseIdToProviderMethod();
	}
}