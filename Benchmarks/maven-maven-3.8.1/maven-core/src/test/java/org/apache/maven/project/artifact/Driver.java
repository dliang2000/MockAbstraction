package org.apache.maven.project.artifact;

public class Driver {
	public void runall() {
		org.apache.maven.project.artifact.DefaultMavenMetadataCacheTest class1 = new org.apache.maven.project.artifact.DefaultMavenMetadataCacheTest();
		try {
			class1.testCacheKey();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.maven.project.artifact.DefaultProjectArtifactsCacheTest class2 = new org.apache.maven.project.artifact.DefaultProjectArtifactsCacheTest();
		try {
			class2.testProjectDependencyOrder();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		org.apache.maven.project.artifact.MavenMetadataSourceTest class3 = new org.apache.maven.project.artifact.MavenMetadataSourceTest();
		try {
			class3.testShouldNotCarryExclusionsOverFromDependencyToDependency();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
	}
}