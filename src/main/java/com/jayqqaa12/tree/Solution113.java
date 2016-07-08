package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到所有 节点路径和 为sum
 * 的组合
 * <p>
 * 难度2星
 */
public class Solution113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List list = new ArrayList<>();

        dfs(list, new ArrayList(), root, sum);

        return list;
    }


    private void dfs(List list, ArrayList subList, TreeNode root, int sum) {
        if (root == null) return;

        subList.add(root.val);
        sum -= root.val;

        if (root.right == null && root.left == null) {
            if (sum == 0) list.add(new ArrayList<>(subList));
            return;
        }

        dfs(list, new ArrayList(subList), root.left, sum);
        dfs(list, new ArrayList(subList), root.right, sum);


    }
}