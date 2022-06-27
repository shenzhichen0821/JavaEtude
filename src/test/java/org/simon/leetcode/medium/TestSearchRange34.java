package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchRange34 {

    @Test
    public void test() {
        SearchRange34 sr = new SearchRange34();
        Assert.assertEquals(sr.searchRange(new int[] {5,7,7,8,8,10}, 8), new int[] {3,4});
    }

    @Test
    public void test1() {
        SearchRange34 sr = new SearchRange34();
        Assert.assertEquals(sr.searchRange(new int[] {5,7,7,8,8,10}, 6), new int[] {-1,-1});
    }

    @Test
    public void test2() {
        SearchRange34 sr = new SearchRange34();
        Assert.assertEquals(sr.searchRange(new int[] {}, 0), new int[] {-1,-1});
    }
}
