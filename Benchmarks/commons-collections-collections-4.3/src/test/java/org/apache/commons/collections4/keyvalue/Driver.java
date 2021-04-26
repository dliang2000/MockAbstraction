package org.apache.commons.collections4.keyvalue;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.keyvalue.DefaultKeyValueTest class1 = new org.apache.commons.collections4.keyvalue.DefaultKeyValueTest();
		class1.testAccessorsAndMutators();
		class1.testSelfReferenceHandling();
		class1.testConstructors();
		class1.testEqualsAndHashCode();
		class1.testToString();
		class1.testToMapEntry();
		org.apache.commons.collections4.keyvalue.DefaultMapEntryTest class2 = new org.apache.commons.collections4.keyvalue.DefaultMapEntryTest();
		class2.testConstructors();
		class2.testSelfReferenceHandling();
		org.apache.commons.collections4.keyvalue.MultiKeyTest class3 = new org.apache.commons.collections4.keyvalue.MultiKeyTest();
		try {
			class3.testConstructors();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class3.testConstructorsByArray();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.testConstructorsByArrayNull();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class3.testSize();
		class3.testGetIndexed();
		class3.testGetKeysSimpleConstructor();
		class3.testGetKeysArrayConstructorCloned();
		class3.testGetKeysArrayConstructorNonCloned();
		class3.testHashCode();
		class3.testEquals();
		try {
			class3.testEqualsAfterSerialization();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err5) {
			err5.printStackTrace();
		}
		try {
			class3.testEqualsAfterSerializationOfDerivedClass();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err7) {
			err7.printStackTrace();
		}
		org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest class4 = new org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest();
		class4.testConstructors();
		class4.testAccessorsAndMutators();
		class4.testSelfReferenceHandling();
		class4.testUnmodifiable();
		org.apache.commons.collections4.keyvalue.TiedMapEntryTest class5 = new org.apache.commons.collections4.keyvalue.TiedMapEntryTest();
		class5.testConstructors();
		class5.testSetValue();
	}
}