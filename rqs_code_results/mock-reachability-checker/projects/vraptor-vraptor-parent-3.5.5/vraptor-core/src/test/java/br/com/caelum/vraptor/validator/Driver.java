package br.com.caelum.vraptor.validator;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.validator.ValidationsTest class1 = new br.com.caelum.vraptor.validator.ValidationsTest();
		class1.setup();
		class1.canHandleTheSingleCheck();
		class1.shouldUseTheConstructorResourceBundle();
		class1.shouldUseTheConstructorResourceBundleFirst();
		class1.shouldFallbackToGivenResourceBundle();
		class1.shouldFallbackToDefaultMessage();
		class1.canHandleTheSingleCheckWhenProblematic();
		class1.canHandleInternalPrimitiveValidation();
		class1.should18nalizeParametersUsingConstructorBundle();
		class1.should18nalizeParametersUsingGivenBundle();
		class1.canIgnoreInternalPrimitiveValidationIfAlreadyNull();
		class1.executesInternalValidationIfSuccessful();
		class1.complainsAboutInternalPrimitiveValidation();
		class1.formatsParameterizedValidationMessagesWhenUsingMatchers();
		class1.formatsParameterizedValidationMessagesWithSeveralParametersI18ningStringParameters();
		class1.formatsParameterizedValidationMessagesWithI18nedStringParameters();
		class1.should18nalizeTheCategoryParameterUsingGivenBundle();
		class1.should18nalizeTheCategoryParameterUsingMatchersWithReasonGivenBundle();
		class1.should18nalizeTheCategoryParameterUsingMatchersWithoutReasonGivenBundle();
		class1.shouldAppendErrors();
		br.com.caelum.vraptor.validator.ValidatorAcceptanceTest class2 = new br.com.caelum.vraptor.validator.ValidatorAcceptanceTest();
		class2.setup();
		class2.validDataDoesntThrowException();
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
		br.com.caelum.vraptor.validator.MethodValidatorTest class4 = new br.com.caelum.vraptor.validator.MethodValidatorTest();
		try {
			class4.setup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class4.shouldAcceptIfMethodHasConstraint();
		class4.shouldNotAcceptIfMethodHasConstraint();
		try {
			class4.shouldValidateMethodWithConstraint();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class4.shouldUseDefaultLocale();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class4.shouldValidateMethodWithTwoConstraints();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		br.com.caelum.vraptor.validator.ReplicatorOutjectorTest class5 = new br.com.caelum.vraptor.validator.ReplicatorOutjectorTest();
		try {
			class5.setUp();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class5.shouldReplicateMethodParametersToNextRequest();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		br.com.caelum.vraptor.validator.DefaultValidatorTest class6 = new br.com.caelum.vraptor.validator.DefaultValidatorTest();
		class6.setup();
		try {
			class6.shouldDoNothingWhenYouDontSpecifyTheValidationPage();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class6.outjectsTheRequestParameters();
		class6.addsTheErrorsOnTheResult();
		class6.forwardToCustomOnErrorPage();
		class6.shouldNotRedirectIfHasNotErrors();
		class6.shouldAddBeanValidatorErrorsIfPossible();
		class6.shouldAddBeanValidatorErrorsIfPossibleForSpecificProperties();
		class6.testThatValidatorGoToRedirectsToTheErrorPageImmediatellyAndNotBeforeThis();
		class6.shouldParametrizeMessage();
		try {
			class6.shouldSetBundleOnI18nMessagesLazily();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class6.shouldThrowIllegalStateExceptionIfI18nBundleHasNotBeenSet();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class6.shouldOnlySetBundleOnI18nMessagesThatHasNotBeenSetBefore();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
	}
}