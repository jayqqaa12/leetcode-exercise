package com.jayqqaa12.math;


import java.util.Arrays;

/**
 * 从 0到 n的 序列 找出 数组缺少的元素 (数字不重复)
 * For example,
 * Given nums = [0, 1, 3] return 2.
 */
public class Solution268 {

    /**
     * 正常思路
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i)return  i;
        }
        return nums.length;
    }


    /**
     * 位方式
     * @param nums
     * @return
     */
    public int missingNumber2(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }


}