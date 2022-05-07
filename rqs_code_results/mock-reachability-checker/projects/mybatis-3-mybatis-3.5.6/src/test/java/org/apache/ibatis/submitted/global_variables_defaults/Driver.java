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
package org.apache.ibatis.submitted.global_variables_defaults;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.global_variables_defaults.CustomizationTest class1 = new org.apache.ibatis.submitted.global_variables_defaults.CustomizationTest();
		try {
			class1.applyDefaultValueWhenCustomizeDefaultValueSeparator();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		try {
			class1.applyPropertyValueWhenCustomizeDefaultValueSeparator();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		org.apache.ibatis.submitted.global_variables_defaults.AnnotationMapperTest class2 = new org.apache.ibatis.submitted.global_variables_defaults.AnnotationMapperTest();
		try {
			class2.applyDefaultValueOnAnnotationMapper();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		try {
			class2.applyPropertyValueOnAnnotationMapper();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		org.apache.ibatis.submitted.global_variables_defaults.XmlMapperTest class3 = new org.apache.ibatis.submitted.global_variables_defaults.XmlMapperTest();
		try {
			class3.applyDefaultValueOnXmlMapper();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		try {
			class3.applyPropertyValueOnXmlMapper();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		org.apache.ibatis.submitted.global_variables_defaults.ConfigurationTest class4 = new org.apache.ibatis.submitted.global_variables_defaults.ConfigurationTest();
		try {
			class4.applyDefaultValueOnXmlConfiguration();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		try {
			class4.applyPropertyValueOnXmlConfiguration();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
	}
}