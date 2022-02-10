package org.quartz.impl.calendar;

public class Driver {
	public void runall() {
		org.quartz.impl.calendar.BaseCalendarTest class1 = new org.quartz.impl.calendar.BaseCalendarTest();
		class1.testClone();
		org.quartz.impl.calendar.DailyCalendarTest class2 = new org.quartz.impl.calendar.DailyCalendarTest();
		class2.testStringStartEndTimes();
		class2.testStringInvertTimeRange();
	}
}