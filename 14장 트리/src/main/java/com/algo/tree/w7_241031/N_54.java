package com.algo.tree.w7_241031;

import java.util.*;

/*
310. 최소 높이 트리

Constraints:
-  1 <= n <= 2 * 10^4
-  edges.length == n - 1
-  0 <= ai, bi < n
-  ai != bi
-  All the pairs (ai, bi) are distinct.
-  The given input is guaranteed to be a tree and there will be no repeated edges.

시간 복잡도
- O(N)

 */
public class N_54 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1)
            return Collections.singletonList(0);

        Map<Integer, List<Integer>> graph = makeGraph(edges);  // O(N)

        List<Integer> leaves = new ArrayList<>();

        // 리프 노드를 찾는다.  O(N)
        for (int i = 0; i < n; i++)
            if (graph.get(i).size() == 1)
                leaves.add(i);

        // 리프 노드가 2개 이하가 될 때까지 반복한다. O(N)
        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (Integer leaf : leaves) {
                int neighbor = graph.get(leaf).get(0);
                graph.get(neighbor).remove(leaf);
                if (graph.get(neighbor).size() == 1)
                    newLeaves.add(neighbor);
            }
            leaves = newLeaves;
        }

        return leaves;
    }

    private static Map<Integer, List<Integer>> makeGraph(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            graph.putIfAbsent(a, new ArrayList<>());
            graph.putIfAbsent(b, new ArrayList<>());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        return graph;
    }
}
