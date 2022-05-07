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
package org.apache.ibatis.submitted.typehandler;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.typehandler.TypeHandlerTest class1 = new org.apache.ibatis.submitted.typehandler.TypeHandlerTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldGetAUser();
		class1.shouldApplyTypeHandlerOnGeneratedKey();
		class1.shouldApplyTypeHandlerWithJdbcTypeSpecified();
		class1.shouldApplyTypeHandlerUsingConstructor();
		class1.shouldApplyTypeHandlerOnReturnTypeWithJdbcTypeSpecified();
		class1.shouldPickSoleTypeHandlerOnXmlResultMap();
		class1.shouldPickSameTypeHandlerMappedToDifferentJdbcTypes();
		class1.shouldFailIfMultipleHandlerMappedToAType();
		class1.shouldPickHandlerForNull();
	}
}