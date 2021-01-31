package com.wnswdwy.niuke.list;/*
package com.wnswdwy.array;

import javax.swing.*;
import java.util.ArrayList;

*/

import java.util.ArrayList;

/**
 * @author yycstart
 * @create 2021-01-29 13:12
 *
 *      6. 从尾到头打印链表
 *      从尾到头反过来打印出每个结点的值。
 */




public class _06_FromGeginPrint_LinkrdList {

    public static void main(String[] args) {



    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> set = new ArrayList<>();
        if(listNode != null){
            set.addAll(printListFromTailToHead(listNode.next));
            set.add(listNode.val);
        }
        return set;
    }
}

class ListNode {
        int val;
        ListNode next = null;ListNode(int val) {
            this.val = val;
        }
    }

