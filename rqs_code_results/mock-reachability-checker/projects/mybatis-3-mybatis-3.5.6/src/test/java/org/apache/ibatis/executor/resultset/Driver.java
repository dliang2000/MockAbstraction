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
package org.apache.ibatis.executor.resultset;

public class Driver {
	public void runall() {
		org.apache.ibatis.executor.resultset.DefaultResultSetHandlerTest2 class1 = new org.apache.ibatis.executor.resultset.DefaultResultSetHandlerTest2();
		try {
			class1.shouldNotCallNextOnClosedResultSet_SimpleResult();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldNotCallNextOnClosedResultSet_NestedResult();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.apache.ibatis.executor.resultset.DefaultResultSetHandlerTest class2 = new org.apache.ibatis.executor.resultset.DefaultResultSetHandlerTest();
		try {
			class2.shouldRetainColumnNameCase();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.shouldThrowExceptionWithColumnName();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
	}
}