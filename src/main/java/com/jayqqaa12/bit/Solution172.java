package com.jayqqaa12.bit;

/**
 *
 * 求 n! 之后末尾0的个数
 *
 * 要求 O(logN)
 *
 * 难度2星
 */
public class Solution172 {


    /**
     * 找规律有多少个5 就有多少个0
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        if(n==0)return 0;

        return  n/5+ trailingZeroes(n/5);

    }
}