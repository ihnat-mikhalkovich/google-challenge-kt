package by.ihnat.mikhalkovich.challenge.task3.part2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public static int solution(int[][] map) {
        final Maze maze = new Maze(map);
        return maze.solve();
    }

    public static class Maze {
        private final int[][] map;

        private final Queue<Integer[]> thinWalls;
        private final Queue<Integer[]> roots;
        private final int minimalPath;
        private final int n;
        private final int m;
        private final int[][] path;
        private final int[][] walls;
        private final int[][] backPath;

        public Maze(int[][] map) {
            this.map = map;

            this.n = map.length;
            this.m = map[0].length;
            this.minimalPath = n + m - 1;
            this.thinWalls = new ArrayDeque<>();
            this.roots = new ArrayDeque<>();

            this.path = new int[n][m];
            this.walls = new int[n][m];
            this.backPath = new int[n][m];
        }

        public int solve() {
            makePath();

            if (path[n - 1][m - 1] == minimalPath) {
                return minimalPath;
            }

            makeBackPath();

            return calculateMinPathLengthFromThinWalls();
        }

        private int calculateMinPathLengthFromThinWalls() {
            int shortPathLength = n * m;
            for (Integer[] wall : thinWalls) {
                final int x1 = wall[0];
                final int y1 = wall[1];
                final int x2 = wall[2];
                final int y2 = wall[3];
                if (backPath[x1][y1] == 0) {
                    continue;
                }
                final int pathLength = path[x2][y2] + backPath[x1][y1] + 1;
                if (pathLength < shortPathLength) {
                    shortPathLength = pathLength;
                }
            }
            return shortPathLength;
        }

        private void makePath() {
            roots.offer(new Integer[]{0, 0});
            path[0][0] = 1;
            makeMarkup(path);
        }

        private void makeBackPath() {
            roots.offer(new Integer[]{n - 1, m - 1});
            backPath[n - 1][m - 1] = 1;
            makeMarkup(backPath);
        }

        private void makeMarkup(int[][] pathMap) {
            while (!roots.isEmpty()) {
                final Integer[] position = roots.poll();
                final int x = position[0];
                final int y = position[1];

                // --- make the pathMap
                if (x - 1 >= 0 && pathMap[x - 1][y] == 0 && map[x - 1][y] == 0) {
                    pathMap[x - 1][y] = pathMap[x][y] + 1;
                    roots.offer(new Integer[]{x - 1, y});
                }

                if (x + 1 < map.length && pathMap[x + 1][y] == 0 && map[x + 1][y] == 0) {
                    pathMap[x + 1][y] = pathMap[x][y] + 1;
                    roots.offer(new Integer[]{x + 1, y});
                }

                if (y - 1 >= 0 && pathMap[x][y - 1] == 0 && map[x][y - 1] == 0) {
                    pathMap[x][y - 1] = pathMap[x][y] + 1;
                    roots.offer(new Integer[]{x, y - 1});
                }

                if (y + 1 < map[x].length && pathMap[x][y + 1] == 0 && map[x][y + 1] == 0) {
                    pathMap[x][y + 1] = pathMap[x][y] + 1;
                    roots.offer(new Integer[]{x, y + 1});
                }

                // --- get walls

                if (x - 2 >= 0 && map[x - 1][y] == 1 && ++walls[x - 1][y] > 1 && this.path[x - 2][y] != 0) {
                    thinWalls.offer(new Integer[]{x, y, x - 2, y});
                }

                if (x + 2 < n && map[x + 1][y] == 1 && ++walls[x + 1][y] > 1 && this.path[x + 2][y] != 0) {
                    thinWalls.offer(new Integer[]{x, y, x + 2, y});
                }

                if (y - 2 >= 0 && map[x][y - 1] == 1 && ++walls[x][y - 1] > 1 && this.path[x][y - 2] != 0) {
                    thinWalls.offer(new Integer[]{x, y, x, y - 2});
                }

                if (y + 2 < m && map[x][y + 1] == 1 && ++walls[x][y + 1] > 1 && this.path[x][y + 2] != 0) {
                    thinWalls.offer(new Integer[]{x, y, x, y + 2});
                }
            }

        }


    }
}
