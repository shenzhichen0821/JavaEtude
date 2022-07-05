package org.simon.leetcode.medium;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TestMerge56 {
    @Test
    public void test() {
        int[][] data = new int[][]{{2,11},{8,10},{15,18},{1,3},{2,6}};
        Merge56 me = new Merge56();
        printArrays(me.merge(data));
    }

    @Test
    public void test1() {
        int[][] data = new int[][]{{1,4},{4,5}};
        Merge56 me = new Merge56();
        printArrays(me.merge(data));
    }

    public static void printArrays(int[][] data) {
        for (int[] item : data) {
            System.out.print(Arrays.toString(item));
        }
        System.out.println("");
    }
}
