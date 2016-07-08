package com.jayqqaa12.array;


/**
 * 找到数字 target
 * 在数组中找到 其位置
 *
 * 算法复杂度 不超过 O(logN)
 *
 * 难度1星
 *
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {

        int start =-1;
        int end =-1;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==target){
                if(start==-1){
                    start= i;
                }
                if(end<i){
                    end =i;
                }

            }
        }

        return  new int[]{start,end};
        
    }
}