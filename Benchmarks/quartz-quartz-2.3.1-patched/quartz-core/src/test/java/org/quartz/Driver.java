package org.quartz;

public class Driver {
	public static void main(String[] argv) {
		org.quartz.CronScheduleBuilderTest class1 = new org.quartz.CronScheduleBuilderTest();
		class1.testAtHourAndMinuteOnGivenDaysOfWeek();
		org.quartz.MonthlyCalendarTest class2 = new org.quartz.MonthlyCalendarTest();
		class2.testForInfiniteLoop();
		org.quartz.PriorityTest class3 = new org.quartz.PriorityTest();
		try {
			class3.testSameDefaultPriority();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class3.testDifferentPriority();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.quartz.utils.DirtyFlagMapTest class4 = new org.quartz.utils.DirtyFlagMapTest();
		class4.testClear();
		class4.testPut();
		class4.testRemove();
		class4.testEntrySetRemove();
		class4.testEntrySetRetainAll();
		class4.testEntrySetRemoveAll();
		class4.testEntrySetClear();
		class4.testEntrySetIterator();
		class4.testEntrySetToArray();
		class4.testEntrySetToArrayWithArg();
		class4.testKeySetClear();
		class4.testValuesClear();
		org.quartz.utils.PropertiesParserTest class5 = new org.quartz.utils.PropertiesParserTest();
		class5.testGetPropertyGroupStringBooleanStringArray();
		org.quartz.utils.ClassUtilsTest class6 = new org.quartz.utils.ClassUtilsTest();
		try {
			class6.testIsAnnotationPresentOnSuperClass();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.quartz.utils.HikariCpPoolingConnectionProviderTest class7 = new org.quartz.utils.HikariCpPoolingConnectionProviderTest();
		try {
			class7.testHikariCpPoolProviderWithExtraProps();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class7.testHikariCpPoolProviderClassWithExtraProps();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		org.quartz.utils.C3p0PoolingConnectionProviderTest class8 = new org.quartz.utils.C3p0PoolingConnectionProviderTest();
		try {
			class8.testC3p0PoolProviderWithExtraProps();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class8.testC3p0PoolProviderClassWithExtraProps();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		org.quartz.JdbcSchedulerTest class9 = new org.quartz.JdbcSchedulerTest();
		org.quartz.Qtz205SchedulerListenerTest class10 = new org.quartz.Qtz205SchedulerListenerTest();
		try {
			class10.testTriggerFinalized();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.quartz.SimpleTriggerTest class11 = new org.quartz.SimpleTriggerTest();
		class11.testUpdateAfterMisfire();
		class11.testGetFireTimeAfter();
		class11.testClone();
		class11.testQuartz665();
		try {
			class11.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err9) {
			err9.printStackTrace();
		}
		org.quartz.JobDetailTest class12 = new org.quartz.JobDetailTest();
		class12.testClone();
		class12.testAnnotationDetection();
		org.quartz.integrations.tests.QTZ179_TriggerLostAfterDbRestart_Test class13 = new org.quartz.integrations.tests.QTZ179_TriggerLostAfterDbRestart_Test();
		try {
			class13.checkAll4TriggersStillRunningTest();
		}
		catch (java.sql.SQLException err10) {
			err10.printStackTrace();
		}
		org.quartz.integrations.tests.JobDataMapStorageTest class14 = new org.quartz.integrations.tests.JobDataMapStorageTest();
		try {
			class14.testJobDataMapDirtyFlag();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		org.quartz.integrations.tests.TrackingJob class15 = new org.quartz.integrations.tests.TrackingJob();
		org.quartz.integrations.tests.QuartzDatabaseCronTriggerTest class16 = new org.quartz.integrations.tests.QuartzDatabaseCronTriggerTest();
		try {
			class16.testCronRepeatCount();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		org.quartz.integrations.tests.QTZ283_IgnoreMisfirePolicyJdbcStore_Test class17 = new org.quartz.integrations.tests.QTZ283_IgnoreMisfirePolicyJdbcStore_Test();
		try {
			class17.checkOldTriggerGetsFired();
		}
		catch (java.sql.SQLException err13) {
			err13.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzMemoryPauseAndResumeTest class18 = new org.quartz.integrations.tests.QuartzMemoryPauseAndResumeTest();
		try {
			class18.testPauseAndResumeTriggers();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class18.testResumeTriggersBeforeAddJob();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class18.testPauseAndResumeJobs();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class18.testResumeJobsBeforeAddJobs();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzMemoryCronTriggerTest class19 = new org.quartz.integrations.tests.QuartzMemoryCronTriggerTest();
		try {
			class19.testCronRepeatCount();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		org.quartz.integrations.tests.StdRowLockSemaphoreTest class20 = new org.quartz.integrations.tests.StdRowLockSemaphoreTest();
		try {
			class20.testDefaultStdRowLockSemaphore();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class20.testCustomStdRowLockSemaphore();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		org.quartz.integrations.tests.HelloJob class21 = new org.quartz.integrations.tests.HelloJob();
		org.quartz.integrations.tests.QuartzMemoryTestSupport class22 = new org.quartz.integrations.tests.QuartzMemoryTestSupport();
		org.quartz.integrations.tests.JobClassNotFoundExceptionErrorsTriggersTest class23 = new org.quartz.integrations.tests.JobClassNotFoundExceptionErrorsTriggersTest();
		try {
			class23.testJobClassNotFoundDoesntBlock();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		org.quartz.integrations.tests.QTZ336_MissSchedulingChangeSignalTest class24 = new org.quartz.integrations.tests.QTZ336_MissSchedulingChangeSignalTest();
		try {
			class24.simpleScheduleAlwaysFiredUnder20s();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzDatabsePauseAndResumeTest class25 = new org.quartz.integrations.tests.QuartzDatabsePauseAndResumeTest();
		try {
			class25.testPauseAndResumeTriggers();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class25.testResumeTriggersBeforeAddJob();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class25.testPauseAndResumeJobs();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class25.testResumeJobsBeforeAddJobs();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		org.quartz.integrations.tests.QuartzDatabaseTestSupport class26 = new org.quartz.integrations.tests.QuartzDatabaseTestSupport();
		org.quartz.Quartz601Test class27 = new org.quartz.Quartz601Test();
		class27.testNormal();
		class27.testSecond();
		class27.testMinute();
		class27.testHour();
		class27.testDayOfWeekNumber();
		class27.testDayOfWeek();
		class27.testDayOfMonth();
		class27.testMonth();
		class27.testAmbiguous();
		org.quartz.JobDataMapTest class28 = new org.quartz.JobDataMapTest();
		org.quartz.JobBuilderTest class29 = new org.quartz.JobBuilderTest();
		try {
			class29.testJobBuilder();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		org.quartz.DisallowConcurrentExecutionJobTest class30 = new org.quartz.DisallowConcurrentExecutionJobTest();
		try {
			class30.testNoConcurrentExecOnSameJob();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class30.testNoConcurrentExecOnSameJobWithBatching();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		org.quartz.impl.DirectSchedulerFactoryTest class31 = new org.quartz.impl.DirectSchedulerFactoryTest();
		try {
			class31.testPlugins();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class31.testThreadName();
		}
		catch (java.lang.Throwable err31) {
			err31.printStackTrace();
		}
		org.quartz.impl.JobDetailImplTest class32 = new org.quartz.impl.JobDetailImplTest();
		class32.testHashCode();
		org.quartz.impl.SchedulerDetailsSetterTest class33 = new org.quartz.impl.SchedulerDetailsSetterTest();
		try {
			class33.testSetter();
		}
		catch (org.quartz.SchedulerException err32) {
			err32.printStackTrace();
		}
		catch (java.io.IOException err33) {
			err33.printStackTrace();
		}
		try {
			class33.testMissingSetterMethods();
		}
		catch (org.quartz.SchedulerException err34) {
			err34.printStackTrace();
		}
		try {
			class33.testUnimplementedMethods();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		org.quartz.impl.jdbcjobstore.DeleteNonExistsJobTest class34 = new org.quartz.impl.jdbcjobstore.DeleteNonExistsJobTest();
		try {
			class34.deleteJobDetailOnly();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class34.deleteJobDetailWithTrigger();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class34.deleteTrigger();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class34.replaceJobDetail();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		org.quartz.impl.jdbcjobstore.StdJDBCDelegateTest class35 = new org.quartz.impl.jdbcjobstore.StdJDBCDelegateTest();
		try {
			class35.testSerializeJobData();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		catch (org.quartz.impl.jdbcjobstore.NoSuchDelegateException err41) {
			err41.printStackTrace();
		}
		try {
			class35.testSelectBlobTriggerWithNoBlobContent();
		}
		catch (org.quartz.JobPersistenceException err42) {
			err42.printStackTrace();
		}
		catch (java.sql.SQLException err43) {
			err43.printStackTrace();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err45) {
			err45.printStackTrace();
		}
		try {
			class35.testSelectSimpleTriggerWithExceptionWithExtendedProps();
		}
		catch (java.sql.SQLException err46) {
			err46.printStackTrace();
		}
		catch (org.quartz.JobPersistenceException err47) {
			err47.printStackTrace();
		}
		catch (java.io.IOException err48) {
			err48.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err49) {
			err49.printStackTrace();
		}
		try {
			class35.testSelectSimpleTriggerWithDeleteBeforeSelectExtendedProps();
		}
		catch (org.quartz.JobPersistenceException err50) {
			err50.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err51) {
			err51.printStackTrace();
		}
		catch (java.sql.SQLException err52) {
			err52.printStackTrace();
		}
		catch (java.io.IOException err53) {
			err53.printStackTrace();
		}
		org.quartz.impl.jdbcjobstore.JdbcJobStoreTest class36 = new org.quartz.impl.jdbcjobstore.JdbcJobStoreTest();
		class36.testNothing();
		org.quartz.impl.jdbcjobstore.UpdateLockRowSemaphoreTest class37 = new org.quartz.impl.jdbcjobstore.UpdateLockRowSemaphoreTest();
		try {
			class37.testSingleSuccessUsingUpdate();
		}
		catch (org.quartz.impl.jdbcjobstore.LockException err54) {
			err54.printStackTrace();
		}
		catch (java.sql.SQLException err55) {
			err55.printStackTrace();
		}
		try {
			class37.testSingleFailureFollowedBySuccessUsingUpdate();
		}
		catch (org.quartz.impl.jdbcjobstore.LockException err56) {
			err56.printStackTrace();
		}
		catch (java.sql.SQLException err57) {
			err57.printStackTrace();
		}
		try {
			class37.testDoubleFailureFollowedBySuccessUsingUpdate();
		}
		catch (org.quartz.impl.jdbcjobstore.LockException err58) {
			err58.printStackTrace();
		}
		catch (java.sql.SQLException err59) {
			err59.printStackTrace();
		}
		try {
			class37.testFallThroughToInsert();
		}
		catch (java.sql.SQLException err60) {
			err60.printStackTrace();
		}
		catch (org.quartz.impl.jdbcjobstore.LockException err61) {
			err61.printStackTrace();
		}
		org.quartz.impl.MockConnectionProvider class38 = new org.quartz.impl.MockConnectionProvider();
		org.quartz.impl.matchers.GroupMatcherTest class39 = new org.quartz.impl.matchers.GroupMatcherTest();
		class39.testAnyGroupMatchers();
		org.quartz.impl.RemoteMBeanSchedulerTest class40 = new org.quartz.impl.RemoteMBeanSchedulerTest();
		try {
			class40.testJMXAttributesAccess();
		}
		catch (java.lang.Exception err62) {
			err62.printStackTrace();
		}
		try {
			class40.testSchedulerMetaData();
		}
		catch (java.lang.Exception err63) {
			err63.printStackTrace();
		}
		try {
			class40.testCalendarOperations();
		}
		catch (java.lang.Exception err64) {
			err64.printStackTrace();
		}
		try {
			class40.testTriggerOperations();
		}
		catch (java.lang.Exception err65) {
			err65.printStackTrace();
		}
		try {
			class40.testJobOperations();
		}
		catch (java.lang.Exception err66) {
			err66.printStackTrace();
		}
		try {
			class40.testLifecycleOperations();
		}
		catch (org.quartz.SchedulerException err67) {
			err67.printStackTrace();
		}
		try {
			class40.testJMXOperations();
		}
		catch (java.lang.Exception err68) {
			err68.printStackTrace();
		}
		class40.testUnsupportedMethods();
		try {
			class40.testListBrokenAttributes();
		}
		catch (java.lang.Exception err69) {
			err69.printStackTrace();
		}
		org.quartz.impl.StdSchedulerFactoryCustomConnectionProviderTest class41 = new org.quartz.impl.StdSchedulerFactoryCustomConnectionProviderTest();
		try {
			class41.loadAndInitializeCustomConnectionProviderTest();
		}
		catch (org.quartz.SchedulerException err70) {
			err70.printStackTrace();
		}
		catch (java.lang.InterruptedException err71) {
			err71.printStackTrace();
		}
		org.quartz.impl.triggers.DailyTimeIntervalTriggerImplTest class42 = new org.quartz.impl.triggers.DailyTimeIntervalTriggerImplTest();
		try {
			class42.testNormalExample();
		}
		catch (java.lang.Exception err72) {
			err72.printStackTrace();
		}
		try {
			class42.testQuartzCalendarExclusion();
		}
		catch (java.lang.Exception err73) {
			err73.printStackTrace();
		}
		try {
			class42.testValidateTimeOfDayOrder();
		}
		catch (java.lang.Exception err74) {
			err74.printStackTrace();
		}
		try {
			class42.testValidateInterval();
		}
		catch (java.lang.Exception err75) {
			err75.printStackTrace();
		}
		try {
			class42.testStartTimeWithoutStartTimeOfDay();
		}
		catch (java.lang.Exception err76) {
			err76.printStackTrace();
		}
		try {
			class42.testEndTimeWithoutEndTimeOfDay();
		}
		catch (java.lang.Exception err77) {
			err77.printStackTrace();
		}
		try {
			class42.testStartTimeBeforeStartTimeOfDay();
		}
		catch (java.lang.Exception err78) {
			err78.printStackTrace();
		}
		try {
			class42.testStartTimeBeforeStartTimeOfDayOnInvalidDay();
		}
		catch (java.lang.Exception err79) {
			err79.printStackTrace();
		}
		try {
			class42.testStartTimeAfterStartTimeOfDay();
		}
		catch (java.lang.Exception err80) {
			err80.printStackTrace();
		}
		try {
			class42.testEndTimeBeforeEndTimeOfDay();
		}
		catch (java.lang.Exception err81) {
			err81.printStackTrace();
		}
		try {
			class42.testEndTimeAfterEndTimeOfDay();
		}
		catch (java.lang.Exception err82) {
			err82.printStackTrace();
		}
		try {
			class42.testTimeOfDayWithStartTime();
		}
		catch (java.lang.Exception err83) {
			err83.printStackTrace();
		}
		try {
			class42.testTimeOfDayWithEndTime();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		try {
			class42.testTimeOfDayWithEndTime2();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class42.testAllDaysOfTheWeek();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		try {
			class42.testMonThroughFri();
		}
		catch (java.lang.Exception err87) {
			err87.printStackTrace();
		}
		try {
			class42.testSatAndSun();
		}
		catch (java.lang.Exception err88) {
			err88.printStackTrace();
		}
		try {
			class42.testMonOnly();
		}
		catch (java.lang.Exception err89) {
			err89.printStackTrace();
		}
		try {
			class42.testTimeOfDayWithEndTimeOddInterval();
		}
		catch (java.lang.Exception err90) {
			err90.printStackTrace();
		}
		try {
			class42.testHourInterval();
		}
		catch (java.lang.Exception err91) {
			err91.printStackTrace();
		}
		try {
			class42.testSecondInterval();
		}
		catch (java.lang.Exception err92) {
			err92.printStackTrace();
		}
		try {
			class42.testRepeatCountInf();
		}
		catch (java.lang.Exception err93) {
			err93.printStackTrace();
		}
		try {
			class42.testRepeatCount();
		}
		catch (java.lang.Exception err94) {
			err94.printStackTrace();
		}
		try {
			class42.testRepeatCount0();
		}
		catch (java.lang.Exception err95) {
			err95.printStackTrace();
		}
		try {
			class42.testGetFireTime();
		}
		catch (java.lang.Exception err96) {
			err96.printStackTrace();
		}
		try {
			class42.testGetFireTimeWithDateBeforeStartTime();
		}
		catch (java.lang.Exception err97) {
			err97.printStackTrace();
		}
		try {
			class42.testGetFireTimeWhenStartTimeAndTimeOfDayIsSame();
		}
		catch (java.lang.Exception err98) {
			err98.printStackTrace();
		}
		try {
			class42.testExtraConstructors();
		}
		catch (java.lang.Exception err99) {
			err99.printStackTrace();
		}
		org.quartz.impl.calendar.DailyCalendarTest class43 = new org.quartz.impl.calendar.DailyCalendarTest();
		class43.testStringStartEndTimes();
		class43.testStringInvertTimeRange();
		org.quartz.impl.calendar.BaseCalendarTest class44 = new org.quartz.impl.calendar.BaseCalendarTest();
		class44.testClone();
		org.quartz.simpl.RAMJobStoreTest class45 = new org.quartz.simpl.RAMJobStoreTest();
		org.quartz.simpl.SystemPropertyInstanceIdGeneratorTest class46 = new org.quartz.simpl.SystemPropertyInstanceIdGeneratorTest();
		try {
			class46.testGetInstanceId();
		}
		catch (java.lang.Exception err100) {
			err100.printStackTrace();
		}
		try {
			class46.testGetInstanceIdWithPrepend();
		}
		catch (java.lang.Exception err101) {
			err101.printStackTrace();
		}
		try {
			class46.testGetInstanceIdWithPostpend();
		}
		catch (java.lang.Exception err102) {
			err102.printStackTrace();
		}
		try {
			class46.testGetInstanceIdWithPrependAndPostpend();
		}
		catch (java.lang.Exception err103) {
			err103.printStackTrace();
		}
		try {
			class46.testGetInstanceIdFromCustomSystemProperty();
		}
		catch (java.lang.Exception err104) {
			err104.printStackTrace();
		}
		try {
			class46.testGeneratorThroughSchedulerInstatiation();
		}
		catch (java.lang.Exception err105) {
			err105.printStackTrace();
		}
		org.quartz.simpl.PropertySettingJobFactoryTest class47 = new org.quartz.simpl.PropertySettingJobFactoryTest();
		try {
			class47.testSetBeanPropsPrimatives();
		}
		catch (org.quartz.SchedulerException err106) {
			err106.printStackTrace();
		}
		class47.testSetBeanPropsUnknownProperty();
		class47.testSetBeanPropsNullPrimative();
		try {
			class47.testSetBeanPropsNullNonPrimative();
		}
		catch (org.quartz.SchedulerException err107) {
			err107.printStackTrace();
		}
		class47.testSetBeanPropsWrongPrimativeType();
		class47.testSetBeanPropsWrongNonPrimativeType();
		class47.testSetBeanPropsCharStringTooShort();
		class47.testSetBeanPropsCharStringTooLong();
		try {
			class47.testSetBeanPropsFromStrings();
		}
		catch (org.quartz.SchedulerException err108) {
			err108.printStackTrace();
		}
		org.quartz.TriggerBuilderTest class48 = new org.quartz.TriggerBuilderTest();
		try {
			class48.testTriggerBuilder();
		}
		catch (java.lang.Exception err109) {
			err109.printStackTrace();
		}
		try {
			class48.testTriggerBuilderWithEndTimePriorCurrrentTime();
		}
		catch (java.lang.Exception err110) {
			err110.printStackTrace();
		}
		org.quartz.core.QTZ212_SchedulerListener_Test class49 = new org.quartz.core.QTZ212_SchedulerListener_Test();
		try {
			class49.stdSchedulerCallsStartingBeforeStartedTest();
		}
		catch (org.quartz.SchedulerException err111) {
			err111.printStackTrace();
		}
		try {
			class49.broadcastSchedulerListenerCallsSchedulerStartingOnAllItsListeners();
		}
		catch (org.quartz.SchedulerException err112) {
			err112.printStackTrace();
		}
		org.quartz.core.RecoverJobsTest class50 = new org.quartz.core.RecoverJobsTest();
		try {
			class50.testRecoveringRepeatJobWhichIsFiredAndMisfiredAtTheSameTime();
		}
		catch (org.quartz.SchedulerException err113) {
			err113.printStackTrace();
		}
		catch (java.sql.SQLException err114) {
			err114.printStackTrace();
		}
		catch (java.lang.InterruptedException err115) {
			err115.printStackTrace();
		}
		org.quartz.core.ListenerManagerTest class51 = new org.quartz.core.ListenerManagerTest();
		try {
			class51.testManagementOfJobListeners();
		}
		catch (java.lang.Exception err116) {
			err116.printStackTrace();
		}
		try {
			class51.testManagementOfTriggerListeners();
		}
		catch (java.lang.Exception err117) {
			err117.printStackTrace();
		}
		try {
			class51.testManagementOfSchedulerListeners();
		}
		catch (java.lang.Exception err118) {
			err118.printStackTrace();
		}
		org.quartz.core.QTZ385Test class52 = new org.quartz.core.QTZ385Test();
		try {
			class52.testShutdownOrdering();
		}
		catch (org.quartz.SchedulerException err119) {
			err119.printStackTrace();
		}
		catch (java.sql.SQLException err120) {
			err120.printStackTrace();
		}
		catch (java.lang.InterruptedException err121) {
			err121.printStackTrace();
		}
		catch (java.util.concurrent.BrokenBarrierException err122) {
			err122.printStackTrace();
		}
		org.quartz.TriggerComparatorTest class53 = new org.quartz.TriggerComparatorTest();
		class53.testTriggerSort();
		class53.testTriggerTimeSort();
		org.quartz.RAMSchedulerTest class54 = new org.quartz.RAMSchedulerTest();
		org.quartz.CronTriggerTest class55 = new org.quartz.CronTriggerTest();
		try {
			class55.testClone();
		}
		catch (java.text.ParseException err123) {
			err123.printStackTrace();
		}
		try {
			class55.testQuartz558();
		}
		catch (java.text.ParseException err124) {
			err124.printStackTrace();
		}
		try {
			class55.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err125) {
			err125.printStackTrace();
		}
		org.quartz.CalendarIntervalTriggerTest class56 = new org.quartz.CalendarIntervalTriggerTest();
		class56.testQTZ331FireTimeAfterBoundary();
		class56.testQTZ330DaylightSavingsCornerCase();
		class56.testYearlyIntervalGetFireTimeAfter();
		class56.testMonthlyIntervalGetFireTimeAfter();
		class56.testWeeklyIntervalGetFireTimeAfter();
		class56.testDailyIntervalGetFireTimeAfter();
		class56.testHourlyIntervalGetFireTimeAfter();
		class56.testMinutelyIntervalGetFireTimeAfter();
		class56.testSecondlyIntervalGetFireTimeAfter();
		class56.testDaylightSavingsTransitions();
		class56.testFinalFireTimes();
		try {
			class56.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err126) {
			err126.printStackTrace();
		}
		org.quartz.xml.XMLSchedulingDataProcessorTest class57 = new org.quartz.xml.XMLSchedulingDataProcessorTest();
		try {
			class57.testOverwriteFlag();
		}
		catch (java.lang.Exception err127) {
			err127.printStackTrace();
		}
		try {
			class57.testDirectivesNoOverwriteWithIgnoreDups();
		}
		catch (java.lang.Exception err128) {
			err128.printStackTrace();
		}
		try {
			class57.testDirectivesOverwriteWithNoIgnoreDups();
		}
		catch (java.lang.Exception err129) {
			err129.printStackTrace();
		}
		try {
			class57.testXsdSchemaValidationOnVariousTriggers();
		}
		catch (java.lang.Exception err130) {
			err130.printStackTrace();
		}
		try {
			class57.testQTZ327SimpleTriggerNoRepeat();
		}
		catch (java.lang.Exception err131) {
			err131.printStackTrace();
		}
		try {
			class57.testTimeZones();
		}
		catch (java.lang.Exception err132) {
			err132.printStackTrace();
		}
		try {
			class57.testRemoveJobClassNotFound();
		}
		catch (java.lang.Exception err133) {
			err133.printStackTrace();
		}
		try {
			class57.testOverwriteJobClassNotFound();
		}
		catch (java.lang.Exception err134) {
			err134.printStackTrace();
		}
		org.quartz.DefaultSchedulerTest class58 = new org.quartz.DefaultSchedulerTest();
		try {
			class58.testAddJobNoTrigger();
		}
		catch (java.lang.Exception err135) {
			err135.printStackTrace();
		}
		org.quartz.DailyTimeIntervalScheduleBuilderTest class59 = new org.quartz.DailyTimeIntervalScheduleBuilderTest();
		try {
			class59.testScheduleActualTrigger();
		}
		catch (java.lang.Exception err136) {
			err136.printStackTrace();
		}
		try {
			class59.testScheduleInMiddleOfDailyInterval();
		}
		catch (java.lang.Exception err137) {
			err137.printStackTrace();
		}
		class59.testHourlyTrigger();
		class59.testMinutelyTriggerWithTimeOfDay();
		class59.testSecondlyTriggerWithStartAndEndTime();
		class59.testRepeatCountTrigger();
		class59.testEndingAtAfterCount();
		class59.testEndingAtAfterCountOf1();
		class59.testEndingAtAfterCountOf0();
		org.quartz.VersionTest class60 = new org.quartz.VersionTest();
		class60.testVersionParsing();
		org.quartz.CronExpressionTest class61 = new org.quartz.CronExpressionTest();
		try {
			class61.testIsSatisfiedBy();
		}
		catch (java.lang.Exception err138) {
			err138.printStackTrace();
		}
		try {
			class61.testLastDayOffset();
		}
		catch (java.lang.Exception err139) {
			err139.printStackTrace();
		}
		try {
			class61.testQuartz571();
		}
		catch (java.lang.Exception err140) {
			err140.printStackTrace();
		}
		try {
			class61.testQtz259();
		}
		catch (java.lang.Exception err141) {
			err141.printStackTrace();
		}
		try {
			class61.testQtz259LW();
		}
		catch (java.lang.Exception err142) {
			err142.printStackTrace();
		}
		class61.testQuartz574();
		class61.testQuartz621();
		try {
			class61.testQuartz640();
		}
		catch (java.text.ParseException err143) {
			err143.printStackTrace();
		}
		try {
			class61.testQtz96();
		}
		catch (java.text.ParseException err144) {
			err144.printStackTrace();
		}
		try {
			class61.testQtz395_CopyConstructorMustPreserveTimeZone();
		}
		catch (java.text.ParseException err145) {
			err145.printStackTrace();
		}
		try {
			class61.testSecRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err146) {
			err146.printStackTrace();
		}
		try {
			class61.testMinRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err147) {
			err147.printStackTrace();
		}
		try {
			class61.testHourRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err148) {
			err148.printStackTrace();
		}
		try {
			class61.testDayOfMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err149) {
			err149.printStackTrace();
		}
		try {
			class61.testMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err150) {
			err150.printStackTrace();
		}
		try {
			class61.testDayOfWeekRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err151) {
			err151.printStackTrace();
		}
		org.quartz.DateBuilderTest class62 = new org.quartz.DateBuilderTest();
		class62.testBasicBuilding();
		class62.testBuilder();
		class62.testEvensBuilders();
		class62.testGivenBuilders();
		class62.testAtBuilders();
		class62.testTranslate();
		class62.testMonthTranslations();
		org.quartz.InterruptableJobTest class63 = new org.quartz.InterruptableJobTest();
		try {
			class63.testJobInterruption();
		}
		catch (java.lang.Exception err152) {
			err152.printStackTrace();
		}
		org.quartz.AnnualCalendarTest class64 = new org.quartz.AnnualCalendarTest();
		class64.testDaysExcluded();
		class64.testExclude();
		class64.testDaysExcludedOverTime();
		class64.testRemoveInTheFuture();
	}
}