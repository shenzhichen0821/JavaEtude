package org.simon.leetcode.medium;

public class SwapPairs24 {

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

    /**
     * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
     *
     * 示例 1：
     * 输入：head = [1,2,3,4]
     * 输出：[2,1,4,3]
     *
     * 示例 2：
     * 输入：head = []
     * 输出：[]
     *
     * 示例 3：
     * 输入：head = [1]
     * 输出：[1]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/swap-nodes-in-pairs
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }

        // node->next->next2
        ListNode temp = head.next.next;
        ListNode result = head.next;

        result.next = head;
        head.next = swapPairs(temp);
        return result;
    }
}
