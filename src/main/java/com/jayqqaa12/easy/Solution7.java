package com.jayqqaa12.easy;


/**
 * 反转数字
 *
 *   Example1: x = 123, return 321
 *
 *   Example2: x = -123, return -321
 *
 * 难度 1星
 */
public class Solution7 {


    /**
     *  除/10 取余
     * @param x
     * @return
     */
    public int reverse(int x) {
        long rst= 0;

        while(x!=0){
            rst= rst*10+ x%10;
            if(rst>Integer.MAX_VALUE||rst<Integer.MIN_VALUE)return 0;
            x=x/10;
        }

        return  (int)rst;
    }
}