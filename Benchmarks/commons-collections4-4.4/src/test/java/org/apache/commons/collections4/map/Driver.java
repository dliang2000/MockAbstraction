package org.apache.commons.collections4.map;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.map.HashedMapTest class1 = new org.apache.commons.collections4.map.HashedMapTest(null);
		class1.testClone();
		class1.testInternalState();
		class1.testInitialCapacityZero();
		org.apache.commons.collections4.map.LazySortedMapTest class2 = new org.apache.commons.collections4.map.LazySortedMapTest(null);
		class2.testMapGet();
		class2.mapGet();
		class2.testSortOrder();
		class2.testTransformerDecorate();
		org.apache.commons.collections4.map.MultiKeyMapTest class3 = new org.apache.commons.collections4.map.MultiKeyMapTest(null);
		class3.testNullHandling();
		class3.testMultiKeyGet();
		class3.testMultiKeyContainsKey();
		class3.testMultiKeyPut();
		class3.testMultiKeyPutWithNullKey();
		class3.testMultiKeyRemove();
		class3.testMultiKeyRemoveAll1();
		class3.testMultiKeyRemoveAll2();
		class3.testMultiKeyRemoveAll3();
		class3.testMultiKeyRemoveAll4();
		class3.testClone();
		class3.testLRUMultiKeyMap();
		org.apache.commons.collections4.map.UnmodifiableSortedMapTest class4 = new org.apache.commons.collections4.map.UnmodifiableSortedMapTest(null);
		class4.testUnmodifiable();
		class4.testDecorateFactory();
		org.apache.commons.collections4.map.SingletonMapTest class5 = new org.apache.commons.collections4.map.SingletonMapTest(null);
		class5.testClone();
		class5.testKeyValue();
		class5.testBoundedMap();
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
		org.apache.commons.collections4.map.LinkedMapTest class7 = new org.apache.commons.collections4.map.LinkedMapTest(null);
		class7.testReset();
		class7.testInsertionOrder();
		class7.testGetByIndex();
		class7.testGetValueByIndex();
		class7.testIndexOf();
		class7.testRemoveByIndex();
		class7.testClone();
		class7.testInitialCapacityZero();
		org.apache.commons.collections4.map.TransformedMapTest class8 = new org.apache.commons.collections4.map.TransformedMapTest(null);
		class8.testTransformedMap();
		class8.testFactory_Decorate();
		class8.testFactory_decorateTransform();
		org.apache.commons.collections4.map.MultiValueMapTest class9 = new org.apache.commons.collections4.map.MultiValueMapTest(null);
		class9.testNoMappingReturnsNull();
		class9.testValueCollectionType();
		class9.testMultipleValues();
		class9.testContainsValue();
		class9.testKeyContainsValue();
		class9.testValues();
		class9.testKeyedIterator();
		class9.testRemoveAllViaIterator();
		class9.testRemoveAllViaKeyedIterator();
		class9.testIterator();
		class9.testRemoveAllViaEntryIterator();
		class9.testTotalSizeA();
		class9.testMapEquals();
		class9.testGetCollection();
		class9.testTotalSize();
		class9.testSize();
		class9.testSize_Key();
		class9.testIterator_Key();
		class9.testContainsValue_Key();
		class9.testPutWithList();
		class9.testPutWithSet();
		class9.testPutAll_Map1();
		class9.testPutAll_Map2();
		class9.testPutAll_KeyCollection();
		class9.testRemove_KeyItem();
		try {
			class9.testUnsafeDeSerialization();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class9.testEmptyMapCompatibility();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class9.testFullMapCompatibility();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		org.apache.commons.collections4.map.UnmodifiableOrderedMapTest class10 = new org.apache.commons.collections4.map.UnmodifiableOrderedMapTest(null);
		class10.testUnmodifiable();
		class10.testDecorateFactory();
		org.apache.commons.collections4.map.PredicatedSortedMapTest class11 = new org.apache.commons.collections4.map.PredicatedSortedMapTest(null);
		class11.testEntrySet();
		class11.testPut();
		class11.testSortOrder();
		org.apache.commons.collections4.map.CaseInsensitiveMapTest class12 = new org.apache.commons.collections4.map.CaseInsensitiveMapTest(null);
		class12.testCaseInsensitive();
		class12.testNullHandling();
		class12.testPutAll();
		class12.testClone();
		class12.testLocaleIndependence();
		class12.testInitialCapacityZero();
		org.apache.commons.collections4.map.TransformedSortedMapTest class13 = new org.apache.commons.collections4.map.TransformedSortedMapTest(null);
		class13.testTransformedMap();
		class13.testFactory_Decorate();
		class13.testFactory_decorateTransform();
		org.apache.commons.collections4.map.ListOrderedMap2Test class14 = new org.apache.commons.collections4.map.ListOrderedMap2Test(null);
		class14.testGetByIndex();
		class14.testGetValueByIndex();
		class14.testIndexOf();
		class14.testRemoveByIndex();
		org.apache.commons.collections4.map.DefaultedMapTest class15 = new org.apache.commons.collections4.map.DefaultedMapTest(null);
		class15.testMapGet();
		class15.testMapGet2();
		class15.testMapGet3();
		class15.testMapGet4();
		org.apache.commons.collections4.map.LRUMapTest class16 = new org.apache.commons.collections4.map.LRUMapTest(null);
		class16.testCtors();
		class16.testLRU();
		class16.testReset();
		class16.testAccessOrder();
		class16.testAccessOrder2();
		class16.testClone();
		class16.testRemoveLRU();
		class16.testRemoveLRUBlocksRemove();
		class16.testRemoveLRUBlocksRemoveScan();
		class16.testRemoveLRUFirstBlocksRemove();
		class16.testInternalState_Buckets();
		class16.testInternalState_getEntry_int();
		try {
			class16.testSynchronizedRemoveFromMapIterator();
		}
		catch (java.lang.InterruptedException err7) {
			err7.printStackTrace();
		}
		try {
			class16.testSynchronizedRemoveFromEntrySet();
		}
		catch (java.lang.InterruptedException err8) {
			err8.printStackTrace();
		}
		try {
			class16.testSynchronizedRemoveFromKeySet();
		}
		catch (java.lang.InterruptedException err9) {
			err9.printStackTrace();
		}
		try {
			class16.testSynchronizedRemoveFromValues();
		}
		catch (java.lang.InterruptedException err10) {
			err10.printStackTrace();
		}
		org.apache.commons.collections4.map.StaticBucketMapTest class17 = new org.apache.commons.collections4.map.StaticBucketMapTest(null);
		class17.test_get_nullMatchesIncorrectly();
		class17.test_containsKey_nullMatchesIncorrectly();
		class17.test_containsValue_nullMatchesIncorrectly();
		org.apache.commons.collections4.map.ReferenceIdentityMapTest class18 = new org.apache.commons.collections4.map.ReferenceIdentityMapTest(null);
		class18.testBasics();
		class18.testHashEntry();
		class18.testNullHandling();
		try {
			class18.testPurgeValues();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		org.apache.commons.collections4.map.Flat3MapTest class19 = new org.apache.commons.collections4.map.Flat3MapTest(null);
		class19.testEquals1();
		class19.testEquals2();
		class19.testClone2();
		class19.testClone4();
		try {
			class19.testSerialisation0();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class19.testSerialisation2();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class19.testSerialisation4();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class19.testEntryIteratorSetValue1();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class19.testEntryIteratorSetValue2();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class19.testEntryIteratorSetValue3();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class19.testMapIteratorSetValue1();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class19.testMapIteratorSetValue2();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class19.testMapIteratorSetValue3();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		class19.testCollections261();
		class19.testToString();
		class19.testRemove1();
		class19.testRemove2();
		class19.testRemove3();
		class19.testRemove4();
		class19.testRemove5();
		class19.testRemove6();
		class19.testRemove7();
		class19.testRemove8();
		class19.testRemove9();
		class19.testRemove10();
		class19.testRemove11();
		class19.testRemove12();
		class19.testRemove13();
		class19.testNewInstance1();
		class19.testGet1();
		class19.testGet2();
		class19.testGet3();
		class19.testContainsKey1();
		class19.testContainsKey2();
		class19.testContainsKey3();
		class19.testContainsValue1();
		class19.testContainsValue2();
		class19.testContainsValue3();
		class19.testPut1();
		class19.testPut2();
		class19.testPut3();
		class19.testPut4();
		class19.testPut5();
		class19.testPut6();
		org.apache.commons.collections4.map.LazyMapTest class20 = new org.apache.commons.collections4.map.LazyMapTest(null);
		class20.testMapGet();
		class20.mapGetWithFactory();
		class20.mapGetWithTransformer();
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
		org.apache.commons.collections4.map.PredicatedMapTest class22 = new org.apache.commons.collections4.map.PredicatedMapTest(null);
		class22.testEntrySet();
		class22.testPut();
		org.apache.commons.collections4.map.UnmodifiableMapTest class23 = new org.apache.commons.collections4.map.UnmodifiableMapTest(null);
		class23.testUnmodifiable();
		class23.testDecorateFactory();
		org.apache.commons.collections4.map.PassiveExpiringMapTest class24 = new org.apache.commons.collections4.map.PassiveExpiringMapTest(null);
		class24.testConstructors();
		class24.testContainsKey();
		class24.testContainsValue();
		class24.testDecoratedMap();
		class24.testEntrySet();
		class24.testExpiration();
		class24.testGet();
		class24.testIsEmpty();
		class24.testKeySet();
		class24.testPut();
		class24.testSize();
		class24.testValues();
		class24.testZeroTimeToLive();
		org.apache.commons.collections4.map.CompositeMapTest class25 = new org.apache.commons.collections4.map.CompositeMapTest(null);
		class25.testGet();
		class25.testAddComposited();
		class25.testRemoveComposited();
		class25.testRemoveFromUnderlying();
		class25.testRemoveFromComposited();
		class25.testResolveCollision();
		class25.testPut();
		class25.testPutAll();
	}
}