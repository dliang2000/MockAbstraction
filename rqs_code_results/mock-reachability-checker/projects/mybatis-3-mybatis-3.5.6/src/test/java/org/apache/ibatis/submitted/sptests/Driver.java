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
package org.apache.ibatis.submitted.sptests;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.sptests.SPTest class1 = new org.apache.ibatis.submitted.sptests.SPTest();
		try {
			class1.initDatabase();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.testAdderAsSelect();
		class1.testAdderAsSelectDoubleCall1();
		class1.testAdderAsSelectDoubleCall2();
		class1.testAdderAsUpdate();
		class1.testEchoDate();
		class1.testAdderAsUpdateWithParameterMap();
		class1.testCallWithResultSet1();
		class1.testCallWithResultSet2();
		class1.testCallWithResultSet3();
		class1.testCallWithResultSet4();
		try {
			class1.testGetNamesWithArray();
		}
		catch (java.sql.SQLException err2) {
			err2.printStackTrace();
		}
		class1.testGetNamesAndItems();
		class1.testAdderAsSelectAnnotated();
		class1.testAdderAsSelectDoubleCallAnnotated1();
		class1.testAdderAsSelectDoubleCallAnnotated2();
		class1.testAdderAsUpdateAnnotated();
		class1.testCallWithResultSet1Annotated();
		class1.testCallWithResultSet1_a2();
		class1.testCallWithResultSet2_a1();
		class1.testCallWithResultSet2_a2();
		class1.testCallWithResultSet3_a1();
		class1.testCallWithResultSet3_a2();
		class1.testCallWithResultSet4_a1();
		class1.testCallWithResultSet4_a2();
		class1.testCallLowHighWithResultSet();
		try {
			class1.testGetNamesWithArray_a1();
		}
		catch (java.sql.SQLException err3) {
			err3.printStackTrace();
		}
		try {
			class1.testGetNamesWithArray_a2();
		}
		catch (java.sql.SQLException err4) {
			err4.printStackTrace();
		}
		class1.testGetNamesAndItems_a2();
		class1.testGetNamesAndItems_a3();
		class1.testGetNamesAndItemsLinked();
		class1.testGetNamesAndItemsLinkedWithNoMatchingInfo();
		class1.testMultipleForeignKeys();
	}
}