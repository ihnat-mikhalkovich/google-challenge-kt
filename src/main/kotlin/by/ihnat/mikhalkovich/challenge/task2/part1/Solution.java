package by.ihnat.mikhalkovich.challenge.task2.part1;

public class Solution {
    private static final int ACC_LIMIT = 250;

    public static int[] solution(int[] l, int t) {
        validate(l, t);
        int[] tmp = new int[l.length];

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j <= i; j++) {
                tmp[j] += l[i];
                if (tmp[j] == t) {
                    return new int[]{j, i};
                }
            }
        }

        return new int[]{-1, -1};
    }

    private static void validate(int[] l, int t) {
        if (l == null) {
            throw new IllegalArgumentException("'l' should not be null");
        }

        if (l.length < 1 || l.length > 100) {
            throw new IllegalArgumentException("l.length between 1 and 100");
        }

        if (t > ACC_LIMIT) {
            throw new IllegalArgumentException("'t' should be lower then " + ACC_LIMIT);
        }

        for (int i = 0; i < l.length; i++) {
            if (l[i] < 1 || l[i] > 100) {
                throw new IllegalArgumentException("l[" + i + "] should be between 1 and 100");
            }
        }

    }
}
