package com.jayqqaa12.array;


/**
 *
 * 删除重复字符串 （数组已排序）
 *
 */
public class Solution26 {

    public int removeDuplicates(int[] nums) {

        if(nums.length<2)return nums.length;

        int c=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]) nums[c++]= nums[i];
        }

        return  c;
    }
}