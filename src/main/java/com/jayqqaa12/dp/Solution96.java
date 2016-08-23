package com.jayqqaa12.dp;


/**
 *
 * 输入n 求 有多少种不同的 BST 树排列
 *
 *
 * 难度3星
 */
public class Solution96 {


    public int numTrees(int n) {

        int [] rc =new  int[n+1];

        return   dp(rc ,n);
    }

    private int dp(int[] rc, int n) {

        if(n<=1)return 1;

        if(rc[n]!=0)return rc[n];

        int rst =0;
        for (int i = 0; i < n; i++) {
            rst += dp(rc,i)*dp(rc,n-1-i);  //关键
        }

        rc[n]=rst;

        return rst;
    }


}