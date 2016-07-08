package com.jayqqaa12.array;



/**
 * 移动数组的0 到最好
 * <p/>
 * 保持其他数的顺序
 * <p/>
 * 1.最新移动次数
 * 2.不能copy数组
 *
 * 难度1星
 *
 */
public class Solution283 {



    public void moveZeroes(int[] nums) {

        if(nums==null||nums.length==0)return;

        int i=0;
        for (int n:nums){
            if(n!=0){
                nums[i++]=n;
            }
        }

//        Arrays.fill(nums,i,nums.length,0);

        while(i<nums.length){
            nums[i++]=0;
        }

    }

}