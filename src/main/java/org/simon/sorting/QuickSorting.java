package org.simon.sorting;

public class QuickSorting extends AbstractSorting {

    /**
     * 平均时间复杂度O(NlogN)
     * @param origin
     */
    @Override
    public void sort(int[] origin) {
        subSort(origin, 0, origin.length - 1);
    }

    public void subSort(int[] origin, int start, int end) {
        if (end <= start) {
            return;
        } else if (end - start == 1) {
            if (origin[start] > origin[end]) {
                exchange(origin, start ,end);
            }
            return;
        }
        // 1. partition
        int bound = start;
        int ref = origin[end];
        for(int i = start; i < end; i++) {
            if (origin[i] < ref) {
                exchange(origin, i, bound);
                bound++;
            }
        }
        exchange(origin, bound, end);

        // 2. recursion
        subSort(origin, start, bound - 1);
        subSort(origin, bound + 1, end);
    }
}
