package br.com.caelum.vraptor.config;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.config.ApplicationConfigurationTest class1 = new br.com.caelum.vraptor.config.ApplicationConfigurationTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldNotUsePortWhenPortIs80();
		class1.shouldGiveFullUrlWithPortWhenPortIsNot80();
		br.com.caelum.vraptor.config.BasicConfigurationTest class2 = new br.com.caelum.vraptor.config.BasicConfigurationTest();
		class2.config();
		try {
			class2.shouldReadRootDirectoryAsWebinfClasses();
		}
		catch (javax.servlet.ServletException err2) {
			err2.printStackTrace();
		}
		try {
			class2.shouldUseSpringContainerAsDefaultProvider();
		}
		catch (javax.servlet.ServletException err3) {
			err3.printStackTrace();
		}
		try {
			class2.shouldUseGuiceAs1stAlternative();
		}
		catch (javax.servlet.ServletException err4) {
			err4.printStackTrace();
		}
		try {
			class2.shouldUsePicoAs2ndAlternative();
		}
		catch (javax.servlet.ServletException err5) {
			err5.printStackTrace();
		}
		try {
			class2.shouldThrowExceptionWhenProviderClassWasNotFound();
		}
		catch (javax.servlet.ServletException err6) {
			err6.printStackTrace();
		}
		try {
			class2.shouldThrowIllegalArgumentExceptionWhenProvidersWasNotFound();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.shouldReturnThatHasNoBasePackageWhenInitParamNull();
		}
		catch (javax.servlet.ServletException err8) {
			err8.printStackTrace();
		}
		class2.shouldThrowMissingConfigurationExceptionIfHasNoBasePackages();
		class2.testIfClasspathScanningIsEnabled();
		class2.testIfHasBasePackages();
		try {
			class2.shouldReturnBasePackagesWhenInitParamNotNull();
		}
		catch (javax.servlet.ServletException err9) {
			err9.printStackTrace();
		}
		try {
			class2.shouldReturnBasePackagesArrayWhenInitParamNotNullAndHasComas();
		}
		catch (javax.servlet.ServletException err10) {
			err10.printStackTrace();
		}
		try {
			class2.shouldReturnBasePackagesArrayWhenInitParamNotNullAndHasComasAndSpaces();
		}
		catch (javax.servlet.ServletException err11) {
			err11.printStackTrace();
		}
		try {
			class2.shouldReturnBasePackagesArrayWhenInitParamHasLeadingAndTrailingSpaces();
		}
		catch (javax.servlet.ServletException err12) {
			err12.printStackTrace();
		}
		try {
			class2.shouldAllowProviderOverriding();
		}
		catch (javax.servlet.ServletException err13) {
			err13.printStackTrace();
		}
		class2.shouldThrowInstantiationExceptionCauseIfThereIsSuchException();
	}
}