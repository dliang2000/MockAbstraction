package org.apache.commons.collections4.map;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.map.PredicatedSortedMapTest class1 = new org.apache.commons.collections4.map.PredicatedSortedMapTest(null);
		class1.testEntrySet();
		class1.testPut();
		class1.testSortOrder();
		org.apache.commons.collections4.map.LazySortedMapTest class2 = new org.apache.commons.collections4.map.LazySortedMapTest(null);
		class2.testMapGet();
		class2.mapGet();
		class2.testSortOrder();
		class2.testTransformerDecorate();
		org.apache.commons.collections4.map.UnmodifiableOrderedMapTest class3 = new org.apache.commons.collections4.map.UnmodifiableOrderedMapTest(null);
		class3.testUnmodifiable();
		class3.testDecorateFactory();
		org.apache.commons.collections4.map.LinkedMapTest class4 = new org.apache.commons.collections4.map.LinkedMapTest(null);
		class4.testReset();
		class4.testInsertionOrder();
		class4.testGetByIndex();
		class4.testGetValueByIndex();
		class4.testIndexOf();
		class4.testRemoveByIndex();
		class4.testClone();
		class4.testInitialCapacityZero();
		org.apache.commons.collections4.map.StaticBucketMapTest class5 = new org.apache.commons.collections4.map.StaticBucketMapTest(null);
		class5.test_get_nullMatchesIncorrectly();
		class5.test_containsKey_nullMatchesIncorrectly();
		class5.test_containsValue_nullMatchesIncorrectly();
		org.apache.commons.collections4.map.TransformedMapTest class6 = new org.apache.commons.collections4.map.TransformedMapTest(null);
		class6.testTransformedMap();
		class6.testFactory_Decorate();
		class6.testFactory_decorateTransform();
		org.apache.commons.collections4.map.ReferenceIdentityMapTest class7 = new org.apache.commons.collections4.map.ReferenceIdentityMapTest(null);
		class7.testBasics();
		class7.testHashEntry();
		class7.testNullHandling();
		try {
			class7.testPurgeValues();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.apache.commons.collections4.map.PassiveExpiringMapTest class8 = new org.apache.commons.collections4.map.PassiveExpiringMapTest(null);
		class8.testConstructors();
		class8.testContainsKey();
		class8.testContainsValue();
		class8.testDecoratedMap();
		class8.testEntrySet();
		class8.testExpiration();
		class8.testGet();
		class8.testIsEmpty();
		class8.testKeySet();
		class8.testPut();
		class8.testSize();
		class8.testValues();
		class8.testZeroTimeToLive();
		org.apache.commons.collections4.map.UnmodifiableSortedMapTest class9 = new org.apache.commons.collections4.map.UnmodifiableSortedMapTest(null);
		class9.testUnmodifiable();
		class9.testDecorateFactory();
		org.apache.commons.collections4.map.LRUMapTest class10 = new org.apache.commons.collections4.map.LRUMapTest(null);
		class10.testCtors();
		class10.testLRU();
		class10.testReset();
		class10.testAccessOrder();
		class10.testAccessOrder2();
		class10.testClone();
		class10.testRemoveLRU();
		class10.testRemoveLRUBlocksRemove();
		class10.testRemoveLRUBlocksRemoveScan();
		class10.testRemoveLRUFirstBlocksRemove();
		class10.testInternalState_Buckets();
		class10.testInternalState_getEntry_int();
		try {
			class10.testSynchronizedRemoveFromMapIterator();
		}
		catch (java.lang.InterruptedException err2) {
			err2.printStackTrace();
		}
		try {
			class10.testSynchronizedRemoveFromEntrySet();
		}
		catch (java.lang.InterruptedException err3) {
			err3.printStackTrace();
		}
		try {
			class10.testSynchronizedRemoveFromKeySet();
		}
		catch (java.lang.InterruptedException err4) {
			err4.printStackTrace();
		}
		try {
			class10.testSynchronizedRemoveFromValues();
		}
		catch (java.lang.InterruptedException err5) {
			err5.printStackTrace();
		}
		org.apache.commons.collections4.map.LazyMapTest class11 = new org.apache.commons.collections4.map.LazyMapTest(null);
		class11.testMapGet();
		class11.mapGetWithFactory();
		class11.mapGetWithTransformer();
		org.apache.commons.collections4.map.MultiKeyMapTest class12 = new org.apache.commons.collections4.map.MultiKeyMapTest(null);
		class12.testNullHandling();
		class12.testMultiKeyGet();
		class12.testMultiKeyContainsKey();
		class12.testMultiKeyPut();
		class12.testMultiKeyPutWithNullKey();
		class12.testMultiKeyRemove();
		class12.testMultiKeyRemoveAll1();
		class12.testMultiKeyRemoveAll2();
		class12.testMultiKeyRemoveAll3();
		class12.testMultiKeyRemoveAll4();
		class12.testClone();
		class12.testLRUMultiKeyMap();
		org.apache.commons.collections4.map.TransformedSortedMapTest class13 = new org.apache.commons.collections4.map.TransformedSortedMapTest(null);
		class13.testTransformedMap();
		class13.testFactory_Decorate();
		class13.testFactory_decorateTransform();
		org.apache.commons.collections4.map.HashedMapTest class14 = new org.apache.commons.collections4.map.HashedMapTest(null);
		class14.testClone();
		class14.testInternalState();
		class14.testInitialCapacityZero();
		org.apache.commons.collections4.map.Flat3MapTest class15 = new org.apache.commons.collections4.map.Flat3MapTest(null);
		class15.testEquals1();
		class15.testEquals2();
		class15.testClone2();
		class15.testClone4();
		try {
			class15.testSerialisation0();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class15.testSerialisation2();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class15.testSerialisation4();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class15.testEntryIteratorSetValue1();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class15.testEntryIteratorSetValue2();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class15.testEntryIteratorSetValue3();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class15.testMapIteratorSetValue1();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class15.testMapIteratorSetValue2();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class15.testMapIteratorSetValue3();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
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
		org.apache.commons.collections4.map.CaseInsensitiveMapTest class16 = new org.apache.commons.collections4.map.CaseInsensitiveMapTest(null);
		class16.testCaseInsensitive();
		class16.testNullHandling();
		class16.testPutAll();
		class16.testClone();
		class16.testLocaleIndependence();
		class16.testInitialCapacityZero();
		org.apache.commons.collections4.map.PredicatedMapTest class17 = new org.apache.commons.collections4.map.PredicatedMapTest(null);
		class17.testEntrySet();
		class17.testPut();
		org.apache.commons.collections4.map.CompositeMapTest class18 = new org.apache.commons.collections4.map.CompositeMapTest(null);
		class18.testGet();
		class18.testAddComposited();
		class18.testRemoveComposited();
		class18.testRemoveFromUnderlying();
		class18.testRemoveFromComposited();
		class18.testResolveCollision();
		class18.testPut();
		class18.testPutAll();
		org.apache.commons.collections4.map.DefaultedMapTest class19 = new org.apache.commons.collections4.map.DefaultedMapTest(null);
		class19.testMapGet();
		class19.testMapGet2();
		class19.testMapGet3();
		class19.testMapGet4();
		org.apache.commons.collections4.map.UnmodifiableMapTest class20 = new org.apache.commons.collections4.map.UnmodifiableMapTest(null);
		class20.testUnmodifiable();
		class20.testDecorateFactory();
		org.apache.commons.collections4.map.ListOrderedMapTest class21 = new org.apache.commons.collections4.map.ListOrderedMapTest(null);
		class21.testGetByIndex();
		class21.testGetValueByIndex();
		class21.testIndexOf();
		class21.testSetValueByIndex();
		class21.testRemoveByIndex();
		class21.testPut_intObjectObject();
		class21.testPutAllWithIndex();
		class21.testPutAllWithIndexBug441();
		class21.testValueList_getByIndex();
		class21.testValueList_setByIndex();
		class21.testValueList_removeByIndex();
		class21.testCOLLECTIONS_474_nullValues();
		class21.testCOLLECTIONS_474_nonNullValues();
		org.apache.commons.collections4.map.ListOrderedMap2Test class22 = new org.apache.commons.collections4.map.ListOrderedMap2Test(null);
		class22.testGetByIndex();
		class22.testGetValueByIndex();
		class22.testIndexOf();
		class22.testRemoveByIndex();
		org.apache.commons.collections4.map.ReferenceMapTest class23 = new org.apache.commons.collections4.map.ReferenceMapTest(null);
		class23.testNullHandling();
		try {
			class23.testPurgeValues();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		class23.testCustomPurge();
		try {
			class23.testDataSizeAfterSerialization();
		}
		catch (java.io.IOException err16) {
			err16.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err17) {
			err17.printStackTrace();
		}
		org.apache.commons.collections4.map.MultiValueMapTest class24 = new org.apache.commons.collections4.map.MultiValueMapTest(null);
		class24.testNoMappingReturnsNull();
		class24.testValueCollectionType();
		class24.testMultipleValues();
		class24.testContainsValue();
		class24.testKeyContainsValue();
		class24.testValues();
		class24.testKeyedIterator();
		class24.testRemoveAllViaIterator();
		class24.testRemoveAllViaKeyedIterator();
		class24.testIterator();
		class24.testRemoveAllViaEntryIterator();
		class24.testTotalSizeA();
		class24.testMapEquals();
		class24.testGetCollection();
		class24.testTotalSize();
		class24.testSize();
		class24.testSize_Key();
		class24.testIterator_Key();
		class24.testContainsValue_Key();
		class24.testPutWithList();
		class24.testPutWithSet();
		class24.testPutAll_Map1();
		class24.testPutAll_Map2();
		class24.testPutAll_KeyCollection();
		class24.testRemove_KeyItem();
		try {
			class24.testUnsafeDeSerialization();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class24.testEmptyMapCompatibility();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class24.testFullMapCompatibility();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		org.apache.commons.collections4.map.SingletonMapTest class25 = new org.apache.commons.collections4.map.SingletonMapTest(null);
		class25.testClone();
		class25.testKeyValue();
		class25.testBoundedMap();
	}
}