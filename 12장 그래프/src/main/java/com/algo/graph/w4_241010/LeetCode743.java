package com.algo.graph.w4_241010;

import java.util.*;

public class LeetCode743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = makeGraph(n, times);
        int[] costs = initCosts(n, k);
        dfs(graph, costs, graph.get(k), k);
        return findMax(costs);
    }

    private static void dfs(Map<Integer, List<int[]>> graph, int[] costs, List<int[]> nextEdges, int start) {
        if (nextEdges == null) return;
        for (int[] edge : nextEdges) {
            int end = edge[1];
            int cost = edge[2];
            if (costs[end - 1] == -1 || costs[end - 1] > costs[start - 1] + cost) {
                costs[end - 1] = costs[start - 1] + cost;
                dfs(graph, costs, graph.get(end), end);
            }
        }
    }

    private static int[] initCosts(int n, int k) {
        int[] costs = new int[n];
        Arrays.fill(costs, -1);
        costs[k - 1] = 0;
        return costs;
    }

    private static int findMax(int[] costs) {
        int max = 0;
        for (int i : costs) {
            if (i == -1) return -1;
            max = Math.max(max, i);
        }
        return max;
    }

    private static HashMap<Integer, List<int[]>> makeGraph(int n, int[][] times) {
        HashMap<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++)
            graph.put(i, new ArrayList<>());
        for (int[] time : times)
            graph.get(time[0]).add(time);
        return graph;
    }
}
