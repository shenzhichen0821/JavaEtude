package org.simon.leetcode.medium;

public class SearchRange34 {

    /**
     * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回[-1, -1]。
     * 你必须设计并实现时间复杂度为O(log n)的算法解决此问题。
     *
     * 示例 1：
     * 输入：nums = [5,7,7,8,8,10], target = 8
     * 输出：[3,4]
     *
     * 示例2：
     * 输入：nums = [5,7,7,8,8,10], target = 6
     * 输出：[-1,-1]
     *
     * 示例 3：
     * 输入：nums = [], target = 0
     * 输出：[-1,-1]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        if (nums.length > 0) {
            recurse(nums, 0, nums.length - 1, target, result);
        }
        return result;
    }

    public void recurse(int[] nums, int start, int end, int target, int[] result) {
        if (start == end) {
            if (nums[start] == target) {
                result[0] = result[0] == -1 ? start : Math.min(result[0], start);
                result[1] = Math.max(result[1], start);
            }
            return;
        }

        if (nums[start] <= target) {
            recurse(nums, start, (start + end) / 2, target, result);
        }
        if (nums[end] >= target) {
            recurse(nums, (start + end) / 2 + 1, end, target, result);
        }
    }
}
