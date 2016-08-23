package com.jayqqaa12;

/**
 * 在n个物品中挑选若干物品装入背包，最多能装多满？假设背包的大小为m，每个物品的大小为A[i]
 */
public class Backpark {


    /**
     * 状态: result[i][S] 表示前i个物品，取出一些物品能否组成体积和为S的背包
     * 状态转移方程: f[i][S]=f[i−1][S−A[i]] or f[i−1][S] (A[i]为第i个物品的大小)
     * 欲从前i个物品中取出一些组成体积和为S的背包，可从两个状态转换得到。
     * f[i−1][S−A[i]]: 放入第i个物品，前 i−1 个物品能否取出一些体积和为 S−A[i] 的背包。
     * f[i−1][S]: 不放入第i个物品，前 i−1 个物品能否取出一些组成体积和为S的背包。
     * 状态初始化: f[1⋯n][0]=true; f[0][1⋯m]=false. 前1~n个物品组成体积和为0的背包始终为真，其他情况为假。
     * 返回结果: 寻找使 f[n][S] 值为true的最大S (1≤S≤m)
     *
     * @param m
     * @param A
     * @return
     */
    public int backPack(int m, int[] A) {
        if (A == null || m == 0) return 0;

        boolean[] dp = new boolean[m + 1];
        dp[0] = true;

        for (int i = 1; i <= A.length; i++) {
            for (int j = m; j >= 0; j--) {
                if (j - A[i - 1] >= 0 && dp[j - A[i - 1]]) {
                    dp[j] = true;
                }
            }
        }
        for (int j = m; j >= 0; j--) {
            if (dp[j]) return j;
        }

        return 0;
    }
}