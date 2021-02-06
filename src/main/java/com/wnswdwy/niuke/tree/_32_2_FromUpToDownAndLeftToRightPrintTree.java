package com.wnswdwy.niuke.tree;

import com.wnswdwy.niuke._bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yycstart
 * @create 2021-02-06 10:59
 *       32 - II. 从上到下打印二叉树 II
 *       从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 */
public class _32_2_FromUpToDownAndLeftToRightPrintTree {


    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) q.add(root);
        while(!q.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for(int i = q.size(); i > 0; i--) {
                TreeNode r = q.poll();
                tmp.add(r.val);
                if(r.left != null) q.add(r.left);
                if(r.right != null) q.add(r.right);
            }
            res.add(tmp);
        }
        return res;
    }
}
