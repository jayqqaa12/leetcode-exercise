package com.jayqqaa12.sort;


import java.util.Arrays;

/**
 * 使用数组 组成一个最大数
 * <p>
 * 难度2星
 */
public class Solution179 {

    /**
     * 思路2直接 拼接字符串比较
     *
     * @return
     */
    public  String largestNumber(int[] num) {
        if(num==null || num.length==0) return "";

        String[] strs = new String[num.length];

        for(int i=0;i<num.length;i++)
            strs[i] = num[i]+"";

        Arrays.sort(strs, (str1,str2) ->{
            String s1 = str1+str2;
            String s2 = str2+str1;

            return s1.compareTo(s2);
        });


        if(strs[strs.length-1].charAt(0)=='0') return "0";

        StringBuffer sb = new StringBuffer();
        for(String s: strs)
            sb.insert(0, s);


        return sb.toString();
    }






}