package by.ihnat.mikhalkovich.challenge.task3.part2

import org.junit.jupiter.api.Test
import kotlin.math.exp
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `positive case 1`() {
        // given
        val map = arrayOf(
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 0, 0, 1),
            intArrayOf(1, 1, 0, 0),
            intArrayOf(1, 1, 1, 0)
        )
        val expected = 7

        // when
        val result = Solution.solution(map)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 2`() {
        // given
        val map = arrayOf(
            intArrayOf(0, 0, 0, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1, 0),
            intArrayOf(0, 0, 0, 0, 0, 0),
            intArrayOf(0, 1, 1, 1, 1, 1),
            intArrayOf(0, 1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 0, 0)
        )
        val expected = 11

        // when
        val result = Solution.solution(map)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 3`() {
        // given
        val map = arrayOf(
            intArrayOf(0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
            intArrayOf(1, 0, 0, 0, 0, 1, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 1, 1, 1, 0, 0, 1, 1),
            intArrayOf(0, 1, 0, 0, 0, 1, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 1, 1, 1, 0, 1, 0),
            intArrayOf(0, 0, 1, 1, 1, 0, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 1, 0, 0, 1, 0, 0, 0),
            intArrayOf(1, 1, 0, 1, 0, 0, 1, 1, 1, 0),
            intArrayOf(0, 1, 0, 0, 0, 0, 1, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 0, 0, 1, 0, 0, 0)
        )
        val expected = 19

        // when
        val result = Solution.solution(map)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 4`() {
        // given
        val map = arrayOf(
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0)
        )
        val expected = 40

        // when
        val result = Solution.solution(map)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 5`() {
        // given
        val map = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 0)
        )
        val expected = 3

        // when
        val result = Solution.solution(map)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 6`() {
        // given
        val map = arrayOf(
            intArrayOf(0, 0, 0, 1, 0, 0, 0, 0, 0, 0),
            intArrayOf(0, 1, 0, 1, 0, 1, 1, 1, 1, 0),
            intArrayOf(1, 1, 0, 1, 0, 0, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 1, 1, 1, 0, 1, 0),
            intArrayOf(1, 1, 1, 0, 1, 0, 1, 0, 1, 0),
            intArrayOf(0, 0, 1, 0, 1, 0, 1, 0, 1, 0),
            intArrayOf(1, 0, 1, 0, 1, 0, 1, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 1, 0),
            intArrayOf(1, 1, 1, 1, 1, 0, 1, 1, 1, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 1, 0, 0, 0)
        )
        val expected = 19

        // when
        val result = Solution.solution(map)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 7`() {
        // given
        val map = arrayOf(
            intArrayOf(0, 0, 0, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1, 0),
            intArrayOf(0, 0, 0, 0, 0, 0),
            intArrayOf(0, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 0, 0)
        )
        val expected = 21

        // when
        val result = Solution.solution(map)

        // then
        assertEquals(expected, result)
    }
}

/*
        final Queue<Integer[]> backPropagationRoots = new ArrayDeque<>();

        while (!thinWalls.isEmpty()) {
            final Integer[] wall = thinWalls.poll();
            final int x = wall[0];
            final int y = wall[1];
            final int score = wall[2];
            backPropagationRoots.offer(new Integer[]{n - 1, m - 1});

            while (!backPropagationRoots.isEmpty()) {
                final Integer[] position = backPropagationRoots.poll();
                final int posX = position[0];
                final int posY = position[1];

                if (x == posX && y == posY) {
                    final int reduction = wall[2] - wall[3];
                    if (reduction > pathReduction) {
                        pathReduction = reduction;
                    }
                    backPropagationRoots.clear();
                    break;
                }
            }
        }
 */

/*
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
        roots.offer(new Integer[]{0, 0, 0});

        final Queue<Integer[]> thinWalls = new ArrayDeque<>();

        path[0][0] = 1;

        int pathReduction = 0;

        while (!roots.isEmpty()) {
            final Integer[] position = roots.poll();
            final int x = position[0];
            final int y = position[1];
            int reduction = position[2];

            // --- check deadEnd

            final boolean checkLeft = x - 1 >= 0 && path[x - 1][y] == 0 && map[x - 1][y] == 0;
            final boolean checkRight = x + 1 < map.length && path[x + 1][y] == 0 && map[x + 1][y] == 0;
            final boolean checkButton = y - 1 >= 0 && path[x][y - 1] == 0 && map[x][y - 1] == 0;
            final boolean checkTop = y + 1 < map[x].length && path[x][y + 1] == 0 && map[x][y + 1] == 0;

            boolean deadEnd = !(checkLeft || checkRight || checkButton || checkTop);

            if (deadEnd) {
                continue;
            }

            if (x == n - 1 && y == m - 1) {
                pathReduction = reduction;
            }

            // --- get walls


            if (x - 2 >= 0 && map[x - 1][y] == 1 && ++walls[x - 1][y] > 1 && path[x - 2][y] != 0) {
//                    thinWalls.offer(new Integer[]{x - 1, y, path[x][y], path[x - 2][y]});
                thinWalls.offer(new Integer[]{x, y, path[x][y], path[x - 2][y]});
                final int r = path[x][y] - path[x - 2][y];
                reduction = Math.max(r, reduction);
            }

            if (x + 2 < n && map[x + 1][y] == 1 && ++walls[x + 1][y] > 1 && path[x + 2][y] != 0) {
//                    thinWalls.offer(new Integer[]{x + 1, y, path[x][y], path[x + 2][y]});
                thinWalls.offer(new Integer[]{x, y, path[x][y], path[x + 2][y]});
                final int r = path[x][y] - path[x + 2][y];
                reduction = Math.max(r, reduction);
            }

            if (y - 2 >= 0 && map[x][y - 1] == 1 && ++walls[x][y - 1] > 1 && path[x][y - 2] != 0) {
//                    thinWalls.offer(new Integer[]{x, y - 1, path[x][y], path[x][y - 2]});
                thinWalls.offer(new Integer[]{x, y, path[x][y], path[x][y - 2]});
                final int r = path[x][y] - path[x][y - 2];
                reduction = Math.max(r, reduction);
            }

            if (y + 2 < m && map[x][y + 1] == 1 && ++walls[x][y + 1] > 1 && path[x][y + 2] != 0) {
//                    thinWalls.offer(new Integer[]{x, y + 1, path[x][y], path[x][y + 2]});
                thinWalls.offer(new Integer[]{x, y, path[x][y], path[x][y + 2]});
                final int r = path[x][y] - path[x][y + 2];
                reduction = Math.max(r, reduction);
            }

            // -- make path


            if (checkLeft) {
                path[x - 1][y] = path[x][y] + 1;
                roots.offer(new Integer[]{x - 1, y, reduction});
            }

            if (checkRight) {
                path[x + 1][y] = path[x][y] + 1;
                roots.offer(new Integer[]{x + 1, y, reduction});
            }

            if (checkButton) {
                path[x][y - 1] = path[x][y] + 1;
                roots.offer(new Integer[]{x, y - 1, reduction});
            }

            if (checkTop) {
                path[x][y + 1] = path[x][y] + 1;
                roots.offer(new Integer[]{x, y + 1, reduction});
            }
        }


        return (path[n - 1][m - 1] == minimalPath) ? path[n - 1][m - 1] : path[n - 1][m - 1] - pathReduction + 2;
    }
}
 */

/*
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

        int pathReduction = 0;

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

            if (deadEnd) {
                continue;
            }

            if (x - 2 >= 0 && map[x - 1][y] == 1 && ++walls[x - 1][y] > 1 && path[x - 2][y] != 0) {
                //                    thinWalls.offer(new Integer[]{x - 1, y, path[x][y], path[x - 2][y]});
                thinWalls.offer(new Integer[]{x, y, path[x][y], path[x - 2][y]});
            }

            if (x + 2 < n && map[x + 1][y] == 1 && ++walls[x + 1][y] > 1 && path[x + 2][y] != 0) {
                //                    thinWalls.offer(new Integer[]{x + 1, y, path[x][y], path[x + 2][y]});
                thinWalls.offer(new Integer[]{x, y, path[x][y], path[x + 2][y]});
            }

            if (y - 2 >= 0 && map[x][y - 1] == 1 && ++walls[x][y - 1] > 1 && path[x][y - 2] != 0) {
                //                    thinWalls.offer(new Integer[]{x, y - 1, path[x][y], path[x][y - 2]});
                thinWalls.offer(new Integer[]{x, y, path[x][y], path[x][y - 2]});
            }

            if (y + 2 < m && map[x][y + 1] == 1 && ++walls[x][y + 1] > 1 && path[x][y + 2] != 0) {
                //                    thinWalls.offer(new Integer[]{x, y + 1, path[x][y], path[x][y + 2]});
                thinWalls.offer(new Integer[]{x, y, path[x][y], path[x][y + 2]});
            }
        }


        return (path[n - 1][m - 1] == minimalPath) ? path[n - 1][m - 1] : path[n - 1][m - 1] - pathReduction;
    }
}
 */