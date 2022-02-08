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
		io.bootique.value.DurationTest class2 = new io.bootique.value.DurationTest();
		class2.testParse_Millis();
		class2.testParse_Seconds();
		class2.testParse_Minutes();
		class2.testParse_Hours();
		class2.testParse_Days();
		class2.testParse_Fract();
		class2.testParse_Null();
		class2.testParse_FractMs();
		class2.testParse_Empty();
		class2.testParse_Invalid1();
		class2.testParse_Invalid2();
		class2.testCompareTo();
		class2.testEquals();
		class2.testHashCode();
		io.bootique.value.BytesTest class3 = new io.bootique.value.BytesTest();
		class3.testParse_byte();
		class3.testParse_KB();
		class3.testParse_MB();
		class3.testParse_GB();
		class3.testParse_Null();
		class3.testParse_Empty();
		class3.testParse_Invalid1();
		class3.testParse_Invalid2();
		class3.testCompareTo();
		class3.testEquals();
		class3.testHashCode();
		class3.testUnitConversion();
	}
}