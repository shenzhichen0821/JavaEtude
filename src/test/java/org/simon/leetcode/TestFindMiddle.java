package org.simon.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindMiddle {

    @Test
    public void test000() {
        // 0,1,2,3,3,4,5,6,7
        int[] a = new int[] {1,3,4,7};
        int[] b = new int[] {0,2,3,5,6};

        FindMiddle4 findMiddle4 = new FindMiddle4();
        double result = findMiddle4.findMedianSortedArrays(a, b);
        System.out.println("Result: " + result);
        Assert.assertEquals(result, 3.0);
    }

    @Test
    public void test001() {
        // 0,1,2,3,4,5,6,7
        int[] a = new int[] {1,4,7};
        int[] b = new int[] {0,2,3,5,6};

        FindMiddle4 findMiddle4 = new FindMiddle4();
        double result = findMiddle4.findMedianSortedArrays(a, b);
        System.out.println("Result: " + result);
        Assert.assertEquals(result, 3.5);
    }
}
