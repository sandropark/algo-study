package com.algo.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class LetterCombiOfAPhone_17Test {
    Map<Character, List<Character>> map = Map.of(
            '2', List.of('a', 'b', 'c'),
            '3', List.of('d', 'e', 'f'),
            '4', List.of('g', 'h', 'i'),
            '5', List.of('j', 'k', 'l'),
            '6', List.of('m', 'n', 'o'),
            '7', List.of('p', 'q', 'r', 's'),
            '8', List.of('t', 'u', 'v'),
            '9', List.of('w', 'x', 'y', 'z'));

    @Test
    void test() throws Exception {
        // Given
        String input = "23";
        List<String> result = new ArrayList<>();
        LetterCombiOfAPhone_17 sut = new LetterCombiOfAPhone_17(map);

        // When
        sut.solution(input, result, 0, new StringBuilder());

        // Then
        assertThat(result).containsExactly("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    }

    @Test
    void test_kt() throws Exception {
        // Given
        String input = "23";
        LeetCode17 sut = new LeetCode17(map);

        // When
        List<String> result = sut.solution(input);

        // Then
        assertThat(result).containsExactly("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    }
}