package org.apache.commons.collections4.keyvalue;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.keyvalue.MultiKeyTest class1 = new org.apache.commons.collections4.keyvalue.MultiKeyTest();
		try {
			class1.testConstructors();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testConstructorsByArray();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testConstructorsByArrayNull();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class1.testSize();
		class1.testGetIndexed();
		class1.testGetKeysSimpleConstructor();
		class1.testGetKeysArrayConstructorCloned();
		class1.testGetKeysArrayConstructorNonCloned();
		class1.testHashCode();
		class1.testEquals();
		try {
			class1.testEqualsAfterSerialization();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err5) {
			err5.printStackTrace();
		}
		try {
			class1.testEqualsAfterSerializationOfDerivedClass();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err7) {
			err7.printStackTrace();
		}
		org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest class2 = new org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest();
		class2.testConstructors();
		class2.testAccessorsAndMutators();
		class2.testSelfReferenceHandling();
		class2.testUnmodifiable();
		org.apache.commons.collections4.keyvalue.DefaultKeyValueTest class3 = new org.apache.commons.collections4.keyvalue.DefaultKeyValueTest();
		class3.testAccessorsAndMutators();
		class3.testSelfReferenceHandling();
		class3.testConstructors();
		class3.testEqualsAndHashCode();
		class3.testToString();
		class3.testToMapEntry();
		org.apache.commons.collections4.keyvalue.DefaultMapEntryTest class4 = new org.apache.commons.collections4.keyvalue.DefaultMapEntryTest();
		class4.testConstructors();
		class4.testSelfReferenceHandling();
		org.apache.commons.collections4.keyvalue.TiedMapEntryTest class5 = new org.apache.commons.collections4.keyvalue.TiedMapEntryTest();
		class5.testConstructors();
		class5.testSetValue();
	}
}