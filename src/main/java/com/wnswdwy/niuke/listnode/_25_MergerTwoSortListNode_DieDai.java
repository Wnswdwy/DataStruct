package com.wnswdwy.niuke.listnode;

/**
 * @author yycstart
 * @create 2021-02-04 12:02
 *
 *      25. 合并两个排序的链表
 *      解决：迭代法
 *
 */
public class _25_MergerTwoSortListNode_DieDai {



    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
