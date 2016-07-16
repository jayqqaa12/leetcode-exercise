package com.jayqqaa12.statck;

import com.jayqqaa12.TreeNode;

import java.util.Stack;


/**
 * 遍历BST
 *
 * 难度2星
 *
 */
public class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        putAll(root);
    }
    private void putAll(TreeNode root) {

        while (root!=null){
            stack.push(root);
            root=root.left;
        }
    }
    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return  !stack.isEmpty();
    }
    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode node=  stack.pop();
        stack.push(node.right);
        return  node.val;
    }


}