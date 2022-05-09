package org.simon.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring3 {

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的最长子串的长度。
     *
     * 示例1:
     * 输入: s = "abcabcbb"
     * 输出: 3 
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     *
     * 示例 2:
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     *
     * 示例 3:
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
     * 请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 思路：两个指针，右指针+1，左指针不动。假如右指针取的数据在左右间有重复，则左指针右移到重复的数字后，记录这次的长度。多次后取最大数字
     */
    public int lengthOfLongestSubstring(String s) {
        int count = 0, cursor = 0;
        Set<Character> buffer = new HashSet<>();

        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (!buffer.add(array[i])) {
                int dest = 0;
                for (int j = cursor; j < i; j++) {
                    if (array[j] != array[i]) {
                        buffer.remove(array[j]);
                    } else {
                        dest = j + 1;
                        break;
                    }
                }
                count = Math.max(count, i - cursor);
                cursor = dest;
            }
        }
        return Math.max(count, s.length() - cursor);
    }
}
