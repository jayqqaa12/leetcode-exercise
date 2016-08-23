package com.jayqqaa12;

import java.util.ArrayList;


/**
 * 给定一个整数数组，找出两个 不重叠 子数组使得它们的和最大。
 * 每个子数组的数字在数组中的位置应该是连续的。
 * 返回最大的和。
 */
public class MaximumSubarrayII {


    /**
     * 可分割为2个数组 再求 子数组最大值
     *
     * @param nums
     * @return
     */
    public int maxTwoSubArrays(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0;

        int preSum = 0;
        int minPreSum = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.size();
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            preSum += nums.get(i);
            max = Math.max(max, preSum - minPreSum);
            minPreSum = Math.min(minPreSum, preSum);
            left[i] = max;
        }
        preSum = 0;
        minPreSum = 0;
        max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            preSum += nums.get(i);
            max = Math.max(max, preSum - minPreSum);
            minPreSum = Math.min(minPreSum, preSum);
            right[i] = max;
        }
        max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int rst = left[i] + right[i + 1];
            max = Math.max(max, rst);
        }

        return max;
    }
}