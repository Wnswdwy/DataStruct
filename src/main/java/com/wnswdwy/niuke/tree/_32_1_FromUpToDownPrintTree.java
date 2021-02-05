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
 *       返回值为集合
 */
public class _32_1_FromUpToDownPrintTree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();
        //对列操作 保存根节点
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int cnt = ans.size();
            while(cnt-- >= 0){
                //根节点
                TreeNode r = q.poll();
                if(r == null) continue;
                ans.add(r.val);
                //左子树
                q.add(r.left);
                //右子树
                q.add(r.right);
            }
        }
        return ans;
    }
}
