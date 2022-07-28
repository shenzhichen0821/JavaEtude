package org.simon.leetcode.medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestCombination77 {

    @Test
    public void test() {
        print(new Combination77().combine(4, 2));
    }

    @Test
    public void test1() {
        print(new Combination77().combine(1, 1));
    }

    @Test
    public void test2() {
        print(new Combination77().combine(4, 4));
    }

    public static void print(List<List<Integer>> result) {
        String[] res = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i).toString();
        }
        String a = "[\n";
        for (String s : res) {
            a += (s.toString() + ",\n");
        }
        a += "]\n";
        System.out.print(a);
    }
}
