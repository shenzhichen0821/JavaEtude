package org.simon.leetcode.medium;

public class RemoveLinkNode19 {

    public static class ListNode {
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
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     * <p>
     * 示例 1：
     * 输入：head = [1,2,3,4,5], n = 2
     * 输出：[1,2,3,5]
     * <p>
     * 示例 2：
     * 输入：head = [1], n = 1
     * 输出：[]
     * <p>
     * 示例 3：
     * 输入：head = [1,2], n = 1
     * 输出：[1]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/remove-nth-node-from-end-of-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) {
            return null;
        }

        ListNode cand = null;
        ListNode ref = head;
        int refIndex = 1;
        while (ref.next != null) {
            if (refIndex == n) {
                cand = head;
            } else if (refIndex > n) {
                cand = cand.next;
            }
            refIndex++;
            ref = ref.next;
        }

        if (cand == null) {
            head = head.next;
        } else if (cand.next.next == null) {
            cand.next = null;
        } else {
            cand.next = cand.next.next;
        }
        return head;
    }

}
