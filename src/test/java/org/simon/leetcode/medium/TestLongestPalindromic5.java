package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLongestPalindromic5 {

    @Test
    public void test000() {
        String data = "babad";
        String result = "bab";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }

    @Test
    public void test001() {
        String data = "cbbd";
        String result = "bb";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }

    @Test
    public void test002() {
        String data = "abcdefg";
        String result = "a";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }

    @Test
    public void test003() {
        String data = "abcdefgfedcba";
        String result = "abcdefgfedcba";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }

    @Test
    public void test004() {
        String data = "abcdefggfedcba";
        String result = "abcdefggfedcba";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }

    @Test
    public void test005() {
        String data = "aaaaabcdefgfedcba";
        String result = "abcdefgfedcba";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }

    @Test
    public void test006() {
        String data = "abcdefggfedcbaaaaaaa";
        String result = "abcdefggfedcba";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }

    @Test
    public void test007() {
        String data = "a";
        String result = "a";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }

    @Test
    public void test008() {
        String data = "aa";
        String result = "aa";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }

    @Test
    public void test009() {
        String data = "aba";
        String result = "aba";
        LongestPalindromic5 lp = new LongestPalindromic5();
        Assert.assertEquals(lp.longestPalindrome(data), result);
    }
}
