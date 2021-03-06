package org.apache.commons.collections4.set;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.set.TransformedSetTest class1 = new org.apache.commons.collections4.set.TransformedSetTest(null);
		class1.testTransformedSet();
		class1.testTransformedSet_decorateTransform();
		org.apache.commons.collections4.set.UnmodifiableSetTest class2 = new org.apache.commons.collections4.set.UnmodifiableSetTest(null);
		class2.testUnmodifiable();
		class2.testDecorateFactory();
		org.apache.commons.collections4.set.UnmodifiableSortedSetTest class3 = new org.apache.commons.collections4.set.UnmodifiableSortedSetTest(null);
		class3.testUnmodifiable();
		class3.testDecorateFactory();
		class3.testComparator();
		org.apache.commons.collections4.set.PredicatedSortedSetTest class4 = new org.apache.commons.collections4.set.PredicatedSortedSetTest(null);
		class4.testGetSet();
		class4.testIllegalAdd();
		class4.testIllegalAddAll();
		class4.testComparator();
		org.apache.commons.collections4.set.MapBackedSet2Test class5 = new org.apache.commons.collections4.set.MapBackedSet2Test(null);
		class5.testOrdering();
		class5.testCanonicalEmptyCollectionExists();
		class5.testCanonicalFullCollectionExists();
		org.apache.commons.collections4.set.CompositeSetTest class6 = new org.apache.commons.collections4.set.CompositeSetTest(null);
		class6.testContains();
		class6.testContainsAll();
		class6.testRemoveAll();
		class6.testRemoveUnderlying();
		class6.testRemoveComposited();
		class6.testFailedCollisionResolution();
		class6.testAddComposited();
		class6.testAddCompositedCollision();
		org.apache.commons.collections4.set.TransformedSortedSetTest class7 = new org.apache.commons.collections4.set.TransformedSortedSetTest(null);
		class7.testTransformedSet();
		class7.testTransformedSet_decorateTransform();
		org.apache.commons.collections4.set.PredicatedNavigableSetTest class8 = new org.apache.commons.collections4.set.PredicatedNavigableSetTest(null);
		class8.testGetSet();
		class8.testIllegalAdd();
		class8.testIllegalAddAll();
		class8.testComparator();
		org.apache.commons.collections4.set.UnmodifiableNavigableSetTest class9 = new org.apache.commons.collections4.set.UnmodifiableNavigableSetTest(null);
		class9.testUnmodifiable();
		class9.testDecorateFactory();
		class9.testComparator();
		org.apache.commons.collections4.set.ListOrderedSet2Test class10 = new org.apache.commons.collections4.set.ListOrderedSet2Test(null);
		class10.testOrdering();
		class10.testListAddRemove();
		class10.testListAddIndexed();
		org.apache.commons.collections4.set.ListOrderedSetTest class11 = new org.apache.commons.collections4.set.ListOrderedSetTest(null);
		class11.testOrdering();
		class11.testListAddRemove();
		class11.testListAddIndexed();
		class11.testListAddReplacing();
		class11.testRetainAll();
		class11.testDuplicates();
		class11.testDecorator();
		org.apache.commons.collections4.set.PredicatedSetTest class12 = new org.apache.commons.collections4.set.PredicatedSetTest(null);
		class12.testGetSet();
		class12.testIllegalAdd();
		class12.testIllegalAddAll();
		org.apache.commons.collections4.set.TransformedNavigableSetTest class13 = new org.apache.commons.collections4.set.TransformedNavigableSetTest(null);
		class13.testTransformedSet();
		class13.testTransformedSet_decorateTransform();
	}
}