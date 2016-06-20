package com.jayqqaa12.easy;


/**
 *
 * 难度 1星
 */
public class Solution342 {

    public boolean isPowerOfFour(int n) {
        if(n>1)
            while (n%4==0)n/=4;

        return  n==1;
    }
}