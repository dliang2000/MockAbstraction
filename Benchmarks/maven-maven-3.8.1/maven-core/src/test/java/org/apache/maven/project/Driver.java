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
		org.apache.maven.project.PomConstructionTest class2 = new org.apache.maven.project.PomConstructionTest();
		try {
			class2.testEmptyUrl();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class2.testProfileModules();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class2.testParentInheritance();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class2.testExecutionConfigurationJoin();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class2.testPluginConfigProperties();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class2.testProfilePropertiesInterpolation();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class2.testThatExecutionsWithoutIdsAreMergedAndTheChildWins();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class2.testDuplicateExclusionsDependency();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class2.testMultipleFilters();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class2.testDuplicateDependenciesCauseLastDeclarationToBePickedInLenientMode();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class2.testParentInterpolation();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class2.testPluginManagementInherited();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class2.testPluginManagementDependencies();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class2.testReportingInterpolation();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class2.testPluginOrder();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class2.testErroneousJoiningOfDifferentPluginsWithEqualDependencies();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class2.testErroneousJoiningOfDifferentPluginsWithEqualExecutionIds();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class2.testExecutionConfiguration();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class2.testSingleConfigurationInheritance();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class2.testConfigWithPluginManagement();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class2.testExecutionConfigurationSubcollections();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class2.testMultipleRepositories();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class2.testMultipleExecutionIds();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class2.testConsecutiveEmptyElements();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class2.testOrderOfGoalsFromPluginExecutionWithoutPluginManagement();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class2.testOrderOfGoalsFromPluginExecutionWithPluginManagement();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class2.testOrderOfPluginExecutionsWithoutPluginManagement();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class2.testOrderOfPluginExecutionsWithPluginManagement();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class2.testMergeOfPluginExecutionsWhenChildInheritsPluginVersion();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class2.testMergeOfPluginExecutionsWhenChildAndParentUseDifferentPluginVersions();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class2.testInterpolationWithXmlMarkup();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class2.testOrderOfMergedPluginExecutionsWithoutPluginManagement();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class2.testOrderOfMergedPluginExecutionsWithPluginManagement();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		try {
			class2.testDifferentContainersWithSameId();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class2.testOrderOfMergedPluginExecutionGoalsWithoutPluginManagement();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class2.testOrderOfMergedPluginExecutionGoalsWithPluginManagement();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
		try {
			class2.testOverridingOfInheritedPluginExecutionsWithoutPluginManagement();
		}
		catch (java.lang.Exception err49) {
			err49.printStackTrace();
		}
		try {
			class2.testOverridingOfInheritedPluginExecutionsWithPluginManagement();
		}
		catch (java.lang.Exception err50) {
			err50.printStackTrace();
		}
		try {
			class2.testOrderOfMergedPluginDependenciesWithoutPluginManagement();
		}
		catch (java.lang.Exception err51) {
			err51.printStackTrace();
		}
		try {
			class2.testOrderOfMergedPluginDependenciesWithPluginManagement();
		}
		catch (java.lang.Exception err52) {
			err52.printStackTrace();
		}
		try {
			class2.testInterpolationOfNestedBuildDirectories();
		}
		catch (java.lang.Exception err53) {
			err53.printStackTrace();
		}
		try {
			class2.testAppendArtifactIdOfChildToInheritedUrls();
		}
		catch (java.lang.Exception err54) {
			err54.printStackTrace();
		}
		try {
			class2.testAppendArtifactIdOfParentAndChildToInheritedUrls();
		}
		catch (java.lang.Exception err55) {
			err55.printStackTrace();
		}
		try {
			class2.testNonInheritedElementsInSubtreesOverriddenByChild();
		}
		catch (java.lang.Exception err56) {
			err56.printStackTrace();
		}
		try {
			class2.testXmlTextCoalescing();
		}
		catch (java.lang.Exception err57) {
			err57.printStackTrace();
		}
		try {
			class2.testFullInterpolationOfNestedExpressions();
		}
		catch (java.lang.Exception err58) {
			err58.printStackTrace();
		}
		try {
			class2.testInterpolationOfLegacyExpressionsThatDontIncludeTheProjectPrefix();
		}
		catch (java.lang.Exception err59) {
			err59.printStackTrace();
		}
		try {
			class2.testInterpolationWithBasedirAlignedDirectories();
		}
		catch (java.lang.Exception err60) {
			err60.printStackTrace();
		}
		try {
			class2.testInterpolationOfBasedirInPomWithUnusualName();
		}
		catch (java.lang.Exception err61) {
			err61.printStackTrace();
		}
		try {
			class2.testJoiningOfContainersWhenChildHasEmptyElements();
		}
		catch (java.lang.Exception err62) {
			err62.printStackTrace();
		}
		try {
			class2.testOrderOfPluginConfigurationElementsWithoutPluginManagement();
		}
		catch (java.lang.Exception err63) {
			err63.printStackTrace();
		}
		try {
			class2.testOrderOfPluginConfigurationElementsWithPluginManagement();
		}
		catch (java.lang.Exception err64) {
			err64.printStackTrace();
		}
		try {
			class2.testOrderOfPluginExecutionConfigurationElementsWithoutPluginManagement();
		}
		catch (java.lang.Exception err65) {
			err65.printStackTrace();
		}
		try {
			class2.testOrderOfPluginExecutionConfigurationElementsWithPluginManagement();
		}
		catch (java.lang.Exception err66) {
			err66.printStackTrace();
		}
		try {
			class2.testMergeOfInheritedPluginConfiguration();
		}
		catch (java.lang.Exception err67) {
			err67.printStackTrace();
		}
		try {
			class2.testAppendOfInheritedPluginConfigurationWithNoProfile();
		}
		catch (java.lang.Exception err68) {
			err68.printStackTrace();
		}
		try {
			class2.testAppendOfInheritedPluginConfigurationWithActiveProfile();
		}
		catch (java.lang.Exception err69) {
			err69.printStackTrace();
		}
		try {
			class2.testMultiplePluginExecutionsWithAndWithoutIdsWithoutPluginManagement();
		}
		catch (java.lang.Exception err70) {
			err70.printStackTrace();
		}
		try {
			class2.testMultiplePluginExecutionsWithAndWithoutIdsWithPluginManagement();
		}
		catch (java.lang.Exception err71) {
			err71.printStackTrace();
		}
		try {
			class2.testDependencyOrderWithoutPluginManagement();
		}
		catch (java.lang.Exception err72) {
			err72.printStackTrace();
		}
		try {
			class2.testDependencyOrderWithPluginManagement();
		}
		catch (java.lang.Exception err73) {
			err73.printStackTrace();
		}
		try {
			class2.testBuildDirectoriesUsePlatformSpecificFileSeparator();
		}
		catch (java.lang.Exception err74) {
			err74.printStackTrace();
		}
		try {
			class2.testMergedFilterOrder();
		}
		catch (java.lang.Exception err75) {
			err75.printStackTrace();
		}
		try {
			class2.testProfileInjectedDependencies();
		}
		catch (java.lang.Exception err76) {
			err76.printStackTrace();
		}
		try {
			class2.testProfileDependenciesMultipleProfiles();
		}
		catch (java.lang.Exception err77) {
			err77.printStackTrace();
		}
		try {
			class2.testDependencyInheritance();
		}
		catch (java.lang.Exception err78) {
			err78.printStackTrace();
		}
		try {
			class2.testManagedProfileDependency();
		}
		catch (java.lang.Exception err79) {
			err79.printStackTrace();
		}
		try {
			class2.testProfileModuleInheritance();
		}
		catch (java.lang.Exception err80) {
			err80.printStackTrace();
		}
		try {
			class2.testUncPath();
		}
		catch (java.lang.Exception err81) {
			err81.printStackTrace();
		}
		try {
			class2.testUrlAppendWithChildPathAdjustment();
		}
		catch (java.lang.Exception err82) {
			err82.printStackTrace();
		}
		try {
			class2.testRepoInheritance();
		}
		catch (java.lang.Exception err83) {
			err83.printStackTrace();
		}
		try {
			class2.testEmptyScm();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		try {
			class2.testPluginConfigurationUsingAttributesWithoutPluginManagement();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class2.testPluginConfigurationUsingAttributesWithPluginManagement();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		try {
			class2.testPluginConfigurationUsingAttributesWithPluginManagementAndProfile();
		}
		catch (java.lang.Exception err87) {
			err87.printStackTrace();
		}
		try {
			class2.testPomEncoding();
		}
		catch (java.lang.Exception err88) {
			err88.printStackTrace();
		}
		try {
			class2.testXmlWhitespaceHandling();
		}
		catch (java.lang.Exception err89) {
			err89.printStackTrace();
		}
		try {
			class2.testInterpolationOfBaseUri();
		}
		catch (java.lang.Exception err90) {
			err90.printStackTrace();
		}
		try {
			class2.testInterpolationOfRfc3986BaseUri();
		}
		catch (java.lang.Exception err91) {
			err91.printStackTrace();
		}
		try {
			class2.testReportingPluginConfig();
		}
		catch (java.lang.Exception err92) {
			err92.printStackTrace();
		}
		try {
			class2.testPropertiesNoDuplication();
		}
		catch (java.lang.Exception err93) {
			err93.printStackTrace();
		}
		try {
			class2.testPomInheritance();
		}
		catch (java.lang.Exception err94) {
			err94.printStackTrace();
		}
		try {
			class2.testCompleteModelWithoutParent();
		}
		catch (java.lang.Exception err95) {
			err95.printStackTrace();
		}
		try {
			class2.testCompleteModelWithParent();
		}
		catch (java.lang.Exception err96) {
			err96.printStackTrace();
		}
		try {
			class2.testProfileInjectionOrder();
		}
		catch (java.lang.Exception err97) {
			err97.printStackTrace();
		}
		try {
			class2.testPropertiesInheritance();
		}
		catch (java.lang.Exception err98) {
			err98.printStackTrace();
		}
		try {
			class2.testInheritedPropertiesInterpolatedWithValuesFromChildWithoutProfiles();
		}
		catch (java.lang.Exception err99) {
			err99.printStackTrace();
		}
		try {
			class2.testInheritedPropertiesInterpolatedWithValuesFromChildWithActiveProfiles();
		}
		catch (java.lang.Exception err100) {
			err100.printStackTrace();
		}
		try {
			class2.testProfileDefaultActivation();
		}
		catch (java.lang.Exception err101) {
			err101.printStackTrace();
		}
		try {
			class2.testBooleanInterpolation();
		}
		catch (java.lang.Exception err102) {
			err102.printStackTrace();
		}
		try {
			class2.testBuildExtensionInheritance();
		}
		catch (java.lang.Exception err103) {
			err103.printStackTrace();
		}
		try {
			class2.testJdkActivation();
		}
		catch (java.lang.Exception err104) {
			err104.printStackTrace();
		}
		try {
			class2.testProfilePluginMngDependencies();
		}
		catch (java.lang.Exception err105) {
			err105.printStackTrace();
		}
		try {
			class2.testPercentEncodedUrlsMustNotBeDecoded();
		}
		catch (java.lang.Exception err106) {
			err106.printStackTrace();
		}
		try {
			class2.testPluginManagementInheritance();
		}
		catch (java.lang.Exception err107) {
			err107.printStackTrace();
		}
		try {
			class2.testProfilePlugins();
		}
		catch (java.lang.Exception err108) {
			err108.printStackTrace();
		}
		try {
			class2.testPluginInheritanceSimple();
		}
		catch (java.lang.Exception err109) {
			err109.printStackTrace();
		}
		try {
			class2.testPluginManagementDuplicate();
		}
		catch (java.lang.Exception err110) {
			err110.printStackTrace();
		}
		try {
			class2.testDistributionManagement();
		}
		catch (java.lang.Exception err111) {
			err111.printStackTrace();
		}
		try {
			class2.testDependencyScopeInheritance();
		}
		catch (java.lang.Exception err112) {
			err112.printStackTrace();
		}
		try {
			class2.testDependencyScope();
		}
		catch (java.lang.Exception err113) {
			err113.printStackTrace();
		}
		try {
			class2.testDependencyManagementWithInterpolation();
		}
		catch (java.lang.Exception err114) {
			err114.printStackTrace();
		}
		try {
			class2.testInterpolationWithSystemProperty();
		}
		catch (java.lang.Exception err115) {
			err115.printStackTrace();
		}
		try {
			class2.testPluginExecutionInheritanceWhenChildDoesNotDeclarePlugin();
		}
		catch (java.lang.Exception err116) {
			err116.printStackTrace();
		}
		try {
			class2.testPluginExecutionInheritanceWhenChildDoesDeclarePluginAsWell();
		}
		catch (java.lang.Exception err117) {
			err117.printStackTrace();
		}
		try {
			class2.testValidationErrorUponNonUniqueArtifactRepositoryId();
		}
		catch (java.lang.Exception err118) {
			err118.printStackTrace();
		}
		try {
			class2.testValidationErrorUponNonUniquePluginRepositoryId();
		}
		catch (java.lang.Exception err119) {
			err119.printStackTrace();
		}
		try {
			class2.testValidationErrorUponNonUniqueArtifactRepositoryIdInProfile();
		}
		catch (java.lang.Exception err120) {
			err120.printStackTrace();
		}
		try {
			class2.testValidationErrorUponNonUniquePluginRepositoryIdInProfile();
		}
		catch (java.lang.Exception err121) {
			err121.printStackTrace();
		}
		try {
			class2.testPrerequisitesAreNotInherited();
		}
		catch (java.lang.Exception err122) {
			err122.printStackTrace();
		}
		try {
			class2.testLicensesAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err123) {
			err123.printStackTrace();
		}
		try {
			class2.testDevelopersAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err124) {
			err124.printStackTrace();
		}
		try {
			class2.testContributorsAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err125) {
			err125.printStackTrace();
		}
		try {
			class2.testMailingListsAreInheritedButNotAggregated();
		}
		catch (java.lang.Exception err126) {
			err126.printStackTrace();
		}
		try {
			class2.testPluginInheritanceOrder();
		}
		catch (java.lang.Exception err127) {
			err127.printStackTrace();
		}
		try {
			class2.testCliPropsDominateProjectPropsDuringInterpolation();
		}
		catch (java.lang.Exception err128) {
			err128.printStackTrace();
		}
		try {
			class2.testParentPomPackagingMustBePom();
		}
		catch (java.lang.Exception err129) {
			err129.printStackTrace();
		}
		try {
			class2.testManagedPluginConfigurationAppliesToImplicitPluginsIntroducedByPackaging();
		}
		catch (java.lang.Exception err130) {
			err130.printStackTrace();
		}
		try {
			class2.testDefaultPluginsExecutionContributedByPackagingExecuteBeforeUserDefinedExecutions();
		}
		catch (java.lang.Exception err131) {
			err131.printStackTrace();
		}
		try {
			class2.testPluginDeclarationsRetainPomOrderAfterInjectionOfDefaultPlugins();
		}
		catch (java.lang.Exception err132) {
			err132.printStackTrace();
		}
		try {
			class2.testPluginOrderAfterMergingWithInheritedPlugins();
		}
		catch (java.lang.Exception err133) {
			err133.printStackTrace();
		}
		try {
			class2.testPluginOrderAfterMergingWithInjectedPlugins();
		}
		catch (java.lang.Exception err134) {
			err134.printStackTrace();
		}
		try {
			class2.testProjectArtifactIdIsNotInheritedButMandatory();
		}
		catch (java.lang.Exception err135) {
			err135.printStackTrace();
		}
		org.apache.maven.project.MavenProjectTest class3 = new org.apache.maven.project.MavenProjectTest();
		try {
			class3.testShouldInterpretChildPathAdjustmentBasedOnModulePaths();
		}
		catch (java.io.IOException err136) {
			err136.printStackTrace();
		}
		class3.testIdentityProtoInheritance();
		class3.testEmptyConstructor();
		try {
			class3.testClone();
		}
		catch (java.lang.Exception err137) {
			err137.printStackTrace();
		}
		try {
			class3.testCloneWithDependencyManagement();
		}
		catch (java.lang.Exception err138) {
			err138.printStackTrace();
		}
		try {
			class3.testGetModulePathAdjustment();
		}
		catch (java.io.IOException err139) {
			err139.printStackTrace();
		}
		try {
			class3.testCloneWithDistributionManagement();
		}
		catch (java.lang.Exception err140) {
			err140.printStackTrace();
		}
		try {
			class3.testCloneWithActiveProfile();
		}
		catch (java.lang.Exception err141) {
			err141.printStackTrace();
		}
		try {
			class3.testCloneWithBaseDir();
		}
		catch (java.lang.Exception err142) {
			err142.printStackTrace();
		}
		try {
			class3.testUndefinedOutputDirectory();
		}
		catch (java.lang.Exception err143) {
			err143.printStackTrace();
		}
		class3.testAddDotFile();
		org.apache.maven.project.DefaultMavenProjectBuilderTest class4 = new org.apache.maven.project.DefaultMavenProjectBuilderTest();
		try {
			class4.testBuildFromMiddlePom();
		}
		catch (java.lang.Exception err144) {
			err144.printStackTrace();
		}
		try {
			class4.testDuplicatePluginDefinitionsMerged();
		}
		catch (java.lang.Exception err145) {
			err145.printStackTrace();
		}
		try {
			class4.testFutureModelVersion();
		}
		catch (java.lang.Exception err146) {
			err146.printStackTrace();
		}
		try {
			class4.testPastModelVersion();
		}
		catch (java.lang.Exception err147) {
			err147.printStackTrace();
		}
		try {
			class4.testFutureSchemaModelVersion();
		}
		catch (java.lang.Exception err148) {
			err148.printStackTrace();
		}
		try {
			class4.testBuildStubModelForMissingRemotePom();
		}
		catch (java.lang.Exception err149) {
			err149.printStackTrace();
		}
		try {
			class4.testPartialResultUponBadDependencyDeclaration();
		}
		catch (java.lang.Exception err150) {
			err150.printStackTrace();
		}
		try {
			class4.testImportScopePomResolvesFromPropertyBasedRepository();
		}
		catch (java.lang.Exception err151) {
			err151.printStackTrace();
		}
		try {
			class4.testBuildValidParentVersionRangeLocally();
		}
		catch (java.lang.Exception err152) {
			err152.printStackTrace();
		}
		try {
			class4.testBuildParentVersionRangeLocallyWithoutChildVersion();
		}
		catch (java.lang.Exception err153) {
			err153.printStackTrace();
		}
		try {
			class4.testBuildParentVersionRangeLocallyWithChildVersionExpression();
		}
		catch (java.lang.Exception err154) {
			err154.printStackTrace();
		}
		try {
			class4.testBuildParentVersionRangeExternally();
		}
		catch (java.lang.Exception err155) {
			err155.printStackTrace();
		}
		try {
			class4.testBuildParentVersionRangeExternallyWithoutChildVersion();
		}
		catch (java.lang.Exception err156) {
			err156.printStackTrace();
		}
		try {
			class4.testBuildParentVersionRangeExternallyWithChildVersionExpression();
		}
		catch (java.lang.Exception err157) {
			err157.printStackTrace();
		}
		org.apache.maven.project.ExtensionDescriptorBuilderTest class5 = new org.apache.maven.project.ExtensionDescriptorBuilderTest();
		try {
			class5.testEmptyDescriptor();
		}
		catch (java.lang.Exception err158) {
			err158.printStackTrace();
		}
		try {
			class5.testCompleteDescriptor();
		}
		catch (java.lang.Exception err159) {
			err159.printStackTrace();
		}
		org.apache.maven.project.ProjectModelResolverTest class6 = new org.apache.maven.project.ProjectModelResolverTest();
		try {
			class6.testResolveParentThrowsUnresolvableModelExceptionWhenNotFound();
		}
		catch (java.lang.Exception err160) {
			err160.printStackTrace();
		}
		try {
			class6.testResolveParentThrowsUnresolvableModelExceptionWhenNoMatchingVersionFound();
		}
		catch (java.lang.Exception err161) {
			err161.printStackTrace();
		}
		try {
			class6.testResolveParentThrowsUnresolvableModelExceptionWhenUsingRangesWithoutUpperBound();
		}
		catch (java.lang.Exception err162) {
			err162.printStackTrace();
		}
		try {
			class6.testResolveParentSuccessfullyResolvesExistingParentWithoutRange();
		}
		catch (java.lang.Exception err163) {
			err163.printStackTrace();
		}
		try {
			class6.testResolveParentSuccessfullyResolvesExistingParentUsingHighestVersion();
		}
		catch (java.lang.Exception err164) {
			err164.printStackTrace();
		}
		try {
			class6.testResolveDependencyThrowsUnresolvableModelExceptionWhenNotFound();
		}
		catch (java.lang.Exception err165) {
			err165.printStackTrace();
		}
		try {
			class6.testResolveDependencyThrowsUnresolvableModelExceptionWhenNoMatchingVersionFound();
		}
		catch (java.lang.Exception err166) {
			err166.printStackTrace();
		}
		try {
			class6.testResolveDependencyThrowsUnresolvableModelExceptionWhenUsingRangesWithoutUpperBound();
		}
		catch (java.lang.Exception err167) {
			err167.printStackTrace();
		}
		try {
			class6.testResolveDependencySuccessfullyResolvesExistingDependencyWithoutRange();
		}
		catch (java.lang.Exception err168) {
			err168.printStackTrace();
		}
		try {
			class6.testResolveDependencySuccessfullyResolvesExistingDependencyUsingHighestVersion();
		}
		catch (java.lang.Exception err169) {
			err169.printStackTrace();
		}
		org.apache.maven.project.ProjectBuilderTest class7 = new org.apache.maven.project.ProjectBuilderTest();
		try {
			class7.testSystemScopeDependencyIsPresentInTheCompileClasspathElements();
		}
		catch (java.lang.Exception err170) {
			err170.printStackTrace();
		}
		try {
			class7.testBuildFromModelSource();
		}
		catch (java.lang.Exception err171) {
			err171.printStackTrace();
		}
		try {
			class7.testVersionlessManagedDependency();
		}
		catch (java.lang.Exception err172) {
			err172.printStackTrace();
		}
		try {
			class7.testResolveDependencies();
		}
		catch (java.lang.Exception err173) {
			err173.printStackTrace();
		}
		try {
			class7.testDontResolveDependencies();
		}
		catch (java.lang.Exception err174) {
			err174.printStackTrace();
		}
		try {
			class7.testReadModifiedPoms();
		}
		catch (java.lang.Exception err175) {
			err175.printStackTrace();
		}
		try {
			class7.testReadErroneousMavenProjectContainsReference();
		}
		catch (java.lang.Exception err176) {
			err176.printStackTrace();
		}
		try {
			class7.testReadInvalidPom();
		}
		catch (java.lang.Exception err177) {
			err177.printStackTrace();
		}
		try {
			class7.testReadParentAndChildWithRegularVersionSetParentFile();
		}
		catch (java.lang.Exception err178) {
			err178.printStackTrace();
		}
		try {
			class7.testBuildProperties();
		}
		catch (java.lang.Exception err179) {
			err179.printStackTrace();
		}
	}
}