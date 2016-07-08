package com.jayqqaa12.array;


/**
 * 搜索指定 值在 数组中 需要插入的位置
 * <p>
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 *
 * 难度1星
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(target<= nums[i])return i;
        }
        return  nums.length;
    }


    /**
     * 二分
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

}