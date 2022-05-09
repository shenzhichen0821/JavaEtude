package org.simon.leetcode.medium;

import org.testng.annotations.Test;

public class TestAddTwoNumbers2 {

    @Test
    public void test000() {
        testBase(new int[]{2,4,3}, new int[]{5,6,4});
    }

    @Test
    public void test001() {
        testBase(new int[]{0}, new int[]{0});
    }

    @Test
    public void test002() {
        testBase(new int[]{9,9,9,9,9,9,9}, new int[]{9,9,9,9});
    }

    private AddTwoNumbers2.ListNode init(int[] data, int index) {
        return new AddTwoNumbers2.ListNode(data[index], index < data.length - 1 ? init(data, index + 1) : null);
    }

    private void testBase(int[] data0, int[] data1) {
        AddTwoNumbers2.ListNode node0 = init(data0, 0);
        AddTwoNumbers2.ListNode node1 = init(data1, 0);
        AddTwoNumbers2 ad = new AddTwoNumbers2();
        AddTwoNumbers2.ListNode result = ad.addTwoNumbers(node0, node1);

        AddTwoNumbers2.ListNode printNode = result;
        while (printNode != null) {
            System.out.print(printNode.val);
            printNode = printNode.next;
        }
        System.out.println("");
    }
}
