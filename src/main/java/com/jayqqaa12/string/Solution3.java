package com.jayqqaa12.string;


import java.util.*;

/**
 *  计算 字符串 唯一的字母 的子字符串的长度
 *
 * 难度2星
 *
 */
public class Solution3 {


    public int removeElement(int[] A, int elem) {


        if(A==null||A.length==0)return 0;

        List<Integer> list =new ArrayList<>();



        for(int n:list){

            if(n==elem)list.remove(n);

        }


        return list.size();

    }


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