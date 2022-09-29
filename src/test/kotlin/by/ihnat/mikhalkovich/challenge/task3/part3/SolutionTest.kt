package by.ihnat.mikhalkovich.challenge.task3.part3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `positive case 1`() {
        // given
        val x = "4"
        val expected = 2

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 2`() {
        // given
        val x = "15"
        val expected = 5

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 3`() {
        // given
        val x = "17"
        val expected = 5

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 4`() {
        // given
        val x = "33" // 33 : 32 16 8 4 2 1
        val expected = 6

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 5`() {
        // given
        val x = "35" // 100011
                     // 36 18 9 8 4 2 1
                     // 34 17 16 8 4 2 1
        val expected = 7

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 6`() {
        // given
        val x = "999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"
        val expected = 1278

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun `positive case 7`() {
        // given
        val x = "39" // 100111: 40 20 10 5 4 2 1
        val expected = 7

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)

    }

    @Test
    fun `positive case 8`() {
        // given
        val x = "23" // 100111: 40 20 10 5 4 2 1
        val expected = 6

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)

    }

    @Test
    fun `positive case 9`() {
        // given
        val x = "1" // 100111: 40 20 10 5 4 2 1
        val expected = 0

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)

    }

    @Test
    fun `positive case 10`() {
        // given
        val x = "3" // 100111: 40 20 10 5 4 2 1
        val expected = 2

        // when
        val result = Solution.solution(x)

        // then
        assertEquals(expected, result)

    }
}

/*
import java.math.BigInteger;

public class Solution {
    public static int solution(String x) {
        final BigInteger number = new BigInteger(x);
        final int bitLength = number.bitLength(); // 15 - 4

        final BigInteger TWO = BigInteger.valueOf(2);
        final BigInteger lower = TWO.pow(bitLength - 1);
        final BigInteger higher = lower.multiply(TWO);

        final BigInteger diffWithLower = number.subtract(lower);
        final BigInteger diffWithHigher = higher.subtract(number);

        final int result;
        if (diffWithLower.compareTo(diffWithHigher) > 0) {
            result = diffWithHigher.intValue() + bitLength;
        } else {
            result = diffWithLower.intValue() + bitLength - 1;
        }

        return result;
    }
}
 */