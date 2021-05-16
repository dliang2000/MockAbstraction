package io.bootique.value;

public class Driver {
	public void runall() {
		io.bootique.value.DurationTest class1 = new io.bootique.value.DurationTest();
		class1.testParse_Millis();
		class1.testParse_Seconds();
		class1.testParse_Minutes();
		class1.testParse_Hours();
		class1.testParse_Days();
		class1.testParse_Fract();
		class1.testParse_Null();
		class1.testParse_FractMs();
		class1.testParse_Empty();
		class1.testParse_Invalid1();
		class1.testParse_Invalid2();
		class1.testCompareTo();
		class1.testEquals();
		class1.testHashCode();
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
		io.bootique.value.PercentTest class3 = new io.bootique.value.PercentTest();
		class3.testEquals();
		class3.testHashCode();
		class3.testCompareTo();
		class3.testParse_Null();
		class3.testParse_Empty();
		class3.testParse_NotANumber();
		class3.testParse();
		class3.testParse_Negative();
		class3.testParse_Zero();
		class3.testParse_Hundred();
		class3.testParse_Large();
		class3.testToString_Precision();
	}
}