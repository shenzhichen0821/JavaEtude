package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestNextPremutation31 {

    @Test
    public void test() {
        NextPremutation31 np = new NextPremutation31();

        int[] data = new int[] {3,2,1};
        np.nextPermutation(data);
        Assert.assertEquals(data, new int[] {1,2,3});
    }

    @Test
    public void test1() {
        NextPremutation31 np = new NextPremutation31();

        int[] data = new int[] {1,1,5};
        np.nextPermutation(data);
        System.out.println(Arrays.toString(data));
        Assert.assertEquals(data, new int[] {1,5,1});
    }

    @Test
    public void test2() {
        NextPremutation31 np = new NextPremutation31();

        int[] data = new int[] {1,2,5,8,7,6,4,3};
        np.nextPermutation(data);
        System.out.println(Arrays.toString(data));
        Assert.assertEquals(data, new int[] {1,2,6,3,4,5,7,8});
    }

    @Test
    public void test3() {
        NextPremutation31 np = new NextPremutation31();

        int[] data = new int[] {1,1,1,2,1,1,1};
        np.nextPermutation(data);
        System.out.println(Arrays.toString(data));
        Assert.assertEquals(data, new int[] {1,1,2,1,1,1,1});
    }

    @Test
    public void test4() {
        NextPremutation31 np = new NextPremutation31();

        int[] data = new int[] {1,1,1,1,1,1,1};
        np.nextPermutation(data);
        System.out.println(Arrays.toString(data));
        Assert.assertEquals(data, new int[] {1,1,1,1,1,1,1});
    }
}
