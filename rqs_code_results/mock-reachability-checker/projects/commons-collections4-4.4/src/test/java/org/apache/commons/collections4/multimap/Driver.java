package org.apache.commons.collections4.multimap;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.multimap.TransformedMultiValuedMapTest class1 = new org.apache.commons.collections4.multimap.TransformedMultiValuedMapTest(null);
		class1.testKeyTransformedMap();
		class1.testValueTransformedMap();
		class1.testFactory_Decorate();
		class1.testFactory_decorateTransform();
		org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMapTest class2 = new org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMapTest(null);
		class2.testUnmodifiable();
		class2.testDecorateFactory();
		class2.testDecoratorFactoryNullMap();
		class2.testAddException();
		class2.testUnmodifiableEntries();
		class2.testUnmodifiableMapIterator();
		class2.testUnmodifiableKeySet();
		class2.testUnmodifiableValues();
		class2.testUnmodifiableAsMap();
		class2.testUnmodifiableKeys();
		org.apache.commons.collections4.multimap.ArrayListValuedHashMapTest class3 = new org.apache.commons.collections4.multimap.ArrayListValuedHashMapTest(null);
		class3.testListValuedMapAdd();
		class3.testListValuedMapAddViaListIterator();
		class3.testListValuedMapRemove();
		class3.testListValuedMapRemoveViaListIterator();
		class3.testEqualsHashCodeContract();
		class3.testListValuedMapEqualsHashCodeContract();
		org.apache.commons.collections4.multimap.HashSetValuedHashMapTest class4 = new org.apache.commons.collections4.multimap.HashSetValuedHashMapTest(null);
		class4.testSetValuedMapAdd();
		class4.testSetValuedMapRemove();
		class4.testSetValuedMapRemoveViaIterator();
		class4.testSetValuedMapEqualsHashCodeContract();
	}
}