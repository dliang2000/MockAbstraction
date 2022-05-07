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
package org.apache.ibatis.parsing;

public class Driver {
	public void runall() {
		org.apache.ibatis.parsing.PropertyParserTest class1 = new org.apache.ibatis.parsing.PropertyParserTest();
		class1.replaceToVariableValue();
		class1.notReplace();
		class1.applyDefaultValue();
		class1.applyCustomSeparator();
		org.apache.ibatis.parsing.XPathParserTest class2 = new org.apache.ibatis.parsing.XPathParserTest();
		try {
			class2.constructorWithInputStreamValidationVariablesEntityResolver();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.constructorWithInputStreamValidationVariables();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		try {
			class2.constructorWithInputStreamValidation();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		try {
			class2.constructorWithInputStream();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		try {
			class2.constructorWithReaderValidationVariablesEntityResolver();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.constructorWithReaderValidationVariables();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class2.constructorWithReaderValidation();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		try {
			class2.constructorWithReader();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class2.constructorWithStringValidationVariablesEntityResolver();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class2.constructorWithStringValidationVariables();
		}
		catch (java.io.IOException err10) {
			err10.printStackTrace();
		}
		try {
			class2.constructorWithStringValidation();
		}
		catch (java.io.IOException err11) {
			err11.printStackTrace();
		}
		try {
			class2.constructorWithString();
		}
		catch (java.io.IOException err12) {
			err12.printStackTrace();
		}
		class2.constructorWithDocumentValidationVariablesEntityResolver();
		class2.constructorWithDocumentValidationVariables();
		class2.constructorWithDocumentValidation();
		class2.constructorWithDocument();
		class2.formatXNodeToString();
		org.apache.ibatis.parsing.GenericTokenParserTest class3 = new org.apache.ibatis.parsing.GenericTokenParserTest();
		class3.shouldDemonstrateGenericTokenReplacement();
		class3.shallNotInterpolateSkippedVaiables();
		class3.shouldParseFastOnJdk7u6();
	}
}