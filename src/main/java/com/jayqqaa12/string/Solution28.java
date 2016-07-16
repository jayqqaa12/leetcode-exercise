package com.jayqqaa12.string;


/**
 * 返回 needle 在 haystack 出现的首个index
 *
 * 不存在返回 -1
 *
 * 难度1星
 */
public class Solution28 {

    public int strStr(String haystack, String needle) {


        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

    public int strStr2(String haystack, String needle) {

        return  haystack.indexOf(needle);
    }
}