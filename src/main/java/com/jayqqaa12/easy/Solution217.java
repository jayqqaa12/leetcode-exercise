package com.jayqqaa12.easy;


import java.util.HashSet;
import java.util.Set;

/**
 * 判断 数组是否有重复值
 * <p>
 * <p>
 * 难度 1星
 */
public class Solution217 {

    /**
     * 速度最快 利用空间
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if(set.contains(n))return true;
            set.add(n);
        }
        return  false;
    }
}