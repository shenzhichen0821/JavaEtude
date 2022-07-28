package org.simon.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval57 {
    /**
     * 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
     * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
     *
     * 示例1：
     * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
     * 输出：[[1,5],[6,9]]
     * 
     * 示例 2：
     * 输入：intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
     * 输出：[[1,2],[3,10],[12,16]]
     * 解释：这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10]重叠。
     * 
     * 示例 3：
     * 输入：intervals = [], newInterval = [5,7]
     * 输出：[[5,7]]
     * 
     * 示例 4：
     * 输入：intervals = [[1,5]], newInterval = [2,3]
     * 输出：[[1,5]]
     * 
     * 示例 5：
     * 输入：intervals = [[1,5]], newInterval = [2,7]
     * 输出：[[1,7]]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/insert-interval
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int min = newInterval[0];
        int max = newInterval[1];
        boolean merging = false;

        for (int iCursor = 0; iCursor < intervals.length; iCursor++) {
            if (newInterval[0] > intervals[iCursor][1]) {
                res.add(intervals[iCursor]);
            } else if (newInterval[1] < intervals[iCursor][0]) {
                if (!merging) {
                    res.add(newInterval);
                    merging = true;
                }
                res.add(intervals[iCursor]);
            } else {
                min = Math.min(min, intervals[iCursor][0]);
                max = Math.max(max, intervals[iCursor][1]);
                if (!merging) {
                    res.add(new int[]{min, max});
                    merging = true;
                } else {
                    int[] tmp = res.get(res.size() - 1);
                    tmp[0] = min;
                    tmp[1] = max;
                }
            }
        }
        if (intervals.length == 0 || !merging) {
            res.add(newInterval);
        }
        return res.toArray(new int[res.size()][2]);
    }
}
