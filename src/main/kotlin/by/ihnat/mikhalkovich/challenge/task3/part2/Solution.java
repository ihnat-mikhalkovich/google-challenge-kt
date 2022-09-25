package by.ihnat.mikhalkovich.challenge.task3.part2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public static int solution(int[][] map) {
        final int n = map.length;
        final int m = map[0].length;

        final int[][] path = new int[n][m];
        final int[][] walls = new int[n][m];

        final int minimalPath = n + m - 1;

        final Queue<Integer[]> roots = new ArrayDeque<>();
        roots.offer(new Integer[]{0, 0});

        final Queue<Integer[]> thinWalls = new ArrayDeque<>();

        path[0][0] = 1;

        while (!roots.isEmpty()) {
            final Integer[] position = roots.poll();
            final int x = position[0];
            final int y = position[1];

            // --- make the path
            boolean deadEnd = true;
            if (x - 1 >= 0 && path[x - 1][y] == 0 && map[x - 1][y] == 0) {
                path[x - 1][y] = path[x][y] + 1;
                roots.offer(new Integer[]{x - 1, y});
                deadEnd = false;
            }

            if (x + 1 < map.length && path[x + 1][y] == 0 && map[x + 1][y] == 0) {
                path[x + 1][y] = path[x][y] + 1;
                roots.offer(new Integer[]{x + 1, y});
                deadEnd = false;
            }

            if (y - 1 >= 0 && path[x][y - 1] == 0 && map[x][y - 1] == 0) {
                path[x][y - 1] = path[x][y] + 1;
                roots.offer(new Integer[]{x, y - 1});
                deadEnd = false;
            }

            if (y + 1 < map[x].length && path[x][y + 1] == 0 && map[x][y + 1] == 0) {
                path[x][y + 1] = path[x][y] + 1;
                roots.offer(new Integer[]{x, y + 1});
                deadEnd = false;
            }

            // --- get walls

            if (x - 2 >= 0 && map[x - 1][y] == 1 && ++walls[x - 1][y] > 1 && path[x - 2][y] != 0) {
//                    thinWalls.offer(new Integer[]{x - 1, y, path[x][y], path[x - 2][y]});
//                thinWalls.offer(new Integer[]{x, y, path[x][y], path[x - 2][y]});
                thinWalls.offer(new Integer[]{x, y, x - 2,y});
            }

            if (x + 2 < n && map[x + 1][y] == 1 && ++walls[x + 1][y] > 1 && path[x + 2][y] != 0) {
//                    thinWalls.offer(new Integer[]{x + 1, y, path[x][y], path[x + 2][y]});
                thinWalls.offer(new Integer[]{x, y, x + 2, y});
            }

            if (y - 2 >= 0 && map[x][y - 1] == 1 && ++walls[x][y - 1] > 1 && path[x][y - 2] != 0) {
//                    thinWalls.offer(new Integer[]{x, y - 1, path[x][y], path[x][y - 2]});
                thinWalls.offer(new Integer[]{x, y, x, y - 2});
            }

            if (y + 2 < m && map[x][y + 1] == 1 && ++walls[x][y + 1] > 1 && path[x][y + 2] != 0) {
//                    thinWalls.offer(new Integer[]{x, y + 1, path[x][y], path[x][y + 2]});
                thinWalls.offer(new Integer[]{x, y, x, y + 2});
            }
        }

        if (path[n - 1][m - 1] == minimalPath) {
            return minimalPath;
        }

        roots.offer(new Integer[]{n - 1, m - 1});

        final int[][] backPath = new int[n][m];
        backPath[n - 1][m - 1] = 1;

        while (!roots.isEmpty()) {
            final Integer[] position = roots.poll();
            final int x = position[0];
            final int y = position[1];

            if (x - 1 >= 0 && backPath[x - 1][y] == 0 && map[x - 1][y] == 0) {
                backPath[x - 1][y] = backPath[x][y] + 1;
                roots.offer(new Integer[]{x - 1, y});
            }

            if (x + 1 < map.length && backPath[x + 1][y] == 0 && map[x + 1][y] == 0) {
                backPath[x + 1][y] = backPath[x][y] + 1;
                roots.offer(new Integer[]{x + 1, y});
            }

            if (y - 1 >= 0 && backPath[x][y - 1] == 0 && map[x][y - 1] == 0) {
                backPath[x][y - 1] = backPath[x][y] + 1;
                roots.offer(new Integer[]{x, y - 1});
            }

            if (y + 1 < map[x].length && backPath[x][y + 1] == 0 && map[x][y + 1] == 0) {
                backPath[x][y + 1] = backPath[x][y] + 1;
                roots.offer(new Integer[]{x, y + 1});
            }
        }

        int shortPathLength = n * m;
        for (Integer[] wall: thinWalls) {
            final int x1 = wall[0];
            final int y1 = wall[1];
            final int x2 = wall[2];
            final int y2 = wall[3];
            final int pathLength = path[x2][y2] + backPath[x1][y1] + 1;
            if (pathLength < shortPathLength) {
                shortPathLength = pathLength;
            }
        }


        return shortPathLength;
    }
}
