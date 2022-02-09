package org.apache.commons.collections4.multimap;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMapTest class1 = new org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMapTest(null);
		class1.testUnmodifiable();
		class1.testDecorateFactory();
		class1.testDecoratorFactoryNullMap();
		class1.testAddException();
		class1.testUnmodifiableEntries();
		class1.testUnmodifiableMapIterator();
		class1.testUnmodifiableKeySet();
		class1.testUnmodifiableValues();
		class1.testUnmodifiableAsMap();
		class1.testUnmodifiableKeys();
		org.apache.commons.collections4.multimap.TransformedMultiValuedMapTest class2 = new org.apache.commons.collections4.multimap.TransformedMultiValuedMapTest(null);
		class2.testKeyTransformedMap();
		class2.testValueTransformedMap();
		class2.testFactory_Decorate();
		class2.testFactory_decorateTransform();
		org.apache.commons.collections4.multimap.HashSetValuedHashMapTest class3 = new org.apache.commons.collections4.multimap.HashSetValuedHashMapTest(null);
		class3.testSetValuedMapAdd();
		class3.testSetValuedMapRemove();
		class3.testSetValuedMapRemoveViaIterator();
		class3.testSetValuedMapEqualsHashCodeContract();
		org.apache.commons.collections4.multimap.ArrayListValuedHashMapTest class4 = new org.apache.commons.collections4.multimap.ArrayListValuedHashMapTest(null);
		class4.testListValuedMapAdd();
		class4.testListValuedMapAddViaListIterator();
		class4.testListValuedMapRemove();
		class4.testListValuedMapRemoveViaListIterator();
		class4.testEqualsHashCodeContract();
		class4.testListValuedMapEqualsHashCodeContract();
	}
}