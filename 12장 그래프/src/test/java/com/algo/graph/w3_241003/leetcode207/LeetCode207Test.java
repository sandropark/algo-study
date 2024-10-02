package com.algo.graph.w3_241003.leetcode207;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode207Test {
    @Test
    void test() throws Exception {
        // Given
        LeetCode207 sut = new LeetCode207();

        // When
        boolean result = sut.canFinish(2, new int[][]{{0, 1}});

        // Then
        assertThat(result).isTrue();
    }

    @Test
    void test2() throws Exception {
        // Given
        LeetCode207 sut = new LeetCode207();

        // When
        boolean result = sut.canFinish(2, new int[][]{{0, 1}, {1, 0}});

        // Then
        assertThat(result).isFalse();
    }

    @Test
    void test3() throws Exception {
        // Given
        LeetCode207 sut = new LeetCode207();

        // When
        boolean result = sut.canFinish(1, new int[][]{});

        // Then
        assertThat(result).isTrue();
    }

    @Test
    void test4() throws Exception {
        // Given
        LeetCode207 sut = new LeetCode207();

        // When
        boolean result = sut.canFinish(1, new int[][]{{1, 0}, {0, 2}, {2, 1}});

        // Then
        assertThat(result).isFalse();
    }
}