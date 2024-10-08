package com.algo.graph.w4_241010;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeeCode787_45Test {
    LeeCode787_45 sut = new LeeCode787_45();

    @Test
    void test() throws Exception {
        // Given
        int[][] flights = {{0, 1, 100}, {1, 2, 200}, {0, 2, 500}};

        // When
        int result = sut.findCheapestPrice(3, flights, 0, 2, 1);

        // Then
        assertThat(result).isEqualTo(300);
    }

    @Test
    void test2() throws Exception {
        // Given
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};

        // When
        int result = sut.findCheapestPrice(4, flights, 0, 3, 1);

        // Then
        assertThat(result).isEqualTo(700);
    }

    @Test
    void test3() throws Exception {
        // Given
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};

        // When
        int result = sut.findCheapestPrice(3, flights, 0, 2, 0);

        // Then
        assertThat(result).isEqualTo(500);
    }

    @Test
    void test4() throws Exception {
        // Given
        int[][] flights = {{0, 1, 5}, {1, 2, 5}, {0, 3, 2}, {3, 1, 2}, {1, 4, 1}, {4, 2, 1}};

        // When
        int result = sut.findCheapestPrice(5, flights, 0, 2, 2);

        // Then
        assertThat(result).isEqualTo(7);
    }
}