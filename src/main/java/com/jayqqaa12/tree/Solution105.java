package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import javax.swing.*;


/**
 * 给定 先序 遍历 和中序遍历 (不存在相同的值的情况)
 * 构建二叉树
 * <p>
 * 难度2星
 */
public class Solution105 {


    /**
     * 1.确定root
     * 2.通过root 确定 左右子树
     * 3.重复上面步骤
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(0, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode build(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {

        if (inStart > inEnd) return null;

        TreeNode node = new TreeNode(preorder[preStart]);
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == node.val) inIndex = i;
        }

        node.left = build(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        node.right = build(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);

        return node;
    }

}