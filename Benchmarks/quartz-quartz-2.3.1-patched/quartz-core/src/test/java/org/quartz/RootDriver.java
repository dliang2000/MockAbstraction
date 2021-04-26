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
		org.quartz.JobDetailTest class17 = new org.quartz.JobDetailTest();
		class17.testClone();
		class17.testAnnotationDetection();
		org.quartz.Quartz601Test class18 = new org.quartz.Quartz601Test();
		class18.testNormal();
		class18.testSecond();
		class18.testMinute();
		class18.testHour();
		class18.testDayOfWeekNumber();
		class18.testDayOfWeek();
		class18.testDayOfMonth();
		class18.testMonth();
		class18.testAmbiguous();
		org.quartz.JobDataMapTest class19 = new org.quartz.JobDataMapTest();
		org.quartz.JobBuilderTest class20 = new org.quartz.JobBuilderTest();
		try {
			class20.testJobBuilder();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		org.quartz.DisallowConcurrentExecutionJobTest class21 = new org.quartz.DisallowConcurrentExecutionJobTest();
		try {
			class21.testNoConcurrentExecOnSameJob();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class21.testNoConcurrentExecOnSameJobWithBatching();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		org.quartz.TriggerBuilderTest class22 = new org.quartz.TriggerBuilderTest();
		try {
			class22.testTriggerBuilder();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class22.testTriggerBuilderWithEndTimePriorCurrrentTime();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		org.quartz.TriggerComparatorTest class23 = new org.quartz.TriggerComparatorTest();
		class23.testTriggerSort();
		class23.testTriggerTimeSort();
		org.quartz.RAMSchedulerTest class24 = new org.quartz.RAMSchedulerTest();
		org.quartz.CronTriggerTest class25 = new org.quartz.CronTriggerTest();
		try {
			class25.testClone();
		}
		catch (java.text.ParseException err10) {
			err10.printStackTrace();
		}
		try {
			class25.testQuartz558();
		}
		catch (java.text.ParseException err11) {
			err11.printStackTrace();
		}
		try {
			class25.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err12) {
			err12.printStackTrace();
		}
		org.quartz.CalendarIntervalTriggerTest class26 = new org.quartz.CalendarIntervalTriggerTest();
		class26.testQTZ331FireTimeAfterBoundary();
		class26.testQTZ330DaylightSavingsCornerCase();
		class26.testYearlyIntervalGetFireTimeAfter();
		class26.testMonthlyIntervalGetFireTimeAfter();
		class26.testWeeklyIntervalGetFireTimeAfter();
		class26.testDailyIntervalGetFireTimeAfter();
		class26.testHourlyIntervalGetFireTimeAfter();
		class26.testMinutelyIntervalGetFireTimeAfter();
		class26.testSecondlyIntervalGetFireTimeAfter();
		class26.testDaylightSavingsTransitions();
		class26.testFinalFireTimes();
		try {
			class26.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err13) {
			err13.printStackTrace();
		}
		org.quartz.DefaultSchedulerTest class27 = new org.quartz.DefaultSchedulerTest();
		try {
			class27.testAddJobNoTrigger();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.quartz.DailyTimeIntervalScheduleBuilderTest class28 = new org.quartz.DailyTimeIntervalScheduleBuilderTest();
		try {
			class28.testScheduleActualTrigger();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class28.testScheduleInMiddleOfDailyInterval();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		class28.testHourlyTrigger();
		class28.testMinutelyTriggerWithTimeOfDay();
		class28.testSecondlyTriggerWithStartAndEndTime();
		class28.testRepeatCountTrigger();
		class28.testEndingAtAfterCount();
		class28.testEndingAtAfterCountOf1();
		class28.testEndingAtAfterCountOf0();
		org.quartz.VersionTest class29 = new org.quartz.VersionTest();
		class29.testVersionParsing();
		org.quartz.CronExpressionTest class30 = new org.quartz.CronExpressionTest();
		try {
			class30.testIsSatisfiedBy();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class30.testLastDayOffset();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class30.testQuartz571();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class30.testQtz259();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class30.testQtz259LW();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		class30.testQuartz574();
		class30.testQuartz621();
		try {
			class30.testQuartz640();
		}
		catch (java.text.ParseException err22) {
			err22.printStackTrace();
		}
		try {
			class30.testQtz96();
		}
		catch (java.text.ParseException err23) {
			err23.printStackTrace();
		}
		try {
			class30.testQtz395_CopyConstructorMustPreserveTimeZone();
		}
		catch (java.text.ParseException err24) {
			err24.printStackTrace();
		}
		try {
			class30.testSecRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class30.testMinRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class30.testHourRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class30.testDayOfMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class30.testMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class30.testDayOfWeekRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		org.quartz.DateBuilderTest class31 = new org.quartz.DateBuilderTest();
		class31.testBasicBuilding();
		class31.testBuilder();
		class31.testEvensBuilders();
		class31.testGivenBuilders();
		class31.testAtBuilders();
		class31.testTranslate();
		class31.testMonthTranslations();
		org.quartz.InterruptableJobTest class32 = new org.quartz.InterruptableJobTest();
		try {
			class32.testJobInterruption();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		org.quartz.AnnualCalendarTest class33 = new org.quartz.AnnualCalendarTest();
		class33.testDaysExcluded();
		class33.testExclude();
		class33.testDaysExcludedOverTime();
		class33.testRemoveInTheFuture();
	}
}