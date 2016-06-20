package com.jayqqaa12.easy;


/**
 * 判断是否为 回文数
 *
 * 难度1.5星
 *
 */
public class Solution9 {


    /**
     * 思路
     * 反转数字 判断是否相同
     *
     * no.7
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {

        if(x<0)return  false;

        int y =x;
        int rst =0;

        while (y!=0){
            rst =rst*10+y%10;
            y/=10;
        }

        return  rst==x;
    }
}