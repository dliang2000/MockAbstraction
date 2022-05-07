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
package org.apache.ibatis.logging.jdbc;

public class Driver {
	public void runall() {
		org.apache.ibatis.logging.jdbc.ConnectionLoggerTest class1 = new org.apache.ibatis.logging.jdbc.ConnectionLoggerTest();
		try {
			class1.setUp();
		}
		catch (java.sql.SQLException err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldPrintPrepareStatement();
		}
		catch (java.sql.SQLException err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldPrintPrepareCall();
		}
		catch (java.sql.SQLException err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldNotPrintCreateStatement();
		}
		catch (java.sql.SQLException err4) {
			err4.printStackTrace();
		}
		org.apache.ibatis.logging.jdbc.PreparedStatementLoggerTest class2 = new org.apache.ibatis.logging.jdbc.PreparedStatementLoggerTest();
		try {
			class2.setUp();
		}
		catch (java.sql.SQLException err5) {
			err5.printStackTrace();
		}
		try {
			class2.shouldPrintParameters();
		}
		catch (java.sql.SQLException err6) {
			err6.printStackTrace();
		}
		try {
			class2.shouldPrintNullParameters();
		}
		catch (java.sql.SQLException err7) {
			err7.printStackTrace();
		}
		try {
			class2.shouldNotPrintLog();
		}
		catch (java.sql.SQLException err8) {
			err8.printStackTrace();
		}
		try {
			class2.shouldPrintUpdateCount();
		}
		catch (java.sql.SQLException err9) {
			err9.printStackTrace();
		}
		org.apache.ibatis.logging.jdbc.ResultSetLoggerTest class3 = new org.apache.ibatis.logging.jdbc.ResultSetLoggerTest();
		try {
			class3.shouldNotPrintBlobs();
		}
		catch (java.sql.SQLException err10) {
			err10.printStackTrace();
		}
		try {
			class3.shouldPrintVarchars();
		}
		catch (java.sql.SQLException err11) {
			err11.printStackTrace();
		}
		org.apache.ibatis.logging.jdbc.BaseJdbcLoggerTest class4 = new org.apache.ibatis.logging.jdbc.BaseJdbcLoggerTest();
		class4.setUp();
		try {
			class4.shouldDescribePrimitiveArrayParameter();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class4.shouldDescribeObjectArrayParameter();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		org.apache.ibatis.logging.jdbc.StatementLoggerTest class5 = new org.apache.ibatis.logging.jdbc.StatementLoggerTest();
		try {
			class5.setUp();
		}
		catch (java.sql.SQLException err14) {
			err14.printStackTrace();
		}
		try {
			class5.shouldPrintLog();
		}
		catch (java.sql.SQLException err15) {
			err15.printStackTrace();
		}
		try {
			class5.shouldPrintLogForUpdate();
		}
		catch (java.sql.SQLException err16) {
			err16.printStackTrace();
		}
		try {
			class5.shouldNotPrintLog();
		}
		catch (java.sql.SQLException err17) {
			err17.printStackTrace();
		}
	}
}