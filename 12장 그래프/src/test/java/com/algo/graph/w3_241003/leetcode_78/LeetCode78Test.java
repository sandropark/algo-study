package com.algo.graph.w3_241003.leetcode_78;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode78Test {
    @Test
    void test() throws Exception {
        // Given
        int[] nums = {1, 2, 3};
        LeetCode78 sut = new LeetCode78();

        // When
        List<List<Integer>> result = sut.subsets(nums);

        // Then
        assertThat(result).isEqualTo(List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(1, 2),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3)
        ));
    }

    @Test
    void test2() throws Exception {
        // Given
        int[] nums = {0};
        LeetCode78 sut = new LeetCode78();

        // When
        List<List<Integer>> result = sut.subsets(nums);

        // Then
        assertThat(result).isEqualTo(List.of(List.of(), List.of(0)));
    }

    @Test
    void test3() throws Exception {
        // Given
        int[] nums = {1, 2};
        LeetCode78 sut = new LeetCode78();

        // When
        List<List<Integer>> result = sut.subsets(nums);

        // Then
        assertThat(result).isEqualTo(List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2)
        ));
    }
}