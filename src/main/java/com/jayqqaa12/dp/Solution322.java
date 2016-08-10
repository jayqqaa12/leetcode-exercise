package com.jayqqaa12.dp;


/**
 * 给出几种硬币 计算构成amount 的总少硬币数
 * <p>
 * Example 1:
 * coins = [1, 2, 5], amount = 11
 * return 3 (11 = 5 + 5 + 1)
 * Example 2:
 * coins = [2], amount = 3
 * return -1.
 * <p>
 * 难度2星
 */
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= amount; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    if (min > (long) dp[i - coins[j]] + 1) {
                        min = dp[i - coins[j]] + 1;
                    }
                }
            }
            dp[i] = min;
        }
        if (dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}