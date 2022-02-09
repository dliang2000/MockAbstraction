package org.apache.maven.settings;

public class Driver {
	public void runall() {
		org.apache.maven.settings.PomConstructionWithSettingsTest class1 = new org.apache.maven.settings.PomConstructionWithSettingsTest();
		try {
			class1.testSettingsNoPom();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testPomAndSettingsInterpolation();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testRepositories();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		org.apache.maven.settings.SettingsUtilsTest class2 = new org.apache.maven.settings.SettingsUtilsTest();
		class2.testShouldAppendRecessivePluginGroupIds();
		class2.testRoundTripProfiles();
	}
}