package com.jayqqaa12.bit;


/**
 * 求和 不使用 + -
 *
 * 难度1星
 *
 * FIXME
 */
public class Solution371 {
    public int getSum(int a, int b) {

        return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
    }
}