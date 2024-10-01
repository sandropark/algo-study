package com.algo.graph.w3_241003.leetcode_78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(Collections.emptyList());
        for (int num : nums) result.add(Collections.singletonList(num));
        dfs(nums, new LinkedList<>(), result);
        return result;
    }

    private void dfs(int[] nums, LinkedList<Integer> path, List<List<Integer>> result) {
    }
}
