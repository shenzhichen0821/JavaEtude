package org.simon.sorting;

public abstract class AbstractSorting {
    public void exchange(int[] origin, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = origin[i];
        origin[i] = origin[j];
        origin[j] = temp;
    }

    public abstract void sort(int[] origin);

}
