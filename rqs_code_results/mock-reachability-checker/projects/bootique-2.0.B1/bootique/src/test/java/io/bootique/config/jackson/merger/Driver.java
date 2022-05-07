package io.bootique.config.jackson.merger;

public class Driver {
	public void runall() {
		io.bootique.config.jackson.merger.InPlacePropertiesMergerTest class1 = new io.bootique.config.jackson.merger.InPlacePropertiesMergerTest();
		class1.testApply_InPlace();
		class1.testApply();
		class1.testApply_Nested();
		class1.testApply_MissingRecreated();
		class1.testApply_ObjectArray();
		class1.testApply_ObjectArray_PastEnd();
		io.bootique.config.jackson.merger.InPlaceLeftHandMergerTest class2 = new io.bootique.config.jackson.merger.InPlaceLeftHandMergerTest();
		class2.testApply_MergeMap();
		class2.testApply_MergeList_Replace();
		class2.testApply_OverrideValues();
		class2.testApply_OverrideValues_Null();
		class2.testApply_MergeSubMap();
		class2.testApply_MergeSubList_Replace();
		class2.testApply_MultiMerge();
	}
}