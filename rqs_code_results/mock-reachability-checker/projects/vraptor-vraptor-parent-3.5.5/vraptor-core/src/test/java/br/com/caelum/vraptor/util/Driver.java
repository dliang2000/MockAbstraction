package br.com.caelum.vraptor.util;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.util.ISO8601UtilTest class1 = new br.com.caelum.vraptor.util.ISO8601UtilTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldParseDateExtendFormat();
		}
		catch (java.text.ParseException err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldParseDateBasicFormat();
		}
		catch (java.text.ParseException err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldParseDateTimeExtendFormat();
		}
		catch (java.text.ParseException err4) {
			err4.printStackTrace();
		}
		try {
			class1.shouldParseDateTimeBasicFormat();
		}
		catch (java.text.ParseException err5) {
			err5.printStackTrace();
		}
		try {
			class1.shouldParseDateTimeExtendFormatUTC();
		}
		catch (java.text.ParseException err6) {
			err6.printStackTrace();
		}
		try {
			class1.expectParseExceptionOnDateWithBars();
		}
		catch (java.text.ParseException err7) {
			err7.printStackTrace();
		}
		try {
			class1.shouldParseCalendarToIso8601AndReconverToCalendarBrasiliaZone();
		}
		catch (java.text.ParseException err8) {
			err8.printStackTrace();
		}
		try {
			class1.shouldParseCalendarToIso8601AndReconverToCalendarUTCZone();
		}
		catch (java.text.ParseException err9) {
			err9.printStackTrace();
		}
		br.com.caelum.vraptor.util.StringnifierTest class2 = new br.com.caelum.vraptor.util.StringnifierTest();
		try {
			class2.returnSimpleNameOfMethodWithoutArguments();
		}
		catch (java.lang.SecurityException err10) {
			err10.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err11) {
			err11.printStackTrace();
		}
		try {
			class2.returnSimpleNameOConstructorWithoutArguments();
		}
		catch (java.lang.SecurityException err12) {
			err12.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err13) {
			err13.printStackTrace();
		}
		try {
			class2.returnSimpleNameOfMethodWithArguments();
		}
		catch (java.lang.SecurityException err14) {
			err14.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err15) {
			err15.printStackTrace();
		}
		try {
			class2.returnSimpleNameOfMethodWithArgumentsGenerics();
		}
		catch (java.lang.SecurityException err16) {
			err16.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err17) {
			err17.printStackTrace();
		}
	}
}