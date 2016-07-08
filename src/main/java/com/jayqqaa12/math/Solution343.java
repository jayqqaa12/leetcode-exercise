package com.jayqqaa12.math;


/**
 * 求 和为 n的 数能组成的最大值
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 *
 * 难度2星
 */
public class Solution343 {

    /**
     * 思路
     * 可以看出如果3出现的次数越多越大
     * @param n
     * @return
     */
    public int integerBreak(int n) {

        if(n==2)return 1;
        if(n==3)  return 2;

        int sum =1;
        while(n>4){

            n-=3;
            sum*=3;
        }

        return sum*=n;
    }
}