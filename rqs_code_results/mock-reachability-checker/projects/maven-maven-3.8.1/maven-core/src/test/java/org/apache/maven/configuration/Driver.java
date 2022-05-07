package org.apache.maven.configuration;

public class Driver {
	public void runall() {
		org.apache.maven.configuration.DefaultBeanConfiguratorTest class1 = new org.apache.maven.configuration.DefaultBeanConfiguratorTest();
		try {
			class1.testMinimal();
		}
		catch (org.apache.maven.configuration.BeanConfigurationException err1) {
			err1.printStackTrace();
		}
		try {
			class1.testPreAndPostProcessing();
		}
		catch (org.apache.maven.configuration.BeanConfigurationException err2) {
			err2.printStackTrace();
		}
		try {
			class1.testChildConfigurationElement();
		}
		catch (org.apache.maven.configuration.BeanConfigurationException err3) {
			err3.printStackTrace();
		}
	}
}