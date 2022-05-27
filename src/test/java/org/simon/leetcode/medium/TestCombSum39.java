package org.simon.leetcode.medium;

import org.testng.annotations.Test;

import java.util.List;

public class TestCombSum39 {

    @Test
    public void test000() {
        CombSum39 cs = new CombSum39();
        int[] data = new int[] {2,3,6,7};
        int target = 7;
        List<List<Integer>> result = cs.combinationSum(data, target);
        System.out.println(result.toString());
    }

    @Test
    public void test001() {
        CombSum39 cs = new CombSum39();
        int[] data = new int[] {2,3,5};
        int target = 8;
        List<List<Integer>> result = cs.combinationSum(data, target);
        System.out.println(result.toString());
    }

    @Test
    public void test002() {
        CombSum39 cs = new CombSum39();
        int[] data = new int[] {2};
        int target = 1;
        List<List<Integer>> result = cs.combinationSum(data, target);
        System.out.println(result.toString());
    }

    @Test
    public void test003() {
        CombSum39 cs = new CombSum39();
        int[] data = new int[] {2,3,4,5};
        int target = 2;
        List<List<Integer>> result = cs.combinationSum(data, target);
        System.out.println(result.toString());
    }

    public static void test(int[] data, String c) {
        data[0] = 1000;
        c = "abc";
    }
}
