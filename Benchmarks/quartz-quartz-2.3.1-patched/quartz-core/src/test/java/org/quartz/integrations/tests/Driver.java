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
		org.quartz.integrations.tests.QuartzDatabaseCronTriggerTest class3 = new org.quartz.integrations.tests.QuartzDatabaseCronTriggerTest();
		try {
			class3.testCronRepeatCount();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		org.quartz.integrations.tests.QTZ283_IgnoreMisfirePolicyJdbcStore_Test class4 = new org.quartz.integrations.tests.QTZ283_IgnoreMisfirePolicyJdbcStore_Test();
		try {
			class4.initialize();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class4.checkOldTriggerGetsFired();
		}
		catch (java.sql.SQLException err7) {
			err7.printStackTrace();
		}
		try {
			class4.shutdownDb();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzMemoryPauseAndResumeTest class5 = new org.quartz.integrations.tests.QuartzMemoryPauseAndResumeTest();
		try {
			class5.testPauseAndResumeTriggers();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class5.testResumeTriggersBeforeAddJob();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class5.testPauseAndResumeJobs();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class5.testResumeJobsBeforeAddJobs();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzMemoryCronTriggerTest class6 = new org.quartz.integrations.tests.QuartzMemoryCronTriggerTest();
		try {
			class6.testCronRepeatCount();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		org.quartz.integrations.tests.StdRowLockSemaphoreTest class7 = new org.quartz.integrations.tests.StdRowLockSemaphoreTest();
		try {
			class7.testDefaultStdRowLockSemaphore();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class7.testCustomStdRowLockSemaphore();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		org.quartz.integrations.tests.JobClassNotFoundExceptionErrorsTriggersTest class8 = new org.quartz.integrations.tests.JobClassNotFoundExceptionErrorsTriggersTest();
		try {
			class8.testJobClassNotFoundDoesntBlock();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		org.quartz.integrations.tests.QTZ336_MissSchedulingChangeSignalTest class9 = new org.quartz.integrations.tests.QTZ336_MissSchedulingChangeSignalTest();
		try {
			class9.simpleScheduleAlwaysFiredUnder20s();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzDatabsePauseAndResumeTest class10 = new org.quartz.integrations.tests.QuartzDatabsePauseAndResumeTest();
		try {
			class10.testPauseAndResumeTriggers();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class10.testResumeTriggersBeforeAddJob();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class10.testPauseAndResumeJobs();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class10.testResumeJobsBeforeAddJobs();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
	}
}