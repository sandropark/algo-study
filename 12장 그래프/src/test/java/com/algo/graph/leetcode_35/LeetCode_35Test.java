package com.algo.graph.leetcode_35;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeetCode_35Test {
    char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    };

    char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
    };

    @Test
    void test1() throws Exception {
        int result = LeetCode35.solution(grid1);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void test2() throws Exception {
        int result = LeetCode35.solution(grid2);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void testKt() throws Exception {
        int result = LeetCode35Kt.solution(grid1);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void testKt2() throws Exception {
        int result = LeetCode35Kt.solution(grid2);

        assertThat(result).isEqualTo(3);
    }
}
