package io.bootique.config.jackson.merger;

public class Driver {
	public void runall() {
		io.bootique.config.jackson.merger.InPlaceLeftHandMergerTest class1 = new io.bootique.config.jackson.merger.InPlaceLeftHandMergerTest();
		class1.testApply_MergeMap();
		class1.testApply_MergeList_Replace();
		class1.testApply_OverrideValues();
		class1.testApply_OverrideValues_Null();
		class1.testApply_MergeSubMap();
		class1.testApply_MergeSubList_Replace();
		class1.testApply_MultiMerge();
		io.bootique.config.jackson.merger.InPlacePropertiesMergerTest class2 = new io.bootique.config.jackson.merger.InPlacePropertiesMergerTest();
		class2.testApply_InPlace();
		class2.testApply();
		class2.testApply_Nested();
		class2.testApply_MissingRecreated();
		class2.testApply_ObjectArray();
		class2.testApply_ObjectArray_PastEnd();
	}
}