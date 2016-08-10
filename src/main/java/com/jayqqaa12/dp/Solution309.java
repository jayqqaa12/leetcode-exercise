package com.jayqqaa12.dp;

/**
 * 求多次交易的最大收益
 * 卖出后必需冷却一天
 *
 * 难度3星
 */
public class Solution309 {

    public int maxProfit(int[] prices) {
        int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
        for (int price : prices) {
            prev_buy = buy;
            buy = Math.max(prev_sell - price, prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price, prev_sell);
        }
        return sell;
    }
}