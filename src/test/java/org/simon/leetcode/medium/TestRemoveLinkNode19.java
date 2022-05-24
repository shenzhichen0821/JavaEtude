package org.simon.leetcode.medium;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TestRemoveLinkNode19 {

    public RemoveLinkNode19.ListNode init(int bound, int index) {
        return new RemoveLinkNode19.ListNode(index, index == bound - 1 ? null : init(bound, index + 1));
    }

    @Test
    public void test000() {
        RemoveLinkNode19 rl = new RemoveLinkNode19();

        int bound = 10;
        RemoveLinkNode19.ListNode listNode = init(bound, 0);
        print(bound, listNode);

        RemoveLinkNode19.ListNode res = rl.removeNthFromEnd(listNode, 2);
        print(bound - 1, res);
    }

    @Test
    public void test001() {
        RemoveLinkNode19 rl = new RemoveLinkNode19();

        int bound = 2;
        RemoveLinkNode19.ListNode listNode = init(bound, 0);
        print(bound, listNode);

        RemoveLinkNode19.ListNode res = rl.removeNthFromEnd(listNode, 2);
        print(bound - 1, res);
    }

    @Test
    public void test002() {
        RemoveLinkNode19 rl = new RemoveLinkNode19();

        int bound = 3;
        RemoveLinkNode19.ListNode listNode = init(bound, 0);
        print(bound, listNode);

        RemoveLinkNode19.ListNode res = rl.removeNthFromEnd(listNode, 1);
        print(bound - 1, res);
    }

    @Test
    public void test003() {
        RemoveLinkNode19 rl = new RemoveLinkNode19();

        int bound = 1;
        RemoveLinkNode19.ListNode listNode = init(bound, 0);
        print(bound, listNode);

        RemoveLinkNode19.ListNode res = rl.removeNthFromEnd(listNode, 1);
        print(bound - 1, res);
    }

    private void print(int bound, RemoveLinkNode19.ListNode res) {
        if (bound <= 0) {
            System.out.println("[]");
            return;
        }
        int[] resArray = new int[bound];
        int index = 0;
        while(true) {
            if (res.next == null) {
                resArray[index] = res.val;
                break;
            }
            resArray[index] = res.val;
            res = res.next;
            index++;
        }
        System.out.println(Arrays.toString(resArray));
    }
}
