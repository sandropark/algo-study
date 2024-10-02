package com.algo.graph.w3_241003.leetcode_78;

import java.util.*;

/**
 * 부분집합
 */
public class LeetCode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0, new ArrayDeque<>(), result);
        return result;
    }

    private void dfs(int[] nums, int index, Deque<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, i + 1, path, result);
            path.removeLast();
        }
    }
}
