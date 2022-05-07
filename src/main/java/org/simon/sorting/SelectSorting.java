package org.simon.sorting;

public class SelectSorting extends AbstractSorting {

    /**
     * 不稳定排序
     * 时间复杂度O(N^2)
     * @param origin
     */
    @Override
    public void sort(int[] origin){
        if (origin.length <= 1) {
            return;
        }
        for (int i = 0; i < origin.length - 1; i++) {
            int minVal = origin[i], minIndex = i;
            for (int j = i + 1; j < origin.length; j++) {
                if (origin[j] < minVal) {
                    minIndex = j;
                    minVal = origin[j];
                }
            }
            exchange(origin, i, minIndex);
        }
    }
}
