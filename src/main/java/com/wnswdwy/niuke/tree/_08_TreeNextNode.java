package com.wnswdwy.niuke.tree;

import javax.swing.tree.TreeNode;

/**
 * @author yycstart
 * @create 2021-01-31 12:01
 *
 *      8. 二叉树的下一个结点

 *      题目描述
 *      给定一个二叉树和其中的一个结点，
 *      请找出中序遍历顺序的下一个结点并且返回。
 *      注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class _08_TreeNextNode {


    public static TreeNode08 inorderSuccessor(TreeNode08 p){
        //左 根 右
        //中序遍历特点
        //一个结点 有右子树，返回一定是右子树 最左边的结点
        if(p.right != null){
            p = p.right;
            while (p.left != null)
                p = p.left;
            return p;
        }
        //如果没有右子树 返回的是父结点
        while (p.father != null){
            if(p == p.father.left) {
                return p.father;
            }else{
                p = p.father;
            }
        }
        return null;
    }
}

class TreeNode08 {
    int val;
    TreeNode08 left;
    TreeNode08 right;
    TreeNode08 father;
    TreeNode08(int i){val = i;}
}