package org.apache.maven.settings;

public class Driver {
	public void runall() {
		org.apache.maven.settings.SettingsUtilsTest class1 = new org.apache.maven.settings.SettingsUtilsTest();
		class1.testShouldAppendRecessivePluginGroupIds();
		class1.testRoundTripProfiles();
		org.apache.maven.settings.PomConstructionWithSettingsTest class2 = new org.apache.maven.settings.PomConstructionWithSettingsTest();
		try {
			class2.testSettingsNoPom();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.testPomAndSettingsInterpolation();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.testRepositories();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
	}
}