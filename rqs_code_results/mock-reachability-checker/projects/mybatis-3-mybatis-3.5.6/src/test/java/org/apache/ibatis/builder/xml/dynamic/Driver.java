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
package org.apache.ibatis.builder.xml.dynamic;

public class Driver {
	public void runall() {
		org.apache.ibatis.builder.xml.dynamic.DynamicSqlSourceTest class1 = new org.apache.ibatis.builder.xml.dynamic.DynamicSqlSourceTest();
		try {
			class1.shouldDemonstrateSimpleExpectedTextWithNoLoopsOrConditionals();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldDemonstrateMultipartExpectedTextWithNoLoopsOrConditionals();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldConditionallyIncludeWhere();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldConditionallyExcludeWhere();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.shouldConditionallyDefault();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.shouldConditionallyChooseFirst();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.shouldConditionallyChooseSecond();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.shouldTrimWHEREInsteadOfANDForFirstCondition();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.shouldTrimWHEREANDWithLFForFirstCondition();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.shouldTrimWHEREANDWithCRLFForFirstCondition();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.shouldTrimWHEREANDWithTABForFirstCondition();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class1.shouldTrimWHEREORWithLFForFirstCondition();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class1.shouldTrimWHEREORWithCRLFForFirstCondition();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class1.shouldTrimWHEREORWithTABForFirstCondition();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class1.shouldTrimWHEREInsteadOfORForSecondCondition();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class1.shouldTrimWHEREInsteadOfANDForBothConditions();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class1.shouldTrimNoWhereClause();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class1.shouldTrimSETInsteadOfCOMMAForBothConditions();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class1.shouldTrimCommaAfterSET();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class1.shouldTrimNoSetClause();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class1.shouldIterateOnceForEachItemInCollection();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class1.shouldHandleOgnlExpression();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class1.shouldSkipForEachWhenCollectionIsEmpty();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class1.shouldPerformStrictMatchOnForEachVariableSubstitution();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		class1.shouldMapNullStringsToEmptyStrings();
		org.apache.ibatis.builder.xml.dynamic.ExpressionEvaluatorTest class2 = new org.apache.ibatis.builder.xml.dynamic.ExpressionEvaluatorTest();
		class2.shouldCompareStringsReturnTrue();
		class2.shouldCompareStringsReturnFalse();
		class2.shouldReturnTrueIfNotNull();
		class2.shouldReturnFalseIfNull();
		class2.shouldReturnTrueIfNotZero();
		class2.shouldReturnFalseIfZero();
		class2.shouldReturnFalseIfZeroWithScale();
		class2.shouldIterateOverIterable();
	}
}