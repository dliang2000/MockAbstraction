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
		org.quartz.Qtz205SchedulerListenerTest class14 = new org.quartz.Qtz205SchedulerListenerTest();
		try {
			class14.testTriggerFinalized();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.quartz.SimpleTriggerTest class15 = new org.quartz.SimpleTriggerTest();
		class15.testUpdateAfterMisfire();
		class15.testGetFireTimeAfter();
		class15.testClone();
		class15.testQuartz665();
		try {
			class15.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err4) {
			err4.printStackTrace();
		}
		org.quartz.FlakyJdbcSchedulerTest class16 = new org.quartz.FlakyJdbcSchedulerTest(0.0f,0.0f,0.0f);
		try {
			class16.testTriggerFiring();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
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
		org.quartz.JobBuilderTest class19 = new org.quartz.JobBuilderTest();
		try {
			class19.testJobBuilder();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.quartz.DisallowConcurrentExecutionJobTest class20 = new org.quartz.DisallowConcurrentExecutionJobTest();
		try {
			class20.testNoConcurrentExecOnSameJob();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class20.testNoConcurrentExecOnSameJobWithBatching();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		org.quartz.TriggerBuilderTest class21 = new org.quartz.TriggerBuilderTest();
		try {
			class21.testTriggerBuilder();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class21.testTriggerBuilderWithEndTimePriorCurrrentTime();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		org.quartz.TriggerComparatorTest class22 = new org.quartz.TriggerComparatorTest();
		class22.testTriggerSort();
		class22.testTriggerTimeSort();
		org.quartz.CronTriggerTest class23 = new org.quartz.CronTriggerTest();
		try {
			class23.testClone();
		}
		catch (java.text.ParseException err11) {
			err11.printStackTrace();
		}
		try {
			class23.testQuartz558();
		}
		catch (java.text.ParseException err12) {
			err12.printStackTrace();
		}
		try {
			class23.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err13) {
			err13.printStackTrace();
		}
		org.quartz.CalendarIntervalTriggerTest class24 = new org.quartz.CalendarIntervalTriggerTest();
		class24.testQTZ331FireTimeAfterBoundary();
		class24.testQTZ330DaylightSavingsCornerCase();
		class24.testYearlyIntervalGetFireTimeAfter();
		class24.testMonthlyIntervalGetFireTimeAfter();
		class24.testWeeklyIntervalGetFireTimeAfter();
		class24.testDailyIntervalGetFireTimeAfter();
		class24.testHourlyIntervalGetFireTimeAfter();
		class24.testMinutelyIntervalGetFireTimeAfter();
		class24.testSecondlyIntervalGetFireTimeAfter();
		class24.testDaylightSavingsTransitions();
		class24.testFinalFireTimes();
		try {
			class24.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err14) {
			err14.printStackTrace();
		}
		org.quartz.DefaultSchedulerTest class25 = new org.quartz.DefaultSchedulerTest();
		try {
			class25.testAddJobNoTrigger();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		org.quartz.DailyTimeIntervalScheduleBuilderTest class26 = new org.quartz.DailyTimeIntervalScheduleBuilderTest();
		try {
			class26.testScheduleActualTrigger();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class26.testScheduleInMiddleOfDailyInterval();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		class26.testHourlyTrigger();
		class26.testMinutelyTriggerWithTimeOfDay();
		class26.testSecondlyTriggerWithStartAndEndTime();
		class26.testRepeatCountTrigger();
		class26.testEndingAtAfterCount();
		class26.testEndingAtAfterCountOf1();
		class26.testEndingAtAfterCountOf0();
		org.quartz.VersionTest class27 = new org.quartz.VersionTest();
		class27.testVersionParsing();
		org.quartz.CronExpressionTest class28 = new org.quartz.CronExpressionTest();
		try {
			class28.testIsSatisfiedBy();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class28.testLastDayOffset();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class28.testQuartz571();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class28.testQtz259();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class28.testQtz259LW();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		class28.testQuartz574();
		class28.testQuartz621();
		try {
			class28.testQuartz640();
		}
		catch (java.text.ParseException err23) {
			err23.printStackTrace();
		}
		try {
			class28.testQtz96();
		}
		catch (java.text.ParseException err24) {
			err24.printStackTrace();
		}
		try {
			class28.testQtz395_CopyConstructorMustPreserveTimeZone();
		}
		catch (java.text.ParseException err25) {
			err25.printStackTrace();
		}
		try {
			class28.testSecRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class28.testMinRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class28.testHourRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class28.testDayOfMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class28.testMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class28.testDayOfWeekRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		org.quartz.DateBuilderTest class29 = new org.quartz.DateBuilderTest();
		class29.testBasicBuilding();
		class29.testBuilder();
		class29.testEvensBuilders();
		class29.testGivenBuilders();
		class29.testAtBuilders();
		class29.testTranslate();
		class29.testMonthTranslations();
		org.quartz.InterruptableJobTest class30 = new org.quartz.InterruptableJobTest();
		try {
			class30.testJobInterruption();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		org.quartz.AnnualCalendarTest class31 = new org.quartz.AnnualCalendarTest();
		class31.testDaysExcluded();
		class31.testExclude();
		class31.testDaysExcludedOverTime();
		class31.testRemoveInTheFuture();
	}
}