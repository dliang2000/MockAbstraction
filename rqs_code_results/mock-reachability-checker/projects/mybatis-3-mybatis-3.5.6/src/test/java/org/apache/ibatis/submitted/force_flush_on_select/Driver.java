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
package org.apache.ibatis.submitted.force_flush_on_select;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.force_flush_on_select.ForceFlushOnSelectTest class1 = new org.apache.ibatis.submitted.force_flush_on_select.ForceFlushOnSelectTest();
		try {
			class1.initDatabase();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testShouldFlushLocalSessionCacheOnQuery();
		}
		catch (java.sql.SQLException err2) {
			err2.printStackTrace();
		}
		try {
			class1.testShouldNotFlushLocalSessionCacheOnQuery();
		}
		catch (java.sql.SQLException err3) {
			err3.printStackTrace();
		}
		try {
			class1.testShouldFlushLocalSessionCacheOnQueryForList();
		}
		catch (java.sql.SQLException err4) {
			err4.printStackTrace();
		}
		try {
			class1.testShouldNotFlushLocalSessionCacheOnQueryForList();
		}
		catch (java.sql.SQLException err5) {
			err5.printStackTrace();
		}
		class1.testUpdateShouldFlushLocalCache();
		try {
			class1.testSelectShouldFlushLocalCacheIfFlushLocalCacheAtferEachStatementIsTrue();
		}
		catch (java.sql.SQLException err6) {
			err6.printStackTrace();
		}
	}
}