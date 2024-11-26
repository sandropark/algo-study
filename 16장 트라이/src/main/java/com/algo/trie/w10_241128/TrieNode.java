package com.algo.trie.w10_241128;

public class TrieNode {
    private boolean word;
    private final TrieNode[] children = new TrieNode[26];

    public TrieNode putIfAbsent(char c) {
        int idx = c - 'a';
        if (children[idx] == null)
            children[idx] = new TrieNode();
        return children[idx];
    }

    public void word() {
        word = true;
    }

    public TrieNode get(char c) {
        return children[c - 'a'];
    }

    public boolean isWord() {
        return word;
    }
}
