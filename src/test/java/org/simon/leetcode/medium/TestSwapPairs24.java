package org.simon.leetcode.medium;

import org.testng.annotations.Test;

public class TestSwapPairs24 {

    @Test
    public void test() {
        SwapPairs24 sp = new SwapPairs24();
        SwapPairs24.ListNode result = sp.swapPairs(init(4, 0));
        System.out.println(sp);
    }

    public SwapPairs24.ListNode init(int bound, int index) {
        return new SwapPairs24.ListNode(index, index == bound - 1 ? null : init(bound, index + 1));
    }
}
