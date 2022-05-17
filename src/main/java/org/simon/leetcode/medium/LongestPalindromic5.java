package org.simon.leetcode.medium;

public class LongestPalindromic5 {

    /**
     * 给你一个字符串 s，找到 s 中最长的回文子串。
     *
     * 示例 1：
     * 输入：s = "babad"
     * 输出："bab"
     * 解释："aba" 同样是符合题意的答案。
     *
     * 示例 2：
     * 输入：s = "cbbd"
     * 输出："bb"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/longest-palindromic-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public String longestPalindrome(String s) {
        int max = 0;
        int maxLeft = 0, maxRight = 0;
        int tempMax, left, right;
        for (int i = 0; i < s.length() - 1; i++) {
            // single center
            if ((Math.min(i, s.length() - 1 - i) * 2 + 1) > max) {
                tempMax = 1;
                left = i - 1;
                right = i + 1;
                if (tempMax > max) {
                    max = tempMax;
                    maxLeft = i;
                    maxRight = i;
                }
                while (left >= 0 && right < s.length()) {
                    if (s.charAt(left) == s.charAt(right)) {
                        tempMax += 2;
                        if (tempMax > max) {
                            max = tempMax;
                            maxLeft = left;
                            maxRight = right;
                        }
                        left--;
                        right++;
                    } else {
                        break;
                    }
                }
            }


            // double center
            if (s.charAt(i) != s.charAt(i + 1)) {
                continue;
            }
            if ((Math.min(i, s.length() - 2 - i) * 2 + 2) > max) {
                tempMax = 2;
                left = i - 1;
                right = i + 2;
                if (tempMax > max) {
                    max = tempMax;
                    maxLeft = i;
                    maxRight = i + 1;
                }
                while (left >= 0 && right < s.length()) {
                    if (s.charAt(left) == s.charAt(right)) {
                        tempMax += 2;
                        if (tempMax > max) {
                            max = tempMax;
                            maxLeft = left;
                            maxRight = right;
                        }
                        left--;
                        right++;
                    } else {
                        break;
                    }
                }
            }

        }
        return s.substring(maxLeft, maxRight + 1);
    }
}
