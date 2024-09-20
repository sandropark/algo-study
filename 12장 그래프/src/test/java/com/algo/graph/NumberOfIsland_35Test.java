package com.algo.graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfIsland_35Test {
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
        int solution = NumberOfIsland_35.solution(grid1);

        assertThat(solution).isEqualTo(1);
    }

    @Test
    void test2() throws Exception {
        int solution = NumberOfIsland_35.solution(grid2);

        assertThat(solution).isEqualTo(3);
    }
}
