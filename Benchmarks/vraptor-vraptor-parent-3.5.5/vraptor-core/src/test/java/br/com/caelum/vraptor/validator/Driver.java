package br.com.caelum.vraptor.validator;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.validator.ReplicatorOutjectorTest class1 = new br.com.caelum.vraptor.validator.ReplicatorOutjectorTest();
		try {
			class1.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldReplicateMethodParametersToNextRequest();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		br.com.caelum.vraptor.validator.ValidationsTest class2 = new br.com.caelum.vraptor.validator.ValidationsTest();
		class2.setup();
		class2.canHandleTheSingleCheck();
		class2.shouldUseTheConstructorResourceBundle();
		class2.shouldUseTheConstructorResourceBundleFirst();
		class2.shouldFallbackToGivenResourceBundle();
		class2.shouldFallbackToDefaultMessage();
		class2.canHandleTheSingleCheckWhenProblematic();
		class2.canHandleInternalPrimitiveValidation();
		class2.should18nalizeParametersUsingConstructorBundle();
		class2.should18nalizeParametersUsingGivenBundle();
		class2.canIgnoreInternalPrimitiveValidationIfAlreadyNull();
		class2.executesInternalValidationIfSuccessful();
		class2.complainsAboutInternalPrimitiveValidation();
		class2.formatsParameterizedValidationMessagesWhenUsingMatchers();
		class2.formatsParameterizedValidationMessagesWithSeveralParametersI18ningStringParameters();
		class2.formatsParameterizedValidationMessagesWithI18nedStringParameters();
		class2.should18nalizeTheCategoryParameterUsingGivenBundle();
		class2.should18nalizeTheCategoryParameterUsingMatchersWithReasonGivenBundle();
		class2.should18nalizeTheCategoryParameterUsingMatchersWithoutReasonGivenBundle();
		class2.shouldAppendErrors();
		br.com.caelum.vraptor.validator.BeanValidatorTest class3 = new br.com.caelum.vraptor.validator.BeanValidatorTest();
		class3.setup();
		class3.withoutViolations();
		class3.shouldValidate();
		class3.shouldValidateWithMyLocale();
		class3.shouldValidateWithDefaultLocale();
		class3.shouldReturnEmptyCollectionIsBeanIsNull();
		class3.nullValidatorShouldNeverValidate();
		class3.shouldValidateOneSpecifiedGroup();
		class3.shouldValidateManySpecifiedGroups();
		class3.shouldValidateOnlySpecifiedProperties();
		class3.shouldThrowExceptionIfNoPropertiesWereSpecified();
		class3.shouldReturnEmptyCollectionIfBeanIsNullForValidationProperties();
		class3.shouldValidateSpecificPropertyOfSpecificValidationGroup();
		class3.shouldReturnEmptyCollectionWhenBeanIsNull();
		br.com.caelum.vraptor.validator.DefaultValidatorTest class4 = new br.com.caelum.vraptor.validator.DefaultValidatorTest();
		class4.setup();
		try {
			class4.shouldDoNothingWhenYouDontSpecifyTheValidationPage();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class4.outjectsTheRequestParameters();
		class4.addsTheErrorsOnTheResult();
		class4.forwardToCustomOnErrorPage();
		class4.shouldNotRedirectIfHasNotErrors();
		class4.shouldAddBeanValidatorErrorsIfPossible();
		class4.shouldAddBeanValidatorErrorsIfPossibleForSpecificProperties();
		class4.testThatValidatorGoToRedirectsToTheErrorPageImmediatellyAndNotBeforeThis();
		class4.shouldParametrizeMessage();
		try {
			class4.shouldSetBundleOnI18nMessagesLazily();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class4.shouldThrowIllegalStateExceptionIfI18nBundleHasNotBeenSet();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class4.shouldOnlySetBundleOnI18nMessagesThatHasNotBeenSetBefore();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		br.com.caelum.vraptor.validator.ValidatorAcceptanceTest class5 = new br.com.caelum.vraptor.validator.ValidatorAcceptanceTest();
		class5.setup();
		class5.validDataDoesntThrowException();
		br.com.caelum.vraptor.validator.MethodValidatorTest class6 = new br.com.caelum.vraptor.validator.MethodValidatorTest();
		try {
			class6.setup();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class6.shouldAcceptIfMethodHasConstraint();
		class6.shouldNotAcceptIfMethodHasConstraint();
		try {
			class6.shouldValidateMethodWithConstraint();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class6.shouldUseDefaultLocale();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class6.shouldValidateMethodWithTwoConstraints();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
	}
}