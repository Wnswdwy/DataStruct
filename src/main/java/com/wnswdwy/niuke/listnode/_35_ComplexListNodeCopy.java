package com.wnswdwy.niuke.listnode;

import com.wnswdwy.niuke._bean.Node;

/**
 * @author yycstart
 * @create 2021-02-06 13:21
 *      35. 复杂链表的复制
 *              题目描述
 *              输入一个复杂链表（每个节点中有节点值，以及两个指针，
 *           一个指向下一个节点，另一个特殊指针指向任意一个节点），
 *           返回结果为复制后复杂链表的 head。
 */
public class _35_ComplexListNodeCopy {

    /*
   实现步骤：
       1. 复制指针

       2. 确定random指针

       3. 分离原Node和复制后Node
   */
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        copy(head); //创建 copy
        copyRandom(head); //复制random指针
        return divide(head); //分离出来
    }
    private void copy(Node head){
        while(head != null){
            Node clone = new Node(head.val);
            Node nextNode = head.next;
            head.next = clone;
            clone.next = nextNode;
            head = clone.next;
        }
    }

    private void copyRandom(Node head){
        while(head != null){
            Node clone = head.next;
            if(head.random != null){
                Node randomNode = head.random;
                clone.random = randomNode.next;
            }else{
                clone.random = null;
            }
            head = clone.next;
        }
    }

    private Node divide(Node head){
        Node cloneNode = head.next;
        Node cloneHead = cloneNode;
        head.next = cloneNode.next;
        head = head.next;
        while(head != null){
            cloneNode.next = head.next;
            head.next = head.next.next;
            head = head.next;
            cloneNode = cloneNode.next;
        }

        return cloneHead;
    }
}
