package io.bootique.config.jackson.path;

public class Driver {
	public void runall() {
		io.bootique.config.jackson.path.PathSegmentTest class1 = new io.bootique.config.jackson.path.PathSegmentTest();
		class1.testLastPathComponent_Value();
		class1.testLastPathComponent_Value_PastEnd();
		class1.testLastPathComponent_Root();
		class1.testLastPathComponent_Object_NullValue();
		class1.testLastPathComponent_Object();
		class1.testLastPathComponent_ObjectNested();
		class1.testLastPathComponent_ArrayOutOfBounds();
		class1.testLastPathComponent_Array_NonNumericIndex();
		class1.testLastPathComponent_Array_MissingClosingParen1();
		class1.testLastPathComponent_Array_MissingClosingParen2();
		class1.testLastPathComponent_Array_Nested_PropertyMissingDot();
		class1.testLastPathComponent_ArrayRootValue();
		class1.testLastPathComponent_ArrayValue();
		class1.testLastPathComponent_Array_PastEnd();
		class1.testLastPathComponent_Array_PastEnd_Symbolic();
		class1.testLastPathComponent_ArrayObject();
	}
}