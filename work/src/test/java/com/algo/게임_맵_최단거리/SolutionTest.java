package com.algo.게임_맵_최단거리;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        Solution solution = new Solution();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(11);
    }

    @Test
    void test2() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        Solution solution = new Solution();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test3() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 1, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 1, 1, 1, 1}};
        Solution solution = new Solution();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(9);
    }

    @Test
    void test4() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        Solution solution = new Solution();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(9);
    }

    @Test
    void test5() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 0, 1, 1, 1}, {0, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 0, 0}, {1, 1, 1, 0, 1}};
        Solution solution = new Solution();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test6() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 0, 1}};
        Solution solution = new Solution();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test7() throws Exception {
        // Given
        int[][] maps = new int[][]{{1}, {0}, {1}};
        Solution solution = new Solution();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test8() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 1}};
        Solution solution = new Solution();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test9() throws Exception {
        // Given
        int[][] maps = new int[][]{{1}, {1}};
        Solution solution = new Solution();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(2);
    }

}