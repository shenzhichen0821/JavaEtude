package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLongestSubstring3 {

    @Test
    public void test000() {
        String data = "abcabcbb";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 3);
    }

    @Test
    public void test001() {
        String data = "bbbbb";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 1);
    }

    @Test
    public void test002() {
        String data = "pwwkew";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 3);
    }

    @Test
    public void test003() {
        String data = " ";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 1);
    }

    @Test
    public void test004() {
        String data = " aa ";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 2);
    }

    @Test
    public void test005() {
        String data = "abc ";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 4);
    }

    @Test
    public void test006() {
        String data = "aabb";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 2);
    }

    @Test
    public void test007() {
        String data = "123452345234523450";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 5);
    }

    @Test
    public void test008() {
        String data = "0000000012340000000";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 5);
    }

    @Test
    public void test009() {
        String data = "aab";
        LongestSubstring3 ls = new LongestSubstring3();
        Assert.assertEquals(ls.lengthOfLongestSubstring(data), 2);
    }
}
