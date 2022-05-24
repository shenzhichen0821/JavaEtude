package org.simon.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterComb17 {

    /**
     * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
     *
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     *
     * 示例 1：
     * 输入：digits = "23"
     * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
     *
     * 示例 2：
     * 输入：digits = ""
     * 输出：[]
     *
     * 示例 3：
     * 输入：digits = "2"
     * 输出：["a","b","c"]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static Map<Integer, char[]> ref = new HashMap<>();

    static {
        char init = 'a';
        for (int i = 2; i <= 9; i++) {
            int len = i == 9 || i == 7 ? 4 : 3;
            char[] array = new char[len];
            for (int j = 0; j < len; j++) {
                array[j] = init;
                init++;
            }
            ref.put(i, array);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return result;
        }

        recurse(digits, 0, "", result);
        return result;
    }

    private void recurse(String digits, int index, String curStr, List<String> result) {
        int num = digits.charAt(index) - '0';

        char[] letters = null;
        if (ref.containsKey(num)) {
            letters = ref.get(num);
        }

        if (index == digits.length() - 1) {
            if (letters == null) {
                result.add(curStr);
            } else {
                for (int i = 0; i < letters.length; i++) {
                    result.add(curStr + letters[i]);
                }
            }
        } else {
            if (letters == null) {
                recurse(digits, index + 1, curStr, result);
            } else {
                for (int i = 0; i < letters.length; i++) {
                    recurse(digits, index + 1, curStr + letters[i], result);
                }
            }
        }
    }
}
