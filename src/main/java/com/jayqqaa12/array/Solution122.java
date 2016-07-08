package com.jayqqaa12.array;

/**
 *
 * 跟no.121 一样
 *
 * 不同在于可以 买卖多次（买之前要先卖掉）
 * 求最大收益
 *
 * 难度3星
 */
public class Solution122 {


    public int maxProfit(int[] prices) {

        int max =0;
        if(prices==null||prices.length==0)return  max;


        for (int i = 0; i < prices.length; i++) {
            if(prices[i+1]>prices[i]) max+= prices[i+1]-prices[i];
        }

        return  max;
    }
}