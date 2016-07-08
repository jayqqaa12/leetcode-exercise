package com.jayqqaa12.array;


/**
 * 从数组中找到 子集 使其和最大 返回最大值
 * <p>
 * 难度2星
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum =0;


        for (int i = 0; i < nums.length; i++) {

            if(sum<0)sum = nums[i];
            else sum+= nums[i];

            max =Math.max(sum,max);
        }

        return max;
    }
}