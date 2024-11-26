package com.algo.trie.w10_241128;

import java.util.ArrayList;
import java.util.List;

public class M_63 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                if (i != j && palindromePairs(words[i] + words[j]))
                    result.add(List.of(i, j));

        return result;
    }

    private boolean palindromePairs(String newWord) {
        int length = newWord.length();
        if (length < 2) return true;

        int start = 0, end = length - 1;
        char s, e;
        while (start < end) {
            s = newWord.charAt(start++);
            e = newWord.charAt(end--);
            if (s != e)
                return false;
        }
        return true;
    }
}
