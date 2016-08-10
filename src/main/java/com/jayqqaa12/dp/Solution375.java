package com.jayqqaa12.dp;


/**
 *
 * 猜字游戏
 *
 * 猜错就要付相应 数字的钱
 *
 * 求猜对 要付多少
 *
 * 难度2星
 *
 */
public class Solution375 {

    /**
     * dp[i][j] = min (i<=k<=j) { k + max(dp[i][k-1], dp[k+1][j]) }
     *
     * @param n
     * @return
     */
    public int getMoneyAmount(int n) {
        if (n < 1) return 0;

        int[][] dp = new int[n + 1][n + 1];
        for (int start = 1; start < n; start++) {
            for (int i = 0; i + start <= n; i++) {
                int j = i + start;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    dp[i][j] = Math.min(dp[i][j], k + Math.max(k - 1 >= i ? dp[i][k - 1] : 0, j >= k + 1 ? dp[k + 1][j] : 0));
                }
            }
        }
        return dp[1][n];
    }
}