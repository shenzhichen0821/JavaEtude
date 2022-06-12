package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMyPow50 {

    @Test
    public void test() {
        MyPow50 mp = new MyPow50();
        Assert.assertEquals(mp.myPow(2.00000, 10), 1024.00000);
        Assert.assertEquals(mp.myPow(2.00000, -2),  0.25);
    }

    @Test
    public void test1() {
        MyPow50 mp = new MyPow50();
        Assert.assertEquals(mp.myPow(0.00001, 2147483647), 0.0);
    }

    @Test
    public void test2() {
        MyPow50 mp = new MyPow50();
        Assert.assertEquals(mp.myPow(2.00000, -2147483648), 0.0);
    }
}
