package com.wnswdwy.niuke.listnode;

/**
 * @author yycstart
 * @create 2021-02-02 11:17
 *      24. 给定一个单链表，将其反转
 *      方案一： 双指针
 */
public class _24_ReverseLinkedList_2 {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

}


