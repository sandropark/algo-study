package com.algo.graph.w4_241010;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode743Test {
    LeetCode743_44 sut = new LeetCode743_44();

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

    @Test
    void test4() throws Exception {
        // Given
        int[][] times = {{1, 2, 1}, {2, 1, 3}};
        int n = 2;
        int k = 2;

        // When
        int result = sut.networkDelayTime(times, n, k);

        // Then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void test5() throws Exception {
        // Given
        int[][] times = {{4, 2, 76}, {1, 3, 79}, {3, 1, 81}, {4, 3, 30}, {2, 1, 47}, {1, 5, 61}, {1, 4, 99}, {3, 4, 68}, {3, 5, 46}, {4, 1, 6}, {5, 4, 7}, {5, 3, 44}, {4, 5, 19}, {2, 3, 13}, {3, 2, 18}, {1, 2, 0}, {5, 1, 25}, {2, 5, 58}, {2, 4, 77}, {5, 2, 74}};
        int n = 5;
        int k = 3;

        // When
        int result = sut.networkDelayTime(times, n, k);

        // Then
        assertThat(result).isEqualTo(59);
    }
}