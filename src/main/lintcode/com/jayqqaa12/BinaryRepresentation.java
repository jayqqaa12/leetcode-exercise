package com.jayqqaa12;

import java.util.HashSet;

/**
 * 给定一个数将其转换为二进制（均用字符串表示）
 * 如果这个数的小数部分不能在 32 个字符之内来精确地表示，则返回 "ERROR"。
 * 样例
 * n = "3.72", 返回 "ERROR".
 * n = "3.5", 返回 "11.1".
 */
public class BinaryRepresentation {


    /**
     * 首先要分两半解决，断点是'.': str.split("\\.");
     * Integer那一半好弄，whie loop里： num%2, num/2。
     * Decimal那边复杂点.
     * bit == 1的数学条件：当下num * 2 >= 1。 更新: num = num * 2 - 1;
     * bit == 0的数学条件： num * 2 < 1. 更新: num = num * 2
     * 注意：num是 double, 小数在 （num = num * 2 -1）的公式下可能无限循环. 因此check: num重复性，以及binary code < 32 bit.
     * (所以题目也才有了32BIT的要求！)
     *
     * @param n
     * @return
     */
    public String binaryRepresentation(String n) {

        if (n.length() == 0 || n.equals("0")) return "0";
        //If no '.', no decimal, just parseInteger
        if (n.indexOf(".") == -1) return Integer.toBinaryString(Integer.parseInt(n));

        //Split the string by '.'
        String[] strs = n.split("\\.");
        //Deal with decimal first. 
        String decimal = parseDecimal(strs[1]);
        //If not applicable, it won't work, don't need to calculate integer part. Just return ERROR.
        if (decimal.equals("ERROR")) return decimal;

        //Deal with integer part
        if (decimal.length() == 0 || decimal.equals("0"))
            return Integer.toBinaryString(Integer.parseInt(strs[0]));
        else
            return Integer.toBinaryString(Integer.parseInt(strs[0])) + "." + decimal;
    }

    // A little bit math, but implemtable.
    public String parseDecimal(String n) {

        if (n.length() == 0 || n.equals("0")) return "";

        //A doublem must be able to catch it. If not, that is way bigger than 32 bit.
        double num = Double.parseDouble("0." + n);

        //Check existance
        HashSet<Double> set = new HashSet<>();
        String rst = "";
        while (num > 0) {
            if (rst.length() > 32 || set.contains(num)) {
                return "ERROR";
            }
            set.add(num);
            //For decimal: binary code on one spot == 1, means: num * 2 - 1 > 0
            if (num * 2 >= 1) {
                rst = rst + "1";
                num = num * 2 - 1;
            } else {
                rst = rst + "0";
                num = num * 2;
            }
        }
        return rst;
    }
}