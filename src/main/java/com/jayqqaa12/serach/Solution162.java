package com.jayqqaa12.serach;


/**
 * 给定一个数组 相邻元素不相等
 * <p>
 * 找到 峰值 返回其 index
 * <p>
 * <p>
 * 难度2星
 */
public class Solution162 {
    public int findPeakElement(int[] nums) {

        if (nums.length == 0 || nums == null) return 0;

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;      //peak

            else if (nums[mid] < nums[mid - 1]) end = mid;
            else start = mid;

        }
        if (nums[start] > nums[end]) return start;
         else return end;

    }


}