package com.wnswdwy.niuke.stack;

import java.util.Stack;

/**
 * @author yycstart
 * @create 2021-02-05 14:19
 *      31.栈的压入和弹出判断
 *          B是不是A弹栈的顺序
 */
public class _31_StackB_IsWhether_StackA_Pop {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> temp = new Stack<>();
        int i = 0;
        for(int num : pushA){
            temp.add(num);
            while(!temp.isEmpty() && temp.peek() == popA[i]){
                temp.pop();
                i++;
            }
        }
        return temp.isEmpty();
    }
}
