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