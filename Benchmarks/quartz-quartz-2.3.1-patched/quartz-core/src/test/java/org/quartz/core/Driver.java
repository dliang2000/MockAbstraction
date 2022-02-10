package org.quartz.core;

public class Driver {
	public void runall() {
		org.quartz.core.QTZ385Test class1 = new org.quartz.core.QTZ385Test();
		try {
			class1.testShutdownOrdering();
		}
		catch (org.quartz.SchedulerException err1) {
			err1.printStackTrace();
		}
		catch (java.sql.SQLException err2) {
			err2.printStackTrace();
		}
		catch (java.lang.InterruptedException err3) {
			err3.printStackTrace();
		}
		catch (java.util.concurrent.BrokenBarrierException err4) {
			err4.printStackTrace();
		}
		org.quartz.core.ListenerManagerTest class2 = new org.quartz.core.ListenerManagerTest();
		try {
			class2.testManagementOfJobListeners();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.testManagementOfTriggerListeners();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.testManagementOfSchedulerListeners();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		org.quartz.core.QTZ212_SchedulerListener_Test class3 = new org.quartz.core.QTZ212_SchedulerListener_Test();
		try {
			class3.stdSchedulerCallsStartingBeforeStartedTest();
		}
		catch (org.quartz.SchedulerException err8) {
			err8.printStackTrace();
		}
		try {
			class3.broadcastSchedulerListenerCallsSchedulerStartingOnAllItsListeners();
		}
		catch (org.quartz.SchedulerException err9) {
			err9.printStackTrace();
		}
		org.quartz.core.RecoverJobsTest class4 = new org.quartz.core.RecoverJobsTest();
		try {
			class4.testRecoveringRepeatJobWhichIsFiredAndMisfiredAtTheSameTime();
		}
		catch (org.quartz.SchedulerException err10) {
			err10.printStackTrace();
		}
		catch (java.sql.SQLException err11) {
			err11.printStackTrace();
		}
		catch (java.lang.InterruptedException err12) {
			err12.printStackTrace();
		}
	}
}