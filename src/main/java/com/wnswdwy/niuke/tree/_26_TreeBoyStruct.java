package com.wnswdwy.niuke.tree;


import com.wnswdwy.niuke._bean.TreeNode;

/**
 * @author yycstart
 * @create 2021-02-04 12:35
 *
 *      26.树的子结构
 */
public class _26_TreeBoyStruct {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        return isTree(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
   private static boolean isTree(TreeNode root1,TreeNode root2){
        if(root2 == null) return true;
        if(root1 == null || root1.val != root2.val) return false;
        return isTree(root1.left,root2.left) && isTree(root1.right,root2.right);
    }
}
