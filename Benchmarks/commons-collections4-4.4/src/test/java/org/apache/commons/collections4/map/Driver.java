package org.apache.commons.collections4.map;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.map.CaseInsensitiveMapTest class1 = new org.apache.commons.collections4.map.CaseInsensitiveMapTest(null);
		class1.testCaseInsensitive();
		class1.testNullHandling();
		class1.testPutAll();
		class1.testClone();
		class1.testLocaleIndependence();
		class1.testInitialCapacityZero();
		org.apache.commons.collections4.map.LinkedMapTest class2 = new org.apache.commons.collections4.map.LinkedMapTest(null);
		class2.testReset();
		class2.testInsertionOrder();
		class2.testGetByIndex();
		class2.testGetValueByIndex();
		class2.testIndexOf();
		class2.testRemoveByIndex();
		class2.testClone();
		class2.testInitialCapacityZero();
		org.apache.commons.collections4.map.PassiveExpiringMapTest class3 = new org.apache.commons.collections4.map.PassiveExpiringMapTest(null);
		class3.testConstructors();
		class3.testContainsKey();
		class3.testContainsValue();
		class3.testDecoratedMap();
		class3.testEntrySet();
		class3.testExpiration();
		class3.testGet();
		class3.testIsEmpty();
		class3.testKeySet();
		class3.testPut();
		class3.testSize();
		class3.testValues();
		class3.testZeroTimeToLive();
		org.apache.commons.collections4.map.PredicatedMapTest class4 = new org.apache.commons.collections4.map.PredicatedMapTest(null);
		class4.testEntrySet();
		class4.testPut();
		org.apache.commons.collections4.map.HashedMapTest class5 = new org.apache.commons.collections4.map.HashedMapTest(null);
		class5.testClone();
		class5.testInternalState();
		class5.testInitialCapacityZero();
		org.apache.commons.collections4.map.ReferenceMapTest class6 = new org.apache.commons.collections4.map.ReferenceMapTest(null);
		class6.testNullHandling();
		try {
			class6.testPurgeValues();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class6.testCustomPurge();
		try {
			class6.testDataSizeAfterSerialization();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.map.TransformedMapTest class7 = new org.apache.commons.collections4.map.TransformedMapTest(null);
		class7.testTransformedMap();
		class7.testFactory_Decorate();
		class7.testFactory_decorateTransform();
		org.apache.commons.collections4.map.StaticBucketMapTest class8 = new org.apache.commons.collections4.map.StaticBucketMapTest(null);
		class8.test_get_nullMatchesIncorrectly();
		class8.test_containsKey_nullMatchesIncorrectly();
		class8.test_containsValue_nullMatchesIncorrectly();
		org.apache.commons.collections4.map.MultiKeyMapTest class9 = new org.apache.commons.collections4.map.MultiKeyMapTest(null);
		class9.testNullHandling();
		class9.testMultiKeyGet();
		class9.testMultiKeyContainsKey();
		class9.testMultiKeyPut();
		class9.testMultiKeyPutWithNullKey();
		class9.testMultiKeyRemove();
		class9.testMultiKeyRemoveAll1();
		class9.testMultiKeyRemoveAll2();
		class9.testMultiKeyRemoveAll3();
		class9.testMultiKeyRemoveAll4();
		class9.testClone();
		class9.testLRUMultiKeyMap();
		org.apache.commons.collections4.map.LazyMapTest class10 = new org.apache.commons.collections4.map.LazyMapTest(null);
		class10.testMapGet();
		class10.mapGetWithFactory();
		class10.mapGetWithTransformer();
		org.apache.commons.collections4.map.Flat3MapTest class11 = new org.apache.commons.collections4.map.Flat3MapTest(null);
		class11.testEquals1();
		class11.testEquals2();
		class11.testClone2();
		class11.testClone4();
		try {
			class11.testSerialisation0();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class11.testSerialisation2();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class11.testSerialisation4();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class11.testEntryIteratorSetValue1();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class11.testEntryIteratorSetValue2();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class11.testEntryIteratorSetValue3();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class11.testMapIteratorSetValue1();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class11.testMapIteratorSetValue2();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class11.testMapIteratorSetValue3();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		class11.testCollections261();
		class11.testToString();
		class11.testRemove1();
		class11.testRemove2();
		class11.testRemove3();
		class11.testRemove4();
		class11.testRemove5();
		class11.testRemove6();
		class11.testRemove7();
		class11.testRemove8();
		class11.testRemove9();
		class11.testRemove10();
		class11.testRemove11();
		class11.testRemove12();
		class11.testRemove13();
		class11.testNewInstance1();
		class11.testGet1();
		class11.testGet2();
		class11.testGet3();
		class11.testContainsKey1();
		class11.testContainsKey2();
		class11.testContainsKey3();
		class11.testContainsValue1();
		class11.testContainsValue2();
		class11.testContainsValue3();
		class11.testPut1();
		class11.testPut2();
		class11.testPut3();
		class11.testPut4();
		class11.testPut5();
		class11.testPut6();
		org.apache.commons.collections4.map.TransformedSortedMapTest class12 = new org.apache.commons.collections4.map.TransformedSortedMapTest(null);
		class12.testTransformedMap();
		class12.testFactory_Decorate();
		class12.testFactory_decorateTransform();
		org.apache.commons.collections4.map.UnmodifiableMapTest class13 = new org.apache.commons.collections4.map.UnmodifiableMapTest(null);
		class13.testUnmodifiable();
		class13.testDecorateFactory();
		org.apache.commons.collections4.map.ListOrderedMapTest class14 = new org.apache.commons.collections4.map.ListOrderedMapTest(null);
		class14.testGetByIndex();
		class14.testGetValueByIndex();
		class14.testIndexOf();
		class14.testSetValueByIndex();
		class14.testRemoveByIndex();
		class14.testPut_intObjectObject();
		class14.testPutAllWithIndex();
		class14.testPutAllWithIndexBug441();
		class14.testValueList_getByIndex();
		class14.testValueList_setByIndex();
		class14.testValueList_removeByIndex();
		class14.testCOLLECTIONS_474_nullValues();
		class14.testCOLLECTIONS_474_nonNullValues();
		org.apache.commons.collections4.map.CompositeMapTest class15 = new org.apache.commons.collections4.map.CompositeMapTest(null);
		class15.testGet();
		class15.testAddComposited();
		class15.testRemoveComposited();
		class15.testRemoveFromUnderlying();
		class15.testRemoveFromComposited();
		class15.testResolveCollision();
		class15.testPut();
		class15.testPutAll();
		org.apache.commons.collections4.map.SingletonMapTest class16 = new org.apache.commons.collections4.map.SingletonMapTest(null);
		class16.testClone();
		class16.testKeyValue();
		class16.testBoundedMap();
		org.apache.commons.collections4.map.PredicatedSortedMapTest class17 = new org.apache.commons.collections4.map.PredicatedSortedMapTest(null);
		class17.testEntrySet();
		class17.testPut();
		class17.testSortOrder();
		org.apache.commons.collections4.map.LRUMapTest class18 = new org.apache.commons.collections4.map.LRUMapTest(null);
		class18.testCtors();
		class18.testLRU();
		class18.testReset();
		class18.testAccessOrder();
		class18.testAccessOrder2();
		class18.testClone();
		class18.testRemoveLRU();
		class18.testRemoveLRUBlocksRemove();
		class18.testRemoveLRUBlocksRemoveScan();
		class18.testRemoveLRUFirstBlocksRemove();
		class18.testInternalState_Buckets();
		class18.testInternalState_getEntry_int();
		try {
			class18.testSynchronizedRemoveFromMapIterator();
		}
		catch (java.lang.InterruptedException err13) {
			err13.printStackTrace();
		}
		try {
			class18.testSynchronizedRemoveFromEntrySet();
		}
		catch (java.lang.InterruptedException err14) {
			err14.printStackTrace();
		}
		try {
			class18.testSynchronizedRemoveFromKeySet();
		}
		catch (java.lang.InterruptedException err15) {
			err15.printStackTrace();
		}
		try {
			class18.testSynchronizedRemoveFromValues();
		}
		catch (java.lang.InterruptedException err16) {
			err16.printStackTrace();
		}
		org.apache.commons.collections4.map.MultiValueMapTest class19 = new org.apache.commons.collections4.map.MultiValueMapTest(null);
		class19.testNoMappingReturnsNull();
		class19.testValueCollectionType();
		class19.testMultipleValues();
		class19.testContainsValue();
		class19.testKeyContainsValue();
		class19.testValues();
		class19.testKeyedIterator();
		class19.testRemoveAllViaIterator();
		class19.testRemoveAllViaKeyedIterator();
		class19.testIterator();
		class19.testRemoveAllViaEntryIterator();
		class19.testTotalSizeA();
		class19.testMapEquals();
		class19.testGetCollection();
		class19.testTotalSize();
		class19.testSize();
		class19.testSize_Key();
		class19.testIterator_Key();
		class19.testContainsValue_Key();
		class19.testPutWithList();
		class19.testPutWithSet();
		class19.testPutAll_Map1();
		class19.testPutAll_Map2();
		class19.testPutAll_KeyCollection();
		class19.testRemove_KeyItem();
		try {
			class19.testUnsafeDeSerialization();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class19.testEmptyMapCompatibility();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class19.testFullMapCompatibility();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		org.apache.commons.collections4.map.LazySortedMapTest class20 = new org.apache.commons.collections4.map.LazySortedMapTest(null);
		class20.testMapGet();
		class20.mapGet();
		class20.testSortOrder();
		class20.testTransformerDecorate();
		org.apache.commons.collections4.map.ReferenceIdentityMapTest class21 = new org.apache.commons.collections4.map.ReferenceIdentityMapTest(null);
		class21.testBasics();
		class21.testHashEntry();
		class21.testNullHandling();
		try {
			class21.testPurgeValues();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		org.apache.commons.collections4.map.UnmodifiableSortedMapTest class22 = new org.apache.commons.collections4.map.UnmodifiableSortedMapTest(null);
		class22.testUnmodifiable();
		class22.testDecorateFactory();
		org.apache.commons.collections4.map.DefaultedMapTest class23 = new org.apache.commons.collections4.map.DefaultedMapTest(null);
		class23.testMapGet();
		class23.testMapGet2();
		class23.testMapGet3();
		class23.testMapGet4();
		org.apache.commons.collections4.map.UnmodifiableOrderedMapTest class24 = new org.apache.commons.collections4.map.UnmodifiableOrderedMapTest(null);
		class24.testUnmodifiable();
		class24.testDecorateFactory();
		org.apache.commons.collections4.map.ListOrderedMap2Test class25 = new org.apache.commons.collections4.map.ListOrderedMap2Test(null);
		class25.testGetByIndex();
		class25.testGetValueByIndex();
		class25.testIndexOf();
		class25.testRemoveByIndex();
	}
}