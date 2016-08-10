package com.jayqqaa12.dp;


/**
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 *
 */
public class NumArray {

    private final int[] nums   ;

    public NumArray(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        this.nums=nums;
    }

    public int sumRange(int i, int j) {
        if(i==0)return nums[j];

        return  nums[j]-nums[i-1];
    }
}
