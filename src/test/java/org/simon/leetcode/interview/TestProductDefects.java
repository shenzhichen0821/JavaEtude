package org.simon.leetcode.interview;

import org.simon.interview.ProductDefects;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestProductDefects {

    @Test
    public void test() {
        List<List<Integer>> data = new ArrayList<>();
        data.add(Arrays.asList(1,1,1,1,1,1));
        data.add(Arrays.asList(1,0,1,1,0,1));
        data.add(Arrays.asList(1,1,1,1,0,1));
        data.add(Arrays.asList(1,0,1,1,0,1));
        data.add(Arrays.asList(1,1,1,1,1,1));

        System.out.println(ProductDefects.findLargestSquareSize(data));
    }

    @Test
    public void test1() {
        List<List<Integer>> data = new ArrayList<>();
        data.add(Arrays.asList(1,1,1,1,1,1));
        data.add(Arrays.asList(1,1,1,1,1,1));
        data.add(Arrays.asList(1,1,1,1,1,0));
        data.add(Arrays.asList(1,1,1,1,1,1));
        data.add(Arrays.asList(1,1,1,1,1,1));

        System.out.println(ProductDefects.findLargestSquareSize(data));
    }
}
