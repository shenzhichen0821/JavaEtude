package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDivide29 {

    @Test
    public void test() {
        Divide29 d = new Divide29();
        Assert.assertEquals(d.divide(1, 1), 1);
        Assert.assertEquals(d.divide(2, -1), -2);
        Assert.assertEquals(d.divide(-2, 1), -2);
        Assert.assertEquals(d.divide(10, 3), 3);
        Assert.assertEquals(d.divide(-10, 3), -3);
        Assert.assertEquals(d.divide(-2147483648, -1), 2147483647);
        Assert.assertEquals(d.divide(-2147483648, 2), -1073741824);
    }
}
