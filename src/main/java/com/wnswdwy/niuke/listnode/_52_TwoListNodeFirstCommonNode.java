package com.wnswdwy.niuke.listnode;

/**
 * @author yycstart
 * @create 2021-02-18 18:27
 *
 *          52. 输入两个链表，找出它们的第一个公共节点。
 */
public class _52_TwoListNodeFirstCommonNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA,l2 = headB;
        while(l1 != l2){
            l1 = (l1 == null) ? headA:l1.next;
            l2 = (l2 == null) ? headB:l2.next;
        }
        return l2;
    }
}
