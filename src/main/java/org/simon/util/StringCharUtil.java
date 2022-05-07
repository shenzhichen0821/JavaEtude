package org.simon.util;

import java.util.Arrays;

public class StringCharUtil {

    public static String intArray2Str(int[] in) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(in).forEach(builder::append);
        return builder.toString();
    }

    private static int[] str2IntArray(String in) {
        if (in.isEmpty()) {
            throw new AssertionError("String is empty.");
        }

        int[] result = new int[in.length()];
        char[] peer = in.toCharArray();
        for (int i = 0; i < peer.length; i++) {
            if (!Character.isDigit(peer[i])) {
                throw new AssertionError("String invalid (not digit): " + in);
            }
            result[i] = peer[i] - '0';
        }
        return result;
    }

    /**
     * Calculate distance between two int array.
     *
     * Example:
     * left: [1, 3, 4, 0] is 1340
     * right: [2, 8, 7, 9] is 2879
     * distance is ABS(1340 - 2879) = 1539
     *
     * @param left
     * @param right
     * @return
     */
    public static int distance(int[] left, int[] right) {
        boolean needReverse = !noLessThan(left, right);
        int totalDist = 0, index = 0;
        int downgrade = 0;
        while(index <= left.length - 1 || index <= right.length - 1) {
            int leftNum = index > left.length - 1 ? 0 : left[left.length - index - 1];
            int rightNum = index > right.length - 1 ? 0 : right[right.length - index - 1];

            int dist = (needReverse ? rightNum - leftNum : leftNum - rightNum) - downgrade;
            if (dist < 0) {
                downgrade = 1;
                dist += 10;
            } else {
                downgrade = 0;
            }
            totalDist += dist * Math.pow(10, index);
            index++;
        }
        return Math.abs(totalDist);
    }

    /**
     * Int array, left no less than right
     *
     * Example:
     * left: [1, 3, 4, 0] is 1340
     * right: [2, 8, 7, 9] is 2879
     * return 1340 >= 2879 (false)
     *
     * @param left
     * @param right
     * @return
     */
    public static boolean noLessThan(int[] left, int[] right) {
        if (left.length != right.length) {
            return left.length >= right.length;
        }

        for (int i = 0; i < left.length; i++) {
            if (left[i] > right[i]) {
                return true;
            } else if (left[i] < right[i]) {
                return false;
            }
        }
        return true;
    }
}
