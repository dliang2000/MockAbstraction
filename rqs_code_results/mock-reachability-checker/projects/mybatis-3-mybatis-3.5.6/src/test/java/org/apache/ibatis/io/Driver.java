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
package org.apache.ibatis.io;

public class Driver {
	public void runall() {
		org.apache.ibatis.io.ResourcesTest class1 = new org.apache.ibatis.io.ResourcesTest();
		try {
			class1.shouldGetUrlForResource();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldGetUrlAsProperties();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldGetResourceAsProperties();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldGetUrlAsStream();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.shouldGetUrlAsReader();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.shouldGetResourceAsStream();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.shouldGetResourceAsReader();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.shouldGetResourceAsFile();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.shouldGetResourceAsFileWithClassloader();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.shouldGetResourceAsPropertiesWithOutClassloader();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.shouldGetResourceAsPropertiesWithClassloader();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		class1.shouldAllowDefaultClassLoaderToBeSet();
		class1.shouldAllowDefaultCharsetToBeSet();
		try {
			class1.shouldGetClassForName();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		class1.shouldNotFindThisClass();
		try {
			class1.shouldGetReader();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class1.shouldGetReaderWithClassLoader();
		}
		catch (java.io.IOException err14) {
			err14.printStackTrace();
		}
		class1.stupidJustForCoverage();
		org.apache.ibatis.io.ClassLoaderWrapperTest class2 = new org.apache.ibatis.io.ClassLoaderWrapperTest();
		class2.beforeClassLoaderWrapperTest();
		try {
			class2.classForName();
		}
		catch (java.lang.ClassNotFoundException err15) {
			err15.printStackTrace();
		}
		class2.classForNameNotFound();
		try {
			class2.classForNameWithClassLoader();
		}
		catch (java.lang.ClassNotFoundException err16) {
			err16.printStackTrace();
		}
		class2.getResourceAsURL();
		class2.getResourceAsURLNotFound();
		class2.getResourceAsURLWithClassLoader();
		class2.getResourceAsStream();
		class2.getResourceAsStreamNotFound();
		class2.getResourceAsStreamWithClassLoader();
		org.apache.ibatis.io.ExternalResourcesTest class3 = new org.apache.ibatis.io.ExternalResourcesTest();
		try {
			class3.setUp();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		class3.testcopyExternalResource();
		class3.testcopyExternalResource_fileNotFound();
		class3.testcopyExternalResource_emptyStringAsFile();
		class3.testGetConfiguredTemplate();
		class3.cleanUp();
		org.apache.ibatis.io.ResolverUtilTest class4 = new org.apache.ibatis.io.ResolverUtilTest();
		class4.setUp();
		class4.getClasses();
		class4.getClassLoader();
		class4.setClassLoader();
		class4.findImplementationsWithNullPackageName();
		class4.findImplementations();
		class4.findAnnotatedWithNullPackageName();
		class4.findAnnotated();
		class4.find();
		class4.getPackagePath();
		class4.addIfMatching();
		class4.addIfNotMatching();
		class4.testToString();
		org.apache.ibatis.io.VFSTest class5 = new org.apache.ibatis.io.VFSTest();
		class5.getInstanceShouldNotBeNull();
		try {
			class5.getInstanceShouldNotBeNullInMultiThreadEnv();
		}
		catch (java.lang.InterruptedException err18) {
			err18.printStackTrace();
		}
		class5.getExistMethod();
		class5.getNotExistMethod();
		try {
			class5.invoke();
		}
		catch (java.io.IOException err19) {
			err19.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err20) {
			err20.printStackTrace();
		}
	}
}