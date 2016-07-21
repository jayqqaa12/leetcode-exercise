package com.jayqqaa12.array;


import java.util.HashMap;
import java.util.Map;

/**
 * 从数组中找到 a+b = target
 * <p>
 * 难度 1.5星
 */

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] rst = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                rst[1] = i;
                rst[0] = map.get(target - nums[i]);
                return rst;
            }
            map.put(nums[i], i);
        }

        return rst;
    }



}