package com.wnswdwy.niuke.listnode;

/**
 * @author yycstart
 * @create 2021-02-02 11:17
 *      24. 给定一个单链表，将其反转
 *      方案一： 双指针
 */
public class _24_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;

        }
        return pre;
    }

}

