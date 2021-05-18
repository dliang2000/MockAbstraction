package org.apache.maven.artifact.resolver.filter;

public class Driver {
	public void runall() {
		org.apache.maven.artifact.resolver.filter.ExclusionArtifactFilterTest class1 = new org.apache.maven.artifact.resolver.filter.ExclusionArtifactFilterTest();
		class1.setup();
		class1.testExcludeExact();
		class1.testExcludeNoMatch();
		class1.testExcludeGroupIdWildcard();
		class1.testExcludeGroupIdWildcardNoMatch();
		class1.testExcludeArtifactIdWildcard();
		class1.testExcludeArtifactIdWildcardNoMatch();
		class1.testExcludeAllWildcard();
		class1.testMultipleExclusionsExcludeArtifactIdWildcard();
		class1.testMultipleExclusionsExcludeGroupIdWildcard();
	}
}