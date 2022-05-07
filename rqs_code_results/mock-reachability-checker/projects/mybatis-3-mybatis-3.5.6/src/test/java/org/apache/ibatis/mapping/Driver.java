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
package org.apache.ibatis.mapping;

public class Driver {
	public void runall() {
		org.apache.ibatis.mapping.CacheBuilderTest class1 = new org.apache.ibatis.mapping.CacheBuilderTest();
		class1.testInitializing();
		class1.testInitializingFailure();
		org.apache.ibatis.mapping.ResultMappingTest class2 = new org.apache.ibatis.mapping.ResultMappingTest();
		class2.shouldThrowErrorWhenBothResultMapAndNestedSelectAreSet();
		class2.shouldFailWithAMissingColumnInNetstedSelect();
		org.apache.ibatis.mapping.BoundSqlTest class3 = new org.apache.ibatis.mapping.BoundSqlTest();
		class3.testHasAdditionalParameter();
	}
}