package org.simon.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis22 {
    /**
     * 数字 n代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
     *
     * 示例 1：
     * 输入：n = 3
     * 输出：["((()))","(()())","(())()","()(())","()()()"]
     *
     * 示例 2：
     * 输入：n = 1
     * 输出：["()"]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/generate-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(1, 0, n, "(", result);
        return result;
    }

    public void generate(int open, int close, int max, String cur, List<String> res) {
        if (open == 0 && close == max) {
            res.add(cur);
            return;
        }

        if (open + close < max) {
            generate(open + 1, close, max, cur + "(", res);
        }
        if (open >= 1) {
            generate(open - 1, close + 1, max, cur + ")", res);
        }
    }
}
