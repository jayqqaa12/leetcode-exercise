package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

/**
 * 给定中序遍历和 后序遍历 构建二叉树
 * <p>
 * 难度2星
 */
public class Solution106 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(postorder.length - 1, inorder.length - 1, 0, postorder, inorder);
    }

    public TreeNode build(int postStart, int inStart, int inEnd, int[] postorder, int[] inorder) {
        if (inEnd > inStart) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postStart]);

        int index = 0;
        for (int i = inStart; i >= inEnd; i--) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }

        root.left = build(postStart - (inStart - index) - 1, index - 1, inEnd, postorder, inorder);
        root.right = build(postStart - 1, inStart, index + 1, postorder, inorder);

        return root;
    }
}
