package org.simon.leetcode;

public class FindMiddle4 {

    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
     * 算法的时间复杂度应该为 O(log (m+n))
     *
     * 示例 1：
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     *
     * 示例 2：
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/median-of-two-sorted-arrays
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 思路：使用归并排序的思路，左右两个指针分别选小的入新array，时间复杂度为O(logN)，需要额外空间
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int pointerL = 0;
        int pointerR = 0;
        int flag = (nums1.length + nums2.length) / 2;
        boolean odd = (nums1.length + nums2.length) % 2 == 1;

        int[] candidate = new int[2];
        for (int i = 0; i <= flag; i++) {
            int temp;
            if (pointerR >= nums2.length) {
                temp = nums1[pointerL];
                pointerL++;
            } else if (pointerL >= nums1.length) {
                temp = nums2[pointerR];
                pointerR++;
            } else if (nums1[pointerL] < nums2[pointerR]) {
                temp = nums1[pointerL];
                pointerL++;
            } else {
                temp = nums2[pointerR];
                pointerR++;
            }

            if (flag - i == 1) {
                candidate[0] = temp;
            } else if (i == flag) {
                candidate[1] = temp;
            }
        }
        return odd ? (double) candidate[1] : (double) (candidate[0] + candidate[1])/2.0;
    }

}
