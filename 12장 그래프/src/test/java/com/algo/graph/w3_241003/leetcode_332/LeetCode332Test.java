package com.algo.graph.w3_241003.leetcode_332;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode332Test {
    @Test
    void test() throws Exception {
        // Given
        List<List<String>> tickets = List.of(
                List.of("MUC", "LHR"),
                List.of("JFK", "MUC"),
                List.of("SFO", "SJC"),
                List.of("LHR", "SFO")
        );
        LeetCode332 sut = new LeetCode332();

        // When
        List<String> result = sut.findItinerary(tickets);

        // Then
        assertThat(result).containsExactly("JFK", "MUC", "LHR", "SFO", "SJC");
    }

    @Test
    void test2() throws Exception {
        // Given
        List<List<String>> tickets = List.of(
                List.of("JFK", "SFO"),
                List.of("JFK", "ATL"),
                List.of("SFO", "ATL"),
                List.of("ATL", "JFK"),
                List.of("ATL", "SFO")
        );
        LeetCode332 sut = new LeetCode332();

        // When
        List<String> result = sut.findItinerary(tickets);

        // Then
        assertThat(result).containsExactly("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
    }

    @Test
    void test3() throws Exception {
        // Given
        List<List<String>> tickets = List.of(
                List.of("JFK", "KUL"),
                List.of("JFK", "NRT"),
                List.of("NRT", "JFK")
        );
        LeetCode332 sut = new LeetCode332();

        // When
        List<String> result = sut.findItinerary(tickets);

        // Then
        assertThat(result).containsExactly("JFK", "NRT", "JFK", "KUL");
    }

    @Test
    void test4() throws Exception {
        // Given
        List<List<String>> tickets = List.of(
                List.of("EZE", "AXA"),
                List.of("TIA", "ANU"),
                List.of("ANU", "JFK"),
                List.of("JFK", "ANU"),
                List.of("ANU", "EZE"),
                List.of("TIA", "ANU"),
                List.of("AXA", "TIA"),
                List.of("TIA", "JFK"),
                List.of("ANU", "TIA"),
                List.of("JFK", "TIA")
        );
        LeetCode332 sut = new LeetCode332();

        // When
        List<String> result = sut.findItinerary(tickets);

        // Then
        assertThat(result).containsExactly("JFK", "ANU", "EZE", "AXA", "TIA", "ANU", "JFK", "TIA", "ANU", "TIA", "JFK");
    }

    @Test
    void test5() throws Exception {
        // Given
        List<List<String>> tickets = List.of(
                List.of("EZE", "HBA"),
                List.of("AXA", "TIA"),
                List.of("TIA", "AUA"),
                List.of("TIA", "ADL"),
                List.of("ADL", "EZE"),
                List.of("AUA", "AXA"),
                List.of("JFK", "TIA")
        );
        LeetCode332 sut = new LeetCode332();

        // When
        List<String> result = sut.findItinerary(tickets);

        // Then
        assertThat(result).containsExactly("JFK", "TIA", "AUA", "AXA", "TIA", "ADL", "EZE", "HBA");
    }
}