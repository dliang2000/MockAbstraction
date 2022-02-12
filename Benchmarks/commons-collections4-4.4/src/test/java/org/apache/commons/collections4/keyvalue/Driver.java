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
		org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest class2 = new org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest();
		class2.testConstructors();
		class2.testAccessorsAndMutators();
		class2.testSelfReferenceHandling();
		class2.testUnmodifiable();
		org.apache.commons.collections4.keyvalue.DefaultMapEntryTest class3 = new org.apache.commons.collections4.keyvalue.DefaultMapEntryTest();
		class3.testConstructors();
		class3.testSelfReferenceHandling();
		org.apache.commons.collections4.keyvalue.TiedMapEntryTest class4 = new org.apache.commons.collections4.keyvalue.TiedMapEntryTest();
		class4.testConstructors();
		class4.testSetValue();
		org.apache.commons.collections4.keyvalue.MultiKeyTest class5 = new org.apache.commons.collections4.keyvalue.MultiKeyTest();
		try {
			class5.testConstructors();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class5.testConstructorsByArray();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class5.testConstructorsByArrayNull();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class5.testSize();
		class5.testGetIndexed();
		class5.testGetKeysSimpleConstructor();
		class5.testGetKeysArrayConstructorCloned();
		class5.testGetKeysArrayConstructorNonCloned();
		class5.testHashCode();
		class5.testEquals();
		try {
			class5.testEqualsAfterSerialization();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err5) {
			err5.printStackTrace();
		}
		try {
			class5.testEqualsAfterSerializationOfDerivedClass();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err7) {
			err7.printStackTrace();
		}
	}
}