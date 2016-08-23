package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.List;


/**
 * 从数组中找到 相加结果为 target的数
 * 数组的数可以使用多次
 * <p>
 * For example, given candidate set [2, 3, 6, 7] and target 7,
 * [
 * [7],
 * [2, 2, 3]
 * ]
 * <p>
 * 难度2.5星
 */
public class Solution39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List list = new ArrayList<>();
        dfs(list,new ArrayList<>(),target,candidates,0);

        return list;
    }

    private void dfs(List list, ArrayList  subList, int target, int[] candidates, int start) {


        if(target>0){
            for (int i = 0; i < candidates.length; i++) {

                subList.add(candidates[i]);
                dfs(list,subList,target-candidates[i],candidates,i); //因为可以用多次 i 不增加
                subList.remove(subList.size()-1);
            }
        }
        else if(target==0){

            list.add(new ArrayList<>(subList));
        }
    }


}