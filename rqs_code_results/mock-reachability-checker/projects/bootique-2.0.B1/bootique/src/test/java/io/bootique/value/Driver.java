package io.bootique.value;

public class Driver {
	public void runall() {
		io.bootique.value.PercentTest class1 = new io.bootique.value.PercentTest();
		class1.testEquals();
		class1.testHashCode();
		class1.testCompareTo();
		class1.testParse_Null();
		class1.testParse_Empty();
		class1.testParse_NotANumber();
		class1.testParse();
		class1.testParse_Negative();
		class1.testParse_Zero();
		class1.testParse_Hundred();
		class1.testParse_Large();
		class1.testToString_Precision();
		io.bootique.value.BytesTest class2 = new io.bootique.value.BytesTest();
		class2.testParse_byte();
		class2.testParse_KB();
		class2.testParse_MB();
		class2.testParse_GB();
		class2.testParse_Null();
		class2.testParse_Empty();
		class2.testParse_Invalid1();
		class2.testParse_Invalid2();
		class2.testCompareTo();
		class2.testEquals();
		class2.testHashCode();
		class2.testUnitConversion();
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