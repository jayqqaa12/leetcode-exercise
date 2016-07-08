package com.jayqqaa12.string;


/**
 * 转为 zigzag 模式
 * <p>
 * 难度2星
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        if (s.length() == 0 || numRows < 2) return s;

        String rst = "";
        int lag = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j <s.length() ; j+=lag) {
                rst+= s.charAt(j);
                //非首行和末行时还要加一个
                if (i > 0 && i < numRows-1) {
                    int t = j + lag - 2*i;
                    if (t < s.length()) {
                        rst += s.charAt(t);
                    }
                }
            }
        }

        return rst;

    }
}