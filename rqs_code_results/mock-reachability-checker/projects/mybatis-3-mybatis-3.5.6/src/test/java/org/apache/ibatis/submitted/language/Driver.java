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
package org.apache.ibatis.submitted.language;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.language.LanguageTest class1 = new org.apache.ibatis.submitted.language.LanguageTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.testDynamicSelectWithPropertyParams();
		class1.testDynamicSelectWithExpressionParams();
		class1.testDynamicSelectWithIteration();
		class1.testLangRaw();
		class1.testLangRawWithInclude();
		class1.testLangRawWithIncludeAndCData();
		class1.testLangXmlTags();
		class1.testLangRawWithMapper();
		class1.testLangVelocityWithMapper();
		class1.testLangXmlWithMapper();
		class1.testLangXmlWithMapperAndSqlSymbols();
	}
}