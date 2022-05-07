package org.apache.commons.collections4.map;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.map.LazySortedMapTest class1 = new org.apache.commons.collections4.map.LazySortedMapTest(null);
		class1.testMapGet();
		class1.mapGet();
		class1.testSortOrder();
		class1.testTransformerDecorate();
		org.apache.commons.collections4.map.PassiveExpiringMapTest class2 = new org.apache.commons.collections4.map.PassiveExpiringMapTest(null);
		class2.testConstructors();
		class2.testContainsKey();
		class2.testContainsValue();
		class2.testDecoratedMap();
		class2.testEntrySet();
		class2.testExpiration();
		class2.testGet();
		class2.testIsEmpty();
		class2.testKeySet();
		class2.testPut();
		class2.testSize();
		class2.testValues();
		class2.testZeroTimeToLive();
		org.apache.commons.collections4.map.ReferenceMapTest class3 = new org.apache.commons.collections4.map.ReferenceMapTest(null);
		class3.testNullHandling();
		try {
			class3.testPurgeValues();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class3.testCustomPurge();
		try {
			class3.testDataSizeAfterSerialization();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.map.MultiValueMapTest class4 = new org.apache.commons.collections4.map.MultiValueMapTest(null);
		class4.testNoMappingReturnsNull();
		class4.testValueCollectionType();
		class4.testMultipleValues();
		class4.testContainsValue();
		class4.testKeyContainsValue();
		class4.testValues();
		class4.testKeyedIterator();
		class4.testRemoveAllViaIterator();
		class4.testRemoveAllViaKeyedIterator();
		class4.testIterator();
		class4.testRemoveAllViaEntryIterator();
		class4.testTotalSizeA();
		class4.testMapEquals();
		class4.testGetCollection();
		class4.testTotalSize();
		class4.testSize();
		class4.testSize_Key();
		class4.testIterator_Key();
		class4.testContainsValue_Key();
		class4.testPutWithList();
		class4.testPutWithSet();
		class4.testPutAll_Map1();
		class4.testPutAll_Map2();
		class4.testPutAll_KeyCollection();
		class4.testRemove_KeyItem();
		try {
			class4.testUnsafeDeSerialization();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class4.testEmptyMapCompatibility();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class4.testFullMapCompatibility();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.apache.commons.collections4.map.PredicatedMapTest class5 = new org.apache.commons.collections4.map.PredicatedMapTest(null);
		class5.testEntrySet();
		class5.testPut();
		org.apache.commons.collections4.map.DefaultedMapTest class6 = new org.apache.commons.collections4.map.DefaultedMapTest(null);
		class6.testMapGet();
		class6.testMapGet2();
		class6.testMapGet3();
		class6.testMapGet4();
		org.apache.commons.collections4.map.LazyMapTest class7 = new org.apache.commons.collections4.map.LazyMapTest(null);
		class7.testMapGet();
		class7.mapGetWithFactory();
		class7.mapGetWithTransformer();
		org.apache.commons.collections4.map.TransformedMapTest class8 = new org.apache.commons.collections4.map.TransformedMapTest(null);
		class8.testTransformedMap();
		class8.testFactory_Decorate();
		class8.testFactory_decorateTransform();
		org.apache.commons.collections4.map.LinkedMapTest class9 = new org.apache.commons.collections4.map.LinkedMapTest(null);
		class9.testReset();
		class9.testInsertionOrder();
		class9.testGetByIndex();
		class9.testGetValueByIndex();
		class9.testIndexOf();
		class9.testRemoveByIndex();
		class9.testClone();
		class9.testInitialCapacityZero();
		org.apache.commons.collections4.map.CompositeMapTest class10 = new org.apache.commons.collections4.map.CompositeMapTest(null);
		class10.testGet();
		class10.testAddComposited();
		class10.testRemoveComposited();
		class10.testRemoveFromUnderlying();
		class10.testRemoveFromComposited();
		class10.testResolveCollision();
		class10.testPut();
		class10.testPutAll();
		org.apache.commons.collections4.map.SingletonMapTest class11 = new org.apache.commons.collections4.map.SingletonMapTest(null);
		class11.testClone();
		class11.testKeyValue();
		class11.testBoundedMap();
		org.apache.commons.collections4.map.ReferenceIdentityMapTest class12 = new org.apache.commons.collections4.map.ReferenceIdentityMapTest(null);
		class12.testBasics();
		class12.testHashEntry();
		class12.testNullHandling();
		try {
			class12.testPurgeValues();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		org.apache.commons.collections4.map.ListOrderedMap2Test class13 = new org.apache.commons.collections4.map.ListOrderedMap2Test(null);
		class13.testGetByIndex();
		class13.testGetValueByIndex();
		class13.testIndexOf();
		class13.testRemoveByIndex();
		org.apache.commons.collections4.map.LRUMapTest class14 = new org.apache.commons.collections4.map.LRUMapTest(null);
		class14.testCtors();
		class14.testLRU();
		class14.testReset();
		class14.testAccessOrder();
		class14.testAccessOrder2();
		class14.testClone();
		class14.testRemoveLRU();
		class14.testRemoveLRUBlocksRemove();
		class14.testRemoveLRUBlocksRemoveScan();
		class14.testRemoveLRUFirstBlocksRemove();
		class14.testInternalState_Buckets();
		class14.testInternalState_getEntry_int();
		try {
			class14.testSynchronizedRemoveFromMapIterator();
		}
		catch (java.lang.InterruptedException err8) {
			err8.printStackTrace();
		}
		try {
			class14.testSynchronizedRemoveFromEntrySet();
		}
		catch (java.lang.InterruptedException err9) {
			err9.printStackTrace();
		}
		try {
			class14.testSynchronizedRemoveFromKeySet();
		}
		catch (java.lang.InterruptedException err10) {
			err10.printStackTrace();
		}
		try {
			class14.testSynchronizedRemoveFromValues();
		}
		catch (java.lang.InterruptedException err11) {
			err11.printStackTrace();
		}
		org.apache.commons.collections4.map.Flat3MapTest class15 = new org.apache.commons.collections4.map.Flat3MapTest(null);
		class15.testEquals1();
		class15.testEquals2();
		class15.testClone2();
		class15.testClone4();
		try {
			class15.testSerialisation0();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class15.testSerialisation2();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class15.testSerialisation4();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class15.testEntryIteratorSetValue1();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class15.testEntryIteratorSetValue2();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class15.testEntryIteratorSetValue3();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class15.testMapIteratorSetValue1();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class15.testMapIteratorSetValue2();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class15.testMapIteratorSetValue3();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		class15.testCollections261();
		class15.testToString();
		class15.testRemove1();
		class15.testRemove2();
		class15.testRemove3();
		class15.testRemove4();
		class15.testRemove5();
		class15.testRemove6();
		class15.testRemove7();
		class15.testRemove8();
		class15.testRemove9();
		class15.testRemove10();
		class15.testRemove11();
		class15.testRemove12();
		class15.testRemove13();
		class15.testNewInstance1();
		class15.testGet1();
		class15.testGet2();
		class15.testGet3();
		class15.testContainsKey1();
		class15.testContainsKey2();
		class15.testContainsKey3();
		class15.testContainsValue1();
		class15.testContainsValue2();
		class15.testContainsValue3();
		class15.testPut1();
		class15.testPut2();
		class15.testPut3();
		class15.testPut4();
		class15.testPut5();
		class15.testPut6();
		org.apache.commons.collections4.map.UnmodifiableSortedMapTest class16 = new org.apache.commons.collections4.map.UnmodifiableSortedMapTest(null);
		class16.testUnmodifiable();
		class16.testDecorateFactory();
		org.apache.commons.collections4.map.PredicatedSortedMapTest class17 = new org.apache.commons.collections4.map.PredicatedSortedMapTest(null);
		class17.testEntrySet();
		class17.testPut();
		class17.testSortOrder();
		org.apache.commons.collections4.map.CaseInsensitiveMapTest class18 = new org.apache.commons.collections4.map.CaseInsensitiveMapTest(null);
		class18.testCaseInsensitive();
		class18.testNullHandling();
		class18.testPutAll();
		class18.testClone();
		class18.testLocaleIndependence();
		class18.testInitialCapacityZero();
		org.apache.commons.collections4.map.ListOrderedMapTest class19 = new org.apache.commons.collections4.map.ListOrderedMapTest(null);
		class19.testGetByIndex();
		class19.testGetValueByIndex();
		class19.testIndexOf();
		class19.testSetValueByIndex();
		class19.testRemoveByIndex();
		class19.testPut_intObjectObject();
		class19.testPutAllWithIndex();
		class19.testPutAllWithIndexBug441();
		class19.testValueList_getByIndex();
		class19.testValueList_setByIndex();
		class19.testValueList_removeByIndex();
		class19.testCOLLECTIONS_474_nullValues();
		class19.testCOLLECTIONS_474_nonNullValues();
		org.apache.commons.collections4.map.HashedMapTest class20 = new org.apache.commons.collections4.map.HashedMapTest(null);
		class20.testClone();
		class20.testInternalState();
		class20.testInitialCapacityZero();
		org.apache.commons.collections4.map.MultiKeyMapTest class21 = new org.apache.commons.collections4.map.MultiKeyMapTest(null);
		class21.testNullHandling();
		class21.testMultiKeyGet();
		class21.testMultiKeyContainsKey();
		class21.testMultiKeyPut();
		class21.testMultiKeyPutWithNullKey();
		class21.testMultiKeyRemove();
		class21.testMultiKeyRemoveAll1();
		class21.testMultiKeyRemoveAll2();
		class21.testMultiKeyRemoveAll3();
		class21.testMultiKeyRemoveAll4();
		class21.testClone();
		class21.testLRUMultiKeyMap();
		org.apache.commons.collections4.map.UnmodifiableOrderedMapTest class22 = new org.apache.commons.collections4.map.UnmodifiableOrderedMapTest(null);
		class22.testUnmodifiable();
		class22.testDecorateFactory();
		org.apache.commons.collections4.map.StaticBucketMapTest class23 = new org.apache.commons.collections4.map.StaticBucketMapTest(null);
		class23.test_get_nullMatchesIncorrectly();
		class23.test_containsKey_nullMatchesIncorrectly();
		class23.test_containsValue_nullMatchesIncorrectly();
		org.apache.commons.collections4.map.UnmodifiableMapTest class24 = new org.apache.commons.collections4.map.UnmodifiableMapTest(null);
		class24.testUnmodifiable();
		class24.testDecorateFactory();
		org.apache.commons.collections4.map.TransformedSortedMapTest class25 = new org.apache.commons.collections4.map.TransformedSortedMapTest(null);
		class25.testTransformedMap();
		class25.testFactory_Decorate();
		class25.testFactory_decorateTransform();
	}
}