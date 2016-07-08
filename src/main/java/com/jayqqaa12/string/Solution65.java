package com.jayqqaa12.string;


/**
 * 判断输入 字符串是否为数字
 * <p>
 * 难度 2.5星
 *
 * FIXME
 */
public class Solution65 {

    /**
     * 正则最简单
     *
     * @param s
     * @return
     */
    public boolean isNumber(String s) {
        if (s == null || s.trim().length() == 0) return false;

        return s.matches("(\\s*)[+-]?((\\.[0-9]+)|([0-9]+(\\.[0-9]*)?))(e[+-]?[0-9]+)?(\\s*)");
    }


}