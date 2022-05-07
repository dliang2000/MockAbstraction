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
package org.apache.ibatis.submitted.emptycollection;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.emptycollection.DaoTest class1 = new org.apache.ibatis.submitted.emptycollection.DaoTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.tearDown();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class1.testWithEmptyList();
		class1.testWithNonEmptyList();
		class1.testWithNonEmptyList_noCollectionId();
	}
}