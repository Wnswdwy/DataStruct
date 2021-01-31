package com.wnswdwy.niuke.tree;


/**
 * @author yycstart
 * @create 2021-01-30 11:36
 *
 *  7. 重建二叉树
 *      输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *      假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *      例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 *      则重建二叉树并返回。
 */
public class _07_GetTreeStruct {
    public static void main(String[] args) {

    }
        //树 递归
        int preindex = 0;
        int inindex = 0;
        public TreeNode07 reConstructBinaryTree ( int[] preorder, int[] inorder){
            return dfs(preorder, inorder, null);
        }

        private TreeNode07 dfs ( int[] preorder, int[] inorder, TreeNode07 finish){
            if (preindex == preorder.length || (finish != null && inorder[inindex] == finish.val))
                return null;
            //遍历过程
            //前序跟左右
            TreeNode07 root = new TreeNode07(preorder[preindex++]);
            //左子树
            root.left = dfs(preorder, inorder, root);
            inindex++;
            //右子树
            root.right = dfs(preorder, inorder, finish);
            return root;

        }

}

class TreeNode07 {
      int val;
    TreeNode07 left;
    TreeNode07 right;
    TreeNode07(int x) { val = x; }
  }
