package org.apache.maven.plugin;

public class Driver {
	public void runall() {
		org.apache.maven.plugin.PluginManagerTest class1 = new org.apache.maven.plugin.PluginManagerTest();
		try {
			class1.testPluginLoading();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testMojoDescriptorRetrieval();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testRemoteResourcesPlugin();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testSurefirePlugin();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testMojoConfigurationIsMergedCorrectly();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testMojoWhereInternallyStatedDependencyIsOverriddenByProject();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testMojoThatIsPresentInTheCurrentBuild();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testAggregatorMojo();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.testMojoThatRequiresExecutionToAGivenPhaseBeforeExecutingItself();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.testThatPluginDependencyThatHasSystemScopeIsResolved();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.testPluginRealmCache();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class1.testBuildExtensionsPluginLoading();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		org.apache.maven.plugin.PluginParameterExpressionEvaluatorTest class2 = new org.apache.maven.plugin.PluginParameterExpressionEvaluatorTest();
		try {
			class2.testPluginDescriptorExpressionReference();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class2.testPluginArtifactsExpressionReference();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class2.testPluginArtifactMapExpressionReference();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class2.testPluginArtifactIdExpressionReference();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class2.testValueExtractionWithAPomValueContainingAPath();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class2.testEscapedVariablePassthrough();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class2.testEscapedVariablePassthroughInLargerExpression();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class2.testMultipleSubExpressionsInLargerExpression();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class2.testMissingPOMPropertyRefInLargerExpression();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class2.testPOMPropertyExtractionWithMissingProject_WithDotNotation();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class2.testBasedirExtractionWithMissingProject();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class2.testValueExtractionFromSystemPropertiesWithMissingProject();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class2.testValueExtractionFromSystemPropertiesWithMissingProject_WithDotNotation();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class2.testLocalRepositoryExtraction();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class2.testTwoExpressions();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class2.testShouldExtractPluginArtifacts();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		org.apache.maven.plugin.PluginParameterExceptionTest class3 = new org.apache.maven.plugin.PluginParameterExceptionTest();
		class3.testMissingRequiredStringArrayTypeParameter();
		class3.testMissingRequiredCollectionTypeParameter();
		class3.testMissingRequiredMapTypeParameter();
		class3.testMissingRequiredPropertiesTypeParameter();
	}
}