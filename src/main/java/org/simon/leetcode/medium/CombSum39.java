package org.simon.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombSum39 {
    /**
     * 给你一个 无重复元素 的整数数组candidates 和一个目标整数target，找出candidates中可以使数字和为目标数target 的 所有不同组合
     * ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
     *
     * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
     *
     * 对于给定的输入，保证和为target 的不同组合数少于 150 个。
     *
     * 示例1：
     * 输入：candidates = [2,3,6,7], target = 7
     * 输出：[[2,2,3],[7]]
     * 解释：
     * 2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
     * 7 也是一个候选， 7 = 7 。
     * 仅有这两种组合。
     * 
     * 示例2：
     * 输入: candidates = [2,3,5], target = 8
     * 输出: [[2,2,2,2],[2,3,3],[3,5]]
     * 
     * 示例 3：
     * 输入: candidates = [2], target = 1
     * 输出: []
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/combination-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        if (candidates[0] <= target) {
            sum(candidates, target, 0, 0, "", result);
        }
        return result;
    }

    public void sum(int[] candidates, int target, int index, int curSum, String buffer, List<List<Integer>> result) {
        if (curSum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            int candidate = candidates[i];
            int addedSum = curSum + candidate;
            if (addedSum < target) {
                sum(candidates, target, i, addedSum, buffer + candidate + ",", result);
            } else if (addedSum == target) {
                List<Integer> res = new ArrayList<>();
                buffer += candidate;
                for (String c : buffer.split(",")) {
                    if (!c.isEmpty()) {
                        res.add(Integer.parseInt(c));
                    }
                }
                result.add(res);
                return;
            } else {
                return;
            }
        }
    }
}
