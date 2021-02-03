package com.wnswdwy.niuke.stack;

import java.util.Stack;

/**
 * @author yycstart
 * @create 2021-01-31 12:15
 */
public class _09_UseTwoStackAchieveQueue {
}



class CQueue{
    //栈：先进后出
    //队列：先进后出
    Stack<Integer> sk1,sk2;
    int size;

    public CQueue(){
        sk1 = new Stack<Integer>();
        sk2 = new Stack<Integer>();
        size = 0;
    }

    public void appendTail(int value){
        //插入一个元素，
        //sk1保存 底部存新插入的 顶部存旧的
        while (!sk1.isEmpty()){
            sk2.push(sk1.pop());
        }
        sk1.push(value);
        while (!sk2.isEmpty()){
            sk1.push(sk2.pop());
        }
        size ++;
    }

    public int deleteHead(){
        if (size == 0){
            return -1;
        }
        int res = sk1.pop();
        size --;
        return res;
    }
}
