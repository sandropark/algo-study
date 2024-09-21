package com.algo.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode77_조합Test {
    @Test
    void test() throws Exception {
        // Given

        // When
        List<List<Integer>> result = LeetCode77_조합.solution(4, 2);

        // Then
        assertThat(result).containsExactly(
                List.of(1, 2),
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 3),
                List.of(2, 4),
                List.of(3, 4)
        );
    }
}