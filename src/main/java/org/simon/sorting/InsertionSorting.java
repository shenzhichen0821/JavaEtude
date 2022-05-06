package org.simon.sorting;

public class InsertionSorting extends AbstractSorting {

    /**
     * 稳定排序
     * 时间复杂度：O(N)~O(N^2)
     * @param origin
     */
    @Override
    public void sort(int[] origin) {
        if (origin.length <= 1) {
            return;
        }

        for (int i = 1; i < origin.length; i++) {
            for (int j = i; j > 0; j--) {
                if (origin[j] < origin[j - 1]) {
                    exchange(origin, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
