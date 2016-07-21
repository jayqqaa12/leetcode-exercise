package com.jayqqaa12.array;

/**
 * 你开始在 index 0
 * 数组数字代表移动的最大距离
 * 看看是否能到底 最后应该元素
 * <p>
 * 难度2星
 */
public class Solution55 {



    public boolean canJump(int[] nums) {

        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i>max) return false;
            max = Math.max(nums[i]+i,max);
        }
        return true;
    }


}