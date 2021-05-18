package org.apache.maven.project.artifact;

public class Driver {
	public void runall() {
		org.apache.maven.project.artifact.DefaultProjectArtifactsCacheTest class1 = new org.apache.maven.project.artifact.DefaultProjectArtifactsCacheTest();
		try {
			class1.testProjectDependencyOrder();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.maven.project.artifact.DefaultMavenMetadataCacheTest class2 = new org.apache.maven.project.artifact.DefaultMavenMetadataCacheTest();
		try {
			class2.testCacheKey();
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