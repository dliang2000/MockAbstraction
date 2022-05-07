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
package org.apache.ibatis.submitted.selectkey;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.selectkey.SelectKeyTest class1 = new org.apache.ibatis.submitted.selectkey.SelectKeyTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testSelectKey();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class1.testInsertTable1();
		class1.testInsertTable2();
		class1.testSeleckKeyReturnsNoData();
		class1.testSeleckKeyReturnsTooManyData();
		class1.testAnnotatedInsertTable2();
		class1.testAnnotatedInsertTable2WithGeneratedKey();
		class1.testAnnotatedUpdateTable2WithGeneratedKey();
		class1.testAnnotatedUpdateTable2WithGeneratedKeyXml();
		class1.testAnnotatedInsertTable2WithGeneratedKeyXml();
		class1.testAnnotatedInsertTable2WithSelectKeyWithKeyMap();
		class1.testAnnotatedUpdateTable2WithSelectKeyWithKeyMap();
		class1.testAnnotatedInsertTable2WithSelectKeyWithKeyMapXml();
		class1.testAnnotatedUpdateTable2WithSelectKeyWithKeyMapXml();
		class1.testAnnotatedInsertTable2WithSelectKeyWithKeyObject();
		class1.testAnnotatedUpdateTable2WithSelectKeyWithKeyObject();
		class1.testAnnotatedUpdateTable2WithSelectKeyWithKeyObjectXml();
		class1.testAnnotatedInsertTable2WithSelectKeyWithKeyObjectXml();
		class1.testAnnotatedInsertTable3();
		class1.testAnnotatedInsertTable3_2();
		class1.testSeleckKeyWithWrongKeyProperty();
	}
}