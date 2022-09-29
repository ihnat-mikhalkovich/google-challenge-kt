package by.ihnat.mikhalkovich.challenge.task3.part3;

import java.math.BigInteger;

public class Solution {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger THREE = BigInteger.valueOf(3);

    public static int solution(String x) {
        return solution2(x);
    }

    private static int solution1(String x) {
        BigInteger number = new BigInteger(x);

        int counter = 0;

        while (number.bitLength() > 1) {
            if (!number.testBit(0)) {
                number = number.shiftRight(1);
                counter++;
            } else if (number.testBit(1) && number.testBit(2)) {
                final int bitCount = number.bitCount();

                final BigInteger plusOne = number.add(ONE);

                final int plusOneBits = plusOne.bitCount();

                final int shift = bitCount - plusOneBits + 1;
                number = plusOne.shiftRight(shift);
                counter += shift + 1;

            } else {
                number = number.shiftRight(1);
                counter += 2;
            }
        }

        return counter;
    }

    private static int solution2(String x) {
        BigInteger number = new BigInteger(x);

        int counter = 0;
        while (number.bitLength() > 1) {
            if (!number.testBit(0)) {
                number = number.shiftRight(1);
                counter++;
            } else if (number.testBit(1) && number.bitLength() > 2) {
                final int bitCount = number.bitCount();
                final BigInteger plusOne = number.add(ONE);
                final int plusOneBits = plusOne.bitCount();
                final int shift = bitCount - plusOneBits + 1;
                number = plusOne.shiftRight(shift);
                counter += shift + 1;
            } else {
                number = number.shiftRight(1);
                counter += 2;
            }
        }

        return counter;
    }
}

/*

public class Solution {
    private static final BigInteger ONE = BigInteger.valueOf(1);

    public static int solution(String x) {
        BigInteger number = new BigInteger(x);

        int counter = 0;

        while (number.bitLength() > 1) {
            if (!number.testBit(0)) {
                number = number.shiftRight(1);
                counter++;
            } else if (number.testBit(1) && number.testBit(2)) {
                final int bitCount = number.bitCount();

                final BigInteger plusOne = number.add(ONE);

                final int plusOneBits = plusOne.bitCount();

                final int shift = bitCount - plusOneBits + 1;
                number = plusOne.shiftRight(shift);
                counter += shift + 1;

            } else {
                number = number.shiftRight(1);
                counter += 2;
            }
        }

        return counter;
    }
}

 */

/*
package by.ihnat.mikhalkovich.challenge.task3.part3;

import java.math.BigInteger;

public class Solution {
    private static final BigInteger ONE = BigInteger.valueOf(1);

    public static int solution(String x) {
        BigInteger number = new BigInteger(x);
        System.out.println();

        int counter = 0;

        while (number.bitLength() > 1) {
            if (number.testBit(0)) {
                final BigInteger plusOne = number.add(ONE);
                final BigInteger minusOne = number.subtract(ONE);

                final int plusOneBits = plusOne.bitCount();
                final int minusOneBits = minusOne.bitCount();

                if (plusOneBits < minusOneBits) {
                    number = plusOne;
                } else {
                    number = minusOne;
                }
            } else {
                number = number.shiftRight(1);
            }
            counter++;
        }

        return counter;
    }
}

 */