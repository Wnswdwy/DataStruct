package com.wnswdwy.niuke.listnode;

/**
 * @author yycstart
 * @create 2021-02-03 12:40
 *   18. 删除链表的节点
 */
public class _18_DelectListNodeOne {

    public ListNode deleteNode(ListNode head, int val) {

        //当前的结点指向当前结点的下一个结点，就删除了当前结点

        //当第一个结点就是要删除的结点
        if(head.val == val) return head.next;
        ListNode pre = head;
        ListNode cur = head.next;
        //指针后移，寻找val结点
        while(cur.val != val && cur != null){
            pre = cur;
            cur = cur.next;
        }

        //找到val或者走到头
        if(cur != null ){
            pre.next = cur.next;
        }
        return head;
    }
}
