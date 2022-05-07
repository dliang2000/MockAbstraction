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
package org.apache.ibatis.logging;

public class Driver {
	public void runall() {
		org.apache.ibatis.logging.LogFactoryTest class1 = new org.apache.ibatis.logging.LogFactoryTest();
		class1.shouldUseCommonsLogging();
		class1.shouldUseLog4J();
		class1.shouldUseLog4J2();
		class1.shouldUseJdKLogging();
		class1.shouldUseSlf4j();
		class1.shouldUseStdOut();
		class1.shouldUseNoLogging();
		try {
			class1.shouldReadLogImplFromSettings();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
	}
}