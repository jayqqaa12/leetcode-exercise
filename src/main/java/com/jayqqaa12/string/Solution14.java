package com.jayqqaa12.string;


/**
 * 求 字符串数组 公共的前缀
 *
 * 难度1星
 *
 */
public class Solution14 {


    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }

        return pre;
    }
}