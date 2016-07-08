package com.jayqqaa12.array;


/**
 * 把数组中 不等于 val 的值
 * 替换成 val
 *
 * 并返回替换的个数
 *
 * 难度 1星
 *
 */
public class Solution27 {


    public int removeElement(int[] nums, int val) {

        int c =0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]!=val){
                nums[c++]= nums[i];
            }
        }

        return  c;
    }
}