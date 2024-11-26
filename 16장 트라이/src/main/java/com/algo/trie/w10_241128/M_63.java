package com.algo.trie.w10_241128;

import java.util.ArrayList;
import java.util.List;

public class M_63 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                if (i != j && isPalindromePairs(words[i] + words[j]))
                    result.add(List.of(i, j));

        return result;
    }

    private boolean isPalindromePairs(String newWord) {
        return newWord.contentEquals(new StringBuilder(newWord).reverse());
    }
}
