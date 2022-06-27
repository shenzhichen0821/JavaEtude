package org.simon.leetcode.medium;

import java.util.*;

public class GroupAnagrams49 {

    /**
     * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
     * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
     *
     * 示例 1:
     * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
     *
     * 示例 2:
     * 输入: strs = [""]
     * 输出: [[""]]
     *
     * 示例 3:
     * 输入: strs = ["a"]
     * 输出: [["a"]]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/group-anagrams
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String item = new String(arr);
            List<String> buf = result.getOrDefault(item, new ArrayList<>());
            buf.add(str);
            result.put(item, buf);
        }
        return new ArrayList<>(result.values());
    }
}
