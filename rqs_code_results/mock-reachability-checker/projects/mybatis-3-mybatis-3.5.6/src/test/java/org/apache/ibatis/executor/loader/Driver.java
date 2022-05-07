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
package org.apache.ibatis.executor.loader;

public class Driver {
	public void runall() {
		org.apache.ibatis.executor.loader.CglibProxyTest class1 = new org.apache.ibatis.executor.loader.CglibProxyTest();
		class1.createProxyFactory();
		try {
			class1.shouldCreateAProxyForAPartiallyLoadedBean();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldFailCallingAnUnloadedProperty();
		class1.shouldLetCallALoadedProperty();
		try {
			class1.shouldSerizalizeADeserlizaliedProxy();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.apache.ibatis.executor.loader.JavassistProxyTest class2 = new org.apache.ibatis.executor.loader.JavassistProxyTest();
		class2.createProxyFactory();
		try {
			class2.shouldCreateAProxyForAPartiallyLoadedBean();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class2.shouldFailCallingAnUnloadedProperty();
		class2.shouldLetCallALoadedProperty();
		try {
			class2.shouldSerizalizeADeserlizaliedProxy();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
	}
}