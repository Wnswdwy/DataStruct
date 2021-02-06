package com.wnswdwy.niuke.tree;

import com.wnswdwy.niuke._bean.TreeNode;

import java.util.*;

/**
 * @author yycstart
 * @create 2021-02-06 11:05
 *
 *      32 - III. 从上到下打印二叉树 III
 */
public class _32_3_FromUpToDownAndZhiZiXingPrintTree1 {


    public ArrayList<ArrayList<Integer> > Print(TreeNode root) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;
        while (!q.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = q.size();
            while (cnt-- > 0) {
                TreeNode node = q.poll();
                if (node == null)
                    continue;
                list.add(node.val);
                q.add(node.left);
                q.add(node.right);
            }
            if (reverse)
                Collections.reverse(list);
            reverse = !reverse;
            if (list.size() != 0)
                res.add(list);
        }
        return res;
    }
}
