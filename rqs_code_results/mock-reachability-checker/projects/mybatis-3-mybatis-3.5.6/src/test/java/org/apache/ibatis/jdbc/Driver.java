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
package org.apache.ibatis.jdbc;

public class Driver {
	public void runall() {
		org.apache.ibatis.jdbc.SQLTest class1 = new org.apache.ibatis.jdbc.SQLTest();
		class1.shouldDemonstrateProvidedStringBuilder();
		class1.shouldDemonstrateMixedStyle();
		class1.shouldDemonstrateFluentStyle();
		class1.shouldProduceExpectedSimpleSelectStatement();
		class1.shouldProduceExpectedSimpleSelectStatementMissingFirstParam();
		class1.shouldProduceExpectedSimpleSelectStatementMissingFirstTwoParams();
		class1.shouldProduceExpectedSimpleSelectStatementMissingAllParams();
		class1.shouldProduceExpectedComplexSelectStatement();
		class1.variableLengthArgumentOnSelect();
		class1.variableLengthArgumentOnSelectDistinct();
		class1.variableLengthArgumentOnFrom();
		class1.variableLengthArgumentOnJoin();
		class1.variableLengthArgumentOnInnerJoin();
		class1.variableLengthArgumentOnOuterJoin();
		class1.variableLengthArgumentOnLeftOuterJoin();
		class1.variableLengthArgumentOnRightOuterJoin();
		class1.variableLengthArgumentOnWhere();
		class1.variableLengthArgumentOnGroupBy();
		class1.variableLengthArgumentOnHaving();
		class1.variableLengthArgumentOnOrderBy();
		class1.variableLengthArgumentOnSet();
		class1.variableLengthArgumentOnIntoColumnsAndValues();
		class1.fixFor903UpdateJoins();
		class1.selectUsingLimitVariableName();
		class1.selectUsingOffsetVariableName();
		class1.selectUsingLimitAndOffset();
		class1.updateUsingLimit();
		class1.deleteUsingLimit();
		class1.selectUsingFetchFirstRowsOnlyVariableName();
		class1.selectUsingOffsetRowsVariableName();
		class1.selectUsingOffsetRowsAndFetchFirstRowsOnly();
		class1.supportBatchInsert();
		class1.singleInsert();
		class1.singleInsertWithMultipleInsertValues();
		class1.batchInsertWithMultipleInsertValues();
		class1.testValues();
		org.apache.ibatis.jdbc.SqlBuilderTest class2 = new org.apache.ibatis.jdbc.SqlBuilderTest();
		class2.shouldProduceExpectedSimpleSelectStatement();
		class2.shouldProduceExpectedSimpleSelectStatementMissingFirstParam();
		class2.shouldProduceExpectedSimpleSelectStatementMissingFirstTwoParams();
		class2.shouldProduceExpectedSimpleSelectStatementMissingAllParams();
		class2.shouldProduceExpectedComplexSelectStatement();
		org.apache.ibatis.jdbc.PooledDataSourceTest class3 = new org.apache.ibatis.jdbc.PooledDataSourceTest();
		try {
			class3.shouldProperlyMaintainPoolOf3ActiveAnd2IdleConnections();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class3.shouldNotFailCallingToStringOverAnInvalidConnection();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.ShouldReturnRealConnection();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.shouldReconnectWhenServerKilledLeakedConnection();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.apache.ibatis.jdbc.SelectBuilderTest class4 = new org.apache.ibatis.jdbc.SelectBuilderTest();
		class4.shouldProduceExpectedSimpleSelectStatement();
		class4.shouldProduceExpectedSimpleSelectStatementMissingFirstParam();
		class4.shouldProduceExpectedSimpleSelectStatementMissingFirstTwoParams();
		class4.shouldProduceExpectedSimpleSelectStatementMissingAllParams();
		class4.shouldProduceExpectedComplexSelectStatement();
		org.apache.ibatis.jdbc.SqlRunnerTest class5 = new org.apache.ibatis.jdbc.SqlRunnerTest();
		try {
			class5.shouldSelectOne();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class5.shouldSelectList();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class5.shouldInsert();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class5.shouldUpdateCategory();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class5.shouldDeleteOne();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class5.shouldDemonstrateDDLThroughRunMethod();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		org.apache.ibatis.jdbc.NullTest class6 = new org.apache.ibatis.jdbc.NullTest();
		class6.shouldGetTypeAndTypeHandlerForNullStringType();
		org.apache.ibatis.jdbc.ScriptRunnerTest class7 = new org.apache.ibatis.jdbc.ScriptRunnerTest();
		try {
			class7.shouldRunScriptsBySendingFullScriptAtOnce();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class7.shouldRunScriptsUsingConnection();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class7.shouldRunScriptsUsingProperties();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class7.shouldReturnWarningIfEndOfLineTerminatorNotFound();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class7.commentAferStatementDelimiterShouldNotCauseRunnerFail();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class7.shouldReturnWarningIfNotTheCurrentDelimiterUsed();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class7.changingDelimiterShouldNotCauseRunnerFail();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class7.testLogging();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class7.testLoggingFullScipt();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class7.shouldAcceptDelimiterVariations();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		class7.test();
		try {
			class7.shouldAcceptMultiCharDelimiter();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
	}
}