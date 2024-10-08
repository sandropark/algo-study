package com.algo.graph.w4_241010;

import java.util.*;

public class LeeCode787_45 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> graph = makeGraph(flights);
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
                    for (int[] nextFlight : graph.get(from)) {
                        int newPrice = price + nextFlight[2];
                        pq.offer(new int[]{nextFlight[1], newPrice, visitCount + 1});
                    }
                }
            }
        }

        return -1;
    }

    private Map<Integer, List<int[]>> makeGraph(int[][] flights) {
        HashMap<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new ArrayList<>());
            graph.get(flight[0]).add(flight);
        }
        return graph;
    }
}
