package org.quartz;

public class RootDriver {
	public static void main(String[] argv) {
		org.quartz.xml.Driver class1 = new org.quartz.xml.Driver();
		class1.runall();
		org.quartz.impl.matchers.Driver class2 = new org.quartz.impl.matchers.Driver();
		class2.runall();
		org.quartz.core.Driver class3 = new org.quartz.core.Driver();
		class3.runall();
		org.quartz.impl.calendar.Driver class4 = new org.quartz.impl.calendar.Driver();
		class4.runall();
		org.quartz.impl.Driver class5 = new org.quartz.impl.Driver();
		class5.runall();
		org.quartz.simpl.Driver class6 = new org.quartz.simpl.Driver();
		class6.runall();
		org.quartz.integrations.tests.Driver class7 = new org.quartz.integrations.tests.Driver();
		class7.runall();
		org.quartz.utils.Driver class8 = new org.quartz.utils.Driver();
		class8.runall();
		org.quartz.impl.triggers.Driver class9 = new org.quartz.impl.triggers.Driver();
		class9.runall();
		org.quartz.impl.jdbcjobstore.Driver class10 = new org.quartz.impl.jdbcjobstore.Driver();
		class10.runall();
		org.quartz.CronScheduleBuilderTest class11 = new org.quartz.CronScheduleBuilderTest();
		class11.testAtHourAndMinuteOnGivenDaysOfWeek();
		org.quartz.MonthlyCalendarTest class12 = new org.quartz.MonthlyCalendarTest();
		class12.testForInfiniteLoop();
		org.quartz.PriorityTest class13 = new org.quartz.PriorityTest();
		try {
			class13.testSameDefaultPriority();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class13.testDifferentPriority();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.quartz.JdbcSchedulerTest class14 = new org.quartz.JdbcSchedulerTest();
		org.quartz.Qtz205SchedulerListenerTest class15 = new org.quartz.Qtz205SchedulerListenerTest();
		try {
			class15.testTriggerFinalized();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.quartz.SimpleTriggerTest class16 = new org.quartz.SimpleTriggerTest();
		class16.testUpdateAfterMisfire();
		class16.testGetFireTimeAfter();
		class16.testClone();
		class16.testQuartz665();
		try {
			class16.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err4) {
			err4.printStackTrace();
		}
		org.quartz.FlakyJdbcSchedulerTest class17 = new org.quartz.FlakyJdbcSchedulerTest();
		try {
			class17.testTriggerFiring();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		org.quartz.JobDetailTest class18 = new org.quartz.JobDetailTest();
		class18.testClone();
		class18.testAnnotationDetection();
		org.quartz.Quartz601Test class19 = new org.quartz.Quartz601Test();
		class19.testNormal();
		class19.testSecond();
		class19.testMinute();
		class19.testHour();
		class19.testDayOfWeekNumber();
		class19.testDayOfWeek();
		class19.testDayOfMonth();
		class19.testMonth();
		class19.testAmbiguous();
		org.quartz.JobDataMapTest class20 = new org.quartz.JobDataMapTest();
		org.quartz.JobBuilderTest class21 = new org.quartz.JobBuilderTest();
		try {
			class21.testJobBuilder();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.quartz.DisallowConcurrentExecutionJobTest class22 = new org.quartz.DisallowConcurrentExecutionJobTest();
		try {
			class22.testNoConcurrentExecOnSameJob();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class22.testNoConcurrentExecOnSameJobWithBatching();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.quartz.TriggerBuilderTest class23 = new org.quartz.TriggerBuilderTest();
		try {
			class23.testTriggerBuilder();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class23.testTriggerBuilderWithEndTimePriorCurrrentTime();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		org.quartz.TriggerComparatorTest class24 = new org.quartz.TriggerComparatorTest();
		class24.testTriggerSort();
		class24.testTriggerTimeSort();
		org.quartz.RAMSchedulerTest class25 = new org.quartz.RAMSchedulerTest();
		org.quartz.CronTriggerTest class26 = new org.quartz.CronTriggerTest();
		try {
			class26.testClone();
		}
		catch (java.text.ParseException err11) {
			err11.printStackTrace();
		}
		try {
			class26.testQuartz558();
		}
		catch (java.text.ParseException err12) {
			err12.printStackTrace();
		}
		try {
			class26.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err13) {
			err13.printStackTrace();
		}
		org.quartz.CalendarIntervalTriggerTest class27 = new org.quartz.CalendarIntervalTriggerTest();
		class27.testQTZ331FireTimeAfterBoundary();
		class27.testQTZ330DaylightSavingsCornerCase();
		class27.testYearlyIntervalGetFireTimeAfter();
		class27.testMonthlyIntervalGetFireTimeAfter();
		class27.testWeeklyIntervalGetFireTimeAfter();
		class27.testDailyIntervalGetFireTimeAfter();
		class27.testHourlyIntervalGetFireTimeAfter();
		class27.testMinutelyIntervalGetFireTimeAfter();
		class27.testSecondlyIntervalGetFireTimeAfter();
		class27.testDaylightSavingsTransitions();
		class27.testFinalFireTimes();
		try {
			class27.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err14) {
			err14.printStackTrace();
		}
		org.quartz.DefaultSchedulerTest class28 = new org.quartz.DefaultSchedulerTest();
		try {
			class28.testAddJobNoTrigger();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		org.quartz.DailyTimeIntervalScheduleBuilderTest class29 = new org.quartz.DailyTimeIntervalScheduleBuilderTest();
		try {
			class29.testScheduleActualTrigger();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class29.testScheduleInMiddleOfDailyInterval();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		class29.testHourlyTrigger();
		class29.testMinutelyTriggerWithTimeOfDay();
		class29.testSecondlyTriggerWithStartAndEndTime();
		class29.testRepeatCountTrigger();
		class29.testEndingAtAfterCount();
		class29.testEndingAtAfterCountOf1();
		class29.testEndingAtAfterCountOf0();
		org.quartz.VersionTest class30 = new org.quartz.VersionTest();
		class30.testVersionParsing();
		org.quartz.CronExpressionTest class31 = new org.quartz.CronExpressionTest();
		try {
			class31.testIsSatisfiedBy();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class31.testLastDayOffset();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class31.testQuartz571();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class31.testQtz259();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class31.testQtz259LW();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		class31.testQuartz574();
		class31.testQuartz621();
		try {
			class31.testQuartz640();
		}
		catch (java.text.ParseException err23) {
			err23.printStackTrace();
		}
		try {
			class31.testQtz96();
		}
		catch (java.text.ParseException err24) {
			err24.printStackTrace();
		}
		try {
			class31.testQtz395_CopyConstructorMustPreserveTimeZone();
		}
		catch (java.text.ParseException err25) {
			err25.printStackTrace();
		}
		try {
			class31.testSecRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class31.testMinRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class31.testHourRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class31.testDayOfMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class31.testMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class31.testDayOfWeekRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		org.quartz.DateBuilderTest class32 = new org.quartz.DateBuilderTest();
		class32.testBasicBuilding();
		class32.testBuilder();
		class32.testEvensBuilders();
		class32.testGivenBuilders();
		class32.testAtBuilders();
		class32.testTranslate();
		class32.testMonthTranslations();
		org.quartz.InterruptableJobTest class33 = new org.quartz.InterruptableJobTest();
		try {
			class33.testJobInterruption();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		org.quartz.AnnualCalendarTest class34 = new org.quartz.AnnualCalendarTest();
		class34.testDaysExcluded();
		class34.testExclude();
		class34.testDaysExcludedOverTime();
		class34.testRemoveInTheFuture();
	}
}