package com.jayqqaa12.easy;


/**
 *
 * 求 n 是否能被 2 ,3,5因式分解
 *
 * 1默认true
 *
 * 难度 1星
 *
 */
public class Solution263 {
    public boolean isUgly(int num) {

        if(num==1)return true;
        if(num==0)return false;


        while(num%2==0) num/=2;
        while(num%3==0) num/=3;
        while(num%5==0) num/=5;

        return num==1;
    }
}