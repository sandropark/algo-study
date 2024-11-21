package com.algo.heap.w9_241121;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class N_61Test {
    N_61 sut = new N_61();

    @MethodSource
    @ParameterizedTest
    void test(String[] operations, int[] expected) throws Exception {
        // Given
        // When
        int[] result = sut.solution(operations);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "I 333", "I 8", "I 7", "D -1"}, new int[]{333, -45}),
                Arguments.of(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}, new int[]{0, 0}),
                Arguments.of(new String[]{"I 10", "I 20", "D 1", "I 30", "I 40", "D -1", "D -1"}, new int[]{40, 40})
        );
    }
}