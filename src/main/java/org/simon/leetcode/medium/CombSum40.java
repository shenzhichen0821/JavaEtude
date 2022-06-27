package org.simon.leetcode.medium;

import java.util.*;

public class CombSum40 {

    /**
     * 给定一个候选人编号的集合candidates和一个目标数target，找出candidates中所有可以使数字和为target的组合。
     *
     * candidates中的每个数字在每个组合中只能使用一次。
     *
     * 注意：解集不能包含重复的组合。
     *
     * 
     *
     * 示例1:
     * 输入: candidates =[10,1,2,7,6,1,5], target =8,
     * 输出:
     * [
     * [1,1,6],
     * [1,2,5],
     * [1,7],
     * [2,6]
     * ]
     *
     * 示例2:
     * 输入: candidates =[2,5,2,1,2], target =5,
     * 输出:
     * [
     * [1,2,2],
     * [5]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/combination-sum-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Map<Integer, Integer> keyFreq = new HashMap<>();
        for (int candidate : candidates) {
            keyFreq.put(candidate, keyFreq.getOrDefault(candidate, 0) + 1);
        }
        List<Integer> keyArray = new ArrayList<>(keyFreq.keySet());
        keyArray.sort(Integer::compareTo);
        List<List<Integer>> result = new ArrayList<>();
        recurse(keyFreq, keyArray, 0, 0, target, new ArrayList<>(), result);
        return result;
    }

    public void recurse(Map<Integer, Integer> keyFreq, List<Integer> keyArray, int index, int value, int target,
                        List<Integer> cur, List<List<Integer>> result) {
        int key = keyArray.get(index);
        if (value + key > target) {
            return;
        }
        // 1~n
        for (int j = 1; j <= keyFreq.get(key); j++) {
            int curValue = value;
            for (int k = 0; k < j; k++) {
                curValue += key;
                cur.add(key);
            }
            if (curValue < target) {
                if (index < keyArray.size() - 1) {
                    recurse(keyFreq, keyArray, index + 1, curValue, target, cur, result);
                }
                for (int k = 0; k < j; k++) {
                    cur.remove(new Integer(key));
                }
                continue;
            } else if (curValue == target) {
                result.add(new ArrayList<>(cur));
            }

            for (int k = 0; k < j; k++) {
                cur.remove(new Integer(key));
            }
            break;
        }
        // 0
        if (index < keyArray.size() - 1) {
            recurse(keyFreq, keyArray, index + 1, value, target, cur, result);
        }
    }
}
