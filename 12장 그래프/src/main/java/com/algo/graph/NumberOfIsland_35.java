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

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    stack.add(new Location(i, j));
                    grid[i][j] = 'v';
                    count++;
                    while (!stack.isEmpty()) {
                        Location temp = stack.pop();

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
