package com.algo.trie.w10_241128;

import java.util.ArrayList;
import java.util.List;

public class M_63 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Trie t = new Trie();

        for (int i = 0; i < words.length; i++)
            t.insert(i, words[i]);

        for (int i = 0; i < words.length; i++)
            result.addAll(t.search(i, words[i]));

        return result;
    }

    static class TrieNode {
        int wordId = -1;
        TrieNode[] children = new TrieNode[26];
        List<Integer> palindromeWordIds = new ArrayList();

        TrieNode putIfAbsent(char c) {
            int charIdx = c - 'a';
            TrieNode child = children[charIdx];

            if (child == null) {
                child = new TrieNode();
                children[charIdx] = child;
            }

            return child;
        }

    }

    static class Trie {
        TrieNode root = new TrieNode();

        public boolean isPalindrome(String str, int start, int end) {
            while (start < end)
                if (str.charAt(start++) != str.charAt(end--)) return false;
            return true;
        }

        public void insert(int indexOfWord, String word) {
            TrieNode cur = root;
            for (int i = word.length() - 1; i >= 0; i--) {
                if (isPalindrome(word, 0, i))
                    cur.palindromeWordIds.add(indexOfWord);
                cur = cur.putIfAbsent(word.charAt(i));
            }
            cur.wordId = indexOfWord;
        }

        public List<List<Integer>> search(int index, String word) {
            TrieNode cur = root;
            List<List<Integer>> result = new ArrayList<>();
            int lastIdx = word.length() - 1;

            for (int j = 0; j < word.length(); j++) {
                if (cur.wordId >= 0 && isPalindrome(word, j, lastIdx))
                    result.add(List.of(index, cur.wordId));

                TrieNode child = cur.children[word.charAt(j) - 'a'];
                if (child == null) return result;

                cur = child;
            }

            if (cur.wordId >= 0 && cur.wordId != index)
                result.add(List.of(index, cur.wordId));

            for (int palindromeWordId : cur.palindromeWordIds)
                result.add(List.of(index, palindromeWordId));

            return result;
        }
    }
}
