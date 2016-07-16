package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;


/**
 *
 * 求二叉树的 LCA
 *
 *
 * 难度2星
 *
 */
public class Solution236 {



    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null|| p==root|| q==root )return  root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right =lowestCommonAncestor(root.right,p,q);
        if(left!=null &&right!=null) return root;

        return left!=null?left:right;
    }
}