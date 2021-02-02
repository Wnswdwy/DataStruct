package com.wnswdwy.niuke.list;

/**
 * @author yycstart
 * @create 2021-02-02 11:17
 *      24. 给定一个单链表，将其反转
 *      方案一： 双指针
 */
public class _24_ReverseLinkedList {

    public ListNode24 reverseList(ListNode24 head) {
        ListNode24 pre = null;
        ListNode24 cur = head;

        while (cur != null){
            ListNode24 temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;

        }
        return pre;
    }

}

class ListNode24 {
    int val;
    ListNode24 next;
    ListNode24(int x) { val = x; }
}

