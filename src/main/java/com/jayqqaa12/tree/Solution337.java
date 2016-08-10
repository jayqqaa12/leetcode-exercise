package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

/**
 * 不能同时访问父子节点 求最大值
 * <p>
 * 难度2星
 */
public class Solution337 {

    /**
     * 计算一下 偶数行和奇数行 哪个大就行了
     *
     * @param root
     * @return
     */
    public int rob(TreeNode root) {
        if (root == null) return 0;

        int val = 0;

        if (root.left != null) {
            val += rob(root.left.left) + rob(root.left.right);
        }

        if (root.right != null) {
            val += rob(root.right.left) + rob(root.right.right);
        }

        return Math.max(val + root.val, rob(root.left) + rob(root.right));

    }
}