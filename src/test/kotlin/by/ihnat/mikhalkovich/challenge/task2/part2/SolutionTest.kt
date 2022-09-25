package by.ihnat.mikhalkovich.challenge.task2.part2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `positive case 1`() {
        // given
        val l = intArrayOf(3, 1, 4, 1)
        val expected = 4311

        // when
        val result = Solution.solution(l)

        // then
        assertEquals(expected, result)

    }

    @Test
    fun `positive 2`() {
        // given
        val l = intArrayOf(3, 1, 4, 1, 5, 9)
        val expected = 94311

        // when
        val result = Solution.solution(l)

        // then
        assertEquals(expected, result)

    }

    @Test
    fun `positive 3`() {
        // given
        val l = intArrayOf(1, 4, 3)
        val expected = 3

        // when
        val result = Solution.solution(l)

        // then
        assertEquals(expected, result)
    }

//    @Test
//    fun `zeros`() {
//        // given
//        val l = intArrayOf(1, 4, 3)
//        val expected = 3
//
//        // when
//        val result = Solution.solution(l)
//
//        // then
//        assertEquals(expected, result)
//    }

    @Test
    fun `we don't have combination that divisible '3'`() {
        // given
        val l = intArrayOf(1, 1)
        val expected = 0

        // when
        val result = Solution.solution(l)

        // then
        assertEquals(expected, result)

    }

}