package com.jayqqaa12.math;

/**
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 *
 * 难度1星
 *
 */
public class Solution168 {

    public String convertToTitle(int n) {

        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }


}