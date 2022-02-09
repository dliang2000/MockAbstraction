package org.apache.maven.project;

public class Driver {
	public void runall() {
		org.apache.maven.project.ProjectSorterTest class1 = new org.apache.maven.project.ProjectSorterTest();
		try {
			class1.testShouldNotFailWhenPluginDepReferencesCurrentProject();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testShouldNotFailWhenManagedPluginDepReferencesCurrentProject();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testShouldNotFailWhenProjectReferencesNonExistentProject();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testMatchingArtifactIdsDifferentGroupIds();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testMatchingGroupIdsDifferentArtifactIds();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testMatchingIdsAndVersions();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testMatchingIdsAndDifferentVersions();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testPluginDependenciesInfluenceSorting();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.testPluginDependenciesInfluenceSorting_DeclarationInParent();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.testPluginVersionsAreConsidered();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.testDependencyPrecedesProjectThatUsesSpecificDependencyVersion();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class1.testDependencyPrecedesProjectThatUsesUnresolvedDependencyVersion();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		org.apache.maven.project.ExtensionDescriptorBuilderTest class2 = new org.apache.maven.project.ExtensionDescriptorBuilderTest();
		try {
			class2.testEmptyDescriptor();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class2.testCompleteDescriptor();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.maven.project.ProjectModelResolverTest class3 = new org.apache.maven.project.ProjectModelResolverTest();
		try {
			class3.testResolveParentThrowsUnresolvableModelExceptionWhenNotFound();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class3.testResolveParentThrowsUnresolvableModelExceptionWhenNoMatchingVersionFound();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class3.testResolveParentThrowsUnresolvableModelExceptionWhenUsingRangesWithoutUpperBound();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class3.testResolveParentSuccessfullyResolvesExistingParentWithoutRange();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class3.testResolveParentSuccessfullyResolvesExistingParentUsingHighestVersion();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class3.testResolveDependencyThrowsUnresolvableModelExceptionWhenNotFound();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class3.testResolveDependencyThrowsUnresolvableModelExceptionWhenNoMatchingVersionFound();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class3.testResolveDependencyThrowsUnresolvableModelExceptionWhenUsingRangesWithoutUpperBound();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class3.testResolveDependencySuccessfullyResolvesExistingDependencyWithoutRange();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class3.testResolveDependencySuccessfullyResolvesExistingDependencyUsingHighestVersion();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		org.apache.maven.project.PomConstructionTest class4 = new org.apache.maven.project.PomConstructionTest();
		try {
			class4.testEmptyUrl();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class4.testProfileModules();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class4.testParentInheritance();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class4.testExecutionConfigurationJoin();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class4.testPluginConfigProperties();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class4.testProfilePropertiesInterpolation();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class4.testThatExecutionsWithoutIdsAreMergedAndTheChildWins();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class4.testDuplicateExclusionsDependency();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class4.testMultipleFilters();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class4.testDuplicateDependenciesCauseLastDeclarationToBePickedInLenientMode();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class4.testParentInterpolation();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class4.testPluginManagementInherited();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class4.testPluginManagementDependencies();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class4.testReportingInterpolation();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class4.testPluginOrder();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class4.testErroneousJoiningOfDifferentPluginsWithEqualDependencies();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class4.testErroneousJoiningOfDifferentPluginsWithEqualExecutionIds();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class4.testExecutionConfiguration();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class4.testSingleConfigurationInheritance();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class4.testConfigWithPluginManagement();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class4.testExecutionConfigurationSubcollections();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		try {
			class4.testMultipleRepositories();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class4.testMultipleExecutionIds();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class4.testConsecutiveEmptyElements();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
		try {
			class4.testOrderOfGoalsFromPluginExecutionWithoutPluginManagement();
		}
		catch (java.lang.Exception err49) {
			err49.printStackTrace();
		}
		try {
			class4.testOrderOfGoalsFromPluginExecutionWithPluginManagement();
		}
		catch (java.lang.Exception err50) {
			err50.printStackTrace();
		}
		try {
			class4.testOrderOfPluginExecutionsWithoutPluginManagement();
		}
		catch (java.lang.Exception err51) {
			err51.printStackTrace();
		}
		try {
			class4.testOrderOfPluginExecutionsWithPluginManagement();
		}
		catch (java.lang.Exception err52) {
			err52.printStackTrace();
		}
		try {
			class4.testMergeOfPluginExecutionsWhenChildInheritsPluginVersion();
		}
		catch (java.lang.Exception err53) {
			err53.printStackTrace();
		}
		try {
			class4.testMergeOfPluginExecutionsWhenChildAndParentUseDifferentPluginVersions();
		}
		catch (java.lang.Exception err54) {
			err54.printStackTrace();
		}
		try {
			class4.testInterpolationWithXmlMarkup();
		}
		catch (java.lang.Exception err55) {
			err55.printStackTrace();
		}
		try {
			class4.testOrderOfMergedPluginExecutionsWithoutPluginManagement();
		}
		catch (java.lang.Exception err56) {
			err56.printStackTrace();
		}
		try {
			class4.testOrderOfMergedPluginExecutionsWithPluginManagement();
		}
		catch (java.lang.Exception err57) {
			err57.printStackTrace();
		}
		try {
			class4.testDifferentContainersWithSameId();
		}
		catch (java.lang.Exception err58) {
			err58.printStackTrace();
		}
		try {
			class4.testOrderOfMergedPluginExecutionGoalsWithoutPluginManagement();
		}
		catch (java.lang.Exception err59) {
			err59.printStackTrace();
		}
		try {
			class4.testOrderOfMergedPluginExecutionGoalsWithPluginManagement();
		}
		catch (java.lang.Exception err60) {
			err60.printStackTrace();
		}
		try {
			class4.testOverridingOfInheritedPluginExecutionsWithoutPluginManagement();
		}
		catch (java.lang.Exception err61) {
			err61.printStackTrace();
		}
		try {
			class4.testOverridingOfInheritedPluginExecutionsWithPluginManagement();
		}
		catch (java.lang.Exception err62) {
			err62.printStackTrace();
		}
		try {
			class4.testOrderOfMergedPluginDependenciesWithoutPluginManagement();
		}
		catch (java.lang.Exception err63) {
			err63.printStackTrace();
		}
		try {
			class4.testOrderOfMergedPluginDependenciesWithPluginManagement();
		}
		catch (java.lang.Exception err64) {
			err64.printStackTrace();
		}
		try {
			class4.testInterpolationOfNestedBuildDirectories();
		}
		catch (java.lang.Exception err65) {
			err65.printStackTrace();
		}
		try {
			class4.testAppendArtifactIdOfChildToInheritedUrls();
		}
		catch (java.lang.Exception err66) {
			err66.printStackTrace();
		}
		try {
			class4.testAppendArtifactIdOfParentAndChildToInheritedUrls();
		}
		catch (java.lang.Exception err67) {
			err67.printStackTrace();
		}
		try {
			class4.testNonInheritedElementsInSubtreesOverriddenByChild();
		}
		catch (java.lang.Exception err68) {
			err68.printStackTrace();
		}
		try {
			class4.testXmlTextCoalescing();
		}
		catch (java.lang.Exception err69) {
			err69.printStackTrace();
		}
		try {
			class4.testFullInterpolationOfNestedExpressions();
		}
		catch (java.lang.Exception err70) {
			err70.printStackTrace();
		}
		try {
			class4.testInterpolationOfLegacyExpressionsThatDontIncludeTheProjectPrefix();
		}
		catch (java.lang.Exception err71) {
			err71.printStackTrace();
		}
		try {
			class4.testInterpolationWithBasedirAlignedDirectories();
		}
		catch (java.lang.Exception err72) {
			err72.printStackTrace();
		}
		try {
			class4.testInterpolationOfBasedirInPomWithUnusualName();
		}
		catch (java.lang.Exception err73) {
			err73.printStackTrace();
		}
		try {
			class4.testJoiningOfContainersWhenChildHasEmptyElements();
		}
		catch (java.lang.Exception err74) {
			err74.printStackTrace();
		}
		try {
			class4.testOrderOfPluginConfigurationElementsWithoutPluginManagement();
		}
		catch (java.lang.Exception err75) {
			err75.printStackTrace();
		}
		try {
			class4.testOrderOfPluginConfigurationElementsWithPluginManagement();
		}
		catch (java.lang.Exception err76) {
			err76.printStackTrace();
		}
		try {
			class4.testOrderOfPluginExecutionConfigurationElementsWithoutPluginManagement();
		}
		catch (java.lang.Exception err77) {
			err77.printStackTrace();
		}
		try {
			class4.testOrderOfPluginExecutionConfigurationElementsWithPluginManagement();
		}
		catch (java.lang.Exception err78) {
			err78.printStackTrace();
		}
		try {
			class4.testMergeOfInheritedPluginConfiguration();
		}
		catch (java.lang.Exception err79) {
			err79.printStackTrace();
		}
		try {
			class4.testAppendOfInheritedPluginConfigurationWithNoProfile();
		}
		catch (java.lang.Exception err80) {
			err80.printStackTrace();
		}
		try {
			class4.testAppendOfInheritedPluginConfigurationWithActiveProfile();
		}
		catch (java.lang.Exception err81) {
			err81.printStackTrace();
		}
		try {
			class4.testMultiplePluginExecutionsWithAndWithoutIdsWithoutPluginManagement();
		}
		catch (java.lang.Exception err82) {
			err82.printStackTrace();
		}
		try {
			class4.testMultiplePluginExecutionsWithAndWithoutIdsWithPluginManagement();
		}
		catch (java.lang.Exception err83) {
			err83.printStackTrace();
		}
		try {
			class4.testDependencyOrderWithoutPluginManagement();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		try {
			class4.testDependencyOrderWithPluginManagement();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class4.testBuildDirectoriesUsePlatformSpecificFileSeparator();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		try {
			class4.testMergedFilterOrder();
		}
		catch (java.lang.Exception err87) {
			err87.printStackTrace();
		}
		try {
			class4.testProfileInjectedDependencies();
		}
		catch (java.lang.Exception err88) {
			err88.printStackTrace();
		}
		try {
			class4.testProfileDependenciesMultipleProfiles();
		}
		catch (java.lang.Exception err89) {
			err89.printStackTrace();
		}
		try {
			class4.testDependencyInheritance();
		}
		catch (java.lang.Exception err90) {
			err90.printStackTrace();
		}
		try {
			class4.testManagedProfileDependency();
		}
		catch (java.lang.Exception err91) {
			err91.printStackTrace();
		}
		try {
			class4.testProfileModuleInheritance();
		}
		catch (java.lang.Exception err92) {
			err92.printStackTrace();
		}
		try {
			class4.testUncPath();
		}
		catch (java.lang.Exception err93) {
			err93.printStackTrace();
		}
		try {
			class4.testUrlAppendWithChildPathAdjustment();
		}
		catch (java.lang.Exception err94) {
			err94.printStackTrace();
		}
		try {
			class4.testRepoInheritance();
		}
		catch (java.lang.Exception err95) {
			err95.printStackTrace();
		}
		try {
			class4.testEmptyScm();
		}
		catch (java.lang.Exception err96) {
			err96.printStackTrace();
		}
		try {
			class4.testPluginConfigurationUsingAttributesWithoutPluginManagement();
		}
		catch (java.lang.Exception err97) {
			err97.printStackTrace();
		}
		try {
			class4.testPluginConfigurationUsingAttributesWithPluginManagement();
		}
		catch (java.lang.Exception err98) {
			err98.printStackTrace();
		}
		try {
			class4.testPluginConfigurationUsingAttributesWithPluginManagementAndProfile();
		}
		catch (java.lang.Exception err99) {
			err99.printStackTrace();
		}
		try {
			class4.testPomEncoding();
		}
		catch (java.lang.Exception err100) {
			err100.printStackTrace();
		}
		try {
			class4.testXmlWhitespaceHandling();
		}
		catch (java.lang.Exception err101) {
			err101.printStackTrace();
		}
		try {
			class4.testInterpolationOfBaseUri();
		}
		catch (java.lang.Exception err102) {
			err102.printStackTrace();
		}
		try {
			class4.testInterpolationOfRfc3986BaseUri();
		}
		catch (java.lang.Exception err103) {
			err103.printStackTrace();
		}
		try {
			class4.testReportingPluginConfig();
		}
		catch (java.lang.Exception err104) {
			err104.printStackTrace();
		}
		try {
			class4.testPropertiesNoDuplication();
		}
		catch (java.lang.Exception err105) {
			err105.printStackTrace();
		}
		try {
			class4.testPomInheritance();
		}
		catch (java.lang.Exception err106) {
			err106.printStackTrace();
		}
		try {
			class4.testCompleteModelWithoutParent();
		}
		catch (java.lang.Exception err107) {
			err107.printStackTrace();
		}
		try {
			class4.testCompleteModelWithParent();
		}
		catch (java.lang.Exception err108) {
			err108.printStackTrace();
		}
		try {
			class4.testProfileInjectionOrder();
		}
		catch (java.lang.Exception err109) {
			err109.printStackTrace();
		}
		try {
			class4.testPropertiesInheritance();
		}
		catch (java.lang.Exception err110) {
			err110.printStackTrace();
		}
		try {
			class4.testInheritedPropertiesInterpolatedWithValuesFromChildWithoutProfiles();
		}
		catch (java.lang.Exception err111) {
			err111.printStackTrace();
		}
		try {
			class4.testInheritedPropertiesInterpolatedWithValuesFromChildWithActiveProfiles();
		}
		catch (java.lang.Exception err112) {
			err112.printStackTrace();
		}
		try {
			class4.testProfileDefaultActivation();
		}
		catch (java.lang.Exception err113) {
			err113.printStackTrace();
		}
		try {
			class4.testBooleanInterpolation();
		}
		catch (java.lang.Exception err114) {
			err114.printStackTrace();
		}
		try {
			class4.testBuildExtensionInheritance();
		}
		catch (java.lang.Exception err115) {
			err115.printStackTrace();
		}
		try {
			class4.testJdkActivation();
		}
		catch (java.lang.Exception err116) {
			err116.printStackTrace();
		}
		try {
			class4.testProfilePluginMngDependencies();
		}
		catch (java.lang.Exception err117) {
			err117.printStackTrace();
		}
		try {
			class4.testPercentEncodedUrlsMustNotBeDecoded();
		}
		catch (java.lang.Exception err118) {
			err118.printStackTrace();
		}
		try {
			class4.testPluginManagementInheritance();
		}
		catch (java.lang.Exception err119) {
			err119.printStackTrace();
		}
		try {
			class4.testProfilePlugins();
		}
		catch (java.lang.Exception err120) {
			err120.printStackTrace();
		}
		try {
			class4.testPluginInheritanceSimple();
		}
		catch (java.lang.Exception err121) {
			err121.printStackTrace();
		}
		try {
			class4.testPluginManagementDuplicate();
		}
		catch (java.lang.Exception err122) {
			err122.printStackTrace();
		}
		try {
			class4.testDistributionManagement();
		}
		catch (java.lang.Exception err123) {
			err123.printStackTrace();
		}
		try {
			class4.testDependencyScopeInheritance();
		}
		catch (java.lang.Exception err124) {
			err124.printStackTrace();
		}
		try {
			class4.testDependencyScope();
		}
		catch (java.lang.Exception err125) {
			err125.printStackTrace();
		}
		try {
			class4.testDependencyManagementWithInterpolation();
		}
		catch (java.lang.Exception err126) {
			err126.printStackTrace();
		}
		try {
			class4.testInterpolationWithSystemProperty();
		}
		catch (java.lang.Exception err127) {
			err127.printStackTrace();
		}
		try {
			class4.testPluginExecutionInheritanceWhenChildDoesNotDeclarePlugin();
		}
		catch (java.lang.Exception err128) {
			err128.printStackTrace();
		}
		try {
			class4.testPluginExecutionInheritanceWhenChildDoesDeclarePluginAsWell();
		}
		catch (java.lang.Exception err129) {
			err129.printStackTrace();
		}
		try {
			class4.testValidationErrorUponNonUniqueArtifactRepositoryId();
		}
		catch (java.lang.Exception err130) {
			err130.printStackTrace();
		}
		try {
			class4.testValidationErrorUponNonUniquePluginRepositoryId();
		}
		catch (java.lang.Exception err131) {
			err131.printStackTrace();
		}
		try {
			class4.testValidationErrorUponNonUniqueArtifactRepositoryIdInProfile();
		}
		catch (java.lang.Exception err132) {
			err132.printStackTrace();
		}
		try {
			class4.testValidationErrorUponNonUniquePluginRepositoryIdInProfile();
		}
		catch (java.lang.Exception err133) {
			err133.printStackTrace();
		}
		try {
			class4.testPrerequisitesAreNotInherited();
		}
		catch (java.lang.Exception err134) {
			err134.printStackTrace();
		}
		try {
			class4.testLicensesAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err135) {
			err135.printStackTrace();
		}
		try {
			class4.testDevelopersAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err136) {
			err136.printStackTrace();
		}
		try {
			class4.testContributorsAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err137) {
			err137.printStackTrace();
		}
		try {
			class4.testMailingListsAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err138) {
			err138.printStackTrace();
		}
		try {
			class4.testPluginInheritanceOrder();
		}
		catch (java.lang.Exception err139) {
			err139.printStackTrace();
		}
		try {
			class4.testCliPropsDominateProjectPropsDuringInterpolation();
		}
		catch (java.lang.Exception err140) {
			err140.printStackTrace();
		}
		try {
			class4.testParentPomPackagingMustBePom();
		}
		catch (java.lang.Exception err141) {
			err141.printStackTrace();
		}
		try {
			class4.testManagedPluginConfigurationAppliesToImplicitPluginsIntroducedByPackaging();
		}
		catch (java.lang.Exception err142) {
			err142.printStackTrace();
		}
		try {
			class4.testDefaultPluginsExecutionContributedByPackagingExecuteBeforeUserDefinedExecutions();
		}
		catch (java.lang.Exception err143) {
			err143.printStackTrace();
		}
		try {
			class4.testPluginDeclarationsRetainPomOrderAfterInjectionOfDefaultPlugins();
		}
		catch (java.lang.Exception err144) {
			err144.printStackTrace();
		}
		try {
			class4.testPluginOrderAfterMergingWithInheritedPlugins();
		}
		catch (java.lang.Exception err145) {
			err145.printStackTrace();
		}
		try {
			class4.testPluginOrderAfterMergingWithInjectedPlugins();
		}
		catch (java.lang.Exception err146) {
			err146.printStackTrace();
		}
		try {
			class4.testProjectArtifactIdIsNotInheritedButMandatory();
		}
		catch (java.lang.Exception err147) {
			err147.printStackTrace();
		}
		org.apache.maven.project.ProjectBuilderTest class5 = new org.apache.maven.project.ProjectBuilderTest();
		try {
			class5.testSystemScopeDependencyIsPresentInTheCompileClasspathElements();
		}
		catch (java.lang.Exception err148) {
			err148.printStackTrace();
		}
		try {
			class5.testBuildFromModelSource();
		}
		catch (java.lang.Exception err149) {
			err149.printStackTrace();
		}
		try {
			class5.testVersionlessManagedDependency();
		}
		catch (java.lang.Exception err150) {
			err150.printStackTrace();
		}
		try {
			class5.testResolveDependencies();
		}
		catch (java.lang.Exception err151) {
			err151.printStackTrace();
		}
		try {
			class5.testDontResolveDependencies();
		}
		catch (java.lang.Exception err152) {
			err152.printStackTrace();
		}
		try {
			class5.testReadModifiedPoms();
		}
		catch (java.lang.Exception err153) {
			err153.printStackTrace();
		}
		try {
			class5.testReadErroneousMavenProjectContainsReference();
		}
		catch (java.lang.Exception err154) {
			err154.printStackTrace();
		}
		try {
			class5.testReadInvalidPom();
		}
		catch (java.lang.Exception err155) {
			err155.printStackTrace();
		}
		try {
			class5.testReadParentAndChildWithRegularVersionSetParentFile();
		}
		catch (java.lang.Exception err156) {
			err156.printStackTrace();
		}
		try {
			class5.testBuildProperties();
		}
		catch (java.lang.Exception err157) {
			err157.printStackTrace();
		}
		org.apache.maven.project.MavenProjectTest class6 = new org.apache.maven.project.MavenProjectTest();
		try {
			class6.testShouldInterpretChildPathAdjustmentBasedOnModulePaths();
		}
		catch (java.io.IOException err158) {
			err158.printStackTrace();
		}
		class6.testIdentityProtoInheritance();
		class6.testEmptyConstructor();
		try {
			class6.testClone();
		}
		catch (java.lang.Exception err159) {
			err159.printStackTrace();
		}
		try {
			class6.testCloneWithDependencyManagement();
		}
		catch (java.lang.Exception err160) {
			err160.printStackTrace();
		}
		try {
			class6.testGetModulePathAdjustment();
		}
		catch (java.io.IOException err161) {
			err161.printStackTrace();
		}
		try {
			class6.testCloneWithDistributionManagement();
		}
		catch (java.lang.Exception err162) {
			err162.printStackTrace();
		}
		try {
			class6.testCloneWithActiveProfile();
		}
		catch (java.lang.Exception err163) {
			err163.printStackTrace();
		}
		try {
			class6.testCloneWithBaseDir();
		}
		catch (java.lang.Exception err164) {
			err164.printStackTrace();
		}
		try {
			class6.testUndefinedOutputDirectory();
		}
		catch (java.lang.Exception err165) {
			err165.printStackTrace();
		}
		class6.testAddDotFile();
		org.apache.maven.project.DefaultMavenProjectBuilderTest class7 = new org.apache.maven.project.DefaultMavenProjectBuilderTest();
		try {
			class7.testBuildFromMiddlePom();
		}
		catch (java.lang.Exception err166) {
			err166.printStackTrace();
		}
		try {
			class7.testDuplicatePluginDefinitionsMerged();
		}
		catch (java.lang.Exception err167) {
			err167.printStackTrace();
		}
		try {
			class7.testFutureModelVersion();
		}
		catch (java.lang.Exception err168) {
			err168.printStackTrace();
		}
		try {
			class7.testPastModelVersion();
		}
		catch (java.lang.Exception err169) {
			err169.printStackTrace();
		}
		try {
			class7.testFutureSchemaModelVersion();
		}
		catch (java.lang.Exception err170) {
			err170.printStackTrace();
		}
		try {
			class7.testBuildStubModelForMissingRemotePom();
		}
		catch (java.lang.Exception err171) {
			err171.printStackTrace();
		}
		try {
			class7.testPartialResultUponBadDependencyDeclaration();
		}
		catch (java.lang.Exception err172) {
			err172.printStackTrace();
		}
		try {
			class7.testImportScopePomResolvesFromPropertyBasedRepository();
		}
		catch (java.lang.Exception err173) {
			err173.printStackTrace();
		}
		try {
			class7.testBuildValidParentVersionRangeLocally();
		}
		catch (java.lang.Exception err174) {
			err174.printStackTrace();
		}
		try {
			class7.testBuildParentVersionRangeLocallyWithoutChildVersion();
		}
		catch (java.lang.Exception err175) {
			err175.printStackTrace();
		}
		try {
			class7.testBuildParentVersionRangeLocallyWithChildVersionExpression();
		}
		catch (java.lang.Exception err176) {
			err176.printStackTrace();
		}
		try {
			class7.testBuildParentVersionRangeExternally();
		}
		catch (java.lang.Exception err177) {
			err177.printStackTrace();
		}
		try {
			class7.testBuildParentVersionRangeExternallyWithoutChildVersion();
		}
		catch (java.lang.Exception err178) {
			err178.printStackTrace();
		}
		try {
			class7.testBuildParentVersionRangeExternallyWithChildVersionExpression();
		}
		catch (java.lang.Exception err179) {
			err179.printStackTrace();
		}
	}
}