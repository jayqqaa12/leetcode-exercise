package com.jayqqaa12.bit;


/**
 * 返回 0<=i<=num 二进制 1的个数
 *
 * For num = 5 you should return [0,1,1,2,1,2].
 *
 * 难度2星
 *
 */
public class Solution338 {

    /**
     * 用一下公式  f[i] = f[i / 2] + i % 2.
     *
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) f[i] = f[i / 2] + i % 2;
        return f;
    }



    public int[] countBits2(int num) {

        int[] nums = new int[num+1];
        for (int i = 0; i <= num; i++) {
            nums[i]= Integer.bitCount(i);
        }

        return  nums;
    }


}