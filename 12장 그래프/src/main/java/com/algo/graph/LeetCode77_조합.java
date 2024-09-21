package com.algo.graph;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77_조합 {
    public static List<List<Integer>> solution(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(n, k, 1, path, result);
        return result;
    }

    private static void dfs(int n, int k, int start, List<Integer> path, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= n; i++) {
            path.add(i);
            dfs(n, k - 1, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}
