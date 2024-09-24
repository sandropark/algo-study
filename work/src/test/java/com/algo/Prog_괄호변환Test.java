package com.algo;

import org.junit.jupiter.api.Test;

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
}