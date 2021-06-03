package org.quartz.simpl;

public class Driver {
	public void runall() {
		org.quartz.simpl.SystemPropertyInstanceIdGeneratorTest class1 = new org.quartz.simpl.SystemPropertyInstanceIdGeneratorTest();
		try {
			class1.testGetInstanceId();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testGetInstanceIdWithPrepend();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testGetInstanceIdWithPostpend();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testGetInstanceIdWithPrependAndPostpend();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testGetInstanceIdFromCustomSystemProperty();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testGeneratorThroughSchedulerInstatiation();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.quartz.simpl.PropertySettingJobFactoryTest class2 = new org.quartz.simpl.PropertySettingJobFactoryTest();
		try {
			class2.testSetBeanPropsPrimatives();
		}
		catch (org.quartz.SchedulerException err7) {
			err7.printStackTrace();
		}
		class2.testSetBeanPropsUnknownProperty();
		class2.testSetBeanPropsNullPrimative();
		try {
			class2.testSetBeanPropsNullNonPrimative();
		}
		catch (org.quartz.SchedulerException err8) {
			err8.printStackTrace();
		}
		class2.testSetBeanPropsWrongPrimativeType();
		class2.testSetBeanPropsWrongNonPrimativeType();
		class2.testSetBeanPropsCharStringTooShort();
		class2.testSetBeanPropsCharStringTooLong();
		try {
			class2.testSetBeanPropsFromStrings();
		}
		catch (org.quartz.SchedulerException err9) {
			err9.printStackTrace();
		}
	}
}