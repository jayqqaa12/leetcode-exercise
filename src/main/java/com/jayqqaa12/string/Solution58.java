package com.jayqqaa12.string;


/**
 * 返回最后一个单词的长度 空格分割
 * <p>
 * 难度1星
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if (strs == null || strs.length == 0) return 0;

        return  strs[strs.length-1].length();
    }
}