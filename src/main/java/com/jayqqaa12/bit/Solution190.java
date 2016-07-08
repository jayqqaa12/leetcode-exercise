package com.jayqqaa12.bit;

/**
 *
 * 反转数字n 的二进制
 *
 */
public class Solution190 {

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }


    public int reverseBits2(int n) {

     return    Integer.reverse(n);
    }
}