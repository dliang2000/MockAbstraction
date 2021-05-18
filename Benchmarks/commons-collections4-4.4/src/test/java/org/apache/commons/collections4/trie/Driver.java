package org.apache.commons.collections4.trie;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.trie.PatriciaTrieTest class1 = new org.apache.commons.collections4.trie.PatriciaTrieTest();
		class1.testPrefixMap();
		class1.testPrefixMapRemoval();
		class1.testPrefixMapSizes();
		class1.testPrefixMapSizes2();
		class1.testPrefixMapClear();
		class1.testPrefixMapClearNothing();
		class1.testPrefixMapClearUsingRemove();
		org.apache.commons.collections4.trie.UnmodifiableTrieTest class2 = new org.apache.commons.collections4.trie.UnmodifiableTrieTest();
		class2.testUnmodifiable();
		class2.testDecorateFactory();
		org.apache.commons.collections4.trie.PatriciaTrie2Test class3 = new org.apache.commons.collections4.trie.PatriciaTrie2Test();
	}
}