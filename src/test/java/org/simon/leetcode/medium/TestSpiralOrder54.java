package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestSpiralOrder54 {

    @Test
    public void test000() {
        int[][] data = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Integer[] expected = new Integer[] {1,2,3,4,8,12,11,10,9,5,6,7};
        test(data, expected);
    }

    @Test
    public void test001() {
        int[][] data = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        Integer[] expected = new Integer[] {1,2,3,6,9,8,7,4,5};
        test(data, expected);
    }

    @Test
    public void test002() {
        int[][] data = new int[][] {{1,2,3}};
        Integer[] expected = new Integer[] {1,2,3};
        test(data, expected);
    }

    @Test
    public void test003() {
        int[][] data = new int[][] {{1},{2}};
        Integer[] expected = new Integer[] {1,2};
        test(data, expected);
    }

    private void test(int[][] data, Integer[] expected) {
        SpiralOrder54 so = new SpiralOrder54();
        List<Integer> actual = so.spiralOrder(data);

        System.out.println("Actual: " + Arrays.toString(actual.toArray()));
        System.out.println("Expect: " + Arrays.toString(expected));
        Assert.assertEquals(actual, Arrays.asList(expected));
    }
}
