package org.apache.commons.collections4.trie;

public class Driver {
	public void runall() {
		org.apache.commons.collections4.trie.UnmodifiableTrieTest class1 = new org.apache.commons.collections4.trie.UnmodifiableTrieTest(null);
		class1.testUnmodifiable();
		class1.testDecorateFactory();
		org.apache.commons.collections4.trie.PatriciaTrieTest class2 = new org.apache.commons.collections4.trie.PatriciaTrieTest(null);
		class2.testPrefixMap();
		class2.testPrefixMapRemoval();
		class2.testPrefixMapSizes();
		class2.testPrefixMapSizes2();
		class2.testPrefixMapClear();
		class2.testPrefixMapClearNothing();
		class2.testPrefixMapClearUsingRemove();
	}
}