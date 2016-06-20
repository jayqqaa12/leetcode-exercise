package com.jayqqaa12.easy;


/**
 *
 * 需要n步 到山顶 每次 可以走 1or2步
 * 有多少种不同的方法
 *
 *  fibonacci sequence
 *
 *  难度 1.5星
 */
public class Solution70 {
    public int climbStairs(int n) {

        if(n<=0)return  0;
        if(n==1)return 1;

        int[] store = new int[n];

        store[0]=1;
        store[1]=2;

        for(int i=2;i<n;i++)
            store[i]=store[i-1]+store[i-2];


        return store[n-1];

    }

}