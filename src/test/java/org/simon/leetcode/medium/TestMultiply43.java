package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMultiply43 {

    @Test
    public void test000() {
        Multiply43 ml = new Multiply43();
        Assert.assertEquals(ml.multiply("99", "999"), "98901");
        Assert.assertEquals(ml.multiply("10", "999"), "9990");
        Assert.assertEquals(ml.multiply("10", "10"), "100");
        Assert.assertEquals(ml.multiply("0", "12345"), "0");
        Assert.assertEquals(ml.multiply("23456", "1"), "23456");
        Assert.assertEquals(ml.multiply("11", "11"), "121");
    }
}
