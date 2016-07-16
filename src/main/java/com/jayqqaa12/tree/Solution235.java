package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;


/**
 * BST 求 LCA 最低的公共祖先
 *
 * 难度1星
 *
 */
public class Solution235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        if(root.val>p.val &&root.val>q.val)return  lowestCommonAncestor(root.left,p,q);
        else if(root.val<p.val&&root.val<q.val)return  lowestCommonAncestor(root.right,p,q);
        else return root;

    }
}