package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * 同No.102
 *
 * 不同点在于 顺序会 来回反转
 *
 * 难度2星
 *
 */
public class Solution103 {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        track(root, list, 0);

        return list;
    }

    private void track(TreeNode root, List<List<Integer>> list, int h) {

        if (root == null) return;

        if (h >= list.size()) {
            list.add(h, new ArrayList<>());
        }

        if(h%2==0)  list.get(h).add(root.val);
        else list.get(h).add(0,root.val);

        track(root.left, list, h + 1);
        track(root.right, list, h + 1);


    }
}