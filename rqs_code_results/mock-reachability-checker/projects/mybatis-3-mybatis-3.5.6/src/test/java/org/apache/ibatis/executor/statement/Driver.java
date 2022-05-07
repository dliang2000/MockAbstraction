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
package org.apache.ibatis.executor.statement;

public class Driver {
	public void runall() {
		org.apache.ibatis.executor.statement.BaseStatementHandlerTest class1 = new org.apache.ibatis.executor.statement.BaseStatementHandlerTest();
		class1.setupMappedStatement();
		class1.resetMocks();
		try {
			class1.notSpecifyTimeout();
		}
		catch (java.sql.SQLException err1) {
			err1.printStackTrace();
		}
		try {
			class1.specifyMappedStatementTimeoutOnly();
		}
		catch (java.sql.SQLException err2) {
			err2.printStackTrace();
		}
		try {
			class1.specifyDefaultTimeoutOnly();
		}
		catch (java.sql.SQLException err3) {
			err3.printStackTrace();
		}
		try {
			class1.specifyTransactionTimeout();
		}
		catch (java.sql.SQLException err4) {
			err4.printStackTrace();
		}
		try {
			class1.specifyQueryTimeoutZeroAndTransactionTimeout();
		}
		catch (java.sql.SQLException err5) {
			err5.printStackTrace();
		}
		try {
			class1.specifyMappedStatementTimeoutAndDefaultTimeout();
		}
		catch (java.sql.SQLException err6) {
			err6.printStackTrace();
		}
		try {
			class1.specifyQueryTimeoutAndTransactionTimeoutMinIsQueryTimeout();
		}
		catch (java.sql.SQLException err7) {
			err7.printStackTrace();
		}
		try {
			class1.specifyQueryTimeoutAndTransactionTimeoutMinIsTransactionTimeout();
		}
		catch (java.sql.SQLException err8) {
			err8.printStackTrace();
		}
		try {
			class1.specifyQueryTimeoutAndTransactionTimeoutWithSameValue();
		}
		catch (java.sql.SQLException err9) {
			err9.printStackTrace();
		}
	}
}