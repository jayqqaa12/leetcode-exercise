package com.jayqqaa12.array;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 找到出现次数超过 一半的数
 *
 * 难度1星
 *
 */
public class Solution169 {


    /**
     * 最优解
     * @param num
     * @return
     */
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]) count++;
            else count--;

        }
        return major;
    }

    /**
     * 思路1 最好想到
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);

            if (map.get(nums[i]) > nums.length / 2) return nums[i];
        }
        return  -1;
    }


    /**
     * 求 1~n 的数组 组成长度为k的数组的所有结果集
     * input n = 4 and k = 2
     * output:
     * [
     * [2,4],
     * [3,4],
     * [2,3],
     * [1,2],
     * [1,3],
     * [1,4],
     * ]
     * <p>
     * 难度2星
     */
    public static class Solution77 {


        public List<List<Integer>> combine(int n, int k) {

            List list = new ArrayList<>();
            dfs(list, new ArrayList(), 1, n, k);
            return list;

        }

        private void dfs(List list, ArrayList subList, int start, int n, int k) {
            if (k == 0) {
                list.add(new ArrayList<>(subList));
                return;
            }
            for (int i = start; i <= n; i++) {
                subList.add(i);
                dfs(list, subList, i + 1, n, k - 1);
                subList.remove(subList.size() - 1);
            }
        }
    }
}