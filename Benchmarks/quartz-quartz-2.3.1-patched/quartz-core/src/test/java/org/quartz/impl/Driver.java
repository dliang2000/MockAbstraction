package org.quartz.impl;

public class Driver {
	public void runall() {
		org.quartz.impl.DirectSchedulerFactoryTest class1 = new org.quartz.impl.DirectSchedulerFactoryTest();
		try {
			class1.testPlugins();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testThreadName();
		}
		catch (java.lang.Throwable err2) {
			err2.printStackTrace();
		}
		org.quartz.impl.JobDetailImplTest class2 = new org.quartz.impl.JobDetailImplTest();
		class2.testHashCode();
		org.quartz.impl.SchedulerDetailsSetterTest class3 = new org.quartz.impl.SchedulerDetailsSetterTest();
		try {
			class3.testSetter();
		}
		catch (org.quartz.SchedulerException err3) {
			err3.printStackTrace();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		try {
			class3.testMissingSetterMethods();
		}
		catch (org.quartz.SchedulerException err5) {
			err5.printStackTrace();
		}
		try {
			class3.testUnimplementedMethods();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.quartz.impl.MockConnectionProvider class4 = new org.quartz.impl.MockConnectionProvider();
		org.quartz.impl.RemoteMBeanSchedulerTest class5 = new org.quartz.impl.RemoteMBeanSchedulerTest();
		try {
			class5.setUp();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class5.tearDown();
		}
		catch (org.quartz.SchedulerException err8) {
			err8.printStackTrace();
		}
		try {
			class5.testJMXAttributesAccess();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class5.testSchedulerMetaData();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class5.testCalendarOperations();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class5.testTriggerOperations();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class5.testJobOperations();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class5.testLifecycleOperations();
		}
		catch (org.quartz.SchedulerException err14) {
			err14.printStackTrace();
		}
		try {
			class5.testJMXOperations();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		class5.testUnsupportedMethods();
		try {
			class5.testListBrokenAttributes();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		org.quartz.impl.StdSchedulerFactoryCustomConnectionProviderTest class6 = new org.quartz.impl.StdSchedulerFactoryCustomConnectionProviderTest();
		try {
			class6.loadAndInitializeCustomConnectionProviderTest();
		}
		catch (org.quartz.SchedulerException err17) {
			err17.printStackTrace();
		}
		catch (java.lang.InterruptedException err18) {
			err18.printStackTrace();
		}
	}
}