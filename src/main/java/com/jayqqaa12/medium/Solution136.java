package com.jayqqaa12.medium;


import java.util.Arrays;

/**
 * 找到唯一不重复数 （每个数字都会出现2次）
 *
 * 不使用额外内存
 *
 * 难度 2星
 *
 * @REVIEW
 *
 */
public class Solution136 {

    /**
     * 思路 1
     * 先排序
     * 比较前面和后面的数字 都找不到相同的
     * 就是不重复数
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {

         Arrays.sort(nums);

        for (int i = 0; i < nums.length; i+=2) {

            if((i+1)>=nums.length || nums[i]!=nums[i+1]){
                return nums[i];
            }
        }

        return  0;
    }


    /**
     * 思路2
     *
     * XOR
     *
     * 抵消相同的值就行了
     *
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        int rst =0;
        for (int i = 0; i <nums.length; i++) {
            rst^=nums[i];
        }
        return  0;
    }



}