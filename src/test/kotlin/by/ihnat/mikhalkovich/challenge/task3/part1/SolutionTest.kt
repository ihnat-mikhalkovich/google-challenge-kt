package by.ihnat.mikhalkovich.challenge.task3.part1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `positive case 1`() {
        // given
        val x = "2"
        val y = "1"
        val expected = "1"

        // when
        val result = Solution.solution(x, y)

        //then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 2`() {
        // given
        val x = "4"
        val y = "7"
        val expected = "4"

        // when
        val result = Solution.solution(x, y)

        //then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 3`() {
        // given
        val x = "3"
        val y = "5"
        val expected = "3"

        // when
        val result = Solution.solution(x, y)

        //then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 4`() {
        // given
        val x = "5270"
        val y = "357"
        val expected = "3"

        // when
        val result = Solution.solution(x, y)

        //then
        assertEquals(expected, result)
    }

    @Test
    fun `negative case 1`() {
        // given
        val x = "4"
        val y = "4"
        val expected = "impossible"

        // when
        val result = Solution.solution(x, y)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `negative case 2`() {
        // given
        val x = "2"
        val y = "4"
        val expected = "impossible"

        // when
        val result = Solution.solution(x, y)

        // then
        assertEquals(expected, result)
    }

}