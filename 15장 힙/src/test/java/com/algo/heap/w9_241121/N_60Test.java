package com.algo.heap.w9_241121;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class N_60Test {
    N_60 sut = new N_60();

    @MethodSource
    @ParameterizedTest
    void test(int[] nums, int k, int expected) throws Exception {
        // Given

        // When
        int result = sut.findKthLargest(nums, k);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 1, 5, 6, 4}, 2, 5),
                Arguments.of(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4, 4)
        );
    }
}