package by.ihnat.mikhalkovich.challenge.task2.part1

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFailsWith

class SolutionTest {

    @Test
    fun `positive case`() {
        // given
        val l = intArrayOf(4, 3, 5, 7, 8)
        val t = 12
        val expected = intArrayOf(0, 2)

        // when
        val result = Solution.solution(l, t)

        // then
        assertContentEquals(expected, result)
    }

    @Test
    fun `first elem case`() {
        // given
        val l = intArrayOf(4, 3, 5, 7, 8)
        val t = 4
        val expected = intArrayOf(0, 0)

        // when
        val result = Solution.solution(l, t)

        // then
        assertContentEquals(expected, result)
    }

    @Test
    fun `negative - first elem case`() {
        // given
        val l = intArrayOf(4)
        val t = 5
        val expected = intArrayOf(-1, -1)

        // when
        val result = Solution.solution(l, t)

        // then
        assertContentEquals(expected, result)
    }

    @Test
    fun `negative case`() {
        // given
        val l = intArrayOf(1, 2, 3, 4)
        val t = 15
        val expected = intArrayOf(-1, -1)

        // when
        val result = Solution.solution(l, t)

        // then
        assertContentEquals(expected, result)
    }

    @Test
    fun `edge case`() {
        // given
        val l = intArrayOf(100, 100, 50)
        val t = 250
        val expected = intArrayOf(0, 2)

        // when
        val result = Solution.solution(l, t)

        // then
        assertContentEquals(expected, result)
    }

    @Test
    fun `item in list more then 100`() {
        // given
        val l = intArrayOf(100, 101, 50)
        val t = 250

        // when
        assertFailsWith<java.lang.IllegalArgumentException> {
            Solution.solution(l, t)
        }
    }

    @Test
    fun `'t' is more then 250`() {
        // given
        val l = intArrayOf(100, 100, 50)
        val t = 251

        // when
        assertFailsWith<java.lang.IllegalArgumentException> {
            Solution.solution(l, t)
        }
    }

    @Test
    fun `'l' is null`() {
        // given
        val l = null
        val t = 250

        // when
        assertFailsWith<java.lang.IllegalArgumentException> {
            Solution.solution(l, t)
        }
    }

    @Test
    fun `length of 'l' is 0`() {
        // given
        val l = IntArray(0)
        val t = 250

        // when
        assertFailsWith<java.lang.IllegalArgumentException> {
            Solution.solution(l, t)
        }
    }

    @Test
    fun `length of 'l' is more then 100`() {
        // given
        val l = IntArray(101)
        val t = 250

        // when
        assertFailsWith<java.lang.IllegalArgumentException> {
            Solution.solution(l, t)
        }
    }

}

/*
    public static int[] solution(int[] l, int t) {
        validate(l, t);

        int start = 0;
        int end = 0;

        int acc = 0;

        for (int i = 0; acc < t && end <= i && i < l.length; i++) {
            acc = l[i];
            start = i;
            end = i;
            for (int j = i + 1; acc < t && acc < ACC_LIMIT && j < l.length; j++) {
                acc += l[j];
                if (acc == t) {
                    end = j;
                }
            }
        }

        if (acc == t) {
            return new int[]{start, end};
        } else {
            return new int[]{-1, -1};
        }
    }
 */