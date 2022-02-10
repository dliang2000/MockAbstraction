package org.quartz.impl.jdbcjobstore;

public class Driver {
	public void runall() {
		org.quartz.impl.jdbcjobstore.DeleteNonExistsJobTest class1 = new org.quartz.impl.jdbcjobstore.DeleteNonExistsJobTest();
		try {
			class1.beforeClass();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.beforeTest();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.afterTest();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.deleteJobDetailOnly();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.deleteJobDetailWithTrigger();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.deleteTrigger();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.replaceJobDetail();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		org.quartz.impl.jdbcjobstore.StdJDBCDelegateTest class2 = new org.quartz.impl.jdbcjobstore.StdJDBCDelegateTest();
		try {
			class2.testSerializeJobData();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		catch (org.quartz.impl.jdbcjobstore.NoSuchDelegateException err9) {
			err9.printStackTrace();
		}
		try {
			class2.testSelectBlobTriggerWithNoBlobContent();
		}
		catch (org.quartz.JobPersistenceException err10) {
			err10.printStackTrace();
		}
		catch (java.sql.SQLException err11) {
			err11.printStackTrace();
		}
		catch (java.io.IOException err12) {
			err12.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err13) {
			err13.printStackTrace();
		}
		try {
			class2.testSelectSimpleTriggerWithExceptionWithExtendedProps();
		}
		catch (java.sql.SQLException err14) {
			err14.printStackTrace();
		}
		catch (org.quartz.JobPersistenceException err15) {
			err15.printStackTrace();
		}
		catch (java.io.IOException err16) {
			err16.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err17) {
			err17.printStackTrace();
		}
		try {
			class2.testSelectSimpleTriggerWithDeleteBeforeSelectExtendedProps();
		}
		catch (org.quartz.JobPersistenceException err18) {
			err18.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err19) {
			err19.printStackTrace();
		}
		catch (java.sql.SQLException err20) {
			err20.printStackTrace();
		}
		catch (java.io.IOException err21) {
			err21.printStackTrace();
		}
		org.quartz.impl.jdbcjobstore.UpdateLockRowSemaphoreTest class3 = new org.quartz.impl.jdbcjobstore.UpdateLockRowSemaphoreTest();
		try {
			class3.testSingleSuccessUsingUpdate();
		}
		catch (org.quartz.impl.jdbcjobstore.LockException err22) {
			err22.printStackTrace();
		}
		catch (java.sql.SQLException err23) {
			err23.printStackTrace();
		}
		try {
			class3.testSingleFailureFollowedBySuccessUsingUpdate();
		}
		catch (org.quartz.impl.jdbcjobstore.LockException err24) {
			err24.printStackTrace();
		}
		catch (java.sql.SQLException err25) {
			err25.printStackTrace();
		}
		try {
			class3.testDoubleFailureFollowedBySuccessUsingUpdate();
		}
		catch (org.quartz.impl.jdbcjobstore.LockException err26) {
			err26.printStackTrace();
		}
		catch (java.sql.SQLException err27) {
			err27.printStackTrace();
		}
		try {
			class3.testFallThroughToInsert();
		}
		catch (java.sql.SQLException err28) {
			err28.printStackTrace();
		}
		catch (org.quartz.impl.jdbcjobstore.LockException err29) {
			err29.printStackTrace();
		}
		org.quartz.impl.jdbcjobstore.JdbcJobStoreTest class4 = new org.quartz.impl.jdbcjobstore.JdbcJobStoreTest();
		class4.testNothing();
	}
}