package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算根节点到所有子节点的和
 * <p>
 * For example,
 * 1
 * / \
 * 2   3
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * Return the sum = 12 + 13 = 25.
 * <p>
 * 难度2星
 */
public class Solution129 {



    public int sumNumbers2(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode n, int s){
        if (n == null) return 0;
        if (n.right == null && n.left == null) return s*10 + n.val;
        return sum(n.left, s*10 + n.val) + sum(n.right, s*10 + n.val);
    }


    /**
     * 一开始想到的办法
     * @param root
     * @return
     */
    public int sumNumbers(TreeNode root) {

        List<String> list = new ArrayList<>();

        dfs(root, "0", list);

        int sum = 0;
        for (String str : list) {
            sum += Integer.parseInt(str);
        }
        return sum;
    }

    private void dfs(TreeNode root, String s, List<String> list) {
        if (root == null) return;
        s += root.val;

        if (root.left == null && root.right == null) {
            list.add(s);
            return;
        }

        dfs(root.left, new String(s), list);
        dfs(root.right, new String(s), list);

    }


}