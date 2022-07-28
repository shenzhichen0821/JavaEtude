package org.simon.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Combination77 {
    /**
     * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
     * 你可以按 任何顺序 返回答案。
     *
     * 示例 1：
     * 输入：n = 4, k = 2
     * 输出：
     * [
     *   [2,4],
     *   [3,4],
     *   [2,3],
     *   [1,2],
     *   [1,3],
     *   [1,4],
     * ]
     *
     * 示例 2：
     * 输入：n = 1, k = 1
     * 输出：[[1]]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/combinations
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            recurse(result, new ArrayList<>(), i, n, k);
        }
        return result;
    }

    public void recurse(List<List<Integer>> result, List<Integer> cur, int i, int n, int k) {
        cur.add(i);
        if (k == cur.size()) {
            result.add(new ArrayList<>(cur));
            return;
        }

        for (int j = i + 1; j <= n; j++) {
            if (n - j + 1 < k - cur.size()) {
                return;
            }
            recurse(result, cur, j, n, k);
            cur.remove(cur.size() - 1);
        }
    }
}
