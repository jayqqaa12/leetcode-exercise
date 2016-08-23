package com.jayqqaa12;

public class InsertNodeBST {

    public TreeNode insertNode(TreeNode root, TreeNode node) {
        if (node == null || root == null) return node;

        TreeNode dummy = root;

        while (root != null) {
            if (node.val < root.val) {
                if (root.left == null) {
                    root.left = node;
                    break;
                }
                root = root.left;
            } else  {
                if (root.right == null) {
                    root.right = node;
                    break;
                }
                root = root.right;
            }
        }
        return dummy;
    }
}