package com.wnswdwy.niuke.tree;

import com.wnswdwy.niuke._bean.TreeNode;

import java.util.*;

/**
 * @author yycstart
 * @create 2021-02-06 11:05*
 *      32 - III. 从上到下打印二叉树 III
 */
public class _32_3_FromUpToDownAndZhiZiXingPrintTree2 {



    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            if(root != null) q.add(root);
            while(!q.isEmpty()){
                LinkedList<Integer> temp = new LinkedList<>();
                int s = q.size();
                for(int i = 0; i < s; i++){
                    TreeNode node = q.poll();
                    if(res.size() % 2 == 0)
                        temp.addLast(node.val);
                    else
                        temp.addFirst(node.val);
                    if(node.left != null) q.add(node.left);
                    if(node.right != null) q.add(node.right);
                }
                res.add(temp);
            }
            return res;
        }
    }
}
