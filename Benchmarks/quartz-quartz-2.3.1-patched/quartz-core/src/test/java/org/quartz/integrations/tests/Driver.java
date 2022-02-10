package org.quartz.integrations.tests;

public class Driver {
	public void runall() {
		org.quartz.integrations.tests.QTZ283_IgnoreMisfirePolicyJdbcStore_Test class1 = new org.quartz.integrations.tests.QTZ283_IgnoreMisfirePolicyJdbcStore_Test();
		try {
			class1.initialize();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.checkOldTriggerGetsFired();
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
		org.quartz.integrations.tests.QuartzMemoryPauseAndResumeTest class2 = new org.quartz.integrations.tests.QuartzMemoryPauseAndResumeTest();
		try {
			class2.testPauseAndResumeTriggers();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.testResumeTriggersBeforeAddJob();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.testPauseAndResumeJobs();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.testResumeJobsBeforeAddJobs();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		org.quartz.integrations.tests.QTZ179_TriggerLostAfterDbRestart_Test class3 = new org.quartz.integrations.tests.QTZ179_TriggerLostAfterDbRestart_Test();
		try {
			class3.initialize();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.checkAll4TriggersStillRunningTest();
		}
		catch (java.sql.SQLException err9) {
			err9.printStackTrace();
		}
		try {
			class3.shutdownDb();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		org.quartz.integrations.tests.QTZ336_MissSchedulingChangeSignalTest class4 = new org.quartz.integrations.tests.QTZ336_MissSchedulingChangeSignalTest();
		try {
			class4.simpleScheduleAlwaysFiredUnder20s();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		org.quartz.integrations.tests.JobDataMapStorageTest class5 = new org.quartz.integrations.tests.JobDataMapStorageTest();
		try {
			class5.testJobDataMapDirtyFlag();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		org.quartz.integrations.tests.JobClassNotFoundExceptionErrorsTriggersTest class6 = new org.quartz.integrations.tests.JobClassNotFoundExceptionErrorsTriggersTest();
		try {
			class6.testJobClassNotFoundDoesntBlock();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzMemoryCronTriggerTest class7 = new org.quartz.integrations.tests.QuartzMemoryCronTriggerTest();
		try {
			class7.testCronRepeatCount();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.quartz.integrations.tests.StdRowLockSemaphoreTest class8 = new org.quartz.integrations.tests.StdRowLockSemaphoreTest();
		try {
			class8.testDefaultStdRowLockSemaphore();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class8.testCustomStdRowLockSemaphore();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzDatabsePauseAndResumeTest class9 = new org.quartz.integrations.tests.QuartzDatabsePauseAndResumeTest();
		try {
			class9.testPauseAndResumeTriggers();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class9.testResumeTriggersBeforeAddJob();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class9.testPauseAndResumeJobs();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class9.testResumeJobsBeforeAddJobs();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzDatabaseCronTriggerTest class10 = new org.quartz.integrations.tests.QuartzDatabaseCronTriggerTest();
		try {
			class10.testCronRepeatCount();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
	}
}