package com.jayqqaa12.hard;


/**
 * 判断输入 字符串是否为数字
 *
 * 正则最简单
 *
 * 难度 2.5星
 *
 * @REVIEW
 */
public class Solution65 {

    public boolean isNumber(String s) {
        if (s == null || s.trim().length() == 0) return false;

        return s.matches("(\\s*)[+-]?((\\.[0-9]+)|([0-9]+(\\.[0-9]*)?))(e[+-]?[0-9]+)?(\\s*)");
    }


}