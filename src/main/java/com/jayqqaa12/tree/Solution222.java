package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;


/**
 * 求完全二叉树的 节点数
 */
public class Solution222 {



    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        TreeNode left = root, right = root;
        int height = 0;
        while (right != null) {
            left = left.left;
            right = right.right;
            height++;
        }
        if (left == null)
            return (1 << height) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }



    /**
     * 一开始的思路 超时
     *
     * @param root
     * @return
     */
    public int countNodes2(TreeNode root) {

        if (root == null) return 0;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }


}