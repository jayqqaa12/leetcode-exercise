package com.jayqqaa12.dp;


/**
 *
 * 相邻的房子不能偷 会被发现
 *
 * 求最大收益
 *
 * 难度2星
 *
 */
public class Solution198 {
    public int rob(int[] nums) {

        int rob = 0; //max monney can get if rob current house
        int notrob = 0; //max money can get if not rob current house
        for (int i = 0; i < nums.length; i++) {
            int currob = notrob + nums[i]; //if rob current value, previous house must not be robbed
            notrob = Math.max(notrob, rob); //if not rob ith house, take the max value of robbed (i-1)th house and not rob (i-1)th house
            rob = currob;
        }
        return Math.max(rob, notrob);

    }
}