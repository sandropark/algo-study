package com.algo.graph.leetcode_17;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class LeetCode_17 {
    private final Map<Character, List<Character>> map;

    public void solution(String input, List<String> result, int index, StringBuilder path) {
        if (path.length() == input.length()) {
            result.add(path.toString());
            return;
        }

        for (Character c : map.get(input.charAt(index)))
            solution(input, result, index + 1, new StringBuilder(path).append(c));
    }
}
