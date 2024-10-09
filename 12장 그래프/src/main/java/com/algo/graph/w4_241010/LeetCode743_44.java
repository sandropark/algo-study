package com.algo.graph.w4_241010;

import java.util.*;

public class LeetCode743_44 {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = makeGraph(n, times);
        Queue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{k, 0});

        int[] costs = initCosts(n);

        while (!pq.isEmpty()) {
            int[] node = pq.poll();
            int to = node[0];
            int cost = node[1];
            if (costs[to - 1] == -1) {
                costs[to - 1] = cost;
                if (graph.containsKey(to)) {
                    for (int[] edge : graph.get(to)) {
                        int newCost = cost + edge[2];
                        pq.offer(new int[]{edge[1], newCost});
                    }
                }
            }
        }
        return findMax(costs);
    }

    private static int[] initCosts(int n) {
        int[] costs = new int[n];
        Arrays.fill(costs, -1);
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
        for (int[] time : times) {
            graph.putIfAbsent(time[0], new ArrayList<>());
            graph.get(time[0]).add(time);
        }
        return graph;
    }
}
