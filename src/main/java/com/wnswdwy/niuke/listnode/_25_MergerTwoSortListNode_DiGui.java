package com.wnswdwy.niuke.listnode;

/**
 * @author yycstart
 * @create 2021-02-04 12:02
 *
 *      25. 合并两个排序的链表
 *      解决：递归
 *
 */
public class _25_MergerTwoSortListNode_DiGui {

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null)
            cur.next = list1;
        if (list2 != null)
            cur.next = list2;
        return head.next;
    }
}
