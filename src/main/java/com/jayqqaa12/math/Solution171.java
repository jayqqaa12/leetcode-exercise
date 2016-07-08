package com.jayqqaa12.math;

/**
 * no.168 反向操作
 * <p>
 * 求数字
 * <p>
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * <p>
 * 难度1星
 */
public class Solution171 {
    public int titleToNumber(String s) {
        int sum =0;
        for (int i =0; i <s.length(); i++) {
            sum*=26;
            sum+= s.charAt(i) - 'A'+1;
        }
        return sum;
    }
}