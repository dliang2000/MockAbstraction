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
		org.jsonschema2pojo.util.InflectorTest class1 = new org.jsonschema2pojo.util.InflectorTest();
		class1.testSingularize();
		class1.testPluralize();
		org.jsonschema2pojo.util.MakeUniqueClassNameTest class2 = new org.jsonschema2pojo.util.MakeUniqueClassNameTest();
		class2.testClassNameStrategy();
		org.jsonschema2pojo.util.TypeUtilTest class3 = new org.jsonschema2pojo.util.TypeUtilTest();
		class3.testResolveTypeCanHandleWildcard();
		class3.testResolveTypeCanHandleExtendsWildcard();
		class3.testResolveTypeForSuperWildcardThrowsException();
		org.jsonschema2pojo.util.NameHelperTest class4 = new org.jsonschema2pojo.util.NameHelperTest();
		class4.testGetterNamedCorrectly();
		class4.testSetterNamedCorrectly();
		class4.testBuilderNamedCorrectly();
		class4.testClassNameCorrectly();
	}
}