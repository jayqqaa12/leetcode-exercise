package com.jayqqaa12.tree;


import com.jayqqaa12.TreeNode;

/**
 * 给一个数值 sum
 * <p>
 * 求是否有根节点到子节点的路径和 等于 sum
 * <p>
 * 难度 2星
 *
 * @REVIEW
 */
public class Solution112 {


    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        if(root.left==null&& root.right==null &&(root.val-sum==0))return true;

        return  hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);

    }



}