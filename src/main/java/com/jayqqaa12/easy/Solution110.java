package com.jayqqaa12.easy;


import com.jayqqaa12.TreeNode;

/**
 * 判断二叉树是否 平衡二叉树
 *
 * 难度2星
 *
 * @REVIEW
 *
 */
public class Solution110 {

    public boolean isBalanced(TreeNode root) {

        return getDept(root)!=-1;
    }

    private int getDept(TreeNode root) {

        if(root==null)return 0;

        int lh =getDept(root.left);
        int rh =getDept(root.right);
        if(rh==-1||lh==-1)return -1;
        if(lh-rh<-1||lh-rh>1)return -1;

        return Math.max(rh,lh)+1;
    }


}