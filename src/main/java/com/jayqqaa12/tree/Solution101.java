package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 检测二叉树是否是对称的  (结构是相对的 值也是相对的)
 * For example,  [1,2,2,3,4,4,3]
 * <p>
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * 难度2星
 */
public class Solution101 {

    public boolean isSymmetric(TreeNode root) {

        if(root==null)return  true;

        return isSameTree(root.left,root.right);

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val == q.val)
            return isSameTree(p.right, q.left) && isSameTree(p.left, q.right);

        return false;
    }

    /**
     * 中序遍历  不使用递归
     * <p>
     * 难度 2星
     */
    public static class Solution94 {


        public List<Integer> inorderTraversal(TreeNode root) {
            List list = new ArrayList<>();

            Stack<TreeNode> stack = new Stack();

            TreeNode node =root;
            while (node!=null||!stack.isEmpty()) {

                while (node!=null){
                    stack.push(node);
                    node= node.left;
                }
                node =stack.pop();
                list.add(node.val);
                node = node.right;
            }

            return list;
        }

        /**
         * 递归方式很简单
         *
         * @param root
         */
        public List<Integer> inorderTraversal2(TreeNode root) {

            List list = new ArrayList<>();
            traversal(list, root);
            return list;
        }


        private void traversal(List list, TreeNode root) {

            if (root == null) return;
            traversal(list, root.left);
            list.add(root.val);
            traversal(list, root.right);
        }
    }
}