package com.jayqqaa12.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找出数字中只出现一次的数字
 * <p>
 * 其他数字都出现2次
 * <p>
 * <p>
 * 难度 2星
 */
public class Solution260 {


    /**
     * 老办法 一次过
     * <p>
     * no.136
     * no.137
     *
     * @param nums
     * @return
     */
    public int[] singleNumber(int[] nums) {

        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>(2);

        for (int i = 0; i < nums.length; ) {
            if ((i + 1) >= nums.length || nums[i] != nums[i + 1]) {
                list.add(nums[i]);
                i += 1;
                continue;
            }
            i += 2;
        }

        int[] temp = new int[2];

        int i = 0;
        for (int n : list) {
            temp[i++] = n;
        }
        return temp;

    }


    /**
     * 位操作
     * <p>
     * 更好的办法
     *
     * @param nums
     * @return
     */
    public int[] singleNumber2(int[] nums) {
        int result[] = new int[2];
        int xor = nums[0];

        for (int i = 1; i < nums.length; i++)
            xor ^= nums[i];

        int bit = xor & ~(xor - 1);
        int num1 = 0;
        int num2 = 0;

        for (int num : nums) {
            if ((num & bit) > 0)
                num1 ^= num;
            else
                num2 ^= num;
        }

        result[0] = num1;
        result[1] = num2;
        return result;
    }

}