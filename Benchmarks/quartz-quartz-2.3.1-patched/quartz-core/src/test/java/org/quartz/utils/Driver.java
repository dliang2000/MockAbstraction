package org.quartz.utils;

public class Driver {
	public void runall() {
		org.quartz.utils.DirtyFlagMapTest class1 = new org.quartz.utils.DirtyFlagMapTest();
		class1.testClear();
		class1.testPut();
		class1.testRemove();
		class1.testEntrySetRemove();
		class1.testEntrySetRetainAll();
		class1.testEntrySetRemoveAll();
		class1.testEntrySetClear();
		class1.testEntrySetIterator();
		class1.testEntrySetToArray();
		class1.testEntrySetToArrayWithArg();
		class1.testKeySetClear();
		class1.testValuesClear();
		org.quartz.utils.PropertiesParserTest class2 = new org.quartz.utils.PropertiesParserTest();
		class2.testGetPropertyGroupStringBooleanStringArray();
		org.quartz.utils.ClassUtilsTest class3 = new org.quartz.utils.ClassUtilsTest();
		try {
			class3.testIsAnnotationPresentOnSuperClass();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.quartz.utils.HikariCpPoolingConnectionProviderTest class4 = new org.quartz.utils.HikariCpPoolingConnectionProviderTest();
		try {
			class4.testHikariCpPoolProviderWithExtraProps();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class4.testHikariCpPoolProviderClassWithExtraProps();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.quartz.utils.C3p0PoolingConnectionProviderTest class5 = new org.quartz.utils.C3p0PoolingConnectionProviderTest();
		try {
			class5.testC3p0PoolProviderWithExtraProps();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class5.testC3p0PoolProviderClassWithExtraProps();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
	}
}