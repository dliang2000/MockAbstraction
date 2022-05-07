package org.apache.maven.plugin;

public class Driver {
	public void runall() {
		org.apache.maven.plugin.PluginParameterExpressionEvaluatorTest class1 = new org.apache.maven.plugin.PluginParameterExpressionEvaluatorTest();
		try {
			class1.testPluginDescriptorExpressionReference();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testPluginArtifactsExpressionReference();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testPluginArtifactMapExpressionReference();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testPluginArtifactIdExpressionReference();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class1.testValueExtractionWithAPomValueContainingAPath();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class1.testEscapedVariablePassthrough();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class1.testEscapedVariablePassthroughInLargerExpression();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class1.testMultipleSubExpressionsInLargerExpression();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class1.testMissingPOMPropertyRefInLargerExpression();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class1.testPOMPropertyExtractionWithMissingProject_WithDotNotation();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class1.testBasedirExtractionWithMissingProject();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class1.testValueExtractionFromSystemPropertiesWithMissingProject();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class1.testValueExtractionFromSystemPropertiesWithMissingProject_WithDotNotation();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class1.testLocalRepositoryExtraction();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class1.testTwoExpressions();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class1.testShouldExtractPluginArtifacts();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		org.apache.maven.plugin.PluginManagerTest class2 = new org.apache.maven.plugin.PluginManagerTest();
		try {
			class2.testPluginLoading();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class2.testMojoDescriptorRetrieval();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class2.testRemoteResourcesPlugin();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class2.testSurefirePlugin();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class2.testMojoConfigurationIsMergedCorrectly();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class2.testMojoWhereInternallyStatedDependencyIsOverriddenByProject();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class2.testMojoThatIsPresentInTheCurrentBuild();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class2.testAggregatorMojo();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class2.testMojoThatRequiresExecutionToAGivenPhaseBeforeExecutingItself();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class2.testThatPluginDependencyThatHasSystemScopeIsResolved();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class2.testPluginRealmCache();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class2.testBuildExtensionsPluginLoading();
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