package com.jayqqaa12.tree;

import com.jayqqaa12.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *  同 no.102
 *  不同在于要求 反着遍历
 *
 *  难度1.5星
 *
 */
public class Solution107 {


    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        track(root,list,0);
        Collections.reverse(list);

        return  list;
    }

    private void track(TreeNode root, List<List<Integer>> list, int h) {

        if(root==null)return;

        if(h>= list.size()){
            list.add(h,new ArrayList<>());
        }


        list.get(h).add(root.val);

        track(root.left, list, h + 1);
        track(root.right,list,h+1);

    }
}