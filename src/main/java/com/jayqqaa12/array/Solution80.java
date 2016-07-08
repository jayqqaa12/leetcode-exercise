package com.jayqqaa12.array;


/**
 * 删除数组中 重复超过2次的元素
 * <p>
 * 返回长度
 * <p>
 * 数组已排序
 * <p>
 * 难度2星
 */
public class Solution80 {

    public int removeDuplicates(int[] nums) {
        int c=0;

        for (int n:nums){
            if(c<2|| n>nums[c-2]){
                nums[c++]=n;
            }

        }

        return c;
    }
}