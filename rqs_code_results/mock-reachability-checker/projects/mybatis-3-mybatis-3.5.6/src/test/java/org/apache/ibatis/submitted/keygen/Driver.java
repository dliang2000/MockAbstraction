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
package org.apache.ibatis.submitted.keygen;

public class Driver {
	public void runall() {
		org.apache.ibatis.submitted.keygen.Jdbc3KeyGeneratorTest class1 = new org.apache.ibatis.submitted.keygen.Jdbc3KeyGeneratorTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldAssignKeyToBean();
		class1.shouldAssignKeyToBean_batch();
		class1.shouldAssignKeyToNamedBean();
		class1.shouldAssignKeyToNamedBean_batch();
		class1.shouldAssignKeyToNamedBean_keyPropertyWithParamName();
		class1.shouldAssignKeyToNamedBean_keyPropertyWithParamName_batch();
		class1.shouldAssignKeysToList();
		class1.shouldAssignKeysToNamedList();
		class1.shouldAssingKeysToCollection();
		class1.shouldAssingKeysToNamedCollection();
		class1.shouldAssingKeysToArray();
		class1.shouldAssingKeysToNamedArray();
		class1.shouldAssignKeyToBean_MultiParams();
		class1.shouldFailIfKeyPropertyIsInvalid_NoParamName();
		class1.shouldFailIfKeyPropertyIsInvalid_WrongParamName();
		class1.shouldAssignKeysToNamedList_MultiParams();
		class1.shouldAssignKeysToNamedCollection_MultiParams();
		class1.shouldAssignKeysToNamedArray_MultiParams();
		class1.shouldAssignMultipleGeneratedKeysToABean();
		class1.shouldAssignMultipleGeneratedKeysToBeans();
		class1.shouldAssignMultipleGeneratedKeysToABean_MultiParams();
		class1.shouldAssignMultipleGeneratedKeysToABean_MultiParams_batch();
		class1.shouldAssignMultipleGeneratedKeysToBeans_MultiParams();
		class1.assigningMultipleKeysToDifferentParams();
		class1.assigningMultipleKeysToDifferentParams_batch();
		class1.shouldErrorUndefineProperty();
		class1.shouldFailIfTooManyGeneratedKeys();
		class1.shouldFailIfTooManyGeneratedKeys_ParamMap();
		class1.shouldFailIfTooManyGeneratedKeys_Batch();
		class1.shouldAssignKeysToListWithoutInvokingEqualsNorHashCode();
		class1.shouldAssignKeyToAParamWithTrickyName();
		class1.shouldAssingKeysToAMap();
	}
}