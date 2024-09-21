package com.algo.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode46_순열 {
    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(Arrays.stream(nums).boxed().toList(), 0, new int[nums.length], result);
        return result;
    }

    static void dfs(List<Integer> numList, int index, int[] arr, List<List<Integer>> result) {
        if (arr.length == index) {
            result.add(Arrays.stream(arr).boxed().toList());
            return;
        }

        for (int num : numList) {
            List<Integer> nextEs = new ArrayList<>(numList);
            nextEs.remove(Integer.valueOf(num));
            arr[index] = num;
            dfs(nextEs, index + 1, arr, result);
        }
    }
}
