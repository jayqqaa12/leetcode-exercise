package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * 遍历二叉树
 * <p>
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 *
 * 难度1星
 */
public class Solution102 {


    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        track(root,list,0);


        return  list;
    }

    private void track(TreeNode root, List<List<Integer>> list, int h) {

        if(root==null)return;

        if(h>= list.size()){
            list.add(h,new ArrayList<>());
        }


        list.get(h).add(root.val);

        track(root.left, list, h + 1);
        track(root.right,list,h+1);

    }
}