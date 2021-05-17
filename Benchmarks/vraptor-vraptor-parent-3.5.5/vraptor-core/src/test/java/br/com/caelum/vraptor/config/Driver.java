package br.com.caelum.vraptor.config;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.config.BasicConfigurationTest class1 = new br.com.caelum.vraptor.config.BasicConfigurationTest();
		class1.config();
		try {
			class1.shouldReadRootDirectoryAsWebinfClasses();
		}
		catch (javax.servlet.ServletException err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldUseSpringContainerAsDefaultProvider();
		}
		catch (javax.servlet.ServletException err2) {
			err2.printStackTrace();
		}
		try {
			class1.shouldUseGuiceAs1stAlternative();
		}
		catch (javax.servlet.ServletException err3) {
			err3.printStackTrace();
		}
		try {
			class1.shouldUsePicoAs2ndAlternative();
		}
		catch (javax.servlet.ServletException err4) {
			err4.printStackTrace();
		}
		try {
			class1.shouldThrowExceptionWhenProviderClassWasNotFound();
		}
		catch (javax.servlet.ServletException err5) {
			err5.printStackTrace();
		}
		try {
			class1.shouldThrowIllegalArgumentExceptionWhenProvidersWasNotFound();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.shouldReturnThatHasNoBasePackageWhenInitParamNull();
		}
		catch (javax.servlet.ServletException err7) {
			err7.printStackTrace();
		}
		class1.shouldThrowMissingConfigurationExceptionIfHasNoBasePackages();
		class1.testIfClasspathScanningIsEnabled();
		class1.testIfHasBasePackages();
		try {
			class1.shouldReturnBasePackagesWhenInitParamNotNull();
		}
		catch (javax.servlet.ServletException err8) {
			err8.printStackTrace();
		}
		try {
			class1.shouldReturnBasePackagesArrayWhenInitParamNotNullAndHasComas();
		}
		catch (javax.servlet.ServletException err9) {
			err9.printStackTrace();
		}
		try {
			class1.shouldReturnBasePackagesArrayWhenInitParamNotNullAndHasComasAndSpaces();
		}
		catch (javax.servlet.ServletException err10) {
			err10.printStackTrace();
		}
		try {
			class1.shouldReturnBasePackagesArrayWhenInitParamHasLeadingAndTrailingSpaces();
		}
		catch (javax.servlet.ServletException err11) {
			err11.printStackTrace();
		}
		try {
			class1.shouldAllowProviderOverriding();
		}
		catch (javax.servlet.ServletException err12) {
			err12.printStackTrace();
		}
		class1.shouldThrowInstantiationExceptionCauseIfThereIsSuchException();
		br.com.caelum.vraptor.config.ApplicationConfigurationTest class2 = new br.com.caelum.vraptor.config.ApplicationConfigurationTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class2.shouldNotUsePortWhenPortIs80();
		class2.shouldGiveFullUrlWithPortWhenPortIsNot80();
	}
}