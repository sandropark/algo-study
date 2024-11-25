package com.algo.trie.w10_241128;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private final Map<Character, Map> map;

    public Trie() {
        map = new HashMap<>();
    }

    public void insert(String word) {
        insert(map, word, 0);
    }

    private void insert(Map<Character, Map> map, String word, int idx) {
        int length = word.length();

        if (idx == length) {
            map.putIfAbsent('\\', null);
            return;
        }

        if (idx < length) {
            char c = word.charAt(idx);
            map.putIfAbsent(c, new HashMap());
            insert(map.get(c), word, ++idx);
        }
    }

    public boolean search(String word) {
        return search(map, word, 0);
    }

    private boolean search(Map<Character, Map> map, String prefix, int idx) {
        if (map == null) return false;
        if (idx == prefix.length())
            return map.containsKey('\\');
        char c = prefix.charAt(idx);
        return search(map.get(c), prefix, ++idx);
    }

    public boolean startsWith(String prefix) {
        return startsWith(map, prefix, 0);
    }

    private boolean startsWith(Map<Character, Map> map, String prefix, int idx) {
        if (map == null) return false;
        if (idx == prefix.length()) return true;
        char c = prefix.charAt(idx);
        return startsWith(map.get(c), prefix, ++idx);
    }
}
