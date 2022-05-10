package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestZedConvert6 {

    @Test
    public void test000() {
        ZedConvert6 zedConvert6 = new ZedConvert6();
        String result = zedConvert6.convert("038c9415adb627", 4);
        String expected = "0123456789abcd";
        System.out.println(result + "-" + expected);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void test001() {
        ZedConvert6 zedConvert6 = new ZedConvert6();
        String result = zedConvert6.convert("a", 1);
        String expected = "a";
        System.out.println(result + "-" + expected);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void test002() {
        ZedConvert6 zedConvert6 = new ZedConvert6();
        String result = zedConvert6.convert("ab", 1);
        String expected = "ab";
        System.out.println(result + "-" + expected);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void test003() {
        ZedConvert6 zedConvert6 = new ZedConvert6();
        String result = zedConvert6.convert("ab", 2);
        String expected = "ab";
        System.out.println(result + "-" + expected);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void test004() {
        ZedConvert6 zedConvert6 = new ZedConvert6();
        String result = zedConvert6.convert("abcd", 2);
        String expected = "acbd";
        System.out.println(result + "-" + expected);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void test005() {
        ZedConvert6 zedConvert6 = new ZedConvert6();
        String result = zedConvert6.convert("038e9415afb627cgd", 4);
        String expected = "0123456789abcdefg";
        System.out.println(result + "-" + expected);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void test006() {
        ZedConvert6 zedConvert6 = new ZedConvert6();
        String result = zedConvert6.convert("0123456789abcde", 2);
        String expected = "02468ace13579bd";
        System.out.println(result + "-" + expected);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void test007() {
        ZedConvert6 zedConvert6 = new ZedConvert6();
        String result = zedConvert6.convert("0123456789abcd", 2);
        String expected = "02468ac13579bd";
        System.out.println(result + "-" + expected);
        Assert.assertEquals(result, expected);
    }
}
