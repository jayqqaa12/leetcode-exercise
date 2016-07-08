package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

/**
 * 转化数组为 BST  (数组已排序 asc)
 * <p>
 * 难度2星
 */
public class Solution108 {

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums==null||nums.length==0)return null;

        return bulid(0,nums.length-1, nums);

    }

    private TreeNode bulid(int low,int high, int[] nums) {

        if(low>high)return null;

        int mid =  (low+high)/2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left= bulid(low,mid-1,nums);
        node.right= bulid(mid+1,high,nums);

        return node;
    }
}