package org.quartz.core;

public class Driver {
	public void runall() {
		org.quartz.core.QTZ212_SchedulerListener_Test class1 = new org.quartz.core.QTZ212_SchedulerListener_Test();
		try {
			class1.stdSchedulerCallsStartingBeforeStartedTest();
		}
		catch (org.quartz.SchedulerException err1) {
			err1.printStackTrace();
		}
		try {
			class1.broadcastSchedulerListenerCallsSchedulerStartingOnAllItsListeners();
		}
		catch (org.quartz.SchedulerException err2) {
			err2.printStackTrace();
		}
		org.quartz.core.RecoverJobsTest class2 = new org.quartz.core.RecoverJobsTest();
		try {
			class2.testRecoveringRepeatJobWhichIsFiredAndMisfiredAtTheSameTime();
		}
		catch (org.quartz.SchedulerException err3) {
			err3.printStackTrace();
		}
		catch (java.sql.SQLException err4) {
			err4.printStackTrace();
		}
		catch (java.lang.InterruptedException err5) {
			err5.printStackTrace();
		}
		org.quartz.core.ListenerManagerTest class3 = new org.quartz.core.ListenerManagerTest();
		try {
			class3.testManagementOfJobListeners();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class3.testManagementOfTriggerListeners();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class3.testManagementOfSchedulerListeners();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.quartz.core.QTZ385Test class4 = new org.quartz.core.QTZ385Test();
		try {
			class4.testShutdownOrdering();
		}
		catch (org.quartz.SchedulerException err9) {
			err9.printStackTrace();
		}
		catch (java.sql.SQLException err10) {
			err10.printStackTrace();
		}
		catch (java.lang.InterruptedException err11) {
			err11.printStackTrace();
		}
		catch (java.util.concurrent.BrokenBarrierException err12) {
			err12.printStackTrace();
		}
	}
}