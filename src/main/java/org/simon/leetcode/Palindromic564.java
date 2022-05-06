package org.simon.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class Palindromic564 {
    /**
     * 给定一个表示整数的字符串n ，返回与它最近的回文整数（不包括自身）。如果不止一个，返回较小的那个。
     * “最近的”定义为两个整数差的绝对值最小。
     *
     * 示例 1:
     * 输入: n = "123"
     * 输出: "121"
     *
     * 示例 2:
     * 输入: n = "1"
     * 输出: "0"
     * 解释: 0 和 2是最近的回文，但我们返回最小的，也就是 0。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/find-the-closest-palindrome
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public String nearestPalindromic(String n) {
        int[] peer = str2IntArray(n);
        int[] result = new int[n.length()];

        if (peer.length == 1) {

        } else if (peer.length == 2) {

        } else {

        }

        return intArray2Str(result);
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

    private static String intArray2Str(int[] in) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(in).forEach(builder::append);
        return builder.toString();
    }

    public static void main(String[] args) {
//        BigInteger peer = new BigInteger("135723486");
        System.out.println(intArray2Str(str2IntArray("135723486")));
    }
}
