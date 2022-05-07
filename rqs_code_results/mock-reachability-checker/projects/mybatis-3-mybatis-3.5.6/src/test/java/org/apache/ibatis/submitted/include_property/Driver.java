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
package org.apache.ibatis.submitted.include_property;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.include_property.IncludePropertyErrorTest class1 = new org.apache.ibatis.submitted.include_property.IncludePropertyErrorTest();
		class1.shouldFailForDuplicatedPropertyNames();
		org.apache.ibatis.submitted.include_property.IncludePropertyTest class2 = new org.apache.ibatis.submitted.include_property.IncludePropertyTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class2.testSimpleProperty();
		class2.testPropertyContext();
		class2.testNestedDynamicValue();
		class2.testEmptyString();
		class2.testPropertyInRefid();
		class2.testConfigVar();
		class2.testRuntimeVar();
		class2.testNestedInclude();
		class2.testParametersInAttribute();
	}
}