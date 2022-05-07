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
package org.apache.ibatis.submitted.xml_external_ref;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.xml_external_ref.MultipleIncludeTest class1 = new org.apache.ibatis.submitted.xml_external_ref.MultipleIncludeTest();
		try {
			class1.testMultipleIncludeXmlConfig();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testMultipleIncludeJavaConfig();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.ParameterMapReferenceTest class2 = new org.apache.ibatis.submitted.xml_external_ref.ParameterMapReferenceTest();
		try {
			class2.testCrossReferenceXmlConfig();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testCrossReferenceJavaConfig();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.ReverseIncludeTest class3 = new org.apache.ibatis.submitted.xml_external_ref.ReverseIncludeTest();
		try {
			class3.testReverseIncludeXmlConfig();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class3.testReverseIncludeJavaConfig();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.ShortNameTest class4 = new org.apache.ibatis.submitted.xml_external_ref.ShortNameTest();
		try {
			class4.getStatementByShortName();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class4.ambiguousShortNameShouldFail();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.ResultMapExtendsTest class5 = new org.apache.ibatis.submitted.xml_external_ref.ResultMapExtendsTest();
		try {
			class5.testExternalExtendsXmlConfig();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class5.testExternalExtendsJavaConfig();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.MultipleCrossIncludeTest class6 = new org.apache.ibatis.submitted.xml_external_ref.MultipleCrossIncludeTest();
		try {
			class6.testMultipleCrossIncludeXmlConfig();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class6.testMultipleCrossIncludeJavaConfig();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class6.testMappedStatementCache();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.NonFullyQualifiedNamespaceTest class7 = new org.apache.ibatis.submitted.xml_external_ref.NonFullyQualifiedNamespaceTest();
		try {
			class7.testCrossReferenceXmlConfig();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.ResultMapReferenceTest class8 = new org.apache.ibatis.submitted.xml_external_ref.ResultMapReferenceTest();
		try {
			class8.testCrossReferenceXmlConfig();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class8.testCrossReferenceJavaConfig();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.XmlExternalRefTest class9 = new org.apache.ibatis.submitted.xml_external_ref.XmlExternalRefTest();
		try {
			class9.testCrossReferenceXmlConfig();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class9.testCrossReferenceJavaConfig();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		class9.testFailFastOnBuildAll();
		class9.testFailFastOnBuildAllWithInsert();
		try {
			class9.testMappedStatementCache();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.MultipleReverseIncludeTest class10 = new org.apache.ibatis.submitted.xml_external_ref.MultipleReverseIncludeTest();
		try {
			class10.testMultipleReverseIncludeXmlConfig();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class10.testMultipleReverseIncludeJavaConfig();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		org.apache.ibatis.submitted.xml_external_ref.SameIdTest class11 = new org.apache.ibatis.submitted.xml_external_ref.SameIdTest();
		try {
			class11.testCrossReferenceXmlConfig();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class11.testCrossReferenceJavaConfig();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
	}
}