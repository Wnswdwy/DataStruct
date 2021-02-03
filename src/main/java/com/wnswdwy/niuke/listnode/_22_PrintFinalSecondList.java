package com.wnswdwy.niuke.listnode;

/**
 * @author yycstart
 * @create 2021-02-01 13:32
 *
 *      22. 链表中倒数第 K 个结点
 *      输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，
 *      即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，
 *      它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 *
 */
public class _22_PrintFinalSecondList {


    public ListNode22 getKthFromEnd(ListNode22 head, int k) {
        ListNode22 first = head;
        ListNode22 second = head;

        for(int i = 0; i < k; i++){
            if(first == null)
                return null;
            first = first.next;
        }

        while(first != null){
            first = first.next;
            second = second.next;
        }

        return second;
    }
}


class ListNode22 {
    int val;
    ListNode22 next = null;

    ListNode22(int val) {
        this.val = val;
    }
}
