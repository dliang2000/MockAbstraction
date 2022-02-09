/**
 * Copyright © 2010-2020 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jsonschema2pojo.util;

public class Driver {
	public void runall() {
		org.jsonschema2pojo.util.TypeUtilTest class1 = new org.jsonschema2pojo.util.TypeUtilTest();
		class1.testResolveTypeCanHandleWildcard();
		class1.testResolveTypeCanHandleExtendsWildcard();
		class1.testResolveTypeForSuperWildcardThrowsException();
		org.jsonschema2pojo.util.LanguageFeaturesTest class2 = new org.jsonschema2pojo.util.LanguageFeaturesTest(null,null);
		class2.correctTestForJava7();
		class2.correctTestForJava8();
		org.jsonschema2pojo.util.NameHelperTest class3 = new org.jsonschema2pojo.util.NameHelperTest();
		class3.testGetterNamedCorrectly();
		class3.testSetterNamedCorrectly();
		class3.testBuilderNamedCorrectly();
		class3.testClassNameCorrectly();
		org.jsonschema2pojo.util.InflectorTest class4 = new org.jsonschema2pojo.util.InflectorTest();
		class4.testSingularize();
		class4.testPluralize();
		org.jsonschema2pojo.util.MakeUniqueClassNameTest class5 = new org.jsonschema2pojo.util.MakeUniqueClassNameTest();
		class5.testClassNameStrategy();
	}
}