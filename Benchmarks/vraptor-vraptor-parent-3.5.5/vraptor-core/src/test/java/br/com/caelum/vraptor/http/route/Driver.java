package br.com.caelum.vraptor.http.route;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.http.route.RulesTest class1 = new br.com.caelum.vraptor.http.route.RulesTest();
		class1.setup();
		class1.allowsAdditionOfRouteBuildersByDefaultWithNoStrategy();
		br.com.caelum.vraptor.http.route.RouteBuilderTest class2 = new br.com.caelum.vraptor.http.route.RouteBuilderTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.usePatternMatchinForPrimitiveParameters();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.usePatternMatchingForRegexParameters();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.usingRegexesWithCurlyBraces();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.usingRegexesWithCurlyBracesNotOnTheEnd();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.usingRegexesWithCurlyBracesNotOnTheEndAndOtherVar();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.usingRegexesWithCurlyBracesNotOnTheEndAndOtherVarAndManyOtherThings();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.usingRegexesWithAsterisksAtTheEnd();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class2.fillingUriForPrimitiveParameters();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class2.shouldSupportPathsWithDotsAndAsterisks();
		}
		catch (java.lang.SecurityException err10) {
			err10.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err11) {
			err11.printStackTrace();
		}
		try {
			class2.shouldUseGenericParameters();
		}
		catch (java.lang.SecurityException err12) {
			err12.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err13) {
			err13.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.DefaultParametersControlTest class3 = new br.com.caelum.vraptor.http.route.DefaultParametersControlTest();
		class3.setup();
		try {
			class3.registerExtraParametersFromAcessedUrl();
		}
		catch (java.lang.SecurityException err14) {
			err14.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err15) {
			err15.printStackTrace();
		}
		try {
			class3.registerParametersWithAsterisks();
		}
		catch (java.lang.SecurityException err16) {
			err16.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err17) {
			err17.printStackTrace();
		}
		try {
			class3.registerParametersWithRegexes();
		}
		catch (java.lang.SecurityException err18) {
			err18.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err19) {
			err19.printStackTrace();
		}
		try {
			class3.registerParametersWithMultipleRegexes();
		}
		catch (java.lang.SecurityException err20) {
			err20.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err21) {
			err21.printStackTrace();
		}
		try {
			class3.worksAsRegexWhenUsingParameters();
		}
		catch (java.lang.SecurityException err22) {
			err22.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err23) {
			err23.printStackTrace();
		}
		try {
			class3.worksWithBasicRegexEvaluation();
		}
		catch (java.lang.SecurityException err24) {
			err24.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err25) {
			err25.printStackTrace();
		}
		class3.shouldTranslateAsteriskAsEmpty();
		class3.shouldTranslatePatternArgs();
		class3.shouldTranslatePatternArgsWithRegex();
		class3.shouldTranslatePatternArgsWithMultipleRegexes();
		class3.shouldTranslatePatternArgNullAsEmpty();
		class3.shouldUseConverterIfItExists();
		class3.shouldTranslatePatternArgInternalNullAsEmpty();
		try {
			class3.shouldMatchPatternLazily();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class3.shouldMatchMoreThanOneVariable();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class3.shouldBeGreedyWhenIPutAnAsteriskOnExpression();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class3.shouldNotBeGreedyAtPatternCompiling();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class3.registerExtraParametersFromAcessedUrlWithGreedyParameters();
		}
		catch (java.lang.SecurityException err30) {
			err30.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err31) {
			err31.printStackTrace();
		}
		try {
			class3.registerExtraParametersFromAcessedUrlWithGreedyAndDottedParameters();
		}
		catch (java.lang.SecurityException err32) {
			err32.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err33) {
			err33.printStackTrace();
		}
		try {
			class3.fillURLWithGreedyParameters();
		}
		catch (java.lang.SecurityException err34) {
			err34.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err35) {
			err35.printStackTrace();
		}
		try {
			class3.fillURLWithoutGreedyParameters();
		}
		catch (java.lang.SecurityException err36) {
			err36.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err37) {
			err37.printStackTrace();
		}
		try {
			class3.whenNoParameterPatternsAreGivenShouldMatchAnything();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class3.whenParameterPatternsAreGivenShouldMatchAccordingToGivenPatterns();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class3.shouldFillRequestWhenAPatternIsSpecified();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class3.shouldDecodeUriParameters();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.MyCustomResource class4 = new br.com.caelum.vraptor.http.route.MyCustomResource();
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
		br.com.caelum.vraptor.http.route.PathAnnotationRoutesParserTest class6 = new br.com.caelum.vraptor.http.route.PathAnnotationRoutesParserTest();
		class6.setup();
		try {
			class6.addsAPrefixToMethodsWhenTheControllerHasMoreThanOneAnnotatedPath();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheControllerAndTheMethodAreAnnotatedWithRelativePath();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheControllerEndsWithSlashAndTheMethodAreAnnotatedWithRelativePath();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheControllerEndsWithSlashAndTheMethodAreAnnotatedWithAbsolutePath();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheControllerEndsWithSlashAndTheMethodAreAnnotatedWithEmptyPath();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheControllerAndTheMethodAreAnnotatedWithAbsolutePath();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheControllerAndTheMethodAreAnnotatedWithEmptyPath();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheControllerIsAnnotatedWithPath();
		}
		catch (java.lang.Exception err49) {
			err49.printStackTrace();
		}
		try {
			class6.findsTheCorrectAnnotatedMethodIfThereIsNoWebMethodAnnotationPresent();
		}
		catch (java.lang.Exception err50) {
			err50.printStackTrace();
		}
		try {
			class6.suportsTheDefaultNameForANonAnnotatedMethod();
		}
		catch (java.lang.SecurityException err51) {
			err51.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err52) {
			err52.printStackTrace();
		}
		try {
			class6.ignoresTheControllerSuffixForANonAnnotatedMethod();
		}
		catch (java.lang.SecurityException err53) {
			err53.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err54) {
			err54.printStackTrace();
		}
		try {
			class6.addsASlashWhenUserForgotIt();
		}
		catch (java.lang.SecurityException err55) {
			err55.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err56) {
			err56.printStackTrace();
		}
		try {
			class6.matchesWhenUsingAWildcard();
		}
		catch (java.lang.SecurityException err57) {
			err57.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err58) {
			err58.printStackTrace();
		}
		class6.dontRegisterRouteIfMethodIsNotPublic();
		class6.dontRegisterRouteIfMethodIsStatic();
		try {
			class6.shouldThrowExceptionIfPathAnnotationHasEmptyArray();
		}
		catch (java.lang.Exception err59) {
			err59.printStackTrace();
		}
		try {
			class6.shouldFindNonAnnotatedNonStaticPublicMethodWithComponentNameInVariableCamelCaseConventionAsURI();
		}
		catch (java.lang.Exception err60) {
			err60.printStackTrace();
		}
		try {
			class6.shouldFindSeveralPathsForMethodWithManyValue();
		}
		catch (java.lang.Exception err61) {
			err61.printStackTrace();
		}
		try {
			class6.shouldNotMatchIfAResourceHasTheWrongWebMethod();
		}
		catch (java.lang.SecurityException err62) {
			err62.printStackTrace();
		}
		try {
			class6.shouldAcceptAResultWithASpecificWebMethod();
		}
		catch (java.lang.SecurityException err63) {
			err63.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err64) {
			err64.printStackTrace();
		}
		try {
			class6.shouldAcceptAResultWithOptionsWebMethod();
		}
		catch (java.lang.SecurityException err65) {
			err65.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err66) {
			err66.printStackTrace();
		}
		try {
			class6.shouldAcceptAResultWithPatchWebMethod();
		}
		catch (java.lang.SecurityException err67) {
			err67.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err68) {
			err68.printStackTrace();
		}
		try {
			class6.findsInheritedMethodsWithDefaultNames();
		}
		catch (java.lang.SecurityException err69) {
			err69.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err70) {
			err70.printStackTrace();
		}
		try {
			class6.supportMethodOverriding();
		}
		catch (java.lang.SecurityException err71) {
			err71.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err72) {
			err72.printStackTrace();
		}
		try {
			class6.supportTypeHttpMethodAnnotation();
		}
		catch (java.lang.SecurityException err73) {
			err73.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err74) {
			err74.printStackTrace();
		}
		try {
			class6.supportOverrideTypeHttpMethodAnnotation();
		}
		catch (java.lang.SecurityException err75) {
			err75.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err76) {
			err76.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheGetControllerAndTheMethodAreAnnotatedWithRelativePath();
		}
		catch (java.lang.Exception err77) {
			err77.printStackTrace();
		}
		try {
			class6.priorityForGetAnnotationShouldBeDefault();
		}
		catch (java.lang.Exception err78) {
			err78.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheGetControllerEndsWithSlashAndTheMethodAreAnnotatedWithRelativePath();
		}
		catch (java.lang.Exception err79) {
			err79.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheGetControllerEndsWithSlashAndTheMethodAreAnnotatedWithAbsolutePath();
		}
		catch (java.lang.Exception err80) {
			err80.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheGetControllerAndTheMethodAreAnnotatedWithAbsolutePath();
		}
		catch (java.lang.Exception err81) {
			err81.printStackTrace();
		}
		try {
			class6.addsAPrefixToMethodsWhenTheGetControllerIsAnnotatedWithPath();
		}
		catch (java.lang.Exception err82) {
			err82.printStackTrace();
		}
		try {
			class6.throwsExceptionWhenTheGetControllerHasAmbiguousDeclaration();
		}
		catch (java.lang.Exception err83) {
			err83.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.DefaultRouterTest class7 = new br.com.caelum.vraptor.http.route.DefaultRouterTest();
		class7.setup();
		try {
			class7.shouldThrowResourceNotFoundExceptionWhenNoRoutesMatchTheURI();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		try {
			class7.shouldThrowMethodNotAllowedExceptionWhenNoRoutesMatchTheURIWithGivenHttpMethod();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class7.shouldObeyPriorityOfRoutes();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		try {
			class7.acceptsASingleMappingRule();
		}
		catch (java.lang.SecurityException err87) {
			err87.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err88) {
			err88.printStackTrace();
		}
		try {
			class7.passesTheWebMethod();
		}
		catch (java.lang.SecurityException err89) {
			err89.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err90) {
			err90.printStackTrace();
		}
		try {
			class7.usesTheFirstRegisteredRuleMatchingThePattern();
		}
		catch (java.lang.SecurityException err91) {
			err91.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err92) {
			err92.printStackTrace();
		}
		class7.throwsExceptionIfMoreThanOneUriMatchesWithSamePriority();
		try {
			class7.acceptsAnHttpMethodLimitedMappingRule();
		}
		catch (java.lang.NoSuchMethodException err93) {
			err93.printStackTrace();
		}
		try {
			class7.acceptsAnHttpMethodLimitedMappingRuleWithBothMethods();
		}
		catch (java.lang.NoSuchMethodException err94) {
			err94.printStackTrace();
		}
		try {
			class7.usesAsteriskBothWays();
		}
		catch (java.lang.NoSuchMethodException err95) {
			err95.printStackTrace();
		}
		try {
			class7.canTranslateAInheritedResourceBothWays();
		}
		catch (java.lang.NoSuchMethodException err96) {
			err96.printStackTrace();
		}
		try {
			class7.canTranslateAnnotatedMethodBothWays();
		}
		catch (java.lang.NoSuchMethodException err97) {
			err97.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.FixedMethodStrategyTest class8 = new br.com.caelum.vraptor.http.route.FixedMethodStrategyTest();
		class8.setup();
		class8.canTranslate();
		try {
			class8.areEquals();
		}
		catch (java.lang.Exception err98) {
			err98.printStackTrace();
		}
		br.com.caelum.vraptor.http.route.DefaultTypeFinderTest class9 = new br.com.caelum.vraptor.http.route.DefaultTypeFinderTest();
		class9.setup();
		try {
			class9.shouldGetTypesCorrectly();
		}
		catch (java.lang.Exception err99) {
			err99.printStackTrace();
		}
		try {
			class9.shouldGetTypesCorrectlyOnInheritance();
		}
		catch (java.lang.Exception err100) {
			err100.printStackTrace();
		}
	}
}