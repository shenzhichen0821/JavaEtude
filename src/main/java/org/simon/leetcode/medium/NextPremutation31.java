package org.simon.leetcode.medium;

import java.util.Arrays;

public class NextPremutation31 {

    /**
     * 整数数组的一个 排列  就是将其所有成员以序列或线性顺序排列。
     *
     * 例如，arr = [1,2,3] ，以下这些都可以视作 arr 的排列：[1,2,3]、[1,3,2]、[3,1,2]、[2,3,1] 。
     * 整数数组的 下一个排列 是指其整数的下一个字典序更大的排列。更正式地，如果数组的所有排列根据其字典顺序从小到大排列在一个容器中，那么数组的 下一个排列 就是在这个有序容器中排在它后面的那个排列。如果不存在下一个更大的排列，那么这个数组必须重排为字典序最小的排列（即，其元素按升序排列）。
     *
     * 例如，arr = [1,2,3] 的下一个排列是 [1,3,2] 。
     * 类似地，arr = [2,3,1] 的下一个排列是 [3,1,2] 。
     * 而 arr = [3,2,1] 的下一个排列是 [1,2,3] ，因为 [3,2,1] 不存在一个字典序更大的排列。
     * 给你一个整数数组 nums ，找出 nums 的下一个排列。
     *
     * 必须 原地 修改，只允许使用额外常数空间。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/next-permutation
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int cursor = 0;
        boolean exist = false;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                exist = true;
                cursor = i;
                break;
            }
        }

        if (exist) {
            int ref = nums[cursor - 1];
            int targetCursor = 0;
            for (int i = nums.length - 1; i > cursor - 1; i--) {
                if (nums[i] > ref) {
                    if (ref < nums[i]) {
                        targetCursor = i;
                        break;
                    }
                }
            }
            swap(nums, cursor - 1, targetCursor);
            Arrays.sort(nums, cursor, nums.length);
        } else {
            Arrays.sort(nums);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
