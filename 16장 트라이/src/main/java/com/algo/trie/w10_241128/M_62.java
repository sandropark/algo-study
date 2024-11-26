package com.algo.trie.w10_241128;

import java.util.HashMap;
import java.util.Map;

public class M_62 {
    private final Map<Character, Map> map = new HashMap<>();

    public M_62() {
    }

    public void insert(String word) {
        Map<Character, Map> curMap = map;
        for (char c : word.toCharArray()) {
            curMap.putIfAbsent(c, new HashMap<>());
            curMap = curMap.get(c);
        }
        curMap.putIfAbsent('\\', null);
    }

    public boolean search(String word) {
        Map<Character, Map> curMap = map;
        for (char c : word.toCharArray()) {
            curMap = curMap.get(c);
            if (curMap == null) return false;
        }
        return curMap.containsKey('\\');
    }

    public boolean startsWith(String prefix) {
        Map<Character, Map> curMap = map;
        for (char c : prefix.toCharArray()) {
            curMap = curMap.get(c);
            if (curMap == null) return false;
        }
        return true;
    }
}
