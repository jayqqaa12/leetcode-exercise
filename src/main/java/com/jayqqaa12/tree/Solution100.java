package com.jayqqaa12.tree;


import com.jayqqaa12.TreeNode;

/**
 * 判断2个二叉树 是否完全一样 （结构和值）
 * <p>
 * 难度1.5星
 *
 **/

public class Solution100 {


    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val == q.val)
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);

        return false;


    }


}