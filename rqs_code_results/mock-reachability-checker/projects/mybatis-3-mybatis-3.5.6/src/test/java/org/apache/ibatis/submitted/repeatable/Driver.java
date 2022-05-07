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
package org.apache.ibatis.submitted.repeatable;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.repeatable.RepeatableDeleteTest class1 = new org.apache.ibatis.submitted.repeatable.RepeatableDeleteTest();
		try {
			class1.hsql();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		catch (java.sql.SQLException err2) {
			err2.printStackTrace();
		}
		try {
			class1.hsqlUsingProvider();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		catch (java.sql.SQLException err4) {
			err4.printStackTrace();
		}
		try {
			class1.derby();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		catch (java.sql.SQLException err6) {
			err6.printStackTrace();
		}
		try {
			class1.derbyUsingProvider();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		catch (java.sql.SQLException err8) {
			err8.printStackTrace();
		}
		try {
			class1.h2();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		catch (java.sql.SQLException err10) {
			err10.printStackTrace();
		}
		try {
			class1.h2UsingProvider();
		}
		catch (java.io.IOException err11) {
			err11.printStackTrace();
		}
		catch (java.sql.SQLException err12) {
			err12.printStackTrace();
		}
		org.apache.ibatis.submitted.repeatable.RepeatableInsertTest class2 = new org.apache.ibatis.submitted.repeatable.RepeatableInsertTest();
		try {
			class2.hsql();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		catch (java.sql.SQLException err14) {
			err14.printStackTrace();
		}
		try {
			class2.hsqlUsingProvider();
		}
		catch (java.io.IOException err15) {
			err15.printStackTrace();
		}
		catch (java.sql.SQLException err16) {
			err16.printStackTrace();
		}
		try {
			class2.derby();
		}
		catch (java.io.IOException err17) {
			err17.printStackTrace();
		}
		catch (java.sql.SQLException err18) {
			err18.printStackTrace();
		}
		try {
			class2.derbyUsingProvider();
		}
		catch (java.io.IOException err19) {
			err19.printStackTrace();
		}
		catch (java.sql.SQLException err20) {
			err20.printStackTrace();
		}
		try {
			class2.h2();
		}
		catch (java.io.IOException err21) {
			err21.printStackTrace();
		}
		catch (java.sql.SQLException err22) {
			err22.printStackTrace();
		}
		try {
			class2.h2UsingProvider();
		}
		catch (java.io.IOException err23) {
			err23.printStackTrace();
		}
		catch (java.sql.SQLException err24) {
			err24.printStackTrace();
		}
		org.apache.ibatis.submitted.repeatable.RepeatableUpdateTest class3 = new org.apache.ibatis.submitted.repeatable.RepeatableUpdateTest();
		try {
			class3.hsql();
		}
		catch (java.io.IOException err25) {
			err25.printStackTrace();
		}
		catch (java.sql.SQLException err26) {
			err26.printStackTrace();
		}
		try {
			class3.hsqlUsingProvider();
		}
		catch (java.io.IOException err27) {
			err27.printStackTrace();
		}
		catch (java.sql.SQLException err28) {
			err28.printStackTrace();
		}
		try {
			class3.derby();
		}
		catch (java.io.IOException err29) {
			err29.printStackTrace();
		}
		catch (java.sql.SQLException err30) {
			err30.printStackTrace();
		}
		try {
			class3.derbyUsingProvider();
		}
		catch (java.io.IOException err31) {
			err31.printStackTrace();
		}
		catch (java.sql.SQLException err32) {
			err32.printStackTrace();
		}
		try {
			class3.h2();
		}
		catch (java.io.IOException err33) {
			err33.printStackTrace();
		}
		catch (java.sql.SQLException err34) {
			err34.printStackTrace();
		}
		try {
			class3.h2UsingProvider();
		}
		catch (java.io.IOException err35) {
			err35.printStackTrace();
		}
		catch (java.sql.SQLException err36) {
			err36.printStackTrace();
		}
		org.apache.ibatis.submitted.repeatable.RepeatableErrorTest class4 = new org.apache.ibatis.submitted.repeatable.RepeatableErrorTest();
		try {
			class4.noSuchStatementByCurrentDatabase();
		}
		catch (java.io.IOException err37) {
			err37.printStackTrace();
		}
		try {
			class4.bothSpecifySelectAndSelectProvider();
		}
		catch (java.io.IOException err38) {
			err38.printStackTrace();
		}
		try {
			class4.bothSpecifySelectContainerAndSelectProviderContainer();
		}
		catch (java.io.IOException err39) {
			err39.printStackTrace();
		}
		org.apache.ibatis.submitted.repeatable.RepeatableSelectTest class5 = new org.apache.ibatis.submitted.repeatable.RepeatableSelectTest();
		try {
			class5.hsql();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		catch (java.sql.SQLException err41) {
			err41.printStackTrace();
		}
		try {
			class5.hsqlUsingProvider();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		catch (java.sql.SQLException err43) {
			err43.printStackTrace();
		}
		try {
			class5.derby();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		catch (java.sql.SQLException err45) {
			err45.printStackTrace();
		}
		try {
			class5.derbyUsingProvider();
		}
		catch (java.io.IOException err46) {
			err46.printStackTrace();
		}
		catch (java.sql.SQLException err47) {
			err47.printStackTrace();
		}
		try {
			class5.h2();
		}
		catch (java.io.IOException err48) {
			err48.printStackTrace();
		}
		catch (java.sql.SQLException err49) {
			err49.printStackTrace();
		}
		try {
			class5.h2UsingProvider();
		}
		catch (java.io.IOException err50) {
			err50.printStackTrace();
		}
		catch (java.sql.SQLException err51) {
			err51.printStackTrace();
		}
		try {
			class5.usingBoth();
		}
		catch (java.io.IOException err52) {
			err52.printStackTrace();
		}
		catch (java.sql.SQLException err53) {
			err53.printStackTrace();
		}
		try {
			class5.usingBothProvider();
		}
		catch (java.io.IOException err54) {
			err54.printStackTrace();
		}
		catch (java.sql.SQLException err55) {
			err55.printStackTrace();
		}
	}
}