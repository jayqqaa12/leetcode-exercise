package com.jayqqaa12.array;


/**
 * 题目：对数组中的每个元素求除自身外的其他元素的乘积
 * 要求：
 * 不能用除法（直接排除了一般思路）
 * 时间复杂度要求线性（排除了遍历依次求解的方法）
 * 空间复杂度要求：额外空间为常数个
 * For example, given [1,2,3,4], return [24,12,8,6].
 *
 * 难度2星
 *
 */
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}