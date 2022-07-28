package org.simon.base;

import java.util.Arrays;

public class BaseTest {

    public static void printArrays(int[][] data) {
        for (int[] item : data) {
            System.out.print(Arrays.toString(item));
        }
        System.out.println("");
    }

}
