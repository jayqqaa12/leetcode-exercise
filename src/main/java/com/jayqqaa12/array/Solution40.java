package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 *
 * 题目跟 mo.39 一样 不同条件是
 * 数组里的是数字只能使用一次
 * 难度2.5星
 *
 */
public class Solution40 {


    /**
     * 算法跟 no.39 基本一样
     *
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List list =new ArrayList<>();
        Arrays.sort(candidates);
        dfs(list, new ArrayList(), target, candidates, 0);

        return list;

    }

    private void dfs(List list, ArrayList subList, int target, int[] candidates, int start) {

        if(target>0){

            for (int i = start; i < candidates.length;) {

                subList.add(candidates[i]);
                dfs(list,subList,target-candidates[i],candidates,++i); //不同点 因为只能用一次所以 ++i
                subList.remove(subList.size()-1);
            }


        }
        if(target==0){
            if(!list.contains(subList)){  //不同点
                list.add(new ArrayList<>(subList));
            }
        }

    }
}