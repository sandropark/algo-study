package com.algo.graph;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77_조합 {
    // n = 범위의 마지막 숫자 (1 ~ n)
    // k = 조합할 숫자의 개수
    public static List<List<Integer>> solution(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(n, k, 1, new int[k], result);
        return result;
    }

    private static void dfs(int n, int k, int start, int[] path, List<List<Integer>> result) {
        if (k == 0) {
            extracted(path, result);
            return;
        }

        for (int i = start; i <= n; i++) {
            // k는 1씩 감소하기 때문에 path[0]부터 k까지 숫자를 채워넣는다.
            path[path.length - k] = i;
            dfs(n, k - 1, i + 1, path, result);
        }
    }

    private static void extracted(int[] path, List<List<Integer>> result) {
        List<Integer> list = new ArrayList<>(path.length);
        for (int e : path)
            list.add(e);
        result.add(list);
    }
}
