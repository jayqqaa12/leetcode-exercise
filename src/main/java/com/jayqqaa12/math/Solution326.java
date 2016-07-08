package com.jayqqaa12.math;


/**
 * 求是否为 x3
 *
 * 难度2星
 */
public class Solution326 {

    public boolean isPowerOfThree(int n) {
        if(n>1)
            while (n%3==0)n/=3;

        return  n==1;
    }
}