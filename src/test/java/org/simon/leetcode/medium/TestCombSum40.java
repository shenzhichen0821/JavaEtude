package org.simon.leetcode.medium;

import org.testng.annotations.Test;

public class TestCombSum40 {

    @Test
    public void test() {
        int[] arr = new int[] {10,1,2,1,1,7,6,1,5};
        CombSum40 cs = new CombSum40();
        System.out.println(cs.combinationSum2(arr, 8));
    }

    @Test
    public void test1() {
        int[] arr = new int[] {2,5,2,1,2};
        CombSum40 cs = new CombSum40();
        System.out.println(cs.combinationSum2(arr, 5));
    }

    @Test
    public void test2() {
        int[] arr = new int[] {1,1};
        CombSum40 cs = new CombSum40();
        System.out.println(cs.combinationSum2(arr, 2));
    }
}
