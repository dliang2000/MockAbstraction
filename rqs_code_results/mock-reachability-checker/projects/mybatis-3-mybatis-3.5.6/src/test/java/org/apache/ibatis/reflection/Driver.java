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
package org.apache.ibatis.reflection;

public class Driver {
	public void runall() {
		org.apache.ibatis.reflection.MetaObjectTest class1 = new org.apache.ibatis.reflection.MetaObjectTest();
		class1.shouldGetAndSetField();
		class1.shouldGetAndSetNestedField();
		class1.shouldGetAndSetProperty();
		class1.shouldGetAndSetNestedProperty();
		class1.shouldGetAndSetMapPair();
		class1.shouldGetAndSetMapPairUsingArraySyntax();
		class1.shouldGetAndSetNestedMapPair();
		class1.shouldGetAndSetNestedMapPairUsingArraySyntax();
		class1.shouldGetAndSetListItem();
		class1.shouldSetAndGetSelfListItem();
		class1.shouldGetAndSetNestedListItem();
		class1.shouldGetReadablePropertyNames();
		class1.shouldGetWriteablePropertyNames();
		class1.shouldSetPropertyOfNullNestedProperty();
		class1.shouldSetPropertyOfNullNestedPropertyWithNull();
		class1.shouldGetPropertyOfNullNestedProperty();
		class1.shouldVerifyHasReadablePropertiesReturnedByGetReadablePropertyNames();
		class1.shouldVerifyHasWriteablePropertiesReturnedByGetWriteablePropertyNames();
		class1.shouldSetAndGetProperties();
		class1.shouldVerifyPropertyTypes();
		class1.shouldDemonstrateDeeplyNestedMapProperties();
		class1.shouldDemonstrateNullValueInMap();
		class1.shouldNotUseObjectWrapperFactoryByDefault();
		class1.shouldUseObjectWrapperFactoryWhenSet();
		class1.shouldMethodHasGetterReturnTrueWhenListElementSet();
		org.apache.ibatis.reflection.TypeParameterResolverTest class2 = new org.apache.ibatis.reflection.TypeParameterResolverTest();
		try {
			class2.testReturn_Lv0SimpleClass();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.testReturn_SimpleVoid();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testReturn_SimplePrimitive();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testReturn_SimpleClass();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.testReturn_SimpleList();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.testReturn_SimpleMap();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.testReturn_SimpleWildcard();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.testReturn_SimpleArray();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.testReturn_SimpleArrayOfArray();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class2.testReturn_SimpleTypeVar();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class2.testReturn_Lv1Class();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class2.testReturn_Lv2CustomClass();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class2.testReturn_Lv2CustomClassList();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class2.testReturn_Lv0InnerClass();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class2.testReturn_Lv2Class();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class2.testReturn_Lv1List();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class2.testReturn_Lv1Array();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class2.testReturn_Lv2ArrayOfArray();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class2.testReturn_Lv2ArrayOfList();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class2.testReturn_Lv2WildcardList();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class2.testReturn_LV2Map();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class2.testReturn_Subclass();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class2.testParam_Primitive();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class2.testParam_Simple();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class2.testParam_Lv1Single();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class2.testParam_Lv2Single();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class2.testParam_Lv2Multiple();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class2.testParam_Lv2CustomClass();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class2.testParam_Lv1Array();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class2.testParam_Subclass();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class2.testReturn_Anonymous();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class2.testField_GenericField();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class2.testReturnParam_WildcardWithUpperBounds();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class2.testDeepHierarchy();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class2.shouldTypeVariablesBeComparedWithEquals();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		org.apache.ibatis.reflection.ArrayUtilTest class3 = new org.apache.ibatis.reflection.ArrayUtilTest();
		class3.testHashCode();
		class3.testequals();
		class3.testToString();
		org.apache.ibatis.reflection.MetaClassTest class4 = new org.apache.ibatis.reflection.MetaClassTest();
		class4.shouldTestDataTypeOfGenericMethod();
		class4.shouldThrowReflectionExceptionGetGetterType();
		class4.shouldCheckGetterExistance();
		class4.shouldCheckSetterExistance();
		class4.shouldCheckTypeForEachGetter();
		class4.shouldCheckTypeForEachSetter();
		class4.shouldCheckGetterAndSetterNames();
		class4.shouldFindPropertyName();
		org.apache.ibatis.reflection.ExceptionUtilTest class5 = new org.apache.ibatis.reflection.ExceptionUtilTest();
		class5.shouldUnwrapThrowable();
		org.apache.ibatis.reflection.ReflectorTest class6 = new org.apache.ibatis.reflection.ReflectorTest();
		class6.testGetSetterType();
		class6.testGetGetterType();
		class6.shouldNotGetClass();
		class6.shouldResolveSetterParam();
		class6.shouldResolveParameterizedSetterParam();
		class6.shouldResolveArraySetterParam();
		class6.shouldResolveGetterType();
		class6.shouldResolveSetterTypeFromPrivateField();
		class6.shouldResolveGetterTypeFromPublicField();
		class6.shouldResolveParameterizedGetterType();
		class6.shouldResolveArrayGetterType();
		class6.shouldResoleveReadonlySetterWithOverload();
		try {
			class6.shouldSettersWithUnrelatedArgTypesThrowException();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class6.shouldTwoGettersForNonBooleanPropertyThrowException();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class6.shouldTwoGettersWithDifferentTypesThrowException();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class6.shouldAllowTwoBooleanGetters();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class6.shouldIgnoreBestMatchSetterIfGetterIsAmbiguous();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
	}
}