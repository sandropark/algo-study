package com.algo.trie.w10_241128;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class M_63Test {
    M_63 sut = new M_63();

    @Test
    void test() throws Exception {
        // Given
        String[] words = {"bat", "tab", "cat"};

        // When
        List<List<Integer>> result = sut.palindromePairs(words);

        // Then
        assertThat(result)
                .hasSize(2)
                .containsOnly(List.of(0, 1), List.of(1, 0));
    }

    @Test
    void test2() throws Exception {
        // Given
        String[] words = {"a", ""};

        // When
        List<List<Integer>> result = sut.palindromePairs(words);

        // Then
        assertThat(result)
                .hasSize(2)
                .containsOnly(List.of(0, 1), List.of(1, 0));
    }

    @Test
    void test3() throws Exception {
        // Given
        String[] words = {"abcd", "dcba", "lls", "s", "sssll"};

        // When
        List<List<Integer>> result = sut.palindromePairs(words);

        // Then
        assertThat(result)
                .hasSize(4)
                .containsOnly(List.of(0, 1), List.of(1, 0), List.of(3, 2), List.of(2, 4));
    }


}