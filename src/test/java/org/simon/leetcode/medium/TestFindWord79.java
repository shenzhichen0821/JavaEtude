package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindWord79 {

    @Test
    public void test() {
        char[][] data = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String val = "ABCCED";
        FindWord79 fw = new FindWord79();
        Assert.assertTrue(fw.exist(data, val));
    }

    @Test
    public void test1() {
        char[][] data = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String val = "SEE";
        FindWord79 fw = new FindWord79();
        Assert.assertTrue(fw.exist(data, val));
    }

    @Test
    public void test2() {
        char[][] data = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String val = "ABCB";
        FindWord79 fw = new FindWord79();
        Assert.assertFalse(fw.exist(data, val));
    }
}
