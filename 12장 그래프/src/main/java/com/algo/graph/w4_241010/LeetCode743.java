package com.algo.graph.w4_241010;

import java.util.*;

public class LeetCode743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] result = initResultList(n, k);
        Map<Integer, List<int[]>> graph = makeGraph(times);
        Queue<int[]> q = new ArrayDeque<>();

        List<int[]> nodes = graph.get(k);
        if (nodes != null)
            q.addAll(nodes);

        while (!q.isEmpty()) {
            int[] v = q.poll();
            int dest = v[1];
            int cost = v[2];

            int pastCost = result[dest];
            result[dest] = pastCost == -1 ? cost : Math.min(pastCost, cost);

            nodes = graph.get(dest);
            if (nodes != null && !nodes.isEmpty()) {
                nodes.forEach(ints -> ints[2] += cost);
                q.addAll(nodes);
                nodes.clear();
            }
        }

        if (!allVisited(result)) return -1;

        return getResult(result);
    }

    private static int getResult(int[] resultList) {
        int result = 0;
        for (int cost : resultList) result = Math.max(result, cost);
        return result;
    }

    private static int[] initResultList(int n, int k) {
        int[] resultList = new int[n + 1];
        Arrays.fill(resultList, -1);
        resultList[k] = 0;
        resultList[0] = 0;
        return resultList;
    }

    private boolean allVisited(int[] visited) {
        for (int i : visited) if (i == -1) return false;
        return true;
    }

    private static HashMap<Integer, List<int[]>> makeGraph(int[][] times) {
        HashMap<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times)
            Optional.ofNullable(graph.get(time[0]))
                    .ifPresentOrElse(values -> values.add(time),
                            () -> graph.put(time[0], new ArrayList<>(Arrays.asList(time))));
        return graph;
    }
}
