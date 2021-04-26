package org.quartz.impl.triggers;

public class Driver {
	public void runall() {
		org.quartz.impl.triggers.DailyTimeIntervalTriggerImplTest class1 = new org.quartz.impl.triggers.DailyTimeIntervalTriggerImplTest();
		try {
			class1.testNormalExample();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testQuartzCalendarExclusion();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testValidateTimeOfDayOrder();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testValidateInterval();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testStartTimeWithoutStartTimeOfDay();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testEndTimeWithoutEndTimeOfDay();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testStartTimeBeforeStartTimeOfDay();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testStartTimeBeforeStartTimeOfDayOnInvalidDay();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.testStartTimeAfterStartTimeOfDay();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.testEndTimeBeforeEndTimeOfDay();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.testEndTimeAfterEndTimeOfDay();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class1.testTimeOfDayWithStartTime();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class1.testTimeOfDayWithEndTime();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class1.testTimeOfDayWithEndTime2();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class1.testAllDaysOfTheWeek();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class1.testMonThroughFri();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class1.testSatAndSun();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class1.testMonOnly();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class1.testTimeOfDayWithEndTimeOddInterval();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class1.testHourInterval();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class1.testSecondInterval();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class1.testRepeatCountInf();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class1.testRepeatCount();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class1.testRepeatCount0();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class1.testGetFireTime();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class1.testGetFireTimeWithDateBeforeStartTime();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class1.testGetFireTimeWhenStartTimeAndTimeOfDayIsSame();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class1.testExtraConstructors();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
	}
}