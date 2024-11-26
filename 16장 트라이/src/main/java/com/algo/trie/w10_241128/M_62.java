package com.algo.trie.w10_241128;

public class M_62 {
    private final TrieNode root = new TrieNode();

    public M_62() {
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray())
            cur = cur.putIfAbsent(c);
        cur.word();
    }

    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }

    public boolean search(String word) {
        TrieNode node = findNode(word);
        return node != null && node.isWord();
    }

    private TrieNode findNode(String target) {
        TrieNode cur = root;
        for (char c : target.toCharArray()) {
            cur = cur.get(c);
            if (cur == null) return null;
        }
        return cur;
    }
}
