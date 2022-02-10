package br.com.caelum.vraptor.http.route;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.http.route.PathAnnotationRoutesParserTest class1 = new br.com.caelum.vraptor.http.route.PathAnnotationRoutesParserTest();
		class1.setup();
		try {
			class1.addsAPrefixToMethodsWhenTheControllerHasMoreThanOneAnnotatedPath();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheControllerAndTheMethodAreAnnotatedWithRelativePath();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheControllerEndsWithSlashAndTheMethodAreAnnotatedWithRelativePath();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheControllerEndsWithSlashAndTheMethodAreAnnotatedWithAbsolutePath();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheControllerEndsWithSlashAndTheMethodAreAnnotatedWithEmptyPath();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheControllerAndTheMethodAreAnnotatedWithAbsolutePath();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheControllerAndTheMethodAreAnnotatedWithEmptyPath();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheControllerIsAnnotatedWithPath();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.findsTheCorrectAnnotatedMethodIfThereIsNoWebMethodAnnotationPresent();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.suportsTheDefaultNameForANonAnnotatedMethod();
		}
		catch (java.lang.SecurityException err10) {
			err10.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err11) {
			err11.printStackTrace();
		}
		try {
			class1.ignoresTheControllerSuffixForANonAnnotatedMethod();
		}
		catch (java.lang.SecurityException err12) {
			err12.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err13) {
			err13.printStackTrace();
		}
		try {
			class1.addsASlashWhenUserForgotIt();
		}
		catch (java.lang.SecurityException err14) {
			err14.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err15) {
			err15.printStackTrace();
		}
		try {
			class1.matchesWhenUsingAWildcard();
		}
		catch (java.lang.SecurityException err16) {
			err16.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err17) {
			err17.printStackTrace();
		}
		class1.dontRegisterRouteIfMethodIsNotPublic();
		class1.dontRegisterRouteIfMethodIsStatic();
		try {
			class1.shouldThrowExceptionIfPathAnnotationHasEmptyArray();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class1.shouldFindNonAnnotatedNonStaticPublicMethodWithComponentNameInVariableCamelCaseConventionAsURI();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class1.shouldFindSeveralPathsForMethodWithManyValue();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class1.shouldNotMatchIfAResourceHasTheWrongWebMethod();
		}
		catch (java.lang.SecurityException err21) {
			err21.printStackTrace();
		}
		try {
			class1.shouldAcceptAResultWithASpecificWebMethod();
		}
		catch (java.lang.SecurityException err22) {
			err22.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err23) {
			err23.printStackTrace();
		}
		try {
			class1.shouldAcceptAResultWithOptionsWebMethod();
		}
		catch (java.lang.SecurityException err24) {
			err24.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err25) {
			err25.printStackTrace();
		}
		try {
			class1.shouldAcceptAResultWithPatchWebMethod();
		}
		catch (java.lang.SecurityException err26) {
			err26.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err27) {
			err27.printStackTrace();
		}
		try {
			class1.findsInheritedMethodsWithDefaultNames();
		}
		catch (java.lang.SecurityException err28) {
			err28.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err29) {
			err29.printStackTrace();
		}
		try {
			class1.supportMethodOverriding();
		}
		catch (java.lang.SecurityException err30) {
			err30.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err31) {
			err31.printStackTrace();
		}
		try {
			class1.supportTypeHttpMethodAnnotation();
		}
		catch (java.lang.SecurityException err32) {
			err32.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err33) {
			err33.printStackTrace();
		}
		try {
			class1.supportOverrideTypeHttpMethodAnnotation();
		}
		catch (java.lang.SecurityException err34) {
			err34.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err35) {
			err35.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheGetControllerAndTheMethodAreAnnotatedWithRelativePath();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class1.priorityForGetAnnotationShouldBeDefault();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheGetControllerEndsWithSlashAndTheMethodAreAnnotatedWithRelativePath();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheGetControllerEndsWithSlashAndTheMethodAreAnnotatedWithAbsolutePath();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheGetControllerAndTheMethodAreAnnotatedWithAbsolutePath();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class1.addsAPrefixToMethodsWhenTheGetControllerIsAnnotatedWithPath();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class1.throwsExceptionWhenTheGetControllerHasAmbiguousDeclaration();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.DefaultRouterTest class2 = new br.com.caelum.vraptor.http.route.DefaultRouterTest();
		class2.setup();
		try {
			class2.shouldThrowResourceNotFoundExceptionWhenNoRoutesMatchTheURI();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class2.shouldThrowMethodNotAllowedExceptionWhenNoRoutesMatchTheURIWithGivenHttpMethod();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class2.shouldObeyPriorityOfRoutes();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		try {
			class2.acceptsASingleMappingRule();
		}
		catch (java.lang.SecurityException err46) {
			err46.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err47) {
			err47.printStackTrace();
		}
		try {
			class2.passesTheWebMethod();
		}
		catch (java.lang.SecurityException err48) {
			err48.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err49) {
			err49.printStackTrace();
		}
		try {
			class2.usesTheFirstRegisteredRuleMatchingThePattern();
		}
		catch (java.lang.SecurityException err50) {
			err50.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err51) {
			err51.printStackTrace();
		}
		class2.throwsExceptionIfMoreThanOneUriMatchesWithSamePriority();
		try {
			class2.acceptsAnHttpMethodLimitedMappingRule();
		}
		catch (java.lang.NoSuchMethodException err52) {
			err52.printStackTrace();
		}
		try {
			class2.acceptsAnHttpMethodLimitedMappingRuleWithBothMethods();
		}
		catch (java.lang.NoSuchMethodException err53) {
			err53.printStackTrace();
		}
		try {
			class2.usesAsteriskBothWays();
		}
		catch (java.lang.NoSuchMethodException err54) {
			err54.printStackTrace();
		}
		try {
			class2.canTranslateAInheritedResourceBothWays();
		}
		catch (java.lang.NoSuchMethodException err55) {
			err55.printStackTrace();
		}
		try {
			class2.canTranslateAnnotatedMethodBothWays();
		}
		catch (java.lang.NoSuchMethodException err56) {
			err56.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.DefaultTypeFinderTest class3 = new br.com.caelum.vraptor.http.route.DefaultTypeFinderTest();
		class3.setup();
		try {
			class3.shouldGetTypesCorrectly();
		}
		catch (java.lang.Exception err57) {
			err57.printStackTrace();
		}
		try {
			class3.shouldGetTypesCorrectlyOnInheritance();
		}
		catch (java.lang.Exception err58) {
			err58.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.DefaultParametersControlTest class4 = new br.com.caelum.vraptor.http.route.DefaultParametersControlTest();
		class4.setup();
		try {
			class4.registerExtraParametersFromAcessedUrl();
		}
		catch (java.lang.SecurityException err59) {
			err59.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err60) {
			err60.printStackTrace();
		}
		try {
			class4.registerParametersWithAsterisks();
		}
		catch (java.lang.SecurityException err61) {
			err61.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err62) {
			err62.printStackTrace();
		}
		try {
			class4.registerParametersWithRegexes();
		}
		catch (java.lang.SecurityException err63) {
			err63.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err64) {
			err64.printStackTrace();
		}
		try {
			class4.registerParametersWithMultipleRegexes();
		}
		catch (java.lang.SecurityException err65) {
			err65.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err66) {
			err66.printStackTrace();
		}
		try {
			class4.worksAsRegexWhenUsingParameters();
		}
		catch (java.lang.SecurityException err67) {
			err67.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err68) {
			err68.printStackTrace();
		}
		try {
			class4.worksWithBasicRegexEvaluation();
		}
		catch (java.lang.SecurityException err69) {
			err69.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err70) {
			err70.printStackTrace();
		}
		class4.shouldTranslateAsteriskAsEmpty();
		class4.shouldTranslatePatternArgs();
		class4.shouldTranslatePatternArgsWithRegex();
		class4.shouldTranslatePatternArgsWithMultipleRegexes();
		class4.shouldTranslatePatternArgNullAsEmpty();
		class4.shouldUseConverterIfItExists();
		class4.shouldTranslatePatternArgInternalNullAsEmpty();
		try {
			class4.shouldMatchPatternLazily();
		}
		catch (java.lang.Exception err71) {
			err71.printStackTrace();
		}
		try {
			class4.shouldMatchMoreThanOneVariable();
		}
		catch (java.lang.Exception err72) {
			err72.printStackTrace();
		}
		try {
			class4.shouldBeGreedyWhenIPutAnAsteriskOnExpression();
		}
		catch (java.lang.Exception err73) {
			err73.printStackTrace();
		}
		try {
			class4.shouldNotBeGreedyAtPatternCompiling();
		}
		catch (java.lang.Exception err74) {
			err74.printStackTrace();
		}
		try {
			class4.registerExtraParametersFromAcessedUrlWithGreedyParameters();
		}
		catch (java.lang.SecurityException err75) {
			err75.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err76) {
			err76.printStackTrace();
		}
		try {
			class4.registerExtraParametersFromAcessedUrlWithGreedyAndDottedParameters();
		}
		catch (java.lang.SecurityException err77) {
			err77.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err78) {
			err78.printStackTrace();
		}
		try {
			class4.fillURLWithGreedyParameters();
		}
		catch (java.lang.SecurityException err79) {
			err79.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err80) {
			err80.printStackTrace();
		}
		try {
			class4.fillURLWithoutGreedyParameters();
		}
		catch (java.lang.SecurityException err81) {
			err81.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err82) {
			err82.printStackTrace();
		}
		try {
			class4.whenNoParameterPatternsAreGivenShouldMatchAnything();
		}
		catch (java.lang.Exception err83) {
			err83.printStackTrace();
		}
		try {
			class4.whenParameterPatternsAreGivenShouldMatchAccordingToGivenPatterns();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		try {
			class4.shouldFillRequestWhenAPatternIsSpecified();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class4.shouldDecodeUriParameters();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.JavaEvaluatorTest class5 = new br.com.caelum.vraptor.http.route.JavaEvaluatorTest();
		class5.setup();
		class5.shouldInvokeAGetter();
		class5.shouldInvokeAIs();
		class5.shouldAccessArray();
		class5.shouldAccessList();
		class5.shouldAccessCollection();
		class5.shouldReturnEmptyStringIfNullWasFoundOnTheWay();
		class5.shouldReturnEmptyStringIfTheResultIsNull();
		class5.shouldInvokeAGetterDeclaredOnSuperClass();
		class5.shouldInvokeAIsDeclaredOnSuperClass();
		br.com.caelum.vraptor.http.route.RulesTest class6 = new br.com.caelum.vraptor.http.route.RulesTest();
		class6.setup();
		class6.allowsAdditionOfRouteBuildersByDefaultWithNoStrategy();
		br.com.caelum.vraptor.http.route.FixedMethodStrategyTest class7 = new br.com.caelum.vraptor.http.route.FixedMethodStrategyTest();
		class7.setup();
		class7.canTranslate();
		try {
			class7.areEquals();
		}
		catch (java.lang.Exception err87) {
			err87.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.RouteBuilderTest class8 = new br.com.caelum.vraptor.http.route.RouteBuilderTest();
		try {
			class8.setUp();
		}
		catch (java.lang.Exception err88) {
			err88.printStackTrace();
		}
		try {
			class8.usePatternMatchinForPrimitiveParameters();
		}
		catch (java.lang.Exception err89) {
			err89.printStackTrace();
		}
		try {
			class8.usePatternMatchingForRegexParameters();
		}
		catch (java.lang.Exception err90) {
			err90.printStackTrace();
		}
		try {
			class8.usingRegexesWithCurlyBraces();
		}
		catch (java.lang.Exception err91) {
			err91.printStackTrace();
		}
		try {
			class8.usingRegexesWithCurlyBracesNotOnTheEnd();
		}
		catch (java.lang.Exception err92) {
			err92.printStackTrace();
		}
		try {
			class8.usingRegexesWithCurlyBracesNotOnTheEndAndOtherVar();
		}
		catch (java.lang.Exception err93) {
			err93.printStackTrace();
		}
		try {
			class8.usingRegexesWithCurlyBracesNotOnTheEndAndOtherVarAndManyOtherThings();
		}
		catch (java.lang.Exception err94) {
			err94.printStackTrace();
		}
		try {
			class8.usingRegexesWithAsterisksAtTheEnd();
		}
		catch (java.lang.Exception err95) {
			err95.printStackTrace();
		}
		try {
			class8.fillingUriForPrimitiveParameters();
		}
		catch (java.lang.Exception err96) {
			err96.printStackTrace();
		}
		try {
			class8.shouldSupportPathsWithDotsAndAsterisks();
		}
		catch (java.lang.SecurityException err97) {
			err97.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err98) {
			err98.printStackTrace();
		}
		try {
			class8.shouldUseGenericParameters();
		}
		catch (java.lang.SecurityException err99) {
			err99.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err100) {
			err100.printStackTrace();
		}
	}
}