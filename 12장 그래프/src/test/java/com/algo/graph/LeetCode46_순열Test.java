package com.algo.graph;

import com.algo.graph.leetcode_46.LeetCode46_순열;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode46_순열Test {
    @Test
    void test() throws Exception {
        // Given
        int[] nums = {1, 2, 3};

        // When
        List<List<Integer>> result = LeetCode46_순열.solution(nums);

        // Then
        assertThat(result).containsExactly(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );
    }
}