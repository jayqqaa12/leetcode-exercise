package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
     *
     * 同no.46
     *
     * 不同之处在与 数组数字可能相同
     *
     * 难度 2.5星
     *
     * @REVIEW
     */
    public   class Solution47 {
        public List<List<Integer>> permuteUnique(int[] nums) {
            List list = new ArrayList<>();

            Arrays.sort(nums);
            boolean[] visited = new boolean[nums.length];
            dfs(list, new ArrayList(), nums, visited);

            return list;
        }


        private void dfs(List list, ArrayList subList, int[] nums, boolean[] visits) {

            if (subList.size() == nums.length) {
                list.add(new ArrayList<>(subList));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if(visits[i])continue;

                if(i>0&& nums[i]==nums[i-1] &&!visits[i-1])continue; //关键一句 判断 i-1的是否相同 过滤掉重复的排序

                visits[i]=true;
                subList.add(nums[i]);
                dfs(list, subList, nums, visits);
                subList.remove(subList.size()-1);
                visits[i]=false;
            }

        }
    }