package org.quartz.impl.calendar;

public class Driver {
	public void runall() {
		org.quartz.impl.calendar.DailyCalendarTest class1 = new org.quartz.impl.calendar.DailyCalendarTest();
		class1.testStringStartEndTimes();
		class1.testStringInvertTimeRange();
		org.quartz.impl.calendar.BaseCalendarTest class2 = new org.quartz.impl.calendar.BaseCalendarTest();
		class2.testClone();
	}
}