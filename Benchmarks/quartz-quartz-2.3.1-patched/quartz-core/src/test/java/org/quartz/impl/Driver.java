package org.quartz.impl;

public class Driver {
	public void runall() {
		org.quartz.impl.SchedulerDetailsSetterTest class1 = new org.quartz.impl.SchedulerDetailsSetterTest();
		try {
			class1.testSetter();
		}
		catch (org.quartz.SchedulerException err1) {
			err1.printStackTrace();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		try {
			class1.testMissingSetterMethods();
		}
		catch (org.quartz.SchedulerException err3) {
			err3.printStackTrace();
		}
		try {
			class1.testUnimplementedMethods();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.quartz.impl.RemoteMBeanSchedulerTest class2 = new org.quartz.impl.RemoteMBeanSchedulerTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.tearDown();
		}
		catch (org.quartz.SchedulerException err6) {
			err6.printStackTrace();
		}
		try {
			class2.testJMXAttributesAccess();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.testSchedulerMetaData();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.testCalendarOperations();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class2.testTriggerOperations();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class2.testJobOperations();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class2.testLifecycleOperations();
		}
		catch (org.quartz.SchedulerException err12) {
			err12.printStackTrace();
		}
		try {
			class2.testJMXOperations();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class2.testUnsupportedMethods();
		try {
			class2.testListBrokenAttributes();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.quartz.impl.DirectSchedulerFactoryTest class3 = new org.quartz.impl.DirectSchedulerFactoryTest();
		try {
			class3.testPlugins();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class3.testThreadName();
		}
		catch (java.lang.Throwable err16) {
			err16.printStackTrace();
		}
		org.quartz.impl.JobDetailImplTest class4 = new org.quartz.impl.JobDetailImplTest();
		class4.testHashCode();
		org.quartz.impl.StdSchedulerFactoryCustomConnectionProviderTest class5 = new org.quartz.impl.StdSchedulerFactoryCustomConnectionProviderTest();
		try {
			class5.loadAndInitializeCustomConnectionProviderTest();
		}
		catch (org.quartz.SchedulerException err17) {
			err17.printStackTrace();
		}
		catch (java.lang.InterruptedException err18) {
			err18.printStackTrace();
		}
	}
}