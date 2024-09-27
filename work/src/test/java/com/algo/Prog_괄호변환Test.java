package com.algo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Prog_괄호변환Test {

    @Test
    void test() throws Exception {
        // Given
        String p = "(()())()";

        // When
        String result = new Prog_괄호변환().solution(p);

        // Then
        assertThat(result).isEqualTo("(()())()");
    }

    @Test
    void test2() throws Exception {
        // Given
        String p = ")(";

        // When
        String result = new Prog_괄호변환().solution(p);

        // Then
        assertThat(result).isEqualTo("()");
    }

    @Test
    void test3() throws Exception {
        // Given
        String p = "()))((()";

        // When
        String result = new Prog_괄호변환().solution(p);

        // Then
        assertThat(result).isEqualTo("()(())()");
    }

    @Test
    void test4() throws Exception {
        // Given
        String p = "))((";

        // When
        String result = new Prog_괄호변환().solution(p);

        // Then
        assertThat(result).isEqualTo("()()");
    }

    @MethodSource
    @ParameterizedTest
    void processU(String input, String expected) throws Exception {
        String result = Prog_괄호변환.processU(input);

        assertThat(result).isEqualTo(expected);
    }

    public static Stream<Arguments> processU() {
        return Stream.of(
                Arguments.of(")(", ""),
                Arguments.of("))((", "()")
        );
    }

    @Test
    void test_kt() throws Exception {
        // Given
        String p = "(()())()";

        // When
        String result = Prog_괄호변환Kt.solution(p);

        // Then
        assertThat(result).isEqualTo("(()())()");
    }

    @Test
    void test2_kt() throws Exception {
        // Given
        String p = ")(";

        // When
        String result = Prog_괄호변환Kt.solution(p);

        // Then
        assertThat(result).isEqualTo("()");
    }

    @Test
    void test3_kt() throws Exception {
        // Given
        String p = "()))((()";

        // When
        String result = Prog_괄호변환Kt.solution(p);

        // Then
        assertThat(result).isEqualTo("()(())()");
    }
}