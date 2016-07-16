package com.jayqqaa12.math;


/**
 * 判断是否为 perfect square
 * <p>
 * 难度2星
 */
public class Solution367 {


    /**
     * This is a math problem：
     * 1 = 1
     * 4 = 1 + 3
     * 9 = 1 + 3 + 5
     * 16 = 1 + 3 + 5 + 7
     * 25 = 1 + 3 + 5 + 7 + 9
     * 36 = 1 + 3 + 5 + 7 + 9 + 11
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {

        int i = 1;

        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}