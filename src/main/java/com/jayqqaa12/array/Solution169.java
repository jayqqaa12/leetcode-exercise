package com.jayqqaa12.array;


import java.util.HashMap;
import java.util.Map;

/**
 * 找到出现次数超过 一半的数
 *
 * 难度1星
 *
 */
public class Solution169 {


    /**
     * 最优解
     * @param num
     * @return
     */
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]) count++;
            else count--;

        }
        return major;
    }

    /**
     * 思路1 最好想到
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);

            if (map.get(nums[i]) > nums.length / 2) return nums[i];
        }
        return  -1;
    }



}