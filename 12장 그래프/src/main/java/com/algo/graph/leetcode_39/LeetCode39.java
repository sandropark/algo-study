package com.algo.graph.leetcode_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void dfs(int[] candidates, int target, int index, List<Integer> path, List<List<Integer>> result) {
        int reduced = path.parallelStream().reduce(0, Integer::sum);

        if (reduced == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (reduced > target) return;

        for (int i = 0; i < candidates.length; i++) {
            path.add(index, candidates[i]);
            int[] newCandidates = Arrays.copyOfRange(candidates, i, candidates.length);
            dfs(newCandidates, target, index + 1, path, result);
            path.remove(index);
        }
    }
}
