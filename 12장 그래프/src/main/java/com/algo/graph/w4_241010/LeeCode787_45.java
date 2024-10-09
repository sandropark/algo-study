package com.algo.graph.w4_241010;

import java.util.*;

public class LeeCode787_45 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        boolean hasFlightToDst = false;
        HashMap<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] f : flights) {
            if (f[1] == dst) hasFlightToDst = true;
            graph.putIfAbsent(f[0], new ArrayList<>());
            graph.get(f[0]).add(f);
        }
        if (!hasFlightToDst) return -1;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(flight -> flight[1]));
        pq.offer(new int[]{src, 0, 0});

        while (!pq.isEmpty()) {
            int[] flight = pq.poll();
            int from = flight[0];
            int price = flight[1];
            int visitCount = flight[2];

            if (from == dst) return price;

            if (visitCount <= k) {
                if (graph.containsKey(from)) {
                    for (int[] route : graph.get(from)) {
                        int newPrice = price + route[2];
                        pq.offer(new int[]{route[1], newPrice, visitCount + 1});
                    }
                }
            }
        }
        return -1;
    }
}
