package org.apache.maven.project;

public class Driver {
	public void runall() {
		org.apache.maven.project.DefaultMavenProjectBuilderTest class1 = new org.apache.maven.project.DefaultMavenProjectBuilderTest();
		try {
			class1.testBuildFromMiddlePom();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testDuplicatePluginDefinitionsMerged();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testFutureModelVersion();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testPastModelVersion();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testFutureSchemaModelVersion();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testBuildStubModelForMissingRemotePom();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testPartialResultUponBadDependencyDeclaration();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testImportScopePomResolvesFromPropertyBasedRepository();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.testBuildValidParentVersionRangeLocally();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.testBuildParentVersionRangeLocallyWithoutChildVersion();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.testBuildParentVersionRangeLocallyWithChildVersionExpression();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class1.testBuildParentVersionRangeExternally();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class1.testBuildParentVersionRangeExternallyWithoutChildVersion();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class1.testBuildParentVersionRangeExternallyWithChildVersionExpression();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.maven.project.ProjectModelResolverTest class2 = new org.apache.maven.project.ProjectModelResolverTest();
		try {
			class2.testResolveParentThrowsUnresolvableModelExceptionWhenNotFound();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class2.testResolveParentThrowsUnresolvableModelExceptionWhenNoMatchingVersionFound();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class2.testResolveParentThrowsUnresolvableModelExceptionWhenUsingRangesWithoutUpperBound();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class2.testResolveParentSuccessfullyResolvesExistingParentWithoutRange();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class2.testResolveParentSuccessfullyResolvesExistingParentUsingHighestVersion();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class2.testResolveDependencyThrowsUnresolvableModelExceptionWhenNotFound();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class2.testResolveDependencyThrowsUnresolvableModelExceptionWhenNoMatchingVersionFound();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class2.testResolveDependencyThrowsUnresolvableModelExceptionWhenUsingRangesWithoutUpperBound();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class2.testResolveDependencySuccessfullyResolvesExistingDependencyWithoutRange();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class2.testResolveDependencySuccessfullyResolvesExistingDependencyUsingHighestVersion();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		org.apache.maven.project.PomConstructionTest class3 = new org.apache.maven.project.PomConstructionTest();
		try {
			class3.testEmptyUrl();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class3.testProfileModules();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class3.testParentInheritance();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class3.testExecutionConfigurationJoin();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class3.testPluginConfigProperties();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class3.testProfilePropertiesInterpolation();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class3.testThatExecutionsWithoutIdsAreMergedAndTheChildWins();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class3.testDuplicateExclusionsDependency();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class3.testMultipleFilters();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class3.testDuplicateDependenciesCauseLastDeclarationToBePickedInLenientMode();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class3.testParentInterpolation();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class3.testPluginManagementInherited();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class3.testPluginManagementDependencies();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class3.testReportingInterpolation();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class3.testPluginOrder();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class3.testErroneousJoiningOfDifferentPluginsWithEqualDependencies();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class3.testErroneousJoiningOfDifferentPluginsWithEqualExecutionIds();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class3.testExecutionConfiguration();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class3.testSingleConfigurationInheritance();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class3.testConfigWithPluginManagement();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class3.testExecutionConfigurationSubcollections();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		try {
			class3.testMultipleRepositories();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class3.testMultipleExecutionIds();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class3.testConsecutiveEmptyElements();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
		try {
			class3.testOrderOfGoalsFromPluginExecutionWithoutPluginManagement();
		}
		catch (java.lang.Exception err49) {
			err49.printStackTrace();
		}
		try {
			class3.testOrderOfGoalsFromPluginExecutionWithPluginManagement();
		}
		catch (java.lang.Exception err50) {
			err50.printStackTrace();
		}
		try {
			class3.testOrderOfPluginExecutionsWithoutPluginManagement();
		}
		catch (java.lang.Exception err51) {
			err51.printStackTrace();
		}
		try {
			class3.testOrderOfPluginExecutionsWithPluginManagement();
		}
		catch (java.lang.Exception err52) {
			err52.printStackTrace();
		}
		try {
			class3.testMergeOfPluginExecutionsWhenChildInheritsPluginVersion();
		}
		catch (java.lang.Exception err53) {
			err53.printStackTrace();
		}
		try {
			class3.testMergeOfPluginExecutionsWhenChildAndParentUseDifferentPluginVersions();
		}
		catch (java.lang.Exception err54) {
			err54.printStackTrace();
		}
		try {
			class3.testInterpolationWithXmlMarkup();
		}
		catch (java.lang.Exception err55) {
			err55.printStackTrace();
		}
		try {
			class3.testOrderOfMergedPluginExecutionsWithoutPluginManagement();
		}
		catch (java.lang.Exception err56) {
			err56.printStackTrace();
		}
		try {
			class3.testOrderOfMergedPluginExecutionsWithPluginManagement();
		}
		catch (java.lang.Exception err57) {
			err57.printStackTrace();
		}
		try {
			class3.testDifferentContainersWithSameId();
		}
		catch (java.lang.Exception err58) {
			err58.printStackTrace();
		}
		try {
			class3.testOrderOfMergedPluginExecutionGoalsWithoutPluginManagement();
		}
		catch (java.lang.Exception err59) {
			err59.printStackTrace();
		}
		try {
			class3.testOrderOfMergedPluginExecutionGoalsWithPluginManagement();
		}
		catch (java.lang.Exception err60) {
			err60.printStackTrace();
		}
		try {
			class3.testOverridingOfInheritedPluginExecutionsWithoutPluginManagement();
		}
		catch (java.lang.Exception err61) {
			err61.printStackTrace();
		}
		try {
			class3.testOverridingOfInheritedPluginExecutionsWithPluginManagement();
		}
		catch (java.lang.Exception err62) {
			err62.printStackTrace();
		}
		try {
			class3.testOrderOfMergedPluginDependenciesWithoutPluginManagement();
		}
		catch (java.lang.Exception err63) {
			err63.printStackTrace();
		}
		try {
			class3.testOrderOfMergedPluginDependenciesWithPluginManagement();
		}
		catch (java.lang.Exception err64) {
			err64.printStackTrace();
		}
		try {
			class3.testInterpolationOfNestedBuildDirectories();
		}
		catch (java.lang.Exception err65) {
			err65.printStackTrace();
		}
		try {
			class3.testAppendArtifactIdOfChildToInheritedUrls();
		}
		catch (java.lang.Exception err66) {
			err66.printStackTrace();
		}
		try {
			class3.testAppendArtifactIdOfParentAndChildToInheritedUrls();
		}
		catch (java.lang.Exception err67) {
			err67.printStackTrace();
		}
		try {
			class3.testNonInheritedElementsInSubtreesOverriddenByChild();
		}
		catch (java.lang.Exception err68) {
			err68.printStackTrace();
		}
		try {
			class3.testXmlTextCoalescing();
		}
		catch (java.lang.Exception err69) {
			err69.printStackTrace();
		}
		try {
			class3.testFullInterpolationOfNestedExpressions();
		}
		catch (java.lang.Exception err70) {
			err70.printStackTrace();
		}
		try {
			class3.testInterpolationOfLegacyExpressionsThatDontIncludeTheProjectPrefix();
		}
		catch (java.lang.Exception err71) {
			err71.printStackTrace();
		}
		try {
			class3.testInterpolationWithBasedirAlignedDirectories();
		}
		catch (java.lang.Exception err72) {
			err72.printStackTrace();
		}
		try {
			class3.testInterpolationOfBasedirInPomWithUnusualName();
		}
		catch (java.lang.Exception err73) {
			err73.printStackTrace();
		}
		try {
			class3.testJoiningOfContainersWhenChildHasEmptyElements();
		}
		catch (java.lang.Exception err74) {
			err74.printStackTrace();
		}
		try {
			class3.testOrderOfPluginConfigurationElementsWithoutPluginManagement();
		}
		catch (java.lang.Exception err75) {
			err75.printStackTrace();
		}
		try {
			class3.testOrderOfPluginConfigurationElementsWithPluginManagement();
		}
		catch (java.lang.Exception err76) {
			err76.printStackTrace();
		}
		try {
			class3.testOrderOfPluginExecutionConfigurationElementsWithoutPluginManagement();
		}
		catch (java.lang.Exception err77) {
			err77.printStackTrace();
		}
		try {
			class3.testOrderOfPluginExecutionConfigurationElementsWithPluginManagement();
		}
		catch (java.lang.Exception err78) {
			err78.printStackTrace();
		}
		try {
			class3.testMergeOfInheritedPluginConfiguration();
		}
		catch (java.lang.Exception err79) {
			err79.printStackTrace();
		}
		try {
			class3.testAppendOfInheritedPluginConfigurationWithNoProfile();
		}
		catch (java.lang.Exception err80) {
			err80.printStackTrace();
		}
		try {
			class3.testAppendOfInheritedPluginConfigurationWithActiveProfile();
		}
		catch (java.lang.Exception err81) {
			err81.printStackTrace();
		}
		try {
			class3.testMultiplePluginExecutionsWithAndWithoutIdsWithoutPluginManagement();
		}
		catch (java.lang.Exception err82) {
			err82.printStackTrace();
		}
		try {
			class3.testMultiplePluginExecutionsWithAndWithoutIdsWithPluginManagement();
		}
		catch (java.lang.Exception err83) {
			err83.printStackTrace();
		}
		try {
			class3.testDependencyOrderWithoutPluginManagement();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		try {
			class3.testDependencyOrderWithPluginManagement();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class3.testBuildDirectoriesUsePlatformSpecificFileSeparator();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		try {
			class3.testMergedFilterOrder();
		}
		catch (java.lang.Exception err87) {
			err87.printStackTrace();
		}
		try {
			class3.testProfileInjectedDependencies();
		}
		catch (java.lang.Exception err88) {
			err88.printStackTrace();
		}
		try {
			class3.testProfileDependenciesMultipleProfiles();
		}
		catch (java.lang.Exception err89) {
			err89.printStackTrace();
		}
		try {
			class3.testDependencyInheritance();
		}
		catch (java.lang.Exception err90) {
			err90.printStackTrace();
		}
		try {
			class3.testManagedProfileDependency();
		}
		catch (java.lang.Exception err91) {
			err91.printStackTrace();
		}
		try {
			class3.testProfileModuleInheritance();
		}
		catch (java.lang.Exception err92) {
			err92.printStackTrace();
		}
		try {
			class3.testUncPath();
		}
		catch (java.lang.Exception err93) {
			err93.printStackTrace();
		}
		try {
			class3.testUrlAppendWithChildPathAdjustment();
		}
		catch (java.lang.Exception err94) {
			err94.printStackTrace();
		}
		try {
			class3.testRepoInheritance();
		}
		catch (java.lang.Exception err95) {
			err95.printStackTrace();
		}
		try {
			class3.testEmptyScm();
		}
		catch (java.lang.Exception err96) {
			err96.printStackTrace();
		}
		try {
			class3.testPluginConfigurationUsingAttributesWithoutPluginManagement();
		}
		catch (java.lang.Exception err97) {
			err97.printStackTrace();
		}
		try {
			class3.testPluginConfigurationUsingAttributesWithPluginManagement();
		}
		catch (java.lang.Exception err98) {
			err98.printStackTrace();
		}
		try {
			class3.testPluginConfigurationUsingAttributesWithPluginManagementAndProfile();
		}
		catch (java.lang.Exception err99) {
			err99.printStackTrace();
		}
		try {
			class3.testPomEncoding();
		}
		catch (java.lang.Exception err100) {
			err100.printStackTrace();
		}
		try {
			class3.testXmlWhitespaceHandling();
		}
		catch (java.lang.Exception err101) {
			err101.printStackTrace();
		}
		try {
			class3.testInterpolationOfBaseUri();
		}
		catch (java.lang.Exception err102) {
			err102.printStackTrace();
		}
		try {
			class3.testInterpolationOfRfc3986BaseUri();
		}
		catch (java.lang.Exception err103) {
			err103.printStackTrace();
		}
		try {
			class3.testReportingPluginConfig();
		}
		catch (java.lang.Exception err104) {
			err104.printStackTrace();
		}
		try {
			class3.testPropertiesNoDuplication();
		}
		catch (java.lang.Exception err105) {
			err105.printStackTrace();
		}
		try {
			class3.testPomInheritance();
		}
		catch (java.lang.Exception err106) {
			err106.printStackTrace();
		}
		try {
			class3.testCompleteModelWithoutParent();
		}
		catch (java.lang.Exception err107) {
			err107.printStackTrace();
		}
		try {
			class3.testCompleteModelWithParent();
		}
		catch (java.lang.Exception err108) {
			err108.printStackTrace();
		}
		try {
			class3.testProfileInjectionOrder();
		}
		catch (java.lang.Exception err109) {
			err109.printStackTrace();
		}
		try {
			class3.testPropertiesInheritance();
		}
		catch (java.lang.Exception err110) {
			err110.printStackTrace();
		}
		try {
			class3.testInheritedPropertiesInterpolatedWithValuesFromChildWithoutProfiles();
		}
		catch (java.lang.Exception err111) {
			err111.printStackTrace();
		}
		try {
			class3.testInheritedPropertiesInterpolatedWithValuesFromChildWithActiveProfiles();
		}
		catch (java.lang.Exception err112) {
			err112.printStackTrace();
		}
		try {
			class3.testProfileDefaultActivation();
		}
		catch (java.lang.Exception err113) {
			err113.printStackTrace();
		}
		try {
			class3.testBooleanInterpolation();
		}
		catch (java.lang.Exception err114) {
			err114.printStackTrace();
		}
		try {
			class3.testBuildExtensionInheritance();
		}
		catch (java.lang.Exception err115) {
			err115.printStackTrace();
		}
		try {
			class3.testJdkActivation();
		}
		catch (java.lang.Exception err116) {
			err116.printStackTrace();
		}
		try {
			class3.testProfilePluginMngDependencies();
		}
		catch (java.lang.Exception err117) {
			err117.printStackTrace();
		}
		try {
			class3.testPercentEncodedUrlsMustNotBeDecoded();
		}
		catch (java.lang.Exception err118) {
			err118.printStackTrace();
		}
		try {
			class3.testPluginManagementInheritance();
		}
		catch (java.lang.Exception err119) {
			err119.printStackTrace();
		}
		try {
			class3.testProfilePlugins();
		}
		catch (java.lang.Exception err120) {
			err120.printStackTrace();
		}
		try {
			class3.testPluginInheritanceSimple();
		}
		catch (java.lang.Exception err121) {
			err121.printStackTrace();
		}
		try {
			class3.testPluginManagementDuplicate();
		}
		catch (java.lang.Exception err122) {
			err122.printStackTrace();
		}
		try {
			class3.testDistributionManagement();
		}
		catch (java.lang.Exception err123) {
			err123.printStackTrace();
		}
		try {
			class3.testDependencyScopeInheritance();
		}
		catch (java.lang.Exception err124) {
			err124.printStackTrace();
		}
		try {
			class3.testDependencyScope();
		}
		catch (java.lang.Exception err125) {
			err125.printStackTrace();
		}
		try {
			class3.testDependencyManagementWithInterpolation();
		}
		catch (java.lang.Exception err126) {
			err126.printStackTrace();
		}
		try {
			class3.testInterpolationWithSystemProperty();
		}
		catch (java.lang.Exception err127) {
			err127.printStackTrace();
		}
		try {
			class3.testPluginExecutionInheritanceWhenChildDoesNotDeclarePlugin();
		}
		catch (java.lang.Exception err128) {
			err128.printStackTrace();
		}
		try {
			class3.testPluginExecutionInheritanceWhenChildDoesDeclarePluginAsWell();
		}
		catch (java.lang.Exception err129) {
			err129.printStackTrace();
		}
		try {
			class3.testValidationErrorUponNonUniqueArtifactRepositoryId();
		}
		catch (java.lang.Exception err130) {
			err130.printStackTrace();
		}
		try {
			class3.testValidationErrorUponNonUniquePluginRepositoryId();
		}
		catch (java.lang.Exception err131) {
			err131.printStackTrace();
		}
		try {
			class3.testValidationErrorUponNonUniqueArtifactRepositoryIdInProfile();
		}
		catch (java.lang.Exception err132) {
			err132.printStackTrace();
		}
		try {
			class3.testValidationErrorUponNonUniquePluginRepositoryIdInProfile();
		}
		catch (java.lang.Exception err133) {
			err133.printStackTrace();
		}
		try {
			class3.testPrerequisitesAreNotInherited();
		}
		catch (java.lang.Exception err134) {
			err134.printStackTrace();
		}
		try {
			class3.testLicensesAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err135) {
			err135.printStackTrace();
		}
		try {
			class3.testDevelopersAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err136) {
			err136.printStackTrace();
		}
		try {
			class3.testContributorsAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err137) {
			err137.printStackTrace();
		}
		try {
			class3.testMailingListsAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err138) {
			err138.printStackTrace();
		}
		try {
			class3.testPluginInheritanceOrder();
		}
		catch (java.lang.Exception err139) {
			err139.printStackTrace();
		}
		try {
			class3.testCliPropsDominateProjectPropsDuringInterpolation();
		}
		catch (java.lang.Exception err140) {
			err140.printStackTrace();
		}
		try {
			class3.testParentPomPackagingMustBePom();
		}
		catch (java.lang.Exception err141) {
			err141.printStackTrace();
		}
		try {
			class3.testManagedPluginConfigurationAppliesToImplicitPluginsIntroducedByPackaging();
		}
		catch (java.lang.Exception err142) {
			err142.printStackTrace();
		}
		try {
			class3.testDefaultPluginsExecutionContributedByPackagingExecuteBeforeUserDefinedExecutions();
		}
		catch (java.lang.Exception err143) {
			err143.printStackTrace();
		}
		try {
			class3.testPluginDeclarationsRetainPomOrderAfterInjectionOfDefaultPlugins();
		}
		catch (java.lang.Exception err144) {
			err144.printStackTrace();
		}
		try {
			class3.testPluginOrderAfterMergingWithInheritedPlugins();
		}
		catch (java.lang.Exception err145) {
			err145.printStackTrace();
		}
		try {
			class3.testPluginOrderAfterMergingWithInjectedPlugins();
		}
		catch (java.lang.Exception err146) {
			err146.printStackTrace();
		}
		try {
			class3.testProjectArtifactIdIsNotInheritedButMandatory();
		}
		catch (java.lang.Exception err147) {
			err147.printStackTrace();
		}
		org.apache.maven.project.MavenProjectTest class4 = new org.apache.maven.project.MavenProjectTest();
		try {
			class4.testShouldInterpretChildPathAdjustmentBasedOnModulePaths();
		}
		catch (java.io.IOException err148) {
			err148.printStackTrace();
		}
		class4.testIdentityProtoInheritance();
		class4.testEmptyConstructor();
		try {
			class4.testClone();
		}
		catch (java.lang.Exception err149) {
			err149.printStackTrace();
		}
		try {
			class4.testCloneWithDependencyManagement();
		}
		catch (java.lang.Exception err150) {
			err150.printStackTrace();
		}
		try {
			class4.testGetModulePathAdjustment();
		}
		catch (java.io.IOException err151) {
			err151.printStackTrace();
		}
		try {
			class4.testCloneWithDistributionManagement();
		}
		catch (java.lang.Exception err152) {
			err152.printStackTrace();
		}
		try {
			class4.testCloneWithActiveProfile();
		}
		catch (java.lang.Exception err153) {
			err153.printStackTrace();
		}
		try {
			class4.testCloneWithBaseDir();
		}
		catch (java.lang.Exception err154) {
			err154.printStackTrace();
		}
		try {
			class4.testUndefinedOutputDirectory();
		}
		catch (java.lang.Exception err155) {
			err155.printStackTrace();
		}
		class4.testAddDotFile();
		org.apache.maven.project.ProjectBuilderTest class5 = new org.apache.maven.project.ProjectBuilderTest();
		try {
			class5.testSystemScopeDependencyIsPresentInTheCompileClasspathElements();
		}
		catch (java.lang.Exception err156) {
			err156.printStackTrace();
		}
		try {
			class5.testBuildFromModelSource();
		}
		catch (java.lang.Exception err157) {
			err157.printStackTrace();
		}
		try {
			class5.testVersionlessManagedDependency();
		}
		catch (java.lang.Exception err158) {
			err158.printStackTrace();
		}
		try {
			class5.testResolveDependencies();
		}
		catch (java.lang.Exception err159) {
			err159.printStackTrace();
		}
		try {
			class5.testDontResolveDependencies();
		}
		catch (java.lang.Exception err160) {
			err160.printStackTrace();
		}
		try {
			class5.testReadModifiedPoms();
		}
		catch (java.lang.Exception err161) {
			err161.printStackTrace();
		}
		try {
			class5.testReadErroneousMavenProjectContainsReference();
		}
		catch (java.lang.Exception err162) {
			err162.printStackTrace();
		}
		try {
			class5.testReadInvalidPom();
		}
		catch (java.lang.Exception err163) {
			err163.printStackTrace();
		}
		try {
			class5.testReadParentAndChildWithRegularVersionSetParentFile();
		}
		catch (java.lang.Exception err164) {
			err164.printStackTrace();
		}
		try {
			class5.testBuildProperties();
		}
		catch (java.lang.Exception err165) {
			err165.printStackTrace();
		}
		org.apache.maven.project.ProjectSorterTest class6 = new org.apache.maven.project.ProjectSorterTest();
		try {
			class6.testShouldNotFailWhenPluginDepReferencesCurrentProject();
		}
		catch (java.lang.Exception err166) {
			err166.printStackTrace();
		}
		try {
			class6.testShouldNotFailWhenManagedPluginDepReferencesCurrentProject();
		}
		catch (java.lang.Exception err167) {
			err167.printStackTrace();
		}
		try {
			class6.testShouldNotFailWhenProjectReferencesNonExistentProject();
		}
		catch (java.lang.Exception err168) {
			err168.printStackTrace();
		}
		try {
			class6.testMatchingArtifactIdsDifferentGroupIds();
		}
		catch (java.lang.Exception err169) {
			err169.printStackTrace();
		}
		try {
			class6.testMatchingGroupIdsDifferentArtifactIds();
		}
		catch (java.lang.Exception err170) {
			err170.printStackTrace();
		}
		try {
			class6.testMatchingIdsAndVersions();
		}
		catch (java.lang.Exception err171) {
			err171.printStackTrace();
		}
		try {
			class6.testMatchingIdsAndDifferentVersions();
		}
		catch (java.lang.Exception err172) {
			err172.printStackTrace();
		}
		try {
			class6.testPluginDependenciesInfluenceSorting();
		}
		catch (java.lang.Exception err173) {
			err173.printStackTrace();
		}
		try {
			class6.testPluginDependenciesInfluenceSorting_DeclarationInParent();
		}
		catch (java.lang.Exception err174) {
			err174.printStackTrace();
		}
		try {
			class6.testPluginVersionsAreConsidered();
		}
		catch (java.lang.Exception err175) {
			err175.printStackTrace();
		}
		try {
			class6.testDependencyPrecedesProjectThatUsesSpecificDependencyVersion();
		}
		catch (java.lang.Exception err176) {
			err176.printStackTrace();
		}
		try {
			class6.testDependencyPrecedesProjectThatUsesUnresolvedDependencyVersion();
		}
		catch (java.lang.Exception err177) {
			err177.printStackTrace();
		}
		org.apache.maven.project.ExtensionDescriptorBuilderTest class7 = new org.apache.maven.project.ExtensionDescriptorBuilderTest();
		try {
			class7.testEmptyDescriptor();
		}
		catch (java.lang.Exception err178) {
			err178.printStackTrace();
		}
		try {
			class7.testCompleteDescriptor();
		}
		catch (java.lang.Exception err179) {
			err179.printStackTrace();
		}
	}
}