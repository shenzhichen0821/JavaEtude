package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestRotate48 {

    @Test
    public void test000() {
        int[][] data = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = new int[][] {{7,4,1},{8,5,2},{9,6,3}};
        Rotate48 rt = new Rotate48();
        rt.rotate(data);
        Assert.assertEquals(data, expected);
    }

    @Test
    public void test001() {
        int[][] data = new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] expected = new int[][] {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        Rotate48 rt = new Rotate48();
        rt.rotate(data);
        Assert.assertEquals(data, expected);
    }

}
