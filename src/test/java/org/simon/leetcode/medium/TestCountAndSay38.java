package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCountAndSay38 {

    @Test
    public void test() {
        CountAndSay38 cs = new CountAndSay38();
        Assert.assertEquals(cs.countAndSay(4), "1211");
    }

    @Test
    public void test11() {
        CountAndSay38 cs = new CountAndSay38();
        Assert.assertEquals(cs.countAndSay(5), "111221");
    }

    @Test
    public void test12() {
        CountAndSay38 cs = new CountAndSay38();
        Assert.assertEquals(cs.countAndSay(6), "312211");
    }
    @Test
    public void test13() {
        CountAndSay38 cs = new CountAndSay38();
        Assert.assertEquals(cs.countAndSay(7), "13112221");
    }

    @Test
    public void test1() {
        CountAndSay38 cs = new CountAndSay38();
        Assert.assertEquals(cs.countAndSay(3), "21");
    }

    @Test
    public void test2() {
        CountAndSay38 cs = new CountAndSay38();
        Assert.assertEquals(cs.countAndSay(2), "11");
    }

    @Test
    public void test3() {
        CountAndSay38 cs = new CountAndSay38();
        Assert.assertEquals(cs.countAndSay(1), "1");
    }
}
