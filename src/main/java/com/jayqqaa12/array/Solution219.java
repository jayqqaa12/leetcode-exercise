package com.jayqqaa12.array;


import java.util.HashMap;
import java.util.Map;

/**
 * 找出 是否有　nums[i]= nums[j]  and  i-j <=k
 *
 * 难度1星
 */
public class Solution219 {



    public boolean containsNearbyDuplicate(int[] nums, int k) {

         Map<Integer,Integer> map =new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k)return true;
                else map.put(nums[i],i);
            }
            else map.put(nums[i],i);
        }
        return  false;
    }

}