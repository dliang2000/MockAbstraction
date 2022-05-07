package org.apache.maven.graph;

public class Driver {
	public void runall() {
		org.apache.maven.graph.DefaultProjectDependencyGraphTest class1 = new org.apache.maven.graph.DefaultProjectDependencyGraphTest();
		try {
			class1.testGetSortedProjects();
		}
		catch (org.apache.maven.project.DuplicateProjectException err1) {
			err1.printStackTrace();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err2) {
			err2.printStackTrace();
		}
		try {
			class1.testVerifyExpectedParentStructure();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err3) {
			err3.printStackTrace();
		}
		catch (org.apache.maven.project.DuplicateProjectException err4) {
			err4.printStackTrace();
		}
		try {
			class1.testVerifyThatDownstreamProjectsComeInSortedOrder();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err5) {
			err5.printStackTrace();
		}
		catch (org.apache.maven.project.DuplicateProjectException err6) {
			err6.printStackTrace();
		}
		try {
			class1.testTransitivesInOrder();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err7) {
			err7.printStackTrace();
		}
		catch (org.apache.maven.project.DuplicateProjectException err8) {
			err8.printStackTrace();
		}
		try {
			class1.testNonTransitivesInOrder();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err9) {
			err9.printStackTrace();
		}
		catch (org.apache.maven.project.DuplicateProjectException err10) {
			err10.printStackTrace();
		}
		try {
			class1.testWithTransitiveOnly();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err11) {
			err11.printStackTrace();
		}
		catch (org.apache.maven.project.DuplicateProjectException err12) {
			err12.printStackTrace();
		}
		try {
			class1.testWithMissingTransitiveOnly();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err13) {
			err13.printStackTrace();
		}
		catch (org.apache.maven.project.DuplicateProjectException err14) {
			err14.printStackTrace();
		}
		try {
			class1.testGetUpstreamProjects();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err15) {
			err15.printStackTrace();
		}
		catch (org.apache.maven.project.DuplicateProjectException err16) {
			err16.printStackTrace();
		}
	}
}