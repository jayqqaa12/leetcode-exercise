package com.jayqqaa12.dp;


/**
 * 数组为  价格变化
 *
 * 求在何时买入 卖出时 收益最大
 *
 * 难度2星
 *
 */
public class Solution121 {



    public int maxProfit(int[] prices) {
        int max =0; //可以不买

        if(prices==null||prices.length==0)return max;

        int start = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>start) max=Math.max(max,prices[i]-start);
            else  start = prices[i];
        }

        return  max;
    }
}