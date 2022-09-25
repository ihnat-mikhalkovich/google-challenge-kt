package by.ihnat.mikhalkovich.challenge.task3.part1;

import java.math.BigInteger;

public class Solution {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    public static String solution(String x, String y) {
        BigInteger m = new BigInteger(x);
        BigInteger f = new BigInteger(y);

        if (m.gcd(f).compareTo(ONE) > 0) {
            return "impossible";
        }

        BigInteger i = ZERO;
        while (m.compareTo(ONE) > 0 || f.compareTo(ONE) > 0) {
            final BigInteger divide;
            if (m.compareTo(f) > 0) {
                divide = m.divide(f);
                m = m.remainder(f);
            } else {
                divide = f.divide(m);
                f = f.remainder(m);
            }
            i = i.add(divide);
        }

        return i.subtract(ONE) + "";
    }
}
