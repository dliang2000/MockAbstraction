package org.jsonschema2pojo.util;

public class Driver {
	public void runall() {
		org.jsonschema2pojo.util.InflectorTest class1 = new org.jsonschema2pojo.util.InflectorTest();
		class1.testSingularize();
		class1.testPluralize();
		org.jsonschema2pojo.util.LanguageFeaturesTest class2 = new org.jsonschema2pojo.util.LanguageFeaturesTest();
		class2.correctTestForJava7();
		class2.correctTestForJava8();
		org.jsonschema2pojo.util.MakeUniqueClassNameTest class3 = new org.jsonschema2pojo.util.MakeUniqueClassNameTest();
		class3.testClassNameStrategy();
		org.jsonschema2pojo.util.TypeUtilTest class4 = new org.jsonschema2pojo.util.TypeUtilTest();
		class4.testResolveTypeCanHandleWildcard();
		class4.testResolveTypeCanHandleExtendsWildcard();
		class4.testResolveTypeForSuperWildcardThrowsException();
		org.jsonschema2pojo.util.NameHelperTest class5 = new org.jsonschema2pojo.util.NameHelperTest();
		class5.testGetterNamedCorrectly();
		class5.testSetterNamedCorrectly();
		class5.testBuilderNamedCorrectly();
		class5.testClassNameCorrectly();
	}
}