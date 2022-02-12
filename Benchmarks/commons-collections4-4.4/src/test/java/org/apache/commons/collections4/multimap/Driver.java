package org.apache.commons.collections4.multimap;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.multimap.ArrayListValuedHashMapTest class1 = new org.apache.commons.collections4.multimap.ArrayListValuedHashMapTest(null);
		class1.testListValuedMapAdd();
		class1.testListValuedMapAddViaListIterator();
		class1.testListValuedMapRemove();
		class1.testListValuedMapRemoveViaListIterator();
		class1.testEqualsHashCodeContract();
		class1.testListValuedMapEqualsHashCodeContract();
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
		org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMapTest class4 = new org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMapTest(null);
		class4.testUnmodifiable();
		class4.testDecorateFactory();
		class4.testDecoratorFactoryNullMap();
		class4.testAddException();
		class4.testUnmodifiableEntries();
		class4.testUnmodifiableMapIterator();
		class4.testUnmodifiableKeySet();
		class4.testUnmodifiableValues();
		class4.testUnmodifiableAsMap();
		class4.testUnmodifiableKeys();
	}
}