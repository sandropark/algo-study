package com.algo.graph.leetcode_39;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode39Test {
    @Test
    void test() throws Exception {
        // Given
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        LeetCode39 sut = new LeetCode39();

        // When
        List<List<Integer>> result = sut.combinationSum(candidates, target);

        // Then
        assertThat(result).containsExactly(List.of(2, 2, 3), List.of(7));
    }

    @Test
    void test2() throws Exception {
        // Given
        int[] candidates = {2, 3, 5};
        int target = 8;
        LeetCode39 sut = new LeetCode39();

        // When
        List<List<Integer>> result = sut.combinationSum(candidates, target);

        // Then
        assertThat(result).containsExactly(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5));
    }

    @Test
    void test3() throws Exception {
        // Given
        int[] candidates = {2, 3};
        int target = 8;
        LeetCode39 sut = new LeetCode39();

        // When
        List<List<Integer>> result = sut.combinationSum(candidates, target);

        // Then
        assertThat(result).containsExactly(List.of(2, 2, 2, 2), List.of(2, 3, 3));
    }
}