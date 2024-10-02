package com.algo.graph.w3_241003.leetcode207;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 코스일정
 */
public class LeetCode207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = makeGraph(prerequisites);

        for (Integer finish : graph.keySet())
            if (!dfs(graph, finish, new ArrayList<>()))
                return false;
        return true;
    }

    boolean dfs(Map<Integer, List<Integer>> graph, Integer finish, List<Integer> takes) {
        if (takes.contains(finish)) return false;

        if (graph.containsKey(finish)) {
            takes.add(finish);
            for (Integer take : graph.get(finish))
                if (!dfs(graph, take, takes))
                    return false;
            takes.remove(finish);
        }
        return true;
    }

    private static Map<Integer, List<Integer>> makeGraph(int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            int from = prerequisite[0];
            int to = prerequisite[1];
            List<Integer> nodes = graph.get(from);
            if (nodes == null)
                graph.put(from, new ArrayList<>(List.of(to)));
            else
                nodes.add(to);
        }
        return graph;
    }
}
