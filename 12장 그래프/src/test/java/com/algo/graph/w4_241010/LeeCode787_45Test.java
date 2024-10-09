package com.algo.graph.w4_241010;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeeCode787_45Test {
    static final LeeCode787_45 sut = new LeeCode787_45();

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

    @Test
    void test5() throws Exception {
        // Given
        int[][] flights = {{11, 12, 74}, {1, 8, 91}, {4, 6, 13}, {7, 6, 39}, {5, 12, 8}, {0, 12, 54}, {8, 4, 32}, {0, 11, 4}, {4, 0, 91}, {11, 7, 64}, {6, 3, 88}, {8, 5, 80}, {11, 10, 91},
                {10, 0, 60}, {8, 7, 92}, {12, 6, 78}, {6, 2, 8}, {4, 3, 54}, {3, 11, 76}, {3, 12, 23}, {11, 6, 79}, {6, 12, 36}, {2, 11, 100}, {2, 5, 49}, {7, 0, 17},
                {5, 8, 95}, {3, 9, 98}, {8, 10, 61}, {2, 12, 38}, {5, 7, 58}, {9, 4, 37}, {8, 6, 79}, {9, 0, 1}, {2, 3, 12}, {7, 10, 7}, {12, 10, 52}, {7, 2, 68}, {12, 2, 100}, {6, 9, 53}, {7, 4, 90},
                {0, 5, 43}, {11, 2, 52}, {11, 8, 50}, {12, 4, 38}, {7, 9, 94}, {2, 7, 38}, {3, 7, 88}, {9, 12, 20}, {12, 0, 26}, {10, 5, 38}, {12, 8, 50}, {0, 2, 77}, {11, 0, 13}, {9, 10, 76},
                {2, 6, 67}, {5, 6, 34}, {9, 7, 62}, {5, 3, 67}};

        // When
        int result = sut.findCheapestPrice(10, flights, 10, 1, 10);

        // Then
        assertThat(result).isEqualTo(-1);
    }
}