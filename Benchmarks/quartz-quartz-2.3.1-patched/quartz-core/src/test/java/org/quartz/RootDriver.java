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
		org.quartz.simpl.Driver class5 = new org.quartz.simpl.Driver();
		class5.runall();
		org.quartz.impl.Driver class6 = new org.quartz.impl.Driver();
		class6.runall();
		org.quartz.integrations.tests.Driver class7 = new org.quartz.integrations.tests.Driver();
		class7.runall();
		org.quartz.utils.Driver class8 = new org.quartz.utils.Driver();
		class8.runall();
		org.quartz.impl.triggers.Driver class9 = new org.quartz.impl.triggers.Driver();
		class9.runall();
		org.quartz.impl.jdbcjobstore.Driver class10 = new org.quartz.impl.jdbcjobstore.Driver();
		class10.runall();
		org.quartz.JobDetailTest class11 = new org.quartz.JobDetailTest();
		class11.testClone();
		class11.testAnnotationDetection();
		org.quartz.Quartz601Test class12 = new org.quartz.Quartz601Test();
		class12.testNormal();
		class12.testSecond();
		class12.testMinute();
		class12.testHour();
		class12.testDayOfWeekNumber();
		class12.testDayOfWeek();
		class12.testDayOfMonth();
		class12.testMonth();
		class12.testAmbiguous();
		org.quartz.DateBuilderTest class13 = new org.quartz.DateBuilderTest();
		class13.testBasicBuilding();
		class13.testBuilder();
		class13.testEvensBuilders();
		class13.testGivenBuilders();
		class13.testAtBuilders();
		class13.testTranslate();
		class13.testMonthTranslations();
		org.quartz.SimpleTriggerTest class14 = new org.quartz.SimpleTriggerTest();
		class14.testUpdateAfterMisfire();
		class14.testGetFireTimeAfter();
		class14.testClone();
		class14.testQuartz665();
		try {
			class14.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err1) {
			err1.printStackTrace();
		}
		org.quartz.DailyTimeIntervalScheduleBuilderTest class15 = new org.quartz.DailyTimeIntervalScheduleBuilderTest();
		try {
			class15.testScheduleActualTrigger();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class15.testScheduleInMiddleOfDailyInterval();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class15.testHourlyTrigger();
		class15.testMinutelyTriggerWithTimeOfDay();
		class15.testSecondlyTriggerWithStartAndEndTime();
		class15.testRepeatCountTrigger();
		class15.testEndingAtAfterCount();
		class15.testEndingAtAfterCountOf1();
		class15.testEndingAtAfterCountOf0();
		org.quartz.JobBuilderTest class16 = new org.quartz.JobBuilderTest();
		try {
			class16.testJobBuilder();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.quartz.AnnualCalendarTest class17 = new org.quartz.AnnualCalendarTest();
		class17.testDaysExcluded();
		class17.testExclude();
		class17.testDaysExcludedOverTime();
		class17.testRemoveInTheFuture();
		org.quartz.DisallowConcurrentExecutionJobTest class18 = new org.quartz.DisallowConcurrentExecutionJobTest();
		try {
			class18.testNoConcurrentExecOnSameJob();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class18.testNoConcurrentExecOnSameJobWithBatching();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.quartz.CronExpressionTest class19 = new org.quartz.CronExpressionTest();
		try {
			class19.testIsSatisfiedBy();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class19.testLastDayOffset();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class19.testQuartz571();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class19.testQtz259();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class19.testQtz259LW();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		class19.testQuartz574();
		class19.testQuartz621();
		try {
			class19.testQuartz640();
		}
		catch (java.text.ParseException err12) {
			err12.printStackTrace();
		}
		try {
			class19.testQtz96();
		}
		catch (java.text.ParseException err13) {
			err13.printStackTrace();
		}
		try {
			class19.testQtz395_CopyConstructorMustPreserveTimeZone();
		}
		catch (java.text.ParseException err14) {
			err14.printStackTrace();
		}
		try {
			class19.testSecRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class19.testMinRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class19.testHourRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class19.testDayOfMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class19.testMonthRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class19.testDayOfWeekRangeIntervalAfterSlash();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		org.quartz.TriggerComparatorTest class20 = new org.quartz.TriggerComparatorTest();
		class20.testTriggerSort();
		class20.testTriggerTimeSort();
		org.quartz.FlakyJdbcSchedulerTest class21 = new org.quartz.FlakyJdbcSchedulerTest(0.0f,0.0f,0.0f);
		try {
			class21.testTriggerFiring();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		org.quartz.CronTriggerTest class22 = new org.quartz.CronTriggerTest();
		try {
			class22.testClone();
		}
		catch (java.text.ParseException err22) {
			err22.printStackTrace();
		}
		try {
			class22.testQuartz558();
		}
		catch (java.text.ParseException err23) {
			err23.printStackTrace();
		}
		try {
			class22.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err24) {
			err24.printStackTrace();
		}
		org.quartz.TriggerBuilderTest class23 = new org.quartz.TriggerBuilderTest();
		try {
			class23.testTriggerBuilder();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class23.testTriggerBuilderWithEndTimePriorCurrrentTime();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		org.quartz.DefaultSchedulerTest class24 = new org.quartz.DefaultSchedulerTest();
		try {
			class24.testAddJobNoTrigger();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		org.quartz.PriorityTest class25 = new org.quartz.PriorityTest();
		try {
			class25.testSameDefaultPriority();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class25.testDifferentPriority();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		org.quartz.CronScheduleBuilderTest class26 = new org.quartz.CronScheduleBuilderTest();
		class26.testAtHourAndMinuteOnGivenDaysOfWeek();
		org.quartz.MonthlyCalendarTest class27 = new org.quartz.MonthlyCalendarTest();
		class27.testForInfiniteLoop();
		org.quartz.Qtz205SchedulerListenerTest class28 = new org.quartz.Qtz205SchedulerListenerTest();
		try {
			class28.testTriggerFinalized();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		org.quartz.VersionTest class29 = new org.quartz.VersionTest();
		class29.testVersionParsing();
		org.quartz.InterruptableJobTest class30 = new org.quartz.InterruptableJobTest();
		try {
			class30.testJobInterruption();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		org.quartz.CalendarIntervalTriggerTest class31 = new org.quartz.CalendarIntervalTriggerTest();
		class31.testQTZ331FireTimeAfterBoundary();
		class31.testQTZ330DaylightSavingsCornerCase();
		class31.testYearlyIntervalGetFireTimeAfter();
		class31.testMonthlyIntervalGetFireTimeAfter();
		class31.testWeeklyIntervalGetFireTimeAfter();
		class31.testDailyIntervalGetFireTimeAfter();
		class31.testHourlyIntervalGetFireTimeAfter();
		class31.testMinutelyIntervalGetFireTimeAfter();
		class31.testSecondlyIntervalGetFireTimeAfter();
		class31.testDaylightSavingsTransitions();
		class31.testFinalFireTimes();
		try {
			class31.testMisfireInstructionValidity();
		}
		catch (java.text.ParseException err32) {
			err32.printStackTrace();
		}
	}
}