package org.simon.leetcode.medium;

import java.util.Map;

public class Divide29 {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean sign = dividend > 0 ^ divisor > 0;
        dividend = dividend > 0 ? -dividend : dividend;
        divisor = divisor > 0 ? -divisor : divisor;
        int result = 0;
        while(true) {
            if (divisor == -1) {
                return sign ? dividend : -dividend;
            }
            if (divisor < dividend) {
                return sign ? -result : result;
            } else {
                dividend -= divisor;
                result++;
            }
        }
    }

}
