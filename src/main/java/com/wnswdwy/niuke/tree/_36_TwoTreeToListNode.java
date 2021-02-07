package com.wnswdwy.niuke.tree;

import com.wnswdwy.niuke._bean.TreeNode;

/**
 * @author yycstart
 * @create 2021-02-07 14:36
 *    36.将一个二叉树转换成一个双向链表
 *      输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 *      要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class _36_TwoTreeToListNode {

    TreeNode head = null;
    TreeNode realHead = null;
    public TreeNode Convert(TreeNode root) {
        dfs(root);
        return realHead;
    }

    private void dfs(TreeNode root) {
        if(root==null) return;
        dfs(root.left);
        if (head == null) {
            head = root;
            realHead = root;
        } else {
            head.right = root;
            root.left = head;
            head = root;
        }
        dfs(root.right);
    }
}
