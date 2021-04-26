package org.quartz.integrations.tests;

public class Driver {
	public void runall() {
		org.quartz.integrations.tests.QTZ179_TriggerLostAfterDbRestart_Test class1 = new org.quartz.integrations.tests.QTZ179_TriggerLostAfterDbRestart_Test();
		try {
			class1.initialize();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.checkAll4TriggersStillRunningTest();
		}
		catch (java.sql.SQLException err2) {
			err2.printStackTrace();
		}
		try {
			class1.shutdownDb();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.quartz.integrations.tests.JobDataMapStorageTest class2 = new org.quartz.integrations.tests.JobDataMapStorageTest();
		try {
			class2.testJobDataMapDirtyFlag();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.quartz.integrations.tests.TrackingJob class3 = new org.quartz.integrations.tests.TrackingJob();
		org.quartz.integrations.tests.QuartzDatabaseCronTriggerTest class4 = new org.quartz.integrations.tests.QuartzDatabaseCronTriggerTest();
		try {
			class4.testCronRepeatCount();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		org.quartz.integrations.tests.QTZ283_IgnoreMisfirePolicyJdbcStore_Test class5 = new org.quartz.integrations.tests.QTZ283_IgnoreMisfirePolicyJdbcStore_Test();
		try {
			class5.initialize();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class5.checkOldTriggerGetsFired();
		}
		catch (java.sql.SQLException err7) {
			err7.printStackTrace();
		}
		try {
			class5.shutdownDb();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzMemoryPauseAndResumeTest class6 = new org.quartz.integrations.tests.QuartzMemoryPauseAndResumeTest();
		try {
			class6.testPauseAndResumeTriggers();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class6.testResumeTriggersBeforeAddJob();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class6.testPauseAndResumeJobs();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class6.testResumeJobsBeforeAddJobs();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzMemoryCronTriggerTest class7 = new org.quartz.integrations.tests.QuartzMemoryCronTriggerTest();
		try {
			class7.testCronRepeatCount();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		org.quartz.integrations.tests.StdRowLockSemaphoreTest class8 = new org.quartz.integrations.tests.StdRowLockSemaphoreTest();
		try {
			class8.testDefaultStdRowLockSemaphore();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class8.testCustomStdRowLockSemaphore();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		org.quartz.integrations.tests.HelloJob class9 = new org.quartz.integrations.tests.HelloJob();
		org.quartz.integrations.tests.QuartzMemoryTestSupport class10 = new org.quartz.integrations.tests.QuartzMemoryTestSupport();
		try {
			class10.initSchedulerBeforeTest();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class10.initSchedulerAfterTest();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		org.quartz.integrations.tests.JobClassNotFoundExceptionErrorsTriggersTest class11 = new org.quartz.integrations.tests.JobClassNotFoundExceptionErrorsTriggersTest();
		try {
			class11.testJobClassNotFoundDoesntBlock();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		org.quartz.integrations.tests.QTZ336_MissSchedulingChangeSignalTest class12 = new org.quartz.integrations.tests.QTZ336_MissSchedulingChangeSignalTest();
		try {
			class12.simpleScheduleAlwaysFiredUnder20s();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzDatabsePauseAndResumeTest class13 = new org.quartz.integrations.tests.QuartzDatabsePauseAndResumeTest();
		try {
			class13.testPauseAndResumeTriggers();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class13.testResumeTriggersBeforeAddJob();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class13.testPauseAndResumeJobs();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class13.testResumeJobsBeforeAddJobs();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzDatabaseTestSupport class14 = new org.quartz.integrations.tests.QuartzDatabaseTestSupport();
		try {
			class14.initialize();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class14.shutdownDb();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
	}
}