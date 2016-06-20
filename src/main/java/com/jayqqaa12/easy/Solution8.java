package com.jayqqaa12.easy;


/**
 * String转 int
 *
 * string 可能为任何情况
 *
 * 超过最大值 返回最大值
 *
 * 难度 1.5星
 *
 */
public class Solution8 {


    public int myAtoi(String str) {

        if (str == null || str.trim().length() == 0) return 0;
        str = str.trim();

        int start = 0;
        char first = str.charAt(0);

        int sign = 1;
        if (first == '+') {
            start++;

        }
        if (first == '-') {
            start++;
            sign = -1;
        }
        long sum = 0;


        for (int i = start; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))) {
                return (int) sum * sign;
            }

            sum = sum * 10 + str.charAt(i) - '0';
            if (sign == 1 && sum > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

        }


        return (int) sum * sign;
    }


}