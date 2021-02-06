package com.wnswdwy.niuke.tree;

import java.util.Stack;

/**
 * @author yycstart
 * @create 2021-02-06 12:01
 *      33. 二叉搜索树的后序遍历序列
 *      题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 假设输入的数组的任意两个数字都互不相同。
 */
public class _33_TwoTreeSearchTreeBehind {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        Stack<Integer> stackmin = new Stack<Integer>();
        int maxLimit = Integer.MAX_VALUE;
        stackmin.push(sequence[sequence.length-1]);
        for(int i = sequence.length-1 ; i >=0 ; i--){
            if(sequence[i] > maxLimit) {
                return false;
            }else{
                while (!stackmin.isEmpty()&&sequence[i]<stackmin.peek()){
                    maxLimit = stackmin.peek();
                    stackmin.pop();
                }
                stackmin.push(sequence[i]);
            }
        }
        return true;
    }
}
