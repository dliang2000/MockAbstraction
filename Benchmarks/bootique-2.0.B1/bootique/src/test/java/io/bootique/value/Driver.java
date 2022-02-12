package io.bootique.value;

public class Driver {
	public void runall() {
		io.bootique.value.BytesTest class1 = new io.bootique.value.BytesTest();
		class1.testParse_byte();
		class1.testParse_KB();
		class1.testParse_MB();
		class1.testParse_GB();
		class1.testParse_Null();
		class1.testParse_Empty();
		class1.testParse_Invalid1();
		class1.testParse_Invalid2();
		class1.testCompareTo();
		class1.testEquals();
		class1.testHashCode();
		class1.testUnitConversion();
		io.bootique.value.PercentTest class2 = new io.bootique.value.PercentTest();
		class2.testEquals();
		class2.testHashCode();
		class2.testCompareTo();
		class2.testParse_Null();
		class2.testParse_Empty();
		class2.testParse_NotANumber();
		class2.testParse();
		class2.testParse_Negative();
		class2.testParse_Zero();
		class2.testParse_Hundred();
		class2.testParse_Large();
		class2.testToString_Precision();
		io.bootique.value.DurationTest class3 = new io.bootique.value.DurationTest();
		class3.testParse_Millis();
		class3.testParse_Seconds();
		class3.testParse_Minutes();
		class3.testParse_Hours();
		class3.testParse_Days();
		class3.testParse_Fract();
		class3.testParse_Null();
		class3.testParse_FractMs();
		class3.testParse_Empty();
		class3.testParse_Invalid1();
		class3.testParse_Invalid2();
		class3.testCompareTo();
		class3.testEquals();
		class3.testHashCode();
	}
}