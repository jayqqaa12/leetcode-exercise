package com.jayqqaa12.math;


import java.util.HashMap;

/**
 * 求除   相同的循环用 ()表示
 * For example,
 * Given numerator = 1, denominator = 2, return "0.5".
 * Given numerator = 2, denominator = 1, return "2".
 * Given numerator = 2, denominator = 3, return "0.(6)".
 */
public class Solution166 {


    /**
     * 1.求出符号位
     * 2.求出整数位
     * 3.求出小数位
     *
     * @param numerator
     * @param denominator
     * @return
     */
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder result = new StringBuilder();
        String sign = (numerator < 0 == denominator < 0 || numerator == 0) ? "" : "-";
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        result.append(sign);
        result.append(num / den);
        long remainder = num % den;
        if (remainder == 0)
            return result.toString();
        result.append(".");
        HashMap<Long, Integer> hashMap = new HashMap<>();
        while (!hashMap.containsKey(remainder)) {
            hashMap.put(remainder, result.length());
            result.append(10 * remainder / den);  //化为整数
            remainder = 10 * remainder % den;
        }
        int index = hashMap.get(remainder);
        result.insert(index, "(");
        result.append(")");
        return result.toString().replace("(0)", "");
    }
}