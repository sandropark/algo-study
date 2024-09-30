package com.algo.graph.leetcode_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), 0, result);
        return result;
    }

    private static void dfs(int[] candidates, int target, int index, List<Integer> path, int tempResult, List<List<Integer>> result) {
        if (tempResult == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            int tempResult1 = tempResult + candidates[i];
            if (tempResult1 > target) continue;
            path.add(index, candidates[i]);
            int[] newCandidates = Arrays.copyOfRange(candidates, i, candidates.length);
            dfs(newCandidates, target, index + 1, path, tempResult1, result);
            path.remove(index);
        }
    }
}
