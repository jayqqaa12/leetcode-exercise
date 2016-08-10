package com.jayqqaa12.dp;


/**
 *
 * 从数组中找到 最大乘积
 *
 * 难度2星
 *
 *
 */
public class Solution152 {

    /**
     * 保留最大值会最小值
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int max =nums[0],min=nums[0],rst=nums[0];

        for (int i = 0; i < nums.length; i++) {
            int temp =max;
            max = Math.max(Math.max(min*nums[i], nums[i]*max),nums[i]);
            min  = Math.min(Math.min(min*nums[i], nums[i]*temp),nums[i]);
            rst = Math.max(rst,max);
        }

        return  rst;
    }
}