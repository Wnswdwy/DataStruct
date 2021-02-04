package com.wnswdwy.niuke.listnode;


import java.util.ArrayList;
import java.util.Stack;

/**
 * @author yycstart
 * @create 2021-01-29 13:12
 *
 *      6. 从尾到头打印链表
 *      从尾到头反过来打印出每个结点的值。
 */




public class _06_FromGeginPrint_LinkrdList_Int {

    public static void main(String[] args) {


    }

    class Solution {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        public int[] reversePrint(ListNode head) {
            recur(head);
            int[] res = new int[tmp.size()];
            for(int i = 0; i < res.length; i++)
                res[i] = tmp.get(i);
            return res;
        }
        void recur(ListNode head) {
            if(head == null) return;
            recur(head.next);
            tmp.add(head.val);
        }
    }
}
