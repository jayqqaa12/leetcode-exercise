package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 返回先序遍历
 *
 * 使用 迭代方式
 *
 * 难度2星
 */
public class Solution144 {




    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                result.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return result;
    }



    /**
     * 递归方式
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root) {

        List list =new ArrayList<>();

        traver(list,root);

        return list;

    }

    private void traver(List list, TreeNode root) {

        if(root==null)  return;


        list.add(root.val);

        traver(list,root.left);
        traver(list,root.right);

    }
}