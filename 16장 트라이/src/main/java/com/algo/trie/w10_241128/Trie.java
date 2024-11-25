package com.algo.trie.w10_241128;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private Map<Character, Map> map;
    public Trie() {
        map = new HashMap<>();
    }

    public void insert(String word) {
        insert(word, 0, map);
    }

    private void insert(String word, int idx, Map<Character, Map> map) {
        if (idx < word.length()) {
            char c = word.charAt(idx);
            insert(word, ++idx, map.putIfAbsent(c, Map.of()));
        }
    }

    public boolean search(String word) {
        return search(map, word, 0);
    }

    private boolean search(Map<Character, Map> map, String prefix, int idx) {
        if (idx == prefix.length() && map == null) return true;
        char c = prefix.charAt(idx);
        return search(map.get(c), prefix, ++idx);
    }



    public boolean startsWith(String prefix) {
        return startsWith(map, prefix, 0);
    }

    private boolean startsWith(Map<Character, Map> map, String prefix, int idx) {
        if (idx == prefix.length()) return true;
        if (map == null) return false;
        char c = prefix.charAt(idx);
        return startsWith(map.get(c), prefix, ++idx);
    }
}
