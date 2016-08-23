package com.jayqqaa12;

import java.util.ArrayList;
import java.util.Stack;


/**
 * 给定两个值 k1 和 k2（k1 < k2）和一个二叉查找树的根节点。
 * 找到树中所有值在 k1 到 k2 范围内的节点。即打印所有x (k1 <= x <= k2) 其中 x 是二叉查找树的中的节点值。返回所有升序的节点值
 */
public class SearchRangeInBinarySearchTree {

    /**
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    public ArrayList<Integer> searchRange2(TreeNode root, int k1, int k2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.val < k1 ? null : root.left;
            } else {
                root = stack.pop();
                if (k1 <= root.val && root.val <= k2) {
                    result.add(root.val);
                }
                root = root.val > k2 ? null : root.right;
            }
        }
        return result;
    }

/*****************************************************************************/

    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        dfs(result, root, k1, k2);
        return result;
    }

    public void dfs(ArrayList<Integer> result, TreeNode root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.val >= k1) {
            dfs(result, root.left, k1, k2);
        }
        if (k1 <= root.val && root.val <= k2) {
            result.add(root.val);
        }
        if (root.val <= k2) {
            dfs(result, root.right, k1, k2);
        }
    }
    
}