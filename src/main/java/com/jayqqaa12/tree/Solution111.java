package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;


/**
 * 求二叉树  根节点到 子节点的 最小节点数
 * <p>
 * 难度1星
 */
public class Solution111 {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
}