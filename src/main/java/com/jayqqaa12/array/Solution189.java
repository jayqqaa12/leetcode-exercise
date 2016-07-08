package com.jayqqaa12.array;

/**
 *
 *
 * 将 nums 向右旋转 k个位置
 *
 * 空间要求 O（1）
 * 难度2星
 *
 */
public class Solution189 {

    /**
     * 分3步
     *
     * 1.反转全部的
     * 2.反转 0 to k-1
     * 3.反转 K to length
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {

        k%=nums.length;
        swap(nums, 0, nums.length - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, nums.length - 1);
    }

    private void swap(int[] nums, int start, int end) {

        while (start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }


}