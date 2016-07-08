package com.jayqqaa12.math;


/**
 * 数组 表示一个 非负数
 *
 * 使结果+1
 *
 * 难度1星
 *
 */
public class Solution66 {
    public int[] plusOne(int[] digits) {

        int [] rst = new int[digits.length+1];

        int level =0;
        for (int i = digits.length-1; i >=0; i--) {

            if(i==digits.length-1||level>0){
                int n = digits[i]+1;
                level= n/10;
                rst[i]= n%=10;
                digits[i]=n%=10;
            }
        }
        if(level>0)rst[0]=level;
        return level>0 ? rst :digits;
    }
}