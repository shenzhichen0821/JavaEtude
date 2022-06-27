package org.simon.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCanJump55 {

    @Test
    public void test() {
        CanJump55 cj = new CanJump55();
        Assert.assertTrue(cj.canJump(new int[] {2, 3, 1, 1, 4}));
        Assert.assertFalse(cj.canJump(new int[] {3, 2, 1, 0, 4}));
        Assert.assertTrue(cj.canJump(new int[] {0}));
    }
}
