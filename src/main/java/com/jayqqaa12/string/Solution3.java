package com.jayqqaa12.string;


import java.util.*;

/**
 *  计算 字符串 唯一的字母 的子字符串的长度
 *
 * 难度2星
 *
 */
public class Solution3 {


    public int lengthOfLongestSubstring(String s) {
        int i = 0,j=0,max =0;
        Set set= new HashSet<>();
        while (i <s.length()){

            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                max =Math.max(max,set.size());
            }
            else  set.remove(s.charAt(j++));
        }
        return max;

    }





}