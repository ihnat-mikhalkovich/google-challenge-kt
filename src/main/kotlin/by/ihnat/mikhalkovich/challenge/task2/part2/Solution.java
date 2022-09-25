package by.ihnat.mikhalkovich.challenge.task2.part2;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] l) {
        int[] tmpArr = new int[l.length];
        System.arraycopy(l, 0, tmpArr, 0, l.length);

        for (int i = 0; i < tmpArr.length; i++) {
            Arrays.sort(tmpArr);
            final int sum = sum(tmpArr, i);
            final int rest = sum % 3;
            if (rest == 0) {
                final StringBuilder builder = new StringBuilder();
                for (int j = tmpArr.length - 1; j >= i; j--) {
                    builder.append(tmpArr[j]);
                }
                return Integer.parseInt(builder.toString());
            }
            final int[] listToRemoveFirst = new int[]{rest, rest + 3, rest + 6};
            for (int j = i; j < listToRemoveFirst.length; j++) {
                final int indexIfContains = findIndexIfContains(tmpArr, listToRemoveFirst[j]);
                if (indexIfContains >= 0) {
                    tmpArr[indexIfContains] = -1;
                    break;
                }
            }
        }

        return 0;
    }

    private static int sum(int[] array, int startIndex) {
        int acc = 0;
        for (int i = startIndex; i < array.length; i++) {
            acc += array[i];
        }
        return acc;
    }

    private static int findIndexIfContains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
