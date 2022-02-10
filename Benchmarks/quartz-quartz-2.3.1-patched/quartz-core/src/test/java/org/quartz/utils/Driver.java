package org.quartz.utils;

public class Driver {
	public void runall() {
		org.quartz.utils.HikariCpPoolingConnectionProviderTest class1 = new org.quartz.utils.HikariCpPoolingConnectionProviderTest();
		try {
			class1.testHikariCpPoolProviderWithExtraProps();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testHikariCpPoolProviderClassWithExtraProps();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.quartz.utils.C3p0PoolingConnectionProviderTest class2 = new org.quartz.utils.C3p0PoolingConnectionProviderTest();
		try {
			class2.testC3p0PoolProviderWithExtraProps();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testC3p0PoolProviderClassWithExtraProps();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.quartz.utils.PropertiesParserTest class3 = new org.quartz.utils.PropertiesParserTest();
		class3.testGetPropertyGroupStringBooleanStringArray();
		org.quartz.utils.ClassUtilsTest class4 = new org.quartz.utils.ClassUtilsTest();
		try {
			class4.testIsAnnotationPresentOnSuperClass();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		org.quartz.utils.DirtyFlagMapTest class5 = new org.quartz.utils.DirtyFlagMapTest();
		class5.testClear();
		class5.testPut();
		class5.testRemove();
		class5.testEntrySetRemove();
		class5.testEntrySetRetainAll();
		class5.testEntrySetRemoveAll();
		class5.testEntrySetClear();
		class5.testEntrySetIterator();
		class5.testEntrySetToArray();
		class5.testEntrySetToArrayWithArg();
		class5.testKeySetClear();
		class5.testValuesClear();
	}
}