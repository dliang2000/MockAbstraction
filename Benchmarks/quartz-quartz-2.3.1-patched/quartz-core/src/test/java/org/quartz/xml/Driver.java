package org.quartz.xml;

public class Driver {
	public void runall() {
		org.quartz.xml.XMLSchedulingDataProcessorTest class1 = new org.quartz.xml.XMLSchedulingDataProcessorTest();
		try {
			class1.testOverwriteFlag();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testDirectivesNoOverwriteWithIgnoreDups();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testDirectivesOverwriteWithNoIgnoreDups();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testXsdSchemaValidationOnVariousTriggers();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testQTZ327SimpleTriggerNoRepeat();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testTimeZones();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testRemoveJobClassNotFound();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testOverwriteJobClassNotFound();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
	}
}