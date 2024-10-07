package com.algo.graph;

import com.algo.graph.w2_240926.Graph;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class GraphTest {
    Map<Integer, List<Integer>> graphMap = Map.of(
            1, List.of(2, 3, 4),
            2, List.of(5),
            3, List.of(5),
            4, List.of(),
            5, List.of(6, 7),
            6, List.of(),
            7, List.of(3)
    );

    Graph graph = new Graph(graphMap);

    @Test
    void dfsRecursive() throws Exception {
        List<Integer> result = new ArrayList<>();

        graph.dfsRecursive(1, result);

        assertThat(result).containsExactly(1, 2, 5, 6, 7, 3, 4);
    }

    @Test
    void dfsIterative() throws Exception {
        List<Integer> result = graph.dfsIterative(1);

        assertThat(result).containsExactly(1, 2, 5, 6, 7, 3, 4);
    }

    @Test
    void bfs() throws Exception {
        List<Integer> result = graph.bfs(1);

        assertThat(result).containsExactly(1, 4, 3, 5, 7, 6, 2);
    }
}