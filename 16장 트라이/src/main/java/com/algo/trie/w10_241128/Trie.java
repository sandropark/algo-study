package com.algo.trie.w10_241128;

public class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray())
            cur = cur.putIfAbsent(c);
        cur.word();
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (char c : prefix.toCharArray()) {
            cur = cur.get(c);
            if (cur == null) return false;
        }
        return true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            cur = cur.get(c);
            if (cur == null) return false;
        }
        return cur.isWord();
    }
}
