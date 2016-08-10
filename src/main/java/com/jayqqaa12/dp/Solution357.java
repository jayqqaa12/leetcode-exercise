package com.jayqqaa12.dp;

/**
 * 给定 n  计算  0<= x < 10n次方 数字不重复的个数
 * <p>
 * Example:
 * Given n = 2, return 91.
 * (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])
 */
public class Solution357 {


    /**
     * f(1) = 10. (0, 1, 2, 3, ...., 9)
     * f(2) = 9 * 9.
     * f(3) = f(2) * 8 = 9 * 9 * 8.
     * f(10) = 9 * 9 * 8 * 7 * 6 * ... * 1
     * f(11) = 0 = f(12) = f(13)....
     *
     * @param n
     * @return
     */
    public int countNumbersWithUniqueDigits(int n) {

        if (n == 0) return 0;

        int rst = 10;
        int uniqueNum = 9, aviableNum = 9;

        while (n-- > 1 && aviableNum > 0) {
            uniqueNum *= aviableNum--;
            rst += uniqueNum;
        }
        return rst;

    }
}