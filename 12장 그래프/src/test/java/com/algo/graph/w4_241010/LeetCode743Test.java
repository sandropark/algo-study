package com.algo.graph.w4_241010;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode743Test {
    LeetCode743 sut = new LeetCode743();

    @Test
    void test() throws Exception {
        // Given
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;

        // When
        int result = sut.networkDelayTime(times, n, k);

        // Then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test2() throws Exception {
        // Given
        int[][] times = {{1, 2, 1}};
        int n = 2;
        int k = 1;

        // When
        int result = sut.networkDelayTime(times, n, k);

        // Then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test3() throws Exception {
        // Given
        int[][] times = {{1, 2, 1}};
        int n = 2;
        int k = 2;

        // When
        int result = sut.networkDelayTime(times, n, k);

        // Then
        assertThat(result).isEqualTo(-1);
    }
}