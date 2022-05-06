package org.simon.sorting;

public class MergeSorting extends AbstractSorting {

    /**
     * 时间复杂度O(NlogN)
     * 额外空间O(N)
     * @param origin
     */
    @Override
    public void sort(int[] origin) {
        subSort(origin, 0, origin.length - 1);
    }

    public void subSort(int[] origin, int start, int end) {
        if (end == start) {
            return;
        }
        if ((end - start) == 1) {
            if (origin[start] > origin[end]) {
                exchange(origin, start, end);
            }
            return;
        }

        int leftPoint = start;
        int rightPoint = (end + start) / 2;
        subSort(origin, leftPoint, rightPoint - 1);
        subSort(origin, rightPoint, end);

        int[] temp = new int[end - start + 1];
        for (int i = 0; i < temp.length; i++) {
            if (leftPoint >= (end + start) / 2) {
                temp[i] = origin[rightPoint];
                rightPoint++;
                continue;
            } else if (rightPoint > end) {
                temp[i] = origin[leftPoint];
                leftPoint++;
                continue;
            }

            if (origin[leftPoint] > origin[rightPoint]) {
                temp[i] = origin[rightPoint];
                rightPoint++;
            } else {
                temp[i] = origin[leftPoint];
                leftPoint++;
            }
        }
        System.arraycopy(temp, 0, origin, start, temp.length);
    }
}
