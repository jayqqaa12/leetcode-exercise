package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

/**
 * 求BST 第K个最小值
 */
public class Solution230 {


    /**
     * 先算出 left 节点数量
     * 然后比较 k 和节点数 找到处于的位置
     *
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {

        int c = countNodes(root.left);

        if(c>=k)return kthSmallest(root.left,k);
        else if(c+1<k)return kthSmallest(root.right,k-1-c);

        return  root.val;
    }

    private int countNodes(TreeNode node) {

        if(node==null)return  0;
        return  countNodes(node.left)+countNodes(node.right)+1;
    }
}