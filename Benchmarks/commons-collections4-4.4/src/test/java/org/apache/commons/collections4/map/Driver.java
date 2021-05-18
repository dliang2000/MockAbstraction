package org.apache.commons.collections4.map;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.map.FixedSizeSortedMapTest class1 = new org.apache.commons.collections4.map.FixedSizeSortedMapTest();
		org.apache.commons.collections4.map.CaseInsensitiveMapTest class2 = new org.apache.commons.collections4.map.CaseInsensitiveMapTest();
		class2.testCaseInsensitive();
		class2.testNullHandling();
		class2.testPutAll();
		class2.testClone();
		class2.testLocaleIndependence();
		class2.testInitialCapacityZero();
		org.apache.commons.collections4.map.LinkedMapTest class3 = new org.apache.commons.collections4.map.LinkedMapTest();
		class3.testReset();
		class3.testInsertionOrder();
		class3.testGetByIndex();
		class3.testGetValueByIndex();
		class3.testIndexOf();
		class3.testRemoveByIndex();
		class3.testClone();
		class3.testInitialCapacityZero();
		org.apache.commons.collections4.map.PassiveExpiringMapTest class4 = new org.apache.commons.collections4.map.PassiveExpiringMapTest();
		class4.testConstructors();
		class4.testContainsKey();
		class4.testContainsValue();
		class4.testDecoratedMap();
		class4.testEntrySet();
		class4.testExpiration();
		class4.testGet();
		class4.testIsEmpty();
		class4.testKeySet();
		class4.testPut();
		class4.testSize();
		class4.testValues();
		class4.testZeroTimeToLive();
		org.apache.commons.collections4.map.PredicatedMapTest class5 = new org.apache.commons.collections4.map.PredicatedMapTest();
		class5.testEntrySet();
		class5.testPut();
		org.apache.commons.collections4.map.HashedMapTest class6 = new org.apache.commons.collections4.map.HashedMapTest();
		class6.testClone();
		class6.testInternalState();
		class6.testInitialCapacityZero();
		org.apache.commons.collections4.map.IdentityMap class7 = new org.apache.commons.collections4.map.IdentityMap();
		org.apache.commons.collections4.map.ReferenceMapTest class8 = new org.apache.commons.collections4.map.ReferenceMapTest();
		class8.testNullHandling();
		try {
			class8.testPurgeValues();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class8.testCustomPurge();
		try {
			class8.testDataSizeAfterSerialization();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err3) {
			err3.printStackTrace();
		}
		org.apache.commons.collections4.map.TransformedMapTest class9 = new org.apache.commons.collections4.map.TransformedMapTest();
		class9.testTransformedMap();
		class9.testFactory_Decorate();
		class9.testFactory_decorateTransform();
		org.apache.commons.collections4.map.StaticBucketMapTest class10 = new org.apache.commons.collections4.map.StaticBucketMapTest();
		class10.test_get_nullMatchesIncorrectly();
		class10.test_containsKey_nullMatchesIncorrectly();
		class10.test_containsValue_nullMatchesIncorrectly();
		org.apache.commons.collections4.map.FixedSizeMapTest class11 = new org.apache.commons.collections4.map.FixedSizeMapTest();
		org.apache.commons.collections4.map.MultiKeyMapTest class12 = new org.apache.commons.collections4.map.MultiKeyMapTest();
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
		org.apache.commons.collections4.map.LazyMapTest class13 = new org.apache.commons.collections4.map.LazyMapTest();
		class13.testMapGet();
		class13.mapGetWithFactory();
		class13.mapGetWithTransformer();
		org.apache.commons.collections4.map.Flat3MapTest class14 = new org.apache.commons.collections4.map.Flat3MapTest();
		class14.testEquals1();
		class14.testEquals2();
		class14.testClone2();
		class14.testClone4();
		try {
			class14.testSerialisation0();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class14.testSerialisation2();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class14.testSerialisation4();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class14.testEntryIteratorSetValue1();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class14.testEntryIteratorSetValue2();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class14.testEntryIteratorSetValue3();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class14.testMapIteratorSetValue1();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class14.testMapIteratorSetValue2();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class14.testMapIteratorSetValue3();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		class14.testCollections261();
		class14.testToString();
		class14.testRemove1();
		class14.testRemove2();
		class14.testRemove3();
		class14.testRemove4();
		class14.testRemove5();
		class14.testRemove6();
		class14.testRemove7();
		class14.testRemove8();
		class14.testRemove9();
		class14.testRemove10();
		class14.testRemove11();
		class14.testRemove12();
		class14.testRemove13();
		class14.testNewInstance1();
		class14.testGet1();
		class14.testGet2();
		class14.testGet3();
		class14.testContainsKey1();
		class14.testContainsKey2();
		class14.testContainsKey3();
		class14.testContainsValue1();
		class14.testContainsValue2();
		class14.testContainsValue3();
		class14.testPut1();
		class14.testPut2();
		class14.testPut3();
		class14.testPut4();
		class14.testPut5();
		class14.testPut6();
		org.apache.commons.collections4.map.TransformedSortedMapTest class15 = new org.apache.commons.collections4.map.TransformedSortedMapTest();
		class15.testTransformedMap();
		class15.testFactory_Decorate();
		class15.testFactory_decorateTransform();
		org.apache.commons.collections4.map.UnmodifiableMapTest class16 = new org.apache.commons.collections4.map.UnmodifiableMapTest();
		class16.testUnmodifiable();
		class16.testDecorateFactory();
		org.apache.commons.collections4.map.ListOrderedMapTest class17 = new org.apache.commons.collections4.map.ListOrderedMapTest();
		class17.testGetByIndex();
		class17.testGetValueByIndex();
		class17.testIndexOf();
		class17.testSetValueByIndex();
		class17.testRemoveByIndex();
		class17.testPut_intObjectObject();
		class17.testPutAllWithIndex();
		class17.testPutAllWithIndexBug441();
		class17.testValueList_getByIndex();
		class17.testValueList_setByIndex();
		class17.testValueList_removeByIndex();
		class17.testCOLLECTIONS_474_nullValues();
		class17.testCOLLECTIONS_474_nonNullValues();
		org.apache.commons.collections4.map.CompositeMapTest class18 = new org.apache.commons.collections4.map.CompositeMapTest();
		class18.testGet();
		class18.testAddComposited();
		class18.testRemoveComposited();
		class18.testRemoveFromUnderlying();
		class18.testRemoveFromComposited();
		class18.testResolveCollision();
		class18.testPut();
		class18.testPutAll();
		org.apache.commons.collections4.map.EmptyMapMutator class19 = new org.apache.commons.collections4.map.EmptyMapMutator();
		org.apache.commons.collections4.map.SingletonMapTest class20 = new org.apache.commons.collections4.map.SingletonMapTest();
		class20.testClone();
		class20.testKeyValue();
		class20.testBoundedMap();
		org.apache.commons.collections4.map.PredicatedSortedMapTest class21 = new org.apache.commons.collections4.map.PredicatedSortedMapTest();
		class21.testEntrySet();
		class21.testPut();
		class21.testSortOrder();
		org.apache.commons.collections4.map.LRUMapTest class22 = new org.apache.commons.collections4.map.LRUMapTest();
		class22.testCtors();
		class22.testLRU();
		class22.testReset();
		class22.testAccessOrder();
		class22.testAccessOrder2();
		class22.testClone();
		class22.testRemoveLRU();
		class22.testRemoveLRUBlocksRemove();
		class22.testRemoveLRUBlocksRemoveScan();
		class22.testRemoveLRUFirstBlocksRemove();
		class22.testInternalState_Buckets();
		class22.testInternalState_getEntry_int();
		try {
			class22.testSynchronizedRemoveFromMapIterator();
		}
		catch (java.lang.InterruptedException err13) {
			err13.printStackTrace();
		}
		try {
			class22.testSynchronizedRemoveFromEntrySet();
		}
		catch (java.lang.InterruptedException err14) {
			err14.printStackTrace();
		}
		try {
			class22.testSynchronizedRemoveFromKeySet();
		}
		catch (java.lang.InterruptedException err15) {
			err15.printStackTrace();
		}
		try {
			class22.testSynchronizedRemoveFromValues();
		}
		catch (java.lang.InterruptedException err16) {
			err16.printStackTrace();
		}
		org.apache.commons.collections4.map.MultiValueMapTest class23 = new org.apache.commons.collections4.map.MultiValueMapTest();
		class23.testNoMappingReturnsNull();
		class23.testValueCollectionType();
		class23.testMultipleValues();
		class23.testContainsValue();
		class23.testKeyContainsValue();
		class23.testValues();
		class23.testKeyedIterator();
		class23.testRemoveAllViaIterator();
		class23.testRemoveAllViaKeyedIterator();
		class23.testIterator();
		class23.testRemoveAllViaEntryIterator();
		class23.testTotalSizeA();
		class23.testMapEquals();
		class23.testGetCollection();
		class23.testTotalSize();
		class23.testSize();
		class23.testSize_Key();
		class23.testIterator_Key();
		class23.testContainsValue_Key();
		class23.testPutWithList();
		class23.testPutWithSet();
		class23.testPutAll_Map1();
		class23.testPutAll_Map2();
		class23.testPutAll_KeyCollection();
		class23.testRemove_KeyItem();
		try {
			class23.testUnsafeDeSerialization();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class23.testEmptyMapCompatibility();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class23.testFullMapCompatibility();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		org.apache.commons.collections4.map.LazySortedMapTest class24 = new org.apache.commons.collections4.map.LazySortedMapTest();
		class24.testMapGet();
		class24.mapGet();
		class24.testSortOrder();
		class24.testTransformerDecorate();
		org.apache.commons.collections4.map.ReferenceIdentityMapTest class25 = new org.apache.commons.collections4.map.ReferenceIdentityMapTest();
		class25.testBasics();
		class25.testHashEntry();
		class25.testNullHandling();
		try {
			class25.testPurgeValues();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		org.apache.commons.collections4.map.UnmodifiableSortedMapTest class26 = new org.apache.commons.collections4.map.UnmodifiableSortedMapTest();
		class26.testUnmodifiable();
		class26.testDecorateFactory();
		org.apache.commons.collections4.map.DefaultedMapTest class27 = new org.apache.commons.collections4.map.DefaultedMapTest();
		class27.testMapGet();
		class27.testMapGet2();
		class27.testMapGet3();
		class27.testMapGet4();
		org.apache.commons.collections4.map.UnmodifiableOrderedMapTest class28 = new org.apache.commons.collections4.map.UnmodifiableOrderedMapTest();
		class28.testUnmodifiable();
		class28.testDecorateFactory();
		org.apache.commons.collections4.map.ListOrderedMap2Test class29 = new org.apache.commons.collections4.map.ListOrderedMap2Test();
		class29.testGetByIndex();
		class29.testGetValueByIndex();
		class29.testIndexOf();
		class29.testRemoveByIndex();
	}
}