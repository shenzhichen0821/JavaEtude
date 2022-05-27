package org.simon.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permute46 {

    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
     *
     * 示例 1：
     * 输入：nums = [1,2,3]
     * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     * 
     * 示例 2：
     * 输入：nums = [0,1]
     * 输出：[[0,1],[1,0]]
     * 
     * 示例 3：
     * 输入：nums = [1]
     * 输出：[[1]]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/permutations
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> cur = new ArrayList<>();
        for (int num : nums) {
            cur.add(num);
        }
        recurse(cur, 0, result);
        return result;
    }

    public void recurse(List<Integer> cur, int head, List<List<Integer>> result) {
        if (head == cur.size() - 1) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = head; i < cur.size(); i++) {
            Collections.swap(cur, head, i);
            recurse(cur, head + 1, result);
            Collections.swap(cur, i, head);
        }
    }


}
