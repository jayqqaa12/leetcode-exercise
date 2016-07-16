package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * 求二叉树的
 *
 * 每层的 最后一个节点的集合
 *
 * 难度2星
 *
 */
public class Solution199 {

    public List<Integer> rightSideView(TreeNode root) {

        List list =new ArrayList<>();
        dfs(root,list,0);
        return  list;
    }

    private void dfs(TreeNode root, List list, int dept) {

        if(root==null)return;

        if(dept==list.size()) list.add(root.val);
        dfs(root.left,list,dept+1);
        dfs(root.left,list,dept+1);
    }
}