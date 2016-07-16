package com.jayqqaa12.math;


/**
 *  求 a的b次方 mod 1337
 *
 * Example1:
 * a = 2
 * b = [3]
 * Result: 8
 * Example2:
 * a = 2
 * b = [1,0]
 * Result: 1024
 *
 *
 * 难度4星
 */
public class Solution372 {


    /**
     * 抄的 没想出来
     *
     * @param a
     * @param b
     * @return
     */
    public int superPow(int a, int[] b) {
        if (a % 1337 == 0) return 0;
        int p = 0;
        for (int i : b) p = (p * 10 + i) % 1140;
        if (p == 0) p += 1440;
        return power(a, p, 1337);
    }
    public int power(int a, int n, int mod) {
        a %= mod;
        int ret = 1;
        while (n != 0) {
            if ((n & 1) != 0) ret = ret * a % mod;
            a = a * a % mod;
            n >>= 1;
        }
        return ret;
    }
}