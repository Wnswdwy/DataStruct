package com.wnswdwy.niuke.tree;

import com.wnswdwy.niuke._bean.TreeNode;

/**
 * @author yycstart
 * @create 2021-02-04 15:02
 *       27. 二叉树的镜像
 *       二叉树的对称二叉树 （左子树和右子树交换位置）
 */
public class _27_ExchangeLeftAndRightTree {

    public void Mirror(TreeNode root) {
        if(root == null)
            return;

        if(root.left == null && root.right == null)
            return;

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        if(root != null)     Mirror(root.left);
        if(root != null)     Mirror(root.right);

    }
}
