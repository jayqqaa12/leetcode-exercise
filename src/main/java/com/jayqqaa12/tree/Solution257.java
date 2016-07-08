package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * 输出所有根到子节点的路径
 *
 * For example, given the following binary tree:
 *    1
 *  /   \
 * 2     3
 * \
 * 5
 * ["1->2->5", "1->3"]
 */
public class Solution257 {

    public List<String> binaryTreePaths(TreeNode root) {

        List list =new ArrayList<>();

        dfs(list,"",root);

        return  list;
    }

    private void dfs(List list, String s, TreeNode root) {

        if(root==null)return;

        s+= s==""?root.val:"->" +root.val;

        if(root.left==null&&root.right==null){
            list.add(s);
            return;
        }

        dfs(list,s,root.left);
        dfs(list,s,root.right);
    }
}