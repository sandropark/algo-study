package com.algo.graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfIsland_35 {
    public static int solution(char[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        Deque<Location> stack = new ArrayDeque<>();

        int[] x = {0, 0, -1, 1};
        int[] y = {-1, 1, 0, 0};

        // 1. 그래프 전체를 순회
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 2. 섬('1')이면 stack에 넣고, 방문표시
                if (grid[i][j] == '1') {
                    stack.add(new Location(i, j));
                    grid[i][j] = 'v'; // 방문 표시
                    count++; // 섬 개수 증가

                    // 한 덩이의 섬을 찾을 때까지 반복.
                    while (!stack.isEmpty()) {
                        Location temp = stack.pop();

                        // 하나의 육지에서 동서남북으로 땅인지 확인해서 땅이면 stack에 넣는다.
                        for (int k = 0; k < 4; k++) {
                            int a = temp.x + x[k];
                            int b = temp.y + y[k];

                            if (a < 0 || a >= m || b < 0 || b >= n)
                                continue;
                            if (grid[a][b] == '1') {
                                stack.add(new Location(a, b));
                                grid[a][b] = 'v';
                            }
                        }
                    }
                }
            }
        }

        return count;
    }

    public static class Location {
        public int x;
        public int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
