package com.wnswdwy.niuke.tree;

import com.wnswdwy.niuke._bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yycstart
 * @create 2021-02-06 13:02
 *      34. 二叉树中和为某一值的路径
 *      题目描述
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class _34_TwoTreeSumWayIsOneTarget {

    //前序遍历 根左右
    //所有路径
    LinkedList<List<Integer>> res = new LinkedList<>();
    //单条路径
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        //递归函数
        recur(root,sum);
        return res;
    }
    void recur(TreeNode root,int target){
        //找到 target == 0 时候的叶节点
        if(root == null) return ;
        path.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            res.add(new LinkedList(path));
        recur(root.left,target);
        recur(root.right,target);
        //每次结束后，path必须清空
        path.removeLast();
    }
}
