package com.jayqqaa12.easy;


/**
 *
 * 判断是否 为 x2
 *
 * 思路 判断 2进制 1的个数就1 的就是啦
 *
 * 难度2星
 *
 */
public class Solution231 {

    public boolean isPowerOfTwo(int n) {

        return n>0 && Integer.bitCount(n)==1;
    }

}