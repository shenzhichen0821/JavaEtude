package org.simon.leetcode.medium;

public class AddTwoNumbers2 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    public ListNode add(ListNode l1, ListNode l2, int upgrade) {
        if (l1 == null && l2 == null) {
            if (upgrade == 1) {
                return new ListNode(1, null);
            } else {
                return null;
            }
        }

        int val1;
        if (l1 == null) {
            val1 = 0;
        } else {
            val1 = l1.val;
        }
        int val2;
        if (l2 == null) {
            val2 = 0;
        } else {
            val2 = l2.val;
        }

        int result = val1 + val2 + upgrade;
        return new ListNode(result % 10,
                add(l1 == null ? null : l1.next, l2 == null ? null : l2.next, result / 10));
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
