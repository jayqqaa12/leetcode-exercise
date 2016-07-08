package com.jayqqaa12.sort;


/**
 * 排序 （只有 0,1,2 三种数）
 *
 * 难度1星
 *
 */
public class Solution75 {


    /**
     * 因为有多个重复数 所以用插入排序比较好 O(n2)
     *
     * @param nums
     */
    public void sortColors2(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int j =i;
            int temp = nums[j];
            while(j>0 &&temp<nums[j-1]){
                nums[j]=nums[j-1];
                j--;
            }
            nums[j]=temp;
        }

    }

    /**
     * 最优解 O(n)
     * @param nums
     */
    public void sortColors(int[] nums) {
        // 2-pass
        int count0 = 0, count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {count0++;}
            if (nums[i] == 1) {count1++;}
        }
        for(int i = 0; i < nums.length; i++) {
            if (i < count0) {nums[i] = 0;}
            else if (i < count0 + count1) {nums[i] = 1;}
            else {nums[i] = 2;}
        }
    }
}