package com.jayqqaa12.string;


/**
 * 反转 单词
 * <p>
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 *
 * 难度2星
 *
 * FIXME
 */
public class Solution151 {
    public String reverseWords(String s) {
        String[] strs = s.split("\\s+");

        String rst="";
        if(strs.length==0)return rst;

        for (int i = strs.length-1; i >=0 ; i--) {
            rst+= strs[i]+" ";
        }
        return  rst.trim();
    }

}

