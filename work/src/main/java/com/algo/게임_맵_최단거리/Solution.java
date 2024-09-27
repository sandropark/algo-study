package com.algo.게임_맵_최단거리;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    // 상하좌우
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        if (isBlocked(maps)) return -1;

        return bfs(maps)
                ? maps[maps.length - 1][maps[0].length - 1]
                : -1;
    }

    private static boolean isBlocked(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        // 3X3 이상이고 n,m의 위와 왼쪽이 막혀있는 경우
        return n > 2 && m > 2 && maps[n - 2][m - 1] == 0 && maps[n - 1][m - 2] == 0;
    }

    private static boolean bfs(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        int x = 0, y = 0;
        Deque<Coordinates> q = new ArrayDeque<>();
        q.add(new Coordinates(x, y));

        while (!q.isEmpty()) {
            Coordinates tempC = q.poll();
            if (tempC.x == n - 1 && tempC.y == m - 1) // 마지막에 도달한 경우
                return true;
            int tempScore = maps[tempC.x][tempC.y];
            for (int i = 0; i < 4; i++) {
                int newX = tempC.x + dx[i];
                int newY = tempC.y + dy[i];
                if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                    if (maps[newX][newY] != 1) continue;
                    maps[newX][newY] += tempScore;
                    q.add(new Coordinates(newX, newY));
                }
            }
        }
        return false;   // 마지막에 도달하지 못한 경우
    }

    record Coordinates(int x, int y) {
    }
}
