package by.ihnat.mikhalkovich.challenge.task1;

public class Solution {
    private static final int AMOUNT_OF_1DIGIT_NUMBERS = 4;
    private static final int LIMIT_NUMBER_OF_1DIGIT_NUMBER = 18;

    private static final int AMOUNT_OF_2DIGITS_NUMBERS = 21;
    private static final int LIMIT_NUMBER_OF_2DIGIT_NUMBER = 120;

    private static final int AMOUNT_OF_3DIGITS_NUMBERS = 143;
    private static final int LIMIT_NUMBER_OF_3DIGIT_NUMBER = 1020;

    private static final int AMOUNT_OF_4DIGITS_NUMBERS = 1061;
    private static final int LIMIT_NUMBER_OF_4DIGIT_NUMBER = 10010;

    private static final int AMOUNT_OF_5DIGITS_NUMBERS_IN_SCOPE = 1058;
    private static final int LIMIT_NUMBER_OF_5DIGITS_NUMBER = 20250;
    private static final int[][] AMOUNT_OF_DIGITS_IN_SCOPE = {
            {
                AMOUNT_OF_1DIGIT_NUMBERS, LIMIT_NUMBER_OF_1DIGIT_NUMBER
            },
            {
                AMOUNT_OF_2DIGITS_NUMBERS, LIMIT_NUMBER_OF_2DIGIT_NUMBER
            },
            {
                AMOUNT_OF_3DIGITS_NUMBERS, LIMIT_NUMBER_OF_3DIGIT_NUMBER
            },
            {
                AMOUNT_OF_4DIGITS_NUMBERS, LIMIT_NUMBER_OF_4DIGIT_NUMBER
            },
            {
                AMOUNT_OF_5DIGITS_NUMBERS_IN_SCOPE, LIMIT_NUMBER_OF_5DIGITS_NUMBER
            }
    };
    private static final int RESULT_RANGE = 5;

    public static String solution(int charsToSkip) {

        final int n = calculateN(charsToSkip);
        final int[] primes = new int[n + 1];

        primes[0] = 1;
        primes[1] = 1;

        final double sqrtN = Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (primes[i] == 0) {
                for (int j = 2, k = i * j; k < primes.length; j++, k = i * j) {
                    primes[k] = 1;
                }
            }
        }

        final StringBuilder result = new StringBuilder();
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == 0) {
                result.append(i);
            }
        }

        return result.substring(charsToSkip, charsToSkip + RESULT_RANGE);
    }

    private static int calculateN(int charsToSkip) {
        int leftCharsToSkip = charsToSkip;
        int index = 0;
        for (; leftCharsToSkip > 0; index++) {
            final int numbersAmount = (int) Math.ceil((double) leftCharsToSkip / (index + 1));
            leftCharsToSkip = (numbersAmount - AMOUNT_OF_DIGITS_IN_SCOPE[index][0]) * (index + 1);
        }

        final int result;
        if (leftCharsToSkip < 0) {
            index--;
        }
        result = AMOUNT_OF_DIGITS_IN_SCOPE[index][1];

        return result;
    }
}