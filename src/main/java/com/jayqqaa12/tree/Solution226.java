package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

/**
 * 反转 二叉树的 子节点
 *
 * 难度1星
 */
public class Solution226 {


    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp= root.left;
        root.left= root.right;
        root.right=temp;

        return  root;
    }
}