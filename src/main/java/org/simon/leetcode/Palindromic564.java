package org.simon.leetcode;

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
     *
     * 思路：
     * 字符串分为两部分，prefix和suffix
     * 1. abcxxx分为abc和xxx
     * 2. abcdxxx分为abcd和xxx
     * {prefix+1}{prefix+1逆序}, {prefix}{prefix逆序}, {prefix-1}{prefix-1逆序}, 三者比距离。
     *
     * abcxxx == abccba时作废
     * 假如prefix遇到999+1要进位、1000-1要退位，不影响suffix。suffix位数在一开始就固定
     */
    public String nearestPalindromic(String n) {
        int[] peer = str2IntArray(n);

        if (peer.length == 1) {
            peer[0]--;
        } else if (peer.length < 3) {
            int temp = Integer.parseInt(n);
            int offset = 1;
            while (true) {
                if (isPalindromicIn999(temp - offset)) {
                    return String.valueOf(temp - offset);
                } else if (isPalindromicIn999(temp + offset)) {
                    return String.valueOf(temp + offset);
                }
                offset++;
            }
        } else {
            long originPrefix = Long.parseLong(n.substring(0, n.length() / 2 + n.length() % 2));
            int suffixLen = peer.length / 2;
            return chooseBest(n,
                    getPalindromicStrEven(originPrefix, suffixLen),
                    getPalindromicStrEven(originPrefix - 1, suffixLen),
                    getPalindromicStrEven(originPrefix + 1, suffixLen)
                    );
        }
        return intArray2Str(peer);
    }

    public String getPalindromicStrEven(long prefix, int suffixLen) {
        String prefixStr = String.valueOf(prefix);
        char[] array = new char[suffixLen];
        for (int i = 0; i < suffixLen; i++) {
            array[suffixLen - i - 1] = i > prefixStr.length() - 1 ? '9' : prefixStr.charAt(i);
        }
        return prefixStr + new String(array);
    }

    public String chooseBest(String origin, String... candidates) {
        assert candidates.length >= 1;
        long originNum = Long.parseLong(origin);
        long bestNum = -1;
        long minOffset = -1;

        for (String candidate : candidates) {
            if (origin.equals(candidate)) {
                continue;
            }
            long canNum = Long.parseLong(candidate);
            long curOffset = Math.abs(canNum - originNum);
            if (minOffset == -1 || curOffset < minOffset) {
                bestNum = canNum;
                minOffset = curOffset;
            } else if (curOffset == minOffset) {
                if (canNum < bestNum) {
                    bestNum = canNum;
                }
            }
        }
        return String.valueOf(bestNum);
    }

    public int[] str2IntArray(String in) {
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

    private String intArray2Str(int[] in) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(in).forEach(builder::append);
        return builder.toString();
    }

    public boolean isPalindromic(int[] origin) {
        if (origin.length == 1) {
            return true;
        }
        int index = 0;
        while(index < origin.length / 2 + 1) {
            if (origin[index] != origin[origin.length - 1 - index]) {
                return false;
            }
            index++;
        }
        return true;
    }
    public boolean isPalindromicIn999(int in) {
        if (in >= 100) {
            return in % 10 == in / 100;
        } else if (in < 10) {
            return true;
        } else {
            return in % 10 == in / 10;
        }
    }
}
