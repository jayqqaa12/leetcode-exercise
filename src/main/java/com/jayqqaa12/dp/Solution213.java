package com.jayqqaa12.dp;

/**
 * no.198 一样
 * 升级为 圆球形 最后一个和 第一个也是邻居
 * <p>
 * 如何获得最多的钱
 * <p>
 * 难度2.5星
 */
public class Solution213 {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    public int rob(int[] nums, int lo, int hi) {
        int rob = 0, notRob = 0;
        for (int i = lo; i <= hi; i++) {
            int currob = notRob + nums[i];
            notRob = Math.max(rob, notRob);
            rob=currob;
        }
        return Math.max(rob, notRob);
    }
}