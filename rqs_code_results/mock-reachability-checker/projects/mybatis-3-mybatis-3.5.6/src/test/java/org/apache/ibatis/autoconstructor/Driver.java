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
package org.apache.ibatis.autoconstructor;

public class Driver {
	public void runall() {
		org.apache.ibatis.autoconstructor.AutoConstructorTest class1 = new org.apache.ibatis.autoconstructor.AutoConstructorTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.fullyPopulatedSubject();
		class1.primitiveSubjects();
		class1.annotatedSubject();
		class1.badSubject();
		class1.extensiveSubject();
	}
}