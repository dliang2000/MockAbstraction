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
		br.com.caelum.vraptor.validator.SingletonResourceBundle class2 = new br.com.caelum.vraptor.validator.SingletonResourceBundle();
		br.com.caelum.vraptor.validator.ValidationsTest class3 = new br.com.caelum.vraptor.validator.ValidationsTest();
		class3.setup();
		class3.canHandleTheSingleCheck();
		class3.shouldUseTheConstructorResourceBundle();
		class3.shouldUseTheConstructorResourceBundleFirst();
		class3.shouldFallbackToGivenResourceBundle();
		class3.shouldFallbackToDefaultMessage();
		class3.canHandleTheSingleCheckWhenProblematic();
		class3.canHandleInternalPrimitiveValidation();
		class3.should18nalizeParametersUsingConstructorBundle();
		class3.should18nalizeParametersUsingGivenBundle();
		class3.canIgnoreInternalPrimitiveValidationIfAlreadyNull();
		class3.executesInternalValidationIfSuccessful();
		class3.complainsAboutInternalPrimitiveValidation();
		class3.formatsParameterizedValidationMessagesWhenUsingMatchers();
		class3.formatsParameterizedValidationMessagesWithSeveralParametersI18ningStringParameters();
		class3.formatsParameterizedValidationMessagesWithI18nedStringParameters();
		class3.should18nalizeTheCategoryParameterUsingGivenBundle();
		class3.should18nalizeTheCategoryParameterUsingMatchersWithReasonGivenBundle();
		class3.should18nalizeTheCategoryParameterUsingMatchersWithoutReasonGivenBundle();
		class3.shouldAppendErrors();
		br.com.caelum.vraptor.validator.BeanValidatorTest class4 = new br.com.caelum.vraptor.validator.BeanValidatorTest();
		class4.setup();
		class4.withoutViolations();
		class4.shouldValidate();
		class4.shouldValidateWithMyLocale();
		class4.shouldValidateWithDefaultLocale();
		class4.shouldReturnEmptyCollectionIsBeanIsNull();
		class4.nullValidatorShouldNeverValidate();
		class4.shouldValidateOneSpecifiedGroup();
		class4.shouldValidateManySpecifiedGroups();
		class4.shouldValidateOnlySpecifiedProperties();
		class4.shouldThrowExceptionIfNoPropertiesWereSpecified();
		class4.shouldReturnEmptyCollectionIfBeanIsNullForValidationProperties();
		class4.shouldValidateSpecificPropertyOfSpecificValidationGroup();
		class4.shouldReturnEmptyCollectionWhenBeanIsNull();
		br.com.caelum.vraptor.validator.DefaultValidatorTest class5 = new br.com.caelum.vraptor.validator.DefaultValidatorTest();
		class5.setup();
		try {
			class5.shouldDoNothingWhenYouDontSpecifyTheValidationPage();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class5.outjectsTheRequestParameters();
		class5.addsTheErrorsOnTheResult();
		class5.forwardToCustomOnErrorPage();
		class5.shouldNotRedirectIfHasNotErrors();
		class5.shouldAddBeanValidatorErrorsIfPossible();
		class5.shouldAddBeanValidatorErrorsIfPossibleForSpecificProperties();
		class5.testThatValidatorGoToRedirectsToTheErrorPageImmediatellyAndNotBeforeThis();
		class5.shouldParametrizeMessage();
		try {
			class5.shouldSetBundleOnI18nMessagesLazily();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class5.shouldThrowIllegalStateExceptionIfI18nBundleHasNotBeenSet();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class5.shouldOnlySetBundleOnI18nMessagesThatHasNotBeenSetBefore();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		br.com.caelum.vraptor.validator.ValidatorAcceptanceTest class6 = new br.com.caelum.vraptor.validator.ValidatorAcceptanceTest();
		class6.setup();
		class6.validDataDoesntThrowException();
		br.com.caelum.vraptor.validator.MethodValidatorTest class7 = new br.com.caelum.vraptor.validator.MethodValidatorTest();
		try {
			class7.setup();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class7.shouldAcceptIfMethodHasConstraint();
		class7.shouldNotAcceptIfMethodHasConstraint();
		try {
			class7.shouldValidateMethodWithConstraint();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class7.shouldUseDefaultLocale();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class7.shouldValidateMethodWithTwoConstraints();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
	}
}