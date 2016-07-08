package com.jayqqaa12.string;


/**
 * 判断字符串 是否回文 只判断字母和数字
 *
 * 不分大小写
 */
public class Solution125 {

    public boolean isPalindrome(String s) {

        if (s == null) return true;
        String str = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();

        if (str.length() == 0) return true;

        return new StringBuffer(str).reverse().toString().equals(str);
    }


}