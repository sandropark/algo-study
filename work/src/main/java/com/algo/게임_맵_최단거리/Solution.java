package com.algo.게임_맵_최단거리;

import java.util.LinkedList;

public class Solution {
    // 상하좌우
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int n = maps.length, m = maps[0].length;

        // 행이 하나뿐인 경우
        if (n == 1 && m >= 3 && maps[0][m - 2] == 0) return -1;
        // 열이 하나뿐인 경우
        if (m == 1 && n >= 3 && maps[n - 2][0] == 0) return -1;
        // n,m의 위와 왼쪽이 막혀있는 경우
        if (n > 2 && m > 2 && maps[n - 2][m - 1] == 0 && maps[n - 1][m - 2] == 0) return -1;

        bfs(maps);

        return maps[n - 1][m - 1];
    }

    private static void bfs(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        int x = 0, y = 0;
        LinkedList<Coor> q = new LinkedList<>();
        q.add(new Coor(x, y));

        while (!q.isEmpty()) {
            Coor temp = q.removeFirst();
            int tempScore = maps[temp.x][temp.y];
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
    }

    record Coor(int x, int y) {
    }
}
