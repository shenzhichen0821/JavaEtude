package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestReverseInt7 {

    @Test
    public void test000() {
        test(12345678, 87654321);
        test(-12345678, -87654321);
        test(-10000000, -1);
        test(1, 1);
        test(-1000000009, 0);
        test(1000000009, 0);
        test(120, 21);
        test(-2147483412, -2143847412);
        test(2147483412, 2143847412);
        test(-2147483648, 0);
    }

    private void test(int ori, int exp) {
        ReverseInt7 ri = new ReverseInt7();
        int res = ri.reverse(ori);
        System.out.println("Ori: " + ori);
        System.out.println("Res: " + res);
        Assert.assertEquals(res, exp);
    }
}
