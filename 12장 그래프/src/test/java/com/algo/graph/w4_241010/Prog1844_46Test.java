package com.algo.graph.w4_241010;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Prog1844_46Test {
    @Test
    void test() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(11);
    }

    @Test
    void test2() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test3() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 1, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 1, 1, 1, 1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(9);
    }

    @Test
    void test4() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(9);
    }

    @Test
    void test5() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 0, 1, 1, 1}, {0, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 0, 0}, {1, 1, 1, 0, 1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test6() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 0, 1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test7() throws Exception {
        // Given
        int[][] maps = new int[][]{{1}, {0}, {1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test8() throws Exception {
        // Given
        int[][] maps = new int[][]{{1, 1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test9() throws Exception {
        // Given
        int[][] maps = new int[][]{{1}, {1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(2);
    }

    @DisplayName("중간에 길이 끊긴 경우")
    @Test
    void test10() throws Exception {
        // Given
        int[][] maps = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};
        Prog1844_46 solution = new Prog1844_46();

        // When
        int result = solution.solution(maps);

        // Then
        assertThat(result).isEqualTo(-1);
    }
}