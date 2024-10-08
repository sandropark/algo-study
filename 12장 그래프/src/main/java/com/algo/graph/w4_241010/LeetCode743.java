package com.algo.graph.w4_241010;

import java.util.*;

public class LeetCode743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = makeGraph(n, times);
        int[] costs = initCosts(n, k);
        dfs(graph, costs, k);
        return findMax(costs);
    }

    private static void dfs(Map<Integer, List<int[]>> graph, int[] costs, int from) {
        List<int[]> nextEdges = graph.get(from);
        if (nextEdges.isEmpty()) return;
        for (int[] edge : nextEdges) {
            int to = edge[1];
            int cost = edge[2];
            if (costs[to - 1] == -1 || costs[to - 1] > costs[from - 1] + cost) {
                costs[to - 1] = costs[from - 1] + cost;
                dfs(graph, costs, to);
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
