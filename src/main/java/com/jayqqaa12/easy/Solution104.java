package com.jayqqaa12.easy;

import com.jayqqaa12.TreeNode;

/**
 * 求二叉树 深度
 * 难度 1星
 */
public class Solution104 {


    /**
     * DFS
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(maxDepth(root.right),maxDepth(root.left))+1;
    }



}
