package com.wnswdwy.niuke.tree;

import com.wnswdwy.niuke._bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yycstart
 * @create 2021-02-05 14:22
 *      32 - I. 从上到下打印二叉树
 *      从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 *
 *      返回值为数组
 */
public class _32_1_FromUpToDownPrintTree2 {

    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];

        ArrayList<Integer> ans = new ArrayList<>();
        //队列操作，遍历根节点
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            //根节点
            TreeNode r = q.poll();
            ans.add(r.val);
            //左子树
            if(r.left != null) q.add(r.left);
            //右子树
            if(r.right != null) q.add(r.right);
        }

        int[] res = new int[ans.size()];

        for(int i = 0;i < ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
