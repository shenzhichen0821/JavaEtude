package org.simon.leetcode.medium;

import org.simon.base.BaseTest;
import org.testng.annotations.Test;

public class TestInsertInterval57 extends BaseTest {

    @Test
    public void test000() {
        int[] newInterval = new int[] {2,5};
        int[][] intervals = new int[][] {{1,3},{6,9}};
        InsertInterval57 ti = new InsertInterval57();
        printArrays(ti.insert(intervals, newInterval));
    }

    @Test
    public void test001() {
        int[] newInterval = new int[] {4,8};
        int[][] intervals = new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}};
        InsertInterval57 ti = new InsertInterval57();
        printArrays(ti.insert(intervals, newInterval));
    }

    @Test
    public void test002() {
        int[] newInterval = new int[] {4,100};
        int[][] intervals = new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}};
        InsertInterval57 ti = new InsertInterval57();
        printArrays(ti.insert(intervals, newInterval));
    }

    @Test
    public void test003() {
        int[] newInterval = new int[] {1,100};
        int[][] intervals = new int[][] {{3,5},{6,7},{8,10},{12,16}};
        InsertInterval57 ti = new InsertInterval57();
        printArrays(ti.insert(intervals, newInterval));
    }

    @Test
    public void test004() {
        int[] newInterval = new int[] {1,2};
        int[][] intervals = new int[][] {{3,4},{6,7},{8,10},{12,16}};
        InsertInterval57 ti = new InsertInterval57();
        printArrays(ti.insert(intervals, newInterval));
    }

    @Test
    public void test005() {
        int[] newInterval = new int[] {5,7};
        int[][] intervals = new int[][] {};
        InsertInterval57 ti = new InsertInterval57();
        printArrays(ti.insert(intervals, newInterval));
    }

    @Test
    public void test006() {
        int[] newInterval = new int[] {1,4};
        int[][] intervals = new int[][] {{5,7}};
        InsertInterval57 ti = new InsertInterval57();
        printArrays(ti.insert(intervals, newInterval));
    }

    @Test
    public void test007() {
        int[] newInterval = new int[] {5,7};
        int[][] intervals = new int[][] {{1,4}};
        InsertInterval57 ti = new InsertInterval57();
        printArrays(ti.insert(intervals, newInterval));
    }

    @Test
    public void test008() {
        int[] newInterval = new int[] {0,0};
        int[][] intervals = new int[][] {{1,5}};
        InsertInterval57 ti = new InsertInterval57();
        printArrays(ti.insert(intervals, newInterval));
    }
}
