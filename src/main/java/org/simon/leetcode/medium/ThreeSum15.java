package org.simon.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

    /**
     * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     * 示例 1：
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     *
     * 示例 2：
     * 输入：nums = []
     * 输出：[]
     *
     * 示例 3：
     * 输入：nums = [0]
     * 输出：[]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/3sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0) {
            return result;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && (nums[i] == nums[i - 1])) continue;
            int ref = -nums[i], left = i + 1, right = nums.length - 1;

            while(left < right) {
                if (nums[right] < 0) {
                    break;
                }
                if (nums[left] + nums[right] == ref) {
                    List<Integer> data = new ArrayList<>(3);
                    data.add(nums[i]);
                    data.add(nums[left]);
                    data.add(nums[right]);
                    result.add(data);
                    left++;
                    while (left < right && nums[left - 1] == nums[left]) {
                        left++;
                    }
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (nums[left] + nums[right] < ref) {
                    left++;
                    while (left < right && nums[left - 1] == nums[left]) {
                        left++;
                    }
                } else {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }

}
