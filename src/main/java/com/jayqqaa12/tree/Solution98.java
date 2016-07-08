package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;


/**
 * 验证 tree 是否为 BST
 * <p>
 * 难度2星
 */
public class Solution98 {
    public boolean isValidBST(TreeNode root) {

        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root,  long minValue ,long maxValue) {

        if(root==null)return true;
        if(root.val>=maxValue ||root.val<=minValue)return false;

        return  isValidBST(root.left,minValue,root.val)&&isValidBST(root.right,root.val,maxValue);

    }


}