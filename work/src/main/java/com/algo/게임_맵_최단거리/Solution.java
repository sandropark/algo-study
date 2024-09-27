package com.algo.게임_맵_최단거리;

import java.util.LinkedList;

public class Solution {
    // 상하좌우
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int n = maps.length, m = maps[0].length;

        // n,m의 위와 왼쪽이 막혀있는 경우
        if (n > 2 && m > 2 && maps[n - 2][m - 1] == 0 && maps[n - 1][m - 2] == 0) return -1;

        if (bfs(maps))
            return maps[n - 1][m - 1];
        return -1;
    }

    private static boolean bfs(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        int x = 0, y = 0;
        LinkedList<Coor> q = new LinkedList<>();
        q.add(new Coor(x, y));

        while (!q.isEmpty()) {
            Coor temp = q.removeFirst();
            int tempScore = maps[temp.x][temp.y];
            if (temp.x == n - 1 && temp.y == m - 1) // 마지막에 도달한 경우
                return true;
            for (int i = 0; i < 4; i++) {
                int newX = temp.x + dx[i];
                int newY = temp.y + dy[i];
                if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                    int tempV = maps[newX][newY];
                    if (tempV != 1) continue;
                    maps[newX][newY] += tempScore;
                    q.add(new Coor(newX, newY));
                }
            }
        }
        return false;   // 마지막에 도달하지 못한 경우
    }

    record Coor(int x, int y) {
    }
}
