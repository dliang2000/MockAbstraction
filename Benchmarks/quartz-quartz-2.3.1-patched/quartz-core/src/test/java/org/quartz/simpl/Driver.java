package org.quartz.simpl;

public class Driver {
	public void runall() {
		org.quartz.simpl.RAMJobStoreTest class1 = new org.quartz.simpl.RAMJobStoreTest();
		org.quartz.simpl.SystemPropertyInstanceIdGeneratorTest class2 = new org.quartz.simpl.SystemPropertyInstanceIdGeneratorTest();
		try {
			class2.testGetInstanceId();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.testGetInstanceIdWithPrepend();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testGetInstanceIdWithPostpend();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testGetInstanceIdWithPrependAndPostpend();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.testGetInstanceIdFromCustomSystemProperty();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.testGeneratorThroughSchedulerInstatiation();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.quartz.simpl.PropertySettingJobFactoryTest class3 = new org.quartz.simpl.PropertySettingJobFactoryTest();
		try {
			class3.testSetBeanPropsPrimatives();
		}
		catch (org.quartz.SchedulerException err7) {
			err7.printStackTrace();
		}
		class3.testSetBeanPropsUnknownProperty();
		class3.testSetBeanPropsNullPrimative();
		try {
			class3.testSetBeanPropsNullNonPrimative();
		}
		catch (org.quartz.SchedulerException err8) {
			err8.printStackTrace();
		}
		class3.testSetBeanPropsWrongPrimativeType();
		class3.testSetBeanPropsWrongNonPrimativeType();
		class3.testSetBeanPropsCharStringTooShort();
		class3.testSetBeanPropsCharStringTooLong();
		try {
			class3.testSetBeanPropsFromStrings();
		}
		catch (org.quartz.SchedulerException err9) {
			err9.printStackTrace();
		}
	}
}