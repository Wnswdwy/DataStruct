package com.wnswdwy.niuke.listnode;

import java.util.HashSet;

/**
 * @author yycstart
 * @create 2021-02-03 14:25
 */
public class _23_RingEntryNode_SlowFastSolution {


    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead, fast = pHead;
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while (slow != fast);
        fast = pHead;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
