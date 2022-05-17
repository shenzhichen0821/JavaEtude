package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class TestMaxArea11 {

    @Test
    public void test() {
        int[] data = new int[20];
        Random random = new Random();
        MaxArea11 max = new MaxArea11();

        int result = 0;
        for (int loop = 0; loop < 10; loop++) {
            for (int i = 0; i < data.length; i++) {
                data[i] = random.nextInt(100);
            }
            result = max.maxArea(data);
            System.out.println("Data: " + Arrays.toString(data));
            System.out.println("Result: " + result + "\n");
            Assert.assertEquals(result, dummy(data));
        }
    }

    public int dummy(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
            }
        }
        return max;
    }
}
