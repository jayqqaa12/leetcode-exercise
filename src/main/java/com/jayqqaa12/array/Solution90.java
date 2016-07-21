package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 跟 No.78 一样
 * <p>
 * 区别是 包含重复的值
 */
public class Solution90 {


    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List list = new ArrayList<>();

        Arrays.sort(nums);

        dfs(list, new ArrayList(), nums, 0);

        return list;
    }

    private void dfs(List list, ArrayList subList, int[] nums, int start) {

        list.add(new ArrayList<>(subList));


        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1]) continue;

            subList.add(nums[i]);
            dfs(list, subList, nums, i + 1);
            subList.remove(subList.size() - 1);

        }

    }
}
