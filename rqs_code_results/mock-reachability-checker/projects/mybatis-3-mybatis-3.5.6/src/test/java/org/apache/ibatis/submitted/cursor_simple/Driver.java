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
package org.apache.ibatis.submitted.cursor_simple;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.cursor_simple.PostgresCursorTest class1 = new org.apache.ibatis.submitted.cursor_simple.PostgresCursorTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldBeAbleToReuseStatement();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		org.apache.ibatis.submitted.cursor_simple.CursorSimpleTest class2 = new org.apache.ibatis.submitted.cursor_simple.CursorSimpleTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class2.shouldGetAllUser();
		class2.testCursorClosedOnSessionClose();
		class2.testCursorWithRowBound();
		try {
			class2.testCursorIteratorNoSuchElementExceptionWithHasNext();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		try {
			class2.testCursorIteratorNoSuchElementExceptionNoHasNext();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		class2.testCursorWithBadRowBound();
		class2.testCursorMultipleHasNextCall();
		class2.testCursorMultipleIteratorCall();
		try {
			class2.testCursorMultipleCloseCall();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class2.testCursorUsageAfterClose();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		class2.shouldGetAllUserUsingAnnotationBasedMapper();
		class2.shouldThrowIllegalStateExceptionUsingIteratorOnSessionClosed();
		class2.shouldNullItemNotStopIteration();
		class2.shouldRowBoundsCountNullItem();
		org.apache.ibatis.submitted.cursor_simple.MysqlCursorTest class3 = new org.apache.ibatis.submitted.cursor_simple.MysqlCursorTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.testMySqlStreamResultSet();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		try {
			class3.testMySqlStreamResultSetBatch();
		}
		catch (java.io.IOException err10) {
			err10.printStackTrace();
		}
	}
}