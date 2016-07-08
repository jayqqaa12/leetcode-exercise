package com.jayqqaa12.math;


/**
 * Implement pow(x, n).
 * <p>
 * 难度2星
 */
public class Solution50 {


    public double myPow(double x, int n) {
        double ans = 1;
        for (long i = Math.abs((long) n); i > 0; i = i >> 1, x *= x)
            if ((i & 1) == 1) ans *= x;

        return n > 0 ? ans : 1 / ans;

    }
}