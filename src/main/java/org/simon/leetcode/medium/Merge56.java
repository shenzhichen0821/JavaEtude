package org.simon.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge56 {

    /**
     * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
     * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
     *
     * 示例 1：
     * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
     * 输出：[[1,6],[8,10],[15,18]]
     * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     *
     * 示例2：
     * 输入：intervals = [[1,4],[4,5]]
     * 输出：[[1,5]]
     * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/merge-intervals
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(item -> item[0]));
        List<int[]> result = new ArrayList<>();

        int cursor = 0;
        while (cursor < intervals.length) {
            if (result.isEmpty() || result.get(result.size() - 1)[1] < intervals[cursor][0]) {
                int[] tmp = new int[2];
                tmp[0] = intervals[cursor][0];
                tmp[1] = intervals[cursor][1];
                result.add(tmp);
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], intervals[cursor][1]);
            }
            cursor++;
        }
        return result.toArray(new int[result.size()][2]);
    }
}
